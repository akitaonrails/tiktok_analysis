package X;

import java.util.List;

/* JADX INFO: renamed from: X.1Dbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259371Dbz implements InterfaceC2259401Dc2 {
    public final String LIZ;
    public final List<InterfaceC2259411Dc3> LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC2259351Dbx.LIZ(sb, new C2259331Dbv(), this);
        return sb.toString();
    }

    @Override // X.InterfaceC2259401Dc2
    public final List<InterfaceC2259411Dc3> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2259401Dc2
    public final String name() {
        return this.LIZ;
    }

    public C2259371Dbz(String str, List<InterfaceC2259411Dc3> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
