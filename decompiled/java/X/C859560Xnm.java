package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$onUnbindFailed$2", f = "TwitterPresenter.kt", l = {}, m = "invokeSuspend")
public final class C859560Xnm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YZL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859560Xnm(C0YZL c0yzl, InterfaceC1364105Vn<? super C859560Xnm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yzl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859560Xnm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.onUnbindFailed$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI.eH0();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwitterPresenter@7a3a.onUnbindFailed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
