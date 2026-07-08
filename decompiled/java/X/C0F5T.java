package X;

import Y.AgS286S0100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0F5T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.CaptionLoadingPresenter$showLoading$1", f = "CaptionLoadingPresenter.kt", l = {184}, m = "invokeSuspend")
public final class C0F5T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0F5B LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F5T(C0F5B c0f5b, InterfaceC1364105Vn<? super C0F5T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0f5b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F5T(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionLoadingPresenter@3ec5.showLoading$1");
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
            String strWQ2 = this.LLILLJJLI.LIZ.LIZLLL.wQ2("auto_language");
            C0F5B c0f5b = this.LLILLJJLI;
            boolean zLJFF = Intrinsics.LJFF(c0f5b.LIZ.LJI.LIZ, strWQ2);
            c0f5b.getClass();
            C095D c095d = new C095D(new C0F5U(c0f5b, zLJFF, null));
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLJJLI, 22);
            this.LL = 1;
            if (c095d.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("CaptionLoadingPresenter@3ec5.showLoading$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionLoadingPresenter@3ec5.showLoading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
