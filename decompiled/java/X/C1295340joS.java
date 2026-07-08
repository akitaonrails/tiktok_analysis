package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0joS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295340joS {
    public String LIZ;
    public String LIZIZ;
    public float LIZJ;
    public EnumC1295510joj LIZLLL;
    public int LJ;
    public float LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public PointF LJIIJJI;
    public PointF LJIIL;

    public final int hashCode() {
        int iHashCode = (((((int) ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ)) * 31) + this.LIZLLL.ordinal()) * 31) + this.LJ;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.LJFF);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.LJII;
    }

    public C1295340joS() {
    }

    public C1295340joS(String str, String str2, float f, EnumC1295510joj enumC1295510joj, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
        this.LIZLLL = enumC1295510joj;
        this.LJ = i;
        this.LJFF = f2;
        this.LJI = f3;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = f4;
        this.LJIIJ = z;
        this.LJIIJJI = pointF;
        this.LJIIL = pointF2;
    }
}
