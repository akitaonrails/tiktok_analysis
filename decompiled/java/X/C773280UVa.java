package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.TnsSignalReport$start$1$1$volumeJob$1", f = "TnsSignalReport.kt", l = {55}, m = "invokeSuspend")
public final class C773280UVa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C773300UVc LLILLJJLI;
    public final /* synthetic */ InterfaceC769940UIe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773280UVa(C773300UVc c773300UVc, InterfaceC769940UIe interfaceC769940UIe, InterfaceC1364105Vn<? super C773280UVa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c773300UVc;
        this.LLILLL = interfaceC769940UIe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C773280UVa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TnsSignalReport@29a8.start$1$1$volumeJob$1");
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
            C773310UVd c773310UVd = (C773310UVd) this.LLILLJJLI.LJIIJ.getValue();
            InterfaceC769940UIe interfaceC769940UIe = this.LLILLL;
            this.LL = 1;
            if (c773310UVd.LIZIZ(interfaceC769940UIe, this) == objLJFF) {
                C1C7U.LIZIZ("TnsSignalReport@29a8.start$1$1$volumeJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TnsSignalReport@29a8.start$1$1$volumeJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
