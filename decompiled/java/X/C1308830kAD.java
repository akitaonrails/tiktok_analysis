package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.0kAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308830kAD {
    public static final ThreadLocal<TypedValue> LIZJ = new ThreadLocal<>();
    public final Context LIZ;
    public final C20132913q3 LIZIZ;

    public final C20131913pt LIZIZ(int i) {
        int next;
        Resources resources = this.LIZ.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        C20131713pr c20131713prLIZ = LIZ(resources, xml, attributeSetAsAttributeSet, i);
                        if (c20131713prLIZ instanceof C20131913pt) {
                            C20131913pt c20131913pt = (C20131913pt) c20131713prLIZ;
                            xml.close();
                            return c20131913pt;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Root element <");
                        sbLIZ.append(name);
                        sbLIZ.append("> did not inflate into a NavGraph");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalArgumentException(strLIZIZ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Exception inflating ");
                    sbLIZ2.append(resources.getResourceName(i));
                    sbLIZ2.append(" line ");
                    sbLIZ2.append(xml.getLineNumber());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                xml.close();
                throw th;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public C1308830kAD(Context context, C20132913q3 c20132913q3) {
        this.LIZ = context;
        this.LIZIZ = c20132913q3;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0146 A[PHI: r13
      0x0146: PHI (r13v2 X.0kA0<java.lang.Object>) = 
      (r13v1 X.0kA0<java.lang.Object>)
      (r13v3 X.0kA0<java.lang.Object>)
      (r13v4 X.0kA0<java.lang.Object>)
      (r13v5 X.0kA0<java.lang.Object>)
     binds: [B:22:0x0089, B:24:0x0091, B:26:0x009b, B:28:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1308720kA2 LIZJ(android.content.res.TypedArray r15, android.content.res.Resources r16, int r17) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308830kAD.LIZJ(android.content.res.TypedArray, android.content.res.Resources, int):X.0kA2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f2, code lost:
    
        if (r10.isEmpty() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f4, code lost:
    
        r11.LIZJ = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f6, code lost:
    
        r4.LJIILIIL(r16, r11);
        r12.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20131713pr LIZ(android.content.res.Resources r19, android.content.res.XmlResourceParser r20, android.util.AttributeSet r21, int r22) throws org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308830kAD.LIZ(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):X.13pr");
    }
}
