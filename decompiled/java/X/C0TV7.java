package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import java.net.URLDecoder;

/* JADX INFO: renamed from: X.0TV7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TV7 extends C0TV3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        C0TV6 c0tv6 = (C0TV6) xBaseParamModel;
        String schema = c0tv6.getSchema();
        String title = c0tv6.getTitle();
        if (schema.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1440005kM.LIZ(new OpenBAPolicyWebViewEvent(URLDecoder.decode(schema, "UTF-8"), title));
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0TV4.class, null);
            ((C0TV4) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Any parameter is empty!", null, 4);
    }
}
