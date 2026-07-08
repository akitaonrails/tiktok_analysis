package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$loadPendingDiggByAid$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1339205Ly extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Integer>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1338705Lt LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339205Ly(C1338705Lt c1338705Lt, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1338705Lt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1339205Ly(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair<String, ConcurrentHashMap<String, C05M1>> pair;
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.loadPendingDiggByAid$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.length() == 0) {
            Map mapLJ = C2097608Jq.LJ();
            C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.loadPendingDiggByAid$2");
            return mapLJ;
        }
        this.LLILLJJLI.getClass();
        String strLJIIIZ = C1338705Lt.LJIIIZ();
        if (Intrinsics.LJFF(this.LLILLJJLI.LIZJ.get(), strLJIIIZ) && (pair = this.LLILLJJLI.LIZIZ.get()) != null) {
            String str = this.LL;
            String first = pair.getFirst();
            ConcurrentHashMap<String, C05M1> second = pair.getSecond();
            if (Intrinsics.LJFF(first, strLJIIIZ)) {
                C08QU c08quLJIIIZ = C09RB.LJIIIZ(new C1939607ik(second.values()), new AwS53S1000000_2(str, 12));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C08QT c08qt = new C08QT(c08quLJIIIZ);
                while (c08qt.hasNext()) {
                    C05M1 c05m1 = (C05M1) c08qt.next();
                    Pair pair2 = new Pair(c05m1.LIZJ, C2286608xc.LJ(c05m1.LIZLLL));
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                }
                C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.loadPendingDiggByAid$2");
                return linkedHashMap;
            }
        }
        C1338705Lt c1338705Lt = this.LLILLJJLI;
        String str2 = this.LL;
        Keva kevaLJIILIIL = c1338705Lt.LJIILIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iq_");
        sbLIZ.append(str2);
        sbLIZ.append(':');
        C08QU c08quLJIJI = C09RB.LJIJI(C09RB.LJIIIZ(new C1939607ik(kevaLJIILIIL.getAll().keySet()), new C5180020c(C2188811AlT.LIZIZ(sbLIZ), 6)), new AwS368S0200000_2(c1338705Lt, kevaLJIILIIL, 100));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C08QT c08qt2 = new C08QT(c08quLJIJI);
        while (c08qt2.hasNext()) {
            C05M1 c05m12 = (C05M1) c08qt2.next();
            Pair pair3 = new Pair(c05m12.LIZJ, Integer.valueOf(c05m12.LIZLLL));
            linkedHashMap2.put(pair3.getFirst(), pair3.getSecond());
        }
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.loadPendingDiggByAid$2");
        return linkedHashMap2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
