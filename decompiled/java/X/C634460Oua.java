package X;

import com.ss.android.ugc.aweme.api.component.longpress.ADMutantCardLongPressComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.longpress.ADMutantCardLongPressComponent$dislike$2", f = "ADMutantCardLongPressComponent.kt", l = {}, m = "invokeSuspend")
public final class C634460Oua extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ADMutantCardLongPressComponent LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634460Oua(ADMutantCardLongPressComponent aDMutantCardLongPressComponent, String str, InterfaceC1364105Vn<? super C634460Oua> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aDMutantCardLongPressComponent;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C634460Oua(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ADMutantCardLongPressComponent@d712.dislike$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2277881EDy.LIZIZ.disLikeAweme(this.LL.LLJJJJLIIL, C737370SwB.LIZ(this.LLILLJJLI), "", 0, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ADMutantCardLongPressComponent@d712.dislike$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
