package X;

import com.ss.android.vesdk.VEFileDownloader;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20186513yh implements InterfaceC20186313yf {
    public final VEFileDownloader LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Set<String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20186513yh)) {
            return false;
        }
        C20186513yh c20186513yh = (C20186513yh) obj;
        return Intrinsics.LJFF(this.LIZ, c20186513yh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20186513yh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20186513yh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20186513yh.LIZLLL) && Intrinsics.LJFF(this.LJ, c20186513yh.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Downloading(downloader=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", savePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", externalPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", urls=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20186513yh(VEFileDownloader vEFileDownloader, String str, String str2, String str3, Set<String> set) {
        this.LIZ = vEFileDownloader;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = set;
    }
}
