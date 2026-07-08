package Y;

import X.C09JN;
import X.C0IJT;
import X.C0JFN;
import X.C0JFO;
import X.C1C7U;
import X.C472830IgT;
import X.C474500IjA;
import X.C500260Jjc;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public class AfS3S0100200_7 implements C09JN {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    public static final void accept$0(AfS3S0100200_7 afS3S0100200_7, Object obj) {
        ((RoomStatusController) afS3S0100200_7.l0).lambda$checkRoom$12(afS3S0100200_7.j1, afS3S0100200_7.j2, (C472830IgT) obj);
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS3S0100200_7 afS3S0100200_7, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("DrawGuessUtil@bdeb.guessWord$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        GuessResponse guessResponse = (GuessResponse) baseResponse.data;
        if (guessResponse != null) {
            boolValueOf = Boolean.valueOf(guessResponse.correct);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            DataChannel dataChannel = (DataChannel) afS3S0100200_7.l0;
            long j = afS3S0100200_7.j1;
            long j2 = afS3S0100200_7.j2;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_pictionary_answer_correct");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0JFO.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(Long.valueOf(j2), "pictionary_session_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "pictionary_id");
            c474500IjALIZ.LIZ();
            C0JFN c0jfn = C0JFN.LIZ;
            DataChannel dataChannel2 = (DataChannel) afS3S0100200_7.l0;
            long j3 = afS3S0100200_7.j1;
            String str = ((GuessResponse) baseResponse.data).word;
            c0jfn.getClass();
            C0JFN.LJIILLIIL(j3, dataChannel2, str);
        }
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.guessWord$1");
    }

    public AfS3S0100200_7(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
        this.j2 = j2;
    }
}
