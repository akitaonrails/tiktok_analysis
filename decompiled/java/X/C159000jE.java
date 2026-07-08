package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159000jE extends AbstractC1493005su {
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C159000jE)) {
            return false;
        }
        C159000jE c159000jE = (C159000jE) obj;
        return this.LIZLLL == c159000jE.LIZLLL && this.LJ == c159000jE.LJ && this.LJFF == c159000jE.LJFF && this.LJI == c159000jE.LJI && Intrinsics.LJFF(this.LJII, c159000jE.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c159000jE.LJIIIIZZ) && this.LJIIIZ == c159000jE.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c159000jE.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c159000jE.LJIIJJI);
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Z2(this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageShowEventBody(animated=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", failureReason=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C159000jE(boolean z, int i, int i2, boolean z2, String str, String str2, String str3, String str4, int i3) {
        String str5 = str3;
        z = (i3 & 1) != 0 ? false : z;
        i = (i3 & 2) != 0 ? -1 : i;
        int i4 = (i3 & 4) == 0 ? i2 : -1;
        str5 = (i3 & 128) != 0 ? "" : str5;
        String str6 = (i3 & 256) == 0 ? str4 : "";
        super(C2097608Jq.LJIIIIZZ(new Pair("animate", Boolean.valueOf(z)), new Pair("is_success", Boolean.valueOf(z2)), new Pair(Scene.SCENE_SERVICE, str), new Pair("failure_reason", str5), new Pair("error_msg", str6), new Pair("from_cache", Boolean.FALSE)), null, C2097608Jq.LJIIIIZZ(new Pair("width", Integer.valueOf(i)), new Pair("height", Integer.valueOf(i4)), new Pair("url", str2)), 2);
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = i4;
        this.LJI = z2;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = false;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
    }
}
