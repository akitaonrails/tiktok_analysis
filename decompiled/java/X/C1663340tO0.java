package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.ExpandableScrollableToolbarLayoutKt$ExpandableScrollableToolbarLayout$1$1", f = "ExpandableScrollableToolbarLayout.kt", l = {}, m = "invokeSuspend")
public final class C1663340tO0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> LL;
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1663340tO0(InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU, InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU2, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2, InterfaceC1364105Vn<? super C1663340tO0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = interfaceC1665500tRU2;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1663340tO0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU = this.LL;
        Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> function2 = this.LLILLL;
        Iterator<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> it2 = interfaceC1665500tRU.iterator();
        while (it2.hasNext()) {
            function2.invoke(it2.next().LIZ, C1460150o6H.LIZ);
        }
        InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU2 = this.LLILLJJLI;
        Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> function22 = this.LLILLL;
        Iterator<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> it3 = interfaceC1665500tRU2.iterator();
        while (it3.hasNext()) {
            function22.invoke(it3.next().LIZ, C1460150o6H.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
