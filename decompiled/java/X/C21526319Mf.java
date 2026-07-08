package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21526319Mf implements Attributes {
    public final XmlPullParser LIZ;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.LIZ.getAttributeCount();
    }

    public C21526319Mf(XmlPullParser xmlPullParser) {
        this.LIZ = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.LIZ.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        String attributeName = this.LIZ.getAttributeName(i);
        if (this.LIZ.getAttributePrefix(i) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ.getAttributePrefix(i));
            sbLIZ.append(':');
            sbLIZ.append(attributeName);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.LIZ.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.LIZ.getAttributeValue(i);
    }
}
