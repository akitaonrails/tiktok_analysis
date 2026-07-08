package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.EcMallLoginHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallstatus.controller.tab.EcMallTabStatusController$toInMallFrontJudgeLogin$1", f = "EcMallTabStatusController.kt", l = {554}, m = "invokeSuspend")
public final class C1741380vPs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1741160vPW LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741380vPs(C1741160vPW c1741160vPW, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1741160vPW;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741380vPs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Myt, X.0vPt] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMallTabStatusController@e98c.toInMallFrontJudgeLogin$1");
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
            final EcMallLoginHelper ecMallLoginHelper = (EcMallLoginHelper) this.LLILLJJLI.LJ.LLJJJJ.getValue();
            this.LL = 1;
            ecMallLoginHelper.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r2 = new InterfaceC586170Myt() { // from class: X.0vPt
                @Override // X.InterfaceC586170Myt
                public final void onAccountResult(int i2, boolean z, int i3, User user) {
                    if (i2 == 1 && z) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                        ecMallLoginHelper.LIZIZ(this);
                    }
                }
            };
            ecMallLoginHelper.LIZ(r2);
            c2252611DEt.LJJII(new AwS392S0200000_26(ecMallLoginHelper, (C1741390vPt) r2, 95));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("EcMallTabStatusController@e98c.toInMallFrontJudgeLogin$1");
                return objLJFF;
            }
        }
        C1741160vPW c1741160vPW = this.LLILLJJLI;
        if (c1741160vPW.LJIIIZ) {
            c1741160vPW.LJFF(this.LLILLL, EnumC1741200vPa.LOGIN);
        } else {
            c1741160vPW.LJI = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallTabStatusController@e98c.toInMallFrontJudgeLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
