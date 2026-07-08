package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547950LeL {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function1<Aweme, Boolean> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547950LeL)) {
            return false;
        }
        C547950LeL c547950LeL = (C547950LeL) obj;
        return this.LIZ == c547950LeL.LIZ && this.LIZIZ == c547950LeL.LIZIZ && this.LIZJ == c547950LeL.LIZJ && Intrinsics.LJFF(this.LIZLLL, c547950LeL.LIZLLL) && Intrinsics.LJFF(this.LJ, c547950LeL.LJ) && Intrinsics.LJFF(this.LJFF, c547950LeL.LJFF) && Intrinsics.LJFF(this.LJI, c547950LeL.LJI);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Function1<Aweme, Boolean> function1 = this.LIZLLL;
        int iHashCode = (iZ2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        String str = this.LJ;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WatermarkConfig(forceInPost=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableInPost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableCommonAIGCWatermark=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableInConsumption=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commonAIGCWatermarkName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", watermarkName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", watermarkPath=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C547950LeL(boolean z, boolean z2, boolean z3, Function1<? super Aweme, Boolean> function1, String str, String str2, String str3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = function1;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
