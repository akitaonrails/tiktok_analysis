package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361470lX7 implements C164B {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<TextExtraStruct> LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final int LJI;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361470lX7)) {
            return false;
        }
        C1361470lX7 c1361470lX7 = (C1361470lX7) obj;
        return Intrinsics.LJFF(this.LIZ, c1361470lX7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1361470lX7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1361470lX7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1361470lX7.LIZLLL) && this.LJ == c1361470lX7.LJ && Intrinsics.LJFF(this.LJFF, c1361470lX7.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentTranslationCacheValue(srcContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translatedContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", translatedTextExtra=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final Integer c5() {
        return Integer.valueOf(this.LJI);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LJ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJFF;
    }

    public C1361470lX7(String str, String str2, String str3, String str4, boolean z, List list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = z;
        this.LJFF = str4;
        this.LJI = str2.length();
    }
}
