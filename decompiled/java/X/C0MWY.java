package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MWY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.common.api.navigation.MainEditBridge$navigateToMainEditPage$1", f = "MainEditBridge.kt", l = {82, 83}, m = "invokeSuspend")
public final class C0MWY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ IMCreativeEditModel LLILLL;
    public final /* synthetic */ C1390130mHL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MWY(C19EG c19eg, IMCreativeEditModel iMCreativeEditModel, C1390130mHL c1390130mHL, InterfaceC1364105Vn<? super C0MWY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = iMCreativeEditModel;
        this.LLILZ = c1390130mHL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MWY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainEditBridge@817c.navigateToMainEditPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MainEditBridge@817c.navigateToMainEditPage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1444540nh6 c1444540nh6 = C1444540nh6.LIZ;
            C19EG c19eg = this.LLILLJJLI;
            IMCreativeEditModel iMCreativeEditModel = this.LLILLL;
            this.LL = 1;
            obj = c1444540nh6.LIZ(c19eg, iMCreativeEditModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MainEditBridge@817c.navigateToMainEditPage$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0MWW c0mww = new C0MWW(this.LLILZ, this.LLILLJJLI, (Intent) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0mww) == objLJFF) {
            C1C7U.LIZIZ("MainEditBridge@817c.navigateToMainEditPage$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MainEditBridge@817c.navigateToMainEditPage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
