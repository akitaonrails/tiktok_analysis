package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338550DOz extends C0DP7 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        C0DP6 c0dp6 = (C0DP6) xBaseParamModel;
        String url = c0dp6.getUrl();
        C0CC9.LIZ.getClass();
        List list = (List) C0CC9.LIZJ.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), url)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            C2382909Vj.LIZ(completionBlock, 0, "url not in whitelist", null, 4);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0DPJ(c0dp6, this, Intrinsics.LJFF(c0dp6.getNeedResEvent(), Boolean.TRUE), completionBlock, null), 3);
        }
    }
}
