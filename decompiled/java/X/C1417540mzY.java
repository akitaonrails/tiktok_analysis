package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0mzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417540mzY {
    public final AVMusic LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Float LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(musicId = ");
        sbLIZ.append(this.LIZ.getMusicId());
        sbLIZ.append(", musicStart = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicPath = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", musicVolume = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1417540mzY(AVMusic aVMusic, String str, long j, Float f) {
        this.LIZ = aVMusic;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = f;
    }
}
