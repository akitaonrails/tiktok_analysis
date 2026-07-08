package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$tryToQuit$2$1", f = "EffectEditVM.kt", l = {451}, m = "invokeSuspend")
public final class C1736550vI5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectEditVM LLILLJJLI;
    public final /* synthetic */ C1736830vIX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736550vI5(EffectEditVM effectEditVM, C1736830vIX c1736830vIX, InterfaceC1364105Vn<? super C1736550vI5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectEditVM;
        this.LLILLL = c1736830vIX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1736550vI5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0176 A[PHI: r1
      0x0176: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:84:0x0173, B:69:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1736550vI5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
