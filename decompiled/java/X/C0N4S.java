package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.shortvideo.music.EPRecommendThumbConfig;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0N4S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4S implements InterfaceC2255308sZ {
    public final C0N4U LIZ;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<Long>> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0N4U] */
    public C0N4S(int i) {
        final int i2 = 30;
        this.LIZ = new LruCache<String, Bitmap>(i2) { // from class: X.0N4U
            @Override // android.util.LruCache
            public final void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
                Bitmap bitmap3 = bitmap;
                if (z && !bitmap3.isRecycled()) {
                    bitmap3.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
                }
            }
        };
    }

    @Override // X.InterfaceC2255308sZ
    public final Bitmap LIZIZ(long j, String str) {
        Long next;
        long thumbPtsToleranceInMs = ((EPRecommendThumbConfig) C0N4V.LIZIZ.getValue()).getThumbPtsToleranceInMs();
        CopyOnWriteArrayList<Long> copyOnWriteArrayList = this.LIZIZ.get(str);
        if (copyOnWriteArrayList == null) {
            return null;
        }
        Iterator<Long> it2 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Math.abs(next.longValue() - j) <= thumbPtsToleranceInMs) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Long l = next;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C0N4U c0n4u = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(jLongValue);
        return c0n4u.get(String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()));
    }

    @Override // X.InterfaceC2255308sZ
    public final void LIZ(long j, Bitmap bitmap, String str) {
        CopyOnWriteArrayList<Long> copyOnWriteArrayListPutIfAbsent;
        C0N4U c0n4u = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(j);
        c0n4u.put(String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()), bitmap);
        CopyOnWriteArrayList<Long> copyOnWriteArrayList = this.LIZIZ.get(str);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = this.LIZIZ.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        copyOnWriteArrayList.add(Long.valueOf(j));
    }
}
