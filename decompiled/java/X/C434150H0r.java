package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2$scrollToDescriptionArea$1$1$1", f = "PostModeCommentListFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C434150H0r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0SU0 LL;
    public final /* synthetic */ Float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434150H0r(C0SU0 c0su0, Float f, InterfaceC1364105Vn<? super C434150H0r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0su0;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434150H0r(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iFloatValue;
        C1C7U.LIZ("PostModeCommentListFragmentV2@35e6.scrollToDescriptionArea$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0SU0 c0su0 = this.LL;
        Float f = this.LLILLJJLI;
        if (f != null) {
            iFloatValue = (int) f.floatValue();
        } else {
            iFloatValue = 0;
        }
        c0su0.scrollBy(0, iFloatValue);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeCommentListFragmentV2@35e6.scrollToDescriptionArea$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
