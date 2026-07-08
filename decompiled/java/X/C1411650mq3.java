package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0mq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411650mq3 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ Function1<EnumC1411090mp9, Unit> LL;
    public final /* synthetic */ C1411700mq8 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411650mq3(AwS388S0200000_22 awS388S0200000_22, C1411700mq8 c1411700mq8, long j, int i) {
        super(1);
        this.LL = awS388S0200000_22;
        this.LLILLJJLI = c1411700mq8;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        int length;
        Throwable th2 = th;
        if (th2 instanceof TimeoutException) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip upload_task error timeout");
            this.LL.invoke(EnumC1411090mp9.TIMEOUT);
        } else {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai_tip upload_task error ");
            sbLIZ.append(th2.getMessage());
            c1437510nVlLJJLIIIJ.LIZ("ai_tip", C2188811AlT.LIZIZ(sbLIZ));
            this.LL.invoke(EnumC1411090mp9.NO_RESULT_RETURN);
        }
        RecommendDescRequestBody recommendDescRequestBody = this.LLILLJJLI.LIZIZ;
        if (recommendDescRequestBody != null) {
            length = recommendDescRequestBody.texts.length() + recommendDescRequestBody.description.length() + recommendDescRequestBody.title.length();
        } else {
            length = 0;
        }
        C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LIZ;
        EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
        EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.UPLOAD_TOS_FAIL;
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        int i = this.LLILZ;
        c1411660mq4.getClass();
        C1411660mq4.LIZIZ(videoPublishEditModel, enumC1287340jbY, enumC1411640mq2, message, jCurrentTimeMillis, 0L, length, i, false);
        return Unit.LIZ;
    }
}
