package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19KG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KG {
    public static boolean LJFF(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static ColorStateList LIZ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        ColorStateList colorStateListLIZ = null;
        if (!LJFF(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                colorStateListLIZ = C19P9.LIZ(resources, resources.getXml(typedArray.getResourceId(1, 0)), theme);
                return colorStateListLIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return colorStateListLIZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to resolve attribute at index ");
        sbLIZ.append(1);
        sbLIZ.append(": ");
        sbLIZ.append(typedValue);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJ(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!LJFF(xmlPullParser, str)) {
            return null;
        }
        return C786410Ut5.Xd(typedArray, i);
    }

    public static TypedArray LJI(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static C21530119Nr LIZIZ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (LJFF(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C21530119Nr(null, null, typedValue.data);
            }
            try {
                C21530119Nr c21530119NrLIZ = C21530119Nr.LIZ(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                if (c21530119NrLIZ != null) {
                    return c21530119NrLIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C21530119Nr(null, null, 0);
    }

    public static float LIZJ(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!LJFF(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int LIZLLL(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!LJFF(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }
}
