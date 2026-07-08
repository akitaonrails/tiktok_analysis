package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel$startFeedRemainingPagedRead$1", f = "FeedSkylightListViewModel.kt", l = {655, 657, 657}, m = "invokeSuspend")
public final class C05AE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FeedSkylightListViewModel LLILLL;
    public final /* synthetic */ InterfaceC1455405mq<InterfaceC1891350zJl> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AE(FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq, int i, int i2, InterfaceC1364105Vn<? super C05AE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = feedSkylightListViewModel;
        this.LLILZ = interfaceC1455405mq;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05AE c05ae = new C05AE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05ae.LLILLJJLI = obj;
        return c05ae;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = this.LLILZ;
                try {
                    this.LLILLJJLI = th;
                    this.LL = 3;
                    if (interfaceC1455405mq.LIZIZ(this) == objLJFF) {
                        C1C7U.LIZIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
                        return objLJFF;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.LLILLJJLI;
                    try {
                        C155000ia.LIZIZ(obj);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        th = th4;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    this.LLILLL.LLJILJIL = null;
                    throw th;
                }
                C155000ia.LIZIZ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
                this.LLILLL.LLJILJIL = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            FeedSkylightListViewModel feedSkylightListViewModel = this.LLILLL;
            InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq2 = this.LLILZ;
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (feedSkylightListViewModel.QQ2(interfaceC1455405mq2, i2, i3, "FeedPagedRead", this) == objLJFF) {
                C1C7U.LIZIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
                return objLJFF;
            }
        }
        InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq3 = this.LLILZ;
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC1455405mq3.LIZIZ(this) == objLJFF) {
            C1C7U.LIZIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
            return objLJFF;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        this.LLILLL.LLJILJIL = null;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.startFeedRemainingPagedRead$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
