package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XJ {
    public float LIZ;
    public long LIZIZ;
    public final float LIZJ;
    public long LIZLLL;

    public C12XJ(float f) {
        this.LIZJ = f;
    }

    public final void LIZJ(long j) {
        long jMin = Math.min(this.LIZIZ, j);
        this.LIZIZ = jMin;
        this.LIZ = jMin / this.LIZJ;
    }

    public static final long LIZ(List<? extends VideoSegment> list, float f) {
        if (C0IKQ.LIZ(list)) {
            return 0L;
        }
        float fLIZLLL = 0.0f;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.isDeleted) {
                fLIZLLL += (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * f);
            }
        }
        return (long) fLIZLLL;
    }

    public final void LIZLLL(float f, long j) {
        long jMin = Math.min(Math.min(this.LIZIZ, (long) (j / f)), this.LIZLLL);
        this.LIZIZ = jMin;
        this.LIZ = jMin / this.LIZJ;
    }

    public static final Pair LIZIZ(float f, int i, long j, List list) {
        Iterator it2 = list.iterator();
        float f2 = 0.0f;
        int iLIZIZ = 0;
        float f3 = 0.0f;
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            if (!videoSegment.isDeleted) {
                float f4 = j;
                if (f4 < f2) {
                    break;
                }
                float fLIZLLL = f2 + ((videoSegment.LIZLLL() - videoSegment.LJII()) / videoSegment.LJI());
                if (f4 >= fLIZLLL) {
                    iLIZIZ += C814420VxA.LIZIZ((float) Math.ceil(r1 / f));
                } else {
                    float f5 = f4 - f2;
                    int i2 = (int) (f5 / f);
                    iLIZIZ += i2;
                    f3 = ((f5 - (i2 * f)) / f) * i;
                }
                f2 = fLIZLLL;
            }
        }
        return new Pair(Integer.valueOf(iLIZIZ), Float.valueOf(f3));
    }
}
