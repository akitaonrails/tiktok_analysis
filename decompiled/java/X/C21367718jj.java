package X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21367718jj {
    public static GradientDrawable.Orientation LIZ(String str) {
        int i;
        try {
            if (str.contains("deg")) {
                i = CastIntegerProtector.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                i = CastIntegerProtector.parseInt(str);
            }
            if (i == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (i == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int LIZJ(String str) {
        return LIZIZ(-16777216, str);
    }

    public static C21367818jk LIZLLL(String str) {
        int i;
        int iIndexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf(e3.h) + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                i = 0;
            } else {
                i = 0;
                for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                    if (strSubstring.charAt(i2) == '%') {
                        i++;
                    }
                }
            }
            int iIndexOf2 = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf2);
            C21367818jk c21367818jk = new C21367818jk();
            c21367818jk.LIZ = LIZ(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf2 + 1);
            int[] iArr = new int[i];
            float[] fArr = new float[i];
            for (int i3 = 0; i3 < i; i3++) {
                int iIndexOf3 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf3 + 1).trim();
                if (strTrim.contains("rgba")) {
                    iIndexOf = strTrim.indexOf(")");
                } else {
                    iIndexOf = strTrim.indexOf(" ");
                }
                int i4 = iIndexOf + 1;
                iArr[i3] = LIZJ(strTrim.substring(0, i4).trim());
                fArr[i3] = C1050100dQu.LIZ(0.0f, strTrim.substring(i4, strTrim.indexOf("%")).trim()) / 100.0f;
                int i5 = iIndexOf3 + 2;
                if (strSubstring3.length() <= i5) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i5);
            }
            if (i < 2) {
                return null;
            }
            c21367818jk.LIZIZ = iArr;
            c21367818jk.LIZJ = fArr;
            return c21367818jk;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static int LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i2 = 1; i2 < charArray.length; i2++) {
                sb.append(charArray[i2]);
                sb.append(charArray[i2]);
            }
            return ColorProtector.parseColor(sb.toString());
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return ColorProtector.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return ColorProtector.parseColor(str);
        }
        if (!str.startsWith("rgba")) {
            return -16777216;
        }
        String[] strArrSplit = str.substring(str.indexOf(e3.h) + 1, str.indexOf(")")).split(",");
        if (strArrSplit != null && strArrSplit.length == 4) {
            float f = CastFloatProtector.parseFloat(strArrSplit[0]);
            float f2 = CastFloatProtector.parseFloat(strArrSplit[1]);
            float f3 = CastFloatProtector.parseFloat(strArrSplit[2]);
            return (((int) f) << 16) | (((int) ((CastFloatProtector.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) f2) << 8) | ((int) f3);
        }
        return i;
    }
}
