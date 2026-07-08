package X;

import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05PZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$onRecommendPageSelect$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C05PZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PZ(Aweme aweme, InterfaceC1364105Vn<? super C05PZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        int i;
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String aid2 = this.LL.getAid();
        if (aid2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
            return unit;
        }
        Aweme aweme = C1347505Pd.LJIIJJI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid2, aid)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
            return unit2;
        }
        Iterator it2 = ((ArrayList) C1347505Pd.LJ).iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((SessionUnconsumptionItem) it2.next()).aid, aid)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Iterator it3 = ((ArrayList) C1347505Pd.LJ).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((SessionUnconsumptionItem) it3.next()).aid, aid2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < i3) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
            return unit3;
        }
        Set<String> set = C1347505Pd.LJI;
        if (set.contains(aid2)) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
            return unit4;
        }
        set.add(aid2);
        C1347505Pd c1347505Pd = C1347505Pd.LIZ;
        Aweme aweme2 = this.LL;
        c1347505Pd.getClass();
        C1347505Pd.LIZJ(aweme2);
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.onRecommendPageSelect$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
