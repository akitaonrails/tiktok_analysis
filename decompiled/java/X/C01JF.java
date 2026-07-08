package X;

import com.bytedance.android.livesdk.hints.LiveGiftApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.livegoal.GiftLiveGoalCapsuleHandler$enableCapsuleGuide$1", f = "GiftLiveGoalCapsuleHandler.kt", l = {105}, m = "invokeSuspend")
public final class C01JF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C01JG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JF(C01JG c01jg, boolean z, InterfaceC1364105Vn<? super C01JF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01jg;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("GiftLiveGoalCapsuleHandler@eecb.enableCapsuleGuide$1");
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
                C01JG c01jg = this.LLILLJJLI;
                boolean z2 = this.LLILLL;
                LiveGiftApi liveGiftApi = (LiveGiftApi) c01jg.LL.getValue();
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = 1;
                obj = liveGiftApi.enableLiveGoalCapsule(z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GiftLiveGoalCapsuleHandler@eecb.enableCapsuleGuide$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C470590Icr) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftLiveGoalCapsuleHandler@eecb.enableCapsuleGuide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
