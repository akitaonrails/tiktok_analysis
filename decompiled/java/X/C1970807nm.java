package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970807nm {
    public static C1970807nm LJFF;
    public InterfaceC1970907nn LIZ;
    public final int[] LIZIZ;
    public final ConcurrentHashMap<Integer, Pair> LIZJ;
    public int LIZLLL;
    public int LJ;

    public static C1970807nm LIZ() {
        if (LJFF == null) {
            synchronized (C1970807nm.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1970807nm();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public C1970807nm() {
        new LinkedHashMap<String, Object>() { // from class: X.07nl
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Object> entry) {
                if (size() > 20) {
                    return true;
                }
                return false;
            }
        };
        this.LIZIZ = new int[]{8, 7, 6, 5, 4, 3, 2};
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = 600;
        this.LJ = LSPassThroughRecordSizeConfig.DEFAULT;
    }
}
