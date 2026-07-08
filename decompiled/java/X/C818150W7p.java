package X;

import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818150W7p {
    public final Locale LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Function1<Locale, String> LJIIIIZZ;
    public final C0W82 LJIIIZ;
    public final C818200W7u LJIIJ;

    public C818150W7p() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C818150W7p)) {
            return false;
        }
        C818150W7p c818150W7p = (C818150W7p) obj;
        return Intrinsics.LJFF(this.LIZ, c818150W7p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c818150W7p.LIZIZ) && this.LIZJ == c818150W7p.LIZJ && this.LIZLLL == c818150W7p.LIZLLL && this.LJ == c818150W7p.LJ && Intrinsics.LJFF(this.LJFF, c818150W7p.LJFF) && Intrinsics.LJFF(this.LJI, c818150W7p.LJI) && Intrinsics.LJFF(this.LJII, c818150W7p.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c818150W7p.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c818150W7p.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c818150W7p.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        boolean z = this.LIZJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        boolean z2 = this.LIZLLL;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (((i + r02) * 31) + (this.LJ ? 1 : 0)) * 31;
        String str = this.LJFF;
        int iHashCode2 = (((((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        Function1<Locale, String> function1 = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        C0W82 c0w82 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (c0w82 == null ? 0 : c0w82.hashCode())) * 31;
        C818200W7u c818200W7u = this.LJIIJ;
        return iHashCode4 + (c818200W7u != null ? c818200W7u.hashCode() : 0);
    }

    public final String toString() {
        return "NxRewordConfig(currentLocale=" + this.LIZ + ", releaseBuild=" + this.LIZIZ + ", isOpenResGuard=" + this.LIZJ + ", isDebug=" + this.LIZLLL + ", isOpenLogCat=" + this.LJ + ", nxResourceCustomFilePath=" + ((Object) this.LJFF) + ", patchFileNamePrefix=" + this.LJI + ", stringsPatchChannelName=" + this.LJII + ", localeToStringCallBack=" + this.LJIIIIZZ + ", nxRewordMonitor=" + this.LJIIIZ + ", nxRewordMonitorConfig=" + this.LJIIJ + ')';
    }

    public C818150W7p(Locale locale, String str, boolean z, String str2, Function1 function1, C2178308g9 c2178308g9, C818200W7u c818200W7u, int i) {
        String str3;
        z = (i & 4) != 0 ? false : z;
        if ((i & 64) != 0) {
            str3 = "strings_patch#";
        } else {
            str3 = null;
        }
        str2 = (i & 128) != 0 ? "starling_patch_tiktok_strings_" : str2;
        function1 = (i & 256) != 0 ? null : function1;
        c2178308g9 = (i & 512) != 0 ? null : c2178308g9;
        c818200W7u = (i & 1024) != 0 ? null : c818200W7u;
        this.LIZ = locale;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = str3;
        this.LJII = str2;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = c2178308g9;
        this.LJIIJ = c818200W7u;
    }
}
