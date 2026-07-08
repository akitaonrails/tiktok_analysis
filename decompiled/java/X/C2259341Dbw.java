package X;

import java.util.List;

/* JADX INFO: renamed from: X.1Dbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259341Dbw implements InterfaceC2259411Dc3 {
    public final String LIZ;
    public final List<InterfaceC2259391Dc1> LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC2259351Dbx.LIZJ(sb, new C2259331Dbv(), this);
        return sb.toString();
    }

    @Override // X.InterfaceC2259411Dc3
    public final List<InterfaceC2259391Dc1> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2259411Dc3
    public final String name() {
        return this.LIZ;
    }

    public C2259341Dbw(String str, List<InterfaceC2259391Dc1> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
