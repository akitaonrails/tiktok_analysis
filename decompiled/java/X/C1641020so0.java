package X;

/* JADX INFO: renamed from: X.0so0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641020so0 {
    public final AbstractC1634360sdG LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public C1641020so0(AbstractC1634360sdG abstractC1634360sdG, boolean z, String str, int i) {
        String str2;
        if ((i & 2) != 0) {
            str2 = abstractC1634360sdG.LIZIZ;
        } else {
            str2 = null;
        }
        z = (i & 4) != 0 ? false : z;
        str = (i & 16) != 0 ? "Others" : str;
        this.LIZ = abstractC1634360sdG;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str;
    }
}
