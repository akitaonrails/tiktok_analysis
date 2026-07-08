package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0x4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$switchTab$1", f = "RechargePanelBodyViewModel.kt", l = {320}, m = "invokeSuspend")
public final class C1804930x4N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804930x4N(RechargePanelBodyViewModel rechargePanelBodyViewModel, int i, InterfaceC1364105Vn<? super C1804930x4N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1804930x4N(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.switchTab$1");
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
            C1805530x5L c1805530x5LWQ2 = this.LLILLJJLI.wQ2();
            if (c1805530x5LWQ2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.switchTab$1");
                return unit;
            }
            if (this.LLILLL == 0) {
                str = "tiktok";
            } else {
                str = "google_play";
            }
            C1805210x4p c1805210x4pLIZ = C1805210x4p.LIZ(this.LLILLJJLI.getState().LLILLJJLI, str, false, true, null, null, null, false, false, null, false, null, null, null, null, null, false, null, 131066);
            this.LLILLJJLI.LLILZIL.LIZLLL(c1805530x5LWQ2.LLILLL.LJIIL, str, c1805210x4pLIZ.LJI);
            this.LLILLJJLI.setState(new AwS606S0100000_27(c1805210x4pLIZ, 572));
            RechargePanelBodyViewModel rechargePanelBodyViewModel = this.LLILLJJLI;
            C1805370x55 c1805370x55 = rechargePanelBodyViewModel.getState().LLILLJJLI.LJIIL;
            this.LL = 1;
            if (rechargePanelBodyViewModel.EQ2(c1805210x4pLIZ, null, c1805370x55, this) == objLJFF) {
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.switchTab$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.switchTab$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
