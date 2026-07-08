package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell$executeDeletePoll$1", f = "PollCell.kt", l = {1488}, m = "invokeSuspend")
public final class C1074340e40 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PollCell LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074340e40(PollCell pollCell, String str, long j, InterfaceC1364105Vn<? super C1074340e40> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pollCell;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074340e40(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PollCell@f7ff.executeDeletePoll$1");
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
            long j = this.LLILZ;
            this.LL = 1;
            obj = commentPollViewModelX5.yQ2(j, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PollCell@f7ff.executeDeletePoll$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Fragment fragment = this.LLILLJJLI.getFragment();
            if (fragment != null && fragment.isAdded()) {
                C19EG activity = fragment.getActivity();
                if (activity == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PollCell@f7ff.executeDeletePoll$1");
                    return unit;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131829141);
                c1389890mGx.LJIIJJI();
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PollCell@f7ff.executeDeletePoll$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PollCell@f7ff.executeDeletePoll$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
