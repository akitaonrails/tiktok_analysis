package Y;

import X.AbstractC21342018fa;
import X.AnimationAnimationListenerC1123830fLp;
import X.AnimationAnimationListenerC1151570g4Z;
import X.C013C;
import X.C0VRR;
import X.C10CQ;
import X.C1102500enQ;
import X.C1102510enR;
import X.C1102530enT;
import X.C1102580enY;
import X.C1116210f9X;
import X.C1116220f9Y;
import X.C1117370fBP;
import X.C1124540fMy;
import X.C1127390fRZ;
import X.C1127440fRe;
import X.C1389890mGx;
import X.C13LP;
import X.C1954807lC;
import X.C197039127h;
import X.C19719512Dh;
import X.C19EG;
import X.C2093608Ic;
import X.C21342318fd;
import X.C354201Zc;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770580UKq;
import X.C781570UlH;
import X.C783190Unt;
import X.C786410Ut5;
import X.EnumC1102570enX;
import X.EnumC1102740eno;
import X.InterfaceC1124060fMC;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC19207210Cg;
import Y.ARunnableS11S0500000_17;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotController;
import com.bytedance.android.live.slot.HighPrioritySlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog;
import com.bytedance.android.livesdk.livesetting.slot.LivePinCardCheckCurrentBusinessSetting;
import com.bytedance.android.livesdk.slot.FrameL2SlotBizVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateConfirmationFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AObserverS181S0200000_17 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        List list = (List) obj;
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj2 = ListProtector.get(list, i);
            i++;
            ((C1116210f9X) obj2).LLJILLL = i;
            arrayList.add(obj2);
        }
        C1117370fBP c1117370fBP = (C1117370fBP) aObserverS181S0200000_17.l0;
        final List<?> list2 = c1117370fBP.LL;
        c1117370fBP.LLLI(arrayList);
        if (!list2.isEmpty()) {
            try {
                C21342318fd.LIZ(new AbstractC21342018fa(list2, arrayList) { // from class: X.00qd
                    public final List<C1116210f9X> LIZ;
                    public final List<C1116210f9X> LIZIZ;

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i2, int i3) {
                        return true;
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return this.LIZIZ.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return this.LIZ.size();
                    }

                    {
                        this.LIZ = list2;
                        this.LIZIZ = arrayList;
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i2, int i3) {
                        return Intrinsics.LJFF(((C1116210f9X) ListProtector.get(this.LIZ, i2)).LL, ((C1116210f9X) ListProtector.get(this.LIZIZ, i3)).LL);
                    }

                    @Override // X.AbstractC21342018fa
                    public final Object LIZJ(int i2, int i3) {
                        return 0;
                    }
                }, false).LIZJ((C1117370fBP) aObserverS181S0200000_17.l0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((StarCommentManageDialog) aObserverS181S0200000_17.l1).OR(list2.isEmpty());
    }

    public static final void onChanged$1(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        ((RechargeDialogNew) aObserverS181S0200000_17.l0).HS((View) aObserverS181S0200000_17.l1, null);
    }

    public static final void onChanged$10(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        C1102510enR c1102510enR = (C1102510enR) obj;
        if (c1102510enR.LIZIZ) {
            if (c1102510enR.LIZ) {
                C1102500enQ c1102500enQ = (C1102500enQ) aObserverS181S0200000_17.l0;
                EnumC1102740eno enumC1102740eno = (EnumC1102740eno) aObserverS181S0200000_17.l1;
                if (!C354201Zc.LIZIZ((LiveMode) c1102500enQ.LJ.getValue())) {
                    c1102500enQ.LIZJ.add(enumC1102740eno);
                    c1102500enQ.LIZJ();
                    return;
                }
                return;
            }
            C1102500enQ c1102500enQ2 = (C1102500enQ) aObserverS181S0200000_17.l0;
            EnumC1102740eno enumC1102740eno2 = (EnumC1102740eno) aObserverS181S0200000_17.l1;
            if (C354201Zc.LIZIZ((LiveMode) c1102500enQ2.LJ.getValue())) {
                return;
            }
            c1102500enQ2.LIZJ.remove(enumC1102740eno2);
            c1102500enQ2.LIZJ();
        }
    }

    public static final void onChanged$11(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        C1102510enR c1102510enR = (C1102510enR) obj;
        if (c1102510enR.LIZIZ) {
            if (c1102510enR.LIZ) {
                C1102530enT c1102530enT = (C1102530enT) aObserverS181S0200000_17.l0;
                EnumC1102740eno enumC1102740eno = (EnumC1102740eno) aObserverS181S0200000_17.l1;
                if (!c1102530enT.LIZLLL.contains(enumC1102740eno)) {
                    c1102530enT.LIZLLL.add(enumC1102740eno);
                    int i = C1102580enY.LIZ[c1102530enT.LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            c1102530enT.LJI(EnumC1102570enX.LL);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    c1102530enT.LJII(EnumC1102570enX.LL);
                    return;
                }
                return;
            }
            C1102530enT c1102530enT2 = (C1102530enT) aObserverS181S0200000_17.l0;
            EnumC1102740eno enumC1102740eno2 = (EnumC1102740eno) aObserverS181S0200000_17.l1;
            if (!C13LP.LLIIJLIL(c1102530enT2.LIZLLL, c1102530enT2.LJ).contains(enumC1102740eno2)) {
                return;
            }
            int i2 = C1102580enY.LIZ[c1102530enT2.LIZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (c1102530enT2.LJ.contains(enumC1102740eno2)) {
                        c1102530enT2.LJ.remove(enumC1102740eno2);
                    } else {
                        c1102530enT2.LIZLLL.remove(enumC1102740eno2);
                    }
                    c1102530enT2.LJI(EnumC1102570enX.LLILLJJLI);
                    return;
                }
                throw new C1954807lC();
            }
            if (c1102530enT2.LJ.contains(enumC1102740eno2)) {
                c1102530enT2.LJ.remove(enumC1102740eno2);
            } else {
                c1102530enT2.LIZLLL.remove(enumC1102740eno2);
            }
            c1102530enT2.LJII(EnumC1102570enX.LLILLJJLI);
        }
    }

    public static final void onChanged$12(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        Pair pair = (Pair) obj;
        if (((Boolean) pair.getSecond()).booleanValue()) {
            Object first = pair.getFirst();
            if (first != null) {
                ((C10CQ) aObserverS181S0200000_17.l0).LLJILLL.add((String) first);
            }
        } else {
            Set<String> set = ((C10CQ) aObserverS181S0200000_17.l0).LLJILLL;
            C19719512Dh.LIZ(set).remove(pair.getFirst());
        }
        C10CQ c10cq = (C10CQ) aObserverS181S0200000_17.l0;
        if (c10cq.LLJLLIL) {
            if (c10cq.LLJILLL.isEmpty()) {
                ((C10CQ) aObserverS181S0200000_17.l0).getButtonConfirmFromXml().setEnabled(false);
                C1389890mGx c1389890mGx = new C1389890mGx((C19EG) aObserverS181S0200000_17.l1);
                c1389890mGx.LJIIIZ(2131832584);
                c1389890mGx.LJIIJJI();
                return;
            }
            ((C10CQ) aObserverS181S0200000_17.l0).getButtonConfirmFromXml().setEnabled(true);
        }
    }

    public static final void onChanged$13(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        boolean z;
        C1116220f9Y c1116220f9Y = (C1116220f9Y) obj;
        C781570UlH c781570UlH = ((StarCommentExtendWidget) aObserverS181S0200000_17.l0).LLILLJJLI;
        if (c781570UlH != null && !c781570UlH.canScrollVertically(1)) {
            z = true;
        } else {
            z = false;
        }
        ((C1117370fBP) aObserverS181S0200000_17.l1).LLLI(c1116220f9Y.LIZ);
        C0VRR c0vrr = c1116220f9Y.LIZJ;
        if (c0vrr == C0VRR.INSERT) {
            ((C1117370fBP) aObserverS181S0200000_17.l1).notifyItemInserted(c1116220f9Y.LIZIZ);
        } else if (c0vrr == C0VRR.REPLACE) {
            ((C1117370fBP) aObserverS181S0200000_17.l1).notifyItemChanged(c1116220f9Y.LIZIZ);
        }
        if (z) {
            StarCommentExtendWidget starCommentExtendWidget = (StarCommentExtendWidget) aObserverS181S0200000_17.l0;
            C781570UlH c781570UlH2 = starCommentExtendWidget.LLILLJJLI;
            if (c781570UlH2 != null) {
                c781570UlH2.setPendingScroll(true);
            }
            starCommentExtendWidget.LLILZ = true;
            StarCommentExtendWidget starCommentExtendWidget2 = (StarCommentExtendWidget) aObserverS181S0200000_17.l0;
            C781570UlH c781570UlH3 = starCommentExtendWidget2.LLILLJJLI;
            if (c781570UlH3 != null) {
                HandlerHook.viewPostDelay(c781570UlH3, new ARunnableS86S0200000_17(starCommentExtendWidget2, (C1117370fBP) aObserverS181S0200000_17.l1, 91), 100L);
            }
        }
        TextView textView = ((StarCommentExtendWidget) aObserverS181S0200000_17.l0).LL;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131844096, Integer.valueOf(((C1117370fBP) aObserverS181S0200000_17.l1).LL.size())));
        }
    }

    public static final void onChanged$2(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        Pair pair = (Pair) obj;
        if (((Boolean) pair.getSecond()).booleanValue()) {
            Object first = pair.getFirst();
            if (first != null) {
                ((ViewOnClickListenerC19207210Cg) aObserverS181S0200000_17.l0).LLILLL.add((String) first);
            }
        } else {
            Set<String> set = ((ViewOnClickListenerC19207210Cg) aObserverS181S0200000_17.l0).LLILLL;
            C19719512Dh.LIZ(set).remove(pair.getFirst());
        }
        ViewOnClickListenerC19207210Cg viewOnClickListenerC19207210Cg = (ViewOnClickListenerC19207210Cg) aObserverS181S0200000_17.l0;
        if (viewOnClickListenerC19207210Cg.LLJJJ) {
            if (viewOnClickListenerC19207210Cg.LLILLL.isEmpty()) {
                ((ViewOnClickListenerC19207210Cg) aObserverS181S0200000_17.l0).getButtonConfirmFromXml().setEnabled(false);
                C1389890mGx c1389890mGx = new C1389890mGx((C19EG) aObserverS181S0200000_17.l1);
                c1389890mGx.LJIIIZ(2131832584);
                c1389890mGx.LJIIJJI();
                return;
            }
            ((ViewOnClickListenerC19207210Cg) aObserverS181S0200000_17.l0).getButtonConfirmFromXml().setEnabled(true);
        }
    }

    public static final void onChanged$3(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        boolean z;
        ViewGroup viewGroup;
        HighPrioritySlotWidget highPrioritySlotWidget;
        View view;
        Map<String, Object> map;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        String str;
        final android.util.Pair pair = (android.util.Pair) obj;
        if (!LivePinCardCheckCurrentBusinessSetting.INSTANCE.isEnabled() || (str = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILZLL) == null || (pair != null && (C2093608Ic.LIZJ((String) pair.second, str) || C2093608Ic.LIZJ((String) pair.second, "visibility_reason_conflict") || C2093608Ic.LIZJ((String) pair.second, "visibility_reason_dispose")))) {
            z = true;
        } else {
            z = false;
        }
        if (((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).getView() != null && pair != null && z) {
            final IFrameSlot iFrameSlot = (IFrameSlot) ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1).LLILZLL();
            Object obj2 = pair.first;
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, obj2)) {
                HighPrioritySlotWidget highPrioritySlotWidget2 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
                highPrioritySlotWidget2.LLILZLL = (String) pair.second;
                if (highPrioritySlotWidget2.getView() instanceof ViewGroup) {
                    if (((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).isShowing()) {
                        View view2 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).getView();
                        Objects.requireNonNull(view2);
                        if (((ViewGroup) view2).getChildCount() > 0) {
                            return;
                        }
                    }
                    View view3 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).getView();
                    if ((view3 instanceof ViewGroup) && (viewGroup3 = (ViewGroup) view3) != null) {
                        C786410Ut5.LJJJJI(viewGroup3);
                    }
                    HighPrioritySlotWidget highPrioritySlotWidget3 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
                    highPrioritySlotWidget3.LLILLL = iFrameSlot.LJIJI(highPrioritySlotWidget3.getContext());
                    HighPrioritySlotWidget highPrioritySlotWidget4 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
                    if (highPrioritySlotWidget4.LLILLL == null) {
                        return;
                    }
                    View view4 = highPrioritySlotWidget4.getView();
                    if ((view4 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view4) != null) {
                        viewGroup2.addView(((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILLL);
                    }
                    ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1).onExposure("during_live");
                    ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).show();
                    HashMap map2 = new HashMap();
                    HighPrioritySlotWidget highPrioritySlotWidget5 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
                    if (!highPrioritySlotWidget5.LLILZ) {
                        FrameSlotController frameSlotController = highPrioritySlotWidget5.LL;
                        if (frameSlotController != null && (map = frameSlotController.LLIZLLLIL) != null) {
                            C783190Unt.LIZ(highPrioritySlotWidget5.LLILZIL, map2, map);
                        }
                        C770580UKq.LIZLLL((InterfaceC1124060fMC) aObserverS181S0200000_17.l1, map2);
                    }
                    ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILZ = true;
                    C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1, map2);
                    DataChannel dataChannel = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(HighPrioritySlotVisibilityChannel.class, bool);
                    }
                    Animation animationLJIIZILJ = iFrameSlot.LJIIZILJ();
                    if (animationLJIIZILJ != null) {
                        View view5 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILLL;
                        if (view5 != null) {
                            view5.startAnimation(animationLJIIZILJ);
                        }
                        C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1, null);
                    }
                    View view6 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILLL;
                    if (view6 == null || view6.hasOnClickListeners() || (view = (highPrioritySlotWidget = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILLL) == null) {
                        return;
                    }
                    C786410Ut5.I7(new ACListenerS120S0200000_17(highPrioritySlotWidget, iFrameSlot, 10), view);
                    return;
                }
                return;
            }
            HighPrioritySlotWidget highPrioritySlotWidget6 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
            if (highPrioritySlotWidget6.LLILLL == null || !highPrioritySlotWidget6.isShowing()) {
                return;
            }
            Animation animationLJIJ = iFrameSlot.LJIJ();
            if (animationLJIJ != null && !Intrinsics.LJFF("visibility_reason_conflict", pair.second) && !Intrinsics.LJFF("visibility_reason_dispose", pair.second)) {
                final HighPrioritySlotWidget highPrioritySlotWidget7 = (HighPrioritySlotWidget) aObserverS181S0200000_17.l0;
                final InterfaceC1124060fMC interfaceC1124060fMC = (InterfaceC1124060fMC) aObserverS181S0200000_17.l1;
                animationLJIJ.setAnimationListener(new Animation.AnimationListener() { // from class: X.0fLs
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        View view7 = highPrioritySlotWidget7.getView();
                        if (view7 != null) {
                            HandlerHook.viewPost(view7, new ARunnableS11S0500000_17(view7, highPrioritySlotWidget7, iFrameSlot, pair, interfaceC1124060fMC, 0));
                        }
                        DataChannel dataChannel2 = highPrioritySlotWidget7.dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.zW(HighPrioritySlotVisibilityChannel.class, Boolean.FALSE);
                        }
                    }
                });
                View view7 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).LLILLL;
                if (view7 != null) {
                    view7.startAnimation(animationLJIJ);
                }
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1, null);
                return;
            }
            if (((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).getView() instanceof ViewGroup) {
                View view8 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).getView();
                if ((view8 instanceof ViewGroup) && (viewGroup = (ViewGroup) view8) != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).hide();
                iFrameSlot.LJIJJ((String) pair.second);
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l1, null);
            }
            DataChannel dataChannel2 = ((HighPrioritySlotWidget) aObserverS181S0200000_17.l0).dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.zW(HighPrioritySlotVisibilityChannel.class, Boolean.FALSE);
        }
    }

    public static final void onChanged$4(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        boolean z;
        DataChannel dataChannel;
        String str;
        android.util.Pair pair = (android.util.Pair) obj;
        if (!LivePinCardCheckCurrentBusinessSetting.INSTANCE.isEnabled() || (str = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLIZLLLIL) == null || (pair != null && (C2093608Ic.LIZJ((String) pair.second, str) || C2093608Ic.LIZJ((String) pair.second, "visibility_reason_conflict") || C2093608Ic.LIZJ((String) pair.second, "visibility_reason_dispose")))) {
            z = true;
        } else {
            z = false;
        }
        if (((FrameL2SlotWidget) aObserverS181S0200000_17.l1).getView() != null && pair != null && z) {
            IFrameSlot iFrameSlot = (IFrameSlot) ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0).LLILZLL();
            Object obj2 = pair.first;
            Boolean bool = Boolean.TRUE;
            if (bool.equals(obj2)) {
                FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObserverS181S0200000_17.l1;
                frameL2SlotWidget.LLIZLLLIL = (String) pair.second;
                if (frameL2SlotWidget.getView() instanceof ViewGroup) {
                    if (((FrameL2SlotWidget) aObserverS181S0200000_17.l1).isShowing()) {
                        View view = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).getView();
                        Objects.requireNonNull(view);
                        if (((ViewGroup) view).getChildCount() > 0) {
                            return;
                        }
                    }
                    if (!C494680Jac.LJI(((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel) && (dataChannel = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel) != null && !bool.equals(dataChannel.gg0(HighPrioritySlotVisibilityChannel.class)) && !bool.equals(((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel.gg0(HighPriorityTooltipVisibilityChannel.class))) {
                        C786410Ut5.LJJJJI((ViewGroup) ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).getView());
                        FrameL2SlotWidget frameL2SlotWidget2 = (FrameL2SlotWidget) aObserverS181S0200000_17.l1;
                        frameL2SlotWidget2.LLILLL = iFrameSlot.LJIJI(frameL2SlotWidget2.getContext());
                        FrameL2SlotWidget frameL2SlotWidget3 = (FrameL2SlotWidget) aObserverS181S0200000_17.l1;
                        if (frameL2SlotWidget3.LLILLL != null) {
                            ((ViewGroup) frameL2SlotWidget3.getView()).addView(((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL);
                            if (!((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILZ) {
                                ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0).onExposure("during_live");
                                ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).show();
                                HashMap map = new HashMap();
                                FrameL2SlotWidget frameL2SlotWidget4 = (FrameL2SlotWidget) aObserverS181S0200000_17.l1;
                                if (!frameL2SlotWidget4.LLILZLL) {
                                    C783190Unt.LIZ(frameL2SlotWidget4.LLIZ, map, frameL2SlotWidget4.LL.LLIZLLLIL);
                                    C770580UKq.LIZLLL((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, map);
                                }
                                ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILZLL = true;
                                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, map);
                                DataChannel dataChannel2 = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
                                if (dataChannel2 != null) {
                                    dataChannel2.zW(FrameL2SlotVisibilityChannel.class, bool);
                                    ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel.zW(FrameL2SlotBizVisibilityChannel.class, new android.util.Pair(bool, pair.second));
                                }
                                Animation animationLJIIZILJ = iFrameSlot.LJIIZILJ();
                                if (animationLJIIZILJ != null) {
                                    ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL.startAnimation(animationLJIIZILJ);
                                    C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
                                }
                                if (!((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL.hasOnClickListeners()) {
                                    C786410Ut5.I7(new ACListenerS120S0200000_17(aObserverS181S0200000_17, iFrameSlot, 9), ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL);
                                }
                                HandlerHook.viewPost(((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL, new ARunnableS117S0100000_17(aObserverS181S0200000_17, 46));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            FrameL2SlotWidget frameL2SlotWidget5 = (FrameL2SlotWidget) aObserverS181S0200000_17.l1;
            if (frameL2SlotWidget5.LLILLL == null || !frameL2SlotWidget5.isShowing()) {
                return;
            }
            Animation animationLJIJ = iFrameSlot.LJIJ();
            if (animationLJIJ != null && !"visibility_reason_conflict".equals(pair.second) && !"visibility_reason_dispose".equals(pair.second)) {
                animationLJIJ.setAnimationListener(new AnimationAnimationListenerC1123830fLp(aObserverS181S0200000_17, iFrameSlot, pair));
                ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).LLILLL.startAnimation(animationLJIJ);
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
                return;
            }
            if (((FrameL2SlotWidget) aObserverS181S0200000_17.l1).getView() instanceof ViewGroup) {
                C786410Ut5.LJJJJI((ViewGroup) ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).getView());
                ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).hide();
                iFrameSlot.LJIJJ((String) pair.second);
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
            }
            DataChannel dataChannel3 = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.zW(FullBottomContainerHeightChannel.class, 0);
                DataChannel dataChannel4 = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
                Boolean bool2 = Boolean.FALSE;
                dataChannel4.zW(FrameL2SlotVisibilityChannel.class, bool2);
                DataChannel dataChannel5 = ((FrameL2SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
                Object obj3 = pair.second;
                if (obj3 == null) {
                    obj3 = "";
                }
                dataChannel5.zW(FrameL2SlotBizVisibilityChannel.class, new android.util.Pair(bool2, obj3));
            }
            iFrameSlot.onHide();
        }
    }

    public static final void onChanged$5(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        android.util.Pair pair = (android.util.Pair) obj;
        if (((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView() != null && pair != null) {
            Object obj2 = pair.first;
            Boolean bool = Boolean.TRUE;
            if (bool.equals(obj2)) {
                if (((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView() instanceof ViewGroup) {
                    if (((FrameL3SlotWidget) aObserverS181S0200000_17.l1).isShowing() && ((ViewGroup) ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView()).getChildCount() > 0) {
                        return;
                    }
                    C786410Ut5.LJJJJI((ViewGroup) ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView());
                    FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aObserverS181S0200000_17.l1;
                    frameL3SlotWidget.LLILZ = frameL3SlotWidget.LLILLJJLI.LJIJI(frameL3SlotWidget.getContext());
                    FrameL3SlotWidget frameL3SlotWidget2 = (FrameL3SlotWidget) aObserverS181S0200000_17.l1;
                    if (frameL3SlotWidget2.LLILZ == null) {
                        return;
                    }
                    ((ViewGroup) frameL3SlotWidget2.getView()).addView(((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ);
                    if (((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLIZ) {
                        return;
                    }
                    ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0).onExposure("during_live");
                    ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).show();
                    HashMap map = new HashMap();
                    FrameL3SlotWidget frameL3SlotWidget3 = (FrameL3SlotWidget) aObserverS181S0200000_17.l1;
                    if (!frameL3SlotWidget3.LLIZLLLIL) {
                        C783190Unt.LIZ(frameL3SlotWidget3.LLJ, map, frameL3SlotWidget3.LL.LLIZLLLIL);
                        C770580UKq.LIZLLL((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, map);
                    }
                    ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLIZLLLIL = true;
                    C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, map);
                    DataChannel dataChannel = ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(FrameL3SlotVisibilityChannel.class, bool);
                    }
                    Animation animationLJIIZILJ = ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILLJJLI.LJIIZILJ();
                    if (animationLJIIZILJ != null) {
                        ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ.startAnimation(animationLJIIZILJ);
                        C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
                    }
                    if (!((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ.hasOnClickListeners()) {
                        C786410Ut5.I7(new ACListenerS152S0100000_17(aObserverS181S0200000_17, 17), ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ);
                    }
                    HandlerHook.viewPost(((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ, new ARunnableS117S0100000_17(aObserverS181S0200000_17, 48));
                    return;
                }
                return;
            }
            if (!((FrameL3SlotWidget) aObserverS181S0200000_17.l1).isShowing()) {
                return;
            }
            FrameL3SlotWidget frameL3SlotWidget4 = (FrameL3SlotWidget) aObserverS181S0200000_17.l1;
            if (frameL3SlotWidget4.LLILZ == null) {
                return;
            }
            Animation animationLJIJ = frameL3SlotWidget4.LLILLJJLI.LJIJ();
            if (animationLJIJ != null && !"visibility_reason_conflict".equals(pair.second) && !"visibility_reason_dispose".equals(pair.second)) {
                animationLJIJ.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(aObserverS181S0200000_17, 0));
                ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).LLILZ.startAnimation(animationLJIJ);
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
                return;
            }
            if (((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView() instanceof ViewGroup) {
                C786410Ut5.LJJJJI((ViewGroup) ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).getView());
                ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).hide();
                C770580UKq.LIZIZ((InterfaceC1124060fMC) aObserverS181S0200000_17.l0, null);
            }
            DataChannel dataChannel2 = ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.zW(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            ((FrameL3SlotWidget) aObserverS181S0200000_17.l1).dataChannel.zW(FrameL3SlotHeightChannel.class, 0);
        }
    }

    public static final void onChanged$6(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        Boolean boolValueOf;
        boolean z;
        C1124540fMy c1124540fMy = ((C1127390fRZ) aObserverS181S0200000_17.l0).LLJJJJJIL;
        if (c1124540fMy != null) {
            if (c1124540fMy.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            ((C1127390fRZ) aObserverS181S0200000_17.l0).LJJLIIIIJ((C1127440fRe) aObserverS181S0200000_17.l1);
        }
    }

    public static final void onChanged$7(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        String str = (String) obj;
        if (str != null) {
            C013C c013c = (C013C) aObserverS181S0200000_17.l0;
            AgeGateConfirmationFragment ageGateConfirmationFragment = (AgeGateConfirmationFragment) aObserverS181S0200000_17.l1;
            c013c.element = true;
            View viewFindViewById = ageGateConfirmationFragment.LLJ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = ageGateConfirmationFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.eon);
                } else {
                    viewFindViewById = null;
                }
                ageGateConfirmationFragment.LLJ = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 8);
            View viewFindViewById3 = ageGateConfirmationFragment.LLJI;
            if (viewFindViewById3 == null) {
                View view2 = ageGateConfirmationFragment.getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.hbf);
                } else {
                    viewFindViewById3 = null;
                }
                ageGateConfirmationFragment.LLJI = (LinearLayout) viewFindViewById3;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById3);
            View viewFindViewById4 = ageGateConfirmationFragment.LLJIJIL;
            if (viewFindViewById4 == null) {
                View view3 = ageGateConfirmationFragment.getView();
                if (view3 != null) {
                    viewFindViewById4 = view3.findViewById(R.id.hc2);
                } else {
                    viewFindViewById4 = null;
                }
                ageGateConfirmationFragment.LLJIJIL = (TuxTextView) viewFindViewById4;
            }
            ((TextView) viewFindViewById4).setText(str);
            View view4 = ageGateConfirmationFragment.LLJILJIL;
            if (view4 == null) {
                View view5 = ageGateConfirmationFragment.getView();
                if (view5 != null) {
                    viewFindViewById2 = view5.findViewById(R.id.d6u);
                }
                ageGateConfirmationFragment.LLJILJIL = (C197039127h) viewFindViewById2;
                view4 = viewFindViewById2;
            }
            ((C197039127h) view4).setEnabled(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$8(Y.AObserverS181S0200000_17 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS181S0200000_17.onChanged$8(Y.AObserverS181S0200000_17, java.lang.Object):void");
    }

    public static final void onChanged$9(AObserverS181S0200000_17 aObserverS181S0200000_17, Object obj) {
        List<?> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLLILZJ(((OfflineRankListFragment) aObserverS181S0200000_17.l0).MR(), 0);
            ((C1117370fBP) aObserverS181S0200000_17.l1).LLLI(list);
            ((C1117370fBP) aObserverS181S0200000_17.l1).notifyDataSetChanged();
        } else {
            RunnableC781530UlD runnableC781530UlDMR = ((OfflineRankListFragment) aObserverS181S0200000_17.l0).MR();
            if (runnableC781530UlDMR == null) {
                return;
            }
            C786410Ut5.LLLILZJ(runnableC781530UlDMR, 8);
        }
    }

    public AObserverS181S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
