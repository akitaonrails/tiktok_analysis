package X;

import com.ss.android.ugc.aweme.editpost.ClientTextWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869620yki implements C164B {
    public final ClientTextWrapper LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;

    @Override // X.C164B
    public final Integer c5() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869620yki)) {
            return false;
        }
        C1869620yki c1869620yki = (C1869620yki) obj;
        return Intrinsics.LJFF(this.LIZ, c1869620yki.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869620yki.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869620yki.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1869620yki.LIZLLL) && this.LJ == c1869620yki.LJ && Intrinsics.LJFF(this.LJFF, c1869620yki.LJFF) && Intrinsics.LJFF(this.LJI, c1869620yki.LJI);
    }

    public final int hashCode() {
        ClientTextWrapper clientTextWrapper = this.LIZ;
        int iHashCode = (((((((((clientTextWrapper == null ? 0 : clientTextWrapper.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescRichTextTranslationCacheValue(clientTextWrapper=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", srcContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", translatedContent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetLang=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cacheType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LJ;
    }

    @Override // X.C164B
    public final String b5() {
        return this.LJI;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJFF;
    }

    public C1869620yki(ClientTextWrapper clientTextWrapper, String str, String str2, String str3, boolean z, String str4, String str5) {
        this.LIZ = clientTextWrapper;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = str4;
        this.LJI = str5;
    }
}
