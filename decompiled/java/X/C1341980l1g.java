package X;

import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341980l1g extends C09AY implements Function1<C1342030l1l, C1342030l1l> {
    public final /* synthetic */ CommentPollViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1075920e6Y LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341980l1g(CommentPollViewModel commentPollViewModel, String str, Long l, long j, long j2, C1075920e6Y c1075920e6Y) {
        super(1);
        this.LL = commentPollViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = l;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = c1075920e6Y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1342030l1l invoke(C1342030l1l c1342030l1l) {
        long jLongValue;
        C1342030l1l c1342030l1l2 = c1342030l1l;
        CommentPollViewModel commentPollViewModel = this.LL;
        Map<String, PollInfo> mapLJIILIIL = c1342030l1l2.LL;
        String str = this.LLILLJJLI;
        Long l = this.LLILLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLILZ;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        long j = this.LLILZIL;
        commentPollViewModel.getClass();
        PollInfo pollInfo = mapLJIILIIL.get(str);
        if (pollInfo != null && (lValueOf == null || pollInfo.pollId == lValueOf.longValue())) {
            mapLJIILIIL = C2097608Jq.LJIILIIL(mapLJIILIIL, new Pair(str, pollInfo.copy(j, pollInfo.title, pollInfo.optionCountList, pollInfo.pollStatus, pollInfo.totalVotes, pollInfo.expireTime, pollInfo.userPollOption, pollInfo.pollStyle, pollInfo.creatorId, pollInfo.createTime)));
        }
        return C1342030l1l.LIZ(c1342030l1l2, mapLJIILIIL, null, new C291001Au(this.LLILZLL), null, null, null, null, null, null, 496);
    }
}
