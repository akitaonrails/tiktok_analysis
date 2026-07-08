package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ui.ProfileRecFragment$onStart$1$1", f = "ProfileRecFragment.kt", l = {}, m = "invokeSuspend")
public final class C590910NFp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C590910NFp(InterfaceC1364105Vn<? super C590910NFp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590910NFp(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileRecFragment@2b20.onStart$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1483410ohn.LJLJJI().LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileRecFragment@2b20.onStart$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C590910NFp(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
