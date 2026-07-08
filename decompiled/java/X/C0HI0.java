package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HI0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils.SearchDualStreamMobHelper$clearInnerParamToAwemeList$1", f = "SearchDualStreamMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C0HI0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Aweme> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HI0(List<? extends Aweme> list, InterfaceC1364105Vn<? super C0HI0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HI0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SearchDualStreamMobHelper@b2f5.clearInnerParamToAwemeList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            i = 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error", String.valueOf(e.getMessage()));
            C1AF0.LIZLLL("clearInnerParamToAwemeList error", linkedHashMap);
        }
        for (Aweme aweme : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C0Q3E.LIZJ(aweme).fe(new C0P81(new C0P65(null, 0)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchDualStreamMobHelper@b2f5.clearInnerParamToAwemeList$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchDualStreamMobHelper@b2f5.clearInnerParamToAwemeList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
