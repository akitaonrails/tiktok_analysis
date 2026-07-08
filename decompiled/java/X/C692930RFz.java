package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0RFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C692930RFz extends AbstractC692920RFy {
    public final boolean LJ;

    public C692930RFz() {
        this(0);
    }

    public boolean LIZIZ() {
        return this.LJ;
    }

    public C692930RFz(int i) {
        this.LJ = false;
    }

    @Override // X.AbstractC692920RFy
    public final boolean LIZ(Integer num, Integer num2, int i, int i2, int i3, int i4, Aweme aweme) {
        double dLIZIZ;
        if (LIZIZ()) {
            dLIZIZ = Double.MAX_VALUE;
        } else {
            dLIZIZ = C0RG1.LIZIZ();
        }
        double d = ((double) i2) / ((double) i);
        double d2 = ((double) i4) / ((double) i3);
        if (d2 > d) {
            if (1.0d - (d / d2) > dLIZIZ) {
                Pair pair = new Pair(Integer.valueOf((i2 * i3) / i), Integer.valueOf(i3));
                this.LIZ = (Integer) pair.getFirst();
                this.LIZIZ = (Integer) pair.getSecond();
                return true;
            }
            Pair pair2 = new Pair(Integer.valueOf(i4), Integer.valueOf((i * i4) / i2));
            this.LIZ = (Integer) pair2.getFirst();
            this.LIZIZ = (Integer) pair2.getSecond();
            return true;
        }
        if (1.0d - (d2 / d) > Double.MAX_VALUE) {
            Pair pair3 = new Pair(Integer.valueOf(i4), Integer.valueOf((i * i4) / i2));
            this.LIZ = (Integer) pair3.getFirst();
            this.LIZIZ = (Integer) pair3.getSecond();
            return true;
        }
        Pair pair4 = new Pair(Integer.valueOf((i2 * i3) / i), Integer.valueOf(i3));
        this.LIZ = (Integer) pair4.getFirst();
        this.LIZIZ = (Integer) pair4.getSecond();
        return true;
    }
}
