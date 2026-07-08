package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749400vco {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    public static int LIZIZ(boolean z) {
        if (z) {
            return (int) (((double) (C1743690vTb.LIZIZ() - C1749350vcj.LLJILJIL)) * 0.277d);
        }
        return ((C1743690vTb.LIZIZ() - (C1749350vcj.LLJILJIL * 2)) - (C1749350vcj.LLJIJIL * 2)) / 3;
    }

    public static boolean LIZ(int i, boolean z) {
        if (z) {
            if (i % 2 == 0) {
                return true;
            }
            return false;
        }
        if (i < 3) {
            return true;
        }
        return false;
    }

    public static C20510715Np LIZJ(List list, boolean z) {
        int iMax;
        int iLIZIZ;
        Integer numLIZ;
        int iIntValue;
        int iLIZIZ2;
        ECRichText eCRichText;
        float fMeasureText;
        int i;
        Set<String> setKeySet;
        String str;
        String strLJJIFFI;
        ECRichTextAttribute eCRichTextAttribute;
        IconAttribute iconAttribute;
        Size size;
        Integer num;
        ECRichText eCRichText2;
        TextAttribute textAttribute;
        Font font;
        int iLIZIZ3 = LIZIZ(z);
        int i2 = iLIZIZ3 - (LIZ * 2);
        C1749410vcp c1749410vcp = new C1749410vcp(z);
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                SalePropTag salePropTag = ((SalePropValue) it2.next()).salePropTag;
                if (salePropTag != null && salePropTag.description != null) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        SalePropValue salePropValue = (SalePropValue) C13LP.LJJJLZIJ(i3, list);
        if (salePropValue != null) {
            SalePropTag salePropTag2 = salePropValue.salePropTag;
            if (salePropTag2 != null && (eCRichText2 = salePropTag2.description) != null && (textAttribute = eCRichText2.textAttribute) != null && (font = textAttribute.font) != null) {
                numLIZ = font.LIZ();
            } else {
                numLIZ = null;
            }
            C444890HcV c444890HcV = new C444890HcV();
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 71;
            }
            c444890HcV.LIZ(iIntValue);
            c1749410vcp.LJ = i3;
            c1749410vcp.LIZLLL = LIZ(i3, c1749410vcp.LIZ);
            SalePropTag salePropTag3 = salePropValue.salePropTag;
            if (salePropTag3 != null && (eCRichText = salePropTag3.description) != null) {
                Map<String, ECRichTextAttribute> map = eCRichText.arguments;
                if (map != null && (setKeySet = map.keySet()) != null && (str = (String) C13LP.LJJJJZ(setKeySet)) != null && !a0.LJJJIL(str)) {
                    Map<String, ECRichTextAttribute> map2 = eCRichText.arguments;
                    if (map2 != null && (eCRichTextAttribute = map2.get(str)) != null && (iconAttribute = eCRichTextAttribute.iconAttribute) != null && (size = iconAttribute.size) != null && (num = size.width) != null) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
                    } else {
                        iLIZIZ2 = 0;
                    }
                    String str2 = eCRichText.template;
                    if (str2 != null) {
                        strLJJIFFI = u.LJJIFFI(str2, str, "", false);
                    } else {
                        strLJJIFFI = null;
                    }
                    fMeasureText = c444890HcV.measureText(strLJJIFFI) + iLIZIZ2;
                } else {
                    fMeasureText = c444890HcV.measureText(eCRichText.template);
                    iLIZIZ2 = 0;
                }
                if (fMeasureText > i2) {
                    i = 2;
                } else {
                    i = 1;
                }
                c1749410vcp.LJI = i;
            } else {
                iLIZIZ2 = 0;
            }
            int iMax2 = Math.max(iLIZIZ2, ((int) (c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent)) + 1);
            c444890HcV.LIZ(61);
            String str3 = salePropValue.propValue;
            if (str3 == null) {
                str3 = "";
            }
            if (c444890HcV.measureText(str3) > i2 && c1749410vcp.LJI == 1) {
                c1749410vcp.LJFF = 2;
            } else {
                c1749410vcp.LJFF = 1;
            }
            int i4 = ((int) (c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent)) + 1;
            int i5 = c1749410vcp.LJFF;
            int i6 = i4 * i5;
            c1749410vcp.LJII = i6;
            int i7 = c1749410vcp.LJI;
            int i8 = iMax2 * i7;
            c1749410vcp.LJIIIIZZ = i8;
            c1749410vcp.LJIIIZ = i6 + i8 + LIZIZ;
            c1749410vcp.LJIIJ = i5 + i7;
        }
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(61);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (Object obj : list) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                if (LIZ(i9, c1749410vcp.LIZ)) {
                    arrayList.add(obj);
                }
                i9 = i10;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                if (!LIZ(i11, c1749410vcp.LIZ)) {
                    arrayList2.add(obj2);
                }
                i11 = i12;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it3 = arrayList.iterator();
        int i13 = 1;
        while (it3.hasNext()) {
            String str4 = ((SalePropValue) it3.next()).propValue;
            if (str4 == null) {
                str4 = "";
            }
            if (c444890HcV2.measureText(str4) > i2) {
                i13 = 2;
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i14 = 1;
        while (it4.hasNext()) {
            String str5 = ((SalePropValue) it4.next()).propValue;
            if (str5 == null) {
                str5 = "";
            }
            if (c444890HcV2.measureText(str5) > i2) {
                i14 = 2;
            }
        }
        c1749410vcp.LJIIJJI = i13;
        c1749410vcp.LJIIL = i14;
        int i15 = ((int) (c444890HcV2.getFontMetrics().descent - c444890HcV2.getFontMetrics().ascent)) + 1;
        int iMax3 = Math.max(c1749410vcp.LJIIIZ, c1749410vcp.LJIIJ * i15);
        if (c1749410vcp.LJ != -1) {
            if (c1749410vcp.LIZLLL) {
                c1749410vcp.LJIIJJI = Math.max(i13, c1749410vcp.LJIIJ);
                c1749410vcp.LIZJ = iMax3;
                c1749410vcp.LIZIZ = i15 * i14;
            } else {
                c1749410vcp.LJIIL = Math.max(i14, c1749410vcp.LJIIJ);
                c1749410vcp.LIZIZ = iMax3;
                c1749410vcp.LIZJ = i15 * i13;
            }
        } else {
            c1749410vcp.LIZIZ = i14 * i15;
            c1749410vcp.LIZJ = i15 * i13;
        }
        if (list.size() <= 3) {
            iMax = Math.max(c1749410vcp.LIZJ, c1749410vcp.LIZIZ) + C1749350vcj.LLJILJILJ + iLIZIZ3;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iMax = c1749410vcp.LIZJ + c1749410vcp.LIZIZ + ((C1749350vcj.LLJILJILJ + iLIZIZ3) * 2) + C1749350vcj.LLJIJIL;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        int i16 = iMax + iLIZIZ;
        int i17 = c1749410vcp.LIZJ;
        int i18 = C1749350vcj.LLJILJILJ;
        int i19 = c1749410vcp.LIZIZ;
        return new C20510715Np(z, iLIZIZ3, i2, i16, i17 + iLIZIZ3 + i18, i19 + iLIZIZ3 + i18, i19, i17, c1749410vcp.LJ, c1749410vcp.LJFF, c1749410vcp.LJI, c1749410vcp.LJII, c1749410vcp.LJIIIIZZ, c1749410vcp.LJIIJJI, c1749410vcp.LJIIL);
    }
}
