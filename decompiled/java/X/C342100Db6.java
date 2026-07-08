package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Db6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload.SearchCardPreloadHelper$tryPreload$1", f = "SearchCardPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C342100Db6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<PreRenderCard> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342100Db6(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C342100Db6(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCardPreloadHelper@c6c.tryPreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<PreRenderCard> list = this.LL;
        int i = this.LLILLJJLI;
        for (PreRenderCard preRenderCard : list) {
            Set<Double> set = C050M.LIZ;
            if (!((Set) C050M.LIZIZ.getValue()).contains(C2286608xc.LJ(preRenderCard.type))) {
                List<InterfaceC342110Db7> list2 = (List) ((LinkedHashMap) C648950Pcr.LIZ).get(C648920Pco.LIZ(preRenderCard));
                if (list2 != null) {
                    for (InterfaceC342110Db7 interfaceC342110Db7 : list2) {
                        preRenderCard.LIZ = i;
                        try {
                            interfaceC342110Db7.LIZ(preRenderCard);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCardPreloadHelper@c6c.tryPreload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
