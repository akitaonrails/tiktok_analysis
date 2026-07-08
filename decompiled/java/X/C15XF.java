package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.15XF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.DigitalWellbeingManagerV2$1", f = "DigitalWellbeingManagerV2.kt", l = {69}, m = "invokeSuspend")
public final class C15XF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15XY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15XF(C15XY c15xy, InterfaceC1364105Vn<? super C15XF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15xy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15XF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        b bVarLJII;
        C1C7U.LIZ("DigitalWellbeingManagerV2@ac05.<init>$1");
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
            if (c15xy != null && (bVarLJII = c15xy.LJII(EnumC20536915Xr.DIGITAL_WELLBEING_CHANGED)) != null) {
                Object obj2 = new InterfaceC346701Wf() { // from class: X.15XG
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C15Y6.LL.LJJIIJZLJL();
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (bVarLJII.collect(obj2, this) == objLJFF) {
                    C1C7U.LIZIZ("DigitalWellbeingManagerV2@ac05.<init>$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DigitalWellbeingManagerV2@ac05.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
