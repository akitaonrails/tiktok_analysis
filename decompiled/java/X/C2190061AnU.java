package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.1AnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190061AnU implements InterfaceC2245651Cux {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Aweme LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action=INSERT, pos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2245651Cux
    public final String T6() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2245651Cux
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2245651Cux
    public final Aweme getAweme() {
        return this.LJ;
    }

    @Override // X.InterfaceC2245651Cux
    public final boolean LIZ(int i, int i2) {
        if (this.LIZ >= i) {
            return true;
        }
        return false;
    }

    public C2190061AnU(int i, String str, boolean z, String str2, Aweme aweme) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = aweme;
    }
}
