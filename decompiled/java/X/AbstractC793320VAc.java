package X;

import X.AbstractC793340VAe;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793320VAc<T extends AbstractC793340VAe> implements C0VAV {
    public final String LIZ;
    public long LIZIZ;
    public final ConcurrentHashMap<Integer, T> LIZLLL = new ConcurrentHashMap<>();
    public boolean LIZJ = ActivityLifeObserver.getInstance().isForeground();

    public abstract void LIZJ(T t, long j, long j2);

    @Override // X.C0VAV
    public final void LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZLLL.size() != 0) {
            long j = this.LIZIZ;
            if (jCurrentTimeMillis - j >= 600000) {
                LJI(j, jCurrentTimeMillis);
            }
        }
        this.LIZIZ = jCurrentTimeMillis;
    }

    public AbstractC793320VAc(String str) {
        this.LIZ = str;
    }

    public void LJI(long j, long j2) {
        Iterator<Map.Entry<Integer, T>> it2 = this.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            T value = it2.next().getValue();
            long j3 = value.LIZIZ;
            if (0 < j3 && j3 < value.LIZ) {
                it2.remove();
            } else if (0 < j3 && j3 < j) {
                it2.remove();
            } else if (j2 >= value.LIZ) {
                LIZJ(value, j, j2);
            }
        }
    }
}
