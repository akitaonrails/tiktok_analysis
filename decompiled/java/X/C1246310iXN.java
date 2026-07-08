package X;

import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("live_broadcast_playlist_banner")
public final class C1246310iXN extends AbstractC20660115st<View> {
    public final int LL;
    public final Activity LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public static final void LJIIL(Context context) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Z5("click", "create");
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z3(context);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        boolean z;
        View viewFindViewById = this.LLILLJJLI.findViewById(this.LL);
        C20515215Pi c20515215Pi = new C1257230ioz((ViewGroup) this.LLILLJJLI.findViewById(this.LL), true).LIZ;
        if (!C838600Wv4.LIZIZ() && !TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), C786410Ut5.t2(Locale.JAPANESE))) {
            z = false;
        } else {
            z = true;
        }
        c20515215Pi.LIZ.LJIILLIIL = z;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_3pt_playlist;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZIZ = ((Number) this.LLILZ.getValue()).intValue();
        c419910GdJ.LIZJ = ((Number) this.LLILZ.getValue()).intValue();
        c20515215Pi.LJFF(c419910GdJ);
        c20515215Pi.LIZ.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c20515215Pi.LIZ.LJIILJJIL = new AwS598S0100000_19(this, 655);
        c20515215Pi.LIZ.LJFF = c688120Qyw.LIZ.getString(2131853358);
        c20515215Pi.LIZ.LJI = c688120Qyw.LIZ.getString(2131853359);
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        if (c20514915Pf != null) {
            View viewFindViewById2 = c20514915Pf.findViewById(R.id.evm);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setClickable(true);
                C786410Ut5.I7(new ACListenerS122S0200000_19(this, c20515215Pi, 43), viewFindViewById2);
            }
            View viewFindViewById3 = c20514915Pf.findViewById(R.id.pcs);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setClickable(true);
                C786410Ut5.I7(new ACListenerS122S0200000_19(this, c20515215Pi, 44), viewFindViewById3);
            }
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Z5("show", "");
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).E3();
        return viewFindViewById;
    }

    public C1246310iXN(C0TGX c0tgx, C19EG c19eg) {
        super(c0tgx);
        this.LL = R.id.s0t;
        this.LLILLJJLI = c19eg;
        this.LLILLL = 507;
        this.LLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(354));
        this.LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(355));
    }
}
