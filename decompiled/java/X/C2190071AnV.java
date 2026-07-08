package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.1AnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190071AnV implements InterfaceC2245651Cux {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final Aweme LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[aid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", action=MOVE, oldPos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newPos=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2245651Cux
    public final String T6() {
        return this.LJ;
    }

    @Override // X.InterfaceC2245651Cux
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2245651Cux
    public final Aweme getAweme() {
        return this.LJFF;
    }

    @Override // X.InterfaceC2245651Cux
    public final boolean LIZ(int i, int i2) {
        int i3 = this.LIZ;
        if (i <= i3 && i3 <= i2 && this.LIZJ >= i) {
            return true;
        }
        return false;
    }

    public C2190071AnV(int i, String str, int i2, boolean z, String str2, Aweme aweme) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = aweme;
    }
}
