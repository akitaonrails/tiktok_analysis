package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.19P9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19P9 {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();

    public static ColorStateList LIZ(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return LIZIZ(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList LIZIZ(android.content.res.Resources r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19P9.LIZIZ(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
