package X;

import Y.AAListenerS262S0200000_7;
import Y.AObjectS350S0100000_7;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS217S0200000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.feed.api.NearbyLoadingCancelChannel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveSkylightLoadingReportSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveSkylightOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.live.skylight.LiveSkylightMatchExperiment;
import com.ss.android.ugc.aweme.live.skylight.SkylightContainerManager$1;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS95S0110000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: renamed from: X.0Imu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC476820Imu {
    public static final /* synthetic */ int LJJLJ = 0;
    public final C19EG LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC477100InM LIZJ;
    public Object LIZLLL;
    public final EnumC471790Ien LJ;
    public float LJFF;
    public float LJI;
    public View LJII;
    public Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public C472280Ifa LJIILJJIL;
    public ViewGroup LJIILL;
    public FrameLayout LJIILLIIL;
    public ViewGroup LJIIZILJ;
    public View LJIJ;
    public ViewGroup LJIJI;
    public C477430Int LJIJJ;
    public ViewGroup LJIJJLI;
    public InterfaceC477170InT LJIL;
    public C422640Ghi LJJ;
    public InterfaceC473730Ihv LJJI;
    public ViewGroup LJJIFFI;
    public ViewGroup LJJII;
    public ViewGroup LJJIII;
    public LinearLayout LJJIIJ;
    public TextView LJJIIJZLJL;
    public View LJJIIZ;
    public EnterRoomConfig LJJIIZI;
    public ViewGroup LJJIJ;
    public ValueAnimator LJJIJIIJI;
    public ValueAnimator LJJIJIIJIL;
    public ValueAnimator LJJIJIL;
    public InterfaceC477240Ina LJJIL;
    public C477290Inf LJJJI;
    public C477750IoP LJJJIL;
    public C11JF LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public TopliveNoticeUnreadCountData LJJJJJL;
    public C477020InE LJJJJL;
    public C477050InH LJJJJLL;
    public boolean LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLZIJ;
    public BaseListResponse<FeedItem, FeedExtra> LJJJZ;
    public Boolean LJJLIIIIJ;
    public final AObjectS350S0100000_7 LJJLIIIJ;
    public C476840Imw LJJLIIIJILLIZJL;
    public AnonymousClass0956 LJJLIIIJJI;
    public final AObjectS350S0100000_7 LJJLIIIJJIZ;
    public final AObjectS350S0100000_7 LJJLIIIJL;
    public final AObjectS350S0100000_7 LJJLIIIJLJLI;
    public final C01GW LJJLIIIJLLLLLLLZ;
    public final C01GW LJJLIIJ;
    public final C01GW LJJLIL;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 604));
    public final float LJIIL = (int) C497740JfY.LIZIZ(C474850Ijj.LIZLLL());
    public final float LJIILIIL = (int) C497740JfY.LIZIZ(12.0f);
    public boolean LJJIJL = true;
    public final C01GW LJJIJLIJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(256));
    public final C01GW LJJIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(254));
    public final C01GW LJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 600));
    public final BPEAHandler LJJJJ = new BPEAHandler(Looper.getMainLooper());
    public final C477010InD LJJJJLI = new InterfaceC472640IgA() { // from class: X.0InD
        @Override // X.InterfaceC472640IgA
        public final boolean LIZ() {
            return this.LIZ.LJJJJZI;
        }

        @Override // X.InterfaceC472640IgA
        public final void LIZLLL() {
            this.LIZ.LJJIII(false, true, EnumC476920In4.NULL, EnumC476910In3.OTHER_ROOM_ACTION, false);
        }

        @Override // X.InterfaceC472640IgA
        public final void LJFF(List<? extends FeedItem> list) {
            this.LIZ.LJIILIIL(list);
        }
    };
    public boolean LJJJLL = true;
    public long LJJL = -1;
    public long LJJLI = -1;

    public abstract C476930In5 LIZJ();

    public abstract void LJIIJJI(EnumC476910In3 enumC476910In3);

    public abstract void LJIILIIL(List<? extends FeedItem> list);

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILL() {
        C472450Ifr c472450Ifr;
        C0IS1<C0IR0> c0is1;
        InterfaceC476860Imy interfaceC476860ImyLIZLLL;
        this.LJJJJZI = false;
        this.LJJJLL = true;
        this.LJJIJL = true;
        InterfaceC476860Imy interfaceC476860ImyLIZLLL2 = LIZLLL();
        if (interfaceC476860ImyLIZLLL2 != null) {
            interfaceC476860ImyLIZLLL2.LIZJ((C0IVA) this.LJJLIIIJLLLLLLLZ.getValue());
        }
        InterfaceC476860Imy interfaceC476860ImyLIZLLL3 = LIZLLL();
        if (interfaceC476860ImyLIZLLL3 != null) {
            interfaceC476860ImyLIZLLL3.LIZJ(LIZJ());
        }
        C477050InH c477050InH = this.LJJJJLL;
        if (c477050InH != null && (interfaceC476860ImyLIZLLL = LIZLLL()) != null) {
            interfaceC476860ImyLIZLLL.LIZJ(c477050InH);
        }
        EnumC477310Inh enumC477310Inh = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.LJJJJLL = null;
        InterfaceC476860Imy interfaceC476860ImyLIZLLL4 = LIZLLL();
        if (interfaceC476860ImyLIZLLL4 != null) {
            interfaceC476860ImyLIZLLL4.LJIILL();
        }
        C422640Ghi c422640Ghi = this.LJJ;
        if (c422640Ghi != null) {
            c422640Ghi.setDisallowInterceptTouchCallback(null);
        }
        this.LJJJJ.removeCallbacksAndMessages(null);
        C476840Imw c476840Imw = this.LJJLIIIJILLIZJL;
        if (c476840Imw != null) {
            ViewGroup viewGroup = c476840Imw.LIZ;
            if (viewGroup != null) {
                viewGroup.removeOnLayoutChangeListener(c476840Imw.LJIIL);
            }
            c476840Imw.LJIIL = null;
        }
        C11JF c11jf = this.LJJJJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        InterfaceC473730Ihv interfaceC473730Ihv = this.LJJI;
        if (interfaceC473730Ihv != null && (c472450Ifr = ((C477190InV) interfaceC473730Ihv).LLIZ) != null && Intrinsics.LJFF(c472450Ifr.LL, C472490Ifv.LIZIZ) && (c0is1 = c472450Ifr.LLJ) != null) {
            c0is1.LIZ();
        }
        Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> observer = this.LJIIIIZZ;
        if (observer != null) {
            InterfaceC475140IkC interfaceC475140IkCLJ = LJ();
            if (interfaceC475140IkCLJ != null) {
                interfaceC475140IkCLJ.LJ(observer);
            }
            InterfaceC475140IkC interfaceC475140IkCLJ2 = LJ();
            if (interfaceC475140IkCLJ2 != null) {
                interfaceC475140IkCLJ2.LJI("release");
            }
        }
        LJIILLIIL();
        AnonymousClass0956 anonymousClass0956 = this.LJJLIIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJLIIIJJI = null;
        C477290Inf c477290Inf = this.LJJJI;
        if (c477290Inf != null) {
            c477290Inf.LIZIZ.setValue(Boolean.FALSE);
            c477290Inf.LIZJ.setValue(new C477280Ine(false, enumC477310Inh, (Long) (objArr2 == true ? 1 : 0), (String) (objArr == true ? 1 : 0), 30));
            C477450Inv.LIZLLL(c477290Inf);
            C11JF c11jf2 = c477290Inf.LJ;
            if (c11jf2 != null) {
                C500260Jjc.LJJLIIIJLJLI(c11jf2);
            }
            c477290Inf.LJ = null;
            C500260Jjc.LJJLIIIJLJLI(c477290Inf.LJFF);
        }
        this.LJJJI = null;
        this.LIZLLL = null;
        this.LJJIL = null;
        this.LJIL = null;
        C477020InE c477020InE = this.LJJJJL;
        if (c477020InE != null) {
            c477020InE.LLJILLL = null;
        }
        this.LJJJJL = null;
    }

    public abstract EnumC477350Inl LJJI();

    public final void LIZ() {
        if (this.LJJJJJ) {
            return;
        }
        InterfaceC477240Ina interfaceC477240Ina = this.LJJIL;
        if (Intrinsics.LJFF(interfaceC477240Ina != null ? ((C476890In1) interfaceC477240Ina).LIZIZ.LLJ.LJI() : null, "hangout") && HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("SkylightContainer", "intercept because of hangout page");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept fail, getCurrentSelectTabName: ");
        InterfaceC477240Ina interfaceC477240Ina2 = this.LJJIL;
        sbLIZ.append(interfaceC477240Ina2 != null ? ((C476890In1) interfaceC477240Ina2).LIZIZ.LLJ.LJI() : null);
        C20441214yg.LIZIZ("SkylightContainer", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIL(10000L, this.LJJJJ, new ARunnableS107S0100000_7(this, 173));
    }

    public final InterfaceC476860Imy LIZLLL() {
        return (InterfaceC476860Imy) this.LJJIZ.getValue();
    }

    public final InterfaceC475140IkC LJ() {
        return (InterfaceC475140IkC) this.LJJJ.getValue();
    }

    public final float LJFF() {
        return this.LJIIL + this.LJFF + this.LJI + this.LJIIIZ + this.LJIIJ + ((Number) this.LJIIJJI.getValue()).floatValue();
    }

    public final boolean LJIIIZ() {
        ValueAnimator valueAnimator = this.LJJIJIIJI;
        return (valueAnimator != null && valueAnimator.isRunning()) || !this.LJJJJZI;
    }

    public final void LJIIJ() {
        C476840Imw c476840Imw = this.LJJLIIIJILLIZJL;
        if (c476840Imw != null) {
            AbstractC477250Inb abstractC477250Inb = c476840Imw.LJI;
            if (abstractC477250Inb != null) {
                abstractC477250Inb.LJI();
            }
            AbstractC477260Inc abstractC477260Inc = c476840Imw.LJII;
            if (abstractC477260Inc != null) {
                abstractC477260Inc.LIZJ();
            }
        }
    }

    public final void LJIILLIIL() {
        C476840Imw c476840Imw = this.LJJLIIIJILLIZJL;
        if (c476840Imw != null) {
            ViewGroup viewGroup = c476840Imw.LIZ;
            if (viewGroup != null) {
                viewGroup.removeOnLayoutChangeListener(c476840Imw.LJIIL);
            }
            c476840Imw.LJIIL = null;
        }
        this.LJFF = 0.0f;
        C500260Jjc.LJIILIIL(this.LJII);
        this.LJJJLIIL = false;
        if (this.LJJJJZI) {
            ViewGroup viewGroup2 = this.LJIILL;
            if (Intrinsics.LIZLLL(viewGroup2 != null ? Float.valueOf(viewGroup2.getTranslationY()) : null, LJFF())) {
                return;
            }
            LJIIZILJ();
        }
    }

    public final void LJIIZILJ() {
        ViewGroup viewGroup = this.LJIILL;
        if (viewGroup != null) {
            C786410Ut5.bd(LJFF(), viewGroup);
        }
        LJJII();
    }

    public final void LJIJ() {
        if (C474850Ijj.LIZ(this.LJ)) {
            LJIJJLI();
        } else {
            LJI(true);
        }
        InterfaceC477170InT interfaceC477170InT = this.LJIL;
        if (interfaceC477170InT != null) {
            interfaceC477170InT.r(true);
        }
        C422640Ghi c422640Ghi = this.LJJ;
        if (c422640Ghi != null) {
            C12ES.LJIILL(0, c422640Ghi);
        }
    }

    public final void LJIJJLI() {
        C500260Jjc.LLFFF(this.LJJII);
        C500260Jjc.LLFFF(this.LJIIZILJ);
        LJJIIZI(8);
    }

    public final boolean LJJ() {
        return (LiveTopLiveNotificationSetting.INSTANCE.getEnable() || LiveWatchLaterSettingSetting.INSTANCE.getValue() == 1 || LiveTopLiveSkylightOptSetting.INSTANCE.getEnable()) && !Intrinsics.LJFF(this.LJJLIIIIJ, Boolean.TRUE);
    }

    public final void LJJII() {
        View view = this.LJIJ;
        if (view != null) {
            ViewGroup viewGroup = this.LJIILL;
            C786410Ut5.ed(view, viewGroup != null ? viewGroup.getTranslationY() : 0.0f);
        }
    }

    public final void LJJIIZ() {
        List<FeedItem> list;
        InterfaceC476860Imy interfaceC476860ImyLIZLLL;
        FeedExtra feedExtra = null;
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIL = (!C474850Ijj.LIZ(this.LJ) || (interfaceC476860ImyLIZLLL = LIZLLL()) == null) ? null : interfaceC476860ImyLIZLLL.LJIIL(this.LJ, Boolean.FALSE);
        if (Intrinsics.LJFF(baseListResponseLJIIL, this.LJJJZ)) {
            return;
        }
        InterfaceC473730Ihv interfaceC473730Ihv = this.LJJI;
        if (interfaceC473730Ihv != null) {
            if (baseListResponseLJIIL != null) {
                list = baseListResponseLJIIL.data;
                feedExtra = (FeedExtra) baseListResponseLJIIL.extra;
            } else {
                list = null;
            }
            ((C477190InV) interfaceC473730Ihv).LIZLLL(list, feedExtra);
        }
        this.LJJJZ = baseListResponseLJIIL;
    }

    public final void LJIIIIZZ() {
        if (LiveSkylightNearByEntranceSetting.entranceEnable()) {
            LJIILLIIL();
            InterfaceC477240Ina interfaceC477240Ina = this.LJJIL;
            EnterRoomConfig enterRoomConfigLIZ = interfaceC477240Ina != null ? ((C476890In1) interfaceC477240Ina).LIZ() : null;
            if (enterRoomConfigLIZ != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZ.mRoomsData;
                if (!LiveInfeedSkylightEntranceSetting.matchNearbyEntrance(roomsData.enterFromMerge, roomsData.enterMethod)) {
                    return;
                }
            }
            TopLiveSkylightNearbyStyle topLiveSkylightNearbyStyle = TopLiveSkylightNearbyStyle.INSTANCE;
            if ((!topLiveSkylightNearbyStyle.invoke().getUseIpLocation()) && !C474920Ijq.LIZ(this.LIZ) && (!LiveSkylightNearByEntranceSetting.enableBanner() || topLiveSkylightNearbyStyle.invoke().getStyle() != 1)) {
                if (!LiveSkylightNearByEntranceSetting.enableRequestLocation() || C474850Ijj.LIZJ() == null || InterfaceC1106030et7.q4.LIZIZ().intValue() >= C474870Ijl.LIZIZ || LiveNearbyTabSetting.INSTANCE.getValue().enable) {
                    return;
                }
                LJII(false);
                return;
            }
            InterfaceC475140IkC interfaceC475140IkCLJ = LJ();
            if (interfaceC475140IkCLJ != null && interfaceC475140IkCLJ.LIZJ(this.LIZ)) {
                LJII(false);
                return;
            }
            C20441214yg.LJIIIZ("SkylightContainer", "registerNearbyListener");
            Observer<Pair<Integer, BaseListResponse<FeedItem, FeedExtra>>> aObserverS211S0100000_7 = this.LJIIIIZZ;
            if (aObserverS211S0100000_7 == null) {
                aObserverS211S0100000_7 = new AObserverS211S0100000_7(this, 35);
            }
            this.LJIIIIZZ = aObserverS211S0100000_7;
            InterfaceC475140IkC interfaceC475140IkCLJ2 = LJ();
            if (interfaceC475140IkCLJ2 != null) {
                interfaceC475140IkCLJ2.LJFF(aObserverS211S0100000_7);
            }
        }
    }

    public final void LJI(boolean z) {
        if (z) {
            if (LJJ()) {
                C500260Jjc.LLFFF(this.LJJII);
                C500260Jjc.LJIILIIL(this.LJIIZILJ);
            } else {
                C500260Jjc.LJIILIIL(this.LJJII);
            }
            LJJIIZI(0);
            return;
        }
        C500260Jjc.LJIILIIL(this.LJJII);
        LJJIIZI(8);
    }

    public final void LJII(boolean z) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIIIZZ;
        ValueAnimator valueAnimator;
        Object obj;
        ValueAnimator valueAnimator2;
        ViewGroup.LayoutParams layoutParams;
        C476840Imw c476840Imw = this.LJJLIIIJILLIZJL;
        Float fValueOf = null;
        if (!(c476840Imw instanceof C476840Imw)) {
            if (c476840Imw != null) {
                c476840Imw.LIZJ();
            }
            this.LJII = null;
            this.LJJLIIIJILLIZJL = new C476840Imw(this.LJJ, this.LJ, new C477090InL(this));
        }
        C476840Imw c476840Imw2 = this.LJJLIIIJILLIZJL;
        if (c476840Imw2 == null) {
            return;
        }
        View view = this.LJII;
        if (view == null) {
            if (!c476840Imw2.LIZJ) {
                c476840Imw2.LIZJ = true;
                ViewGroup viewGroup = c476840Imw2.LIZ;
                if (viewGroup != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
            }
            ViewGroup viewGroup2 = c476840Imw2.LIZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            view = c476840Imw2.LIZ;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((Number) this.LJJIJLIJ.getValue()).intValue();
                C786410Ut5.W5(view, layoutParams);
            }
        }
        this.LJII = view;
        InterfaceC475140IkC interfaceC475140IkCLJ = LJ();
        if (interfaceC475140IkCLJ != null) {
            baseListResponseLJIIIIZZ = interfaceC475140IkCLJ.LJIIIIZZ();
        } else {
            baseListResponseLJIIIIZZ = null;
        }
        c476840Imw2.LIZIZ(baseListResponseLJIIIIZZ);
        C500260Jjc.LLFFF(this.LJII);
        if (c476840Imw2.LIZ() == 0.0f) {
            AwS95S0110000_7 awS95S0110000_7 = new AwS95S0110000_7(this, z, 1);
            ViewGroup viewGroup3 = c476840Imw2.LIZ;
            if (viewGroup3 != null) {
                ViewOnLayoutChangeListenerC521670Kd3 viewOnLayoutChangeListenerC521670Kd3 = new ViewOnLayoutChangeListenerC521670Kd3(c476840Imw2, awS95S0110000_7, 3);
                c476840Imw2.LJIIL = viewOnLayoutChangeListenerC521670Kd3;
                viewGroup3.addOnLayoutChangeListener(viewOnLayoutChangeListenerC521670Kd3);
                return;
            }
            return;
        }
        float fLIZ = c476840Imw2.LIZ();
        this.LJJJLIIL = true;
        if (z && this.LJJJJZI && (valueAnimator2 = this.LJJIJIIJI) != null && !valueAnimator2.isRunning()) {
            LJIIJ();
            ValueAnimator valueAnimator3 = this.LJJIJIIJIL;
            if (valueAnimator3 == null) {
                this.LJJIJIIJIL = ValueAnimator.ofFloat(0.0f, fLIZ);
            } else {
                valueAnimator3.cancel();
                ValueAnimator valueAnimator4 = this.LJJIJIIJIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.setFloatValues(0.0f, fLIZ);
                }
                ValueAnimator valueAnimator5 = this.LJJIJIIJIL;
                if (valueAnimator5 != null) {
                    valueAnimator5.removeAllListeners();
                }
                ValueAnimator valueAnimator6 = this.LJJIJIIJIL;
                if (valueAnimator6 != null) {
                    valueAnimator6.removeAllUpdateListeners();
                }
            }
            ValueAnimator valueAnimator7 = this.LJJIJIIJIL;
            if (valueAnimator7 != null) {
                valueAnimator7.setInterpolator(new LinearInterpolator());
            }
            ValueAnimator valueAnimator8 = this.LJJIJIIJIL;
            if (valueAnimator8 != null) {
                valueAnimator8.setDuration(300L);
            }
            C817403Hg c817403Hg = new C817403Hg();
            ValueAnimator valueAnimator9 = this.LJJIJIIJIL;
            if (valueAnimator9 != null) {
                valueAnimator9.addUpdateListener(new AUListenerS217S0200000_7(c817403Hg, this, 5));
            }
            ValueAnimator valueAnimator10 = this.LJJIJIIJIL;
            if (valueAnimator10 != null) {
                valueAnimator10.addListener(new AAListenerS262S0200000_7(this, c476840Imw2, 6));
            }
            ValueAnimator valueAnimator11 = this.LJJIJIIJIL;
            if (valueAnimator11 != null) {
                valueAnimator11.start();
            }
        } else {
            this.LJFF = c476840Imw2.LIZ();
            InterfaceC477240Ina interfaceC477240Ina = this.LJJIL;
            if (interfaceC477240Ina != null) {
                ((C476890In1) interfaceC477240Ina).LIZIZ(LJFF());
            }
            if (this.LJJJJZI) {
                ViewGroup viewGroup4 = this.LJIILL;
                if (viewGroup4 != null) {
                    fValueOf = Float.valueOf(viewGroup4.getTranslationY());
                }
                if (!Intrinsics.LIZLLL(fValueOf, LJFF()) && (valueAnimator = this.LJJIJIIJI) != null && !valueAnimator.isRunning()) {
                    LJIIZILJ();
                    LJIIJ();
                }
            }
        }
        if (LiveNearbyTabSetting.INSTANCE.getValue().enable) {
            obj = this.LIZLLL;
        } else {
            if (((Boolean) C285820BIe.LIZ.getValue()).booleanValue()) {
                obj = this;
                DataChannelGlobal.LLILZ.BQ2(obj, this.LIZIZ, NearbyLoadingCancelChannel.class, new AwS586S0100000_7(this, 364));
                c476840Imw2.LIZIZ = new AwS373S0200000_7(this, c476840Imw2, 46);
            }
            obj = this.LIZ;
        }
        if (obj != null) {
            DataChannelGlobal.LLILZ.BQ2(obj, this.LIZIZ, NearbyLoadingCancelChannel.class, new AwS586S0100000_7(this, 364));
        }
        c476840Imw2.LIZIZ = new AwS373S0200000_7(this, c476840Imw2, 46);
    }

    public void LJIIL(EnumC476920In4 enumC476920In4) {
        String str;
        boolean z;
        Integer numValueOf;
        int iLJIIZILJ;
        int i = C476990InB.LIZ[enumC476920In4.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    str = "";
                } else {
                    str = "click";
                }
            } else {
                str = "pull_down";
            }
        } else {
            str = "auto";
        }
        LiveSkylightStyleSetting liveSkylightStyleSetting = LiveSkylightStyleSetting.INSTANCE;
        int iLJIIIZ = 0;
        if (!liveSkylightStyleSetting.enableStyleV2() && TopLiveSkylightNearbyStyle.INSTANCE.invoke().getShowLocation()) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf2 = null;
        if (z) {
            InterfaceC476860Imy interfaceC476860ImyLIZLLL = LIZLLL();
            if (interfaceC476860ImyLIZLLL != null) {
                iLJIIZILJ = interfaceC476860ImyLIZLLL.LJIIZILJ(this.LJ);
            } else {
                iLJIIZILJ = 0;
            }
            numValueOf = Integer.valueOf(iLJIIZILJ);
        } else {
            numValueOf = null;
        }
        EnumC471790Ien enumC471790Ien = this.LJ;
        if (liveSkylightStyleSetting.getValue().showFollowBtn && enumC471790Ien != EnumC471790Ien.NEARBY) {
            InterfaceC476860Imy interfaceC476860ImyLIZLLL2 = LIZLLL();
            if (interfaceC476860ImyLIZLLL2 != null) {
                iLJIIIZ = interfaceC476860ImyLIZLLL2.LJIIIZ(this.LJ);
            }
            numValueOf2 = Integer.valueOf(iLJIIIZ);
        }
        C474500IjA c474500IjALIZJ = C0IJT.LIZJ("enter_topwindow");
        c474500IjALIZJ.LJJII("live_merge", "enter_from");
        c474500IjALIZJ.LJJII(str, "enter_method");
        c474500IjALIZJ.LJJII(numValueOf, "nearby_live_cnt");
        c474500IjALIZJ.LJJII(numValueOf2, "maf_live_cnt");
        c474500IjALIZJ.LIZ();
    }

    public final void LJIJI(boolean z) {
        ViewGroup viewGroup = this.LJIILL;
        if (viewGroup == null || z == this.LJJJJZ) {
            return;
        }
        this.LJJJJZ = z;
        if (z) {
            viewGroup.setOutlineProvider((ViewOutlineProvider) this.LJJLIIJ.getValue());
            viewGroup.setClipToOutline(true);
        } else {
            viewGroup.setOutlineProvider(null);
            viewGroup.setClipToOutline(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.InterfaceC473730Ihv r13) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC476820Imu.LJIJJ(X.0Ihv):void");
    }

    public final void LJIL(float f) {
        C472280Ifa c472280Ifa;
        if (this.LJ != EnumC471790Ien.NEARBY && this.LJJJLL && this.LJIILL != null) {
            this.LJJJLL = false;
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.p4;
            if (!c20337914i1.LIZIZ().booleanValue() || (c472280Ifa = this.LJIILJJIL) == null) {
                return;
            }
            if (this.LJJIIZ == null) {
                this.LJJIIZ = C786410Ut5.Td(C786410Ut5.ne(c472280Ifa.getContext()), R.layout.djf, c472280Ifa, false);
            }
            View view = this.LJJIIZ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c472280Ifa, view);
            c472280Ifa.removeView(view);
            c472280Ifa.addView(this.LJJIIZ);
            View view2 = this.LJJIIZ;
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
            View view3 = this.LJJIIZ;
            if (view3 != null) {
                C786410Ut5.ed(view3, f);
            }
            c20337914i1.LJFF(Boolean.FALSE);
            C0IJT.LIZ("livesdk_toplive_following_cover_guide_show").LIZ();
        }
    }

    public final void LJJIIZI(int i) {
        InterfaceC476860Imy interfaceC476860ImyLIZIZ;
        String str;
        LiveMode streamType;
        View viewLJLLLL;
        LinearLayout linearLayout;
        ViewStub viewStub;
        ViewGroup viewGroup = this.LJJIII;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(i, viewGroup);
        }
        if (!LiveSkylightMatchExperiment.INSTANCE.enable() || i != 0) {
            return;
        }
        if (!C474850Ijj.LIZ(this.LJ) && (interfaceC476860ImyLIZIZ = C474850Ijj.LIZIZ()) != null && ((CommonSkylightDataManager) interfaceC476860ImyLIZIZ).LJIL()) {
            String strLIZ = null;
            if (this.LJJIIJ == null) {
                C422640Ghi c422640Ghi = this.LJJ;
                if (c422640Ghi != null && (viewStub = (ViewStub) c422640Ghi.findViewById(R.id.view_stub_loading_container)) != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } else {
                    viewLJLLLL = null;
                }
                if (viewLJLLLL instanceof LinearLayout) {
                    linearLayout = (LinearLayout) viewLJLLLL;
                } else {
                    linearLayout = null;
                }
                this.LJJIIJ = linearLayout;
            }
            LinearLayout linearLayout2 = this.LJJIIJ;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            TextView textView = this.LJJIIJZLJL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            if (LiveSkylightLoadingReportSetting.INSTANCE.enable()) {
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                    str = "anchor";
                } else {
                    UserAttr userAttr = currentUser.getUserAttr();
                    if (userAttr != null && userAttr.isAdmin) {
                        str = "admin";
                    } else {
                        str = "viewer";
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_skylight_loading_status_show");
                Room roomLJJLI = C500260Jjc.LJJLI();
                if (roomLJJLI != null && (streamType = roomLJJLI.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                }
                c474500IjALIZ.LJJII(strLIZ, "live_type");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII(str, "user_type");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                c474500IjALIZ.LIZ();
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.LJJIIJ;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
        TextView textView2 = this.LJJIIJZLJL;
        if (textView2 == null) {
            return;
        }
        C786410Ut5.LLIL(textView2, 0);
    }

    public final void LJJIJIIJI(boolean z) {
        int i;
        if (!HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            return;
        }
        if (z) {
            i = R.attr.zm;
        } else {
            i = R.attr.kd;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, C1834150xpV.LJII(this.LIZ));
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(this.LIZ);
            tuxImmersionBarLJ.LJIIIZ(iIntValue);
            tuxImmersionBarLJ.LIZLLL();
        }
    }

    public final void LJJIJIIJIL(float f) {
        ViewGroup viewGroup = this.LJIILL;
        if (viewGroup == null) {
            return;
        }
        float translationY = viewGroup.getTranslationY() + f;
        if (0.0f <= translationY && translationY <= LJFF()) {
            C786410Ut5.bd(translationY, viewGroup);
            LJJII();
        }
    }

    public final boolean LIZIZ(Rect rect, MotionEvent motionEvent) {
        if (((Boolean) this.LJJLIL.getValue()).booleanValue()) {
            return rect.contains((int) motionEvent.getX(), (int) (motionEvent.getY() + C497740JfY.LJIJ()));
        }
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void LJJIFFI(final Function0 function0, boolean z) {
        ViewGroup viewGroup;
        final float fLIZIZ;
        if (LJIIIZ() || (viewGroup = this.LJJIFFI) == null) {
            return;
        }
        float translationY = viewGroup.getTranslationY();
        if (z) {
            fLIZIZ = C418440Gaw.LIZIZ(40);
        } else {
            fLIZIZ = 0.0f;
        }
        ValueAnimator valueAnimator = this.LJJIJIL;
        if (valueAnimator == null) {
            this.LJJIJIL = ValueAnimator.ofFloat(translationY, fLIZIZ);
        } else {
            valueAnimator.cancel();
            ValueAnimator valueAnimator2 = this.LJJIJIL;
            if (valueAnimator2 != null) {
                valueAnimator2.setFloatValues(translationY, fLIZIZ);
            }
            ValueAnimator valueAnimator3 = this.LJJIJIL;
            if (valueAnimator3 != null) {
                valueAnimator3.removeAllListeners();
            }
            ValueAnimator valueAnimator4 = this.LJJIJIL;
            if (valueAnimator4 != null) {
                valueAnimator4.removeAllUpdateListeners();
            }
        }
        ValueAnimator valueAnimator5 = this.LJJIJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator6 = this.LJJIJIL;
        if (valueAnimator6 != null) {
            valueAnimator6.setDuration(300L);
        }
        C817403Hg c817403Hg = new C817403Hg();
        ValueAnimator valueAnimator7 = this.LJJIJIL;
        if (valueAnimator7 != null) {
            valueAnimator7.addUpdateListener(new AUListenerS217S0200000_7(c817403Hg, this, 7));
        }
        ValueAnimator valueAnimator8 = this.LJJIJIL;
        if (valueAnimator8 != null) {
            valueAnimator8.addListener(new Animator.AnimatorListener() { // from class: X.0InG
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AbstractC476820Imu abstractC476820Imu = this.LL;
                    float f = fLIZIZ;
                    abstractC476820Imu.LJI = f;
                    ViewGroup viewGroup2 = abstractC476820Imu.LJJIFFI;
                    if (viewGroup2 != null) {
                        C786410Ut5.bd(f, viewGroup2);
                    }
                    this.LL.LJIIZILJ();
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
        ValueAnimator valueAnimator9 = this.LJJIJIL;
        if (valueAnimator9 != null) {
            valueAnimator9.start();
        }
    }

    public final void LJJIIJZLJL(View view, float f) {
        if (view == null) {
            return;
        }
        float translationY = view.getTranslationY() + f;
        if (0.0f <= translationY && translationY <= LJFF()) {
            C786410Ut5.ed(view, translationY);
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0InD] */
    public AbstractC476820Imu(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC477100InM interfaceC477100InM, Object obj) {
        this.LIZ = c19gs;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC477100InM;
        this.LIZLLL = obj;
        this.LJ = interfaceC477100InM.getPage();
        lifecycleOwner.getLifecycle().addObserver(new SkylightContainerManager$1(this));
        this.LJJLIIIJ = new AObjectS350S0100000_7(this, 90);
        this.LJJLIIIJJIZ = new AObjectS350S0100000_7(this, 91);
        this.LJJLIIIJL = new AObjectS350S0100000_7(this, 89);
        this.LJJLIIIJLJLI = new AObjectS350S0100000_7(this, 88);
        this.LJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 603));
        this.LJJLIIJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 602));
        this.LJJLIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(255));
    }

    public static void LJJIJ(AbstractC476820Imu abstractC476820Imu, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        abstractC476820Imu.getClass();
        if (num != null) {
            abstractC476820Imu.LJIIIZ = C418440Gaw.LIZIZ(Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            abstractC476820Imu.LJIIJ = C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue()));
        }
        if (num != null || num2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateMultiGuestApplyHeight: statusHeightDp=");
            sbLIZ.append(num);
            sbLIZ.append(", bannerHeightDp=");
            sbLIZ.append(num2);
            C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", C2188811AlT.LIZIZ(sbLIZ));
            if (abstractC476820Imu.LJJJJZI) {
                ValueAnimator valueAnimator = abstractC476820Imu.LJJIJIIJI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    return;
                }
                abstractC476820Imu.LJIIZILJ();
            }
        }
    }

    public void LJJIII(final boolean z, final boolean z2, final EnumC476920In4 enumC476920In4, final EnumC476910In3 enumC476910In3, final boolean z3) {
        float fLIZ;
        final ViewGroup viewGroup = this.LJIILL;
        if (viewGroup == null) {
            return;
        }
        View view = this.LJJIIZ;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        if (z) {
            LJIJ();
            LJIJI(true);
            LJJIJIIJI(false);
        }
        float translationY = viewGroup.getTranslationY();
        float fLJFF = 0.0f;
        if (this.LJJJLIIL) {
            ValueAnimator valueAnimator = this.LJJIJIIJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C476840Imw c476840Imw = this.LJJLIIIJILLIZJL;
            if (c476840Imw != null) {
                fLIZ = c476840Imw.LIZ();
            } else {
                fLIZ = 0.0f;
            }
            this.LJFF = fLIZ;
        }
        if (z) {
            fLJFF = LJFF();
        }
        ValueAnimator valueAnimator2 = this.LJJIJIIJI;
        if (valueAnimator2 == null) {
            this.LJJIJIIJI = ValueAnimator.ofFloat(translationY, fLJFF);
        } else {
            valueAnimator2.setFloatValues(translationY, fLJFF);
        }
        ValueAnimator valueAnimator3 = this.LJJIJIIJI;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LJJIJIIJI;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator5 = this.LJJIJIIJI;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllListeners();
        }
        ValueAnimator valueAnimator6 = this.LJJIJIIJI;
        if (valueAnimator6 != null) {
            valueAnimator6.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator7 = this.LJJIJIIJI;
        if (valueAnimator7 != null) {
            valueAnimator7.setDuration((long) ((Math.abs(translationY - fLJFF) / LJFF()) * 300.0f));
        }
        ValueAnimator valueAnimator8 = this.LJJIJIIJI;
        if (valueAnimator8 != null) {
            valueAnimator8.addUpdateListener(new AUListenerS217S0200000_7(viewGroup, this, 6));
        }
        ValueAnimator valueAnimator9 = this.LJJIJIIJI;
        if (valueAnimator9 != null) {
            valueAnimator9.addListener(new AnimatorListenerAdapter() { // from class: X.0In2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    float fLJFF2;
                    if (z) {
                        fLJFF2 = this.LJFF();
                    } else {
                        fLJFF2 = 0.0f;
                    }
                    C786410Ut5.bd(fLJFF2, viewGroup);
                    this.LJJII();
                    this.LJIILJJIL(z, fLJFF2, enumC476920In4, enumC476910In3, false, z3);
                    DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.FALSE);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onAnimationStart(android.animation.Animator r10) {
                    /*
                        r9 = this;
                        com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
                        java.lang.Class<com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent> r1 = com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent.class
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        r2.FQ2(r1, r0)
                        boolean r0 = r1
                        if (r0 == 0) goto L2a
                        r6 = -3
                    Lf:
                        X.0Imu r0 = r2
                        boolean r4 = r3
                        boolean r5 = r4
                        r0.getClass()
                        java.lang.Class<com.bytedance.android.feed.api.TopLiveClearModelChannel> r1 = com.bytedance.android.feed.api.TopLiveClearModelChannel.class
                        X.0Ikq r3 = new X.0Ikq
                        android.view.ViewGroup r0 = r0.LJIJI
                        if (r0 == 0) goto L28
                        r8 = 1
                    L21:
                        r3.<init>(r4, r5, r6, r8)
                        r2.HQ2(r1, r3)
                        return
                    L28:
                        r8 = 0
                        goto L21
                    L2a:
                        X.0Imu r0 = r2
                        X.0Ina r1 = r0.LJJIL
                        if (r1 == 0) goto L41
                        X.0In1 r1 = (X.C476890In1) r1
                        com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r1.LIZ()
                        if (r0 == 0) goto L41
                        com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r1.LIZ()
                        com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
                        long r6 = r0.roomId
                        goto Lf
                    L41:
                        r6 = 0
                        goto Lf
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C476900In2.onAnimationStart(android.animation.Animator):void");
                }
            });
        }
        if (z2) {
            ValueAnimator valueAnimator10 = this.LJJIJIIJI;
            if (valueAnimator10 != null) {
                valueAnimator10.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator11 = this.LJJIJIIJI;
        if (valueAnimator11 == null) {
            return;
        }
        valueAnimator11.end();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIILJJIL(boolean r13, float r14, X.EnumC476920In4 r15, X.EnumC476910In3 r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC476820Imu.LJIILJJIL(boolean, float, X.0In4, X.0In3, boolean, boolean):void");
    }
}
