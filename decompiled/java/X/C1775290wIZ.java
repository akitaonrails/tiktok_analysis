package X;

import Y.ARunnableS0S0100010_26;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS19S0200100_26;
import Y.ARunnableS45S0110000_26;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcFeedMediaPlayerStrategyModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775290wIZ extends C1766640w4c implements InterfaceC2272941Dxs {
    public static final boolean LLLLIL;
    public final ViewGroup LLLFF;
    public C1775280wIY LLLFFI;
    public Double LLLFZ;
    public volatile boolean LLLI;
    public volatile boolean LLLII;
    public volatile boolean LLLIIII;
    public volatile boolean LLLIIIIL;
    public Long LLLIIIL;
    public String LLLIIL;
    public Integer LLLIILIL;
    public Boolean LLLIL;
    public boolean LLLILZ;
    public String LLLILZJ;
    public Long LLLILZLLLI;
    public Long LLLIZZ;
    public Long LLLJ;
    public String LLLJIL;
    public String LLLJL;
    public String LLLL;
    public String LLLLII;
    public TextView LLLLIIIILLL;
    public String LLLLIIL;
    public String LLLLIILL;
    public String LLLLIILLL;

    @Override // X.C1766640w4c, X.C14TU
    public final void LJIILIIL() {
        this.LLLI = false;
        if (C1832807Fu.LIZ()) {
            this.LLLII = true;
        }
        super.LJIILIIL();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLIL) {
            LJIJJLI("release");
        }
        this.LLLIIII = false;
        InterfaceC1775460wIq playService = getPlayService();
        if (playService != null) {
            playService.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLLL() {
        return "video";
    }

    @Override // X.InterfaceC2272941Dxs
    public C1775290wIZ getItemView() {
        return this;
    }

    @Override // X.C1766640w4c, X.C14TU, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void LIZLLL() {
        if (this.LLLI) {
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZ("MMKVideo", "clearEnvironment...");
            super.LIZLLL();
            this.LLLII = true;
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
        if (LLLLIL) {
            LJIJJLI("playMedia");
        }
        this.LLLI = true;
        LIZ(null);
    }

    @Override // X.InterfaceC2272941Dxs
    public final String LLLLLJLJLL() {
        String str = this.LLLIIL;
        return str == null ? getOrigSourceId() : str;
    }

    @Override // X.InterfaceC2272941Dxs
    public C1768420w7U getConfig() {
        C1775280wIY c1775280wIY = this.LLLFFI;
        if (c1775280wIY != null) {
            c1775280wIY.LIZLLL(null);
        }
        C1775280wIY c1775280wIY2 = this.LLLFFI;
        if (c1775280wIY2 != null) {
            return c1775280wIY2.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC2272941Dxs
    public InterfaceC1775450wIp<?> getContainerCallback() {
        AbstractC1775220wIS abstractC1775220wIS;
        C1775280wIY c1775280wIY = this.LLLFFI;
        if (c1775280wIY == null || (abstractC1775220wIS = c1775280wIY.LIZ) == null) {
            return null;
        }
        return abstractC1775220wIS.LIZLLL;
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void pause() {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause: ");
        sbLIZ.append(getSrc());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLIL) {
            LJIJJLI("pause");
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
            LLLLIL = Keva.getRepo("ecom_keva_store").getBoolean("_debug_mix_mall_live_video_debug_view", false);
        }
    }

    @Override // X.C1766640w4c, X.C14TU
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        Double d = this.LLLFZ;
        if (d != null) {
            HandlerHook.viewPost(this, new ARunnableS0S0100010_26(this, d.doubleValue(), 1));
        }
    }

    @Override // X.C14TU
    public final boolean LJIILLIIL() {
        Integer num = C1771440wCM.LIZLLL().videoOpt;
        return num != null && num.intValue() == 1;
    }

    public final void LJJ() {
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
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLLIL) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger:");
            sbLIZ.append(this.LLLLIILL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append("\n");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status:");
            sbLIZ2.append(this.LLLLIIL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            sb.append("\n");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ratio:");
            sbLIZ3.append(this.LLLLIILLL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append("\n");
            TextView textView = this.LLLLIIIILLL;
            if (textView != null) {
                textView.setText(sb.toString());
            }
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLLL() {
        return LJIJ();
    }

    @Override // X.InterfaceC2272941Dxs
    public String getMediaSrc() {
        return getSrc();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1775460wIq getPlayService() {
        /*
            r10 = this;
            X.0w7U r3 = r10.getConfig()
            r6 = 1
            r2 = 0
            if (r3 == 0) goto L16
            int r0 = r3.LIZ
            if (r0 == r6) goto L16
            r1 = 1
        Ld:
            r0 = 0
            if (r1 == 0) goto L18
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L16:
            r1 = 0
            goto Ld
        L18:
            if (r3 == 0) goto La5
            int r1 = r3.LIZLLL
            if (r1 != r6) goto L7d
            java.lang.Boolean r1 = r10.LLLIL
            if (r1 != 0) goto L57
            boolean r1 = X.C034S.LIZ()
            if (r1 == 0) goto L6b
            X.04Zw r1 = X.C1120604Zw.LIZ
            r1.LIZ()
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService r2 = com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(r2)
            if (r2 == 0) goto L69
            r9 = 1
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService> r1 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService.class
            java.lang.String r7 = r1.getName()
            if (r2 == 0) goto L67
            java.lang.Class r1 = r2.getClass()
            java.lang.String r8 = r1.getName()
        L48:
            X.C1AQS.LIZJ(r4, r6, r7, r8, r9)
        L4b:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService) r2
            boolean r1 = r2.isLogin()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.LLLIL = r1
        L57:
            java.lang.Boolean r2 = r10.LLLIL
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto L7b
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L67:
            r8 = r0
            goto L48
        L69:
            r9 = 0
            goto L38
        L6b:
            X.04Zw r1 = X.C1120604Zw.LIZ
            r1.LIZ()
            X.04aq r2 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService> r1 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService.class
            X.0317 r2 = r2.LIZLLL(r1)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r2
            goto L4b
        L7b:
            if (r3 == 0) goto La5
        L7d:
            boolean r1 = r3.LIZIZ()
            if (r1 != 0) goto L89
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L89:
            android.content.Context r1 = r10.getContext()
            boolean r1 = r3.LIZLLL(r1)
            if (r1 != 0) goto L99
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        L99:
            boolean r1 = r3.LIZJ()
            if (r1 != 0) goto La5
            X.0Nfo r1 = X.C599820Nfo.LIZ
            X.C599820Nfo.LJ(r1)
            return r0
        La5:
            X.0wIY r1 = r10.LLLFFI
            if (r1 == 0) goto Laf
            X.0wIS r1 = r1.LIZ
            if (r1 == 0) goto Laf
            X.0wDv r0 = r1.LIZJ
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1775290wIZ.getPlayService():X.0wIq");
    }

    @Override // X.C14TU
    public String getVideoEnterFrom() {
        if (C07B7.LIZ()) {
            return this.LLLJIL;
        }
        return null;
    }

    @Override // X.C14TU
    public Map<String, String> getVideoSceneTag() {
        if (!C07B7.LIZ() || !C770702zh.LIZIZ(this.LLLL)) {
            return null;
        }
        Pair[] pairArr = new Pair[1];
        String str = this.LLLL;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("gec", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.C14TU
    public String getVideoTag() {
        if (C07B7.LIZ()) {
            return this.LLLJL;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0wIk] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1775220wIS abstractC1775220wIS;
        super.onAttachedToWindow();
        C1775280wIY c1775280wIY = this.LLLFFI;
        if (c1775280wIY != null && (abstractC1775220wIS = c1775280wIY.LIZ) != null) {
            abstractC1775220wIS.LJFF = true;
        }
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
        if (LLLLIL) {
            LJIJJLI("onAttachedToWindow");
        }
        if (this.LLLFFI == null) {
            ViewGroup viewGroup = this.LLLFF;
            if (viewGroup == null) {
                viewGroup = this;
            }
            this.LLLFFI = new C1775280wIY(viewGroup, new InterfaceC1775430wIn() { // from class: X.0wIk
                @Override // X.InterfaceC1775430wIn
                public final Double K2() {
                    return this.LIZ.LLLFZ;
                }

                @Override // X.InterfaceC1775430wIn
                public final Long LLLJL() {
                    return this.LIZ.getCurrentPosition();
                }

                @Override // X.InterfaceC1775430wIn
                public final String LLLL() {
                    if (this.LIZ.LJIJ()) {
                        return EnumC1775410wIl.PLAYING.getStatus();
                    }
                    C1766660w4e.LIZ.getClass();
                    return C1766660w4e.LJFF ? EnumC1775410wIl.INIT.getStatus() : EnumC1775410wIl.STOP.getStatus();
                }

                @Override // X.InterfaceC1775430wIn
                public final Long M2() {
                    return this.LIZ.LLLJ;
                }

                @Override // X.InterfaceC1775430wIn
                public final Long N2() {
                    return this.LIZ.LLLIIIL;
                }

                @Override // X.InterfaceC1775430wIn
                public final Long O2() {
                    return this.LIZ.LLLILZLLLI;
                }

                @Override // X.InterfaceC1775430wIn
                public final Long P2() {
                    return this.LIZ.LLLIZZ;
                }

                @Override // X.InterfaceC1775430wIn
                public final String Q2() {
                    return this.LIZ.LLLILZJ;
                }

                @Override // X.InterfaceC1775430wIn
                public final String R2() {
                    return this.LIZ.getVodSceneTag();
                }

                @Override // X.InterfaceC1775430wIn
                public final String S2() {
                    return this.LIZ.getVodTag();
                }

                @Override // X.InterfaceC1775430wIn
                public final String T2() {
                    return this.LIZ.getSrc();
                }

                @Override // X.InterfaceC1775430wIn
                public final void L2(String str) {
                    this.LIZ.LLLILZJ = str;
                }
            });
        }
        this.LLLIIII = false;
        if (getHeight() == 0) {
            HandlerHook.viewPost(this, new ARunnableS126S0100000_26(this, 44));
            return;
        }
        InterfaceC1775460wIq playService = getPlayService();
        if (playService != null) {
            playService.LJI(this);
        }
    }

    @Override // X.C1766640w4c, X.C14TU, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        if (LLLLIL) {
            LJIJJLI("onDetachedFromWindow");
        }
        LLLLLLIL(false);
        this.LLLIIII = false;
        InterfaceC1775460wIq playService = getPlayService();
        if (playService != null) {
            playService.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLL() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLLLL() {
        return this.LLLIIII;
    }

    public final ViewGroup getContainerView() {
        return this.LLLFF;
    }

    public final String getEnterFrom() {
        return this.LLLJIL;
    }

    @Override // X.InterfaceC2272941Dxs
    public /* bridge */ /* synthetic */ View getItemView() {
        getItemView();
        return this;
    }

    @Override // X.C1766640w4c
    public String getScene() {
        return this.LLLLII;
    }

    public final String getVodSceneTag() {
        return this.LLLL;
    }

    public final String getVodTag() {
        return this.LLLJL;
    }

    @Override // X.C1766640w4c, X.C14TU, X.InterfaceC20270014Ta
    public final void LIZ(Function0<Unit> function0) {
        IECommerceHostService iECommerceHostService;
        AbstractC1775220wIS abstractC1775220wIS;
        C1775180wIO c1775180wIOLJI;
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
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && LLLLIL) {
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
                this.LLLLIIIILLL = textView;
                addView(textView);
                LJJ();
            }
            LJIJJLI("playReal");
        }
        if (this.LLLI && !TextUtils.isEmpty(getSrc())) {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            this.LLLIIIL = Long.valueOf(System.currentTimeMillis());
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playReal: ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MMKVideo", strLIZIZ);
            if (!this.LLLII) {
                LIZLLL();
            }
            C0N0Y videoPlayer = getVideoPlayer();
            if (videoPlayer != null) {
                videoPlayer.seek(0.0f);
            }
            super.LIZ(function0);
            if (!this.LLLILZ) {
                C1775280wIY c1775280wIY = this.LLLFFI;
                if (c1775280wIY != null && (abstractC1775220wIS = c1775280wIY.LIZ) != null && (c1775180wIOLJI = abstractC1775220wIS.LJI()) != null) {
                    c1775180wIOLJI.LJIILJJIL++;
                    c1775180wIOLJI.LJIJ = 0L;
                    c1775180wIOLJI.LJIJI = 0;
                    c1775180wIOLJI.LJIJJ = abstractC1775220wIS.LJII().LLLL();
                }
                C1775280wIY c1775280wIY2 = this.LLLFFI;
                if (c1775280wIY2 != null) {
                    c1775280wIY2.LIZIZ("play");
                }
                C1775280wIY c1775280wIY3 = this.LLLFFI;
                if (c1775280wIY3 != null) {
                    c1775280wIY3.LJ(null, "card_emit_play", null);
                }
                this.LLLILZ = true;
                C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775350wIf(this, null));
            }
            this.LLLIZZ = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime3);
            return;
        }
        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("playReal skip: allowPlay: ");
        sbLIZ2.append(this.LLLI);
        sbLIZ2.append(", src: ");
        sbLIZ2.append(getSrc());
        C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo2.getClass();
        C599820Nfo.LIZLLL();
    }

    @Override // X.C1766640w4c, X.C14TU
    public final Aweme LJIIIZ(String str) {
        return (Aweme) LJIJI(str);
    }

    public final void LJIJJLI(String str) {
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
            this.LLLLIILL = str;
            LJJ();
        }
    }

    public final void LJIL(long j) {
        C21281718Qd c21281718QdLIZJ;
        C1775280wIY c1775280wIY;
        C21281718Qd c21281718QdLIZJ2;
        C1775280wIY c1775280wIY2 = this.LLLFFI;
        if (c1775280wIY2 != null && (c21281718QdLIZJ = c1775280wIY2.LIZJ()) != null && c21281718QdLIZJ.LLJIJIL && (c1775280wIY = this.LLLFFI) != null && (c21281718QdLIZJ2 = c1775280wIY.LIZJ()) != null) {
            HandlerHook.viewPost(c21281718QdLIZJ2, new ARunnableS19S0200100_26(c21281718QdLIZJ2, this, j, 1));
        }
    }

    public final void LJJI(String str) {
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
            this.LLLLIIL = str;
            LJJ();
        }
    }

    public final void LJJIFFI(boolean z) {
        C21281718Qd c21281718QdLIZJ;
        C1775280wIY c1775280wIY = this.LLLFFI;
        if (c1775280wIY != null && (c21281718QdLIZJ = c1775280wIY.LIZJ()) != null) {
            HandlerHook.viewPost(c21281718QdLIZJ, new ARunnableS45S0110000_26(c21281718QdLIZJ, z, 1));
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLF(String str) {
        return LJIILL(str);
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLJIL(float f) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (LLLLIL) {
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
                this.LLLLIILLL = String.valueOf(f);
            }
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final void LLLLLLIL(boolean z) {
        AbstractC1775220wIS abstractC1775220wIS;
        C1775180wIO c1775180wIOLJI;
        long jLongValue;
        int i;
        long jDoubleValue;
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
        if (LLLLIL) {
            LJIJJLI("pauseMedia");
        }
        if (this.LLLI) {
            this.LLLI = false;
            if (!this.LLLIIII) {
                C1775280wIY c1775280wIY = this.LLLFFI;
                if (c1775280wIY != null && (abstractC1775220wIS = c1775280wIY.LIZ) != null && (c1775180wIOLJI = abstractC1775220wIS.LJI()) != null) {
                    c1775180wIOLJI.LJIILLIIL++;
                    Long lLLLJL = abstractC1775220wIS.LJII().LLLJL();
                    if (lLLLJL != null) {
                        jLongValue = lLLLJL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    c1775180wIOLJI.LJIJ = jLongValue;
                    int i2 = 100;
                    long j = jLongValue * ((long) 100);
                    try {
                        Double dK2 = abstractC1775220wIS.LJII().K2();
                        if (dK2 != null) {
                            jDoubleValue = (long) dK2.doubleValue();
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
                    c1775180wIOLJI.LJIJI = i2;
                    c1775180wIOLJI.LJIJJ = abstractC1775220wIS.LJII().LLLL();
                }
                C1775280wIY c1775280wIY2 = this.LLLFFI;
                if (c1775280wIY2 != null) {
                    c1775280wIY2.LIZIZ("play_break");
                }
                C1775280wIY c1775280wIY3 = this.LLLFFI;
                if (c1775280wIY3 != null) {
                    c1775280wIY3.LJ(null, "card_emit_stop", null);
                }
            }
        }
        if (z) {
            pause();
        }
        Double d = this.LLLFZ;
        if (d != null) {
            LJIL((long) d.doubleValue());
            LJJIFFI(false);
        }
        C786410Ut5.I5(this.LLJLL, 1.0f);
        C1473870oSP c1473870oSP = this.LLJLIL;
        if (c1473870oSP != null) {
            C786410Ut5.Q5(c1473870oSP, 0.0f);
        }
        C1775280wIY c1775280wIY4 = this.LLLFFI;
        if (c1775280wIY4 != null) {
            c1775280wIY4.LIZLLL(Boolean.FALSE);
        }
        if (z) {
            this.LLLJ = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
    }

    @Override // X.InterfaceC2272941Dxs
    public final boolean LLLLLLJ(boolean z) {
        AbstractC1775220wIS abstractC1775220wIS;
        C1775180wIO c1775180wIOLJI;
        boolean z2 = true;
        if (!this.LLLIIIIL) {
            if (z) {
                this.LLLILZJ = "";
                C1775280wIY c1775280wIY = this.LLLFFI;
                if (c1775280wIY != null && (abstractC1775220wIS = c1775280wIY.LIZ) != null && (c1775180wIOLJI = abstractC1775220wIS.LJI()) != null && Intrinsics.LJFF("card_exposure", "card_exposure")) {
                    c1775180wIOLJI.LJIILL++;
                }
                C1775280wIY c1775280wIY2 = this.LLLFFI;
                if (c1775280wIY2 != null) {
                    c1775280wIY2.LJ(null, "card_exposure", null);
                }
                C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775360wIg(this, null));
            }
        } else if (z) {
            C948503nH.LIZLLL(this, C2126308Ur.LIZ, new C1775360wIg(this, null));
        }
        if (this.LLLIIIIL == z) {
            z2 = false;
        }
        this.LLLIIIIL = z;
        return z2;
    }

    @Override // X.C1766640w4c, X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C21281718Qd c21281718QdLIZJ;
        Double d;
        AbstractC1775220wIS abstractC1775220wIS;
        C1775180wIO c1775180wIOLJI;
        long jDoubleValue;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayCompleted: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJI("onPlayCompleted");
        if (LJIILL(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJII("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(completeCount))));
            C1766660w4e.LIZ.getClass();
            if (!C1766660w4e.LIZLLL) {
                if (!this.LLJI) {
                    C786410Ut5.I5(this.LLJLL, 1.0f);
                    C1473870oSP c1473870oSP = this.LLJLIL;
                    if (c1473870oSP != null) {
                        C786410Ut5.Q5(c1473870oSP, 0.0f);
                    }
                    LJFF();
                    C0N0Y videoPlayer = getVideoPlayer();
                    if (videoPlayer != null) {
                        videoPlayer.seek(0.0f);
                    }
                    this.LLLIIII = true;
                    C1775280wIY c1775280wIY = this.LLLFFI;
                    if (c1775280wIY != null && (abstractC1775220wIS = c1775280wIY.LIZ) != null && (c1775180wIOLJI = abstractC1775220wIS.LJI()) != null) {
                        c1775180wIOLJI.LJIIZILJ++;
                        Double dK2 = abstractC1775220wIS.LJII().K2();
                        if (dK2 != null) {
                            jDoubleValue = (long) dK2.doubleValue();
                        } else {
                            jDoubleValue = 0;
                        }
                        c1775180wIOLJI.LJIJ = jDoubleValue;
                        c1775180wIOLJI.LJIJI = 100;
                        c1775180wIOLJI.LJIJJ = abstractC1775220wIS.LJII().LLLL();
                    }
                    C1775280wIY c1775280wIY2 = this.LLLFFI;
                    if (c1775280wIY2 != null) {
                        c1775280wIY2.LIZIZ("play_over");
                    }
                    LJJIFFI(false);
                    InterfaceC1775460wIq playService = getPlayService();
                    if (playService != null) {
                        playService.LJIIJJI(false, false);
                    }
                }
                C1775280wIY c1775280wIY3 = this.LLLFFI;
                if (c1775280wIY3 != null && (c21281718QdLIZJ = c1775280wIY3.LIZJ()) != null && c21281718QdLIZJ.LLJIJIL && (d = this.LLLFZ) != null) {
                    LJIL((long) d.doubleValue());
                }
            }
        }
    }

    @Override // X.C1766640w4c, X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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
        LJJI(C2188811AlT.LIZIZ(sbLIZ2));
        super.onPlayFailed(c1481290oeN);
        if (LJIILL(c1481290oeN.LIZ)) {
            this.LLLILZ = false;
            C1775280wIY c1775280wIY = this.LLLFFI;
            if (c1775280wIY != null) {
                c1775280wIY.LIZLLL(null);
            }
            C1775280wIY c1775280wIY2 = this.LLLFFI;
            if (c1775280wIY2 != null) {
                c1775280wIY2.LJ(Integer.valueOf(c1481290oeN.LJ), "card_play_error", c1481290oeN.toString());
            }
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaying: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJI("onPlaying");
        C1766660w4e.LIZ.getClass();
        C1766660w4e.LJFF = false;
        super.onPlaying(str);
        if (LJIILL(str)) {
            this.LLLILZ = false;
            LJJIFFI(true);
            C1775280wIY c1775280wIY = this.LLLFFI;
            if (c1775280wIY != null) {
                c1775280wIY.LIZLLL(null);
            }
            C1775280wIY c1775280wIY2 = this.LLLFFI;
            if (c1775280wIY2 != null) {
                c1775280wIY2.LJ(null, "card_play_success", null);
            }
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C599820Nfo.LIZ.getClass();
        C599820Nfo.LIZ("MMKVideo", "onRenderFirstFrame");
        LJJI("onRenderFirstFrame");
        setManuallyPaused(false);
        super.onRenderFirstFrame(c1480420ocy);
    }

    public final void setDuration(Double d) {
        this.LLLFZ = d;
    }

    public final void setEnterFrom(String str) {
        this.LLLJIL = str;
    }

    @Override // X.InterfaceC2272941Dxs
    public void setPlayEnd(boolean z) {
        this.LLLIIII = z;
    }

    @Override // X.C14TU
    public void setPoster(String str) {
        if (!Intrinsics.LJFF(this.LLJIJIL, str)) {
            this.LLJLL.setTag(null);
            C786410Ut5.I5(this.LLJLL, 0.0f);
            C1473870oSP c1473870oSP = this.LLJLIL;
            if (c1473870oSP != null) {
                C786410Ut5.Q5(c1473870oSP, 0.0f);
            }
        }
        super.setPoster(str);
    }

    @Override // X.C1766640w4c
    public void setScene(String str) {
        this.LLLLII = str;
    }

    @Override // X.C1766640w4c, X.C14TU
    public void setSinglePlayerScene(String str) {
        String scene = getScene();
        if (scene == null) {
            scene = "tt_shop_mall";
        }
        super.setSinglePlayerScene(scene);
    }

    @Override // X.C14TU
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
            this.LLLII = false;
            this.LLLI = false;
            this.LLLIIII = false;
            this.LLLIIIIL = false;
            this.LLLIIIL = null;
            this.LLLILZ = false;
        }
        super.setSrc(str);
        this.LLLILZLLLI = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    public final void setVodSceneTag(String str) {
        this.LLLL = str;
    }

    public final void setVodTag(String str) {
        this.LLLJL = str;
    }

    @Override // X.C14TU
    public final void LJI(RemoteImageView remoteImageView, String str) {
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

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPausePlay: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("MMKVideo", strLIZIZ);
        LJJI("onPausePlay");
        C583620Mum.LJIJ(this, str, c1480430ocz);
        if (LJIILL(str)) {
            Double d = this.LLLFZ;
            if (d != null) {
                LJIL((long) d.doubleValue());
            }
            LJJIFFI(false);
            C1775280wIY c1775280wIY = this.LLLFFI;
            if (c1775280wIY != null) {
                c1775280wIY.LIZLLL(null);
            }
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
        if (LJIILL(str)) {
            this.LLLIIL = str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1775290wIZ(Context context, LynxView lynxView, int i) {
        int i2 = 8;
        AttributeSet attributeSet = null;
        lynxView = (i & 8) != 0 ? null : lynxView;
        super(0, i2, context, attributeSet);
        this.LLLFF = lynxView;
        this.LLLILZJ = "";
        this.LLLLII = "tt_shop_mall";
        this.LLLLIIL = "__unknow__";
        this.LLLLIILL = "__unknow__";
        this.LLLLIILLL = "__unknow__";
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        AbstractC1775220wIS abstractC1775220wIS;
        C21281718Qd c21281718QdLIZJ;
        int iValueOf;
        C583620Mum.LJJIIZ(this, str, j, j2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayProgressChange ");
        sbLIZ.append(j);
        LJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (LJIILL(str)) {
            if (!this.LLLI) {
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
            C1775280wIY c1775280wIY = this.LLLFFI;
            int i = 0;
            if (c1775280wIY != null && (c21281718QdLIZJ = c1775280wIY.LIZJ()) != null && c21281718QdLIZJ.LLJIJIL) {
                if (this.LLLIILIL == null) {
                    try {
                        iValueOf = Integer.valueOf((int) (j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        iValueOf = 0;
                    }
                    this.LLLIILIL = iValueOf;
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
                    Integer num = this.LLLIILIL;
                    if (num != null && Math.abs(i - num.intValue()) >= 1) {
                        Integer numValueOf = Integer.valueOf(i);
                        this.LLLIILIL = numValueOf;
                        if (numValueOf != null) {
                            LJIL(((long) numValueOf.intValue()) * 1000);
                        }
                    }
                }
            }
            C1775280wIY c1775280wIY2 = this.LLLFFI;
            if (c1775280wIY2 != null && (abstractC1775220wIS = c1775280wIY2.LIZ) != null) {
                abstractC1775220wIS.LJIIIZ();
            }
        }
    }
}
