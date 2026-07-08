package X;

import android.util.Xml;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.utils.ColorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.1DWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257181DWi {
    public C2257191DWj LIZ;
    public C1DXL LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public static C2257331DWx LJIIIIZZ(String str) throws C1324260kZ6 {
        try {
            return new C2257331DWx(ColorUtils.LIZIZ(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1324260kZ6(e.toString());
        }
    }

    public static C1DXS LJIIIZ(String str) {
        str.getClass();
        if (!str.equals("none")) {
            if (!str.equals("currentColor")) {
                try {
                    return LJIIIIZZ(str);
                } catch (C1324260kZ6 e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return C1DXR.LL;
        }
        return C2257331DWx.LLILLL;
    }

    public static float LJIIJJI(String str) throws C1324260kZ6 {
        int length = str.length();
        if (length != 0) {
            return LJIIJ(length, str);
        }
        throw new C1324260kZ6("Invalid float value (empty string)");
    }

    public static C2257141DWe LJIIL(String str) throws C1324260kZ6 {
        if (str.length() != 0) {
            int length = str.length();
            EnumC2257261DWq enumC2257261DWqValueOf = EnumC2257261DWq.px;
            int i = length - 1;
            char cCharAt = str.charAt(i);
            try {
                if (cCharAt == '%') {
                    enumC2257261DWqValueOf = EnumC2257261DWq.percent;
                } else {
                    if (str.endsWith("rpx")) {
                        enumC2257261DWqValueOf = EnumC2257261DWq.rpx;
                    } else if (str.endsWith("rem")) {
                        enumC2257261DWqValueOf = EnumC2257261DWq.rem;
                    } else {
                        if (str.endsWith("em")) {
                            enumC2257261DWqValueOf = EnumC2257261DWq.em;
                            length -= 2;
                        } else if (length > 2 && Character.isLetter(cCharAt)) {
                            i = length - 2;
                            if (Character.isLetter(str.charAt(i))) {
                                try {
                                    enumC2257261DWqValueOf = EnumC2257261DWq.valueOf(str.substring(i).toLowerCase(Locale.US));
                                } catch (IllegalArgumentException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Invalid length unit specifier: ");
                                    sbLIZ.append(str);
                                    throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        return new C2257141DWe(LJIIJ(length, str), enumC2257261DWqValueOf);
                    }
                    length -= 3;
                    return new C2257141DWe(LJIIJ(length, str), enumC2257261DWqValueOf);
                }
                return new C2257141DWe(LJIIJ(length, str), enumC2257261DWqValueOf);
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Invalid length value: ");
                sbLIZ2.append(str);
                throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ2), e2);
            }
            length = i;
        } else {
            throw new C1324260kZ6("Invalid length value (empty string)");
        }
    }

    public static C2257141DWe LJIILIIL(C2257211DWl c2257211DWl) {
        int i = c2257211DWl.LIZIZ;
        if (i <= c2257211DWl.LIZJ - 4 && c2257211DWl.LIZ.substring(i, i + 4).equals("auto")) {
            c2257211DWl.LIZIZ += 4;
            return new C2257141DWe();
        }
        return c2257211DWl.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f A[PHI: r1
      0x000f: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:3:0x0007, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Float LJIILJJIL(java.lang.String r2) {
        /*
            float r2 = LJIIJJI(r2)     // Catch: X.C1324260kZ6 -> L15
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto Lf
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L10
        Lf:
            r2 = r1
        L10:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch: X.C1324260kZ6 -> L15
            return r0
        L15:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257181DWi.LJIILJJIL(java.lang.String):java.lang.Float");
    }

    public static C1DXS LJIILL(String str) {
        if (str.startsWith("url(")) {
            int iIndexOf = str.indexOf(")");
            C1DXS c1dxsLJIIIZ = null;
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                if (strTrim2.length() > 0) {
                    c1dxsLJIIIZ = LJIIIZ(strTrim2);
                }
                return new C2257321DWw(strTrim, c1dxsLJIIIZ);
            }
            return new C2257321DWw(str.substring(4).trim(), null);
        }
        return LJIIIZ(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix LJIIZILJ(java.lang.String r19) throws X.C1324260kZ6 {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257181DWi.LJIIZILJ(java.lang.String):android.graphics.Matrix");
    }

    public final void LJIJ(InputStream inputStream) throws C1324260kZ6 {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            C21526319Mf c21526319Mf = new C21526319Mf(xmlPullParserNewPullParser);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", true);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String name = xmlPullParserNewPullParser.getName();
                            if (xmlPullParserNewPullParser.getPrefix() != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(xmlPullParserNewPullParser.getPrefix());
                                sbLIZ.append(':');
                                sbLIZ.append(name);
                                name = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            LIZIZ(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name);
                        } else {
                            continue;
                        }
                    } else {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(xmlPullParserNewPullParser.getPrefix());
                            sbLIZ2.append(':');
                            sbLIZ2.append(name2);
                            name2 = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        LJIJJ(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2, c21526319Mf);
                    }
                } else {
                    this.LIZ = new C2257191DWj();
                }
            }
        } catch (XmlPullParserException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1324260kZ6("XML parser problem", e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C1324260kZ6("unexpected error", e2);
        }
    }

    public static void LIZ(String str, Object... objArr) {
        LynxLog.d("SVGParser", C786410Ut5.j4(str, objArr));
    }

    public static void LIZJ(C1DX1 c1dx1, Attributes attributes) throws C1324260kZ6 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (!qName.equals(FollowStatusChangeMethod.PARAM_UID) && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String strTrim = attributes.getValue(i).trim();
                    if ("default".equals(strTrim)) {
                        c1dx1.LIZLLL = Boolean.FALSE;
                        return;
                    } else {
                        if ("preserve".equals(strTrim)) {
                            c1dx1.LIZLLL = Boolean.TRUE;
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid value for \"xml:space\" attribute: ");
                        sbLIZ.append(strTrim);
                        throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } else {
                c1dx1.LIZJ = attributes.getValue(i).trim();
                return;
            }
        }
    }

    public static void LIZLLL(AbstractC2257221DWm abstractC2257221DWm, C21526319Mf c21526319Mf) throws C1324260kZ6 {
        for (int i = 0; i < c21526319Mf.getLength(); i++) {
            String strTrim = c21526319Mf.getValue(i).trim();
            int iOrdinal = EnumC21458518yN.LIZJ(c21526319Mf.getLocalName(i)).ordinal();
            if (iOrdinal != 17) {
                if (iOrdinal != 18) {
                    if (iOrdinal != 20) {
                        if (iOrdinal == 39) {
                            try {
                                abstractC2257221DWm.LJIIIZ = EnumC2213311Bjt.valueOf(strTrim);
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Invalid spreadMethod attribute. \"");
                                sbLIZ.append(strTrim);
                                sbLIZ.append("\" is not a valid value.");
                                throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            continue;
                        }
                    } else if ("".equals(c21526319Mf.getURI(i)) || "http://www.w3.org/1999/xlink".equals(c21526319Mf.getURI(i))) {
                        abstractC2257221DWm.LJIIJ = strTrim;
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    abstractC2257221DWm.LJII = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(strTrim)) {
                    abstractC2257221DWm.LJII = Boolean.TRUE;
                } else {
                    throw new C1324260kZ6("Invalid value for attribute gradientUnits");
                }
            } else {
                abstractC2257221DWm.LJIIIIZZ = LJIIZILJ(strTrim);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1DX1 r11, org.xml.sax.Attributes r12) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257181DWi.LJFF(X.1DX1, org.xml.sax.Attributes):void");
    }

    public static void LJI(C1DXT c1dxt, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC21458518yN.LIZJ(attributes.getLocalName(i)) == EnumC21458518yN.transform) {
                c1dxt.LIZIZ(LJIIZILJ(attributes.getValue(i)));
            }
        }
    }

    public static void LJII(C1DXO c1dxo, C21526319Mf c21526319Mf) throws C1324260kZ6 {
        for (int i = 0; i < c21526319Mf.getLength(); i++) {
            String strTrim = c21526319Mf.getValue(i).trim();
            int iOrdinal = EnumC21458518yN.LIZJ(c21526319Mf.getLocalName(i)).ordinal();
            if (iOrdinal != 31) {
                if (iOrdinal == 56) {
                    C2257211DWl c2257211DWl = new C2257211DWl(strTrim);
                    c2257211DWl.LJIIJJI();
                    float fLIZ = C1312920kGo.LIZ(c2257211DWl.LJIIIIZZ(), 0.0f);
                    c2257211DWl.LJIIJ();
                    float fLIZ2 = C1312920kGo.LIZ(c2257211DWl.LJIIIIZZ(), 0.0f);
                    c2257211DWl.LJIIJ();
                    float fLIZ3 = C1312920kGo.LIZ(c2257211DWl.LJIIIIZZ(), 0.0f);
                    c2257211DWl.LJIIJ();
                    float fLIZ4 = C1312920kGo.LIZ(c2257211DWl.LJIIIIZZ(), 0.0f);
                    if (!Float.isNaN(fLIZ) && !Float.isNaN(fLIZ2) && !Float.isNaN(fLIZ3) && !Float.isNaN(fLIZ4)) {
                        if (fLIZ3 >= 0.0f) {
                            if (fLIZ4 >= 0.0f) {
                                c1dxo.LJIIIZ = new C2257131DWd(fLIZ, fLIZ2, fLIZ3, fLIZ4);
                            } else {
                                throw new C1324260kZ6("Invalid viewBox. height cannot be negative");
                            }
                        } else {
                            throw new C1324260kZ6("Invalid viewBox. width cannot be negative");
                        }
                    } else {
                        throw new C1324260kZ6("Invalid viewBox definition - should have four numbers");
                    }
                } else {
                    continue;
                }
            } else {
                LJIILLIIL(c1dxo, strTrim);
            }
        }
    }

    public static float LJIIJ(int i, String str) throws C1324260kZ6 {
        float fLIZ = new C1DXI().LIZ(0, i, str);
        if (!Float.isNaN(fLIZ)) {
            return fLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid float value: ");
        sbLIZ.append(str);
        throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILLIIL(C1DXJ c1dxj, String str) throws C1324260kZ6 {
        EnumC2249811D3z enumC2249811D3z;
        C2257211DWl c2257211DWl = new C2257211DWl(str);
        c2257211DWl.LJIIJJI();
        String strLJIIIIZZ = c2257211DWl.LJIIIIZZ();
        if ("defer".equals(strLJIIIIZZ)) {
            c2257211DWl.LJIIJJI();
            strLJIIIIZZ = c2257211DWl.LJIIIIZZ();
        }
        EnumC2257241DWo enumC2257241DWo = (EnumC2257241DWo) ((HashMap) C2257251DWp.LIZ).get(strLJIIIIZZ);
        c2257211DWl.LJIIJJI();
        if (!c2257211DWl.LJ()) {
            String strLJIIIIZZ2 = c2257211DWl.LJIIIIZZ();
            strLJIIIIZZ2.getClass();
            if (!strLJIIIIZZ2.equals("meet")) {
                if (strLJIIIIZZ2.equals("slice")) {
                    enumC2249811D3z = EnumC2249811D3z.slice;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid preserveAspectRatio definition: ");
                    sbLIZ.append(str);
                    throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                enumC2249811D3z = EnumC2249811D3z.meet;
            }
        } else {
            enumC2249811D3z = null;
        }
        c1dxj.LJIIIIZZ = new C2255571DQd(enumC2257241DWo, enumC2249811D3z);
    }

    public static void LJ(C1DXK c1dxk, C21526319Mf c21526319Mf, String str) throws C1324260kZ6 {
        for (int i = 0; i < c21526319Mf.getLength(); i++) {
            if (EnumC21458518yN.LIZJ(c21526319Mf.getLocalName(i)) == EnumC21458518yN.points) {
                C2257211DWl c2257211DWl = new C2257211DWl(c21526319Mf.getValue(i));
                ArrayList arrayList = new ArrayList();
                c2257211DWl.LJIIJJI();
                while (!c2257211DWl.LJ()) {
                    float fLJI = c2257211DWl.LJI();
                    if (!Float.isNaN(fLJI)) {
                        c2257211DWl.LJIIJ();
                        float fLJI2 = c2257211DWl.LJI();
                        if (!Float.isNaN(fLJI2)) {
                            c2257211DWl.LJIIJ();
                            arrayList.add(Float.valueOf(fLJI));
                            arrayList.add(Float.valueOf(fLJI2));
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Invalid <");
                            sbLIZ.append(str);
                            sbLIZ.append("> points attribute. There should be an even number of coordinates.");
                            throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Invalid <");
                        sbLIZ2.append(str);
                        sbLIZ2.append("> points attribute. Non-coordinate content found in list.");
                        throw new C1324260kZ6(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                c1dxk.LJIIIIZZ = new float[arrayList.size()];
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    c1dxk.LJIIIIZZ[i2] = ((Float) it2.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C2257201DWk r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257181DWi.LJIJI(X.1DWk, java.lang.String, java.lang.String):void");
    }

    public final void LIZIZ(String str, String str2, String str3) throws C1324260kZ6 {
        if (this.LIZJ) {
            int i = this.LIZLLL - 1;
            this.LIZLLL = i;
            if (i == 0) {
                this.LIZJ = false;
                return;
            }
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
            return;
        }
        if (str2.length() <= 0) {
            str2 = str3;
        }
        C1CPD c1cpd = (C1CPD) ((HashMap) C1CPD.LLILLJJLI).get(str2);
        if (c1cpd == null) {
            c1cpd = C1CPD.UNSUPPORTED;
        }
        int iOrdinal = c1cpd.ordinal();
        if (iOrdinal != 0 && iOrdinal != 8 && iOrdinal != 10 && iOrdinal != 13 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 5 && iOrdinal != 6) {
            switch (iOrdinal) {
                case 15:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    break;
                default:
                    return;
            }
        }
        Object obj = this.LIZIZ;
        if (obj != null) {
            this.LIZIZ = ((C1DXF) obj).LIZIZ;
            return;
        }
        throw new C1324260kZ6(C786410Ut5.j4("Unbalanced end element </%s> found", new Object[]{str2}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:510:0x009e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x021c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x03bf, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0810, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0a78, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:314:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x04cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r28, java.lang.String r29, java.lang.String r30, X.C21526319Mf r31) throws X.C1324260kZ6 {
        /*
            Method dump skipped, instruction units count: 2958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257181DWi.LJIJJ(java.lang.String, java.lang.String, java.lang.String, X.19Mf):void");
    }
}
