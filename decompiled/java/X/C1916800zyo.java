package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.pns.IScreenTimeService;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0zyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916800zyo implements InterfaceC427710Gpt {
    public int LL;
    public int LLILLJJLI;
    public volatile boolean LLILZIL;
    public final C054G LLIZ;
    public volatile boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public Function0<Unit> LLJJ;
    public Function0<Unit> LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public volatile int LLILZLL = -1;

    public final IScreenTimeService LIZ() {
        return (IScreenTimeService) this.LLJJIJIIJIL.getValue();
    }

    public C1916800zyo() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LLJ = C452501pT.LIZIZ(new C1916760zyk());
        this.LLJI = C452501pT.LIZIZ(new C1916830zyr());
        this.LLJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(528));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(527));
        this.LLJILJILJ = C452501pT.LIZIZ(new C1916860zyu(this));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 720));
        this.LLJJIII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(529));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(526));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(530));
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(this);
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void LIZJ() {
        if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
            return;
        }
        int i = this.LL;
        if (i == 1 || i == 3 || i == 10) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "video_play");
            c2344009Gk.LJIIIIZZ("description", String.valueOf(this.LL));
            C20684815ws.LJIILLIIL("consent_monitor_online", c2344009Gk.LIZ);
            int i2 = this.LL;
            String str = i2 != 1 ? i2 != 3 ? i2 != 10 ? "" : "watch_video_10" : "watch_video_3" : "watch_video_1";
            if (str.length() > 0) {
                ComplianceServiceProvider.LIZIZ.getClass();
                ComplianceServiceProvider.LJIIJ().LIZJ(str);
            }
        }
    }

    public final void LIZLLL() {
        IScreenTimeService iScreenTimeServiceLIZ;
        int iLJII;
        IScreenTimeService iScreenTimeServiceLIZ2 = LIZ();
        if (iScreenTimeServiceLIZ2 != null && iScreenTimeServiceLIZ2.LIZIZ() && (iScreenTimeServiceLIZ = LIZ()) != null && (iLJII = iScreenTimeServiceLIZ.LJII()) > 0) {
            IScreenTimeService iScreenTimeServiceLIZ3 = LIZ();
            if ((iScreenTimeServiceLIZ3 != null ? iScreenTimeServiceLIZ3.LJIIIZ() : 0) / 60 >= iLJII) {
                this.LLJJJ++;
                IScreenTimeService iScreenTimeServiceLIZ4 = LIZ();
                int iLJII2 = iScreenTimeServiceLIZ4 != null ? iScreenTimeServiceLIZ4.LJII() : 0;
                IScreenTimeService iScreenTimeServiceLIZ5 = LIZ();
                int iLJIIIZ = (iScreenTimeServiceLIZ5 != null ? iScreenTimeServiceLIZ5.LJIIIZ() : 0) / 60;
                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LLJJIJI.getValue();
                if (pnSDigitalWellbeingSDKService != null) {
                    pnSDigitalWellbeingSDKService.LIZ("daily_screen_time_bypass_detected", C2097608Jq.LJIIIIZZ(new Pair("bypass_reason", "user_swiping_videos"), new Pair("daily_limit_minutes", String.valueOf(iLJII2)), new Pair("today_used_minutes", String.valueOf(iLJIIIZ)), new Pair("video_count", String.valueOf(this.LLJJJ)), new Pair("total_videos_watched", String.valueOf(this.LL)), new Pair("current_time", String.valueOf(System.currentTimeMillis()))));
                    return;
                }
                return;
            }
        }
        this.LLJJJ = 0;
    }

    public final void LJ() {
        if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            this.LLILLJJLI++;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "video_play");
            c2344009Gk.LJIIIIZZ("description", String.valueOf(this.LLILLJJLI));
            C20684815ws.LJIILLIIL("video_play_km_monitor_online", c2344009Gk.LIZ);
        }
    }

    public final void LJFF() {
        IScreenTimeService iScreenTimeServiceLIZ;
        IScreenTimeService iScreenTimeServiceLIZ2;
        IScreenTimeService iScreenTimeServiceLIZ3 = LIZ();
        if (iScreenTimeServiceLIZ3 == null || !iScreenTimeServiceLIZ3.LJI() || (iScreenTimeServiceLIZ = LIZ()) == null || !iScreenTimeServiceLIZ.LIZJ() || (iScreenTimeServiceLIZ2 = LIZ()) == null || iScreenTimeServiceLIZ2.LJIIJ()) {
            this.LLJJIJIL = 0;
            return;
        }
        IScreenTimeService iScreenTimeServiceLIZ4 = LIZ();
        if (iScreenTimeServiceLIZ4 != null && iScreenTimeServiceLIZ4.LIZ()) {
            this.LLJJIJIL = 0;
            return;
        }
        this.LLJJIJIL++;
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LLJJIJI.getValue();
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LIZ("time_away_bypass_detected", C2097608Jq.LJIIIIZZ(new Pair("bypass_reason", "user_swiping_videos"), new Pair("approach_type", "server_driven_bytesync"), new Pair("video_count", String.valueOf(this.LLJJIJIL)), new Pair("total_videos_watched", String.valueOf(this.LL)), new Pair("current_time", String.valueOf(System.currentTimeMillis()))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1916800zyo.LIZIZ(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.BACKGROUND)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayerControllerRenderFrameVideoCounter(X.C1584420rKi r14) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1916800zyo.onPlayerControllerRenderFrameVideoCounter(X.0rKi):void");
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return;
        }
        this.LL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJ = 0;
        C0NR5.LIZIZ.set(0);
    }
}
