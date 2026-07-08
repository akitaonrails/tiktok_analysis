package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21375918l3 extends AbstractC1784370wXD {
    public final EnumC21376018l4 LIZ;
    public final String LIZIZ;
    public final CustomColor LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21375918l3)) {
            return false;
        }
        C21375918l3 c21375918l3 = (C21375918l3) obj;
        return this.LIZ == c21375918l3.LIZ && Intrinsics.LJFF(this.LIZIZ, c21375918l3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c21375918l3.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        CustomColor customColor = this.LIZJ;
        return iHashCode + (customColor == null ? 0 : customColor.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagTextData(labelSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21375918l3(X.EnumC21376018l4 r5, java.lang.String r6, com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.LIZ = r5
            r4.LIZIZ = r6
            r4.LIZJ = r7
            int[] r1 = X.C21376218l6.LIZ
            int r0 = r5.ordinal()
            r0 = r1[r0]
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == r1) goto L2a
            if (r0 == r2) goto L35
            if (r0 != r3) goto L49
            int r0 = X.C21375518kz.LIZ
            if (r0 == r1) goto L27
            if (r0 == r2) goto L40
            if (r0 != r3) goto L40
            r0 = 62
        L24:
            r4.LIZLLL = r0
            return
        L27:
            r0 = 71
            goto L24
        L2a:
            int r0 = X.C21375518kz.LIZ
            if (r0 == r1) goto L46
            if (r0 == r2) goto L32
            if (r0 == r3) goto L3d
        L32:
            r0 = 92
            goto L24
        L35:
            int r0 = X.C21375518kz.LIZ
            if (r0 == r1) goto L43
            if (r0 == r2) goto L3d
            if (r0 == r3) goto L40
        L3d:
            r0 = 82
            goto L24
        L40:
            r0 = 72
            goto L24
        L43:
            r0 = 81
            goto L24
        L46:
            r0 = 91
            goto L24
        L49:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21375918l3.<init>(X.18l4, java.lang.String, com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor):void");
    }
}
