package X;

import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel$selectNormalPoll$1", f = "SelectPollViewModel.kt", l = {99}, m = "invokeSuspend")
public final class C478101tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SelectPollViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478101tb(long j, long j2, int i, SelectPollViewModel selectPollViewModel, InterfaceC1364105Vn<? super C478101tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = selectPollViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478101tb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectPollViewModel@d7a6.selectNormalPoll$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C480460Ism.LIZ().getClass();
                AnonymousClass0957<C470590Icr<VoteResponseData>> anonymousClass0957Vote = ((PollApi) C480460Ism.LIZLLL(PollApi.class)).vote(this.LLILLJJLI, this.LLILLL, this.LLILZ);
                this.LL = 1;
                obj = anonymousClass0957Vote.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SelectPollViewModel@d7a6.selectNormalPoll$1");
                    return objLJFF;
                }
            }
            ((NextLiveData) this.LLILZIL.LLILZIL.getValue()).setValue(((C470590Icr) obj).data);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL.vQ2().setValue(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectPollViewModel@d7a6.selectNormalPoll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
