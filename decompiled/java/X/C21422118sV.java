package X;

import android.os.Build;
import android.text.style.AbsoluteSizeSpan;
import com.larus.business.markdown.impl.markwon.space.CustomSpaceDebugForV2;

/* JADX INFO: renamed from: X.18sV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21422118sV {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:105:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0113 A[PHI: r6 r7
      0x0113: PHI (r6v25 java.lang.String) = (r6v6 java.lang.String), (r6v6 java.lang.String), (r6v5 java.lang.String) binds: [B:43:0x0061, B:45:0x0065, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0113: PHI (r7v7 X.14S3) = (r7v6 X.14S3), (r7v6 X.14S3), (r7v5 X.14S3) binds: [B:43:0x0061, B:45:0x0065, B:41:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC21427218tK r8, X.AbstractC21430218to r9, X.C689290R1z r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21422118sV.LIZIZ(X.18tK, X.18to, X.0R1z, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC21427218tK r7, X.AbstractC21430218to r8, X.C689290R1z r9, boolean r10) {
        /*
            com.larus.business.markdown.api.model.CustomSpaceScene r1 = r9.LIZ
            com.larus.business.markdown.api.model.CustomSpaceScene r0 = com.larus.business.markdown.api.model.CustomSpaceScene.V2
            if (r1 == r0) goto L7
            return
        L7:
            X.18to r6 = r8.LIZ
            boolean r0 = r8 instanceof X.C21445118wD
            r3 = 0
            if (r0 != 0) goto L12
            boolean r0 = r8 instanceof X.C21427618tO
            if (r0 == 0) goto L32
        L12:
            r2 = r6
            r1 = 0
        L14:
            if (r2 == 0) goto L23
            boolean r0 = r2 instanceof X.C21445118wD
            if (r0 != 0) goto L1e
            boolean r0 = r2 instanceof X.C21427618tO
            if (r0 == 0) goto L20
        L1e:
            int r1 = r1 + 1
        L20:
            X.18to r2 = r2.LIZ
            goto L14
        L23:
            if (r1 <= 0) goto L32
            X.18to r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L32
            X.14S3 r4 = X.C14S3.V2_SPACE_ITEM_BETWEEN
            java.lang.String r5 = "onLine: start spacing before the first item of a nested list"
            goto L34
        L32:
            r4 = r3
            r5 = r3
        L34:
            boolean r0 = r6 instanceof X.C21445118wD
            if (r0 == 0) goto L40
            boolean r0 = r8 instanceof X.AbstractC21445918wL
            if (r0 != 0) goto L40
            X.14S3 r4 = X.C14S3.V2_SPACE_NATURAL_SEGMENT
            java.lang.String r5 = "onLine: start spacing before non-list blocks in list item"
        L40:
            boolean r0 = r8 instanceof X.C21439318vH
            if (r0 == 0) goto L54
            r2 = r8
            X.18vH r2 = (X.C21439318vH) r2
            int r1 = r2.LJFF
            r0 = 3
            if (r1 > r0) goto L54
            X.18to r0 = r2.LIZLLL
            if (r0 == 0) goto L54
            X.14S3 r4 = X.C14S3.V2_SPACE_HEADING_EXTRA_TOP
            java.lang.String r5 = "onLine: start extra top margin before H1/H2/H3 headings"
        L54:
            boolean r0 = r8 instanceof X.C21440118vP
            if (r0 != 0) goto L5c
            boolean r0 = r8 instanceof X.C21437218uw
            if (r0 == 0) goto L68
        L5c:
            r1 = r8
        L5d:
            X.18to r0 = r1.LIZLLL
            if (r0 != 0) goto L6f
            X.18to r1 = r1.LIZ
            if (r1 != 0) goto L5d
            java.lang.String r5 = "new: start nativeView at the beginning"
            r4 = r3
        L68:
            if (r10 == 0) goto L6b
            r3 = r5
        L6b:
            LIZ(r7, r9, r4, r10, r3)
            return
        L6f:
            boolean r1 = r0 instanceof X.AbstractC21445918wL
            if (r1 != 0) goto L77
            boolean r1 = r0 instanceof X.C21445018wC
            if (r1 == 0) goto L7b
        L77:
            X.18to r0 = r0.LIZJ
            if (r0 != 0) goto L6f
        L7b:
            X.18to r1 = r8.LIZ
        L7d:
            if (r1 == 0) goto L8f
            boolean r0 = r1 instanceof X.C21445118wD
            if (r0 != 0) goto L8a
            boolean r0 = r1 instanceof X.C21427618tO
            if (r0 != 0) goto L8a
            X.18to r1 = r1.LIZ
            goto L7d
        L8a:
            X.14S3 r4 = X.C14S3.V2_SPACE_ITEM_BETWEEN
            java.lang.String r5 = "new: start: cur.prev!=null"
            goto L68
        L8f:
            X.18to r1 = r8.LIZ
            if (r1 == 0) goto Lc1
            X.18to r0 = r1.LIZLLL
            if (r0 == 0) goto Lc1
            X.18to r2 = r1.LIZLLL
            boolean r0 = r2 instanceof X.C21445118wD
            if (r0 != 0) goto Lbc
            boolean r0 = r2 instanceof X.C21427618tO
            if (r0 != 0) goto Lbc
            X.14S3 r4 = X.C14S3.V2_SPACE_NATURAL_SEGMENT
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "new: start: parent.prev="
            r1.append(r0)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)
            goto L68
        Lbc:
            X.14S3 r4 = X.C14S3.V2_SPACE_ITEM_BETWEEN
            java.lang.String r5 = "new: start: parent.prev=ListItem"
            goto L68
        Lc1:
            X.14S3 r4 = X.C14S3.V2_SPACE_NATURAL_SEGMENT
            java.lang.String r5 = "new: start: prev=null,parent.prev=null"
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21422118sV.LIZJ(X.18tK, X.18to, X.0R1z, boolean):void");
    }

    public static void LIZ(InterfaceC21427218tK interfaceC21427218tK, C689290R1z c689290R1z, C14S3 c14s3, boolean z, String str) {
        Integer num;
        String strLJZL;
        int i;
        Object c0gwf;
        if (c14s3 != null && (num = c689290R1z.LIZIZ.get(c14s3)) != null) {
            int iIntValue = num.intValue();
            interfaceC21427218tK.LJIIJ();
            int length = interfaceC21427218tK.length();
            int iLIZ = C445120Hcs.LIZ(Integer.valueOf(iIntValue));
            if (z && str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iIntValue);
                sbLIZ.append("dp|");
                sbLIZ.append(str);
                strLJZL = C13LN.LJZL(40, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                strLJZL = " ";
            }
            interfaceC21427218tK.builder().LIZJ(strLJZL);
            interfaceC21427218tK.LJIJI(length, C418300Gai.LIZ(iLIZ));
            if (z) {
                interfaceC21427218tK.LJIJI(length, new AbsoluteSizeSpan(iIntValue, true));
                switch (C14S4.LIZ[c14s3.ordinal()]) {
                    case 1:
                        i = -16776961;
                        break;
                    case 2:
                        i = -65536;
                        break;
                    case 3:
                        i = -256;
                        break;
                    case 4:
                        i = -65281;
                        break;
                    case 5:
                        i = -16711936;
                        break;
                    case 6:
                        i = -16711681;
                        break;
                    default:
                        i = 0;
                        break;
                }
                int iOrdinal = c14s3.ordinal() + 1;
                if (Build.VERSION.SDK_INT >= 29) {
                    c0gwf = new CustomSpaceDebugForV2(i, iOrdinal);
                } else {
                    c0gwf = new C0GWF(i);
                }
                interfaceC21427218tK.LJIJI(length, c0gwf);
            }
            interfaceC21427218tK.LJIIJ();
        }
    }
}
