package X;

import Y.ACListenerS145S0100000_10;
import Y.ACListenerS77S0300000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS78S0200000_9;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lcp.SearchLcpExperiment;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;
import com.ss.android.ugc.aweme.search.performance.core.config.UserHorizontalVideoPreloadConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS27S0000100_9;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C658280Pru extends AbstractViewOnAttachStateChangeListenerC654600Ply implements InterfaceC648270Pbl, InterfaceC658400Ps6 {
    public static boolean LLLII;
    public final C585710My9 LLIZ;
    public final InterfaceC656470Poz LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C658370Ps3 LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public FrameLayout LLJILLL;
    public C0GZM LLJJ;
    public TextView LLJJI;
    public C661470Px3 LLJJIII;
    public C12P4 LLJJIJI;
    public ConstraintLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public int LLJJJ;
    public Aweme LLJJJIL;
    public InterfaceC1631630sYr<? super View, ? super Integer, ? super Aweme, ? super Boolean, Unit> LLJJJJ;
    public C1012300cRw LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C658340Ps0 LLJZIJLIL;
    public final C584660MwS LLL;
    public final C658290Prv LLLF;
    public final C0N76 LLLFF;
    public SearchRefreshPredictMobCanShowVM LLLFFI;
    public boolean LLLFZ;
    public static final C658370Ps3 LLLI = new C658370Ps3(C653580PkK.LIZJ);
    public static int LLLIIII = -1;
    public static int LLLIIIIL = -1;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        C661470Px3 c661470Px3 = this.LLJJIII;
        if (c661470Px3 != null) {
            c661470Px3.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C661470Px3 c661470Px3 = this.LLJJIII;
        return c661470Px3 != null && c661470Px3.isPlaying();
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        C661470Px3 c661470Px3 = this.LLJJIII;
        boolean z = false;
        if (c661470Px3 != null && c661470Px3.z3().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final boolean U5() {
        Aweme aweme;
        Video video;
        UrlModel animatedCover;
        List<String> urlList;
        return (!C293050BeB.LIZ() || (aweme = this.LLJJJIL) == null || (video = aweme.getVideo()) == null || (animatedCover = video.getAnimatedCover()) == null || (urlList = animatedCover.getUrlList()) == null || !(urlList.isEmpty() ^ true)) ? false : true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        if (!U5()) {
            C661470Px3 c661470Px3 = this.LLJJIII;
            if (c661470Px3 != null) {
                c661470Px3.LJIIJ();
            }
            ((C659400Pti) this.LLJZ.getValue()).UC(1);
            return;
        }
        C0GZM c0gzm = this.LLJJ;
        if (c0gzm == null) {
            c0gzm = null;
        }
        c0gzm.LJII();
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (U5()) {
            C0GZM c0gzm = this.LLJJ;
            (c0gzm != null ? c0gzm : null).LJI();
            this.LLJJLIIIJLLLLLLLZ = true;
            return;
        }
        if (C1839307Ih.LIZ() != 0 && l3().LIZJ == 3 && (lifecycleOwner = ViewTreeLifecycleOwner.get(this.itemView)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C2129608Vy(null), 3);
        }
        C661470Px3 c661470Px3 = this.LLJJIII;
        if (c661470Px3 != null) {
            c661470Px3.LJIIJJI();
        }
    }

    public void X5() {
        C661470Px3 c661470Px3;
        if (!C658210Prn.LIZ() || (c661470Px3 = this.LLJJIII) == null) {
            return;
        }
        c661470Px3.LJIIIZ();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return this.LLLF;
    }

    @Override // X.InterfaceC658400Ps6
    public final void A5(final InterfaceC641090PCp interfaceC641090PCp) {
        InterfaceC641090PCp interfaceC641090PCp2 = new InterfaceC641090PCp() { // from class: X.0PCh
            @Override // X.InterfaceC641090PCp
            public final Fragment LIZ() {
                return interfaceC641090PCp.LIZ();
            }

            @Override // X.InterfaceC641090PCp
            public final Context getContext() {
                return interfaceC641090PCp.getContext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
            @Override // X.InterfaceC641090PCp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String getIdentifier() {
                /*
                    r6 = this;
                    com.ss.android.ugc.aweme.search.common.utils.SAFHelper r5 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
                    X.0Pru r0 = r6.LIZ
                    android.view.View r4 = r0.itemView
                    android.content.Context r0 = r4.getContext()
                    X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
                    r3 = 0
                    if (r0 == 0) goto L3d
                    X.198i r2 = r0.LIZLLL()
                    if (r2 == 0) goto L3d
                L17:
                    X.0Pru r0 = r6.LIZ
                    android.view.View r0 = r0.itemView
                    android.content.Context r0 = r0.getContext()
                    if (r0 == 0) goto L25
                    android.app.Activity r3 = X.C1388190mED.LIZ(r0)
                L25:
                    r5.getClass()
                    java.lang.Integer r2 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJIIJI(r2, r3)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "AladdinAweme_"
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    return r0
                L3d:
                    android.content.Context r0 = r4.getContext()
                    android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    if (r0 == 0) goto L68
                    android.content.Context r0 = r4.getContext()
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L5b
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L68
                L59:
                    r2 = r3
                    goto L17
                L5b:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L59
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L68
                    goto L59
                L68:
                    androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r4)
                    if (r2 == 0) goto L59
                    android.content.Context r0 = r2.getContext()
                    if (r0 == 0) goto L83
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                L78:
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L85
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L94
                    goto L59
                L83:
                    r1 = r3
                    goto L78
                L85:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L59
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L94
                    goto L59
                L92:
                    if (r2 == 0) goto L59
                L94:
                    boolean r0 = r2 instanceof X.InterfaceC214902198i
                    if (r0 == 0) goto L9c
                    X.198i r2 = (X.InterfaceC214902198i) r2
                    goto L17
                L9c:
                    androidx.fragment.app.Fragment r2 = r2.getParentFragment()
                    goto L92
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C641010PCh.getIdentifier():java.lang.String");
            }
        };
        C661470Px3 c661470Px3 = this.LLJJIII;
        if (c661470Px3 != null) {
            c661470Px3.setContainerStatusProvider(interfaceC641090PCp2);
        }
    }

    public final void R5(final Aweme aweme) {
        UrlModel animatedCover;
        List<String> urlList;
        UrlModel cover;
        List<String> urlList2;
        Video video;
        UrlModel cover2;
        List<String> urlList3;
        String str;
        C0GZM c0gzm = null;
        if (!U5()) {
            Video video2 = aweme.getVideo();
            if (C1840907Ix.LIZIZ()) {
                long jLIZ = C1840907Ix.LIZ();
                Video video3 = aweme.getVideo();
                if (video3 != null && (cover = video3.getCover()) != null && (urlList2 = cover.getUrlList()) != null && !urlList2.isEmpty() && (video = aweme.getVideo()) != null && (cover2 = video.getCover()) != null && (urlList3 = cover2.getUrlList()) != null && (str = (String) ListProtector.get(urlList3, 0)) != null && str.length() != 0 && C1322200kVm.LIZ().LJIIJJI(UriProtector.parse(str))) {
                    jLIZ = 0;
                }
                C0GZM c0gzm2 = this.LLJJ;
                if (c0gzm2 != null) {
                    c0gzm = c0gzm2;
                }
                HandlerHook.viewPostDelay(c0gzm, new ARunnableS78S0200000_9(this, video2, 78), jLIZ);
                return;
            }
            V5(video2);
            return;
        }
        InterfaceC589540NAi interfaceC589540NAi = new InterfaceC589540NAi() { // from class: X.0NAh
            @Override // X.InterfaceC589540NAi
            public final void LIZ(boolean z) {
                boolean z2;
                Video video4;
                UrlModel cover3;
                List<String> urlList4;
                String str2;
                UrlModel cover4;
                List<String> urlList5;
                if (!z) {
                    Video video5 = aweme.getVideo();
                    if (C1840907Ix.LIZIZ()) {
                        long jLIZ2 = C1840907Ix.LIZ();
                        Video video6 = aweme.getVideo();
                        if (video6 != null && (cover4 = video6.getCover()) != null && (urlList5 = cover4.getUrlList()) != null && !urlList5.isEmpty()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0GZM c0gzm3 = null;
                        if (z2 && (video4 = aweme.getVideo()) != null && (cover3 = video4.getCover()) != null && (urlList4 = cover3.getUrlList()) != null && (str2 = (String) ListProtector.get(urlList4, 0)) != null && str2.length() != 0 && C1322200kVm.LIZ().LJIIJJI(UriProtector.parse(str2))) {
                            jLIZ2 = 0;
                        }
                        C658280Pru c658280Pru = this;
                        C0GZM c0gzm4 = c658280Pru.LLJJ;
                        if (c0gzm4 != null) {
                            c0gzm3 = c0gzm4;
                        }
                        HandlerHook.viewPostDelay(c0gzm3, new ARunnableS78S0200000_9(c658280Pru, video5, 79), jLIZ2);
                        return;
                    }
                    this.V5(video5);
                }
            }
        };
        Video video4 = aweme.getVideo();
        if (video4 != null && (animatedCover = video4.getAnimatedCover()) != null && (urlList = animatedCover.getUrlList()) != null && (!urlList.isEmpty())) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ((String) ListProtector.get(aweme.getVideo().getAnimatedCover().getUrlList(), 0));
            c1331670kl3LJIIIZ.LIZLLL = false;
            C0GZM c0gzm3 = this.LLJJ;
            if (c0gzm3 != null) {
                c0gzm = c0gzm3;
            }
            c1331670kl3LJIIIZ.LJJ(c0gzm);
            c1331670kl3LJIIIZ.LJIIL(new C638990P4n(this, interfaceC589540NAi, 1));
            return;
        }
        interfaceC589540NAi.LIZ(false);
    }

    public final void S5(View view) {
        int height;
        C12P4 c12p4;
        if (view == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.LLJJIJIIJIL;
        if (constraintLayout != null) {
            height = constraintLayout.getHeight();
        } else {
            height = 0;
        }
        int top = (height - (view.getTop() + view.getPaddingTop())) + C341940Daq.LIZ(20.0d);
        if (top > 0 && top < height && (c12p4 = this.LLJJIJI) != null) {
            c12p4.getLayoutParams().height = top;
            C786410Ut5.LLLLLLZ(c12p4, 0);
        }
    }

    public final void T5(View view) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        TuxIconView tuxIconView;
        this.LLJILJILJ = (TextView) view.findViewById(R.id.user_video_bobc_tag);
        this.LLJILLL = (FrameLayout) view.findViewById(R.id.vqm);
        this.LLJILJIL = (TextView) view.findViewById(R.id.user_video_like_count);
        this.LLJJ = (C0GZM) view.findViewById(R.id.user_video_cover);
        this.LLJJI = (TextView) view.findViewById(R.id.user_video_label);
        C658370Ps3 c658370Ps3 = this.LLJIJIL;
        C0GZM c0gzm = null;
        if (c658370Ps3 == null) {
            c658370Ps3 = null;
        }
        if (c658370Ps3.LIZIZ) {
            this.LLJJIII = (C661470Px3) view.findViewById(R.id.user_video_view);
        }
        this.LLJJIJI = (C12P4) view.findViewById(R.id.user_video_holder_tux_mask);
        this.LLJJIJIIJIL = (ConstraintLayout) view.findViewById(R.id.user_video_container_layout);
        Integer numValueOf = Integer.valueOf(C1913107eT.LJ());
        if (numValueOf.intValue() > 0) {
            int iIntValue4 = numValueOf.intValue();
            ConstraintLayout constraintLayout = this.LLJJIJIIJIL;
            if (constraintLayout != null) {
                C0HXV.LIZIZ((int) C418040GaI.LIZ(iIntValue4), constraintLayout);
            }
        }
        this.LLJJIJIL = view.findViewById(R.id.video_mask_layer);
        C657990PrR.LIZJ(view, new AwS589S0100000_10(this, 544));
        Context context = view.getContext();
        Integer num = (Integer) this.LLJI.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2;
        }
        view.setOutlineProvider(new C663220Pzs((int) C661350Pwr.LIZ(iIntValue, context)));
        view.setClipToOutline(true);
        C658370Ps3 c658370Ps32 = this.LLJIJIL;
        if (c658370Ps32 == null) {
            c658370Ps32 = null;
        }
        if (!c658370Ps32.LIZIZ) {
            C786410Ut5.I7(new ACListenerS145S0100000_10(this, 78), view);
            if (C659070PtB.LIZ(this.LLJJJIL) && (tuxIconView = this.LLJJJJLIIL) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        }
        if (C07P0.LIZIZ()) {
            this.LLJJJJJIL = (C1012300cRw) view.findViewById(R.id.vqk);
        }
        C1012300cRw c1012300cRw = this.LLJJJJJIL;
        if (c1012300cRw != null) {
            C786410Ut5.Ja(c1012300cRw, new ACListenerS145S0100000_10(this, 75));
        }
        C663180Pzo c663180Pzo = C663180Pzo.LIZ;
        C1012300cRw c1012300cRw2 = this.LLJJJJJIL;
        c663180Pzo.getClass();
        C663180Pzo.LIZ(c1012300cRw2);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.ey7);
        this.LLJJJJLIIL = tuxIconView2;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS145S0100000_10(this, 76));
        }
        C661470Px3 c661470Px3 = this.LLJJIII;
        if (c661470Px3 != null) {
            C661350Pwr.LJIIL(c661470Px3);
            c661470Px3.setEnableLifecycleObserver(true);
            c661470Px3.setEnableHideCoverAnim(true);
            C0GZM c0gzm2 = this.LLJJ;
            if (c0gzm2 == null) {
                c0gzm2 = null;
            }
            c661470Px3.setMCoverView(c0gzm2);
            if ((C0C1E.LIZ() & 1) == 1) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bw, c661470Px3.getContext());
                if (numLIZJ != null) {
                    iIntValue3 = numLIZJ.intValue();
                } else {
                    iIntValue3 = -1;
                }
                C0GZM c0gzm3 = this.LLJJ;
                if (c0gzm3 == null) {
                    c0gzm3 = null;
                }
                c0gzm3.setPlaceholderImage(new ColorDrawable(iIntValue3));
            }
            Integer num2 = (Integer) this.LLJI.getValue();
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 4;
            }
            c661470Px3.setOutlineProvider(new C663220Pzs((int) C418040GaI.LIZ(iIntValue2)));
            c661470Px3.setClipToOutline(true);
            AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(c661470Px3, this, 114);
            C658630PsT c658630PsT = new C658630PsT();
            awS376S0200000_10.invoke(c658630PsT);
            c661470Px3.setMScrollStateObserver(c658630PsT);
            C658370Ps3 c658370Ps33 = this.LLJIJIL;
            if (c658370Ps33 == null) {
                c658370Ps33 = null;
            }
            c661470Px3.setMScrollStateManager(c658370Ps33.LIZJ);
            ConstraintLayout constraintLayout2 = this.LLJJIJIIJIL;
            if (constraintLayout2 != null) {
                C786410Ut5.Y7(constraintLayout2, new ACListenerS77S0300000_10((Object) this, (View) c661470Px3, (Map<String, String>) c661470Px3, (View) 12));
            }
            C661490Px5 dataProvider = c661470Px3.getDataProvider();
            if (dataProvider != null) {
                dataProvider.LIZ = this.itemView;
            }
            c661470Px3.setVideoUiListener((AbstractC585420Mxg) this.LLJZ.getValue());
            c661470Px3.LIZLLL((C659400Pti) this.LLJZ.getValue());
            if (this.LLJL) {
                c661470Px3.setVideoLifeCycleListener(this.LLL);
            }
        }
        if ((((SearchResultPictureSrExperiment.SearchSrAbModel) SearchResultPictureSrExperiment.LIZIZ.getValue()).enableAdaptive > 0 || C04WO.LIZ()) && !LLLII) {
            LLLII = true;
            C0GZM c0gzm4 = this.LLJJ;
            if (c0gzm4 != null) {
                c0gzm = c0gzm4;
            }
            HandlerHook.viewPost(c0gzm, new ARunnableS110S0100000_10(this, 157));
        }
    }

    public final void V5(Video video) {
        UrlModel cover;
        C658730Psd c658730Psd;
        int i;
        int i2;
        C0GZM c0gzm = null;
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
        c1331670kl3LJIIIIZZ.LIZLLL("AwemeCardListAdapter");
        C0GZM c0gzm2 = this.LLJJ;
        if (c0gzm2 != null) {
            c0gzm = c0gzm2;
        }
        c1331670kl3LJIIIIZZ.LJJ(c0gzm);
        if (SearchLcpExperiment.LIZIZ()) {
            C658320Pry c658320Pry = new C658320Pry();
            c658320Pry.LIZ = 0;
            c658320Pry.LIZIZ = this.LLJJJIL;
            c658320Pry.LIZJ = 0;
            c658320Pry.LIZLLL = l3().LJIIJ;
            c658320Pry.LJII = new AwS589S0100000_10(this, 533);
            c658730Psd = c658320Pry.LIZ();
        } else {
            c658730Psd = new C658730Psd(this.LLJJJ, this.LLJJJIL, 0, l3().LJIIJ, false, SearchResultPictureSrExperiment.LIZ(), 0, null, false, 960);
        }
        if (this.LLJJJ > 2) {
            c658730Psd.LLJILJIL = "loadmore";
        }
        c1331670kl3LJIIIIZZ.LJJJIL = c658730Psd;
        if ((((Number) C04WL.LIZ.getValue()).intValue() & 1) == 1) {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.IMMEDIATE;
        } else {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        }
        if (C302000Bsc.LIZ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
        }
        C01GW c01gw = SearchResultPictureSrExperiment.LIZIZ;
        if (((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).enableAdaptive > 0) {
            int i3 = LLLIIII;
            if (i3 > 0 && LLLIIIIL > 0 && i3 >= ((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).thresholdWidth && LLLIIIIL >= ((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).thresholdHeight) {
                int i4 = LLLIIII;
                int i5 = LLLIIIIL;
                c1331670kl3LJIIIIZZ.LJJLIIIJLJLI = i4;
                c1331670kl3LJIIIIZZ.LJJLIIIJLLLLLLLZ = i5;
                c1331670kl3LJIIIIZZ.LJJIJIL(new C1331570kkt());
            }
        } else if (SearchResultPictureSrExperiment.LIZ() > 0.0f) {
            c1331670kl3LJIIIIZZ.LJJIJIL((C1331570kkt) C658900Psu.LIZ.getValue());
        }
        if (C04WO.LIZ() && (i = LLLIIII) > 0 && (i2 = LLLIIIIL) > 0) {
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
            c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        }
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }

    public final void W5(EnumC655500PnQ enumC655500PnQ) {
        String aid;
        C661470Px3 c661470Px3;
        InterfaceC661540PxA interfaceC661540PxA;
        C1012300cRw c1012300cRw;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        C653660PkS c653660PkSL3 = l3();
        Aweme aweme = this.LLJJJIL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c653660PkSL3.LJIJJ = aid;
        C655720Pnm c655720Pnm = C655720Pnm.LIZ;
        boolean zLIZIZ = C659080PtC.LIZIZ();
        C653660PkS c653660PkSL32 = l3();
        c655720Pnm.getClass();
        C655720Pnm.LIZ(zLIZIZ, c653660PkSL32, null);
        C661470Px3 c661470Px32 = this.LLJJIII;
        if (c661470Px32 != null) {
            c661470Px32.setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, this.LLJJJIL));
        }
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        C659080PtC.LJFF();
        int i2 = C659080PtC.LIZIZ;
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        if (enumC1012120cReLIZ != null && (c1012300cRw = this.LLJJJJJIL) != null) {
            c1012300cRw.LIZ(enumC1012120cReLIZ, false);
        }
        C659060PtA.LIZLLL(C659060PtA.LIZ, this.LLJJJIL, this.LLJJJJJIL, this.LLJJJJLIIL, l3(), null, 16);
        if (C663180Pzo.LJI() && C301290BrT.LIZIZ() && i == 0 && (c661470Px3 = this.LLJJIII) != null && (interfaceC661540PxA = c661470Px3.LLJ) != null) {
            interfaceC661540PxA.LIZ();
        }
        Aweme aweme2 = this.LLJJJIL;
        if (aweme2 != null) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            String aid2 = aweme2.getAid();
            c663180Pzo.getClass();
            C663180Pzo.LJII(i, aid2);
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onViewAttachedToWindow(view);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19egL5 = L5();
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egL5);
        C0GZM c0gzm = null;
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLJZIJLIL);
        }
        C036E.LIZ.LIZ(this.LLLFF);
        if (C0PPZ.LIZ() && this.LLLFFI == null) {
            this.LLLFFI = C0P72.LIZ(C946803n0.LIZ(this.itemView));
        }
        this.LLLFZ = true;
        if (U5()) {
            C0GZM c0gzm2 = this.LLJJ;
            if (c0gzm2 != null) {
                c0gzm = c0gzm2;
            }
            c0gzm.setAttached(true);
            this.LLJJL = true;
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onViewDetachedFromWindow(view);
        LLJJJ();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19egL5 = L5();
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egL5);
        C0GZM c0gzm = null;
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLJZIJLIL);
        }
        this.LLJLL = false;
        C036E.LIZ.LIZLLL(this.LLLFF);
        this.LLLFZ = false;
        if (U5()) {
            C0GZM c0gzm2 = this.LLJJ;
            if (c0gzm2 != null) {
                c0gzm = c0gzm2;
            }
            c0gzm.setAttached(false);
            this.LLJJL = false;
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        C661470Px3 c661470Px3 = this.LLJJIII;
        if (c661470Px3 != null) {
            c661470Px3.setPlayMetrics(c664400Q4g);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0Ps0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0MwS] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0N76] */
    public C658280Pru(View view, C585710My9 c585710My9, InterfaceC656470Poz interfaceC656470Poz) {
        C658290Prv c658290Prv;
        super(view);
        this.LLIZ = c585710My9;
        this.LLIZLLLIL = interfaceC656470Poz;
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1782));
        this.LLJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(591));
        C584670MwT.LIZ.getClass();
        C01GW c01gw = C584670MwT.LIZJ;
        boolean z = ((UserHorizontalVideoPreloadConfig) c01gw.getValue()).enableUserVideoOpt;
        this.LLJL = z;
        this.LLJLIL = ((UserHorizontalVideoPreloadConfig) c01gw.getValue()).enableUserVideoPreload;
        this.LLJLILLLLZIIL = ((UserHorizontalVideoPreloadConfig) c01gw.getValue()).enableUserVideoPrepare;
        this.LLJLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(593));
        this.LLJLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(592));
        this.LLJZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1156));
        this.LLJZIJLIL = new InterfaceC1399350mWD() { // from class: X.0Ps0
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                EnumC655500PnQ enumC655500PnQ;
                if (this.LL.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL()) {
                    if (i == 24 || i == 25) {
                        C658280Pru c658280Pru = this.LL;
                        if (i == 24) {
                            enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                        } else {
                            enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                        }
                        c658280Pru.W5(enumC655500PnQ);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        };
        this.LLL = new OnUIPlayListener() { // from class: X.0MwS
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                C583620Mum.LIZLLL(this, str, j);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z2) {
                C583620Mum.LJ(this, str, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(boolean z2) {
                C583620Mum.LJI(this, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z2) {
                C583620Mum.LJII(this, str, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str) {
                C583620Mum.LJIIIIZZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                C583620Mum.LJIIIZ(this, str, list);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z2) {
                C583620Mum.LJIIJ(this, str, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z2, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str, z2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(boolean z2) {
                C583620Mum.LJIIL(this, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str, int i) {
                C583620Mum.LJIILL(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str, c1480290ocl);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str) {
                C583620Mum.LJIIZILJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
                C583620Mum.LJJIFFI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJ(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPause(String str) {
                C583620Mum.LJJII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str) {
                C583620Mum.LJJIIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str) {
                C583620Mum.LJJIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
                C583620Mum.LJJIJIIJI(this, str, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str, boolean z2) {
                C583620Mum.LJJIJIL(this, str, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str, i, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str) {
                C583620Mum.LJJIJLIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                C583620Mum.LJJIZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str) {
                C583620Mum.LJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJI(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C583620Mum.LJJJJ(this, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                C583620Mum.LJJJJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJLI(this, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str, boolean z2) {
                C583620Mum.LJJJJLL(this, str, z2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                C583620Mum.LJJJJZ(this, str, i, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
                C583620Mum.LJJJJZI(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onStopPlay(String str) {
                C583620Mum.LJJJLIIL(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str) {
                C583620Mum.LJJJLZIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                C583620Mum.LJJJZ(this, str, i, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C661470Px3 c661470Px3;
                C585710My9 c585710My92;
                Integer numValueOf;
                C583620Mum.LJJJIL(this, str, c1480420ocy);
                C658280Pru c658280Pru = this.LL;
                if (c658280Pru.LLJLIL && (c661470Px3 = c658280Pru.LLJJIII) != null && (c585710My92 = c658280Pru.LLIZ) != null) {
                    AbstractC653010PjP mScrollStateObserver = c661470Px3.getMScrollStateObserver();
                    if (mScrollStateObserver != null) {
                        numValueOf = Integer.valueOf(mScrollStateObserver.LIZIZ());
                    } else {
                        numValueOf = null;
                    }
                    C584670MwT.LIZ.getClass();
                    c585710My92.LIZ(numValueOf, new AwS27S0000100_9(((UserHorizontalVideoPreloadConfig) C584670MwT.LIZJ.getValue()).preloadDelayTime, 5));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                C661470Px3 c661470Px3;
                String aid;
                C583620Mum.LIZJ(this, str, j, i);
                C658280Pru c658280Pru = this.LL;
                if (c658280Pru.LLJLILLLLZIIL && (c661470Px3 = c658280Pru.LLJJIII) != null && !c658280Pru.LLJLL) {
                    Aweme aweme = c658280Pru.LLJJJIL;
                    Integer numValueOf = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        long j2 = i;
                        C584670MwT.LIZ.getClass();
                        if (j2 >= ((UserHorizontalVideoPreloadConfig) C584670MwT.LIZJ.getValue()).prepareBufferingPercent) {
                            C585710My9 c585710My92 = c658280Pru.LLIZ;
                            if (c585710My92 != null) {
                                AbstractC653010PjP mScrollStateObserver = c661470Px3.getMScrollStateObserver();
                                if (mScrollStateObserver != null) {
                                    numValueOf = Integer.valueOf(mScrollStateObserver.LIZIZ());
                                }
                                c585710My92.LIZ(numValueOf, AFwS240S0000000_9.get$arr$(934));
                            }
                            c658280Pru.LLJLL = true;
                        }
                    }
                }
            }
        };
        if (z) {
            c658290Prv = new InterfaceC584630MwP() { // from class: X.0Prv
                @Override // X.InterfaceC584630MwP
                public final String LIZLLL() {
                    return "";
                }

                @Override // X.InterfaceC584630MwP
                public final void LIZJ() {
                    C661470Px3 c661470Px3 = this.LIZ.LLJJIII;
                    if (c661470Px3 != null) {
                        C661470Px3.LJIIL(c661470Px3);
                    }
                }

                @Override // X.InterfaceC584630MwP
                public final C661470Px3 getVideoView() {
                    return this.LIZ.LLJJIII;
                }

                @Override // X.InterfaceC584630MwP
                public final boolean isAvailable() {
                    InterfaceC661540PxA interfaceC661540PxA;
                    C661470Px3 c661470Px3 = this.LIZ.LLJJIII;
                    return (c661470Px3 == null || (interfaceC661540PxA = c661470Px3.LLJ) == null || !interfaceC661540PxA.LIZIZ()) ? false : true;
                }

                @Override // X.InterfaceC584630MwP
                public final void LJI() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("next video is preloading...   id:");
                    Aweme aweme = this.LIZ.LLJJJIL;
                    sbLIZ.append(aweme != null ? aweme.getAid() : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C661470Px3 c661470Px3 = this.LIZ.LLJJIII;
                    if (c661470Px3 != null) {
                        C1483340ohg.LJIL(819200, c661470Px3.getMAweme());
                    }
                }

                @Override // X.InterfaceC584630MwP
                public final void LJ(C583760Mv0 c583760Mv0) {
                    C661470Px3 videoView = getVideoView();
                    if (videoView != null) {
                        videoView.setVideoLifeCycleListener(c583760Mv0);
                    }
                }

                @Override // X.InterfaceC584630MwP
                public final void LJFF(C583760Mv0 c583760Mv0) {
                    C658360Ps2.LIZ(this, c583760Mv0);
                }
            };
        } else {
            c658290Prv = 0;
        }
        this.LLLF = c658290Prv;
        this.LLLFF = new C0H62() { // from class: X.0N76
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (C0N75.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 1155));
                }
            }
        };
    }

    public void P5(Aweme aweme, C653660PkS c653660PkS, int i) {
        long diggCount;
        boolean z;
        C661490Px5 dataProvider;
        C661490Px5 dataProvider2;
        C661490Px5 dataProvider3;
        TextView textView;
        C661490Px5 dataProvider4;
        C661490Px5 dataProvider5;
        VideoTag videoTag;
        int iIntValue;
        Drawable drawableLIZIZ;
        String ecSearchBoBcLabelText;
        String ecSearchBoBcLabelText2;
        C661470Px3 c661470Px3;
        InterfaceC661540PxA interfaceC661540PxA;
        this.LLJJJ = i;
        this.LLJJJIL = aweme;
        ((C659400Pti) this.LLJZ.getValue()).LLIZLLLIL = aweme;
        int i2 = 0;
        this.LLJLL = false;
        Long l = null;
        if (SearchLcpExperiment.LIZIZ()) {
            if (!C0P7Y.LIZ()) {
                C0GZM c0gzm = this.LLJJ;
                if (c0gzm == null) {
                    c0gzm = null;
                }
                C1848530yCh.LIZ(c0gzm, "user_with_video_card_video", AFwS241S0000000_10.get$arr$(497));
            } else {
                C662760Pz8 c662760Pz8 = l3().LJJL;
                if (c662760Pz8 != null) {
                    C662750Pz7 c662750Pz7 = C662750Pz7.LIZ;
                    C0GZM c0gzm2 = this.LLJJ;
                    if (c0gzm2 == null) {
                        c0gzm2 = null;
                    }
                    c662750Pz7.getClass();
                    C662750Pz7.LJII(c0gzm2, c662760Pz8);
                } else {
                    C662750Pz7 c662750Pz72 = C662750Pz7.LIZ;
                    C0GZM c0gzm3 = this.LLJJ;
                    if (c0gzm3 == null) {
                        c0gzm3 = null;
                    }
                    c662750Pz72.getClass();
                    C662750Pz7.LJI(0, c0gzm3, "user_with_video_card_video");
                }
            }
        }
        SearchVideoAndUserOptimizeExperiment.LIZ.getClass();
        int iIntValue2 = 4;
        if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZJ.getValue()).userImageAsyncLoad) {
            C823050WQl.LIZJ().execute(new ARunnableS78S0200000_9(this, aweme, 76));
            if (this.LLJJJ == 0 && ((((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ == 3 || ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ == 1 || ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJILJILJ == 4) && !((Boolean) this.LLJLLL.getValue()).booleanValue() && ((Boolean) this.LLJLLIL.getValue()).booleanValue() && (c661470Px3 = this.LLJJIII) != null && (interfaceC661540PxA = c661470Px3.LLJ) != null)) {
                interfaceC661540PxA.LIZJ();
            }
        } else {
            R5(aweme);
        }
        TextView textView2 = this.LLJILJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        textView2.setText(C820940WIi.LIZ(diggCount));
        TuxIconDrawable tuxIconDrawableLIZIZ = C0DYK.LIZIZ(this.itemView.getContext(), aweme);
        if (((Boolean) this.LLJ.getValue()).booleanValue()) {
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZIZ, (Drawable) null);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView3 = this.LLJILJILJ;
        if (textView3 != null) {
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
            } else {
                ecSearchBoBcLabelText = null;
            }
            if (C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
                AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo2 != null) {
                    ecSearchBoBcLabelText2 = commerceVideoAuthInfo2.getEcSearchBoBcLabelText();
                } else {
                    ecSearchBoBcLabelText2 = null;
                }
                textView3.setText(ecSearchBoBcLabelText2);
                C786410Ut5.LLIL(textView3, 0);
            } else {
                C786410Ut5.LLIL(textView3, 8);
            }
        }
        if (aweme.getNewLabel() == 1) {
            TextView textView4 = this.LLJJI;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.LLIL(textView4, 0);
            Video video = aweme.getVideo();
            if (video != null && (videoTag = video.getVideoTag()) != null) {
                String title = videoTag.getTitle();
                if (title != null && title.length() != 0) {
                    Integer numLIZ = C640290P9n.LIZ(videoTag.getBackgroundColor());
                    Integer numLIZ2 = C640290P9n.LIZ(videoTag.getFontColor());
                    Integer numValueOf = Integer.valueOf(C1913107eT.LIZIZ());
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = 3;
                    }
                    float fLIZIZ = C418440Gaw.LIZIZ(numValueOf);
                    TextView textView5 = this.LLJJI;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    textView5.setText(videoTag.getTitle());
                    if (numLIZ2 != null) {
                        iIntValue = numLIZ2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    textView5.setTextColor(iIntValue);
                    if (numLIZ != null) {
                        drawableLIZIZ = C1908520zlS.LIZIZ(fLIZIZ, numLIZ.intValue());
                    } else {
                        drawableLIZIZ = C800330VaR.LIZIZ(textView5.getContext(), R.drawable.d3u);
                    }
                    textView5.setBackground(drawableLIZIZ);
                    textView5.getBackground().setAlpha((int) (Float.valueOf(C13LZ.LJ(videoTag.getOpacity(), 0, 100) / 100.0f).floatValue() * 255));
                    C659130PtH.LIZIZ(aweme);
                } else {
                    TextView textView6 = this.LLJJI;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    C786410Ut5.LLIL(textView6, 8);
                }
            }
        } else {
            TextView textView7 = this.LLJJI;
            if (textView7 == null) {
                textView7 = null;
            }
            C786410Ut5.LLIL(textView7, 8);
        }
        C661470Px3 c661470Px32 = this.LLJJIII;
        if (c661470Px32 != null && (dataProvider5 = c661470Px32.getDataProvider()) != null) {
            dataProvider5.LJJIFFI = i;
        }
        C661470Px3 c661470Px33 = this.LLJJIII;
        if (c661470Px33 != null) {
            c661470Px33.LJFF(aweme);
        }
        C661470Px3 c661470Px34 = this.LLJJIII;
        if (c661470Px34 != null && (dataProvider4 = c661470Px34.getDataProvider()) != null) {
            dataProvider4.LJIL = c653660PkS;
        }
        TextView textView8 = this.LLJILJIL;
        if (textView8 == null) {
            textView8 = null;
        }
        C12P4 c12p4 = this.LLJJIJI;
        if (c12p4 != null) {
            C786410Ut5.LLLLLLZ(c12p4, 8);
        }
        TextView textView9 = this.LLJILJIL;
        if (textView9 == null) {
            textView9 = null;
        }
        if (textView9.getVisibility() == 0) {
            TextView textView10 = this.LLJILJIL;
            if (textView10 == null) {
                textView10 = null;
            }
            CharSequence text = textView10.getText();
            if (text != null && text.length() != 0) {
                textView8.setPadding(textView8.getPaddingLeft(), 0, textView8.getPaddingRight(), textView8.getPaddingBottom());
                HandlerHook.viewPost(textView8, new ARunnableS79S0200000_10(this, textView8, 78));
            }
        }
        TextView textView11 = this.LLJILJILJ;
        if (textView11 != null && textView11.getVisibility() == 0) {
            C12P4 c12p42 = this.LLJJIJI;
            if (c12p42 != null) {
                C786410Ut5.LLLLLLZ(c12p42, 8);
            }
            TextView textView12 = this.LLJILJILJ;
            if (textView12 != null) {
                HandlerHook.viewPost(textView12, new ARunnableS110S0100000_10(this, 156));
            }
        }
        TextView textView13 = this.LLJILJIL;
        if (textView13 == null) {
            textView13 = null;
        }
        C786410Ut5.LLIL(textView13, C666750QDh.LIZ);
        TextView textView14 = this.LLJILJIL;
        if (textView14 == null) {
            textView14 = null;
        }
        if (textView14.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (textView = this.LLJILJILJ) != null && textView.getVisibility() == 0) {
            TextView textView15 = this.LLJILJILJ;
            if (textView15 != null) {
                textView15.setPadding(textView15.getPaddingLeft(), textView15.getPaddingTop(), textView15.getPaddingRight(), (int) C12ES.LIZJ(8.0f, this.itemView.getContext()));
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLJJIJIIJIL);
            FrameLayout frameLayout = this.LLJILLL;
            if (frameLayout != null) {
                c19mb.LJI(frameLayout.getId(), 4);
                TextView textView16 = this.LLJILJILJ;
                if (textView16 != null) {
                    c19mb.LJIIIIZZ(frameLayout.getId(), 4, textView16.getId(), 3);
                }
            }
            c19mb.LIZIZ(this.LLJJIJIIJIL);
        } else {
            TextView textView17 = this.LLJILJILJ;
            if (textView17 != null) {
                textView17.setPadding(textView17.getPaddingLeft(), textView17.getPaddingTop(), textView17.getPaddingRight(), (int) C12ES.LIZJ(4.0f, this.itemView.getContext()));
            }
            C19MB c19mb2 = new C19MB();
            c19mb2.LJII(this.LLJJIJIIJIL);
            FrameLayout frameLayout2 = this.LLJILLL;
            if (frameLayout2 != null) {
                c19mb2.LJI(frameLayout2.getId(), 4);
                c19mb2.LJIIIIZZ(frameLayout2.getId(), 4, 0, 3);
            }
        }
        C659060PtA.LIZJ(C659060PtA.LIZ, this.LLJJJIL, C0PNW.LIZ(), this.LLJJJJJIL, this.LLJJJJLIIL, c653660PkS, null, 32);
        View view = this.LLJJIJIL;
        if (view != null) {
            C10IT.LIZ.getClass();
            if (!C10IT.LJIIL(aweme)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        ConstraintLayout constraintLayout = this.LLJJIJIIJIL;
        if (constraintLayout != null) {
            C427690Gpr.LJFF(constraintLayout, 4.0f);
        }
        C1012300cRw c1012300cRw = this.LLJJJJJIL;
        if (c1012300cRw != null) {
            C427690Gpr.LJI(c1012300cRw, null);
        }
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        if (tuxIconView != null) {
            C427690Gpr.LJI(tuxIconView, null);
        }
        ConstraintLayout constraintLayout2 = this.LLJJIJIIJIL;
        if (constraintLayout2 != null) {
            Integer num = (Integer) this.LLJI.getValue();
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            constraintLayout2.setOutlineProvider(new C663220Pzs((int) C418040GaI.LIZ(iIntValue2)));
        }
        if (i == 0) {
            C644060POa.LIZ.getClass();
            if (!C644060POa.LIZJ) {
                C661470Px3 c661470Px35 = this.LLJJIII;
                if (c661470Px35 != null && (dataProvider3 = c661470Px35.getDataProvider()) != null) {
                    dataProvider3.LJJIJIIJIL = Long.valueOf(C644060POa.LIZIZ);
                }
                C661470Px3 c661470Px36 = this.LLJJIII;
                if (c661470Px36 != null && (dataProvider2 = c661470Px36.getDataProvider()) != null) {
                    dataProvider2.LJJIJLIJ = "UserVideoHolder";
                }
                C644060POa.LIZJ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clickSearchTime:");
                C661470Px3 c661470Px37 = this.LLJJIII;
                if (c661470Px37 != null && (dataProvider = c661470Px37.getDataProvider()) != null) {
                    l = dataProvider.LJJIJIIJIL;
                }
                sbLIZ.append(l);
                sbLIZ.append(" clearCreateActivityTime");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        C663180Pzo c663180Pzo = C663180Pzo.LIZ;
        C661470Px3 c661470Px38 = this.LLJJIII;
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(aweme, this, 89);
        c663180Pzo.getClass();
        C663180Pzo.LJ(c661470Px38, aweme, c661470Px38, awS411S0200000_10);
    }
}
