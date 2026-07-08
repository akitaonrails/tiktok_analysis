package X;

import Y.ARunnableS28S0101000_17;
import Y.ARunnableS50S0300000_17;
import Y.ARunnableS86S0200000_17;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRankLeftChangedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDropOffSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS15S0120000_17;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146260fw0 extends FrameLayout {
    public static final int LLLIIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static final int LLLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
    public static final int LLLIILIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public Function1<? super Boolean, Unit> LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Boolean LLILZIL;
    public DataChannel LLILZLL;
    public AnimatorSet LLIZ;
    public AnimatorSet LLIZLLLIL;
    public final C1146270fw1 LLJ;
    public final C1146270fw1 LLJI;
    public final C1146270fw1 LLJIJIL;
    public final ConstraintLayout LLJILJIL;
    public final View LLJILJILJ;
    public final HorizontalScrollView LLJILLL;
    public final LinearLayout LLJJ;
    public final C1146270fw1 LLJJI;
    public final C1146270fw1 LLJJIII;
    public final C1146270fw1 LLJJIJI;
    public final LinearLayout LLJJIJIIJIL;
    public final LinearLayout LLJJIJIL;
    public final ConstraintLayout LLJJJ;
    public final FrameLayout LLJJJIL;
    public final C1099610eil LLJJJJ;
    public final C0GRR LLJJJJJIL;
    public final C16F5 LLJJJJLIIL;
    public final C1324720kZq LLJJL;
    public final C1324720kZq LLJJLIIIJLLLLLLLZ;
    public final C1324720kZq LLJL;
    public final C1324720kZq LLJLIL;
    public final C1324720kZq LLJLILLLLZIIL;
    public final C1324720kZq LLJLL;
    public ValueAnimator LLJLLIL;
    public ARunnableS28S0101000_17 LLJLLL;
    public ARunnableS50S0300000_17 LLJZ;
    public ARunnableS86S0200000_17 LLJZIJLIL;
    public Runnable LLL;
    public final LinearLayout LLLF;
    public final C1146270fw1 LLLFF;
    public final C1146270fw1 LLLFFI;
    public final List<C1146270fw1> LLLFZ;
    public final List<C1146270fw1> LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;

    public C1146260fw0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LLIZ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        this.LLIZ = null;
        AnimatorSet animatorSet3 = this.LLIZLLLIL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.LLIZLLLIL;
        if (animatorSet4 != null) {
            animatorSet4.removeAllListeners();
        }
        this.LLIZLLLIL = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLJZ);
        this.LLJZ = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLJZIJLIL);
        this.LLJZIJLIL = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLJLLL);
        this.LLJLLL = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLL);
        this.LLL = null;
    }

    public final void LJFF() {
        int i = this.LLLIIIIL;
        int i2 = (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) ? 8 : i;
        if (getVisibility() != i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[enlarge-gate] re-eval desired=");
            sbLIZ.append(i);
            sbLIZ.append(" -> gated=");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("NewMvpContainer", C2188811AlT.LIZIZ(sbLIZ));
            super.setVisibility(i2);
        }
    }

    public final void LJI() {
        C20441214yg.LIZIZ("NewMvpContainer", "resetContainer");
        this.LLILZIL = null;
        for (C1146270fw1 c1146270fw1 : this.LLLFZ) {
            if (c1146270fw1 != null) {
                c1146270fw1.setDefaultSeat(true);
            }
        }
        for (C1146270fw1 c1146270fw12 : this.LLLI) {
            if (c1146270fw12 != null) {
                c1146270fw12.setDefaultSeat(false);
            }
        }
        LinearLayout linearLayout = this.LLLF;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C1146270fw1 c1146270fw13 = this.LLLFF;
        if (c1146270fw13 != null) {
            C786410Ut5.LLJLIL(c1146270fw13, 8);
        }
        C1146270fw1 c1146270fw14 = this.LLLFFI;
        if (c1146270fw14 != null) {
            C786410Ut5.LLJLIL(c1146270fw14, 8);
        }
    }

    public final void LJII() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        float fLIZIZ = (int) C497740JfY.LIZIZ(18.0f);
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16597932, -1711455316});
            gradientDrawable.setCornerRadius(fLIZIZ);
            linearLayout.setBackground(gradientDrawable);
        }
        LinearLayout linearLayout2 = this.LLJJIJIL;
        if (linearLayout2 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-1725846543, 2206705});
            gradientDrawable2.setCornerRadius(fLIZIZ);
            linearLayout2.setBackground(gradientDrawable2);
        }
        LinearLayout linearLayout3 = this.LLJJIJIIJIL;
        if (linearLayout3 != null) {
            linearLayout3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        C1146270fw1 c1146270fw1 = this.LLJIJIL;
        ViewGroup.LayoutParams layoutParams = c1146270fw1 != null ? c1146270fw1.getLayoutParams() : null;
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams6.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            marginLayoutParams6.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw12 = this.LLJIJIL;
            if (c1146270fw12 != null) {
                C786410Ut5.z6(c1146270fw12, marginLayoutParams6);
            }
        }
        C1146270fw1 c1146270fw13 = this.LLJI;
        ViewGroup.LayoutParams layoutParams2 = c1146270fw13 != null ? c1146270fw13.getLayoutParams() : null;
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            marginLayoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw14 = this.LLJI;
            if (c1146270fw14 != null) {
                C786410Ut5.z6(c1146270fw14, marginLayoutParams5);
            }
        }
        C1146270fw1 c1146270fw15 = this.LLJ;
        ViewGroup.LayoutParams layoutParams3 = c1146270fw15 != null ? c1146270fw15.getLayoutParams() : null;
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            marginLayoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            marginLayoutParams4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw16 = this.LLJ;
            if (c1146270fw16 != null) {
                C786410Ut5.z6(c1146270fw16, marginLayoutParams4);
            }
        }
        LinearLayout linearLayout4 = this.LLJJIJIL;
        if (linearLayout4 != null) {
            linearLayout4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        C1146270fw1 c1146270fw17 = this.LLJJI;
        ViewGroup.LayoutParams layoutParams4 = c1146270fw17 != null ? c1146270fw17.getLayoutParams() : null;
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            marginLayoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw18 = this.LLJJI;
            if (c1146270fw18 != null) {
                C786410Ut5.z6(c1146270fw18, marginLayoutParams3);
            }
        }
        C1146270fw1 c1146270fw19 = this.LLJJIII;
        ViewGroup.LayoutParams layoutParams5 = c1146270fw19 != null ? c1146270fw19.getLayoutParams() : null;
        if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
            marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw110 = this.LLJJIII;
            if (c1146270fw110 != null) {
                C786410Ut5.z6(c1146270fw110, marginLayoutParams2);
            }
        }
        C1146270fw1 c1146270fw111 = this.LLJJIJI;
        ViewGroup.LayoutParams layoutParams6 = c1146270fw111 != null ? c1146270fw111.getLayoutParams() : null;
        if ((layoutParams6 instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C1146270fw1 c1146270fw112 = this.LLJJIJI;
            if (c1146270fw112 != null) {
                C786410Ut5.z6(c1146270fw112, marginLayoutParams);
            }
        }
        C1146270fw1 c1146270fw113 = this.LLJ;
        if (c1146270fw113 != null) {
            c1146270fw113.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw114 = this.LLJ;
        if (c1146270fw114 != null) {
            c1146270fw114.setIsGroupLive(true);
        }
        C1146270fw1 c1146270fw115 = this.LLJI;
        if (c1146270fw115 != null) {
            c1146270fw115.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw116 = this.LLJI;
        if (c1146270fw116 != null) {
            c1146270fw116.setIsGroupLive(true);
        }
        C1146270fw1 c1146270fw117 = this.LLJIJIL;
        if (c1146270fw117 != null) {
            c1146270fw117.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw118 = this.LLJIJIL;
        if (c1146270fw118 != null) {
            c1146270fw118.setIsGroupLive(true);
        }
        C1146270fw1 c1146270fw119 = this.LLJJI;
        if (c1146270fw119 != null) {
            c1146270fw119.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw120 = this.LLJJI;
        if (c1146270fw120 != null) {
            c1146270fw120.setIsGroupLive(true);
        }
        C1146270fw1 c1146270fw121 = this.LLJJIII;
        if (c1146270fw121 != null) {
            c1146270fw121.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw122 = this.LLJJIII;
        if (c1146270fw122 != null) {
            c1146270fw122.setIsGroupLive(true);
        }
        C1146270fw1 c1146270fw123 = this.LLJJIJI;
        if (c1146270fw123 != null) {
            c1146270fw123.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        }
        C1146270fw1 c1146270fw124 = this.LLJJIJI;
        if (c1146270fw124 != null) {
            c1146270fw124.setIsGroupLive(true);
        }
    }

    public final int getMvpWidth() {
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        Integer numValueOf = linearLayout != null ? Integer.valueOf(linearLayout.getMeasuredWidth()) : null;
        LinearLayout linearLayout2 = this.LLJJIJIL;
        Integer numValueOf2 = linearLayout2 != null ? Integer.valueOf(linearLayout2.getMeasuredWidth()) : null;
        return ((numValueOf != null ? numValueOf.intValue() : 0) + (numValueOf2 != null ? numValueOf2.intValue() : 0)) - ((int) C497740JfY.LIZIZ(8.0f));
    }

    public final void LIZLLL() {
        if (C970370bMJ.LJ() && C500260Jjc.LJJIJIIJIL(this.LLILZIL)) {
            C20441214yg.LJ("NewMvpContainer", "NOT showMvp, isIndividualMatch() && !isLeftWin");
            return;
        }
        C1146270fw1 c1146270fw1 = Intrinsics.LJFF(this.LLILZIL, Boolean.TRUE) ? this.LLJ : this.LLJJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMvpBadge , isLeftWin = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mvpView = ");
        sbLIZ.append(c1146270fw1);
        C20441214yg.LIZIZ("NewMvpContainer", C2188811AlT.LIZIZ(sbLIZ));
        if (c1146270fw1 != null) {
            C1324720kZq c1324720kZq = c1146270fw1.LLJIJIL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            C1324720kZq c1324720kZq2 = c1146270fw1.LLJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.h5(c1324720kZq2, 1.0f);
            }
        }
    }

    public final void LJIILIIL() {
        LJI();
        LIZIZ();
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout != null) {
            C786410Ut5.c5(constraintLayout, 1.0f);
        }
        LJIILLIIL();
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        HandlerHook.viewPost(this, new Runnable() { // from class: X.0bPL
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BattleNewMvpContainerLayout@9816.start$1");
                try {
                    C970290bMB c970290bMB = C970290bMB.LIZ;
                    C970290bMB.LJJIJ(EnumC970300bMC.CONTRIBUTE_ENTRANCE, true);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BattleNewMvpContainerLayout@9816.start$1");
            }
        });
    }

    public final void LJIILLIIL() {
        if (!C970370bMJ.LJ()) {
            LinearLayout linearLayout = this.LLJJIJIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                return;
            }
            return;
        }
        if (LiveMatchDropOffSetting.INSTANCE.isEnable() && C970370bMJ.LJIIIZ()) {
            LinearLayout linearLayout2 = this.LLJJIJIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.LLJJIJIL;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void LJ(C1144580ftI c1144580ftI) {
        Long lValueOf;
        int i;
        int i2;
        Long lValueOf2;
        String string;
        String str;
        String str2;
        List<Long> list;
        Long lValueOf3;
        BattleUserArmy userInfo;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf4 = null;
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        Iterator<C1146270fw1> it2 = this.LLLFZ.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                C1146270fw1 next = it2.next();
                if (next != null && (userInfo = next.getUserInfo()) != null) {
                    lValueOf3 = Long.valueOf(userInfo.userId);
                } else {
                    lValueOf3 = null;
                }
                if (Intrinsics.LJFF(lValueOf3, lValueOf)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        int i4 = i3 + 1;
        if (c1144580ftI != null && (list = c1144580ftI.LIZIZ) != null && C13LP.LJJJJ(lValueOf, list)) {
            i = 1;
        } else {
            i = 0;
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        if (c1144580ftI != null) {
            i2 = c1144580ftI.LIZJ;
        } else {
            i2 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf2.LJJL());
        } else {
            lValueOf2 = null;
        }
        linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf4 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
        }
        linkedHashMap.put("pk_id", String.valueOf(lValueOf4));
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 == null || (string = Long.valueOf(interfaceC500940JkiUser2.getCurrentUserId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("user_id", string);
        String str3 = C973660bRc.LJJII;
        if (C973660bRc.LJLLLL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put(str3, str);
        linkedHashMap.put("is_card_receiver", String.valueOf(i));
        linkedHashMap.put("mvp_ranking", String.valueOf(i4));
        if (i2 == 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_league_match_extra", str2);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        C1144530ftD.LIZ(c973660bRc, linkedHashMap);
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C970370bMJ.LJII()) {
            C973660bRc.LJZ(c973660bRc, "livesdk_mvp_get_match_item_room_notice_show", linkedHashMap, strLIZIZ);
        } else {
            C973660bRc.LJZI(c973660bRc, "livesdk_mvp_get_match_item_room_notice_show", linkedHashMap, strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(boolean r14) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1146260fw0.LJIIIIZZ(boolean):void");
    }

    public final void LJIIJJI(boolean z) {
        C1146270fw1 c1146270fw1;
        if (C970370bMJ.LJ() && !z) {
            C20441214yg.LJ("NewMvpContainer", "NOT showMvp, isIndividualMatch() && !isLeftWin");
            return;
        }
        this.LLILZIL = Boolean.valueOf(z);
        if (z) {
            c1146270fw1 = this.LLJ;
        } else {
            c1146270fw1 = this.LLJJI;
        }
        if (c1146270fw1 != null) {
            C1324720kZq c1324720kZq = c1146270fw1.LLILZIL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            c1146270fw1.LJIIIZ();
            C1324720kZq c1324720kZq2 = c1146270fw1.LLJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 0);
            }
            C1324720kZq c1324720kZq3 = c1146270fw1.LLJIJIL;
            if (c1324720kZq3 != null) {
                C786410Ut5.h5(c1324720kZq3, 1.0f);
            }
        }
    }

    public final void LJIILL(List<BattleUserArmy> list) {
        DataChannel dataChannel;
        LJIILJJIL(list, true);
        if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue() && (dataChannel = this.LLILZLL) != null) {
            dataChannel.FQ2(BattleRankLeftChangedEvent.class);
        }
    }

    public final void setClickCallback(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int i2;
        this.LLLIIIIL = i;
        if (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) {
            i2 = 8;
        } else {
            i2 = i;
        }
        super.setVisibility(i2);
        if (i == 0) {
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJJIJ(EnumC970300bMC.CONTRIBUTE_ENTRANCE, true);
            LJIILLIIL();
        }
    }

    public static final ValueAnimator LJIIJ(final C1324720kZq c1324720kZq, int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS257S0100000_7(c1324720kZq, 41));
        valueAnimatorOfInt.setDuration(1170L);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0eJE
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                View view = c1324720kZq;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = c1324720kZq;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 0.0f);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z) {
                super.onAnimationEnd(animator, z);
                View view = c1324720kZq;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            }
        });
        return valueAnimatorOfInt;
    }

    public final void LJIILJJIL(List list, boolean z) {
        Integer numValueOf;
        List<C1146270fw1> list2;
        C1146270fw1 c1146270fw1;
        BattleUserArmy battleUserArmy;
        List listLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isLeft = ");
        sbLIZ.append(z);
        sbLIZ.append(", armies size = ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("NewMvpContainer", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        if (list != null && (listLL = C13LP.LL(list, 3)) != null) {
            arrayList.addAll(listLL);
        }
        int i = 0;
        if (arrayList.size() < 3) {
            int size = 3 - arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z) {
                    battleUserArmy = BattleUserArmy.LIZ;
                } else {
                    battleUserArmy = BattleUserArmy.LIZIZ;
                }
                arrayList.add(battleUserArmy);
            }
        }
        if (z) {
            list2 = this.LLLFZ;
        } else {
            list2 = this.LLLI;
        }
        for (Object obj : arrayList) {
            int i3 = i + 1;
            if (i >= 0) {
                BattleUserArmy battleUserArmy2 = (BattleUserArmy) obj;
                if (list2 != null && (c1146270fw1 = (C1146270fw1) ListProtector.get(list2, i)) != null) {
                    c1146270fw1.LJIIJ(battleUserArmy2, i3);
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJIILLIIL();
    }

    public C1146260fw0(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLLFZ = new ArrayList();
        this.LLLI = new ArrayList();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h33, this, true);
        this.LLJILJIL = (ConstraintLayout) findViewById(R.id.oyu);
        this.LLLIIIIL = getVisibility();
        C1091250eVH c1091250eVH = (C1091250eVH) findViewById(R.id.i8a);
        c1091250eVH.setEnableSizeChange(true);
        c1091250eVH.setEnableFixedSize(true);
        C1146270fw1 c1146270fw1 = (C1146270fw1) findViewById(R.id.mkw);
        this.LLJ = c1146270fw1;
        if (c1146270fw1 != null) {
            c1146270fw1.setNameTag("leftSeat1");
        }
        C1146270fw1 c1146270fw12 = (C1146270fw1) findViewById(R.id.mkx);
        this.LLJI = c1146270fw12;
        if (c1146270fw12 != null) {
            c1146270fw12.setNameTag("leftSeat2");
        }
        C1146270fw1 c1146270fw13 = (C1146270fw1) findViewById(R.id.mky);
        this.LLJIJIL = c1146270fw13;
        if (c1146270fw13 != null) {
            c1146270fw13.setNameTag("leftSeat3");
        }
        C1146270fw1 c1146270fw14 = (C1146270fw1) findViewById(R.id.tm7);
        this.LLJJI = c1146270fw14;
        if (c1146270fw14 != null) {
            c1146270fw14.setNameTag("rightSeat1");
        }
        C1146270fw1 c1146270fw15 = (C1146270fw1) findViewById(R.id.tm8);
        this.LLJJIII = c1146270fw15;
        if (c1146270fw15 != null) {
            c1146270fw15.setNameTag("rightSeat2");
        }
        C1146270fw1 c1146270fw16 = (C1146270fw1) findViewById(R.id.tm9);
        this.LLJJIJI = c1146270fw16;
        if (c1146270fw16 != null) {
            c1146270fw16.setNameTag("rightSeat3");
        }
        this.LLLFZ = C1697810uHb.LJIILJJIL(c1146270fw1, c1146270fw12, c1146270fw13);
        this.LLLI = C1697810uHb.LJIILJJIL(c1146270fw14, c1146270fw15, c1146270fw16);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mbs);
        this.LLJJIJIIJIL = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mei);
        this.LLJJIJIL = linearLayout2;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.oyw);
        this.LLJJJ = constraintLayout;
        this.LLJJJIL = (FrameLayout) findViewById(R.id.oys);
        this.LLJJJJ = (C1099610eil) findViewById(R.id.oyx);
        this.LLJJJJJIL = (C0GRR) findViewById(R.id.user_guide_stroke);
        this.LLJJJJLIIL = (C16F5) findViewById(R.id.zyh);
        this.LLJLIL = (C1324720kZq) findViewById(R.id.l8w);
        this.LLJLILLLLZIIL = (C1324720kZq) findViewById(R.id.l8y);
        this.LLJLL = (C1324720kZq) findViewById(R.id.l90);
        this.LLJJL = (C1324720kZq) findViewById(R.id.l8v);
        this.LLJJLIIIJLLLLLLLZ = (C1324720kZq) findViewById(R.id.l8x);
        this.LLJL = (C1324720kZq) findViewById(R.id.l8z);
        this.LLJILJILJ = findViewById(R.id.er_);
        this.LLJILLL = (HorizontalScrollView) findViewById(R.id.u31);
        this.LLJJ = (LinearLayout) findViewById(R.id.nfl);
        this.LLLF = (LinearLayout) findViewById(R.id.nkk);
        this.LLLFF = (C1146270fw1) findViewById(R.id.blc);
        this.LLLFFI = (C1146270fw1) findViewById(R.id.bld);
        findViewById(R.id.lj7);
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ViewOnClickListenerC512201z6(this, 1));
        }
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ViewOnClickListenerC512201z6(this, 2));
        }
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ViewOnClickListenerC512201z6(this, 3));
        }
        LJIILLIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1146260fw0.LIZ(boolean, boolean, boolean):void");
    }

    public final void LIZJ(boolean z, boolean z2, DataChannel dataChannel) {
        boolean z3;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createDataInfo, isMultiFromOut = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("NewMvpContainer", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL = dataChannel;
        if (!z && !C948770anT.LJ()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.LLILLL = z3;
        this.LLILZ = z2;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
            bool = (Boolean) dataChannel.gg0(BattleBonusTaskShowChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool) && this.LLILLL) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.2f);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
        if (dataChannel != null) {
            dataChannel.CQ2(BattleBonusTaskShowChannel.class, this, new AwS591S0100000_12(this, 1248));
        }
    }

    public final void LJIIL(boolean z, boolean z2, EnumC919030a1V enumC919030a1V) {
        Object objGg0;
        LinearLayout linearLayout;
        boolean z3;
        C1146270fw1 c1146270fw1;
        C1146270fw1 c1146270fw12;
        int i;
        EnumC919030a1V enumC919030a1V2 = enumC919030a1V;
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(BattleStateChannel.class)) == null) {
            objGg0 = EnumC964170bCJ.NONE;
        }
        if (objGg0 != EnumC964170bCJ.MATCH_START && enumC919030a1V2 == EnumC919030a1V.EFFECTING) {
            C20441214yg.LJ("NewMvpContainer", "after match end, not possible to take effecting");
            enumC919030a1V2 = EnumC919030a1V.NORMAL;
        }
        C20441214yg.LIZIZ("NewMvpContainer", "showTop23Animation");
        if (z2) {
            linearLayout = this.LLJJIJIIJIL;
        } else {
            linearLayout = this.LLJJIJIL;
        }
        if (linearLayout != null && linearLayout.getVisibility() == 8) {
            return;
        }
        if (enumC919030a1V2 == EnumC919030a1V.EFFECTING) {
            z3 = true;
        } else {
            z3 = false;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.oyv);
        if (z) {
            if (z2) {
                c1146270fw1 = this.LLJI;
                c1146270fw12 = this.LLJIJIL;
            } else {
                c1146270fw1 = this.LLJJIII;
                c1146270fw12 = this.LLJJIJI;
            }
        } else if (z2) {
            c1146270fw1 = this.LLJIJIL;
            c1146270fw12 = this.LLJI;
        } else {
            c1146270fw1 = this.LLJJIJI;
            c1146270fw12 = this.LLJJIII;
        }
        C20441214yg.LIZIZ("NewMvpContainer", "playPowerUp");
        if (c1146270fw1 != null) {
            if (z) {
                i = 2;
            } else {
                i = 3;
            }
            boolean z4 = this.LLILLL;
            C1146320fw6 c1146320fw6 = new C1146320fw6(z, z3, c1146270fw12, z2);
            AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(c1146270fw12, 207);
            AwS15S0120000_17 awS15S0120000_17 = new AwS15S0120000_17(this, z3, z2, 0);
            c1146270fw1.LLJJJ = new AwS15S0120000_17(this, z3, z2, 1);
            synchronized (c1146270fw1.LLJILJILJ) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1146270fw1.LL);
                    sbLIZ.append(' ');
                    sbLIZ.append(c1146270fw1.LLJILJIL);
                    sbLIZ.append(" playPowerUpAnim synchronized");
                    C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
                    c1146270fw1.LLJILJILJ.add(new C1146300fw4(z3, i, C158B.LIZ(), z4, frameLayout, c1146320fw6, awS557S0100000_13, awS15S0120000_17));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c1146270fw1.LJII();
        }
    }

    public static final AnimatorSet LJIIIZ(float f, float f2, C1146270fw1 c1146270fw1, C1146270fw1 c1146270fw12, float f3, float f4) {
        c1146270fw12.setPivotX(f);
        c1146270fw12.setPivotY(f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1146270fw1, (Property<C1146270fw1, Float>) View.SCALE_X, f3, f4);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1146270fw1, (Property<C1146270fw1, Float>) View.SCALE_Y, f3, f4);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }
}
