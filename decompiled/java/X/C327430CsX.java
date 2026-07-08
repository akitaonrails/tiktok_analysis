package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$recordRelationForLogin$1", f = "ReflowSideProcessor.kt", l = {355}, m = "invokeSuspend")
public final class C327430CsX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1234160iDm LLILLJJLI;
    public final /* synthetic */ C1233510iCj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327430CsX(C1234160iDm c1234160iDm, C1233510iCj c1233510iCj, InterfaceC1364105Vn<? super C327430CsX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1234160iDm;
        this.LLILLL = c1233510iCj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327430CsX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReflowSideProcessor@9181.recordRelationForLogin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C099G c099gLIZIZ = C23250099c.LIZIZ(this.LLILLJJLI.LIZ, null, null, new C1233450iCd(false, this.LLILLL, null, null), 3);
                this.LL = 1;
                if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("ReflowSideProcessor@9181.recordRelationForLogin$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("@LinkRelation", "recordRelation for login error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReflowSideProcessor@9181.recordRelationForLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
