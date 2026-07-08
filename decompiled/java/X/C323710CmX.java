package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ext.AdapterLoader$refresh$1", f = "AdapterCompat.kt", l = {150}, m = "invokeSuspend")
public final class C323710CmX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C323720CmY<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323710CmX(C323720CmY<T> c323720CmY, InterfaceC1364105Vn<? super C323710CmX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c323720CmY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323710CmX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdapterLoader@e319.refresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C323720CmY<T> c323720CmY = this.LLILLJJLI;
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c323720CmY.LLILZ = c2252611DEt;
                PowerPageSource powerPageSource = c323720CmY.LLILLL;
                if (powerPageSource == null) {
                    powerPageSource = null;
                }
                powerPageSource.onRefresh(c2252611DEt);
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AdapterLoader@e319.refresh$1");
                    return objLJFF;
                }
            }
            AbstractC316870CbV abstractC316870CbV = (AbstractC316870CbV) obj;
            if (abstractC316870CbV instanceof C323380Cm0) {
                this.LLILLJJLI.LLILZIL = ((C323380Cm0) abstractC316870CbV).LIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("AdapterLoader", "adapter loader refresh error", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdapterLoader@e319.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
