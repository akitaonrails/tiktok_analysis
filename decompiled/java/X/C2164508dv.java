package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.school.educationsheet.CampusEducationSheetStatusAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.educationsheet.CampusEducationSheetGate$notifyShown$1", f = "CampusEducationSheetGate.kt", l = {76}, m = "invokeSuspend")
public final class C2164508dv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C2164508dv(InterfaceC1364105Vn<? super C2164508dv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2164508dv c2164508dv = new C2164508dv(interfaceC1364105Vn);
        c2164508dv.LLILLJJLI = obj;
        return c2164508dv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("CampusEducationSheetGate@5e9f.notifyShown$1");
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
                CampusEducationSheetStatusAPI.LIZ.getClass();
                CampusEducationSheetStatusAPI value = C2164708dx.LIZIZ.getValue();
                this.LL = 1;
                obj = value.updatePopupStatus(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.notifyShown$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C0X52) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CampusEducationSheetGate@5e9f.notifyShown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
