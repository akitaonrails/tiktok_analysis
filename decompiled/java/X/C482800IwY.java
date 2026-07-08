package X;

import Y.ARunnableS12S1100000_7;
import Y.ARunnableS12S1200000_7;
import Y.ARunnableS40S0300000_7;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.FrequencyControlData;

/* JADX INFO: renamed from: X.0IwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482800IwY implements C0J6Q {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public C19EG LIZ;
    public BPEAHandler LIZIZ;
    public C482840Iwc LJ;
    public View LJFF;
    public C0J70 LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public String LIZJ = "For You";
    public String LIZLLL = "HOME";
    public final RunnableC482850Iwd LJIILJJIL = new Runnable() { // from class: X.0Iwd
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TopLiveBubbleManager@e3c2.bubbleExitRunnable$1");
            try {
                this.LL.getClass();
                C482800IwY.LJJIIJZLJL("top_live_bubble_not_click");
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.bubbleExitRunnable$1");
        }
    };
    public final C01GW LJIILL = C452501pT.LIZIZ(new C482860Iwe());

    public final String LJIIJJI() {
        String strLIZIZ = C0J9F.LIZIZ(true);
        return strLIZIZ.length() > 0 ? strLIZIZ : !LJIJI(false) ? "not_fyp" : this.LJIIL ? "toplive_activity_show" : this.LJIIJJI ? "leave_feed" : C1585060rLk.LIZIZ() ? "story_fyp_entrance_exp" : "";
    }

    public final String LJIILIIL() {
        String strLIZIZ = C0J9F.LIZIZ(false);
        return strLIZIZ.length() > 0 ? strLIZIZ : !LJIJI(true) ? "not_fyp" : this.LJIIJJI ? "leave_feed" : C1585060rLk.LIZIZ() ? "story_fyp_entrance_exp" : "";
    }

    @Override // X.C0J6Q
    public final void dispose() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LJFF = null;
        this.LJ = null;
        this.LJI = null;
    }

    @Override // X.C0J6Q
    public final boolean LJI() {
        C0J70 c0j70 = this.LJI;
        if (c0j70 != null) {
            return c0j70.isShowing();
        }
        return false;
    }

    @Override // X.C0J6Q
    public final String LJIIJ() {
        String str;
        C0J70 c0j70 = this.LJI;
        return (c0j70 == null || (str = c0j70.LIZIZ) == null) ? "" : str;
    }

    public final Keva LJIIZILJ() {
        return (Keva) this.LJIILL.getValue();
    }

    @Override // X.C0J6Q
    public final void LJIIIIZZ() {
        C0J70 c0j70;
        LJIILL();
        this.LJIIL = true;
        LJJIFFI();
        View view = this.LJFF;
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LJIILJJIL);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIILIIL;
        this.LJIILIIL = 0L;
        if (C500260Jjc.LJJIIZ(null)) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut();
            if (!C500260Jjc.LJJIIZ(null) || (c0j70 = this.LJI) == null || c0j70.LJIIIIZZ) {
                return;
            }
            c0j70.LIZLLL(c0j70.LJ, c0j70.LIZIZ, c0j70.LIZJ, "click_tooltips_position");
            return;
        }
        if (1 > jCurrentTimeMillis || jCurrentTimeMillis >= 30001) {
            return;
        }
        LJJIIJZLJL("top_live_bubble_click");
        C0J70 c0j702 = this.LJI;
        if (c0j702 == null || c0j702.LJIIIIZZ) {
            return;
        }
        c0j702.LIZLLL(c0j702.LJ, c0j702.LIZIZ, c0j702.LIZJ, "click_tooltips_position");
    }

    public final void LJIILL() {
        C0J70 c0j70;
        if (LJI() && (c0j70 = this.LJI) != null) {
            c0j70.LLZZ();
        }
        if (this.LJIIJ) {
            PopupManager.LJIIJ(C1905800zh4.class, C20660315sv.LL);
            this.LJIIJ = false;
        }
    }

    public final boolean LJIJJ() {
        return LJIIZILJ().getStringSet("page_bubble_shown", C08CX.INSTANCE).contains(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
    }

    public final void LJJIFFI() {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Set<String> stringSet = LJIIZILJ().getStringSet("page_bubble_shown", C08CX.INSTANCE);
        stringSet.add(strValueOf);
        LJIIZILJ().storeStringSet("page_bubble_shown", stringSet);
    }

    public static void LJJIIJZLJL(String str) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFF(9, 0L, str, new C08MM() { // from class: X.0Iwg
            @Override // X.C08MM
            public final void LIZ() {
            }

            @Override // X.C08MM
            public final void LIZIZ(FrequencyControlData frequencyControlData) {
            }

            @Override // X.C08MM
            public final void onFailed() {
            }
        });
    }

    @Override // X.C0J6Q
    public final void LIZ(View view) {
        this.LJFF = view;
    }

    @Override // X.C0J6Q
    public final void LIZJ(C19EG c19eg) {
        this.LJII = false;
        this.LIZ = c19eg;
        this.LIZIZ = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.C0J6Q
    public final void LIZLLL(boolean z) {
        LJIILL();
        this.LJIIJJI = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Iwc] */
    @Override // X.C0J6Q
    public final void LJ(final InterfaceC482890Iwh interfaceC482890Iwh) {
        this.LJ = new InterfaceC482890Iwh() { // from class: X.0Iwc
            @Override // X.InterfaceC482890Iwh
            public final void LIZ() {
                InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                if (interfaceC482890Iwh2 != null) {
                    interfaceC482890Iwh2.LIZ();
                }
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZIZ() {
                InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                if (interfaceC482890Iwh2 != null) {
                    interfaceC482890Iwh2.LIZIZ();
                }
                C0J70 c0j70 = this.LIZ.LJI;
                if (c0j70 != null) {
                    HashSet<C0J9E> hashSet = C0J9F.LIZ;
                    synchronized (hashSet) {
                        try {
                            hashSet.remove(c0j70);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZJ() {
                this.LIZ.LJIILIIL = System.currentTimeMillis();
                C482800IwY c482800IwY = this.LIZ;
                View view = c482800IwY.LJFF;
                if (view != null) {
                    HandlerHook.viewPostDelay(view, c482800IwY.LJIILJJIL, 30000L);
                }
                InterfaceC482890Iwh interfaceC482890Iwh2 = interfaceC482890Iwh;
                if (interfaceC482890Iwh2 != null) {
                    interfaceC482890Iwh2.LIZJ();
                }
                C0J70 c0j70 = this.LIZ.LJI;
                if (c0j70 != null) {
                    HashSet<C0J9E> hashSet = C0J9F.LIZ;
                    synchronized (hashSet) {
                        try {
                            hashSet.add(c0j70);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        };
    }

    @Override // X.C0J6Q
    public final void LJFF(String str) {
        LJIILL();
        if (str != null) {
            this.LIZLLL = str;
        }
    }

    @Override // X.C0J6Q
    public final void LJII(String str) {
        LJIILL();
        if (str != null) {
            this.LIZJ = str;
        }
    }

    public final String LJIIL(FrequencyControlData frequencyControlData) {
        Boolean boolValueOf;
        String strLIZIZ = C0J9F.LIZIZ(true);
        if (strLIZIZ.length() > 0) {
            return strLIZIZ;
        }
        if (frequencyControlData != null) {
            boolValueOf = Boolean.valueOf(frequencyControlData.result);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            return "freq_control";
        }
        if (LJIJJ() && !((Boolean) C256870A4v.LIZ.getValue()).booleanValue()) {
            return "shown_or_entered";
        }
        if (this.LJIIL) {
            return "toplive_activity_show";
        }
        if (this.LJIIJJI) {
            return "leave_feed";
        }
        if (C1585060rLk.LIZIZ()) {
            return "story_fyp_entrance_exp";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn<? super com.bytedance.android.live.network.response.BaseListResponse<com.bytedance.android.livesdk.model.FeedItem, com.bytedance.android.live.base.model.feed.FeedExtra>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C473780Ii0
            if (r0 == 0) goto L20
            r3 = r12
            X.0Ii0 r3 = (X.C473780Ii0) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L68
        L20:
            X.0Ii0 r3 = new X.0Ii0
            r3.<init>(r11, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L6e
            java.lang.Class<com.bytedance.android.feed.api.FeedApi> r0 = com.bytedance.android.feed.api.FeedApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L6e
            com.bytedance.android.feed.api.FeedApi r5 = (com.bytedance.android.feed.api.FeedApi) r5     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = "/webcast/feed/"
            r7 = 0
            java.lang.String r9 = "tiktok_follow_toplive_guide"
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L6e
            r10.<init>()     // Catch: java.lang.Exception -> L6e
            X.11NZ r1 = r5.feed(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L6e
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Exception -> L6e
            X.11Hw r1 = r1.LJL(r0)     // Catch: java.lang.Exception -> L6e
            X.11RO r0 = X.C1701940uOG.LIZIZ()     // Catch: java.lang.Exception -> L6e
            X.11O8 r0 = r1.LJJJLZIJ(r0)     // Catch: java.lang.Exception -> L6e
            r3.LLILLL = r2     // Catch: java.lang.Exception -> L6e
            java.lang.Object r1 = X.C384401eU.LIZ(r0, r3)     // Catch: java.lang.Exception -> L6e
            if (r1 != r4) goto L6b
            return r4
        L68:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6e
        L6b:
            com.bytedance.android.live.network.response.BaseListResponse r1 = (com.bytedance.android.live.network.response.BaseListResponse) r1     // Catch: java.lang.Exception -> L6e
            return r1
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C20441214yg.LJII(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482800IwY.LJIILLIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.String, webcast.api.room.StrategyData>> r19) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482800IwY.LJIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L10
            X.0mCc r0 = X.C1906580ziK.LJFF()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.LIZ
        La:
            boolean r0 = r0 instanceof X.InterfaceC1711206n0
            r2 = 0
            if (r0 != 0) goto L1b
            return r2
        L10:
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.LIZ
            goto La
        L19:
            r0 = 0
            goto La
        L1b:
            java.lang.String r1 = r3.LIZJ
            java.lang.String r0 = "For You"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r1 = r3.LIZLLL
            java.lang.String r0 = "HOME"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
            r2 = 1
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482800IwY.LJIJI(boolean):boolean");
    }

    public static void LJIL(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_request");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "follow_scene");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJ(String str, FrequencyControlData frequencyControlData) {
        Boolean boolValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_request_result");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        Boolean boolValueOf2 = null;
        if (frequencyControlData != null) {
            boolValueOf = Boolean.valueOf(frequencyControlData.result);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            if (frequencyControlData != null) {
                boolValueOf2 = Boolean.valueOf(frequencyControlData.result);
            }
            if (C500260Jjc.LJJIFFI(boolValueOf2)) {
                c474500IjALIZ.LJJII("freq_control", "fail_reason");
            } else {
                c474500IjALIZ.LJJII("error", "fail_reason");
            }
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0J6Q
    public final void LIZIZ(String str, boolean z) {
        boolean zLJI = MethodIDManager.LJI(72043);
        if (this.LJII) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.LJII = true;
        if (z) {
            BPEAHandler bPEAHandler = this.LIZIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJLIIL(10000L, bPEAHandler, new ARunnableS12S1100000_7(this, str, 6));
            }
        } else {
            LJJII(str, null);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0J6Q
    public final void LJIIIZ(long j, Pair pair) {
        BPEAHandler bPEAHandler = this.LIZIZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(j, bPEAHandler, new ARunnableS12S1200000_7(this, pair, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.StrategyData r9, X.InterfaceC1364105Vn r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C473760Ihy
            if (r0 == 0) goto L22
            r5 = r10
            X.0Ihy r5 = (X.C473760Ihy) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 0
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L8f
        L22:
            X.0Ihy r5 = new X.0Ihy
            r5.<init>(r8, r10)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            if (r9 != 0) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3a:
            java.util.List<webcast.api.room.StrategyFilter> r0 = r9.filter
            java.util.Iterator r2 = r0.iterator()
        L40:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            r0 = r1
            webcast.api.room.StrategyFilter r0 = (webcast.api.room.StrategyFilter) r0
            int r0 = r0.filterType
            if (r0 != r3) goto L5b
            r0 = 1
        L52:
            if (r0 == 0) goto L40
        L54:
            if (r1 != 0) goto L5f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L5b:
            r0 = 0
            goto L52
        L5d:
            r1 = r4
            goto L54
        L5f:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L96
            java.lang.Class<com.bytedance.android.strategy.StrategyApi> r0 = com.bytedance.android.strategy.StrategyApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L96
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L96
            com.bytedance.android.strategy.StrategyApi r2 = (com.bytedance.android.strategy.StrategyApi) r2     // Catch: java.lang.Exception -> L96
            java.lang.String r1 = r9.strategyId     // Catch: java.lang.Exception -> L96
            r0 = 17
            X.11NZ r1 = r2.strategyCheck(r0, r1)     // Catch: java.lang.Exception -> L96
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Exception -> L96
            X.11Hw r1 = r1.LJL(r0)     // Catch: java.lang.Exception -> L96
            X.11RO r0 = X.C1701940uOG.LIZIZ()     // Catch: java.lang.Exception -> L96
            X.11O8 r0 = r1.LJJJLZIJ(r0)     // Catch: java.lang.Exception -> L96
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L96
            java.lang.Object r1 = X.C384401eU.LIZ(r0, r5)     // Catch: java.lang.Exception -> L96
            if (r1 != r6) goto L92
            return r6
        L8f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L96
        L92:
            X.0Icq r1 = (X.C470580Icq) r1     // Catch: java.lang.Exception -> L96
            r4 = r1
            goto L9d
        L96:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C20441214yg.LJII(r0)
        L9d:
            if (r4 == 0) goto Lae
            T r0 = r4.data
            webcast.api.room.StrategyCheckData r0 = (webcast.api.room.StrategyCheckData) r0
            if (r0 == 0) goto Lae
            long r3 = r0.decision
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lae
            r7 = 1
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482800IwY.LJIILJJIL(webcast.api.room.StrategyData, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:4:0x0004, B:6:0x0009, B:7:0x000f, B:9:0x001a, B:10:0x001f, B:11:0x0023, B:12:0x0026, B:13:0x0029, B:14:0x002c, B:26:0x0053, B:28:0x0059, B:30:0x0067, B:31:0x006f, B:33:0x007a, B:35:0x007e, B:36:0x0095, B:17:0x0035, B:20:0x003e, B:22:0x0046, B:23:0x004a), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:4:0x0004, B:6:0x0009, B:7:0x000f, B:9:0x001a, B:10:0x001f, B:11:0x0023, B:12:0x0026, B:13:0x0029, B:14:0x002c, B:26:0x0053, B:28:0x0059, B:30:0x0067, B:31:0x006f, B:33:0x007a, B:35:0x007e, B:36:0x0095, B:17:0x0035, B:20:0x003e, B:22:0x0046, B:23:0x004a), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:4:0x0004, B:6:0x0009, B:7:0x000f, B:9:0x001a, B:10:0x001f, B:11:0x0023, B:12:0x0026, B:13:0x0029, B:14:0x002c, B:26:0x0053, B:28:0x0059, B:30:0x0067, B:31:0x006f, B:33:0x007a, B:35:0x007e, B:36:0x0095, B:17:0x0035, B:20:0x003e, B:22:0x0046, B:23:0x004a), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:4:0x0004, B:6:0x0009, B:7:0x000f, B:9:0x001a, B:10:0x001f, B:11:0x0023, B:12:0x0026, B:13:0x0029, B:14:0x002c, B:26:0x0053, B:28:0x0059, B:30:0x0067, B:31:0x006f, B:33:0x007a, B:35:0x007e, B:36:0x0095, B:17:0x0035, B:20:0x003e, B:22:0x0046, B:23:0x004a), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:4:0x0004, B:6:0x0009, B:7:0x000f, B:9:0x001a, B:10:0x001f, B:11:0x0023, B:12:0x0026, B:13:0x0029, B:14:0x002c, B:26:0x0053, B:28:0x0059, B:30:0x0067, B:31:0x006f, B:33:0x007a, B:35:0x007e, B:36:0x0095, B:17:0x0035, B:20:0x003e, B:22:0x0046, B:23:0x004a), top: B:42:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(final java.lang.String r12, kotlin.Pair<java.lang.Long, java.lang.String> r13) {
        /*
            r11 = this;
            X.19EG r4 = r11.LIZ
            if (r4 == 0) goto La1
            X.0J70 r3 = new X.0J70     // Catch: java.lang.Exception -> L9d
            r5 = 0
            if (r13 == 0) goto L99
            java.lang.Object r0 = r13.getSecond()     // Catch: java.lang.Exception -> L9d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9d
        Lf:
            r3.<init>(r4, r12, r0)     // Catch: java.lang.Exception -> L9d
            android.view.View r0 = r11.LJFF     // Catch: java.lang.Exception -> L9d
            r3.LIZLLL = r0     // Catch: java.lang.Exception -> L9d
            X.0Iwc r1 = r11.LJ     // Catch: java.lang.Exception -> L9d
            if (r1 == 0) goto L1f
            java.util.ArrayList<X.0Iwh> r0 = r3.LJFF     // Catch: java.lang.Exception -> L9d
            r0.add(r1)     // Catch: java.lang.Exception -> L9d
        L1f:
            int r0 = r12.hashCode()     // Catch: java.lang.Exception -> L9d
            switch(r0) {
                case -1990726351: goto L4a;
                case -56545967: goto L3e;
                case 669407581: goto L35;
                case 1000653772: goto L2c;
                default: goto L26;
            }     // Catch: java.lang.Exception -> L9d
        L26:
            r11.LJJIII(r4, r3, r12)     // Catch: java.lang.Exception -> L9d
        L29:
            r11.LJI = r3     // Catch: java.lang.Exception -> L9d
            goto L9c
        L2c:
            java.lang.String r0 = "game_core"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L53
            goto L26
        L35:
            java.lang.String r0 = "toplive_core"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L53
            goto L26
        L3e:
            java.lang.String r0 = "newfollow"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L26
            r11.LJJIIJ(r4, r3, r12, r13)     // Catch: java.lang.Exception -> L9d
            goto L29
        L4a:
            java.lang.String r0 = "social_core"
            boolean r0 = r12.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L53
            goto L26
        L53:
            boolean r0 = r11.LJIJJ()     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L6f
            X.01GW r0 = X.C256870A4v.LIZ     // Catch: java.lang.Exception -> L9d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L9d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L6f
            java.lang.String r0 = "coldstart"
            r3.LIZIZ = r0     // Catch: java.lang.Exception -> L9d
            r11.LJJIII(r4, r3, r0)     // Catch: java.lang.Exception -> L9d
            goto L29
        L6f:
            java.lang.String r2 = r11.LJIIL(r5)     // Catch: java.lang.Exception -> L9d
            int r0 = r2.length()     // Catch: java.lang.Exception -> L9d
            r1 = 1
            if (r0 != 0) goto L95
            boolean r0 = r11.LJIIIZ     // Catch: java.lang.Exception -> L9d
            if (r0 != 0) goto L29
            r11.LJIIIZ = r1     // Catch: java.lang.Exception -> L9d
            LJIL(r12, r5)     // Catch: java.lang.Exception -> L9d
            X.1AKK r5 = com.bytedance.android.livesdk.internal.Live.getService()     // Catch: java.lang.Exception -> L9d
            r6 = 8
            r7 = 0
            r9 = 0
            X.0Iwb r10 = new X.0Iwb     // Catch: java.lang.Exception -> L9d
            r10.<init>()     // Catch: java.lang.Exception -> L9d
            r5.LLII(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L9d
            goto L29
        L95:
            LJIJJLI(r12, r2, r5)     // Catch: java.lang.Exception -> L9d
            goto L29
        L99:
            r0 = r5
            goto Lf
        L9c:
            return
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482800IwY.LJJII(java.lang.String, kotlin.Pair):void");
    }

    public static void LJIJJLI(String str, String str2, String str3) {
        if (Intrinsics.LJFF(str, "lostfocus") && Intrinsics.LJFF(str2, "operating_bubble_show")) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_avoid");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "follow_scene");
        }
        c474500IjALIZ.LJJII(str2, "avoid_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LJJI(String str, FrequencyControlData frequencyControlData, String str2) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_request_result");
        c474500IjALIZ.LJJII(str, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "follow_scene");
        }
        if (frequencyControlData != null) {
            if (frequencyControlData.result) {
                Room room = frequencyControlData.room;
                if (room != null) {
                    c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
                    Room room2 = frequencyControlData.room;
                    if (room2 != null) {
                        lValueOf = Long.valueOf(room2.getOwnerUserId());
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                } else {
                    c474500IjALIZ.LJJII("no_live", "fail_reason");
                }
            } else {
                c474500IjALIZ.LJJII(frequencyControlData.avoidReason, "fail_reason");
            }
        } else {
            c474500IjALIZ.LJJII("error", "fail_reason");
        }
        c474500IjALIZ.LIZ();
    }

    public final void LJJIII(C19EG c19eg, C0J70 c0j70, String str) {
        C19EG c19eg2 = this.LIZ;
        if (c19eg2 != null) {
            C500260Jjc.LJJJJJ(c19eg2, C0PEM.LIZJ, new C473750Ihx(this, str, null), 2);
        }
        C19EG c19eg3 = this.LIZ;
        if (c19eg3 != null) {
            C500260Jjc.LJJJJJ(c19eg3, null, new C482810IwZ(this, str, c19eg, c0j70, null), 3);
        }
    }

    public final void LJJIIJ(final C19EG c19eg, final C0J70 c0j70, final String str, final Pair<Long, String> pair) {
        boolean z;
        long jLongValue;
        C20441214yg.LJIIIZ("TopLiveBubbleManager", "showTopLiveBubbleWithFollow");
        String strLJIILIIL = LJIILIIL();
        if (strLJIILIIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String second = null;
        if (z) {
            if (this.LJIIIZ) {
                return;
            }
            this.LJIIIZ = true;
            if (pair != null) {
                second = pair.getSecond();
            }
            LJIL(str, second);
            C1AKK service = Live.getService();
            if (pair != null) {
                jLongValue = pair.getFirst().longValue();
            } else {
                jLongValue = 0;
            }
            service.LLII(7, jLongValue, 0, new C08MM() { // from class: X.0Iwa
                @Override // X.C08MM
                public final void LIZ() {
                }

                @Override // X.C08MM
                public final void onFailed() {
                    this.LIZ.LJIIIZ = false;
                    String str2 = str;
                    Pair<Long, String> pair2 = pair;
                    C482800IwY.LJJI(str2, null, pair2 != null ? pair2.getSecond() : null);
                }

                @Override // X.C08MM
                public final void LIZIZ(FrequencyControlData frequencyControlData) {
                    String second2;
                    this.LIZ.LJIIIZ = false;
                    String str2 = str;
                    Pair<Long, String> pair2 = pair;
                    String second3 = null;
                    if (pair2 != null) {
                        second2 = pair2.getSecond();
                    } else {
                        second2 = null;
                    }
                    C482800IwY.LJJI(str2, frequencyControlData, second2);
                    Room room = frequencyControlData.room;
                    if (room != null) {
                        C482800IwY c482800IwY = this.LIZ;
                        C19EG c19eg2 = c19eg;
                        C0J70 c0j702 = c0j70;
                        String str3 = str;
                        Pair<Long, String> pair3 = pair;
                        if (frequencyControlData.result) {
                            String strLJIILIIL2 = c482800IwY.LJIILIIL();
                            if (strLJIILIIL2.length() == 0) {
                                if (pair3 != null) {
                                    pair3.getSecond();
                                }
                                c0j702.LJ = room;
                                c482800IwY.LJIIJ = true;
                                PopupManager.LJIJI(new C1905800zh4(c19eg2, c0j702, new ARunnableS40S0300000_7(c482800IwY, c0j702, c19eg2, 7)), true);
                                return;
                            }
                            if (pair3 != null) {
                                second3 = pair3.getSecond();
                            }
                            C482800IwY.LJIJJLI(str3, strLJIILIIL2, second3);
                        }
                    }
                }
            });
            return;
        }
        if (pair != null) {
            second = pair.getSecond();
        }
        LJIJJLI(str, strLJIILIIL, second);
    }
}
