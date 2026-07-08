package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.084w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20592084w<T, Y> {
    public final LinkedHashMap<T, Y> LIZ = new LinkedHashMap<>(100, 0.75f, true);
    public int LIZJ = 0;
    public final int LIZIZ = LSPassThroughRecordSizeConfig.DEFAULT;

    public final void LIZ() {
        int i = this.LIZIZ;
        synchronized (this) {
            while (this.LIZJ > i) {
                Map.Entry<T, Y> next = this.LIZ.entrySet().iterator().next();
                next.getValue();
                this.LIZJ--;
                this.LIZ.remove(next.getKey());
            }
        }
    }

    public final synchronized Object LIZIZ(C13TX c13tx) {
        return this.LIZ.get(c13tx);
    }

    public final synchronized void LIZJ(C13TX c13tx, Object obj) {
        if (1 >= this.LIZIZ) {
            return;
        }
        Y yPut = this.LIZ.put(c13tx, obj);
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (yPut != null) {
            this.LIZJ = i - 1;
        }
        LIZ();
    }
}
