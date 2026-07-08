package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightStoryMafExitUtil$onExpose$1", f = "SkylightStoryMafExitUtil.kt", l = {}, m = "invokeSuspend")
public final class C1605580rsq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1605610rst LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605580rsq(C1605610rst c1605610rst, InterfaceC1364105Vn<? super C1605580rsq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1605610rst;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605580rsq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightStoryMafExitUtil@ecca.onExpose$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1605590rsr c1605590rsr = C1605590rsr.LIZ;
        C1605610rst c1605610rst = this.LL;
        c1605590rsr.getClass();
        C1605590rsr.LIZLLL(c1605610rst);
        C1605590rsr.LIZJ.storeInt("expose_count", C1605590rsr.LIZJ.getInt("expose_count", 0) + 1);
        this.LL.LIZJ = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightStoryMafExitUtil@ecca.onExpose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
