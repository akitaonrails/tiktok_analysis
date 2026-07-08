package X;

import android.view.View;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessAudienceSummaryDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ImQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476520ImQ extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ DrawGuessAudienceSummaryDialog LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476520ImQ(DrawGuessAudienceSummaryDialog drawGuessAudienceSummaryDialog, long j, int i) {
        super(1);
        this.LL = drawGuessAudienceSummaryDialog;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        DrawGuessAudienceSummaryDialog drawGuessAudienceSummaryDialog = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL;
        drawGuessAudienceSummaryDialog.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_pictionary_click_send_result");
        c474500IjALIZ.LJIJJLI(drawGuessAudienceSummaryDialog.dataChannel);
        C0JFO.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(String.valueOf(j), "pictionary_session_id");
        c474500IjALIZ.LJJII(String.valueOf(i), "correct_cnt");
        c474500IjALIZ.LIZ();
        int i2 = this.LLILLL;
        C1110530f0N c1110530f0N = new C1110530f0N(3, C497740JfY.LJIIL(2131755515, i2, Integer.valueOf(i2)));
        DataChannel dataChannel = this.LL.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(UserWannaSendMessageEvent.class, c1110530f0N);
        }
        this.LL.dismiss();
        return Unit.LIZ;
    }
}
