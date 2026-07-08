package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend")
public final class C1374505Zn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1369205Xm LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZIL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZLL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374505Zn(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12, Function1 function13, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1369205Xm;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1374505Zn c1374505Zn = new C1374505Zn(this.LLILLL, interfaceC1364105Vn, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILZ);
        c1374505Zn.LLILLJJLI = obj;
        return c1374505Zn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1697530uH9 c1697530uH9 = new C1697530uH9(this.LLILLL);
            InterfaceC1369205Xm interfaceC1369205Xm = this.LLILLL;
            C1375605Zy c1375605Zy = new C1375605Zy(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, c1697530uH9, null);
            this.LL = 1;
            if (C1363905Vl.LIZIZ(interfaceC1369205Xm, c1375605Zy, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
