package X;

import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0eGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081970eGJ {
    public static final C1081970eGJ LIZ = new C1081970eGJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(188));
    public static CountDownTimerC1081960eGI LIZJ;
    public static boolean LIZLLL;
    public static DataChannel LJ;

    public final void LIZ(DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            return;
        }
        DataChannel dataChannel2 = LJ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        if (LIZLLL) {
            CountDownTimerC1081960eGI countDownTimerC1081960eGI = LIZJ;
            if (countDownTimerC1081960eGI != null) {
                countDownTimerC1081960eGI.cancel();
            }
            LIZLLL = false;
        }
        if (dataChannel == null) {
            return;
        }
        LJ = dataChannel;
        dataChannel.CQ2(DrawGuessRoundEndEvent.class, this, AFwS254S0000000_17.get$arr$(151));
        dataChannel.CQ2(DrawGuessRoundStartEvent.class, this, AFwS254S0000000_17.get$arr$(152));
        dataChannel.CQ2(DrawGuessExitGameEvent.class, this, AFwS254S0000000_17.get$arr$(153));
    }
}
