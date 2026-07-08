package X;

import Y.AfS103S0300000_7;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.widget.RealTimeSurveyCardParentWidget;
import com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyRouteWidget;
import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Kcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class CountDownTimerC521500Kcm extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$4(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
    }

    public static final void onTick$5(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
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
            case 3:
                onFinish$3(this);
                break;
            case 4:
                onFinish$4(this);
                break;
            case 5:
                onFinish$5(this);
                break;
            case 6:
                onFinish$6(this);
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
            case 3:
                onTick$3(this, j);
                break;
            case 4:
                onTick$4(this, j);
                break;
            case 5:
                onTick$5(this, j);
                break;
            case 6:
                onTick$6(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        final DrawGuessWord drawGuessWord;
        final boolean zBooleanValue;
        boolean z;
        long jLongValue;
        boolean z2;
        Long l;
        DrawGuessCanvasWidget drawGuessCanvasWidget = (DrawGuessCanvasWidget) countDownTimerC521500Kcm.l0;
        if (drawGuessCanvasWidget.LLIZ) {
            if (!C176600m4.LIZIZ((Boolean) drawGuessCanvasWidget.dataChannel.gg0(C748860TZc.class)) && (drawGuessWord = drawGuessCanvasWidget.LLJI) != null && !drawGuessCanvasWidget.LLJIJIL) {
                drawGuessCanvasWidget.LLJIJIL = true;
                Boolean bool = (Boolean) drawGuessCanvasWidget.dataChannel.gg0(C749050TZv.class);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                DataChannel dataChannel = drawGuessCanvasWidget.dataChannel;
                Boolean bool2 = Boolean.FALSE;
                dataChannel.SX0(C748850TZb.class, bool2);
                C0JFN c0jfn = C0JFN.LIZ;
                DataChannel dataChannel2 = drawGuessCanvasWidget.dataChannel;
                c0jfn.getClass();
                Long lLJJI = C0JFN.LJJI(dataChannel2);
                if (lLJJI != null && lLJJI.longValue() > 0) {
                    Fragment fragment = drawGuessCanvasWidget.widgetCallback.getFragment();
                    DataChannel dataChannel3 = drawGuessCanvasWidget.dataChannel;
                    AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(drawGuessCanvasWidget, 577);
                    if (dataChannel3 != null && (l = (Long) dataChannel3.gg0(DrawGuessSessionIdChannel.class)) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    DrawGuessApi drawGuessApi = (DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class);
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel3);
                    long j = drawGuessWord.id;
                    String str = drawGuessWord.word;
                    if (j == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawGuessApi.startDrawGuess(jLJJLIIIJ, jLongValue, j, str, C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS103S0300000_7(drawGuessWord, awS586S0100000_7, dataChannel3, 30), new C516201zk(awS586S0100000_7, 343));
                } else {
                    Fragment fragment2 = drawGuessCanvasWidget.widgetCallback.getFragment();
                    final DataChannel dataChannel4 = drawGuessCanvasWidget.dataChannel;
                    final AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(drawGuessCanvasWidget, 818);
                    final AwS586S0100000_7 awS586S0100000_72 = new AwS586S0100000_7(drawGuessCanvasWidget, 578);
                    DrawGuessApi drawGuessApi2 = (DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class);
                    long jLJJLIIIJ2 = C500260Jjc.LJJLIIIJ(dataChannel4);
                    long j2 = drawGuessWord.id;
                    String str2 = drawGuessWord.word;
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    drawGuessApi2.startDrawGuess(jLJJLIIIJ2, 0L, j2, str2, C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment2)).LJJLL(new C09JN() { // from class: X.0JFE
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            String str3;
                            C1C7U.LIZ("DrawGuessUtil@bdeb.requestNewSession$1");
                            BaseResponse baseResponse = (BaseResponse) obj;
                            if (!awS551S0100000_7.invoke().booleanValue()) {
                                StartDrawGuessResponse startDrawGuessResponse = (StartDrawGuessResponse) baseResponse.data;
                                if (startDrawGuessResponse == null) {
                                    awS586S0100000_72.invoke(Boolean.FALSE);
                                } else {
                                    DataChannel dataChannel5 = dataChannel4;
                                    boolean z3 = zBooleanValue;
                                    long j3 = startDrawGuessResponse.sessionId;
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_start");
                                    c474500IjALIZ.LJIJJLI(dataChannel5);
                                    C0JFO.LIZ(c474500IjALIZ);
                                    if (z3) {
                                        str3 = "play_again";
                                    } else {
                                        str3 = "start";
                                    }
                                    c474500IjALIZ.LJJII(str3, "enter_from");
                                    c474500IjALIZ.LJJII(Long.valueOf(j3), "pictionary_session_id");
                                    c474500IjALIZ.LJJII("draw_and_guess", "type");
                                    c474500IjALIZ.LIZ();
                                    C0JFN c0jfn2 = C0JFN.LIZ;
                                    DataChannel dataChannel6 = dataChannel4;
                                    StartDrawGuessResponse startDrawGuessResponse2 = (StartDrawGuessResponse) baseResponse.data;
                                    long j4 = startDrawGuessResponse2.pictionaryId;
                                    long j5 = startDrawGuessResponse2.sessionId;
                                    DrawGuessWord drawGuessWord2 = drawGuessWord;
                                    c0jfn2.getClass();
                                    C0JFN.LJIJ(j4, j5, drawGuessWord2, dataChannel6, false);
                                    awS586S0100000_72.invoke(Boolean.TRUE);
                                }
                            }
                            C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestNewSession$1");
                        }
                    }, new C516201zk(awS586S0100000_72, 344));
                    if (dataChannel4 != null) {
                        dataChannel4.SX0(C749050TZv.class, bool2);
                    }
                }
            }
            View[] viewArr = new View[2];
            C16F5 c16f5 = drawGuessCanvasWidget.LLILLJJLI;
            if (c16f5 == null) {
                c16f5 = null;
            }
            viewArr[0] = c16f5;
            C16F5 c16f52 = drawGuessCanvasWidget.LL;
            if (c16f52 == null) {
                c16f52 = null;
            }
            viewArr[1] = c16f52;
            DrawGuessCanvasWidget.y1(0L, viewArr);
            CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = drawGuessCanvasWidget.LLILZIL;
            if (countDownTimerC521500Kcm2 != null) {
                countDownTimerC521500Kcm2.cancel();
            }
            drawGuessCanvasWidget.LLILZIL = null;
            drawGuessCanvasWidget.LLIZ = false;
            if (C500260Jjc.LJIJI(drawGuessCanvasWidget.dataChannel)) {
                drawGuessCanvasWidget.dataChannel.zW(DrawGuessIsCountingDownRoundStart.class, Boolean.FALSE);
            }
        }
    }

    public static final void onFinish$1(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        RealTimeSurveyCardParentWidget realTimeSurveyCardParentWidget = (RealTimeSurveyCardParentWidget) countDownTimerC521500Kcm.l0;
        realTimeSurveyCardParentWidget.LLILZ = "timeout";
        realTimeSurveyCardParentWidget.hide();
        ((RealTimeSurveyCardParentWidget) countDownTimerC521500Kcm.l0).D1();
        ((RealTimeSurveyCardParentWidget) countDownTimerC521500Kcm.l0).LLIZLLLIL = false;
    }

    public static final void onFinish$2(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        LightSurveyRouteWidget lightSurveyRouteWidget = (LightSurveyRouteWidget) countDownTimerC521500Kcm.l0;
        lightSurveyRouteWidget.LLJ = 2;
        lightSurveyRouteWidget.hide();
        InnerSurveyViewModel innerSurveyViewModel = ((LightSurveyRouteWidget) countDownTimerC521500Kcm.l0).LLILLL;
        if (innerSurveyViewModel != null) {
            innerSurveyViewModel.EQ2();
        }
        ((LightSurveyRouteWidget) countDownTimerC521500Kcm.l0).LLILZLL = false;
    }

    public static final void onFinish$3(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        TextView textView = ((HangoutRandomMatchPanelFragment) countDownTimerC521500Kcm.l0).LLJJI;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131854713, 0));
        }
        ((HangoutRandomMatchPanelFragment) countDownTimerC521500Kcm.l0).dismiss();
    }

    public static final void onFinish$4(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        C467000ITa c467000ITa = (C467000ITa) countDownTimerC521500Kcm.l0;
        c467000ITa.LJII = true;
        if (!c467000ITa.LJIIIZ && c467000ITa.LJI) {
            c467000ITa.LIZ(c467000ITa.LIZIZ, c467000ITa.LIZLLL);
        }
    }

    public static final void onFinish$5(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        C467000ITa c467000ITa = (C467000ITa) countDownTimerC521500Kcm.l0;
        c467000ITa.LJII = true;
        if (!c467000ITa.LJIIIZ && c467000ITa.LJI && c467000ITa.LIZJ.size() >= ((C467000ITa) countDownTimerC521500Kcm.l0).LIZIZ().depthConfig.watchNCount - 1) {
            C467000ITa c467000ITa2 = (C467000ITa) countDownTimerC521500Kcm.l0;
            c467000ITa2.LIZ(c467000ITa2.LIZIZ, c467000ITa2.LIZLLL);
        }
    }

    public static final void onFinish$6(CountDownTimerC521500Kcm countDownTimerC521500Kcm) {
        ((DrawGuessStatusWidget) countDownTimerC521500Kcm.l0).J1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC521500Kcm(DrawGuessCanvasWidget drawGuessCanvasWidget, int i) {
        super(3500L, 1000L);
        this.$t = i;
        this.l0 = drawGuessCanvasWidget;
    }

    public static final void onTick$0(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
        DrawGuessCanvasWidget drawGuessCanvasWidget = (DrawGuessCanvasWidget) countDownTimerC521500Kcm.l0;
        drawGuessCanvasWidget.LLIZ = true;
        long j2 = j / 1000;
        if (j2 <= 0) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm2 = drawGuessCanvasWidget.LLILZIL;
            if (countDownTimerC521500Kcm2 != null) {
                countDownTimerC521500Kcm2.onFinish();
                return;
            }
            return;
        }
        C16F5 c16f5 = drawGuessCanvasWidget.LLILLJJLI;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(String.valueOf(j2));
    }

    public static final void onTick$1(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
        ((RealTimeSurveyCardParentWidget) countDownTimerC521500Kcm.l0).LLIZ -= 1000;
    }

    public static final void onTick$2(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
        ((LightSurveyRouteWidget) countDownTimerC521500Kcm.l0).LLILZIL -= 1000;
    }

    public static final void onTick$3(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        TextView textView = ((HangoutRandomMatchPanelFragment) countDownTimerC521500Kcm.l0).LLJJI;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131854713, Long.valueOf(j2)));
        }
    }

    public static final void onTick$6(CountDownTimerC521500Kcm countDownTimerC521500Kcm, long j) {
        DrawGuessStatusWidget drawGuessStatusWidget = (DrawGuessStatusWidget) countDownTimerC521500Kcm.l0;
        C16F5 c16f5 = drawGuessStatusWidget.LLILLL;
        if (c16f5 == null) {
            c16f5 = null;
        }
        c16f5.setText(DrawGuessStatusWidget.E1(drawGuessStatusWidget.B1((int) (j / 1000))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC521500Kcm(long j, Object obj, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = obj;
    }
}
