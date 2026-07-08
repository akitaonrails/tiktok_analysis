package X;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.1A4A, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A4A {
    public final XmlPullParser LIZ;
    public final C1776730wKt LIZIZ = new C1776730wKt();

    public C1A4A(XmlPullParser xmlPullParser) {
        this.LIZ = xmlPullParser;
    }

    public static final String LIZIZ(TypedArray typedArray, int i) {
        String strXd = C786410Ut5.Xd(typedArray, i);
        typedArray.getChangingConfigurations();
        return strXd;
    }

    public final float LIZ(TypedArray typedArray, String str, int i, float f) {
        float fLIZJ = C19KG.LIZJ(typedArray, this.LIZ, str, i, f);
        typedArray.getChangingConfigurations();
        return fLIZJ;
    }
}
