package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: renamed from: X.0p8F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499810p8F {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public C1499810p8F() {
        this(false, null, null, 0, false, 31);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadStrategy(maxAgeMilliseconds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", baseUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", useOnlyOnce=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", keepPreloadedCache=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", customPathForPreloadKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1499810p8F(boolean z, String str, String str2, int i, boolean z2, int i2) {
        i = (i2 & 1) != 0 ? LivePreCreateNextRoomPlayer.ENABLE : i;
        str = (i2 & 2) != 0 ? null : str;
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        str2 = (i2 & 16) != 0 ? null : str2;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str2;
        this.LIZ = LivePreCreateNextRoomPlayer.ENABLE;
        this.LIZ = i;
    }
}
