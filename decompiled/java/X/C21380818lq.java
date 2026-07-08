package X;

import android.graphics.Typeface;
import android.os.Build;
import android.text.style.ParagraphStyle;
import com.larus.business.markdown.impl.markwon.space.CustomSpaceDebugSpan;
import java.util.List;

/* JADX INFO: renamed from: X.18lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21380818lq implements InterfaceC21446318wP {
    public final List<Integer> LIZ;
    public final List<Float> LIZIZ;
    public final int LIZJ;
    public final Typeface LIZLLL;
    public final List<Typeface> LJ;
    public final boolean LJFF;
    public final boolean LJI;

    @Override // X.InterfaceC21446318wP
    public final Object LIZ(C21432118u7 c21432118u7, C14S7 c14s7) {
        int iLIZ;
        float fFloatValue;
        ParagraphStyle c0gwf;
        Float f;
        Number number;
        int iIntValue = AbstractC20267814Se.LIZLLL.LIZ(c14s7).intValue();
        C445090Hcp c445090Hcp = new C445090Hcp(c21432118u7.LIZ, iIntValue, this.LIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        if (this.LJFF) {
            return c445090Hcp;
        }
        List<Integer> list = this.LIZ;
        if (list != null && (number = (Number) C13LP.LJJJLZIJ(iIntValue - 1, list)) != null) {
            iLIZ = C445120Hcs.LIZ(number);
        } else {
            switch (iIntValue) {
                case 1:
                    iLIZ = C445120Hcs.LIZ(20);
                    break;
                case 2:
                    iLIZ = C445120Hcs.LIZ(19);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    iLIZ = C445120Hcs.LIZ(17);
                    break;
                default:
                    iLIZ = C445120Hcs.LIZ(15);
                    break;
            }
        }
        List<Float> list2 = this.LIZIZ;
        if (list2 != null && (f = (Float) C13LP.LJJJLZIJ(iIntValue - 1, list2)) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(C418300Gai.LIZ((int) (iLIZ * fFloatValue)), c445090Hcp);
        if (this.LJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lineHeightSpan:");
            sbLIZ.append(((double) iLIZ) * 1.3d);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (Build.VERSION.SDK_INT >= 29) {
                c0gwf = new CustomSpaceDebugSpan(-65536, strLIZIZ);
            } else {
                c0gwf = new C0GWF(-65536);
            }
            listLJIILJJIL.add(c0gwf);
        }
        return listLJIILJJIL.toArray(new ParagraphStyle[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21380818lq(List<Integer> list, List<Float> list2, int i, Typeface typeface, List<? extends Typeface> list3, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = i;
        this.LIZLLL = typeface;
        this.LJ = list3;
        this.LJFF = z;
        this.LJI = z2;
    }
}
