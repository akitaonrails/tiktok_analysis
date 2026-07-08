package X;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* JADX INFO: renamed from: X.19Nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21530119Nr {
    public final Shader LIZ;
    public final ColorStateList LIZIZ;
    public int LIZJ;

    public final boolean LIZIZ() {
        ColorStateList colorStateList;
        return this.LIZ == null && (colorStateList = this.LIZIZ) != null && colorStateList.isStateful();
    }

    public C21530119Nr(Shader shader, ColorStateList colorStateList, int i) {
        this.LIZ = shader;
        this.LIZIZ = colorStateList;
        this.LIZJ = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0163, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r9.getPositionDescription());
        r1.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21530119Nr LIZ(android.content.res.Resources r24, int r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21530119Nr.LIZ(android.content.res.Resources, int, android.content.res.Resources$Theme):X.19Nr");
    }
}
