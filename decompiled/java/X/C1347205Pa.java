package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$handleRefresh$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C1347205Pa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Aweme> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1347205Pa(List<? extends Aweme> list, InterfaceC1364105Vn<? super C1347205Pa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1347205Pa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.handleRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1347505Pd c1347505Pd = C1347505Pd.LIZ;
        C1347505Pd.LJFF = true;
        C1347505Pd.LIZ.getClass();
        C1347505Pd.LIZJ(null);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        List<Aweme> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        C19719612Di.LJJIIJ(C1347505Pd.LIZJ, new C1347305Pb(C13LP.LLIIJI(arrayList)), true);
        ((ArrayList) C1347505Pd.LJ).clear();
        List<Aweme> list2 = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Aweme> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(C710650RuB.LIZ(it3.next(), jCurrentTimeMillis));
        }
        ((ArrayList) C1347505Pd.LJ).addAll(arrayList2);
        C1347505Pd.LIZ.getClass();
        C1347505Pd.LJ();
        C1347505Pd.LIZLLL(C1347505Pd.LJ);
        C1347505Pd.LJFF = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.handleRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
