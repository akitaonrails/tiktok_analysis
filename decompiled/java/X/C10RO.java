package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.aweme.services.ISignupAndLoginPanelReorderService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10RO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RO extends C10P5<C1869030yjl> {
    public static final /* synthetic */ int LJIIJ = 0;
    public Fragment LJFF;
    public C11JF LJI;
    public boolean LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.C10P5
    public final void LJ() {
        View view;
        super.LJ();
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
        ((IRegistrationAgeGateService) this.LJIIIZ.getValue()).dismiss();
        Fragment fragment = this.LJFF;
        if (fragment != null && (view = fragment.getView()) != null) {
            C1848530yCh.LJ(AFwS248S0000000_14.get$arr$(8), view);
        }
        ISignupAndLoginPanelReorderService iSignupAndLoginPanelReorderService = (ISignupAndLoginPanelReorderService) PluggableExtentionKt.pluggableSpi$default(ISignupAndLoginPanelReorderService.class, false, false, false, 14, null);
        if (iSignupAndLoginPanelReorderService != null) {
            iSignupAndLoginPanelReorderService.finishSkippableSignupAndLoginPanelIfExists(this.LIZ.LIZ.LIZIZ());
        }
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJIILLIIL((InterfaceC427710Gpt) this.LJIIIIZZ.getValue());
    }

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_AGE_GATE_ID;
    }

    public C10RO(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 20));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(37));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    @Override // X.C10P5, X.C10P7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1912470zrp r31, X.C1869040yjm r32, kotlin.jvm.functions.Function1 r33) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10RO.LIZLLL(X.0zrp, X.0yjm, kotlin.jvm.functions.Function1):void");
    }
}
