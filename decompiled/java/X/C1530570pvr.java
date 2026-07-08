package X;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.0pvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530570pvr {
    public static final String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                if (sb.length() > 0 && !z) {
                    sb.append('_');
                }
                sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
                z = true;
            } else {
                sb.append(cCharAt);
                z = false;
            }
        }
        return sb.toString();
    }

    public static final long LIZIZ(C1537480q70 c1537480q70, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1537480q70.LJIIIZ().LIZJ(str, Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public static final long LIZJ(C1537480q70 c1537480q70, EnumC1537220q6a[] enumC1537220q6aArr, Long l) {
        long jCurrentTimeMillis;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (c1537480q70 != null) {
            for (EnumC1537220q6a enumC1537220q6a : enumC1537220q6aArr) {
                c1537480q70.LJIIIZ().LIZJ(enumC1537220q6a.getKey(), Long.valueOf(jCurrentTimeMillis));
                if (!enumC1537220q6a.getAlias().isEmpty()) {
                    Iterator<String> it2 = enumC1537220q6a.getAlias().iterator();
                    while (it2.hasNext()) {
                        c1537480q70.LJIIIZ().LIZJ(it2.next(), Long.valueOf(jCurrentTimeMillis));
                    }
                }
            }
        }
        return jCurrentTimeMillis;
    }

    public static final void LJ(C1537480q70 c1537480q70, String str, Object obj) {
        c1537480q70.LJIIIZ().LIZJ(str, obj);
    }

    public static final void LJFF(C1537480q70 c1537480q70, EnumC1537150q6T enumC1537150q6T, Object obj) {
        c1537480q70.LJIIIZ().LIZJ(enumC1537150q6T.getKey(), obj);
    }
}
