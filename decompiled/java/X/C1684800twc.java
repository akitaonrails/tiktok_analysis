package X;

import android.graphics.Rect;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.faceinfo.VEFaceAttribute;
import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0twc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684800twc implements InterfaceC2177991ALt {
    public C1684860twi LIZ;
    public Rect LIZIZ;
    public final C1684440tw2 LIZJ = new C1684440tw2(0);
    public final C1684840twg<C1684540twC> LIZLLL = new C1684840twg<>(AFwS214S0000000_25.get$arr$(145));
    public final /* synthetic */ C1684810twd LJ;

    public C1684800twc(C1684810twd c1684810twd) {
        this.LJ = c1684810twd;
        this.LIZIZ = c1684810twd.LIZ;
    }

    @Override // X.InterfaceC2177991ALt
    public final void LIZ(VEFaceAttributeInfo vEFaceAttributeInfo, VEFaceDetectInfo vEFaceDetectInfo) {
        C1684910twn[] info;
        VEFaceAttribute[] info2;
        VEFaceAttribute vEFaceAttribute;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C1684810twd c1684810twd = this.LJ;
        InterfaceC1684790twb interfaceC1684790twb = c1684810twd.LJFF;
        if (interfaceC1684790twb == null) {
            return;
        }
        C1684860twi c1684860twi = this.LIZ;
        if (c1684860twi == null) {
            C1684810twd.LIZJ(c1684810twd, interfaceC1684790twb);
            C1684810twd.LIZLLL(c1684810twd, interfaceC1684790twb, null, 3);
            return;
        }
        if (vEFaceDetectInfo != null && (info = vEFaceDetectInfo.getInfo()) != null) {
            if (info.length == 0) {
                C1684810twd.LIZJ(this.LJ, interfaceC1684790twb);
                C1684810twd.LIZLLL(this.LJ, interfaceC1684790twb, null, 3);
                return;
            }
            C1684910twn c1684910twn = info[0];
            if (c1684910twn == null) {
                C1684810twd c1684810twd2 = this.LJ;
                C1684810twd.LIZJ(c1684810twd2, interfaceC1684790twb);
                C1684810twd.LIZLLL(c1684810twd2, interfaceC1684790twb, EnumC439820HMm.NO_FACE, 2);
                return;
            }
            if (vEFaceAttributeInfo != null && (info2 = vEFaceAttributeInfo.getInfo()) != null && (vEFaceAttribute = (VEFaceAttribute) C13LQ.LJIL(info2)) != null) {
                C1684810twd c1684810twd3 = this.LJ;
                Rect rect = c1684810twd3.LIZ;
                VESize renderSize = c1684810twd3.LJ.LIZIZ.LJLJL.getRenderSize();
                float f = renderSize.width / renderSize.height;
                if (rect.width() / rect.height() > f) {
                    float fHeight = rect.height();
                    float f2 = f * fHeight;
                    float f3 = fHeight / renderSize.height;
                    Rect rect2 = c1684910twn.LIZ;
                    float f4 = rect2.left * f3;
                    float f5 = rect2.top * f3;
                    float fWidth = rect2.width() * f3;
                    int iMax = (int) (Math.max(c1684810twd3.LIZ.width() - f2, 0.0f) / 2.0f);
                    Rect rect3 = c1684810twd3.LJIIJJI;
                    rect3.left = ((int) f4) + iMax;
                    Rect rect4 = c1684910twn.LIZ;
                    rect3.right = rect4.left + ((int) fWidth);
                    rect3.top = (int) f5;
                    rect3.bottom = rect4.top + ((int) (f3 * c1684910twn.LIZ.height()));
                } else {
                    float fWidth2 = rect.width();
                    float f6 = fWidth2 / f;
                    float f7 = fWidth2 / renderSize.width;
                    Rect rect5 = c1684910twn.LIZ;
                    float f8 = rect5.left * f7;
                    float f9 = rect5.top * f7;
                    float fWidth3 = rect5.width() * f7;
                    int iMax2 = (int) (Math.max(c1684810twd3.LIZ.height() - f6, 0.0f) / 2.0f);
                    Rect rect6 = c1684810twd3.LJIIJJI;
                    rect6.left = (int) f8;
                    Rect rect7 = c1684910twn.LIZ;
                    rect6.right = rect7.left + ((int) fWidth3);
                    rect6.top = ((int) f9) + iMax2;
                    rect6.bottom = rect7.top + ((int) (f7 * c1684910twn.LIZ.height()));
                }
                Rect rect8 = c1684810twd3.LJIIJJI;
                int length = info.length;
                if (length > 1) {
                    z = true;
                } else {
                    z = false;
                }
                int expType = vEFaceAttribute.getExpType();
                float[] expProbs = vEFaceAttribute.getExpProbs();
                C1684590twH c1684590twH = new C1684590twH(expType, expProbs);
                if (this.LJ.LJI && expType != 6) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Rect rect9 = this.LIZIZ;
                double dAbs = ((double) Math.abs(rect9.right - rect9.left)) * 0.05d;
                double dAbs2 = ((double) Math.abs(rect9.bottom - rect9.top)) * 0.05d;
                if (rect8.top >= ((double) rect9.top) + dAbs2 && rect8.left >= ((double) rect9.left) + dAbs && rect8.bottom <= ((double) rect9.bottom) - dAbs2 && rect8.right <= ((double) rect9.right) - dAbs) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1684810twd c1684810twd4 = this.LJ;
                Rect rect10 = this.LIZIZ;
                C1684440tw2 c1684440tw2 = this.LIZJ;
                c1684810twd4.getClass();
                int iAbs = Math.abs(rect8.right - rect8.left);
                int iAbs2 = Math.abs(rect8.bottom - rect8.top);
                int iAbs3 = Math.abs(rect10.right - rect10.left);
                int iAbs4 = Math.abs(rect10.bottom - rect10.top);
                if (iAbs2 > iAbs) {
                    c1684440tw2.LIZLLL = C1684830twf.LIZ(iAbs2 / iAbs4, C1684830twf.LIZIZ(c1684810twd4.LJII));
                } else {
                    c1684440tw2.LIZLLL = C1684830twf.LIZ(iAbs / iAbs3, C1684830twf.LIZIZ(c1684810twd4.LJII));
                }
                if (c1684440tw2.LIZLLL == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C1684810twd c1684810twd5 = this.LJ;
                Rect rect11 = this.LIZIZ;
                C1684440tw2 c1684440tw22 = this.LIZJ;
                c1684810twd5.getClass();
                int iAbs5 = Math.abs(rect11.right - rect11.left);
                float f10 = 2;
                float fAbs = (((rect8.bottom + rect8.top) / f10) - rect11.top) / Math.abs(rect11.bottom - rect11.top);
                c1684440tw22.LJ = C1684830twf.LIZ((((rect8.right + rect8.left) / f10) - rect11.left) / iAbs5, C1684830twf.LIZIZ(c1684810twd5.LJIIIIZZ.horizontalRange));
                int iLIZ = C1684830twf.LIZ(fAbs, C1684830twf.LIZIZ(c1684810twd5.LJIIIIZZ.verticalRange));
                c1684440tw22.LJFF = iLIZ;
                if (c1684440tw22.LJ == 0 && iLIZ == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                C1684870twj c1684870twj = this.LJ.LJIIIZ.get(c1684860twi.LIZ);
                if (c1684870twj != null) {
                    C1684440tw2 c1684440tw23 = this.LIZJ;
                    c1684440tw23.LIZIZ = C1684830twf.LIZ(c1684910twn.LIZJ, C1684830twf.LIZIZ(c1684870twj.LIZ.pitchRange));
                    c1684440tw23.LIZJ = C1684830twf.LIZ(c1684910twn.LIZLLL, C1684830twf.LIZIZ(c1684870twj.LIZ.rollRange));
                    int iLIZ2 = C1684830twf.LIZ(c1684910twn.LIZIZ, C1684830twf.LIZIZ(c1684870twj.LIZ.yawRange));
                    c1684440tw23.LIZ = iLIZ2;
                    if (c1684440tw23.LIZIZ == 0 && c1684440tw23.LIZJ == 0 && iLIZ2 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                int length2 = expProbs.length;
                for (int i = 0; i < length2; i++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append(" - ");
                    sbLIZ.append(c1684590twH.LIZIZ[i]);
                    sbLIZ.append(", ");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C1684840twg<C1684540twC> c1684840twg = this.LIZLLL;
                boolean z8 = z6;
                boolean z9 = z5;
                boolean z10 = z2;
                C1684610twJ c1684610twJ = new C1684610twJ(c1684860twi, z6, z2, length, z4, z3, z5, c1684590twH, rect8, this, c1684910twn);
                C1684850twh<C1684540twC> c1684850twh = c1684840twg.LIZ;
                int i2 = c1684850twh.LIZIZ;
                if (i2 != c1684850twh.LIZJ) {
                    C1684540twC[] c1684540twCArr = c1684850twh.LIZ;
                    C1684540twC c1684540twC = c1684540twCArr[i2];
                    c1684540twCArr[i2] = null;
                    c1684850twh.LIZIZ = (i2 + 1) & c1684850twh.LIZLLL;
                    c1684610twJ.invoke(c1684540twC);
                    c1684840twg.LIZ.LIZ(c1684540twC);
                    C1684540twC c1684540twC2 = c1684540twC;
                    this.LJ.getClass();
                    boolean zLIZIZ = interfaceC1684790twb.LIZIZ(c1684540twC2);
                    if ((interfaceC1684790twb.LIZLLL() && zLIZIZ) || (z3 && z10 && z8 && !z && z4 && z9)) {
                        z7 = true;
                        C1684810twd c1684810twd6 = this.LJ;
                        Rect rect12 = this.LIZIZ;
                        c1684810twd6.getClass();
                        C23250099c.LIZLLL(C817503Hh.LL, C2108208Ns.LIZ, null, new C1684780twa(c1684810twd6, c1684860twi, rect12, c1684910twn, vEFaceAttribute, interfaceC1684790twb, null), 2);
                    } else {
                        z7 = false;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isFaceInsideDetectArea ");
                        sbLIZ2.append(z3);
                        sbLIZ2.append(", && isNeutralExpression ");
                        sbLIZ2.append(z10);
                        sbLIZ2.append(", isPositionMatch ");
                        sbLIZ2.append(z8);
                        sbLIZ2.append(", isMultipleFacesDetected ");
                        sbLIZ2.append(!z);
                        sbLIZ2.append(", isFaceDistanceInRange ");
                        sbLIZ2.append(z4);
                        sbLIZ2.append(", isFaceCenter ");
                        sbLIZ2.append(z9);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1684810twd c1684810twd7 = this.LJ;
                        EnumC439820HMm enumC439820HMm = EnumC439820HMm.FACE_NOT_MATCH;
                        c1684810twd7.getClass();
                        interfaceC1684790twb.LIZ(enumC439820HMm, c1684540twC2);
                    }
                    this.LJ.LJIIJ = z7;
                    return;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C1684810twd c1684810twd8 = this.LJ;
            C1684810twd.LIZJ(c1684810twd8, interfaceC1684790twb);
            C1684810twd.LIZLLL(c1684810twd8, interfaceC1684790twb, EnumC439820HMm.NO_FACE, 2);
            return;
        }
        C1684810twd c1684810twd9 = this.LJ;
        C1684810twd.LIZJ(c1684810twd9, interfaceC1684790twb);
        C1684810twd.LIZLLL(c1684810twd9, interfaceC1684790twb, null, 3);
    }
}
