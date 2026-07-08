package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateCloudDraftEdit$downloadState$1", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LNB extends C09AX implements Function2<C0LN4<? extends String>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C0LNB(InterfaceC1364105Vn<? super C0LNB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LNB c0lnb = new C0LNB(interfaceC1364105Vn);
        c0lnb.LL = obj;
        return c0lnb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$downloadState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (!(obj2 instanceof C0LN7) && !(obj2 instanceof C0LN3)) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$downloadState$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0LN4<? extends String> c0ln4, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0ln4, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
