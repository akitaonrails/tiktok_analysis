package X;

/* JADX INFO: renamed from: X.0rQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1588120rQg {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final EnumC1586890rOh LIZLLL;
    public final String LJ;
    public final String LJFF;

    public EnumC1586890rOh LIZ() {
        return this.LIZLLL;
    }

    public Integer LIZIZ() {
        return this.LIZJ;
    }

    public int LIZJ() {
        return this.LIZIZ;
    }

    public AbstractC1588120rQg(int i, int i2, Integer num, EnumC1586890rOh enumC1586890rOh, String str, String str2, int i3) {
        num = (i3 & 4) != 0 ? null : num;
        str = (i3 & 16) != 0 ? null : str;
        str2 = (i3 & 32) != 0 ? null : str2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = num;
        this.LIZLLL = enumC1586890rOh;
        this.LJ = str;
        this.LJFF = str2;
    }
}
