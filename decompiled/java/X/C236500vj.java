package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C236500vj {
    public static int LIZ(String str, String str2) {
        Object obj;
        Object obj2;
        int iIntValue;
        int iIntValue2;
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        for (String str3 : listLJJLIIIJILLIZJL) {
            StringBuilder sb = new StringBuilder();
            int length = str3.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str3.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(sb.toString());
            if (numLJIIJJI != null) {
                iIntValue2 = numLJIIJJI.intValue();
            } else {
                iIntValue2 = 0;
            }
            arrayList.add(Integer.valueOf(iIntValue2));
        }
        List<String> listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str2, new String[]{e3.d}, 0, 6);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
        for (String str4 : listLJJLIIIJILLIZJL2) {
            StringBuilder sb2 = new StringBuilder();
            int length2 = str4.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str4.charAt(i2);
                if (Character.isDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(sb2.toString());
            if (numLJIIJJI2 != null) {
                iIntValue = numLJIIJJI2.intValue();
            } else {
                iIntValue = 0;
            }
            arrayList2.add(Integer.valueOf(iIntValue));
        }
        int iMax = Math.max(arrayList.size(), arrayList2.size());
        for (int i3 = 0; i3 < iMax; i3++) {
            if (i3 >= 0 && i3 < arrayList.size()) {
                obj = ListProtector.get(arrayList, i3);
            } else {
                obj = 0;
            }
            int iIntValue3 = ((Number) obj).intValue();
            if (i3 >= 0 && i3 < arrayList2.size()) {
                obj2 = ListProtector.get(arrayList2, i3);
            } else {
                obj2 = 0;
            }
            int iIntValue4 = ((Number) obj2).intValue();
            if (iIntValue3 != iIntValue4) {
                return Intrinsics.LJI(iIntValue3, iIntValue4);
            }
        }
        return 0;
    }
}
