package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431980nMq {
    public final List<AVMusic> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431980nMq)) {
            return false;
        }
        C1431980nMq c1431980nMq = (C1431980nMq) obj;
        return Intrinsics.LJFF(this.LIZ, c1431980nMq.LIZ) && this.LIZIZ == c1431980nMq.LIZIZ && this.LIZJ == c1431980nMq.LIZJ && this.LIZLLL == c1431980nMq.LIZLLL && this.LJ == c1431980nMq.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecMusicListWithMeta(musicList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fromRecommend=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1431980nMq(int i, List list, boolean z, boolean z2, int i2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJ = z2;
    }
}
