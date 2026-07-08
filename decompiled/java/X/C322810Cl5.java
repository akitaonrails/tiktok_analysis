package X;

import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM$tryPreloadSearchPageData$1", f = "SelectorSearchPageVM.kt", l = {}, m = "invokeSuspend")
public final class C322810Cl5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SelectorSearchPageVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322810Cl5(SelectorSearchPageVM selectorSearchPageVM, InterfaceC1364105Vn<? super C322810Cl5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = selectorSearchPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322810Cl5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectorSearchPageVM@33f4.tryPreloadSearchPageData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SelectorSearchPageVM selectorSearchPageVM = this.LL;
        selectorSearchPageVM.getClass();
        selectorSearchPageVM.LLILZIL = EnumC1989907qr.SET_DEFAULT_DATA;
        selectorSearchPageVM.getConfig().getOperator().refresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectorSearchPageVM@33f4.tryPreloadSearchPageData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
