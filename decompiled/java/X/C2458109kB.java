package X;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: renamed from: X.09kB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2458109kB extends AbstractC2457909k9 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final List LJFF;
    public final List LJI;
    public final PendingIntent LJII;
    public final List LJIIIIZZ;

    public C2458109kB(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = list;
        this.LJI = list2;
        this.LJII = pendingIntent;
        this.LJIIIIZZ = list3;
    }

    @Override // X.AbstractC2457909k9
    public final long LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC2457909k9
    public final int LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC2457909k9
    public final PendingIntent LJFF() {
        return this.LJII;
    }

    @Override // X.AbstractC2457909k9
    public final int LJI() {
        return this.LIZ;
    }

    @Override // X.AbstractC2457909k9
    public final int LJII() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2457909k9
    public final long LJIIIIZZ() {
        return this.LJ;
    }

    @Override // X.AbstractC2457909k9
    public final List LJIIIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC2457909k9
    public final List LJIIJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC2457909k9
    public final List LJIIJJI() {
        return this.LJIIIIZZ;
    }

    public final int hashCode() {
        int i = ((((this.LIZ ^ 1000003) * 1000003) ^ this.LIZIZ) * 1000003) ^ this.LIZJ;
        long j = this.LIZLLL;
        long j2 = j ^ (j >>> 32);
        long j3 = this.LJ;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.LJFF;
        int iHashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.LJI;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.LJII;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.LJIIIIZZ;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.LIZ + ", status=" + this.LIZIZ + ", errorCode=" + this.LIZJ + ", bytesDownloaded=" + this.LIZLLL + ", totalBytesToDownload=" + this.LJ + ", moduleNamesNullable=" + String.valueOf(this.LJFF) + ", languagesNullable=" + String.valueOf(this.LJI) + ", resolutionIntent=" + String.valueOf(this.LJII) + ", splitFileIntents=" + String.valueOf(this.LJIIIIZZ) + "}";
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2457909k9) {
            AbstractC2457909k9 abstractC2457909k9 = (AbstractC2457909k9) obj;
            if (this.LIZ == abstractC2457909k9.LJI() && this.LIZIZ == abstractC2457909k9.LJII() && this.LIZJ == abstractC2457909k9.LIZJ() && this.LIZLLL == abstractC2457909k9.LIZ() && this.LJ == abstractC2457909k9.LJIIIIZZ() && ((list = this.LJFF) != null ? list.equals(abstractC2457909k9.LJIIJ()) : abstractC2457909k9.LJIIJ() == null) && ((list2 = this.LJI) != null ? list2.equals(abstractC2457909k9.LJIIIZ()) : abstractC2457909k9.LJIIIZ() == null) && ((pendingIntent = this.LJII) != null ? pendingIntent.equals(abstractC2457909k9.LJFF()) : abstractC2457909k9.LJFF() == null) && ((list3 = this.LJIIIIZZ) != null ? list3.equals(abstractC2457909k9.LJIIJJI()) : abstractC2457909k9.LJIIJJI() == null)) {
                return true;
            }
        }
        return false;
    }
}
