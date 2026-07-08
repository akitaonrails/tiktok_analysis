package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.experiment.LiveSkylightRefreshConfig$updateFollowCacheData$1", f = "LiveSkylightRefreshConfig.kt", l = {89}, m = "invokeSuspend")
public final class C340601Tw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0IV2 LLILLJJLI;
    public final /* synthetic */ Function0<List<Room>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C340601Tw(C0IV2 c0iv2, Function0<? extends List<? extends Room>> function0, InterfaceC1364105Vn<? super C340601Tw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0iv2;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C340601Tw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LiveSkylightRefreshConfig@6f24.updateFollowCacheData$1");
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
                C1DFB c1dfb = C0PEM.LIZJ;
                C340501Tv c340501Tv = new C340501Tv(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c340501Tv);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveSkylightRefreshConfig@6f24.updateFollowCacheData$1");
                    return objLJFF;
                }
            }
            C0IT6 c0it6 = C0IT6.LIZ;
            C0IT6.LIZLLL(this.LLILLJJLI, null, (List) obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSkylightRefreshConfig@6f24.updateFollowCacheData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
