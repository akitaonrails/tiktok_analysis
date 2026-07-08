package X;

import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdk.model.message.SeqDetectResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Iur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481750Iur extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedUserRoomMonitorMessage LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481750Iur(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage, long j, long j2, long j3, long j4) {
        super(0);
        this.LL = feedUserRoomMonitorMessage;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        InterfaceC481880Iv4 interfaceC481880Iv4 = C481760Ius.LLILLJJLI;
        C481790Iuv c481790IuvQ = interfaceC481880Iv4 != null ? interfaceC481880Iv4.q(this.LL) : null;
        long jLIZJ = c481790IuvQ != null && c481790IuvQ.LIZIZ ? C963140bAe.LIZJ() - this.LLILLJJLI : 0L;
        String str = (c481790IuvQ == null || !c481790IuvQ.LIZ) ? CardStruct.IStatusCode.DEFAULT : "1";
        String str2 = c481790IuvQ != null ? c481790IuvQ.LIZJ : null;
        C481760Ius c481760Ius = C481760Ius.LL;
        FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = this.LL;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        long j3 = this.LLILZIL;
        long j4 = this.LLILLJJLI;
        c481760Ius.getClass();
        C481760Ius.LIZ(str2, feedUserRoomMonitorMessage, str, 1, j, j2, j3, j4, jLIZJ);
        FeedUserRoomMonitorMessage feedUserRoomMonitorMessage2 = this.LL;
        SeqDetectResult seqDetectResult = feedUserRoomMonitorMessage2.seqDetectResult;
        if (seqDetectResult != null && seqDetectResult.detectedStatus >= 0 && !C481760Ius.LLILZIL) {
            C481710Iun.LL.getClass();
            C481710Iun.LIZ(feedUserRoomMonitorMessage2);
        }
        return Unit.LIZ;
    }
}
