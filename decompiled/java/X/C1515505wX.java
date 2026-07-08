package X;

import Y.AgS283S0100000_2;
import com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel$observerTypingStatus$1", f = "GroupTitleBarViewModel.kt", l = {210}, m = "invokeSuspend")
public final class C1515505wX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupTitleBarViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515505wX(GroupTitleBarViewModel groupTitleBarViewModel, InterfaceC1364105Vn<? super C1515505wX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupTitleBarViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1515505wX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupTitleBarViewModel@b55f.observerTypingStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1504005ug c1504005ug = C1504005ug.LL;
            String strAQ2 = this.LLILLJJLI.AQ2();
            EnumC1504205ui enumC1504205ui = EnumC1504205ui.GROUP;
            c1504005ug.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1768806wI(C1504005ug.LIZIZ(strAQ2, enumC1504205ui).LIZIZ(), 10));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 58);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("GroupTitleBarViewModel@b55f.observerTypingStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupTitleBarViewModel@b55f.observerTypingStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
