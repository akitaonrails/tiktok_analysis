package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198521B2s extends AbstractC2198531B2t {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int i;
        InterfaceC2198551B2v interfaceC2198551B2v = (InterfaceC2198551B2v) xBaseParamModel;
        if (!interfaceC2198551B2v.getKeys().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<InterfaceC2198541B2u> it2 = interfaceC2198551B2v.getKeys().iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC2198541B2u next = it2.next();
                    if (next.getKey().length() != 0) {
                        if (!TextUtils.isEmpty(next.getBiz())) {
                            i = 10;
                            break;
                        } else if (Intrinsics.LJFF(next.getExposureType(), 1)) {
                            arrayList.add(next.getKey());
                        } else if (Intrinsics.LJFF(next.getExposureType(), 2)) {
                            arrayList2.add(next.getKey());
                        } else {
                            i = 11;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                i = 12;
            } else if (i == 0) {
                if (!arrayList2.isEmpty()) {
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZIZ(arrayList2, false);
                }
                if (!arrayList.isEmpty()) {
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZIZ(arrayList, true);
                }
            }
            completionBlock.onFailure(i, "error params.", (XBaseResultModel) C1909107dp.LIZJ(InterfaceC2198561B2w.class, null));
            return;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2198561B2w.class, null), "");
    }
}
