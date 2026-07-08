package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C823740WTc extends C2217421BqW implements Function2<C0WT3, Boolean, Unit> {
    public C823740WTc(C823750WTd c823750WTd) {
        super(2, c823750WTd, C823750WTd.class, "switchEventHandler", "switchEventHandler(Lcom/bytedance/helios/network/api/handler/NetworkEventHandler;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C0WT3 c0wt3, Boolean bool) {
        C0WT3 c0wt32 = c0wt3;
        boolean zBooleanValue = bool.booleanValue();
        synchronized (this.receiver) {
            try {
                ConcurrentHashMap<Integer, List<C0WT3>> concurrentHashMap = C823750WTd.LIZIZ;
                List<C0WT3> arrayList = concurrentHashMap.get(Integer.valueOf(c0wt32.LIZIZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                if (zBooleanValue) {
                    if (!arrayList.contains(c0wt32)) {
                        arrayList2.add(c0wt32);
                    }
                } else {
                    arrayList2.remove(c0wt32);
                }
                if (arrayList2.size() > 1) {
                    C08XD.LJJ(arrayList2, new Comparator() { // from class: X.0WT2
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C20085613iQ.LIZIZ(Integer.valueOf(((C0WT3) t).priority()), Integer.valueOf(((C0WT3) t2).priority()));
                        }
                    });
                }
                concurrentHashMap.put(Integer.valueOf(c0wt32.LIZIZ()), arrayList2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C823280WRi.LIZJ("switch event handler failed", "ensure_not_reach_here", e);
            }
        }
        return Unit.LIZ;
    }
}
