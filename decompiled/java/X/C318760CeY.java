package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel$onClick$1", f = "CreateTabBottomBtnViewModel.kt", l = {75}, m = "invokeSuspend")
public final class C318760CeY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTabBottomBtnViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318760CeY(CreateTabBottomBtnViewModel createTabBottomBtnViewModel, InterfaceC1364105Vn<? super C318760CeY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = createTabBottomBtnViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318760CeY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateTabBottomBtnViewModel@8f4d.onClick$1");
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
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "CreateTabBottomBtnViewModel", "on click");
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZIL;
            Unit unit = Unit.LIZ;
            this.LL = 1;
            if (c2252331DDr.emit(unit, this) == objLJFF) {
                C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.onClick$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.onClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
