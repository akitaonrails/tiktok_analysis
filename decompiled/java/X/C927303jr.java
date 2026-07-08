package X;

/* JADX INFO: renamed from: X.03jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C927303jr {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;

    public C927303jr(int i, Integer num, Integer num2, String str) {
        boolean z;
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = z;
    }
}
