package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
public final class C1355005Sa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355005Sa(C1677480tko<Float, C1677280tkU> c1677480tko, boolean z, InterfaceC1677030tk5<Float> interfaceC1677030tk5, Function0<Unit> function0, InterfaceC1364105Vn<? super C1355005Sa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = z;
        this.LLILZ = interfaceC1677030tk5;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1355005Sa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
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
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            if (this.LLILLL) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            Float fLIZLLL = C2286608xc.LIZLLL(f);
            InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILZ;
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, interfaceC1677030tk5, null, null, this, 12) == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
