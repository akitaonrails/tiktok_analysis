package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$onMuteStateChanged$1", f = "CallSession.kt", l = {184, 186}, m = "invokeSuspend")
public final class C1302180jzU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1302520k02 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302180jzU(boolean z, C1302520k02 c1302520k02, InterfaceC1364105Vn<? super C1302180jzU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1302520k02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302180jzU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C05YC<EnumC1302210jzX> c05yc = this.LLILLL.LLIZLLLIL;
                EnumC1302210jzX enumC1302210jzX = EnumC1302210jzX.GLOBAL_MUTED;
                this.LL = 1;
                if (c05yc.emit(enumC1302210jzX, this) == objLJFF) {
                    return objLJFF;
                }
            } else {
                C05YC<EnumC1302210jzX> c05yc2 = this.LLILLL.LLIZLLLIL;
                EnumC1302210jzX enumC1302210jzX2 = EnumC1302210jzX.GLOBAL_UNMUTE;
                this.LL = 2;
                if (c05yc2.emit(enumC1302210jzX2, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
