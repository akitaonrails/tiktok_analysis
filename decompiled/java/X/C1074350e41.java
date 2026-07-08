package X;

import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell$onRetryClicked$1", f = "PollCell.kt", l = {762}, m = "invokeSuspend")
public final class C1074350e41 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PollCell LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074350e41(PollCell pollCell, String str, long j, InterfaceC1364105Vn<? super C1074350e41> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pollCell;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074350e41(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        int awemeType;
        Aweme aweme;
        Aweme aweme2;
        User author;
        C1C7U.LIZ("PollCell@f7ff.onRetryClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            CommentPollViewModel commentPollViewModelX5 = this.LLILLJJLI.X5();
            String str = this.LLILLL;
            Long lLJFF = C2286608xc.LJFF(this.LLILZ);
            CommentContextSource commentContextSourceA6 = this.LLILLJJLI.a6();
            if (commentContextSourceA6 == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceA6)) == null || (author = aweme2.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            CommentContextSource commentContextSourceA62 = this.LLILLJJLI.a6();
            if (commentContextSourceA62 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceA62)) != null) {
                awemeType = aweme.getAwemeType();
            } else {
                awemeType = 0;
            }
            this.LL = 1;
            if (commentPollViewModelX5.xQ2(awemeType, lLJFF, str, uid, this) == objLJFF) {
                C1C7U.LIZIZ("PollCell@f7ff.onRetryClicked$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PollCell@f7ff.onRetryClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
