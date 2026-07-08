package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422880n8A {
    public final EnumC1423060n8S LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public TemplateCategoryData LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1422880n8A)) {
            return false;
        }
        C1422880n8A c1422880n8A = (C1422880n8A) obj;
        return this.LIZ == c1422880n8A.LIZ && this.LIZIZ == c1422880n8A.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1422880n8A.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1422880n8A.LIZLLL) && this.LJ == c1422880n8A.LJ && Intrinsics.LJFF(this.LJFF, c1422880n8A.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateErrorInfo(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1422880n8A(EnumC1423060n8S enumC1423060n8S, int i, String str, TemplateCategoryData templateCategoryData, boolean z, String str2) {
        this.LIZ = enumC1423060n8S;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = templateCategoryData;
        this.LJ = z;
        this.LJFF = str2;
    }
}
