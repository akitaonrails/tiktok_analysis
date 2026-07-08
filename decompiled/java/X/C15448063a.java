package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage$selectContentAsync$1", f = "TakoLongImageSharePackage.kt", l = {207, 208}, m = "invokeSuspend")
public final class C15448063a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoLongImageSharePackage LLILLL;
    public final /* synthetic */ Function2<AbstractC1375550ltp, Boolean, Unit> LLILZ;
    public final /* synthetic */ InterfaceC1369790lkX LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15448063a(TakoLongImageSharePackage takoLongImageSharePackage, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn<? super C15448063a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoLongImageSharePackage;
        this.LLILZ = function2;
        this.LLILZIL = interfaceC1369790lkX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15448063a c15448063a = new C15448063a(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c15448063a.LLILLJJLI = obj;
        return c15448063a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TakoLongImageSharePackage@f869.selectContentAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05XL<Boolean> c05xl = this.LLILLL.c2paWritten;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1");
                return objLJFF;
            }
        }
        c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C15449063b c15449063b = new C15449063b(zBooleanValue, this.LLILZ, this.LLILLL, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c15449063b) == objLJFF) {
            C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.selectContentAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
