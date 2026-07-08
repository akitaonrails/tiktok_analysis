package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;

/* JADX INFO: renamed from: X.14WB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14WB extends C14WC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        C14WA c14wa = (C14WA) xBaseParamModel;
        String message = c14wa.getMessage();
        if (message.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "PhoneNumber in the params is empty", null, 4);
            return;
        }
        String tag = c14wa.getTag();
        String level = c14wa.getLevel();
        C14WD codePosition = c14wa.getCodePosition();
        try {
            C827730WdX.LIZ(codePosition.getLine().intValue(), message, tag, level, codePosition.getFile(), codePosition.getFunction());
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C14WE.class, null), "");
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.w("XReportALogMethod", e);
            C2382909Vj.LIZ(completionBlock, -3, "Level is illegal!", null, 4);
        }
    }
}
