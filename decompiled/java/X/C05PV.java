package X;

import com.bytedance.keva.Keva;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$unconsumedVideoPickedByInitCacheAidList$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C05PV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PV(List<String> list, InterfaceC1364105Vn<? super C05PV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.unconsumedVideoPickedByInitCacheAidList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva keva = C1347505Pd.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1347505Pd.LJIIL);
        sbLIZ.append("init_cache_picked_items");
        keva.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), (String[]) C13LP.LJJJJLI(this.LL).toArray(new String[0]));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.unconsumedVideoPickedByInitCacheAidList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
