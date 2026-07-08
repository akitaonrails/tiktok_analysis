package X;

/* JADX INFO: renamed from: X.0531, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0531 {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C12918053s LIZLLL;
    public final EnumC12933054h LJ;

    public AnonymousClass0531() {
        this(null, 31);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ.getTag());
        sbLIZ.append('&');
        sbLIZ.append(this.LIZLLL.LIZ());
        sbLIZ.append('&');
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('&');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('&');
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        return LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnonymousClass0531(C12918053s c12918053s, int i) {
        String str;
        String str2;
        C12918053s c12918053s2 = c12918053s;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str, str2, (i & 4) == 0 ? null : "", (i & 8) != 0 ? C12918053s.LJ : c12918053s2, (i & 16) != 0 ? EnumC12933054h.NULL : null);
    }

    public AnonymousClass0531(String str, String str2, String str3, C12918053s c12918053s, EnumC12933054h enumC12933054h) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c12918053s;
        this.LJ = enumC12933054h;
    }
}
