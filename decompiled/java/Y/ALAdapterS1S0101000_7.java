package Y;

import X.C0KA4;
import X.C0KAJ;
import X.C1096340edU;
import X.C1102070emj;
import X.C1107780evw;
import X.C1107810evz;
import X.C1161920gLG;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromote3PhotoWidget;
import com.bytedance.android.livesdk.dataChannel.FollowGuideNewStyleVisibility;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public class ALAdapterS1S0101000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0101000_7 aLAdapterS1S0101000_7, Animator animator) {
        LivePromote3PhotoWidget livePromote3PhotoWidget = (LivePromote3PhotoWidget) aLAdapterS1S0101000_7.l0;
        TuxTextView tuxTextView = livePromote3PhotoWidget.LLJJL;
        if (tuxTextView != null) {
            tuxTextView.setText(((GoLiveCardPicture) ListProtector.get(livePromote3PhotoWidget.LLILZLL.pictures, aLAdapterS1S0101000_7.i1)).text);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0101000_7 aLAdapterS1S0101000_7, Animator animator) {
        DataChannel dataChannel = ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FollowGuideNewStyleVisibility.class, Boolean.FALSE);
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0;
        if (!liveRoomUserInfoWidget.k) {
            int i = aLAdapterS1S0101000_7.i1;
            if (i != 6) {
                if (i != 7) {
                    if (i == 8) {
                        liveRoomUserInfoWidget.p = "follow_guide_expand_all_2";
                    }
                } else {
                    liveRoomUserInfoWidget.p = "follow_guide_expand_2";
                }
            } else {
                liveRoomUserInfoWidget.p = "follow_guide_shake_2";
            }
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, liveRoomUserInfoWidget.c, liveRoomUserInfoWidget.q);
        for (Map.Entry entry : ((HashMap) ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).r).entrySet()) {
            C786410Ut5.LJLIIL(((Long) entry.getValue()).longValue(), ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).c, (Runnable) entry.getKey());
        }
        C1096340edU c1096340edU = ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJI();
            ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).LLLZ.LJ();
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0;
        if (liveRoomUserInfoWidget2.s == null) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel2 = liveRoomUserInfoWidget2.dataChannel;
            C0KA4 c0ka4 = liveRoomUserInfoWidget2.P;
            C0KAJ c0kaj = C0KAJ.AUTO_TIMEOUT;
            c1102070emj.getClass();
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel2, liveRoomUserInfoWidget2, c0ka4, c0kaj, null, null, 112);
            ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).h = null;
        }
        ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).dataChannel, C1107810evz.LJJJJI, new C1107780evw(false, (Object) null));
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0101000_7 aLAdapterS1S0101000_7, Animator animator) {
        C786410Ut5.LJZ(8, ((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).T1());
        C786410Ut5.fd(((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).T1(), 0.0f);
        C786410Ut5.LJZ(0, ((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).R1());
        C786410Ut5.fd(((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).R1(), 0.0f);
    }

    public static final void onAnimationStart$0(ALAdapterS1S0101000_7 aLAdapterS1S0101000_7, Animator animator) {
        DataChannel dataChannel = ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FollowGuideNewStyleVisibility.class, Boolean.TRUE);
        }
        int i = aLAdapterS1S0101000_7.i1;
        if (i != 6) {
            if (i != 7) {
                if (i == 8) {
                    ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).p = "follow_guide_expand_all_1";
                }
            } else {
                ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).p = "follow_guide_expand_1";
            }
        } else {
            ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).p = "follow_guide_shake_1";
        }
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0;
        liveRoomUserInfoWidget.c.removeCallbacks(liveRoomUserInfoWidget.q);
        Iterator it2 = ((HashMap) ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).r).keySet().iterator();
        while (it2.hasNext()) {
            ((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).c.removeCallbacks((Runnable) it2.next());
        }
        ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(((LiveRoomUserInfoWidget) aLAdapterS1S0101000_7.l0).dataChannel, C1107810evz.LJJJJI, new C1107780evw(true, (Object) null));
    }

    public static final void onAnimationStart$1(ALAdapterS1S0101000_7 aLAdapterS1S0101000_7, Animator animator) {
        C786410Ut5.LJZ(0, ((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).T1());
        C786410Ut5.fd(((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).T1(), 0.0f);
        C786410Ut5.LJZ(0, ((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).R1());
        C786410Ut5.fd(((LiveSurveyWidgetV2) aLAdapterS1S0101000_7.l0).R1(), aLAdapterS1S0101000_7.i1);
    }

    public ALAdapterS1S0101000_7(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
