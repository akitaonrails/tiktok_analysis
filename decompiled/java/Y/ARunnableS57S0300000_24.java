package Y;

import X.AbstractC1592930rYR;
import X.AbstractC1606860ruu;
import X.AbstractC21616419ik;
import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C09AJ;
import X.C0PEM;
import X.C105700ad;
import X.C1255230ill;
import X.C12ES;
import X.C1308910kAL;
import X.C1385005bU;
import X.C1388190mED;
import X.C1440005kM;
import X.C1563370qml;
import X.C1564830qp7;
import X.C1564850qp9;
import X.C1564870qpB;
import X.C1566190qrJ;
import X.C1575900r6y;
import X.C1576780r8O;
import X.C1576980r8i;
import X.C1578630rBN;
import X.C1592170rXD;
import X.C1592290rXP;
import X.C1592950rYT;
import X.C1592990rYX;
import X.C1593140rYm;
import X.C1601460rmC;
import X.C1601650rmV;
import X.C1608920ryE;
import X.C1619570sFP;
import X.C1619980sG4;
import X.C189200o6;
import X.C1894320zOY;
import X.C19EG;
import X.C1C7U;
import X.C21578619ce;
import X.C21616519il;
import X.C2254708sT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C290710BaP;
import X.C298310Bmf;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C446700HfQ;
import X.C630740Ooa;
import X.C786410Ut5;
import X.C814420VxA;
import X.C815730VzH;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1585090rLn;
import X.EnumC682280QpW;
import X.InterfaceC1427630nFp;
import X.InterfaceC1565950qqv;
import X.InterfaceC1583870rJp;
import X.InterfaceC1592400rXa;
import X.InterfaceC1593160rYo;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightTemplateCell;
import com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.RingColor;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper;
import com.ss.android.ugc.aweme.series.feed.tab.toptab.SeriesTopTabVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.lazy.TakoLazyCache$addOwnerDestroyObserver$1;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS57S0300000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$1() {
        Float f;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        C427660Gpo c427660Gpo = ((SkylightTemplateCell) this.l0).LLIZLLLIL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        if (c427660Gpo.getWidth() != 0) {
            C427660Gpo c427660Gpo2 = ((SkylightTemplateCell) this.l0).LLIZLLLIL;
            if (c427660Gpo2 == null) {
                c427660Gpo2 = null;
            }
            if (c427660Gpo2.getHeight() != 0) {
                ViewGroup.LayoutParams layoutParams = ((View) this.l1).getLayoutParams();
                C427660Gpo c427660Gpo3 = ((SkylightTemplateCell) this.l0).LLIZLLLIL;
                if (c427660Gpo3 == null) {
                    c427660Gpo3 = null;
                }
                int i = iLIZIZ * 2;
                int width = c427660Gpo3.getWidth() + i;
                C427660Gpo c427660Gpo4 = ((SkylightTemplateCell) this.l0).LLIZLLLIL;
                if (c427660Gpo4 == null) {
                    c427660Gpo4 = null;
                }
                int height = c427660Gpo4.getHeight() + i;
                if (layoutParams.width != width || layoutParams.height != height) {
                    layoutParams.width = width;
                    layoutParams.height = height;
                    C786410Ut5.W5((View) this.l1, layoutParams);
                }
                SkylightTemplateCell skylightTemplateCell = (SkylightTemplateCell) this.l0;
                View[] viewArr = {(View) this.l1};
                skylightTemplateCell.getClass();
                SkylightBaseTemplateCell.S5(0, viewArr);
                Integer color = ((RingColor) this.l2).parseColor(((SkylightTemplateCell) this.l0).itemView.getContext(), true);
                if (color == null) {
                    color = C1308910kAL.LIZJ(R.attr.a01, ((SkylightTemplateCell) this.l0).itemView.getContext());
                }
                View view = (View) this.l1;
                SkylightTemplateCell skylightTemplateCell2 = (SkylightTemplateCell) this.l0;
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJ = color;
                TemplateData templateData = skylightTemplateCell2.P5().templateData;
                c384050F3z.LIZLLL = (templateData == null || (f = templateData.ringWidth) == null) ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d)))) : Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(f)));
                c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                view.setBackground(c384050F3z.LIZ(((View) this.l1).getContext()));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        SeriesFeedResp seriesFeedRespLIZ = SeriesFeedResp.LIZ((SeriesFeedResp) this.l0, (List) this.l1, Boolean.TRUE, C1576780r8O.LJ, null, 16376);
        Long l = (Long) this.l2;
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper = new MiniDramaTabCacheWrapper(Long.valueOf(l != null ? l.longValue() : C298310Bmf.LIZ() ? System.currentTimeMillis() : ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ()), seriesFeedRespLIZ, 0);
        C1576780r8O.LIZJ = miniDramaTabCacheWrapper;
        C1576780r8O.LIZLLL = new ArrayList();
        C1576980r8i c1576980r8i = C1576780r8O.LIZIZ;
        C1576780r8O.LIZ.getClass();
        String strLIZIZ = C1576780r8O.LIZIZ();
        String strLIZIZ2 = C105700ad.LIZIZ(miniDramaTabCacheWrapper);
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        c1576980r8i.LIZIZ(strLIZIZ, strLIZIZ2);
        c1576980r8i.LIZIZ(C1576780r8O.LIZ(), "");
    }

    public final void LIZ$2() {
        if (C1578630rBN.LJIIIZ((AbstractC738140SxQ) this.l0)) {
            return;
        }
        C2254708sT actionHandler = ((InterfaceC1565950qqv) ((AbstractC738140SxQ) this.l0)).getActionHandler();
        C23250099c.LIZLLL(C2296808zG.LIZ((CoroutineContext) actionHandler.LIZLLL.getValue()), null, null, new C1385005bU(new C1566190qrJ((AbstractC738140SxQ) this.l0, (AbstractC738140SxQ) this.l1, (C630740Ooa) this.l2, null), actionHandler, "action_key_on_parent_set", null), 3);
    }

    public final void LIZ$3() {
        Object c098200Yq;
        C1592170rXD c1592170rXD = (C1592170rXD) this.l0;
        try {
            c098200Yq = ((InterfaceC1592400rXa) this.l2).LIZ(c1592170rXD.LIZJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Function1 function1 = (Function1) c098200Yq;
        if (function1 == null) {
            return;
        }
        List<InterfaceC1583870rJp> list = (List) this.l1;
        C1592170rXD c1592170rXD2 = (C1592170rXD) this.l0;
        for (InterfaceC1583870rJp interfaceC1583870rJp : list) {
            AbstractC1592930rYR abstractC1592930rYR = c1592170rXD2.LIZLLL.get(interfaceC1583870rJp.tag());
            if (abstractC1592930rYR != null) {
                abstractC1592930rYR.LIZIZ((InterfaceC1593160rYo) function1.invoke(interfaceC1583870rJp));
            }
        }
    }

    public final void LIZ$4() {
        C1593140rYm c1593140rYm;
        C1592990rYX c1592990rYX = (C1592990rYX) this.l1;
        C1592950rYT c1592950rYT = (C1592950rYT) this.l2;
        c1592990rYX.getClass();
        C1592990rYX.LJJJJL(c1592950rYT);
        C1592990rYX c1592990rYX2 = (C1592990rYX) this.l1;
        C1592950rYT c1592950rYT2 = (C1592950rYT) this.l2;
        boolean zLIZIZ = C960203pA.LIZIZ(c1592990rYX2.LL.getContext());
        if (C290710BaP.LIZ() && zLIZIZ) {
            C1592290rXP c1592290rXP = c1592990rYX2.LLILZ.LIZLLL;
            c1593140rYm = c1592990rYX2.LJIJ() ? c1592290rXP.LIZIZ : c1592290rXP.LIZLLL;
        } else {
            C1592290rXP c1592290rXP2 = c1592990rYX2.LLILZ.LIZLLL;
            c1593140rYm = c1592990rYX2.LLILLJJLI == EnumC1571190qzN.DARK ? c1592990rYX2.LJIJ() ? c1592290rXP2.LIZIZ : c1592290rXP2.LIZLLL : c1592990rYX2.LJIJ() ? c1592290rXP2.LIZ : c1592290rXP2.LIZJ;
        }
        c1592950rYT2.setTabIconImageDrawable(c1592990rYX2.LLILLL.LIZ(c1593140rYm.LIZ, c1592950rYT2.getContext()));
        Integer numLIZJ = C1308910kAL.LIZJ(c1593140rYm.LIZIZ, c1592950rYT2.getContext());
        c1592950rYT2.setTitleTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        c1592990rYX2.LJJJJLI(c1592950rYT2, c1592990rYX2.LJIJ());
    }

    public final void LIZ$5() {
        if (((View) this.l0).getParent() != null) {
            int[] iArr = new int[2];
            ((View) this.l0).getLocationOnScreen(iArr);
            ((C446700HfQ) this.l1).update((iArr[0] + (((View) this.l0).getWidth() / 2)) - (((C446700HfQ) this.l1).getContentView().getWidth() / 2), (iArr[1] - ((C446700HfQ) this.l1).getContentView().getHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), ((C446700HfQ) this.l1).getWidth(), ((C446700HfQ) this.l1).getHeight());
            C446700HfQ c446700HfQ = (C446700HfQ) this.l1;
            c446700HfQ.getContentView().setPivotX(c446700HfQ.getContentView().getWidth() / 2.0f);
            c446700HfQ.getContentView().setPivotY(c446700HfQ.getContentView().getHeight());
            C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(c446700HfQ.getContentView(), AbstractC21616419ik.LJIILL, 1.0f);
            c21616519ilLJIILLIIL.LJI(0.3f);
            c21616519ilLJIILLIIL.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0sFQ
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                }
            });
            C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(c446700HfQ.getContentView(), AbstractC21616419ik.LJIILLIIL, 1.0f);
            c21616519ilLJIILLIIL2.LJI(0.3f);
            c21616519ilLJIILLIIL2.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0sFR
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                }
            });
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c446700HfQ.getContentView(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setDuration(150L);
            if (c446700HfQ.getContentView().getParent() != null) {
                HandlerHook.viewPost(c446700HfQ.getContentView(), new ARunnableS38S0300000_5(c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, objectAnimatorOfFloat, 7));
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1619570sFP((BottomTabBubble) this.l2, null), 3);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Integer num = ((BottomTabBubble) this.l2).LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(36, linkedHashMap, num, null, null, "");
        }
    }

    public static final void run$0(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaTabUnConsumeCache@a8c8.saveUnConsumeData$1");
        try {
            aRunnableS57S0300000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaTabUnConsumeCache@a8c8.saveUnConsumeData$1");
    }

    public static final void run$1(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("Hox@814e.doInit$1");
        try {
            C1563370qml.LIZ((C19EG) aRunnableS57S0300000_24.l0, EnumC682280QpW.MAIN, new AwS425S0200000_24((Lifecycle) aRunnableS57S0300000_24.l1, (Hox) aRunnableS57S0300000_24.l2, 4));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Hox@814e.doInit$1");
    }

    public static final void run$10(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBarLogic@502f.handleProfileTabClickWithDeferredDoubleTap$runnable$1");
        try {
            C1592170rXD c1592170rXD = (C1592170rXD) aRunnableS57S0300000_24.l0;
            c1592170rXD.LJIIIIZZ = null;
            Activity activityLIZ = C1388190mED.LIZ(c1592170rXD.LIZJ);
            if (activityLIZ == null || !activityLIZ.isFinishing()) {
                ((C1592170rXD) aRunnableS57S0300000_24.l0).LJJLIIIJLLLLLLLZ((InterfaceC1583870rJp) aRunnableS57S0300000_24.l1, (ScrollSwitchStateManager) aRunnableS57S0300000_24.l2, false);
                C1440005kM.LIZIZ(new C1255230ill());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBarLogic@502f.handleProfileTabClickWithDeferredDoubleTap$runnable$1");
    }

    public static final void run$11(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyTabLogic@da4.updateResourceWithIconState$lambda$3$$inlined$doOnPreDraw$1");
        try {
            aRunnableS57S0300000_24.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyTabLogic@da4.updateResourceWithIconState$lambda$3$$inlined$doOnPreDraw$1");
    }

    public static final void run$12(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesTopTabViewLifecycleObserver@fbd8.onViewCreated$1$1");
        try {
            ((SeriesTopTabVM) aRunnableS57S0300000_24.l1).LL.observe((C19EG) aRunnableS57S0300000_24.l2, new AObserverS221S0100000_17(new AObserverS226S0100000_24(((View) aRunnableS57S0300000_24.l0).findViewById(R.id.tv_tab_dot), 15), 56));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesTopTabViewLifecycleObserver@fbd8.onViewCreated$1$1");
    }

    public static final void run$13(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBubbleView@25.showBubble$2");
        try {
            aRunnableS57S0300000_24.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBubbleView@25.showBubble$2");
    }

    public static final void run$14(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("VibeEntranceInviteCell@4a6.initInvitePanelTopImage$1$onCompleted$1");
        try {
            ImageView imageView = ((C1575900r6y) aRunnableS57S0300000_24.l0).LLJ;
            if (imageView != null) {
                imageView.setImageDrawable(new BitmapDrawable(((Context) aRunnableS57S0300000_24.l2).getResources(), (Bitmap) aRunnableS57S0300000_24.l1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeEntranceInviteCell@4a6.initInvitePanelTopImage$1$onCompleted$1");
    }

    public static final void run$15(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("VibeEntranceInviteCell@4a6.initInvitePanelTopImage$2$onCompleted$1");
        try {
            LinearLayout linearLayout = ((C1575900r6y) aRunnableS57S0300000_24.l0).LLIZLLLIL;
            if (linearLayout != null) {
                linearLayout.setBackground(new BitmapDrawable(((Context) aRunnableS57S0300000_24.l2).getResources(), (Bitmap) aRunnableS57S0300000_24.l1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeEntranceInviteCell@4a6.initInvitePanelTopImage$2$onCompleted$1");
    }

    public static final void run$16(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("InboxPageWidgetContainer@c98.dispatchBindViewHolder$lambda$9$$inlined$doOnPreDraw$1");
        try {
            ((InboxPageWidgetContainer) aRunnableS57S0300000_24.l1).LLJJ.add((InboxWidget) aRunnableS57S0300000_24.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxPageWidgetContainer@c98.dispatchBindViewHolder$lambda$9$$inlined$doOnPreDraw$1");
    }

    public static final void run$17(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("EmptyRetryManager@4752.tryGetCachedUnreadResp$1$1$1");
        try {
            ((C09AJ) aRunnableS57S0300000_24.l1).onNext((FriendsFeedResponse) aRunnableS57S0300000_24.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EmptyRetryManager@4752.tryGetCachedUnreadResp$1$1$1");
    }

    public static final void run$18(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarStoryAnimator@f798.controlSelfPublishAnimation$1");
        try {
            ((C1608920ryE) aRunnableS57S0300000_24.l0).LJFF((AbstractC1606860ruu) aRunnableS57S0300000_24.l1, (Float) aRunnableS57S0300000_24.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarStoryAnimator@f798.controlSelfPublishAnimation$1");
    }

    public static final void run$19(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabAbilityAssem@1a05.updateTopTabs$7$1$1");
        try {
            TabAbilityAssem.so((TabAbilityAssem) aRunnableS57S0300000_24.l0, (EnumC1585090rLn) aRunnableS57S0300000_24.l1, (List) ((Pair) aRunnableS57S0300000_24.l2).getFirst(), (List) ((Pair) aRunnableS57S0300000_24.l2).getSecond());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabAbilityAssem@1a05.updateTopTabs$7$1$1");
    }

    public static final void run$2(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightTemplateCell@65d0.buildRing$runnable$1");
        try {
            aRunnableS57S0300000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightTemplateCell@65d0.buildRing$runnable$1");
    }

    public static final void run$20(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabAbilityAssem@1a05.updateTopTabsOrigin$1$1$1");
        try {
            TabAbilityAssem.so((TabAbilityAssem) aRunnableS57S0300000_24.l0, (EnumC1585090rLn) aRunnableS57S0300000_24.l1, (List) ((Pair) aRunnableS57S0300000_24.l2).getFirst(), (List) ((Pair) aRunnableS57S0300000_24.l2).getSecond());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabAbilityAssem@1a05.updateTopTabsOrigin$1$1$1");
    }

    public static final void run$21(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseResponseProcessor@86ee.process$1");
        try {
            try {
                ((C1601650rmV) aRunnableS57S0300000_24.l0).LIZIZ((C1601460rmC) aRunnableS57S0300000_24.l1, (FeedItemList) aRunnableS57S0300000_24.l2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseResponseProcessor@86ee.process$1");
    }

    public static final void run$3(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MFFeedAssem@a8b8.onViewCreated$4$1");
        try {
            C19EG c19eg = (C19EG) aRunnableS57S0300000_24.l0;
            C815730VzH.LIZ(new AwS268S0300000_24((ViewGroup) aRunnableS57S0300000_24.l2, (Fragment) aRunnableS57S0300000_24.l1, c19eg, 4));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MFFeedAssem@a8b8.onViewCreated$4$1");
    }

    public static final void run$4(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("EffectMobilePublishDetailAssem@e421.updateLayoutHeight$1");
        try {
            if (((C21578619ce) aRunnableS57S0300000_24.l0).getParent() != null) {
                C12ES.LJIIZILJ(-3, ((C21578619ce) aRunnableS57S0300000_24.l0).getHeight() - ((LinearLayout) aRunnableS57S0300000_24.l2).getHeight(), (View) aRunnableS57S0300000_24.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectMobilePublishDetailAssem@e421.updateLayoutHeight$1");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.tako.lazy.TakoLazyCache$addOwnerDestroyObserver$1] */
    public static final void run$5(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        LifecycleEventObserver lifecycleEventObserver;
        C1C7U.LIZ("TakoLazyCache@7fc7.put$1");
        try {
            C1564830qp7 c1564830qp7 = (C1564830qp7) aRunnableS57S0300000_24.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS57S0300000_24.l1;
            C1564850qp9 c1564850qp9 = (C1564850qp9) aRunnableS57S0300000_24.l2;
            c1564830qp7.getClass();
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new TakoLazyCache$addOwnerDestroyObserver$1(c1564830qp7, c1564850qp9, lifecycleOwner, c259800zU);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            T t = c259800zU.element;
            if (t == 0) {
                lifecycleEventObserver = null;
            } else {
                lifecycleEventObserver = (LifecycleEventObserver) t;
            }
            lifecycle.addObserver(lifecycleEventObserver);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLazyCache@7fc7.put$1");
    }

    public static final void run$6(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TakoLazyExtensionsKt@9cd8.triggerAllTakoLazy$1");
        try {
            AFwS264S0000000_24 aFwS264S0000000_24 = C1564870qpB.LIZIZ;
            if (aFwS264S0000000_24 != null) {
                aFwS264S0000000_24.invoke((CopyOnWriteArrayList) aRunnableS57S0300000_24.l0);
            }
            AFwS264S0000000_24 aFwS264S0000000_242 = C1564870qpB.LIZJ;
            if (aFwS264S0000000_242 != null) {
                aFwS264S0000000_242.invoke((CopyOnWriteArrayList) aRunnableS57S0300000_24.l1);
            }
            AFwS264S0000000_24 aFwS264S0000000_243 = C1564870qpB.LIZLLL;
            if (aFwS264S0000000_243 != null) {
                aFwS264S0000000_243.invoke((CopyOnWriteArrayList) aRunnableS57S0300000_24.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoLazyExtensionsKt@9cd8.triggerAllTakoLazy$1");
    }

    public static final void run$7(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ScopePerformanceVMKt@2a47.lazyAbilityInternal$1$1");
        try {
            aRunnableS57S0300000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScopePerformanceVMKt@2a47.lazyAbilityInternal$1$1");
    }

    public static final void run$8(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBarLogic@502f.updateViewOnline$3");
        try {
            ((C1592170rXD) aRunnableS57S0300000_24.l0).LJJLIIIJ((C1592950rYT) aRunnableS57S0300000_24.l1, (InterfaceC1583870rJp) aRunnableS57S0300000_24.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBarLogic@502f.updateViewOnline$3");
    }

    public static final void run$9(ARunnableS57S0300000_24 aRunnableS57S0300000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabBarLogic@502f.bindBottomTabTouchCoordinatorsAsync$1$1");
        try {
            aRunnableS57S0300000_24.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabBarLogic@502f.bindBottomTabTouchCoordinatorsAsync$1$1");
    }

    public ARunnableS57S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
