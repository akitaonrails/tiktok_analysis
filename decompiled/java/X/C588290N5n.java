package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0N5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588290N5n {
    public final long LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ = Collections.synchronizedList(new ArrayList());

    public final boolean LIZ() {
        if (this.LIZJ.isEmpty()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Long> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            if (jCurrentTimeMillis - it2.next().longValue() > this.LIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                it2.remove();
            }
        }
        return ((long) this.LIZJ.size()) >= this.LIZIZ;
    }

    public C588290N5n(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
