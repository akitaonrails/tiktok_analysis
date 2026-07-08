package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell$applyVoteAndFireRequest$9", f = "PollCell.kt", l = {861, 863}, m = "invokeSuspend")
public final class C1074360e42 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ PollCell LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074360e42(boolean z, PollCell pollCell, String str, long j, int i, int i2, InterfaceC1364105Vn<? super C1074360e42> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = pollCell;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074360e42(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PollCell@f7ff.applyVoteAndFireRequest$9");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                CommentPollViewModel commentPollViewModelX5 = this.LLILLL.X5();
                String str = this.LLILZ;
                long j = this.LLILZIL;
                int i2 = this.LLILZLL;
                this.LL = 1;
                if (commentPollViewModelX5.vQ2(i2, j, str, this) == objLJFF) {
                    C1C7U.LIZIZ("PollCell@f7ff.applyVoteAndFireRequest$9");
                    return objLJFF;
                }
            } else {
                CommentPollViewModel commentPollViewModelX52 = this.LLILLL.X5();
                String str2 = this.LLILZ;
                long j2 = this.LLILZIL;
                int i3 = this.LLIZ;
                this.LL = 2;
                if (commentPollViewModelX52.wQ2(i3, j2, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("PollCell@f7ff.applyVoteAndFireRequest$9");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PollCell@f7ff.applyVoteAndFireRequest$9");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
