package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$computeAsync$1$1", f = "PlaySubtitleConfigController.kt", l = {}, m = "invokeSuspend")
public final class C463001rA extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C463001rA(InterfaceC1364105Vn<? super C463001rA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C463001rA c463001rA = new C463001rA(interfaceC1364105Vn);
        c463001rA.LL = ((Boolean) obj).booleanValue();
        return c463001rA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaySubtitleConfigController@5709.computeAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!this.LL);
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.computeAsync$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
