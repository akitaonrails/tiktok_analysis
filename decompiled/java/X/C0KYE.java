package X;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0KYE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYE extends C0KYF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        C1397950mTx c1397950mTx;
        Activity activity;
        Window window;
        C0KYG c0kyg = (C0KYG) xBaseParamModel;
        try {
            abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if ((abstractC1387200mCcLIZIZ instanceof C1397950mTx) && (c1397950mTx = (C1397950mTx) abstractC1387200mCcLIZIZ) != null && (activity = c1397950mTx.LIZLLL) != null && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = c0kyg.getBrightness().floatValue();
            window.setAttributes(attributes);
            XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(C0KYH.class));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "currentWindow is null", null, 4);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C2382909Vj.LIZ(completionBlock, -3, "exception", null, 4);
        }
    }
}
