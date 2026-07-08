package X;

import android.net.Uri;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalDetailWebLinkSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class CountDownTimerC511401yy extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$1(CountDownTimerC511401yy countDownTimerC511401yy, long j) {
    }

    public static final void onTick$2(CountDownTimerC511401yy countDownTimerC511401yy, long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.$t) {
            case 0:
                onFinish$0(this);
                break;
            case 1:
                onFinish$1(this);
                break;
            case 2:
                onFinish$2(this);
                break;
            default:
                super.onFinish();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.$t) {
            case 0:
                onTick$0(this, j);
                break;
            case 1:
                onTick$1(this, j);
                break;
            case 2:
                onTick$2(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC511401yy countDownTimerC511401yy) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_captcha_fail_popup_show");
        c474500IjALIZ.LJIJJLI(((CaptchaLiveWidget) countDownTimerC511401yy.l0).dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - ((CaptchaLiveWidget) countDownTimerC511401yy.l0).LLILLJJLI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "live_duration");
        c474500IjALIZ.LIZ();
    }

    public static final void onFinish$1(CountDownTimerC511401yy countDownTimerC511401yy) {
        String str;
        long id;
        String str2;
        long jLongValue;
        Long lLJIILIIL;
        C1108880exi c1108880exi = (C1108880exi) countDownTimerC511401yy.l0;
        c1108880exi.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            DataChannel dataChannel = null;
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            User owner = room.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            long id3 = room.getId();
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            DataChannel dataChannel2 = c1108880exi.LL;
            if (dataChannel2 != null) {
                dataChannel = dataChannel2;
            }
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            String strLIZ = C2348909Ih.LIZ("stream_goal_id");
            if (strLIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            String strLJIJI = C497740JfY.LJIJI(2131842014);
            if (strLJIJI != null) {
                str3 = strLJIJI;
            }
            C238200w0.LIZIZ(str, id, id3, currentUserId, jLongValue, str2, "invite_pin", str3);
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        Room room2 = ((C1108880exi) countDownTimerC511401yy.l0).LLILZ;
        if (room2 != null) {
            id2 = room2.getId();
        }
        ((C1108880exi) countDownTimerC511401yy.l0).getClass();
        String value = LiveStreamGoalDetailWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            builderBuildUpon.appendQueryParameter("capsule_message_from", "invite_pin");
            builderBuildUpon.appendQueryParameter("entrance", "stream_goal_im");
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        Text text = new Text();
        text.defaultPattern = C497740JfY.LJIJI(2131842014);
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.defaultPattern = C497740JfY.LJIJI(2131842015);
        capsuleMessage.buttonText = text2;
        capsuleMessage.schema = value;
        iPublicScreenService.Tn2(id2, new C1112330f3H(capsuleMessage, Integer.valueOf(R.drawable.epy), null, 0, 0, new C5182020e((C1108880exi) countDownTimerC511401yy.l0, 511), 28));
    }

    public static final void onFinish$2(CountDownTimerC511401yy countDownTimerC511401yy) {
        String str;
        long id;
        String str2;
        long jLongValue;
        Long lLJIILIIL;
        LiveGoalPinCardWidget liveGoalPinCardWidget = (LiveGoalPinCardWidget) countDownTimerC511401yy.l0;
        liveGoalPinCardWidget.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            User owner = room.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            long id3 = room.getId();
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (C500260Jjc.LJIIZILJ(liveGoalPinCardWidget.dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            String strLIZ = C2348909Ih.LIZ("stream_goal_id");
            if (strLIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            String strLJIJI = C497740JfY.LJIJI(2131842014);
            if (strLJIJI != null) {
                str3 = strLJIJI;
            }
            C238200w0.LIZIZ(str, id, id3, currentUserId, jLongValue, str2, "invite_pin", str3);
        }
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            id2 = room2.getId();
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        ((LiveGoalPinCardWidget) countDownTimerC511401yy.l0).getClass();
        String value = LiveStreamGoalDetailWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            builderBuildUpon.appendQueryParameter("capsule_message_from", "invite_pin");
            builderBuildUpon.appendQueryParameter("entrance", "stream_goal_im");
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        Text text = new Text();
        text.defaultPattern = C497740JfY.LJIJI(2131842014);
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.defaultPattern = C497740JfY.LJIJI(2131842015);
        capsuleMessage.buttonText = text2;
        capsuleMessage.schema = value;
        iPublicScreenService.Tn2(id2, new C1112330f3H(capsuleMessage, Integer.valueOf(R.drawable.epy), null, 0, 0, new C5182020e((LiveGoalPinCardWidget) countDownTimerC511401yy.l0, 512), 28));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC511401yy(Object obj, int i) {
        super(120000L, 120000L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onTick$0(CountDownTimerC511401yy countDownTimerC511401yy, long j) {
        Pair pair;
        TextView textView;
        CaptchaLiveWidget captchaLiveWidget = (CaptchaLiveWidget) countDownTimerC511401yy.l0;
        int i = (int) (j / 1000);
        captchaLiveWidget.getClass();
        String strLJJJJJL = a0.LJJJJJL('0', 2, String.valueOf(i / 60));
        String strLJJJJJL2 = a0.LJJJJJL('0', 2, String.valueOf(i % 60));
        if (!C426750GoL.LIZLLL(captchaLiveWidget.LL.getContext())) {
            pair = new Pair(strLJJJJJL, strLJJJJJL2);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((char) 8294);
            sbLIZ.append(strLJJJJJL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJJJJJL2);
            sbLIZ2.append((char) 8297);
            pair = new Pair(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        }
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        View view = captchaLiveWidget.getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.dc6)) != null) {
            textView.setText(C497740JfY.LJIJJ(2131842870, first, second));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC511401yy(CaptchaLiveWidget captchaLiveWidget, long j, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = captchaLiveWidget;
    }
}
