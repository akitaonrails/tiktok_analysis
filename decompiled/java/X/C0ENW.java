package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENW extends AbstractC363520ENa {
    public final C0ENU LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public NLETextRichContent LIZLLL;
    public String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENW)) {
            return false;
        }
        C0ENW c0enw = (C0ENW) obj;
        return Intrinsics.LJFF(this.LIZ, c0enw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0enw.LIZIZ) && Float.compare(this.LIZJ, c0enw.LIZJ) == 0 && Intrinsics.LJFF(this.LIZLLL, c0enw.LIZLLL) && Intrinsics.LJFF(this.LJ, c0enw.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextMask(baseData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", richContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cachedRichContent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cachedId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final NLETextRichContent LIZJ() {
        NLETextRichContent nLETextRichContent = this.LIZLLL;
        if (nLETextRichContent != null && Intrinsics.LJFF(this.LJ, this.LIZIZ)) {
            return nLETextRichContent;
        }
        C0F8B c0f8b = NLETextRichContent.Companion;
        String str = this.LIZIZ;
        c0f8b.getClass();
        NLETextRichContent nLETextRichContentLIZ = C0F8B.LIZ(str);
        this.LIZLLL = nLETextRichContentLIZ;
        this.LJ = this.LIZIZ;
        return nLETextRichContentLIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31;
        NLETextRichContent nLETextRichContent = this.LIZLLL;
        int iHashCode2 = (iHashCode + (nLETextRichContent == null ? 0 : nLETextRichContent.hashCode())) * 31;
        String str = this.LJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.AbstractC363520ENa
    public final C0ENU LIZ() {
        return this.LIZ;
    }

    public C0ENW(C0ENU c0enu, String str, float f, NLETextRichContent nLETextRichContent, String str2) {
        this.LIZ = c0enu;
        this.LIZIZ = str;
        this.LIZJ = f;
        this.LIZLLL = nLETextRichContent;
        this.LJ = str2;
    }

    public static C0ENW LIZIZ(C0ENW c0enw, C0ENU c0enu, String str, float f, int i) {
        NLETextRichContent nLETextRichContent;
        float f2 = f;
        String str2 = str;
        C0ENU c0enu2 = c0enu;
        if ((i & 1) != 0) {
            c0enu2 = c0enw.LIZ;
        }
        if ((i & 2) != 0) {
            str2 = c0enw.LIZIZ;
        }
        if ((i & 4) != 0) {
            f2 = c0enw.LIZJ;
        }
        String str3 = null;
        if ((i & 8) != 0) {
            nLETextRichContent = c0enw.LIZLLL;
        } else {
            nLETextRichContent = null;
        }
        if ((i & 16) != 0) {
            str3 = c0enw.LJ;
        }
        return new C0ENW(c0enu2, str2, f2, nLETextRichContent, str3);
    }
}
