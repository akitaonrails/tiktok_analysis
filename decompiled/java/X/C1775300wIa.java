package X;

import Y.ARunnableS0S0100010_26;
import Y.ARunnableS19S0200100_26;
import Y.ARunnableS45S0110000_26;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcFeedMediaPlayerStrategyModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import j27.s;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775300wIa extends C1767310w5h implements InterfaceC2272941Dxs {
    public static final boolean LLLLL;
    public final s LLLFF;
    public Double LLLFFI;
    public C1773610wFr<C1773330wFP> LLLFZ;
    public C2272921Dxq LLLI;
    public InterfaceC1773850wGF LLLII;
    public volatile boolean LLLIIII;
    public volatile boolean LLLIIIIL;
    public volatile boolean LLLIIIL;
    public volatile boolean LLLIIL;
    public Long LLLIILIL;
    public String LLLIL;
    public Integer LLLILZ;
    public C21281818Qe LLLILZJ;
    public C1768420w7U LLLILZLLLI;
    public Boolean LLLIZZ;
    public boolean LLLJ;
    public String LLLJIL;
    public Long LLLJL;
    public Long LLLL;
    public Long LLLLII;
    public String LLLLIIIILLL;
    public String LLLLIIL;
    public String LLLLIILL;
    public String LLLLIILLL;
    public TextView LLLLIL;
    public String LLLLILI;
    public String LLLLJ;
    public String LLLLJI;

    @Override // X.C1767310w5h, X.C14TT
    public final void LJIILL() {
        this.LLLIIII = false;
        super.LJIILL();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLL) {
            LJIL("release");
        }
        this.LLLIIIL = false;
        C2272921Dxq playService = getPlayService();
        if (playService != null) {
            playService.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLLL() {
        return "video";
    }

    @Override // X.InterfaceC2272941Dxs
    public C1775300wIa getItemView() {
        return this;
    }

    @Override // X.C1767310w5h, X.C20299114bl, X.C14TT, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final C21281818Qe getTimeView() {
        if (this.LLLILZJ == null) {
            View viewFindViewByIdSelector = this.LLLFF.LJIILJJIL().findViewByIdSelector("feed-video-time");
            this.LLLILZJ = viewFindViewByIdSelector instanceof C21281818Qe ? (C21281818Qe) viewFindViewByIdSelector : null;
        }
        if (this.LLLILZJ == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
        }
        return this.LLLILZJ;
    }

    @Override // X.C1767310w5h, X.C14TT
    public final void LJIIIIZZ() {
        if (this.LLLIIII) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MMKVideo", "clearEnvironment...");
            super.LJIIIIZZ();
            this.LLLIIIIL = true;
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLIL() {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playMedia: ");
        sbLIZ.append(getSrc());
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        if (LLLLL) {
            LJIL("playMedia");
        }
        this.LLLIIII = true;
        LJ(null);
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLJLJLL() {
        String str = this.LLLIL;
        return str == null ? getOrigSourceId() : str;
    }

    @Override // X.InterfaceC2272941Dxs
    public C1768420w7U getConfig() {
        InterfaceC1775450wIp<C1773330wFP> containerCallback;
        C1773330wFP data;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        Map<String, Object> map;
        if (this.LLLILZLLLI == null) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MMKVideo", "initConfig");
            if (getContainerCallback() != null && (containerCallback = getContainerCallback()) != null && (data = containerCallback.getData()) != null && (eCMixMallItemInfoDTO = data.LJIIIZ) != null && (map = eCMixMallItemInfoDTO.config) != null) {
                this.LLLILZLLLI = C1768550w7h.LIZIZ(map);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initConfig: ");
                sbLIZ.append(this.LLLILZLLLI);
                C599820Nfo.LIZ("MMKVideo", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return this.LLLILZLLLI;
    }

    @Override // X.InterfaceC2272941Dxs
    public InterfaceC1775450wIp<C1773330wFP> getContainerCallback() {
        if (this.LLLFZ == null) {
            LynxView lynxViewLJIILJJIL = this.LLLFF.LJIILJJIL();
            ViewParent parent = lynxViewLJIILJJIL != null ? lynxViewLJIILJJIL.getParent() : null;
            this.LLLFZ = parent instanceof C1773610wFr ? (C1773610wFr) parent : null;
        }
        return this.LLLFZ;
    }

    public final InterfaceC1773850wGF getReporterService() {
        InterfaceC1773310wFN interfaceC1773310wFNLIZ;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        if (this.LLLII == null) {
            InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
            this.LLLII = (containerCallback == null || (interfaceC1773310wFNLIZ = containerCallback.LIZ()) == null || (interfaceC1773890wGJLIZJ = interfaceC1773310wFNLIZ.LIZJ()) == null) ? null : (InterfaceC1773850wGF) interfaceC1773890wGJLIZJ.getService(InterfaceC1773850wGF.class);
        }
        return this.LLLII;
    }

    @Override // X.C1767310w5h, X.C14TT, X.AbstractC21340218fI
    public final void pause() {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause: ");
        sbLIZ.append(getSrc());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLL) {
            LJIL("pause");
        }
        super.pause();
    }

    static {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            LLLLL = Keva.getRepo("ecom_keva_store").getBoolean("_debug_mix_mall_live_video_debug_view", false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2272921Dxq getPlayService() {
        /*
            r10 = this;
            X.0w7U r2 = r10.getConfig()
            r6 = 1
            r1 = 0
            if (r2 == 0) goto La5
            int r0 = r2.LIZ
            if (r0 != r6) goto L16
            r0 = 0
        Ld:
            r3 = 0
            if (r0 == 0) goto L18
            X.0Nfo r0 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r0)
            return r3
        L16:
            r0 = 1
            goto Ld
        L18:
            if (r2 == 0) goto La5
            int r0 = r2.LIZLLL
            if (r0 != r6) goto L7d
            java.lang.Boolean r0 = r10.LLLIZZ
            if (r0 != 0) goto L57
            boolean r0 = X.C034S.LIZ()
            if (r0 == 0) goto L6b
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService r1 = com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(r1)
            if (r1 == 0) goto L69
            r9 = 1
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService.class
            java.lang.String r7 = r0.getName()
            if (r1 == 0) goto L67
            java.lang.Class r0 = r1.getClass()
            java.lang.String r8 = r0.getName()
        L48:
            X.C1AQS.LIZJ(r4, r6, r7, r8, r9)
        L4b:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService) r1
            boolean r0 = r1.isLogin()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.LLLIZZ = r0
        L57:
            java.lang.Boolean r1 = r10.LLLIZZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7b
            X.0Nfo r0 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r0)
            return r3
        L67:
            r8 = r3
            goto L48
        L69:
            r9 = 0
            goto L38
        L6b:
            X.04Zw r0 = X.C1120604Zw.LIZ
            r0.LIZ()
            X.04aq r1 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService.class
            X.0317 r1 = r1.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1
            goto L4b
        L7b:
            if (r2 == 0) goto La5
        L7d:
            boolean r0 = r2.LIZIZ()
            if (r0 != 0) goto L89
            X.0Nfo r0 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r0)
            return r3
        L89:
            android.content.Context r0 = r10.getContext()
            boolean r0 = r2.LIZLLL(r0)
            if (r0 != 0) goto L99
            X.0Nfo r0 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r0)
            return r3
        L99:
            boolean r0 = r2.LIZJ()
            if (r0 != 0) goto La5
            X.0Nfo r0 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r0)
            return r3
        La5:
            X.1Dxq r0 = r10.LLLI
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775300wIa.getPlayService():X.1Dxq");
    }

    private final String getPlayStatus() {
        if (LJIJJLI()) {
            return EnumC1775410wIl.PLAYING.getStatus();
        }
        C1766660w4e.LIZ.getClass();
        return C1766660w4e.LJFF ? EnumC1775410wIl.INIT.getStatus() : EnumC1775410wIl.STOP.getStatus();
    }

    @Override // X.C1767310w5h, X.C14TT, X.AbstractC21340218fI
    public final void LIZIZ() {
        super.LIZIZ();
        Double d = this.LLLFFI;
        if (d != null) {
            HandlerHook.viewPost(this, new ARunnableS0S0100010_26(this, d.doubleValue(), 0));
        }
    }

    @Override // X.C14TT
    public final boolean LJIJ() {
        Integer num = C1771440wCM.LIZLLL().videoOpt;
        return num != null && num.intValue() == 1;
    }

    public final void LJJII() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLLL) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger:");
            sbLIZ.append(this.LLLLJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status:");
            sbLIZ2.append(this.LLLLILI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ratio:");
            sbLIZ3.append(this.LLLLJI);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            TextView textView = this.LLLLIL;
            if (textView != null) {
                textView.setText(sb.toString());
            }
        }
    }

    public final void LJJIJ() {
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        int iDoubleValue;
        InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
        if (containerCallback == null || (data = containerCallback.getData()) == null || (c1775190wIP = data.LJII) == null || (c1775180wIO = c1775190wIP.LIZIZ) == null) {
            return;
        }
        Long currentPosition = getCurrentPosition();
        long jLongValue = currentPosition != null ? currentPosition.longValue() : 0L;
        c1775180wIO.LJIJ = jLongValue;
        int i = 100;
        long j = jLongValue * ((long) 100);
        try {
            Double d = this.LLLFFI;
            iDoubleValue = (int) (j / (d != null ? (long) d.doubleValue() : 1L));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iDoubleValue = 0;
        }
        if (iDoubleValue < 0) {
            i = 0;
        } else if (iDoubleValue <= 100) {
            i = iDoubleValue;
        }
        c1775180wIO.LJIJI = i;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLLL() {
        return LJIJJLI();
    }

    @Override // X.InterfaceC2272941Dxs
    public String getMediaSrc() {
        return getSrc();
    }

    @Override // X.C14TT
    public String getVideoEnterFrom() {
        if (C07B7.LIZ()) {
            return this.LLLLIIIILLL;
        }
        return null;
    }

    @Override // X.C14TT
    public Map<String, String> getVideoSceneTag() {
        if (!C07B7.LIZ() || !C770702zh.LIZIZ(this.LLLLIILL)) {
            return null;
        }
        Pair[] pairArr = new Pair[1];
        String str = this.LLLLIILL;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("gec", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.C14TT
    public String getVideoTag() {
        if (C07B7.LIZ()) {
            return this.LLLLIIL;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1773610wFr c1773610wFr;
        InterfaceC1773310wFN mixMallController;
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        super.onAttachedToWindow();
        C2272951Dxt.LIZ.getClass();
        if (((EcFeedMediaPlayerStrategyModel) C2272951Dxt.LIZJ.getValue()).videoLoop == 1) {
            setLoop(true);
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLL) {
            LJIL("onAttachedToWindow");
        }
        if (this.LLLI == null) {
            LynxView lynxViewLJIILJJIL = this.LLLFF.LJIILJJIL();
            C2272921Dxq c2272921Dxq = null;
            ViewParent parent = lynxViewLJIILJJIL != null ? lynxViewLJIILJJIL.getParent() : null;
            if ((parent instanceof C1773610wFr) && (c1773610wFr = (C1773610wFr) parent) != null && (mixMallController = c1773610wFr.getMixMallController()) != null && (interfaceC1773890wGJLIZJ = mixMallController.LIZJ()) != null) {
                c2272921Dxq = (C2272921Dxq) interfaceC1773890wGJLIZJ.getService(C2272921Dxq.class);
            }
            this.LLLI = c2272921Dxq;
        }
        this.LLLIIIL = false;
        C2272921Dxq playService = getPlayService();
        if (playService != null) {
            playService.LJI(this);
        }
    }

    @Override // X.C1767310w5h, X.C14TT, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLL) {
            LJIL("onDetachedFromWindow");
        }
        LLLLLLIL(false);
        this.LLLIIIL = false;
        C2272921Dxq playService = getPlayService();
        if (playService != null) {
            playService.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLL() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLL() {
        return this.LLLIIIL;
    }

    public final String getEnterFrom() {
        return this.LLLLIIIILLL;
    }

    @Override // X.InterfaceC2272941Dxs
    public /* bridge */ /* synthetic */ View getItemView() {
        getItemView();
        return this;
    }

    public final s getLynxContext() {
        return this.LLLFF;
    }

    @Override // X.C1767310w5h
    public String getScene() {
        return this.LLLLIILLL;
    }

    public final String getVodSceneTag() {
        return this.LLLLIILL;
    }

    public final String getVodTag() {
        return this.LLLLIIL;
    }

    @Override // X.C1767310w5h, X.C14TT, X.AbstractC21340218fI
    public final void LJ(Function0<Unit> function0) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLLL) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService2).isLocalTest()) {
                TextView textView = new TextView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                layoutParams.topMargin = C0H9H.LIZIZ(100);
                C786410Ut5.g6(textView, layoutParams);
                textView.setBackgroundColor(-7829368);
                textView.setTextColor(-1);
                textView.setTypeface(null, 1);
                textView.setTextSize(10.0f);
                this.LLLLIL = textView;
                addView(textView);
                LJJII();
            }
            LJIL("playReal");
        }
        if (this.LLLIIII && !TextUtils.isEmpty(getSrc())) {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            this.LLLIILIL = Long.valueOf(System.currentTimeMillis());
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playReal: ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MMKVideo", strLIZIZ);
            if (!this.LLLIIIIL) {
                LJIIIIZZ();
            }
            C0N0Y player = getPlayer();
            if (player != null) {
                player.seek(0.0f);
            }
            super.LJ(function0);
            if (!this.LLLJ) {
                LJJIIZ("play");
                LJJ("play");
                LJJI(this, "card_emit_play");
                this.LLLJ = true;
                C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775200wIQ(this, EnumC1775210wIR.EMIT_PLAY, null));
            }
            this.LLLL = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime3);
            return;
        }
        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("playReal skip: allowPlay: ");
        sbLIZ2.append(this.LLLIIII);
        sbLIZ2.append(", src: ");
        sbLIZ2.append(getSrc());
        C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo2.getClass();
        C599820Nfo.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:5:0x001d, B:7:0x0028, B:9:0x002e, B:10:0x0032, B:16:0x003e, B:18:0x0044, B:24:0x0050, B:25:0x0058, B:27:0x0064), top: B:57:0x001d }] */
    @Override // X.C1767310w5h, X.C14TT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LJIILIIL(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775300wIa.LJIILIIL(java.lang.String):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public final void LJIL(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLLLJ = str;
            LJJII();
        }
    }

    public final void LJJ(String str) {
        C1773330wFP data;
        InterfaceC1773850wGF reporterService = getReporterService();
        if (reporterService != null) {
            InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
            if (containerCallback != null) {
                data = containerCallback.getData();
            } else {
                data = null;
            }
            reporterService.LJIIJ(str, data, 0, new C1774840wHq(null, 7), null);
        }
    }

    public final void LJJIFFI(long j) {
        C21281818Qe timeView;
        C21281818Qe timeView2 = getTimeView();
        if (timeView2 != null && timeView2.LLJILJIL && (timeView = getTimeView()) != null) {
            HandlerHook.viewPost(timeView, new ARunnableS19S0200100_26(timeView, this, j, 0));
        }
    }

    public final void LJJIII(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            this.LLLLILI = str;
            LJJII();
        }
    }

    public final void LJJIIJ(boolean z) {
        C21281818Qe timeView = getTimeView();
        if (timeView != null) {
            HandlerHook.viewPost(timeView, new ARunnableS45S0110000_26(timeView, z, 0));
        }
    }

    public final void LJJIIJZLJL(Boolean bool) {
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        String playStatus;
        LJJIJ();
        InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
        if (containerCallback != null && (data = containerCallback.getData()) != null && (c1775190wIP = data.LJII) != null && (c1775180wIO = c1775190wIP.LIZIZ) != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                playStatus = EnumC1775410wIl.PLAYING.getStatus();
            } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
                playStatus = EnumC1775410wIl.STOP.getStatus();
            } else {
                playStatus = getPlayStatus();
            }
            c1775180wIO.LJIJJ = playStatus;
        }
    }

    public final void LJJIIZ(String str) {
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        int i;
        long jDoubleValue;
        InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
        if (containerCallback != null && (data = containerCallback.getData()) != null && (c1775190wIP = data.LJII) != null && (c1775180wIO = c1775190wIP.LIZIZ) != null) {
            int iHashCode = str.hashCode();
            long jDoubleValue2 = 0;
            int i2 = 100;
            if (iHashCode != -1877652737) {
                if (iHashCode != 3443508) {
                    if (iHashCode == 1910181940 && str.equals("play_break")) {
                        c1775180wIO.LJIILLIIL++;
                        Long currentPosition = getCurrentPosition();
                        if (currentPosition != null) {
                            jDoubleValue2 = currentPosition.longValue();
                        }
                        c1775180wIO.LJIJ = jDoubleValue2;
                        long j = jDoubleValue2 * ((long) 100);
                        try {
                            Double d = this.LLLFFI;
                            if (d != null) {
                                jDoubleValue = (long) d.doubleValue();
                            } else {
                                jDoubleValue = 1;
                            }
                            i = (int) (j / jDoubleValue);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            i = 0;
                        }
                        if (i < 0) {
                            i2 = 0;
                        } else if (i <= 100) {
                            i2 = i;
                        }
                        c1775180wIO.LJIJI = i2;
                        c1775180wIO.LJIJJ = getPlayStatus();
                        return;
                    }
                    return;
                }
                if (str.equals("play")) {
                    c1775180wIO.LJIILJJIL++;
                    c1775180wIO.LJIJ = 0L;
                    c1775180wIO.LJIJI = 0;
                    c1775180wIO.LJIJJ = getPlayStatus();
                    return;
                }
                return;
            }
            if (str.equals("play_over")) {
                c1775180wIO.LJIIZILJ++;
                Double d2 = this.LLLFFI;
                if (d2 != null) {
                    jDoubleValue2 = (long) d2.doubleValue();
                }
                c1775180wIO.LJIJ = jDoubleValue2;
                c1775180wIO.LJIJI = 100;
                c1775180wIO.LJIJJ = getPlayStatus();
            }
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLF(String str) {
        return LJIIZILJ(str);
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLJIL(float f) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (LLLLL) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
                this.LLLLJI = String.valueOf(f);
            }
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLLIL(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pauseMedia: pauseAll:");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLL) {
            LJIL("pauseMedia");
        }
        if (this.LLLIIII) {
            this.LLLIIII = false;
            if (!this.LLLIIIL) {
                LJJIIZ("play_break");
                LJJ("play_break");
                LJJI(this, "card_emit_stop");
            }
        }
        if (z) {
            pause();
        }
        Double d = this.LLLFFI;
        if (d != null) {
            LJJIFFI((long) d.doubleValue());
            LJJIIJ(false);
        }
        C786410Ut5.I5(this.LLJZ, 1.0f);
        C1473870oSP c1473870oSP = this.LLJLLIL;
        if (c1473870oSP != null) {
            C786410Ut5.Q5(c1473870oSP, 0.0f);
        }
        LJJIIJZLJL(Boolean.FALSE);
        if (z) {
            this.LLLLII = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLJ(boolean z) {
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        C1773330wFP data;
        boolean z2 = true;
        if (!this.LLLIIL) {
            if (z) {
                this.LLLJIL = "";
                InterfaceC1775450wIp<C1773330wFP> containerCallback = getContainerCallback();
                if (containerCallback != null && (data = containerCallback.getData()) != null) {
                    c1775190wIP = data.LJII;
                } else {
                    c1775190wIP = null;
                }
                if (c1775190wIP != null && (c1775180wIO = c1775190wIP.LIZIZ) != null && Intrinsics.LJFF("card_exposure", "card_exposure")) {
                    c1775180wIO.LJIILL++;
                }
                LJJI(this, "card_exposure");
                C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775200wIQ(this, EnumC1775210wIR.EXPOSURE, null));
            }
        } else if (z) {
            C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775200wIQ(this, EnumC1775210wIR.EXPOSURE, null));
        }
        if (this.LLLIIL == z) {
            z2 = false;
        }
        this.LLLIIL = z;
        return z2;
    }

    @Override // X.C1767310w5h, X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Double d;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayCompleted: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJIII("onPlayCompleted");
        if (LJIIZILJ(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJIIL("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(completeCount))));
            C1766660w4e.LIZ.getClass();
            if (!C1766660w4e.LIZLLL) {
                C1768420w7U c1768420w7U = this.LLLILZLLLI;
                if ((c1768420w7U == null || c1768420w7U.LIZJ != 1) && !this.LLJIJIL) {
                    C786410Ut5.I5(this.LLJZ, 1.0f);
                    C1473870oSP c1473870oSP = this.LLJLLIL;
                    if (c1473870oSP != null) {
                        C786410Ut5.Q5(c1473870oSP, 0.0f);
                    }
                    LJIIJ();
                    C0N0Y player = getPlayer();
                    if (player != null) {
                        player.seek(0.0f);
                    }
                    this.LLLIIIL = true;
                    LJJIIZ("play_over");
                    LJJ("play_over");
                    LJJIIJ(false);
                    C2272921Dxq playService = getPlayService();
                    if (playService != null) {
                        playService.LJIIJJI(false, false);
                    }
                }
                C21281818Qe timeView = getTimeView();
                if (timeView != null && timeView.LLJILJIL && (d = this.LLLFFI) != null) {
                    LJJIFFI((long) d.doubleValue());
                }
            }
        }
    }

    @Override // X.C1767310w5h, X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayFailed: ");
        sbLIZ.append(c1481290oeN);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPlayFailed  ");
        sbLIZ2.append(c1481290oeN);
        LJJIII(C2188811AlT.LIZIZ(sbLIZ2));
        super.onPlayFailed(c1481290oeN);
        if (LJIIZILJ(c1481290oeN.LIZ)) {
            this.LLLJ = false;
            LJJIIJZLJL(null);
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775310wIb("card_play_error", this, Integer.valueOf(c1481290oeN.LJ), c1481290oeN.toString(), null), 3);
        }
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaying: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJIII("onPlaying");
        C1766660w4e.LIZ.getClass();
        C1766660w4e.LJFF = false;
        super.onPlaying(str);
        if (LJIIZILJ(str)) {
            this.LLLJ = false;
            LJJIIJ(true);
            LJJIIJZLJL(null);
            LJJI(this, "card_play_success");
        }
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZ("MMKVideo", "onRenderFirstFrame");
        LJJIII("onRenderFirstFrame");
        setManuallyPaused(false);
        super.onRenderFirstFrame(c1480420ocy);
    }

    public final void setDuration(Double d) {
        this.LLLFFI = d;
    }

    public final void setEnterFrom(String str) {
        this.LLLLIIIILLL = str;
    }

    @Override // X.InterfaceC2272941Dxs
    public void setPlayEnd(boolean z) {
        this.LLLIIIL = z;
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public void setPoster(String str) {
        if (!Intrinsics.LJFF(this.LLJILJIL, str)) {
            this.LLJZ.setTag(null);
            C786410Ut5.I5(this.LLJZ, 0.0f);
            C1473870oSP c1473870oSP = this.LLJLLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 0.0f);
            }
        }
        super.setPoster(str);
    }

    @Override // X.C1767310w5h
    public void setScene(String str) {
        this.LLLLIILLL = str;
    }

    @Override // X.C1767310w5h, X.AbstractC21340218fI
    public void setSinglePlayerScene(String str) {
        String scene = getScene();
        if (scene == null) {
            scene = "tt_shop_mall";
        }
        super.setSinglePlayerScene(scene);
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public void setSrc(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSrc: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZIZ();
        if (!Intrinsics.LJFF(getSrc(), str)) {
            this.LLLIIIIL = false;
            this.LLLIIII = false;
            this.LLLIIIL = false;
            this.LLLIIL = false;
            this.LLLIILIL = null;
            this.LLLJ = false;
        }
        super.setSrc(str);
        this.LLLJL = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    public final void setVodSceneTag(String str) {
        this.LLLLIILL = str;
    }

    public final void setVodTag(String str) {
        this.LLLLIIL = str;
    }

    public C1775300wIa(Context context, s sVar) {
        super(context, null, 0);
        this.LLLFF = sVar;
        this.LLLJIL = "";
        this.LLLLIILLL = "tt_shop_mall";
        this.LLLLILI = "__unknow__";
        this.LLLLJ = "__unknow__";
        this.LLLLJI = "__unknow__";
    }

    public static void LJJI(C1775300wIa c1775300wIa, String str) {
        c1775300wIa.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1775310wIb(str, c1775300wIa, null, null, null), 3);
    }

    @Override // X.C14TT
    public final void LJIIJJI(RemoteImageView remoteImageView, String str) {
        Size size;
        remoteImageView.LIZ();
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.SHOP_MALL_VIDEO_CARD;
        C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
        String value = enumC1769850w9n.getValue();
        if (C314740CVk.LIZ.enableLynxForceResize) {
            size = (Size) C20160313uT.LIZIZ().get(value);
        } else {
            size = null;
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        if (size != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            c1331670kl3LIZLLL.LJIIIIZZ = width;
            c1331670kl3LIZLLL.LJIIIZ = height;
        }
        c1331670kl3LIZLLL.LJJI(remoteImageView);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPausePlay: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJIII("onPausePlay");
        C583620Mum.LJIJ(this, str, c1480430ocz);
        if (LJIIZILJ(str)) {
            Double d = this.LLLFFI;
            if (d != null) {
                LJJIFFI((long) d.doubleValue());
            }
            LJJIIJ(false);
            LJJIIJZLJL(null);
        }
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        if (LJIIZILJ(str)) {
            this.LLLIL = str;
        }
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        int iValueOf;
        C583620Mum.LJJIIZ(this, str, j, j2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayProgressChange ");
        sbLIZ.append(j);
        LJJIII(C2188811AlT.LIZIZ(sbLIZ));
        if (LJIIZILJ(str)) {
            if (!this.LLLIIII) {
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onPlayProgressChange error!!! allowPlay=false, sourceId:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(this);
                C2188811AlT.LIZIZ(sbLIZ2);
                c599820Nfo.getClass();
                C599820Nfo.LIZIZ();
            }
            C21281818Qe timeView = getTimeView();
            int i = 0;
            if (timeView != null && timeView.LLJILJIL) {
                if (this.LLLILZ == null) {
                    try {
                        iValueOf = Integer.valueOf((int) (j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        iValueOf = 0;
                    }
                    this.LLLILZ = iValueOf;
                }
                long j3 = 0;
                if (j > 0) {
                    long j4 = j2 - j;
                    if (j4 >= 0) {
                        j3 = j4;
                    }
                    try {
                        i = (int) (j3 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    Integer num = this.LLLILZ;
                    if (num != null && Math.abs(i - num.intValue()) >= 1) {
                        Integer numValueOf = Integer.valueOf(i);
                        this.LLLILZ = numValueOf;
                        if (numValueOf != null) {
                            LJJIFFI(((long) numValueOf.intValue()) * 1000);
                        }
                    }
                }
            }
            LJJIJ();
        }
    }
}
