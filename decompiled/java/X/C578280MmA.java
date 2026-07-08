package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchComponent$switchMode$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {196}, m = "invokeSuspend")
public final class C578280MmA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578250Mm7 LLILLJJLI;
    public final /* synthetic */ C578340MmG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578280MmA(C578250Mm7 c578250Mm7, C578340MmG c578340MmG, InterfaceC1364105Vn<? super C578280MmA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578250Mm7;
        this.LLILLL = c578340MmG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578280MmA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.switchMode$1");
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
            this.LL = 1;
            if (C2252671DEz.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.switchMode$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.B3(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.switchMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
