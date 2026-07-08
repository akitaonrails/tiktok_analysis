package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636110sg5 implements InterfaceC1325670kbN {
    @Override // X.InterfaceC1325690kbP
    public final void LIZ(String str, Throwable th, String str2, Map map) {
    }

    @Override // X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
    }

    @Override // X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC1325690kbP
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC1325690kbP
    public final void LJI(String str, String str2) {
    }

    @Override // X.InterfaceC1325690kbP
    public final void LJIIIIZZ(String str, String str2, Map<String, String> map) {
    }

    @Override // X.InterfaceC1325690kbP
    public final void LJIIIZ(String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC1325690kbP
    public final boolean LJIIJ(String str) {
        return false;
    }

    @Override // X.InterfaceC1325670kbN
    public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
        long jCurrentTimeMillis;
        if (Intrinsics.LJFF(str, "-1")) {
            return;
        }
        ConcurrentHashMap<String, Pair<Boolean, Long>> concurrentHashMap = C1636070sg1.LIZJ;
        Pair<Boolean, Long> pair = concurrentHashMap.get(str);
        if (pair != null) {
            jCurrentTimeMillis = pair.getSecond().longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        concurrentHashMap.put(str, new Pair<>(Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
    }

    @Override // X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        if (Intrinsics.LJFF(str, "-1")) {
            return;
        }
        C1636070sg1.LIZJ.put(str, new Pair<>(Boolean.FALSE, Long.valueOf(System.currentTimeMillis())));
    }

    @Override // X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        long jCurrentTimeMillis;
        if (Intrinsics.LJFF(str, "-1")) {
            return;
        }
        ConcurrentHashMap<String, Pair<Boolean, Long>> concurrentHashMap = C1636070sg1.LIZJ;
        Pair<Boolean, Long> pair = concurrentHashMap.get(str);
        if (pair != null) {
            jCurrentTimeMillis = pair.getSecond().longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        concurrentHashMap.put(str, new Pair<>(Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        C1636070sg1.LIZLLL.LIZLLL();
    }
}
