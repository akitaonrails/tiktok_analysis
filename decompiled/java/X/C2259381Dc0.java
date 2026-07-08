package X;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1Dc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259381Dc0 implements InterfaceC2259391Dc1 {
    public final Pattern LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final InterfaceC2259401Dc2 LJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC2259351Dbx.LIZIZ(sb, new C2259331Dbv(), this);
        return sb.toString();
    }

    @Override // X.InterfaceC2259391Dc1
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2259391Dc1
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2259391Dc1
    public final Pattern LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2259391Dc1
    public final boolean LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2259391Dc1
    public final InterfaceC2259401Dc2 LJFF() {
        return this.LJ;
    }

    public C2259381Dc0(Pattern pattern, boolean z, boolean z2, String str, InterfaceC2259401Dc2 interfaceC2259401Dc2) {
        this.LIZ = pattern;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = interfaceC2259401Dc2;
    }
}
