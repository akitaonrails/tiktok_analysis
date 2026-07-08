package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel$retry$2", f = "BulletinPollVoteDetailViewModel.kt", l = {99}, m = "invokeSuspend")
public final class C465940IOy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinPollVoteDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C465940IOy(BulletinPollVoteDetailViewModel bulletinPollVoteDetailViewModel, InterfaceC1364105Vn<? super C465940IOy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinPollVoteDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C465940IOy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPollVoteDetailViewModel@3f6c.retry$2");
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
            BulletinPollVoteDetailViewModel bulletinPollVoteDetailViewModel = this.LLILLJJLI;
            this.LL = 1;
            if (bulletinPollVoteDetailViewModel.onRefresh(this) == objLJFF) {
                C1C7U.LIZIZ("BulletinPollVoteDetailViewModel@3f6c.retry$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPollVoteDetailViewModel@3f6c.retry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
