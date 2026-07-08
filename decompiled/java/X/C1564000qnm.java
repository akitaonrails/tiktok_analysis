package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564000qnm extends AbstractC1564010qnn<InterfaceC1555100qZQ<?>> implements InterfaceC1554870qZ3 {
    public final Map<C1554890qZ5, Map<C1554820qYy<?>, InterfaceC1555100qZQ<?>>> LJ = new LinkedHashMap();

    @Override // X.InterfaceC1554870qZ3
    public final InterfaceC1555100qZQ LIZLLL(C1554820qYy c1554820qYy, C1554890qZ5 c1554890qZ5) {
        Object c098200Yq;
        Object[] objArr = {c1554890qZ5, c1554820qYy};
        Object obj = null;
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return null;
        }
        if (!this.LIZ) {
            this.LIZ = true;
            AbstractC1564010qnn.LIZIZ.getClass();
            if (!AbstractC1564010qnn.LIZLLL) {
                try {
                    C791390V2r.LJJIII.LJ(new AbstractC791320V2k() { // from class: X.0qno
                        @Override // X.AbstractC791320V2k
                        public final void LJIILJJIL(String str) {
                            this.LL = true;
                            Iterator<InterfaceC1564040qnq> it2 = AbstractC1564010qnn.LIZJ.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZJ();
                            }
                        }

                        @Override // X.AbstractC791320V2k
                        public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
                            this.LL = false;
                            Iterator<InterfaceC1564040qnq> it2 = AbstractC1564010qnn.LIZJ.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZ();
                            }
                        }
                    });
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    AbstractC1564010qnn.LIZLLL = true;
                }
            }
            ((ArrayList) AbstractC1564010qnn.LIZJ).add(this);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
        try {
            C1554890qZ5 c1554890qZ52 = (C1554890qZ5) objArrCopyOf[0];
            C1554820qYy c1554820qYy2 = (C1554820qYy) objArrCopyOf[1];
            Map map = (Map) ((LinkedHashMap) this.LJ).get(c1554890qZ52);
            if (map == null) {
                return null;
            }
            return (InterfaceC1555100qZQ) map.get(c1554820qYy2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            return (InterfaceC1555100qZQ) obj;
        }
    }

    @Override // X.InterfaceC1554870qZ3
    public final void LIZIZ(C1554890qZ5 c1554890qZ5, C1554820qYy<?> c1554820qYy, InterfaceC1555100qZQ<?> interfaceC1555100qZQ) {
        Object[] objArr = {c1554890qZ5, c1554820qYy, interfaceC1555100qZQ};
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 3);
            try {
                C1554890qZ5 c1554890qZ52 = (C1554890qZ5) objArrCopyOf[0];
                C1554820qYy c1554820qYy2 = (C1554820qYy) objArrCopyOf[1];
                InterfaceC1555100qZQ interfaceC1555100qZQ2 = (InterfaceC1555100qZQ) objArrCopyOf[2];
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
                Object linkedHashMap2 = linkedHashMap.get(c1554890qZ52);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(c1554890qZ52, linkedHashMap2);
                }
                C189200o6.m2constructorimpl((InterfaceC1555100qZQ) ((Map) linkedHashMap2).put(c1554820qYy2, interfaceC1555100qZQ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
