package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0nDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.sug.EditEffectSearchSugComponent$fetchSug$1$ret$3$1", f = "EditEffectSearchSugComponent.kt", l = {}, m = "invokeSuspend")
public final class C1426040nDG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1426080nDK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426040nDG(C1426080nDK c1426080nDK, InterfaceC1364105Vn<? super C1426040nDG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1426080nDK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1426040nDG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditEffectSearchSugComponent@5853.fetchSug$1$ret$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.i3(AFwS261S0000000_22.get$arr$(54));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditEffectSearchSugComponent@5853.fetchSug$1$ret$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
