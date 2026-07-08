package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.BachInstanceWrapper$destroy$1", f = "BachInstanceManager.kt", l = {}, m = "invokeSuspend")
public final class C2271108v7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2294308yr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271108v7(C2294308yr c2294308yr, InterfaceC1364105Vn<? super C2271108v7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2294308yr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2271108v7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BachInstanceWrapper@fcd2.destroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LIZIZ);
            sbLIZ.append(" destroy start");
            C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
            C2294308yr c2294308yr = this.LL;
            synchronized (c2294308yr.LIZ) {
                try {
                    c2294308yr.LIZ.destroy();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c2294308yr.LIZIZ);
                    sbLIZ2.append(" destroy end");
                    C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ2));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (RuntimeException th) {
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BachInstanceWrapper@fcd2.destroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
