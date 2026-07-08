package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C251000y4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String str2;
        if (str.length() == 0) {
            return str;
        }
        Intrinsics.LJFF(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), e3.d);
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        while (length > 3) {
            int i = length - 3;
            arrayList.add(str.substring(i, length));
            length = i;
        }
        arrayList.add(str.substring(0, length));
        StringBuilder sb = new StringBuilder();
        for (int size = arrayList.size() - 1; size > 0; size--) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) ListProtector.get(arrayList, size));
            if (Intrinsics.LJFF(String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator()), e3.d)) {
                str2 = ",";
            } else {
                str2 = e3.d;
            }
            sbLIZ.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append((String) ListProtector.get(arrayList, 0));
        return sb.toString();
    }
}
