package X;

/* JADX INFO: renamed from: X.0C8A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8A implements C12MY {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.C12MY
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.C12MY
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C12MY
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.C12MY
    public final String LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.C12MY
    public final String getTitle() {
        return this.LIZ;
    }

    public C0C8A(String str, String str2, String str3, String str4, int i) {
        String str5;
        if ((i & 1) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.LIZ = str5;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
