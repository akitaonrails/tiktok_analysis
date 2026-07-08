package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.performance.TakoABPreloadHelper$executePhaseInParallel$jobs$1$1", f = "TakoABPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C342001Uk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ArrayList<Function0<Unit>> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342001Uk(int i, int i2, ArrayList<Function0<Unit>> arrayList, String str, InterfaceC1364105Vn<? super C342001Uk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = arrayList;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C342001Uk(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoABPreloadHelper@c9ee.executePhaseInParallel$jobs$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = i * i2;
        int iMin = Math.min(i2 + i3, this.LLILLL.size());
        while (i3 < iMin) {
            try {
                this.LLILLL.get(i3).invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            i3++;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoABPreloadHelper@c9ee.executePhaseInParallel$jobs$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
