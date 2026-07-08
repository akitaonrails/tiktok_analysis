package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.EPModelPreloader$preloadFallbackFont$1", f = "EPModelPreloader.kt", l = {92}, m = "invokeSuspend")
public final class C1431005iu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1431005iu(InterfaceC1364105Vn<? super C1431005iu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1431005iu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPModelPreloader@f6d6.preloadFallbackFont$1");
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
            C0E4Z c0e4z = C0E4Z.LIZ;
            this.LL = 1;
            c0e4z.getClass();
            if (C0E4Z.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("EPModelPreloader@f6d6.preloadFallbackFont$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPModelPreloader@f6d6.preloadFallbackFont$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1431005iu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
