package Y;

import X.C0IEU;
import X.C0IGD;
import X.C0IH6;
import X.C0III;
import X.C0IK6;
import X.C0IK8;
import X.C0IWW;
import X.C0TZC;
import X.C1161920gLG;
import X.C2188811AlT;
import X.C465900IOu;
import X.C467650IVn;
import X.C470480Icg;
import X.C477860Ioa;
import X.C479670IrV;
import X.C479740Irc;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC918990a1R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveInterceptJumpLiveTopActivitySetting;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS382S0100000_7 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LivePlayFragment) aObjectS382S0100000_7.l0).LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(((LivePlayFragment) aObjectS382S0100000_7.l0).LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        boolean z;
        C0IEU c0ieu;
        DataChannel dataChannel = ((AbsAudienceInteractionFragment) aObjectS382S0100000_7.l0).LLJIJIL;
        if (dataChannel != null && (c0ieu = (C0IEU) dataChannel.gg0(AudienceVideoViewParams.class)) != null && c0ieu.LJI != EnumC918990a1R.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        C0IGD c0igd = ((LivePlayFragment) aObjectS382S0100000_7.l0).f307n2;
        if (c0igd != null && ((LiveRoomFragment) c0igd).LLZIL) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$11(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS382S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        if (livePlayFragment.getActivity() != null) {
            return livePlayFragment.getActivity().getWindow();
        }
        return null;
    }

    public static final Object invoke$12(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        C0IGD c0igd = ((LivePlayFragment) aObjectS382S0100000_7.l0).f307n2;
        if (c0igd != null && ((LiveRoomFragment) c0igd).LLZIL) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$13(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        return ((C479740Irc) aObjectS382S0100000_7.l0).LIZIZ.rs();
    }

    public static final Object invoke$14(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        String strH2;
        C479740Irc c479740Irc = (C479740Irc) aObjectS382S0100000_7.l0;
        if (c479740Irc.LJIIJ.getSelectedTabPosition() == 1) {
            strH2 = c479740Irc.LIZIZ.H2(c479740Irc.LJIIJ.getSelectedTabPosition());
            C477860Ioa.LJI = true;
        } else {
            strH2 = "discover";
        }
        C479670IrV.LIZ(6, strH2);
        c479740Irc.LJIL = true;
        if (MultiGuestTopLiveIterationPhase1Setting.isEnable() && TextUtils.equals(c479740Irc.LIZ.U6().getClass().getCanonicalName(), MultiTopLiveInterceptJumpLiveTopActivitySetting.getValue())) {
            C465900IOu c465900IOu = new C465900IOu(6);
            c465900IOu.LIZLLL = c479740Irc.LJIIZILJ;
            C784440Upu.LIZ().LIZIZ(c465900IOu);
            ((ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class)).clearId();
        } else {
            c479740Irc.LIZ.U6().finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        ((C479740Irc) aObjectS382S0100000_7.l0).getClass();
        return C479740Irc.LJJ();
    }

    public static final Object invoke$2(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        float translationY;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS382S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C0IH6.LIZ(C0III.DISMISS_CARD_START);
        LiveEndCardWidget liveEndCardWidget = livePlayFragment.f299J;
        if (liveEndCardWidget != null) {
            Animator animator = liveEndCardWidget.LLL;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            View view = liveEndCardWidget.contentView;
            animatorArr[0] = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), (-liveEndCardWidget.LLJJ) - LiveEndCardWidget.LLLFZ);
            View view2 = liveEndCardWidget.LLJJJJJIL;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[2];
            if (view2 != null) {
                translationY = view2.getTranslationY();
            } else {
                translationY = 0.0f;
            }
            fArr[0] = translationY;
            fArr[1] = 0.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
            animatorSet.playTogether(animatorArr);
            animatorSet.setDuration(400L);
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.addListener(new ALAdapterS4S0100000_7(liveEndCardWidget, 23));
            animatorSet.start();
            liveEndCardWidget.LLL = animatorSet;
            View view3 = liveEndCardWidget.LLILLJJLI;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(Y.AObjectS382S0100000_7 r2) {
        /*
            java.lang.Object r2 = r2.l0
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r2 = (com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment) r2
            X.0IGD r0 = r2.f307n2
            if (r0 == 0) goto L27
            com.bytedance.android.livesdk.LiveRoomFragment r0 = (com.bytedance.android.livesdk.LiveRoomFragment) r0
            X.0IOL r0 = r0.LLLLIIIILLL
            if (r0 == 0) goto L27
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L27
            X.0IGD r0 = r2.f307n2
            com.bytedance.android.livesdk.LiveRoomFragment r0 = (com.bytedance.android.livesdk.LiveRoomFragment) r0
            X.0IOL r0 = r0.LLLLIIIILLL
            r0.getClass()
            boolean r0 = r0 instanceof X.C0ISJ
            if (r0 == 0) goto L27
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L27:
            r1 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS382S0100000_7.invoke$3(Y.AObjectS382S0100000_7):java.lang.Object");
    }

    public static final Object invoke$4(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        C467650IVn c467650IVn = ((LivePlayFragment) aObjectS382S0100000_7.l0).LLLF;
        long jLongValue = 0;
        if (c467650IVn != null) {
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - c467650IVn.LJJIFFI) - c467650IVn.LJJJI;
            if (C470480Icg.LIZ()) {
                Long lValueOf = 0L;
                Iterator it2 = ((ArrayList) LivePlayFragment.w2).iterator();
                while (it2.hasNext()) {
                    lValueOf = Long.valueOf(lValueOf.longValue() + ((Long) it2.next()).longValue());
                }
                jElapsedRealtime += lValueOf.longValue();
            }
            jLongValue = Long.valueOf(jElapsedRealtime).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static final Object invoke$5(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS382S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.CU(livePlayFragment.getActivity());
        return null;
    }

    public static final Object invoke$6(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS382S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.CU(livePlayFragment.getActivity());
        return null;
    }

    public static final Object invoke$7(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        return ((PortraitAudienceInteractionFragment) aObjectS382S0100000_7.l0).LLJIJIL.gg0(C0TZC.class);
    }

    public static final Object invoke$8(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        C0IWW c0iww = (C0IWW) aObjectS382S0100000_7.l0;
        c0iww.getClass();
        C784440Upu.LIZ().LIZIZ(new C0IK8(c0iww.LIZ.LLJILJIL.getId(), C0IK6.DISLIKE));
        return null;
    }

    public static final Object invoke$9(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        return Integer.valueOf(((LivePlayFragment) aObjectS382S0100000_7.l0).LLJLL);
    }

    public AObjectS382S0100000_7(LivePlayFragment livePlayFragment, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = livePlayFragment;
        } else {
            this.l0 = livePlayFragment;
        }
    }

    public AObjectS382S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
