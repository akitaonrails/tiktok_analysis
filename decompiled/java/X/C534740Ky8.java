package X;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ky8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$realStartAutoCut$1", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C534740Ky8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1418150n0X LL;
    public final /* synthetic */ C1418230n0f LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534740Ky8(C1418150n0X c1418150n0X, C1418230n0f c1418230n0f, int i, InterfaceC1364105Vn<? super C534740Ky8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1418150n0X;
        this.LLILLJJLI = c1418230n0f;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534740Ky8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutComponent@2715.realStartAutoCut$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), C0PEM.LIZJ, null, new C534730Ky7(this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.realStartAutoCut$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
