package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$setCacheCount$1", f = "OfflineModeManager.kt", l = {853}, m = "invokeSuspend")
public final class C1390305cL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390305cL(int i, InterfaceC1364105Vn<? super C1390305cL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390305cL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.setCacheCount$1");
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
                C625530OgB c625530OgB = C625530OgB.LIZ;
                int i2 = this.LLILLJJLI;
                this.LL = 1;
                c625530OgB.getClass();
                obj = C625530OgB.LJ(i2);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeManager@8800.setCacheCount$1");
                    return objLJFF;
                }
            }
            List list = (List) obj;
            C19319410i8 c19319410i8 = C625470Og5.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get exceededList: ");
            sbLIZ.append(list);
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            C01GW c01gw = C625420Og0.LIZ;
            C625420Og0.LJIIL(this.LLILLJJLI);
            C625470Og5.LL.getClass();
            C625470Og5.LLJLILLLLZIIL(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i82 = C625470Og5.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("set cache count, delete exceededAidList failed ");
            sbLIZ2.append(e);
            c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManager@8800.setCacheCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
