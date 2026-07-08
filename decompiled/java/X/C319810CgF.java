package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VoiceChangeLogicComponent$play$1", f = "VoiceChangeApiComponent.kt", l = {}, m = "invokeSuspend")
public final class C319810CgF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19541711ct LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319810CgF(C19541711ct c19541711ct, InterfaceC1364105Vn<? super C319810CgF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19541711ct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319810CgF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<? super Boolean, Unit> function1;
        C1C7U.LIZ("VoiceChangeLogicComponent@80a3.play$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19541711ct c19541711ct = this.LL;
        if (!c19541711ct.LLJIJIL && (function1 = c19541711ct.LLIZLLLIL) != null) {
            function1.invoke(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChangeLogicComponent@80a3.play$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
