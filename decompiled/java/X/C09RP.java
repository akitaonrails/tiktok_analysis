package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09RP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RP {
    public static final void LIZIZ(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static String LIZ(List list, CharSequence charSequence, Function1 function1, int i) {
        CharSequence charSequence2;
        int i2;
        String str;
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        String str2 = "";
        if ((i & 2) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 4) == 0) {
            str2 = null;
        }
        int i3 = 0;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i3 < size) {
                Object obj = ListProtector.get(list, i3);
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i2 >= 0 && i4 > i2) {
                    break;
                }
                if (function1 != null) {
                    sb.append((CharSequence) function1.invoke(obj));
                } else if (obj != null && !(obj instanceof CharSequence)) {
                    if (obj instanceof Character) {
                        sb.append(((Character) obj).charValue());
                    } else {
                        sb.append((CharSequence) String.valueOf(obj));
                    }
                } else {
                    sb.append((CharSequence) obj);
                }
                i3++;
            } else if (i2 >= 0 && i4 > i2) {
                break;
            }
        }
        sb.append((CharSequence) str);
        sb.append((CharSequence) str2);
        return sb.toString();
    }
}
