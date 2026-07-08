package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.model.ABPreloadHelper$preloadForSearchLaunch$1$jobs$1$1", f = "ABPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C05QC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QC(int i, InterfaceC1364105Vn<? super C05QC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QC(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ABPreloadHelper@4d04.preloadForSearchLaunch$1$jobs$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        int i2 = C05QG.LJ;
        int i3 = i * i2;
        int i4 = i2 + i3;
        while (i3 < i4) {
            C01GW c01gw = C05QG.LJFF;
            if (i3 >= ((ArrayList) c01gw.getValue()).size()) {
                break;
            }
            ((Function0) ListProtector.get((ArrayList) c01gw.getValue(), i3)).invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload line ");
            sbLIZ.append(i3);
            sbLIZ.append('/');
            sbLIZ.append(((ArrayList) c01gw.getValue()).size());
            sbLIZ.append(" on thread ");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append(" thread index:");
            sbLIZ.append(this.LL);
            C2188811AlT.LIZIZ(sbLIZ);
            i3++;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ABPreloadHelper@4d04.preloadForSearchLaunch$1$jobs$1$1");
        return unit;
    }
}
