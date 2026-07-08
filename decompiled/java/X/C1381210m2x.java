package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS230S0300000_21;

/* JADX INFO: renamed from: X.0m2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381210m2x extends AbstractC1381200m2w {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        InterfaceC1381220m2y interfaceC1381220m2y = (InterfaceC1381220m2y) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LIZ.LLJJIJI = interfaceC1381220m2y.getTitle();
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_flag);
            c1247530iZL.LIZ = C20642515q3.LJI(2131822227);
            c1247530iZL.LIZ(new AwS230S0300000_21(this, c19eg, interfaceC1381220m2y, completionBlock, 21));
            c1390850mIV.LIZ(c1247530iZL);
            c1390850mIV.LIZJ().show(c19eg.getSupportFragmentManager(), "Minis_FYF_Card_Report");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "Not fragment activity", null, 4);
    }
}
