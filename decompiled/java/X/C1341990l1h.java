package X;

import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341990l1h extends C09AY implements Function1<C1342030l1l, C1342030l1l> {
    public final /* synthetic */ CommentPollViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1075920e6Y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341990l1h(CommentPollViewModel commentPollViewModel, String str, long j, C1075920e6Y c1075920e6Y) {
        super(1);
        this.LL = commentPollViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = c1075920e6Y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1342030l1l invoke(C1342030l1l c1342030l1l) {
        C1342030l1l c1342030l1l2 = c1342030l1l;
        CommentPollViewModel commentPollViewModel = this.LL;
        Map<String, PollInfo> mapLJIIIZ = c1342030l1l2.LL;
        String str = this.LLILLJJLI;
        Long lValueOf = Long.valueOf(this.LLILLL);
        commentPollViewModel.getClass();
        PollInfo pollInfo = mapLJIIIZ.get(str);
        if (pollInfo != null && (lValueOf == null || pollInfo.pollId == lValueOf.longValue())) {
            mapLJIIIZ = C2097608Jq.LJIIIZ(str, mapLJIIIZ);
        }
        return C1342030l1l.LIZ(c1342030l1l2, mapLJIIIZ, null, null, null, null, new C291001Au(this.LLILZ), null, null, null, 398);
    }
}
