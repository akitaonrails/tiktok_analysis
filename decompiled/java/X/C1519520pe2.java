package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;

/* JADX INFO: renamed from: X.0pe2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519520pe2 extends AbstractC1519500pe0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1519510pe1 interfaceC1519510pe1 = (InterfaceC1519510pe1) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            String schema = interfaceC1519510pe1.getSchema();
            Boolean boolIsThirdPartyLink = interfaceC1519510pe1.isThirdPartyLink();
            richTextUtil.getClass();
            RichTextUtil.LJII(false, schema, boolIsThirdPartyLink, context, null, "normal_checkout", null, false, null);
        }
    }
}
