package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461740I8u {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String str, List<? extends TextExtraStruct> list) {
        int i;
        boolean z;
        if (str.length() == 0) {
            return "";
        }
        if (list != null && !list.isEmpty()) {
            boolean[] zArr = new boolean[str.length()];
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct != null && textExtraStruct.getType() == 1) {
                    int start = textExtraStruct.getStart();
                    if (start < 0) {
                        start = 0;
                    }
                    int end = textExtraStruct.getEnd();
                    int length = str.length();
                    if (end > length) {
                        end = length;
                    }
                    if (textExtraStruct.getStart() > textExtraStruct.getEnd()) {
                        start = textExtraStruct.getEnd();
                        if (start < 0) {
                            start = 0;
                        }
                        end = textExtraStruct.getStart();
                        int length2 = str.length();
                        if (end > length2) {
                            end = length2;
                        }
                    }
                    while (start < end) {
                        zArr[start] = true;
                        start++;
                    }
                    int i2 = end + 1;
                    Character chLJLLJ = C13LN.LJLLJ(i2, str);
                    if (chLJLLJ != null && chLJLLJ.charValue() == ' ') {
                        zArr[i2] = true;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            int length3 = str.length();
            for (int i3 = 0; i3 < length3; i3++) {
                if (!zArr[i3]) {
                    sb.append(str.charAt(i3));
                }
            }
            String string = sb.toString();
            int length4 = string.length() - 1;
            int i4 = 0;
            boolean z2 = false;
            while (i4 <= length4) {
                if (!z2) {
                    i = i4;
                } else {
                    i = length4;
                }
                if (Intrinsics.LJI(string.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i4++;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    length4--;
                }
            }
            return string.subSequence(i4, length4 + 1).toString();
        }
        return str;
    }
}
