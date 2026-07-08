package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0jTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282280jTO {
    public double LIZ;
    public double LIZIZ;
    public double LIZJ;
    public double LIZLLL;
    public final double LJ;
    public Integer LJFF;
    public final int LJI;
    public String LJII;

    public final RectF LIZ() {
        double d = this.LIZ;
        double d2 = this.LIZIZ;
        return new RectF((float) d, (float) d2, (float) (d + this.LIZJ), (float) (d2 + this.LIZLLL));
    }

    public /* synthetic */ C1282280jTO(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, null, 0);
    }

    public C1282280jTO(double d, double d2, double d3, double d4, double d5, Integer num, int i) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        this.LJ = d5;
        this.LJFF = num;
        this.LJI = i;
        this.LJII = "";
    }
}
