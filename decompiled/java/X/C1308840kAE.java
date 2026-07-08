package X;

import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.0kAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308840kAE {
    public static AbstractC1308700kA0 LIZ(TypedValue typedValue, AbstractC1308700kA0 abstractC1308700kA0, AbstractC1308700kA0 abstractC1308700kA02, String str, String str2) throws XmlPullParserException {
        if (abstractC1308700kA0 != null) {
            if (abstractC1308700kA0 != abstractC1308700kA02) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Type is ");
                sbLIZ.append(str);
                sbLIZ.append(" but found ");
                sbLIZ.append(str2);
                sbLIZ.append(": ");
                sbLIZ.append(typedValue.data);
                throw new XmlPullParserException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return abstractC1308700kA0;
        }
        return abstractC1308700kA02;
    }
}
