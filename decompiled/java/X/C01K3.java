package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01K3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toplive.util.TopLivePreloadHelper$preload$1", f = "TopLivePreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C01K3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01K3(Context context, InterfaceC1364105Vn<? super C01K3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01K3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopLivePreloadHelper@ac40.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<Integer, Integer>> list = C289701Ah.LIZIZ;
        Context context = this.LL;
        for (Pair pair : (ArrayList) list) {
            int iIntValue = ((Number) pair.getSecond()).intValue();
            for (int i = 0; i < iIntValue; i++) {
                C21146717pB.LIZJ(context, ((Number) pair.getFirst()).intValue());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopLivePreloadHelper@ac40.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
