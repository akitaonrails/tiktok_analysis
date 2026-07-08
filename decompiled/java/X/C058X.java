package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentInitializer$init$3", f = "OfflineCommentInitializer.kt", l = {32}, m = "invokeSuspend")
public final class C058X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C058X(InterfaceC1364105Vn<? super C058X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C058X c058x = new C058X(interfaceC1364105Vn);
        c058x.LLILLJJLI = obj;
        return c058x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentInitializer@eb39.init$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (AnonymousClass0597.LIZ()) {
                C1396050mQt c1396050mQt = C1396050mQt.LIZ;
                this.LL = 1;
                if (c1396050mQt.LJIIIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$3");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$3");
            return unit;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentInitializer@eb39.init$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
