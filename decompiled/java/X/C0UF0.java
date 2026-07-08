package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.StopCurrentInsertStickerEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.trymode.guide.ShowEnhanceGuideEvent;
import com.bytedance.android.livesdk.dataChannel.BGMToolTipShowEvent;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveFest25EoyBubbleConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMakeupEntrySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UF0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UF0 implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public ViewOnLayoutChangeListenerC769370UFz LLILZIL;
    public DataChannel LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public LiveIconView LLJ;
    public C20743416Fc LLJI;
    public C20743516Fd LLJIJIL;
    public ImageView LLJILJIL;
    public View LLJILJILJ;
    public C11JF LLJILLL;
    public boolean LLJJI;
    public ARunnableS112S0100000_12 LLJJJIL;
    public ARunnableS112S0100000_12 LLJJJJ;
    public C1103540ep6 LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJL;
    public int LLJLIL;
    public C767640U9i LLJLILLLLZIIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(261));
    public final ArrayList<EnumC1102750enp> LLILZ = new ArrayList<>();
    public final InterfaceC769090UEx LLJJ = C781270Ukn.LJI().getInsertStickerManager();
    public String LLJJIII = "normal_click_icon";
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(260));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(259));
    public final ARunnableS112S0100000_12 LLJJIJIL = new ARunnableS112S0100000_12(this, 249);
    public final ARunnableS112S0100000_12 LLJJJ = new ARunnableS112S0100000_12(this, 248);
    public final AwS591S0100000_12 LLJJLIIIJLLLLLLLZ = new AwS591S0100000_12(this, 741);

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    public final void LIZ() {
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz != null) {
            viewOnLayoutChangeListenerC769370UFz.setFocusable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz2 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz2 != null) {
            viewOnLayoutChangeListenerC769370UFz2.setOutsideTouchable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz3 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz3 != null) {
            viewOnLayoutChangeListenerC769370UFz3.setTouchable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz4 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz4 != null) {
            viewOnLayoutChangeListenerC769370UFz4.update();
        }
    }

    public final void LIZIZ() {
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz != null) {
            viewOnLayoutChangeListenerC769370UFz.setFocusable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz2 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz2 != null) {
            viewOnLayoutChangeListenerC769370UFz2.setOutsideTouchable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz3 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz3 != null) {
            viewOnLayoutChangeListenerC769370UFz3.setTouchable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz4 = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz4 != null) {
            viewOnLayoutChangeListenerC769370UFz4.update();
        }
    }

    public final Handler LIZJ() {
        return (Handler) this.LLJJIJI.getValue();
    }

    public final void LJ() {
        if (!ToolBarButtonWithTextExperiment.hasText()) {
            LiveIconView liveIconView = this.LLJ;
            if (liveIconView != null) {
                ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
                if (layoutParams != null) {
                    int iLIZIZ = this.LLJL;
                    if (iLIZIZ <= 0) {
                        iLIZIZ = (int) C497740JfY.LIZIZ(24.0f);
                    }
                    layoutParams.width = iLIZIZ;
                    int iLIZIZ2 = this.LLJLIL;
                    if (iLIZIZ2 <= 0) {
                        iLIZIZ2 = (int) C497740JfY.LIZIZ(24.0f);
                    }
                    layoutParams.height = iLIZIZ2;
                } else {
                    layoutParams = null;
                }
                C786410Ut5.w6(liveIconView, layoutParams);
            }
            C1103540ep6 c1103540ep6 = this.LLJJJJJIL;
            if (c1103540ep6 != null) {
                c1103540ep6.LIZ();
            }
        }
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = liveIconView2.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C786410Ut5.Qb(liveIconView2, 1.0f);
            C786410Ut5.Qb(liveIconView2, 1.0f);
        }
        C0UM0.LIZ = false;
        C500260Jjc.LLFFF(this.LLJI);
        LiveIconView liveIconView3 = this.LLJ;
        if (liveIconView3 != null) {
            C786410Ut5.nd(liveIconView3, 0.0f);
            C786410Ut5.Zb(liveIconView3, 1.0f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveIconView3);
            liveIconView3.setScaleY(1.0f);
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        if (this.LLJIJIL != null) {
            this.LLJJI = false;
            LiveIconView liveIconView4 = this.LLJ;
            if (liveIconView4 != null) {
                liveIconView4.setImageBitmap(null);
            }
            LiveIconView liveIconView5 = this.LLJ;
            if (liveIconView5 != null) {
                liveIconView5.setIcon(this.LLJIJIL);
            }
        }
        this.LLJLILLLLZIIL = null;
        if (LiveBroadcastBackgroundPhase2.enable()) {
            LIZJ().removeCallbacks(this.LLJJIJIL);
        } else {
            LIZJ().removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C1ALS c1als = C1ALS.LIZ;
        C1ALS.LIZ();
        boolean zLJJJJIZL = C500260Jjc.LJJJJIZL(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLIZ);
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        if (C0UID.LJIIJ(dataChannel) && TryModeGuidanceSetting.INSTANCE.isV2() && C0UID.LIZJ()) {
            C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Gf;
            c20337914i1.LIZIZ().put("enhance_guidance", Boolean.FALSE);
            c20337914i1.LIZJ();
        }
        if (this.LLJJL) {
            str = "long_press";
        } else {
            str = "click";
        }
        LJI(view, str, true, zLJJJJIZL);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        this.LLJJL = true;
        return false;
    }

    public C0UF0(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    public static void LIZLLL(int i, String str) {
        String str2;
        if (i != 6) {
            if (i != 8) {
                str2 = "";
            } else {
                str2 = "guide_click_tip";
            }
        } else {
            str2 = "guide_click_icon";
        }
        if (str2.length() == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJIJL();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = this.LLILZIL;
        if (viewOnLayoutChangeListenerC769370UFz != null) {
            viewOnLayoutChangeListenerC769370UFz.dismiss();
        }
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILLL = null;
        dataChannel.zQ2(this);
        LIZJ().removeCallbacksAndMessages(null);
        ((Handler) this.LLJJIJIIJIL.getValue()).removeCallbacksAndMessages(null);
        this.LLJLILLLLZIIL = null;
    }

    public final void LJFF(InterfaceC1103130eoR interfaceC1103130eoR, final boolean z) {
        C785230UrB c785230UrB = new C785230UrB(interfaceC1103130eoR.LJ());
        c785230UrB.LIZLLL(2131844630);
        c785230UrB.LJFF = 48;
        c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        c785230UrB.LJIIIZ = true;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0UEz
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                if (z) {
                    InterfaceC766480U4w.LJIILIIL.LJFF(Boolean.FALSE);
                } else {
                    InterfaceC766480U4w.LJIIL.LJFF(Boolean.FALSE);
                }
            }
        };
        C486790J7d.LIZLLL(new ARunnableS81S0200000_12(this, new C785270UrF(c785230UrB), 78), null, 1000L);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        C1103540ep6 c1103540ep6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad, ");
        sbLIZ.append(dataChannel.hashCode());
        C20441214yg.LIZIZ("InsertStickerManager#Tool", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL = interfaceC1103130eoR.getContentView();
        this.LLIZ = interfaceC1103130eoR.findViewById(R.id.y7r);
        this.LLJ = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        this.LLJI = (C20743416Fc) interfaceC1103130eoR.findViewById(R.id.y7s);
        this.LLJILJIL = (ImageView) interfaceC1103130eoR.findViewById(R.id.y6q);
        this.LLJILJILJ = interfaceC1103130eoR.findViewById(R.id.y6p);
        DataChannel dataChannel2 = null;
        this.LLJLILLLLZIIL = null;
        if (!ToolBarButtonWithTextExperiment.hasText() && (interfaceC1103130eoR.getContentView() instanceof C1103540ep6)) {
            View contentView = interfaceC1103130eoR.getContentView();
            if (contentView instanceof C1103540ep6) {
                c1103540ep6 = (C1103540ep6) contentView;
            } else {
                c1103540ep6 = null;
            }
            this.LLJJJJJIL = c1103540ep6;
        }
        if (C497740JfY.LJJ()) {
            View view = this.LLJILJILJ;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.setMarginEnd(layoutParams2.getMarginStart());
                layoutParams2.setMarginStart(0);
                layoutParams2.gravity = 8388661;
                View view2 = this.LLJILJILJ;
                if (view2 != null) {
                    C786410Ut5.W5(view2, layoutParams2);
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_decoration_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        this.LLILZLL = dataChannel;
        dataChannel.EQ2(this.LLILLJJLI, BroadcastEndShowEvent.class, new AwS591S0100000_12(this, 737));
        dataChannel.BQ2(this.LLILLJJLI, CppSeeDetailsClickEvent.class, new AwS591S0100000_12(this, 738));
        dataChannel.BQ2(this.LLILLJJLI, ShowEnhanceGuideEvent.class, new AwS378S0200000_12(this, interfaceC1103130eoR, 49));
        if (!C500260Jjc.LJJJIL(dataChannel)) {
            List<String> listLIZ = InterfaceC766480U4w.LJJJJLL.LIZ();
            C0U8H c0u8hLIZIZ = C0UF5.LIZIZ();
            if (c0u8hLIZIZ != null && c0u8hLIZIZ.LIZ && listLIZ != null) {
                str = (String) C13LP.LJJJLL(listLIZ);
            } else {
                str = null;
            }
            C0U8H c0u8hLIZIZ2 = C0UF5.LIZIZ();
            if (c0u8hLIZIZ2 != null && c0u8hLIZIZ2.LIZIZ && listLIZ != null) {
                str2 = (String) C13LP.LJJJLZIJ(1, listLIZ);
            } else {
                str2 = null;
            }
            Boolean boolLIZIZ = InterfaceC766480U4w.LJJJJL.LIZIZ();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolLIZIZ, bool) && Intrinsics.LJFF(InterfaceC766480U4w.LJJJJJ.LIZIZ(), Boolean.FALSE)) {
                z = true;
            } else {
                z = false;
            }
            if (Intrinsics.LJFF(InterfaceC766480U4w.LJJJJLI.LIZIZ(), bool) && Intrinsics.LJFF(InterfaceC766480U4w.LJJJJJL.LIZIZ(), Boolean.FALSE)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C123100dR.LIZ(str) || z) {
                if (C123100dR.LIZ(str)) {
                    C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_BEAUTY_TAB;
                    c0ux6.setDynamic(true);
                    C0UX6.LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE.setDynamic(true);
                    C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE.setDynamic(true);
                    String currentId = c0ux6.getCurrentId();
                    if (currentId.length() != 0 || (currentId = (String) C13LQ.LJJIIZ(0, c0ux6.getIds())) != null) {
                        RedDotExtensionKt.LJIIL(c0ux6, str, currentId);
                    }
                }
                C0UX6.LIVE_BROADCAST_BEAUTY_TAB.setValid(true);
                C0UX6.LIVE_BROADCAST_BEAUTY_ENTRY_BEAUTY_GUIDE.setValid(true);
                C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE.setValid(true);
                C0U8H c0u8hLIZIZ3 = C0UF5.LIZIZ();
                if (c0u8hLIZIZ3 != null && !c0u8hLIZIZ3.LIZJ) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C0UF3.LIZ = z3;
            }
            if (LiveMakeupEntrySetting.INSTANCE.show() && (C123100dR.LIZ(str2) || z2)) {
                if (C123100dR.LIZ(str2)) {
                    C0UX6 c0ux62 = C0UX6.LIVE_BROADCAST_MAKEUP_TAB;
                    c0ux62.setDynamic(true);
                    C0UX6.LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE.setDynamic(true);
                    C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE.setDynamic(true);
                    String currentId2 = c0ux62.getCurrentId();
                    if (currentId2.length() != 0 || (currentId2 = (String) C13LQ.LJJIIZ(0, c0ux62.getIds())) != null) {
                        RedDotExtensionKt.LJIIL(c0ux62, str2, currentId2);
                    }
                }
                C0UX6.LIVE_BROADCAST_MAKEUP_TAB.setValid(true);
                C0UX6.LIVE_BROADCAST_BEAUTY_ENTRY_MAKEUP_GUIDE.setValid(true);
                C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE.setValid(true);
                C0U8H c0u8hLIZIZ4 = C0UF5.LIZIZ();
                if (c0u8hLIZIZ4 != null && !c0u8hLIZIZ4.LIZJ) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C0UF3.LIZIZ = z4;
            }
            if (!this.LLJJI) {
                if (C0UF3.LIZ) {
                    RedDotExtensionKt.LJI(null, this.LLILLJJLI, null, C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_BEAUTY_GUIDE, new AwS591S0100000_12(this, 732));
                }
                if (C0UF3.LIZIZ) {
                    RedDotExtensionKt.LJI(null, this.LLILLJJLI, null, C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_MAKEUP_GUIDE, new AwS591S0100000_12(this, 736));
                }
                RedDotExtensionKt.LJI(null, this.LLILLJJLI, null, C0UX6.LIVE_BROADCAST_ENHANCE_ENTRY_GUIDE, new AwS591S0100000_12(this, 742));
            }
        }
        this.LLILZ.clear();
        ArrayList<EnumC1102750enp> arrayList = this.LLILZ;
        ArrayList arrayListLJ = C1697810uHb.LJ(EnumC1102750enp.BEAUTY);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil().getClass();
        HideEffectEntrySetting hideEffectEntrySetting = HideEffectEntrySetting.INSTANCE;
        if (!hideEffectEntrySetting.shouldHide()) {
            arrayListLJ.add(EnumC1102750enp.STICKER);
        }
        arrayListLJ.add(EnumC1102750enp.PROPS);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        DataChannel dataChannel3 = this.LLILZLL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        if (C768290UBv.LIZLLL(dataChannel3)) {
            arrayListLJ.add(EnumC1102750enp.MUSIC);
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        DataChannel dataChannel4 = this.LLILZLL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        if (C768290UBv.LJ(dataChannel4)) {
            arrayListLJ.add(EnumC1102750enp.VOICE_EFFECT);
        }
        arrayListLJ.add(EnumC1102750enp.SOUND_EFFECT);
        C0KWW hostToolsUtil = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        DataChannel dataChannel5 = this.LLILZLL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        hostToolsUtil.getClass();
        if (!C500260Jjc.LJJJIL(dataChannel5)) {
            arrayListLJ.add(EnumC1102750enp.BACKGROUND);
        }
        C758470Tp7 c758470Tp7LIZ = C771670UOv.LIZ();
        if (c758470Tp7LIZ != null && c758470Tp7LIZ.LIZ) {
            arrayListLJ.add(EnumC1102750enp.BOARD);
        }
        arrayList.addAll(arrayListLJ);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil().getClass();
        if (!(!hideEffectEntrySetting.shouldHide())) {
            C20441214yg.LIZIZ("InsertStickerManager#Tool", "dealWithStickerInsert hide");
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dealWithStickerInsert observe dataChannel: ");
            DataChannel dataChannel6 = this.LLILZLL;
            if (dataChannel6 == null) {
                dataChannel6 = null;
            }
            sbLIZ2.append(dataChannel6.hashCode());
            C20441214yg.LIZIZ("InsertStickerManager#Tool", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel7 = this.LLILZLL;
            if (dataChannel7 != null) {
                dataChannel2 = dataChannel7;
            }
            dataChannel2.EQ2(this.LLILLJJLI, NewInsertStickerEvent.class, new AwS378S0200000_12(this, interfaceC1103130eoR, 52));
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil().getClass();
        if (!hideEffectEntrySetting.shouldHide()) {
            dataChannel.EQ2(this.LLILLJJLI, StopCurrentInsertStickerEvent.class, new AwS591S0100000_12(this, 739));
        }
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV2() && InterfaceC766480U4w.LJIIL.LIZIZ().booleanValue()) {
            LJFF(interfaceC1103130eoR, false);
        }
        dataChannel.BQ2(this.LLILLJJLI, BGMToolTipShowEvent.class, new AwS378S0200000_12(this, interfaceC1103130eoR, 50));
        DataChannelGlobal.LLILZ.BQ2(this, this.LLILLJJLI, BroadcastSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 740));
        C786410Ut5.LJLIIL(((long) LiveFest25EoyBubbleConfig.INSTANCE.getBubbleConfig().delayDuration) * 1000, (Handler) this.LLJJIJIIJIL.getValue(), new ARunnableS112S0100000_12(this, 247));
        this.LLJILLL = (C11JF) C784440Upu.LIZ().LJ(C254700yf.class).LJJLJLI(new AfS181S0100000_12(this.LLJJLIIIJLLLLLLLZ, 158));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UF0.LJI(android.view.View, java.lang.String, boolean, boolean):void");
    }
}
