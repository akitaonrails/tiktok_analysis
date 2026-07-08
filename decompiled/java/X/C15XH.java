package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.15XH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ProtectionRepoKeva$7", f = "ProtectionRepoKeva.kt", l = {89}, m = "invokeSuspend")
public final class C15XH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15XY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15XH(C15XY c15xy, InterfaceC1364105Vn<? super C15XH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15xy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15XH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        b bVarLJ;
        C1C7U.LIZ("ProtectionRepoKeva@3944.<init>$7");
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
            C15XY c15xy = this.LLILLJJLI;
            if (c15xy != null && (bVarLJ = c15xy.LJ(C15Y5.SCREEN_TIME_MANAGEMENT_REPEAT_TYPE)) != null) {
                Object obj2 = new InterfaceC346701Wf() { // from class: X.15XI
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        int iIntValue;
                        Integer num = (Integer) obj3;
                        C20536115Xj c20536115Xj = C20536115Xj.LIZ;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c20536115Xj.getClass();
                        C20536115Xj.LIZIZ.storeInt(C20536115Xj.LJI("screen_time_management_repeat_type"), iIntValue);
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (bVarLJ.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$7");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProtectionRepoKeva@3944.<init>$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
