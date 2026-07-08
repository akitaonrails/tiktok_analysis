package X;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.08TF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TF {
    public static final void LIZIZ(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                } else {
                    continue;
                }
            } else {
                i++;
            }
            if (i == 0) {
                return;
            }
        }
    }

    public static final String LIZ(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
