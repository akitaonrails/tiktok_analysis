package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.split.CaptionSplitTextManager$insertCaption$2", f = "CaptionSplitTextManager.kt", l = {}, m = "invokeSuspend")
public final class C327530Csh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C327570Csl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327530Csh(C327570Csl c327570Csl, InterfaceC1364105Vn<? super C327530Csh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c327570Csl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327530Csh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CaptionSplitTextManager@eba9.insertCaption$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function0<Unit> function0 = this.LL.LJIJ;
        if (function0 != null) {
            function0.invoke();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("CaptionSplitTextManager@eba9.insertCaption$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
