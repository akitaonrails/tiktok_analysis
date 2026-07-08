package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0urg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarViewModel$processAction$10", f = "StellarViewModel.kt", l = {565}, m = "invokeSuspend")
public final class C1720180urg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StellarViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC2201008jo LLILLL;
    public final /* synthetic */ C1720250urn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720180urg(StellarViewModel stellarViewModel, AbstractC2201008jo abstractC2201008jo, C1720250urn c1720250urn, InterfaceC1364105Vn<? super C1720180urg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stellarViewModel;
        this.LLILLL = abstractC2201008jo;
        this.LLILZ = c1720250urn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1720180urg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        C1C7U.LIZ("StellarViewModel@1bbc.processAction$10");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJJ;
            StellarTooltipDO stellarTooltipDO = ((C1720140urc) this.LLILLL).LIZ;
            C1720250urn c1720250urn = this.LLILZ;
            if (c1720250urn != null) {
                view = c1720250urn.LIZLLL;
            } else {
                view = null;
            }
            C443610HaR c443610HaR = new C443610HaR(stellarTooltipDO, view);
            this.LL = 1;
            if (c2252331DDr.emit(c443610HaR, this) == objLJFF) {
                C1C7U.LIZIZ("StellarViewModel@1bbc.processAction$10");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StellarViewModel@1bbc.processAction$10");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
