package X;

import com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0qrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.header.viewmodel.RechargePanelHeaderViewModel$resolveTitleBarSlice$1", f = "RechargePanelHeaderViewModel.kt", l = {46, 54}, m = "invokeSuspend")
public final class C1566220qrM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelHeaderViewModel LLILLJJLI;
    public final /* synthetic */ C1566250qrP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566220qrM(RechargePanelHeaderViewModel rechargePanelHeaderViewModel, C1566250qrP c1566250qrP, InterfaceC1364105Vn<? super C1566220qrM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelHeaderViewModel;
        this.LLILLL = c1566250qrP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566220qrM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIJI;
        C1C7U.LIZ("RechargePanelHeaderViewModel@ef55.resolveTitleBarSlice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.setState(new AwS603S0100000_24((C1556580qbo) obj, 687));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RechargePanelHeaderViewModel@ef55.resolveTitleBarSlice$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1566260qrQ interfaceC1566260qrQ = this.LLILLJJLI.LL;
            C1566250qrP c1566250qrP = this.LLILLL;
            C1566240qrO c1566240qrO = new C1566240qrO(c1566250qrP.LLILLJJLI, c1566250qrP.LLILLL, c1566250qrP.LLILZ, c1566250qrP.LLILZIL);
            this.LL = 1;
            obj = interfaceC1566260qrQ.LJ(c1566240qrO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RechargePanelHeaderViewModel@ef55.resolveTitleBarSlice$1");
                return objLJFF;
            }
        }
        C1556620qbs c1556620qbs = (C1556620qbs) obj;
        this.LL = 2;
        int i2 = C1562960qm6.LIZ[c1556620qbs.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    strLJIJI = C497740JfY.LJIJI(2131856768);
                } else {
                    throw new C1954807lC();
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131842950);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843916);
        }
        C1556580qbo c1556580qbo = new C1556580qbo(strLJIJI, c1556620qbs.LIZIZ, c1556620qbs.LIZJ);
        if (c1556580qbo == objLJFF) {
            C1C7U.LIZIZ("RechargePanelHeaderViewModel@ef55.resolveTitleBarSlice$1");
            return objLJFF;
        }
        obj = c1556580qbo;
        this.LLILLJJLI.setState(new AwS603S0100000_24((C1556580qbo) obj, 687));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelHeaderViewModel@ef55.resolveTitleBarSlice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
