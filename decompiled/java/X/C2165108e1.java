package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.educationsheet.CampusEducationSheetGate$refreshIfStale$1", f = "CampusEducationSheetGate.kt", l = {114}, m = "invokeSuspend")
public final class C2165108e1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2165108e1(InterfaceC1364105Vn<? super C2165108e1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2165108e1(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusEducationSheetGate@5e9f.refreshIfStale$1");
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
                C2165508e5 c2165508e5 = C2165508e5.LIZ;
                this.LL = 1;
                if (c2165508e5.LIZJ(this) == objLJFF) {
                    C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.refreshIfStale$1");
                    return objLJFF;
                }
            }
            C2165508e5.LIZJ.set(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.refreshIfStale$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2165508e5.LIZJ.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2165108e1(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
