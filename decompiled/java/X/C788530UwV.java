package X;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.0UwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788530UwV {
    public static final List<String> LIZ;
    public static final C21594219fA LIZIZ;
    public static final C788540UwW LIZJ;
    public static final ConcurrentHashMap<String, Long> LIZLLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19fA] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0UwW] */
    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.net.wifi.RSSI_CHANGED");
        LIZIZ = new C360660ECa() { // from class: X.19fA
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                if (i == 1) {
                    C2413309cx.LIZ(AFwS224S0000000_33.get$arr$(612));
                }
            }
        };
        LIZJ = new AbstractC1585810rMx() { // from class: X.0UwW
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    C2188191AkT.LIZLLL();
                }
            }
        };
        LIZLLL = new ConcurrentHashMap<>();
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.containsKey(str)) {
            if (SystemClock.elapsedRealtime() - concurrentHashMap.get(str).longValue() <= ((Number) C292190Bcn.LIZ.getValue()).longValue()) {
                return false;
            }
            concurrentHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            return true;
        }
        concurrentHashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        return true;
    }
}
