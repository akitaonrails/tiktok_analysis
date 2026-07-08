package X;

import com.bytedance.android.livesdk.game.multidevicesdk.GameLiveCrossPlatformSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0TE5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TE5 {
    public static void LIZ(int i, C0TEX c0tex) {
        HashMap<Integer, List<C0TEX>> map = GameLiveCrossPlatformSdk.LIZJ;
        synchronized (map) {
            try {
                Integer numValueOf = Integer.valueOf(i);
                List<C0TEX> arrayList = map.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(numValueOf, arrayList);
                }
                arrayList.add(c0tex);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(int i, C0TEX c0tex) {
        HashMap<Integer, List<C0TEX>> map = GameLiveCrossPlatformSdk.LIZJ;
        synchronized (map) {
            try {
                List<C0TEX> list = map.get(Integer.valueOf(i));
                if (list == null) {
                    return;
                }
                list.remove(c0tex);
                if (list.isEmpty()) {
                    map.remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
