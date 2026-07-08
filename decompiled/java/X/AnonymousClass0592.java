package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0592, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentInitializer$init$2", f = "OfflineCommentInitializer.kt", l = {25, 27}, m = "invokeSuspend")
public final class AnonymousClass0592 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05M0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0592(C05M0 c05m0, InterfaceC1364105Vn<? super AnonymousClass0592> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05m0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0592 anonymousClass0592 = new AnonymousClass0592(this.LLILLL, interfaceC1364105Vn);
        anonymousClass0592.LLILLJJLI = obj;
        return anonymousClass0592;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentInitializer@eb39.init$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$2");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C05M0 c05m0 = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (c05m0.LIZJ(this) == objLJFF) {
                C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$2");
                return objLJFF;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        if (AnonymousClass0597.LIZ()) {
            C05M0 c05m02 = this.LLILLL;
            C05M3 c05m3 = C05M3.LIZ;
            this.LLILLJJLI = null;
            this.LL = 2;
            if (c05m3.LIZIZ(c05m02, this) == objLJFF) {
                C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$2");
                return objLJFF;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
