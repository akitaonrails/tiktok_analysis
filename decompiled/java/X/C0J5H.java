package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterBubbleFetchThrottleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J5H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J5H {
    public static final long LJIIJJI = LiveWatchLaterBubbleFetchThrottleSetting.INSTANCE.getValue();
    public static final /* synthetic */ int LJIIL = 0;
    public C19EG LIZ;
    public View LIZIZ;
    public InterfaceC482890Iwh LIZJ;
    public C0J71 LIZLLL;
    public C0J71 LJI;
    public Room LJIIIIZZ;
    public long LJIIIZ;
    public final C0J5D LJ = new C0J5M() { // from class: X.0J5D
        @Override // X.C0J5M
        public final void LIZ(C0J5L c0j5l) {
            c0j5l.LJIIJ = true;
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LIZJ;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZ();
            }
        }

        @Override // X.C0J5M
        public final void LIZIZ(C0J5L c0j5l) {
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LIZJ;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZJ();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_watch_later_guide_show");
            c474500IjALIZ.LJJII("homepage_hot", "enter_from_merge");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LJ), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LIZLLL), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LJFF), "follow_status");
            c474500IjALIZ.LIZ();
        }

        @Override // X.C0J5M
        public final void LIZJ(C0J5L c0j5l) {
            InterfaceC482890Iwh interfaceC482890Iwh = this.LIZ.LIZJ;
            if (interfaceC482890Iwh != null) {
                interfaceC482890Iwh.LIZIZ();
            }
        }
    };
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(163));
    public String LJII = "HOME";
    public final C0J5G LJIIJ = new C0J5M() { // from class: X.0J5G
        @Override // X.C0J5M
        public final void LIZ(C0J5L c0j5l) {
            c0j5l.LJIIJ = true;
            Keva kevaLIZIZ = this.LIZ.LIZIZ();
            int i = C0J5H.LJIIL;
            kevaLIZIZ.storeInt(C0J5F.LIZ("wl_activity_consecutive_no_click"), 0);
            C0J5H c0j5h = this.LIZ;
            C19EG c19eg = c0j5h.LIZ;
            if (c19eg != null) {
                c0j5h.LIZLLL(c19eg);
            }
        }

        @Override // X.C0J5M
        public final void LIZIZ(C0J5L c0j5l) {
            Keva kevaLIZIZ = this.LIZ.LIZIZ();
            int i = C0J5H.LJIIL;
            kevaLIZIZ.storeLong(C0J5F.LIZ("wl_activity_last_show_time"), System.currentTimeMillis());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_watch_later_guide_show");
            c474500IjALIZ.LJJII("homepage_hot", "enter_from_merge");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LJ), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LIZLLL), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(c0j5l.LJFF), "follow_status");
            c474500IjALIZ.LIZ();
        }

        @Override // X.C0J5M
        public final void LIZJ(C0J5L c0j5l) {
            if (!c0j5l.LJIIJ) {
                C0J5H c0j5h = this.LIZ;
                Keva kevaLIZIZ = c0j5h.LIZIZ();
                int i = C0J5H.LJIIL;
                int i2 = kevaLIZIZ.getInt(C0J5F.LIZ("wl_activity_consecutive_no_click"), 0) + 1;
                c0j5h.LIZIZ().storeInt(C0J5F.LIZ("wl_activity_consecutive_no_click"), i2);
                if (i2 >= 2) {
                    c0j5h.LIZIZ().storeInt(C0J5F.LIZ("wl_activity_cooldown_remaining"), 2);
                    c0j5h.LIZIZ().storeInt(C0J5F.LIZ("wl_activity_consecutive_no_click"), 0);
                }
            }
            this.LIZ.LJIIIIZZ = null;
        }
    };

    public final Keva LIZIZ() {
        return (Keva) this.LJFF.getValue();
    }

    public final boolean LIZJ() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Object objLIZ;
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (lifecycleOwner == null || (((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0) && ((objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner)) == null || !(objLIZ instanceof C0J5E) || (lifecycleOwner = (Fragment) objLIZ) == null)) || (lifecycle = lifecycleOwner.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.RESUMED))) {
            return false;
        }
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if ((abstractC1387200mCcLJFF != null ? abstractC1387200mCcLJFF.LIZ : null) instanceof InterfaceC1711206n0) {
            return Intrinsics.LJFF(this.LJII, "HOME");
        }
        return false;
    }

    public final void LJ() {
        ILiveFeedApiService iLiveFeedApiService;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        Object objLIZ;
        if (!LIZJ() || ComplianceServiceProvider.LJIL().LJJJJZI() || (iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)) == null) {
            return;
        }
        iLiveFeedApiService.zr();
        if (C468640IZi.LIZ() > 0) {
            if (System.currentTimeMillis() - LIZIZ().getLong(C0J5F.LIZ("wl_activity_last_show_time"), 0L) >= 86400000 && (lifecycleOwner = this.LIZ) != null) {
                if (((lifecycleOwner instanceof C199Y) && (lifecycleOwner instanceof InterfaceC1711206n0) && ((objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) lifecycleOwner)) == null || !(objLIZ instanceof C0J5E) || (lifecycleOwner = (Fragment) objLIZ) == null)) || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    return;
                }
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C0J5J(this, null), 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J5H.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(C19EG c19eg) {
        C0J71 c0j71 = this.LJI;
        if (c0j71 != null) {
            c0j71.LLZZ();
        }
        Room room = this.LJIIIIZZ;
        if (room != null) {
            ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
            if (iLiveFeedApiService != null) {
                iLiveFeedApiService.zr();
                C468640IZi.LL.LIZJ(c19eg, room, false);
                return;
            }
            return;
        }
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).openWatchLaterHistoryActivity(c19eg);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0J5D] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0J5G] */
    public C0J5H(View view, C19EG c19eg) {
        this.LIZ = c19eg;
        this.LIZIZ = view;
    }
}
