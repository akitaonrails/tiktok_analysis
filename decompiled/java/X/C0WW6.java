package X;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WW6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WW6 {
    public final Activity LIZ;
    public final long LIZIZ;
    public final C0W59 LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;
    public int LJIIJJI = 0;
    public long LJIIL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WW6)) {
            return false;
        }
        C0WW6 c0ww6 = (C0WW6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ww6.LIZ) && this.LIZIZ == c0ww6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ww6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ww6.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ww6.LJ) && Intrinsics.LJFF(this.LJFF, c0ww6.LJFF) && Intrinsics.LJFF(this.LJI, c0ww6.LJI) && Intrinsics.LJFF(this.LJII, c0ww6.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0ww6.LJIIIIZZ) && this.LJIIIZ == c0ww6.LJIIIZ && this.LJIIJ == c0ww6.LJIIJ && this.LJIIJJI == c0ww6.LJIIJJI && this.LJIIL == c0ww6.LJIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + this.LJIIJJI) * 31) + C786410Ut5.Y2(this.LJIIL);
    }

    public final String toString() {
        return "CustomTabsSessionHolder(activity=" + this.LIZ + ", startTimeMs=" + this.LIZIZ + ", session=" + this.LIZJ + ", scope=" + this.LIZLLL + ", startUrl=" + this.LJ + ", targetUrl=" + this.LJFF + ", redirectUrl=" + this.LJI + ", token=" + this.LJII + ", nonce=" + this.LJIIIIZZ + ", isMessageChannelReady=" + this.LJIIIZ + ", isTokenSent=" + this.LJIIJ + ", retryCount=" + this.LJIIJJI + ", channelSetupStartTimeMs=" + this.LJIIL + ')';
    }

    public C0WW6(Activity activity, long j, C0W59 c0w59, C054G c054g, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = activity;
        this.LIZIZ = j;
        this.LIZJ = c0w59;
        this.LIZLLL = c054g;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
