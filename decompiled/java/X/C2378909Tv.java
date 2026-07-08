package X;

import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment$initStableModeTask$1", f = "LiveBroadcastFragment.kt", l = {1230}, m = "invokeSuspend")
public final class C2378909Tv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ LiveBroadcastFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2378909Tv(long j, LiveBroadcastFragment liveBroadcastFragment, InterfaceC1364105Vn<? super C2378909Tv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = liveBroadcastFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2378909Tv c2378909Tv = new C2378909Tv(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2378909Tv.LLILLJJLI = obj;
        return c2378909Tv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveBroadcastFragment@d956.initStableModeTask$1");
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
            Object obj2 = this.LLILLJJLI;
            long j = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBroadcastFragment@d956.initStableModeTask$1");
                return objLJFF;
            }
        }
        if (this.LLILZ.isAdded() && this.LLILZ.getActivity() != null) {
            try {
                this.LLILZ.oS();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("LiveBroadcastFragment", "doInitStableModeTask failed", thM5exceptionOrNullimpl);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveBroadcastFragment@d956.initStableModeTask$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.initStableModeTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
