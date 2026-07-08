package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009340cNA {
    public final String LIZ;
    public final String LIZIZ;
    public final Object LIZJ;
    public final AwemeRawAd LIZLLL;
    public final n LJ;
    public final AnoleModel LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1009340cNA)) {
            return false;
        }
        C1009340cNA c1009340cNA = (C1009340cNA) obj;
        return Intrinsics.LJFF(this.LIZ, c1009340cNA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1009340cNA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1009340cNA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1009340cNA.LIZLLL) && Intrinsics.LJFF(this.LJ, c1009340cNA.LJ) && Intrinsics.LJFF(this.LJFF, c1009340cNA.LJFF) && Intrinsics.LJFF(this.LJI, c1009340cNA.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31;
        n nVar = this.LJ;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        AnoleModel anoleModel = this.LJFF;
        int iHashCode5 = (iHashCode4 + (anoleModel == null ? 0 : anoleModel.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public C1009340cNA(String str, String str2, Object obj, AwemeRawAd awemeRawAd, n nVar, AnoleModel anoleModel, String str3, int i) {
        nVar = (i & 16) != 0 ? null : nVar;
        anoleModel = (i & 32) != 0 ? null : anoleModel;
        str3 = (i & 64) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = obj;
        this.LIZLLL = awemeRawAd;
        this.LJ = nVar;
        this.LJFF = anoleModel;
        this.LJI = str3;
    }
}
