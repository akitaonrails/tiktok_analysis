package X;

import android.text.Layout;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S2103000_11;
import kotlin.jvm.internal.AwS151S0101000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SFR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFR {
    public static final C0SFO LIZ = C1EE2.LIZIZ.LJJJLZIJ().getSbLogger("HashTagTruncateHandler", false, false);

    public static boolean LIZJ(C0SJL c0sjl) {
        return Intrinsics.LJFF(c0sjl.LIZLLL(), "h");
    }

    public static String LIZIZ(int i, Layout layout) {
        if (i >= layout.getLineCount()) {
            return "";
        }
        return layout.getText().subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.text.Layout] */
    public static Layout LIZ(String str, C0SJF c0sjf, Layout layout, String str2, float f, Function2 function2) {
        List list;
        C0SJJ c0sjj;
        String str3;
        List list2;
        boolean z;
        boolean z2;
        float f2;
        C0SJM c0sjm;
        String string;
        C0SJL c0sjl;
        C0SJF c0sjf2 = c0sjf;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = layout;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        while (i < ((Layout) c259800zU.element).getLineCount() - 1) {
            int lineEnd = ((Layout) c259800zU.element).getLineEnd(i);
            int lineStart = ((Layout) c259800zU.element).getLineStart(i);
            int i3 = i + 1;
            LIZ.LIZLLL(null, null, new AwS0S2103000_11(str, str2, i, c259800zU, lineStart, lineEnd, 0));
            Iterable<C0SJL<C719000SIg>> iterable = c0sjf2.LL;
            if ((iterable instanceof List) && (list2 = (List) iterable) != null) {
                int size = list2.size();
                int size2 = i2;
                while (true) {
                    if (size2 >= size) {
                        size2 = list2.size() - 1;
                        break;
                    }
                    C0SJL c0sjl2 = (C0SJL) ListProtector.get(list2, size2);
                    LIZ.LIZ(null, null, new AwS151S0101000_11(size2, (int) c0sjl2, (C0SJL<C719000SIg>) 6));
                    int i4 = c0sjl2.LLILLL;
                    if (i4 < lineEnd && c0sjl2.LLILZ > lineEnd) {
                        break;
                    }
                    if (i4 >= lineEnd) {
                        size2--;
                        break;
                    }
                    size2++;
                }
                int lineStart2 = ((Layout) c259800zU.element).getLineStart(i);
                C0SJL c0sjl3 = (C0SJL) ListProtector.get(list2, size2);
                if (LIZJ(c0sjl3) || !(!a0.LJJJIL(c0sjl3.LIZ()))) {
                    if (!LIZJ(c0sjl3) || c0sjl3.LLILZ <= lineEnd) {
                        for (int i5 = size2; -1 < i5 && ((C0SJL) ListProtector.get(list2, i5)).LLILZ >= lineStart2; i5--) {
                            if (LIZJ((C0SJL) ListProtector.get(list2, i5))) {
                                z = true;
                                break;
                            }
                            if (!a0.LJJJIL(((C0SJL) ListProtector.get(list2, i5)).LIZ())) {
                                break;
                            }
                        }
                        z = false;
                        int size3 = list2.size();
                        for (int i6 = size2 + 1; i6 < size3; i6++) {
                            if (LIZJ((C0SJL) ListProtector.get(list2, i6))) {
                                z2 = true;
                                break;
                            }
                            if (!a0.LJJJIL(((C0SJL) ListProtector.get(list2, i6)).LIZ())) {
                                break;
                            }
                        }
                        z2 = false;
                        if (!z || !z2) {
                        }
                    }
                    int i7 = size2;
                    for (int i8 = size2 - 1; -1 < i8; i8--) {
                        if (LIZJ((C0SJL) ListProtector.get(list2, i8))) {
                            i7 = i8;
                        } else if (!a0.LJJJIL(((C0SJL) ListProtector.get(list2, i8)).LIZ()) || (c0sjl = (C0SJL) C13LP.LJJJLZIJ(i8 - 1, list2)) == null || !LIZJ(c0sjl)) {
                            break;
                        }
                    }
                    int size4 = list2.size();
                    int size5 = i2;
                    while (true) {
                        if (size5 >= size4) {
                            size5 = list2.size() - 1;
                            break;
                        }
                        if (((C0SJL) ListProtector.get(list2, size5)).LLILLL >= lineStart) {
                            break;
                        }
                        size5++;
                    }
                    int iMax = Math.max(i7, size5);
                    int i9 = ((C0SJL) ListProtector.get(list2, iMax)).LLILLL;
                    int size6 = list2.size();
                    int i10 = size2;
                    for (int i11 = size2 + 1; i11 < size6 && (LIZJ((C0SJL) ListProtector.get(list2, i11)) || a0.LJJJIL(((C0SJL) ListProtector.get(list2, i11)).LIZ())); i11++) {
                        i10 = i11;
                    }
                    LIZ.LIZLLL(null, null, new C0SFI(iMax, i10, list2, i9, ((C0SJL) ListProtector.get(list2, i10)).LLILZ, size2));
                    Layout layout2 = (Layout) c259800zU.element;
                    if (i10 == list2.size() - 1) {
                        f2 = f;
                    } else {
                        f2 = 0.0f;
                    }
                    ArrayList arrayList = new ArrayList(list2.subList(0, iMax));
                    int i12 = ((C0SJL) ListProtector.get(list2, iMax)).LLILLL;
                    float primaryHorizontal = layout2.getPrimaryHorizontal(i12);
                    if (layout2.isRtlCharAt(i12)) {
                        primaryHorizontal = Math.abs(primaryHorizontal - layout2.getPrimaryHorizontal(layout2.getLineStart(i)));
                    }
                    C817403Hg c817403Hg = new C817403Hg();
                    c817403Hg.element = layout2.getWidth() - primaryHorizontal;
                    int i13 = i10 + 1;
                    List listSubList = list2.subList(iMax, i13);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listSubList) {
                        if (LIZJ((C0SJL) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((C0SJL) it2.next()).clone());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (obj2 instanceof C0SJJ) {
                            arrayList4.add(obj2);
                        }
                    }
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(42);
                    float fMeasureText = c444890HcV.measureText(" ");
                    c817403Hg.element -= f2;
                    int size7 = arrayList4.size();
                    String string2 = null;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= size7) {
                            break;
                        }
                        C0SJJ c0sjj2 = (C0SJJ) ListProtector.get(arrayList4, i14);
                        if (!arrayList.isEmpty()) {
                            int i16 = c0sjj2.LLILZ - c0sjj2.LLILLL;
                            int i17 = ((C0SJL) C13LP.LJJLIIIJJI(arrayList)).LLILZ;
                            c0sjj2.LLILLL = i17;
                            c0sjj2.LLILZ = i17 + i16;
                        }
                        arrayList.add(c0sjj2);
                        i15++;
                        String strLIZ = c0sjj2.LIZ();
                        float fMeasureText2 = c444890HcV.measureText(strLIZ);
                        C0SFO c0sfo = LIZ;
                        c0sfo.LIZ(null, null, new C1396305dJ(strLIZ, fMeasureText2, c817403Hg));
                        if (c817403Hg.element >= fMeasureText2) {
                            if (i14 < arrayList4.size() - 1) {
                                String strLIZIZ = ((C0SJJ) ListProtector.get(arrayList4, i14 + 1)).LLJ;
                                if ((strLIZIZ == null || (!u.LJIIZILJ(strLIZIZ, "…", false) && !u.LJIIZILJ(strLIZIZ, "‥", false))) && 0 == 0) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLIZIZ);
                                    sbLIZ.append((char) 8230);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                                string2 = TextUtils.ellipsize(strLIZIZ, c444890HcV, (c817403Hg.element - fMeasureText) - fMeasureText2, TextUtils.TruncateAt.END).toString();
                                if (!u.LJJIIJZLJL(string2, "#", false) || ((u.LJIIZILJ(string2, "…", false) && string2.length() <= 2) || (u.LJIIZILJ(string2, "‥", false) && string2.length() <= 2))) {
                                    String strLIZ2 = c0sjj2.LIZ();
                                    if (!u.LJIIZILJ(strLIZ2, "…", false)) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(strLIZ2);
                                        sbLIZ2.append((char) 8230);
                                        strLIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    }
                                    String string3 = TextUtils.ellipsize(strLIZ2, c444890HcV, c817403Hg.element, TextUtils.TruncateAt.END).toString();
                                    c0sjj2.LLJ = string3;
                                    c0sjj2.LLILZ = c0sjj2.LLILLL + string3.length();
                                    c817403Hg.element = -1.0f;
                                }
                                c817403Hg.element -= fMeasureText2;
                            }
                        } else {
                            if (string2 == null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strLIZ);
                                sbLIZ3.append("...");
                                string = TextUtils.ellipsize(C2188811AlT.LIZIZ(sbLIZ3), c444890HcV, c817403Hg.element, TextUtils.TruncateAt.END).toString();
                            } else {
                                string = string2;
                            }
                            c0sjj2.LLJ = string;
                            c0sjj2.LLILZ = c0sjj2.LLILLL + string.length();
                            c817403Hg.element = -1.0f;
                        }
                        if (c817403Hg.element < 0.0f) {
                            c0sfo.LIZLLL(null, null, new AwS160S1100000_11(strLIZ, c0sjj2, 8));
                            break;
                        }
                        if (i14 < arrayList4.size() - 1) {
                            i15++;
                            int i18 = c0sjj2.LLILZ;
                            arrayList.add(new C0SJO(i18, i18 + 1));
                            c817403Hg.element -= fMeasureText;
                        }
                        i14++;
                    }
                    if (i13 < list2.size()) {
                        C0SJL c0sjl4 = (C0SJL) ListProtector.get(list2, i13);
                        if (!Intrinsics.LJFF(c0sjl4.LIZLLL(), "br")) {
                            i15++;
                            arrayList.add(new C0SJI(((C0SJL) C13LP.LJJLIIIJJI(arrayList)).LLILZ, ((C0SJL) C13LP.LJJLIIIJJI(arrayList)).LLILZ + 1));
                        }
                        int i19 = ((C0SJL) C13LP.LJJLIIIJJI(arrayList)).LLILZ;
                        for (C0SJL c0sjl5 : list2.subList(i13, list2.size())) {
                            int i20 = (c0sjl5.LLILZ - c0sjl5.LLILLL) + i19;
                            c0sjl5.LLILLL = i19;
                            c0sjl5.LLILZ = i20;
                            i19 = i20;
                        }
                        arrayList.addAll(list2.subList(i13, list2.size()));
                        if ((c0sjl4 instanceof C0SJM) && (c0sjm = (C0SJM) c0sjl4) != null) {
                            c0sjm.LLJIJIL = a0.LJLJJL(c0sjm.LLJIJIL).toString();
                        }
                    }
                    c0sjf2 = new C0SJF(arrayList);
                    if (c817403Hg.element < 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c259800zU.element = function2.invoke(c0sjf2, Boolean.valueOf(z3));
                    LIZ.LIZLLL(null, null, new AwS151S0101000_11(i, (int) c259800zU, (C259800zU<Layout>) 5));
                    if (((Layout) c259800zU.element).getLineStart(i) != lineStart) {
                        i = i3 - 2;
                    } else {
                        i2 = iMax + i15;
                        i = i3;
                    }
                }
                i2 = size2 + 1;
                i = i3;
            } else {
                return (Layout) c259800zU.element;
            }
        }
        ?? r3 = (Layout) c259800zU.element;
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = r3;
        int lineCount = r3.getLineCount() - 1;
        int lineEnd2 = ((Layout) c259800zU2.element).getLineEnd(lineCount);
        int lineStart3 = ((Layout) c259800zU2.element).getLineStart(lineCount);
        LIZ.LIZLLL(null, null, new AwS0S2103000_11(str, str2, lineCount, c259800zU2, lineStart3, lineEnd2, 1));
        Iterable<C0SJL<C719000SIg>> iterable2 = c0sjf2.LL;
        if ((iterable2 instanceof List) && (list = (List) iterable2) != null) {
            int size8 = list.size() - 1;
            for (int i21 = -1; i21 < size8; i21 = -1) {
                C0SJL c0sjl6 = (C0SJL) ListProtector.get(list, size8);
                LIZ.LIZ(null, null, new AwS151S0101000_11(size8, (int) c0sjl6, (C0SJL<C719000SIg>) 7));
                if (c0sjl6.LLILLL < lineEnd2 && (!a0.LJJJIL(c0sjl6.LIZ()))) {
                    int iLJJJJI = a0.LJJJJI(r3.getText(), "…", 0, 6);
                    if (iLJJJJI == -1) {
                        return (Layout) c259800zU2.element;
                    }
                    C0SJL c0sjl7 = (C0SJL) ListProtector.get(list, size8);
                    LIZ.LIZLLL(null, null, new AwS555S0100000_11(c0sjl7, (C0SJL<C719000SIg>) 1464));
                    if (LIZJ(c0sjl7) && iLJJJJI != c0sjl7.LLILZ - 1 && (str3 = (c0sjj = (C0SJJ) c0sjl7).LLJ) != null && str3.length() > 0) {
                        String strSubstring = str3.substring(0, str3.length() - 1);
                        c0sjj.LLJ = strSubstring;
                        c0sjj.LLILZ = c0sjj.LLILLL + strSubstring.length();
                        c259800zU2.element = function2.invoke(c0sjf2, Boolean.valueOf(z3));
                    }
                    return (Layout) c259800zU2.element;
                }
                if (c0sjl6.LLILZ < lineStart3) {
                    break;
                }
                size8--;
            }
            return (Layout) c259800zU2.element;
        }
        return (Layout) c259800zU2.element;
    }
}
