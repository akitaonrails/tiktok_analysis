package X;

import Y.ACListenerS116S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TWS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("live_broadcast_lop_banner")
public final class C0TWS extends AbstractC20660115st<View> {
    public final int LL;
    public final Activity LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    public final int LJIIL() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public static final void LJIILIIL(Context context) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).R5("click", "golive");
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).N3(context);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        View viewFindViewById = this.LLILLJJLI.findViewById(this.LL);
        C20515215Pi c20515215Pi = new C1257230ioz((ViewGroup) this.LLILLJJLI.findViewById(this.LL), true).LIZ;
        c20515215Pi.LJI(new AwS580S0100000_1(this, 555));
        c20515215Pi.LIZ.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c20515215Pi.LIZ.LJIILJJIL = new AwS591S0100000_12(this, 932);
        c20515215Pi.LIZ.LJFF = c688120Qyw.LIZ.getString(2131853179);
        c20515215Pi.LIZ.LJI = c688120Qyw.LIZ.getString(2131853180);
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        if (c20514915Pf != null) {
            View viewFindViewById2 = c20514915Pf.findViewById(R.id.evm);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setClickable(true);
                C786410Ut5.I7(new ACListenerS116S0200000_12(this, c20515215Pi, 74), viewFindViewById2);
            }
            View viewFindViewById3 = c20514915Pf.findViewById(R.id.pcs);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setClickable(true);
                C786410Ut5.I7(new ACListenerS116S0200000_12(this, c20515215Pi, 75), viewFindViewById3);
            }
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).R5("show", null);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).T3();
        return viewFindViewById;
    }

    public C0TWS(C0TGX c0tgx, C19EG c19eg) {
        super(c0tgx);
        this.LL = R.id.s0t;
        this.LLILLJJLI = c19eg;
        this.LLILLL = 506;
        this.LLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(352));
        this.LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(353));
    }
}
