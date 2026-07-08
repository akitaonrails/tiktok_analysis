package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848950XSb extends AbstractC848960XSc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Context context;
        String phoneNumber = ((InterfaceC848970XSd) xBaseParamModel).getPhoneNumber();
        if (phoneNumber.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "PhoneNumber in the params is empty", null, 4);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", phoneNumber, null));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrYuhWXK228yTFmn9nlrz9xiEescFuP5GL+zzU=", null));
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC848980XSe.class, null);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Make phone call exception: ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
