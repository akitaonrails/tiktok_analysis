package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1B24, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B24 extends C1B23 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1B25 c1b25 = (C1B25) C1909107dp.LIZJ(C1B25.class, null);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = ((C1B22) xBaseParamModel).getSettingsKey().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), "audience_control")) {
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1B26.class, null);
                C1B26 c1b26 = (C1B26) xBaseModelLIZJ;
                c1b26.setKey("audience_control");
                c1b26.setValue(String.valueOf(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getAudienceControlStatus()));
                arrayList.add(xBaseModelLIZJ);
            }
        }
        c1b25.setSettingsValue(arrayList);
        completionBlock.onSuccess(c1b25, "");
    }
}
