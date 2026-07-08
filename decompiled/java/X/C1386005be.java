package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.ExpandableScrollableToolbarLayoutKt$ExpandableScrollableToolbarLayout$3", f = "ExpandableScrollableToolbarLayout.kt", l = {}, m = "invokeSuspend")
public final class C1386005be extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<C1676880tjq<Boolean>> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386005be(InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1386005be(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element.LJI(Boolean.valueOf(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
