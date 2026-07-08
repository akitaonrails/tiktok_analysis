package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS14S1001000_2;

/* JADX INFO: renamed from: X.065L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareRateStore$1", f = "QuickShareRateStore.kt", l = {}, m = "invokeSuspend")
public final class C065L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C065L(InterfaceC1364105Vn<? super C065L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C065L(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareRateStore@2cf5.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init async start: uid=");
        sbLIZ.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ.length() == 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.<init>$1");
            return unit;
        }
        int iLIZ = C065E.LIZ();
        AbstractC2252651DEx abstractC2252651DEx = C065M.LIZ;
        Pair pair = (Pair) C065M.LJI(new AwS14S1001000_2(strLIZIZ, iLIZ, 1));
        if (pair == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("QuickShareRateStore@2cf5.<init>$1");
            return unit2;
        }
        List<C065O> list = (List) pair.getFirst();
        List<C065O> list2 = (List) pair.getSecond();
        C065M.LJ = strLIZIZ;
        C065M.LJFF = list;
        C065M.LJI = list2;
        C065M.LJII = list.size() % iLIZ;
        C065M.LJIIIIZZ = list2.size() % iLIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init async done: uid=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", shareRateSize=");
        sbLIZ2.append(list.size());
        sbLIZ2.append(", rateScoreSize=");
        sbLIZ2.append(list2.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareRateStore@2cf5.<init>$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C065L(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
