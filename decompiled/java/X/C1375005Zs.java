package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
public final class C1375005Zs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1369205Xm LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLILZIL;
    public final /* synthetic */ C1697530uH9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1375005Zs(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1631620sYq<? super InterfaceC595070NVp, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, Function1<? super C1378605aS, Unit> function1, C1697530uH9 c1697530uH9, InterfaceC1364105Vn<? super C1375005Zs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1369205Xm;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function1;
        this.LLILZLL = c1697530uH9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1375005Zs c1375005Zs = new C1375005Zs(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1375005Zs.LLILLJJLI = obj;
        return c1375005Zs;
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
            InterfaceC1369205Xm interfaceC1369205Xm = this.LLILLL;
            C1375105Zt c1375105Zt = new C1375105Zt(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C1363905Vl.LIZIZ(interfaceC1369205Xm, c1375105Zt, this) == objLJFF) {
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
