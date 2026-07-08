package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0TVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVQ extends C0TVR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Activity activityLIZ;
        String str;
        C0TVS c0tvs = (C0TVS) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            Intent intent = activityLIZ.getIntent();
            if (c0tvs.isAuditCountry()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            intent.putExtra("is_audit_country", str);
            activityLIZ.finish();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0TVT.class, null), "");
    }
}
