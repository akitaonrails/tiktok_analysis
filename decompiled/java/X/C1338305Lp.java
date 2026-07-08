package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$removeInteraction$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1338305Lp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1338705Lt LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338305Lp(C1338705Lt c1338705Lt, String str, InterfaceC1364105Vn<? super C1338305Lp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338305Lp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objPutIfAbsent;
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.removeInteraction$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1338705Lt c1338705Lt = this.LL;
        String str = this.LLILLJJLI;
        Object obj2 = c1338705Lt.LIZLLL.get(str);
        if (obj2 == null && (objPutIfAbsent = c1338705Lt.LIZLLL.putIfAbsent(str, (obj2 = new Object()))) != null) {
            obj2 = objPutIfAbsent;
        }
        synchronized (obj2) {
            try {
                Keva kevaLJIILIIL = c1338705Lt.LJIILIIL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("iq_");
                sbLIZ.append(str);
                kevaLJIILIIL.erase(C2188811AlT.LIZIZ(sbLIZ));
                Pair<String, ConcurrentHashMap<String, C05M1>> pair = c1338705Lt.LIZIZ.get();
                if (pair != null) {
                    String first = pair.getFirst();
                    ConcurrentHashMap<String, C05M1> second = pair.getSecond();
                    if (Intrinsics.LJFF(first, C1338705Lt.LJIIIZ())) {
                        second.remove(str);
                    }
                }
                c1338705Lt.LIZLLL.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.removeInteraction$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
