package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.VoiceChangeLogicComponent$pause$1", f = "VoiceChangeApiComponent.kt", l = {}, m = "invokeSuspend")
public final class C319800CgE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19541711ct LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319800CgE(C19541711ct c19541711ct, InterfaceC1364105Vn<? super C319800CgE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19541711ct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319800CgE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChangeLogicComponent@80a3.pause$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<? super Boolean, Unit> function1 = this.LL.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceChangeLogicComponent@80a3.pause$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
