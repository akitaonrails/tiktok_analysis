package X;

import a3.e0;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0uDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695170uDL implements InterfaceC1692190u8X {
    public final C1695120uDG LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final C1695310uDZ LIZLLL;
    public final CharSequence LJ;
    public final List<C1683130ttv> LJFF;

    @Override // X.InterfaceC1692190u8X
    public final float LIZJ() {
        return this.LIZLLL.LIZJ(r1.LJII - 1);
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIIJ() {
        return this.LIZLLL.LIZJ(0);
    }

    public final float LJJIII() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1692190u8X
    public final float getHeight() {
        return this.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC1692190u8X
    public final float getWidth() {
        return C1682380tsi.LJIIIIZZ(this.LIZJ);
    }

    @Override // X.InterfaceC1692190u8X
    public final List<C1683130ttv> LJJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1692190u8X
    public final EnumC1680400tpW LIZ(int i) {
        if (this.LIZLLL.LJI.getParagraphDirection(this.LIZLLL.LJFF(i)) == 1) {
            return EnumC1680400tpW.Ltr;
        }
        return EnumC1680400tpW.Rtl;
    }

    @Override // X.InterfaceC1692190u8X
    public final int LIZIZ(int i) {
        return this.LIZLLL.LJI.getLineStart(i);
    }

    @Override // X.InterfaceC1692190u8X
    public final C1683130ttv LIZLLL(int i) {
        boolean z;
        float fLJIIIIZZ;
        float fLJIIIIZZ2;
        if (i < 0 || i >= this.LJ.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offset(");
            sbLIZ.append(i);
            sbLIZ.append(") is out of bounds [0,");
            sbLIZ.append(this.LJ.length());
            sbLIZ.append(')');
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        int iLJFF = c1695310uDZ.LJFF(i);
        float fLJI = c1695310uDZ.LJI(iLJFF);
        float fLIZLLL = c1695310uDZ.LIZLLL(iLJFF);
        if (c1695310uDZ.LJI.getParagraphDirection(iLJFF) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsRtlCharAt = c1695310uDZ.LJI.isRtlCharAt(i);
        if (z) {
            if (!zIsRtlCharAt) {
                fLJIIIIZZ = c1695310uDZ.LJII(i, false);
                fLJIIIIZZ2 = c1695310uDZ.LJII(i + 1, true);
            } else {
                fLJIIIIZZ2 = c1695310uDZ.LJIIIIZZ(i, false);
                fLJIIIIZZ = c1695310uDZ.LJIIIIZZ(i + 1, true);
            }
        } else if (zIsRtlCharAt) {
            fLJIIIIZZ2 = c1695310uDZ.LJII(i, false);
            fLJIIIIZZ = c1695310uDZ.LJII(i + 1, true);
        } else {
            fLJIIIIZZ = c1695310uDZ.LJIIIIZZ(i, false);
            fLJIIIIZZ2 = c1695310uDZ.LJIIIIZZ(i + 1, true);
        }
        RectF rectF = new RectF(fLJIIIIZZ, fLJI, fLJIIIIZZ2, fLIZLLL);
        return new C1683130ttv(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJFF(int i) {
        float f;
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        float lineLeft = c1695310uDZ.LJI.getLineLeft(i);
        if (i == c1695310uDZ.LJII - 1) {
            f = c1695310uDZ.LJIIJ;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIIIIZZ(int i) {
        return this.LIZLLL.LIZLLL(i);
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIIIZ(int i) {
        return this.LIZLLL.LJI(i);
    }

    @Override // X.InterfaceC1692190u8X
    public final C1683130ttv LJIIJJI(int i) {
        if (i < 0 || i > this.LJ.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offset(");
            sbLIZ.append(i);
            sbLIZ.append(") is out of bounds [0,");
            sbLIZ.append(this.LJ.length());
            sbLIZ.append(']');
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        float fLJII = this.LIZLLL.LJII(i, false);
        int iLJFF = this.LIZLLL.LJFF(i);
        return new C1683130ttv(fLJII, this.LIZLLL.LJI(iLJFF), fLJII, this.LIZLLL.LIZLLL(iLJFF));
    }

    @Override // X.InterfaceC1692190u8X
    public final int LJIIL(int i) {
        return this.LIZLLL.LJFF(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    @Override // X.InterfaceC1692190u8X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIILJJIL(int r6) {
        /*
            r5 = this;
            X.0uDZ r0 = r5.LIZLLL
            X.0uDM r3 = r0.LJIIJ()
            int r0 = r3.LJIIIIZZ(r6)
            boolean r0 = r3.LJI(r0)
            r2 = -1
            if (r0 == 0) goto L7b
            r3.LIZ(r6)
            r4 = r6
        L15:
            if (r4 == r2) goto L25
            boolean r0 = r3.LJI(r4)
            if (r0 == 0) goto L76
            boolean r0 = r3.LIZJ(r4)
            if (r0 != 0) goto L76
        L23:
            if (r4 != r2) goto L26
        L25:
            r4 = r6
        L26:
            int r0 = r3.LJII(r6)
            boolean r0 = r3.LIZJ(r0)
            if (r0 == 0) goto L4f
            r3.LIZ(r6)
            r0 = r6
        L34:
            if (r0 == r2) goto L45
            boolean r1 = r3.LJI(r0)
            if (r1 != 0) goto L4a
            boolean r1 = r3.LIZJ(r0)
            if (r1 == 0) goto L4a
        L42:
            if (r0 == r2) goto L45
            r6 = r0
        L45:
            long r0 = X.C1680680tpy.LIZ(r4, r6)
            return r0
        L4a:
            int r0 = r3.LJII(r0)
            goto L34
        L4f:
            r3.LIZ(r6)
            boolean r0 = r3.LIZIZ(r6)
            if (r0 == 0) goto L6b
            boolean r0 = r3.LIZLLL(r6)
            if (r0 == 0) goto L66
            boolean r0 = r3.LJFF(r6)
            if (r0 != 0) goto L66
            r0 = r6
            goto L42
        L66:
            int r0 = r3.LJII(r6)
            goto L42
        L6b:
            boolean r0 = r3.LJFF(r6)
            if (r0 == 0) goto L45
            int r0 = r3.LJII(r6)
            goto L42
        L76:
            int r4 = r3.LJIIIIZZ(r4)
            goto L15
        L7b:
            r3.LIZ(r6)
            boolean r0 = r3.LJFF(r6)
            if (r0 == 0) goto L97
            boolean r0 = r3.LIZLLL(r6)
            if (r0 == 0) goto L92
            boolean r0 = r3.LIZIZ(r6)
            if (r0 != 0) goto L92
            r4 = r6
            goto L23
        L92:
            int r4 = r3.LJIIIIZZ(r6)
            goto L23
        L97:
            boolean r0 = r3.LIZIZ(r6)
            if (r0 == 0) goto L25
            int r4 = r3.LJIIIIZZ(r6)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695170uDL.LJIILJJIL(int):long");
    }

    @Override // X.InterfaceC1692190u8X
    public final int LJIILL(long j) {
        float f;
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        int lineForVertical = c1695310uDZ.LJI.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & j))) - c1695310uDZ.LJIIIIZZ);
        C1695310uDZ c1695310uDZ2 = this.LIZLLL;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        Layout layout = c1695310uDZ2.LJI;
        float f2 = -1;
        if (lineForVertical == c1695310uDZ2.LJII - 1) {
            f = c1695310uDZ2.LJIIJ + c1695310uDZ2.LJIIJJI;
        } else {
            f = 0.0f;
        }
        return C786410Ut5.U3(layout, lineForVertical, fIntBitsToFloat + (f2 * f));
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIIZILJ(int i) {
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        return c1695310uDZ.LIZLLL(i) - c1695310uDZ.LJI(i);
    }

    @Override // X.InterfaceC1692190u8X
    public final int LJIJ(float f) {
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        return c1695310uDZ.LJI.getLineForVertical(((int) f) - c1695310uDZ.LJIIIIZZ);
    }

    @Override // X.InterfaceC1692190u8X
    public final boolean LJIJI(int i) {
        Layout layout = this.LIZLLL.LJI;
        C1319890kS3 c1319890kS3 = e0.LIZ;
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIJJ(int i) {
        float f;
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        float lineRight = c1695310uDZ.LJI.getLineRight(i);
        if (i == c1695310uDZ.LJII - 1) {
            f = c1695310uDZ.LJIIJJI;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    @Override // X.InterfaceC1692190u8X
    public final EnumC1680400tpW LJJ(int i) {
        if (this.LIZLLL.LJI.isRtlCharAt(i)) {
            return EnumC1680400tpW.Rtl;
        }
        return EnumC1680400tpW.Ltr;
    }

    public final void LJJIIJ(InterfaceC1686290tz1 interfaceC1686290tz1) {
        Canvas canvas = C1296530jqN.LIZ;
        Canvas canvas2 = ((C1696880uG6) interfaceC1686290tz1).LIZ;
        if (this.LIZLLL.LJ) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        if (canvas2.getClipBounds(c1695310uDZ.LJIILLIIL)) {
            int i = c1695310uDZ.LJIIIIZZ;
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            C1319890kS3 c1319890kS3 = e0.LIZ;
            c1319890kS3.LIZ = canvas2;
            c1695310uDZ.LJI.draw(c1319890kS3);
            int i2 = c1695310uDZ.LJIIIIZZ;
            if (i2 != 0) {
                canvas2.translate(0.0f, (-1) * i2);
            }
        }
        if (this.LIZLLL.LJ) {
            canvas2.restore();
        }
    }

    @Override // X.InterfaceC1692190u8X
    public final int LJIILLIIL(int i, boolean z) {
        if (z) {
            C1695310uDZ c1695310uDZ = this.LIZLLL;
            Layout layout = c1695310uDZ.LJI;
            C1319890kS3 c1319890kS3 = e0.LIZ;
            if (layout.getEllipsisCount(i) > 0 && c1695310uDZ.LIZIZ == TextUtils.TruncateAt.END) {
                return c1695310uDZ.LJI.getLineStart(i) + c1695310uDZ.LJI.getEllipsisStart(i);
            }
            C1695340uDc c1695340uDcLIZIZ = c1695310uDZ.LIZIZ();
            return c1695340uDcLIZIZ.LJFF(c1695340uDcLIZIZ.LIZ.getLineEnd(i), c1695340uDcLIZIZ.LIZ.getLineStart(i));
        }
        return this.LIZLLL.LJ(i);
    }

    @Override // X.InterfaceC1692190u8X
    public final C1695950uEb LJIJJLI(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.LJ.length()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start(");
            sbLIZ.append(i);
            sbLIZ.append(") or end(");
            sbLIZ.append(i2);
            sbLIZ.append(") is out of range [0..");
            sbLIZ.append(this.LJ.length());
            sbLIZ.append("], or start > end!");
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Path path = new Path();
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        c1695310uDZ.LJI.getSelectionPath(i, i2, path);
        if (c1695310uDZ.LJIIIIZZ != 0 && !path.isEmpty()) {
            path.offset(0.0f, c1695310uDZ.LJIIIIZZ);
        }
        return new C1695950uEb(path);
    }

    @Override // X.InterfaceC1692190u8X
    public final float LJIL(int i, boolean z) {
        if (z) {
            return this.LIZLLL.LJII(i, false);
        }
        return this.LIZLLL.LJIIIIZZ(i, false);
    }

    @Override // X.InterfaceC1692190u8X
    public final void LJ(long j, int i, float[] fArr) {
        boolean z;
        float fLIZ;
        float fLIZ2;
        C1695310uDZ c1695310uDZ = this.LIZLLL;
        int iLJI = C1692280u8g.LJI(j);
        int iLJFF = C1692280u8g.LJFF(j);
        int length = c1695310uDZ.LJIIIZ().length();
        boolean z2 = true;
        if (iLJI < 0) {
            C1681000tqU.LIZ("startOffset must be > 0");
        }
        if (iLJI >= length) {
            C1681000tqU.LIZ("startOffset must be less than text length");
        }
        if (iLJFF <= iLJI) {
            C1681000tqU.LIZ("endOffset must be greater than startOffset");
        }
        if (iLJFF > length) {
            C1681000tqU.LIZ("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i < (iLJFF - iLJI) * 4) {
            C1681000tqU.LIZ("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iLJFF2 = c1695310uDZ.LJFF(iLJI);
        int iLJFF3 = c1695310uDZ.LJFF(iLJFF - 1);
        C1695280uDW c1695280uDW = new C1695280uDW(c1695310uDZ);
        if (iLJFF2 > iLJFF3) {
            return;
        }
        while (true) {
            int lineStart = c1695310uDZ.LJI.getLineStart(iLJFF2);
            int iLJ = c1695310uDZ.LJ(iLJFF2);
            int iMax = Math.max(iLJI, lineStart);
            int iMin = Math.min(iLJFF, iLJ);
            float fLJI = c1695310uDZ.LJI(iLJFF2);
            float fLIZLLL = c1695310uDZ.LIZLLL(iLJFF2);
            if (c1695310uDZ.LJI.getParagraphDirection(iLJFF2) == z2) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            while (iMax < iMin) {
                boolean zIsRtlCharAt = c1695310uDZ.LJI.isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    fLIZ = c1695280uDW.LIZ(iMax, false, false, z2);
                    fLIZ2 = c1695280uDW.LIZ(iMax + 1, z2, z2, z2);
                } else if (z && zIsRtlCharAt) {
                    fLIZ2 = c1695280uDW.LIZ(iMax, false, false, false);
                    fLIZ = c1695280uDW.LIZ(iMax + 1, true, true, false);
                } else if (z3 && zIsRtlCharAt) {
                    fLIZ2 = c1695280uDW.LIZ(iMax, false, false, true);
                    fLIZ = c1695280uDW.LIZ(iMax + 1, true, true, true);
                } else {
                    fLIZ = c1695280uDW.LIZ(iMax, false, false, false);
                    fLIZ2 = c1695280uDW.LIZ(iMax + 1, true, true, false);
                }
                fArr[i] = fLIZ;
                fArr[i + 1] = fLJI;
                fArr[i + 2] = fLIZ2;
                fArr[i + 3] = fLIZLLL;
                i += 4;
                iMax++;
                z2 = true;
            }
            if (iLJFF2 != iLJFF3) {
                iLJFF2++;
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        return X.C1680680tpy.LIZ(r0[r4], r0[r3]);
     */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0uDV] */
    @Override // X.InterfaceC1692190u8X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIILIIL(X.C1683130ttv r21, int r22, X.InterfaceC1694730uCd r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695170uDL.LJIILIIL(X.0ttv, int, X.0uCd):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List<X.0ttv>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1695170uDL(X.C1695120uDG r28, int r29, int r30, long r31) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695170uDL.<init>(X.0uDG, int, int, long):void");
    }

    @Override // X.InterfaceC1692190u8X
    public final void LJI(InterfaceC1686290tz1 interfaceC1686290tz1, long j, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES, int i) {
        C1695130uDH c1695130uDH = this.LIZ.LJI;
        int i2 = c1695130uDH.LIZJ;
        c1695130uDH.LIZLLL(j);
        c1695130uDH.LJFF(c1693340uAO);
        c1695130uDH.LJI(c1693510uAf);
        c1695130uDH.LJ(abstractC1695860uES);
        c1695130uDH.LIZIZ(i);
        LJJIIJ(interfaceC1686290tz1);
        this.LIZ.LJI.LIZIZ(i2);
    }

    @Override // X.InterfaceC1692190u8X
    public final void LJII(InterfaceC1686290tz1 interfaceC1686290tz1, AbstractC1668700tWe abstractC1668700tWe, float f, C1693340uAO c1693340uAO, C1693510uAf c1693510uAf, AbstractC1695860uES abstractC1695860uES, int i) {
        C1695130uDH c1695130uDH = this.LIZ.LJI;
        int i2 = c1695130uDH.LIZJ;
        float width = getWidth();
        c1695130uDH.LIZJ(abstractC1668700tWe, (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32), f);
        c1695130uDH.LJFF(c1693340uAO);
        c1695130uDH.LJI(c1693510uAf);
        c1695130uDH.LJ(abstractC1695860uES);
        c1695130uDH.LIZIZ(i);
        LJJIIJ(interfaceC1686290tz1);
        this.LIZ.LJI.LIZIZ(i2);
    }

    public final C1695310uDZ LJJIFFI(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        C1693520uAg c1693520uAg;
        float width = getWidth();
        C1695120uDG c1695120uDG = this.LIZ;
        C1695130uDH c1695130uDH = c1695120uDG.LJI;
        int i8 = c1695120uDG.LJIIJJI;
        C1695320uDa c1695320uDa = c1695120uDG.LJIIIIZZ;
        C1693430uAX c1693430uAX = c1695120uDG.LIZIZ;
        C1695640uE6 c1695640uE6 = C1695690uEB.LIZ;
        C1683290tuB c1683290tuB = c1693430uAX.LIZJ;
        if (c1683290tuB != null && (c1693520uAg = c1683290tuB.LIZIZ) != null) {
            z = c1693520uAg.LIZ;
        } else {
            z = false;
        }
        return new C1695310uDZ(charSequence, width, c1695130uDH, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, c1695320uDa);
    }
}
