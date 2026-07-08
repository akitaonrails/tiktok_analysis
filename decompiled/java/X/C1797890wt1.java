package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S1000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797890wt1 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ = "/tiktok/pns/privacy_headers";
    public final C1798090wtL LIZLLL;
    public final Function0<String> LJ;
    public final Function0<String> LJFF;
    public final String LJI;
    public final boolean LJII;
    public final C1884707Zt LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final C1086040eMs LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1797890wt1)) {
            return false;
        }
        C1797890wt1 c1797890wt1 = (C1797890wt1) obj;
        return Intrinsics.LJFF(this.LIZ, c1797890wt1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1797890wt1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1797890wt1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1797890wt1.LIZLLL) && Intrinsics.LJFF(this.LJ, c1797890wt1.LJ) && Intrinsics.LJFF(this.LJFF, c1797890wt1.LJFF) && Intrinsics.LJFF(this.LJI, c1797890wt1.LJI) && this.LJII == c1797890wt1.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1797890wt1.LJIIIIZZ) && this.LJIIIZ == c1797890wt1.LJIIIZ && this.LJIIJ == c1797890wt1.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1797890wt1.LJIIJJI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "PrivacyDataInitParams(context=" + this.LIZ + ", baseUrl=" + this.LIZIZ + ", path=" + this.LIZJ + ", networkConfig=" + this.LIZLLL + ", uidGetter=" + this.LJ + ", didGetter=" + this.LJFF + ", appId=" + this.LJI + ", enabled=" + this.LJII + ", headerInjectionConfig=" + this.LJIIIIZZ + ", maxRetryTimes=" + this.LJIIIZ + ", retryDelayMillis=" + this.LJIIJ + ", pushFrequencyConfig=" + this.LJIIJJI + ')';
    }

    public C1797890wt1(Context context, String str, C1798090wtL c1798090wtL, C1798000wtC c1798000wtC, AwS111S1000000_27 awS111S1000000_27, String str2, boolean z, C1884707Zt c1884707Zt, int i, long j, C1086040eMs c1086040eMs) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZLLL = c1798090wtL;
        this.LJ = c1798000wtC;
        this.LJFF = awS111S1000000_27;
        this.LJI = str2;
        this.LJII = z;
        this.LJIIIIZZ = c1884707Zt;
        this.LJIIIZ = i;
        this.LJIIJ = j;
        this.LJIIJJI = c1086040eMs;
    }
}
