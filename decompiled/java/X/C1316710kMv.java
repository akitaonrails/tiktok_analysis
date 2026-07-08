package X;

import Y.ARunnableS79S0200000_10;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;
import com.lynx.tasm.utils.DeviceUtils;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import j27.s;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: X.0kMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316710kMv {
    public static final DecimalFormat LIZ = new DecimalFormat("###################.###########");

    public static String LIZIZ(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            return null;
        }
        switch (C1297680jsE.LIZ[interfaceC1298070jsr.getType().ordinal()]) {
        }
        return null;
    }

    public static String LJII(double d) {
        if (d < 9.223372036854776E18d && d > -9.223372036854776E18d) {
            long jFloor = (long) Math.floor(d);
            if (d == jFloor) {
                return String.valueOf(jFloor);
            }
        }
        return LIZ.format(d);
    }

    public static void LJ(Canvas canvas, Layout layout) {
        int size;
        int size2;
        boolean z;
        boolean z2;
        Spanned spanned = (Spanned) layout.getText();
        C1316930kNH[] c1316930kNHArr = (C1316930kNH[]) spanned.getSpans(0, spanned.length(), C1316930kNH.class);
        if (c1316930kNHArr != null && c1316930kNHArr.length != 0) {
            int spanStart = spanned.getSpanStart(c1316930kNHArr[0]);
            int spanEnd = spanned.getSpanEnd(c1316930kNHArr[0]);
            int textSize = (int) layout.getPaint().getTextSize();
            if (spanStart == 0) {
                for (int i = 1; i < c1316930kNHArr.length; i++) {
                    int spanStart2 = spanned.getSpanStart(c1316930kNHArr[i]);
                    int spanEnd2 = spanned.getSpanEnd(c1316930kNHArr[i]);
                    AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spanned.getSpans(spanStart2, spanEnd2, AbsoluteSizeSpan.class);
                    if (absoluteSizeSpanArr.length != 0) {
                        size2 = absoluteSizeSpanArr[0].getSize();
                    } else {
                        size2 = textSize;
                    }
                    C1316930kNH c1316930kNH = c1316930kNHArr[i];
                    LIZLLL(canvas, layout, c1316930kNH.LIZJ, c1316930kNH.LIZLLL, c1316930kNH.LIZ, c1316930kNH.LIZIZ, spanStart2, spanEnd2, size2);
                    if (spanStart2 >= spanStart && spanEnd2 <= spanEnd) {
                        C1316930kNH c1316930kNH2 = c1316930kNHArr[0];
                        LIZLLL(canvas, layout, c1316930kNH2.LIZJ, c1316930kNH2.LIZLLL, c1316930kNH2.LIZ, c1316930kNH2.LIZIZ, spanEnd2 + 1, spanEnd, textSize);
                        C1316930kNH c1316930kNH3 = c1316930kNHArr[0];
                        if (c1316930kNH3.LIZ && !c1316930kNHArr[i].LIZ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (c1316930kNH3.LIZIZ && !c1316930kNHArr[i].LIZIZ) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LIZLLL(canvas, layout, c1316930kNH3.LIZJ, c1316930kNH3.LIZLLL, z, z2, spanStart2, spanEnd2, size2);
                        spanEnd = spanStart2;
                    }
                }
                C1316930kNH c1316930kNH4 = c1316930kNHArr[0];
                LIZLLL(canvas, layout, c1316930kNH4.LIZJ, c1316930kNH4.LIZLLL, c1316930kNH4.LIZ, c1316930kNH4.LIZIZ, spanStart, spanEnd, textSize);
                return;
            }
            for (int i2 = 0; i2 < c1316930kNHArr.length; i2++) {
                int spanStart3 = spanned.getSpanStart(c1316930kNHArr[i2]);
                int spanEnd3 = spanned.getSpanEnd(c1316930kNHArr[i2]);
                AbsoluteSizeSpan[] absoluteSizeSpanArr2 = (AbsoluteSizeSpan[]) spanned.getSpans(spanStart3, spanEnd3, AbsoluteSizeSpan.class);
                if (absoluteSizeSpanArr2.length != 0) {
                    size = absoluteSizeSpanArr2[0].getSize();
                } else {
                    size = textSize;
                }
                C1316930kNH c1316930kNH5 = c1316930kNHArr[i2];
                LIZLLL(canvas, layout, c1316930kNH5.LIZJ, c1316930kNH5.LIZLLL, c1316930kNH5.LIZ, c1316930kNH5.LIZIZ, spanStart3, spanEnd3, size);
            }
        }
    }

    public static void LJI(Canvas canvas, Layout layout) {
        Spanned spanned = (Spanned) layout.getText();
        C1316790kN3[] c1316790kN3Arr = (C1316790kN3[]) spanned.getSpans(0, spanned.length(), C1316790kN3.class);
        if (c1316790kN3Arr != null && c1316790kN3Arr.length > 0) {
            for (C1316790kN3 c1316790kN3 : c1316790kN3Arr) {
                c1316790kN3.LLILZ = true;
            }
            layout.draw(canvas);
            for (C1316790kN3 c1316790kN32 : c1316790kN3Arr) {
                c1316790kN32.LLILZ = false;
            }
        }
    }

    public static TextPaint LJIIJ(float f, String str) {
        Typeface typefaceLIZLLL;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(f);
        if (!TextUtils.isEmpty(str) && (typefaceLIZLLL = C1300980jxY.LIZLLL(0, str)) != null) {
            textPaint.setTypeface(typefaceLIZLLL);
            return textPaint;
        }
        textPaint.setTypeface(DeviceUtils.LIZ());
        return textPaint;
    }

    public static TextPaint LJIIJJI(C1316720kMw c1316720kMw, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(c1316720kMw.LJIILIIL);
        if (!TextUtils.isEmpty(c1316720kMw.LJIJJ) && typeface != null) {
            textPaint.setTypeface(typeface);
        } else {
            textPaint.setTypeface(DeviceUtils.LIZ());
        }
        String strLIZJ = c1316720kMw.LIZJ();
        String str = c1316720kMw.LJJIIZ;
        int i = c1316720kMw.LJII;
        if (i != 0 || c1316720kMw.LJI != 0 || strLIZJ != null || str != null) {
            LJIILIIL(textPaint, c1316720kMw.LJIJJ, i, c1316720kMw.LJI, strLIZJ, str, c1316720kMw.LJJIII);
        }
        Integer num = c1316720kMw.LIZJ;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        float f = c1316720kMw.LJIIJJI;
        if (f != 1.0E21f) {
            textPaint.setLetterSpacing(f / textPaint.getTextSize());
        }
        C1313360kHW c1313360kHW = c1316720kMw.LJJIJIIJIL;
        if (c1313360kHW != null) {
            textPaint.setShadowLayer(c1313360kHW.LIZLLL, c1313360kHW.LIZIZ, c1313360kHW.LIZJ, c1313360kHW.LIZ);
        }
        return textPaint;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<java.lang.CharSequence> LJIIL(java.lang.CharSequence r6, boolean r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            r2 = 0
        L7:
            int r0 = r6.length()
            if (r3 >= r0) goto L87
            char r5 = r6.charAt(r3)
            r0 = 19968(0x4e00, float:2.7981E-41)
            if (r5 < r0) goto L4d
            r0 = 40869(0x9fa5, float:5.727E-41)
            if (r5 > r0) goto L4d
            java.lang.String r0 = "[一-龥][\\u3002\\uff1f\\uff01\\uff0c\\u3001\\uff1b\\uff1a\\u2018\\u2019\\u201c\\u201d\\uff08\\uff09\\u3014\\u3015\\u3010\\u3011\\u2026\\u2014\\p{Punct}]*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
        L20:
            if (r1 == 0) goto L74
            int r0 = r6.length()
            java.lang.CharSequence r0 = r6.subSequence(r3, r0)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.find()
            if (r0 == 0) goto L43
            int r0 = r1.end()
            int r3 = r3 + r0
            java.lang.CharSequence r0 = r6.subSequence(r2, r3)
            r4.add(r0)
            r2 = r3
        L41:
            r3 = r2
            goto L7
        L43:
            int r2 = r3 + 1
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            r4.add(r0)
            goto L41
        L4d:
            boolean r0 = java.lang.Character.isLetter(r5)
            if (r0 == 0) goto L5a
            java.lang.String r0 = "\\w+\\p{Punct}*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L5a:
            boolean r0 = java.lang.Character.isDigit(r5)
            if (r0 == 0) goto L67
            java.lang.String r0 = "\\d+\\.\\d+"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L67:
            boolean r0 = java.lang.Character.isSpaceChar(r5)
            if (r0 == 0) goto L74
            java.lang.String r0 = "\\s*"
            java.util.regex.Pattern r1 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            goto L20
        L74:
            boolean r0 = java.lang.Character.isHighSurrogate(r5)
            if (r0 == 0) goto L84
            int r2 = r3 + 2
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            r4.add(r0)
            goto L41
        L84:
            int r3 = r3 + 1
            goto L7
        L87:
            if (r2 == r3) goto L90
            java.lang.CharSequence r0 = r6.subSequence(r2, r3)
            r4.add(r0)
        L90:
            r1 = 1
            if (r7 == 0) goto Lae
            r0 = 0
        L94:
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2 = 0
        L9b:
            int r1 = r3.length()
            if (r2 >= r1) goto Lb4
            char r1 = r3.charAt(r2)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto Lb7
            int r2 = r2 + 1
            goto L9b
        Lae:
            int r0 = r4.size()
            int r0 = r0 - r1
            goto L94
        Lb4:
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r0)
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316710kMv.LJIIL(java.lang.CharSequence, boolean):java.util.ArrayList");
    }

    public static int LIZ(int i, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        int i2 = fontMetricsInt.top;
        int i3 = fontMetricsInt.ascent;
        int i4 = fontMetricsInt.descent;
        int i5 = i4 - i3;
        int i6 = (i - i5) / 2;
        int i7 = (i - i6) - i5;
        int i8 = fontMetricsInt.bottom;
        int i9 = i8 - i2;
        int i10 = (i - i9) / 2;
        int i11 = i3 - i6;
        fontMetricsInt.ascent = i11;
        int i12 = i4 + i7;
        fontMetricsInt.descent = i12;
        int i13 = i2 - i10;
        fontMetricsInt.top = i13;
        int i14 = i8 + ((i - i10) - i9);
        fontMetricsInt.bottom = i14;
        if (i12 < 0) {
            fontMetricsInt.ascent = i11 - i12;
            fontMetricsInt.descent = 0;
        }
        int i15 = fontMetricsInt.ascent;
        if (i15 > 0) {
            fontMetricsInt.descent -= i15;
            fontMetricsInt.ascent = 0;
        }
        if (i14 < 0) {
            fontMetricsInt.top = i13 - i14;
            fontMetricsInt.bottom = 0;
        }
        int i16 = fontMetricsInt.top;
        if (i16 > 0) {
            fontMetricsInt.bottom -= i16;
            fontMetricsInt.top = 0;
        }
        if (z) {
            return i2 - fontMetricsInt.top;
        }
        return i3 - fontMetricsInt.ascent;
    }

    public static void LIZJ(s sVar, int i, C1316780kN2 c1316780kN2) {
        Layout layout;
        int i2;
        if (sVar != null && c1316780kN2 != null && (layout = c1316780kN2.LIZJ) != null && !c1316780kN2.LJIILIIL && (i2 = c1316780kN2.LJII) > 0) {
            C1289960jfm c1289960jfmLJIIIZ = LJIIIZ(i, layout, c1316780kN2.LJIIIZ, i2, c1316780kN2.LJIIIIZZ, c1316780kN2.LJIIJ, c1316780kN2.LJIIJJI, c1316780kN2.LJIIL);
            c1316780kN2.LJIILIIL = true;
            C1289620jfE.LIZJ(new ARunnableS79S0200000_10(sVar, c1289960jfmLJIIIZ, 77));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: Exception -> 0x00fb, LOOP:2: B:23:0x007f->B:25:0x0085, LOOP_END, TryCatch #0 {Exception -> 0x00fb, blocks: (B:3:0x000b, B:5:0x0013, B:7:0x0026, B:11:0x002f, B:12:0x0047, B:14:0x004d, B:15:0x0061, B:17:0x0065, B:19:0x006b, B:23:0x007f, B:25:0x0085, B:26:0x0097, B:31:0x00c2, B:21:0x0077, B:20:0x0075, B:27:0x009a, B:29:0x00b7, B:30:0x00b9), top: B:42:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.graphics.Canvas r15, android.text.Layout r16, float r17) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316710kMv.LJFF(android.graphics.Canvas, android.text.Layout, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2 < 1.0f) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.lynx.react.bridge.JavaOnlyMap LJIIIIZZ(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r0 = 1096810496(0x41600000, float:14.0)
            r4 = 0
            float r0 = X.C1311130kDv.LIZIZ(r0, r4)
            float r3 = X.C1312920kGo.LIZ(r11, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L31
            r2 = 0
        L12:
            com.lynx.react.bridge.JavaOnlyMap r5 = new com.lynx.react.bridge.JavaOnlyMap
            r5.<init>()
            boolean r0 = r10.isEmpty()
            java.lang.String r6 = "width"
            if (r0 != 0) goto L2c
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2c
            r1 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 <= r1) goto L3a
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L43
        L2c:
            double r0 = (double) r4
            r5.putDouble(r6, r0)
            return r5
        L31:
            float r0 = X.C1311130kDv.LIZIZ(r4, r4)
            float r2 = X.C1312920kGo.LIZ(r13, r0)
            goto L12
        L3a:
            if (r9 != r1) goto L43
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L43
            r2 = 1191181824(0x46fffe00, float:32767.0)
        L43:
            android.text.TextPaint r7 = LJIIJ(r3, r12)
            com.lynx.react.bridge.JavaOnlyArray r4 = new com.lynx.react.bridge.JavaOnlyArray
            r4.<init>()
            int r3 = r10.length()
            double r0 = (double) r2
            double r0 = java.lang.Math.floor(r0)
            int r2 = (int) r0
            r8 = 0
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r10, r8, r3, r7, r2)
            r0.setMaxLines(r9)
            android.text.StaticLayout r7 = r0.build()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 0
        L65:
            int r0 = r7.getLineCount()
            if (r1 >= r0) goto L76
            float r0 = r7.getLineMax(r1)
            float r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            goto L65
        L76:
            float r3 = X.C1311130kDv.LIZJ(r2)
            int r2 = r7.getLineCount()
        L7e:
            if (r8 >= r2) goto L92
            int r1 = r7.getLineStart(r8)
            int r0 = r7.getLineEnd(r8)
            java.lang.String r0 = r10.substring(r1, r0)
            r4.add(r0)
            int r8 = r8 + 1
            goto L7e
        L92:
            double r0 = (double) r3
            r5.putDouble(r6, r0)
            java.lang.String r0 = "content"
            r5.putArray(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1316710kMv.LJIIIIZZ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.lynx.react.bridge.JavaOnlyMap");
    }

    public static void LJIILIIL(TextPaint textPaint, final String str, int i, int i2, final String str2, String str3, boolean z) {
        int style;
        Typeface typefaceCreate;
        String str4;
        int style2;
        boolean z2;
        int i3;
        boolean z3;
        Typeface typeface = textPaint.getTypeface();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            if (i2 == 1) {
                i3 = OppoPermissionPopupMaskDelayExp.DEFAULT;
            } else if (i2 == 0) {
                i3 = 400;
            } else {
                i3 = (i2 - 1) * 100;
            }
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            typefaceCreate = Typeface.create(typeface, i3, z3);
        } else {
            if (typeface == null) {
                style = 0;
            } else {
                style = typeface.getStyle();
            }
            int i5 = style | i;
            if (typeface == null) {
                typefaceCreate = Typeface.defaultFromStyle(i5);
            } else {
                typefaceCreate = Typeface.create(typeface, i5);
            }
        }
        textPaint.setTypeface(typefaceCreate);
        if (i > 0 && TextUtils.isEmpty(str)) {
            if (typefaceCreate != null) {
                style2 = typefaceCreate.getStyle();
            } else {
                style2 = 0;
            }
            int i6 = i & (~style2);
            if ((i6 & 1) != 0 && i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            textPaint.setFakeBoldText(z2);
            if ((i6 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
        }
        if (str2 != null || str3 != null) {
            final float textSize = textPaint.getTextSize();
            Object obj = new Object(textSize, str2, str) { // from class: X.00AV
                public final String LIZ;
                public final float LIZIZ;
                public final String LIZJ;

                public final int hashCode() {
                    int iHashCode = ((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31;
                    String str5 = this.LIZJ;
                    return iHashCode + (str5 != null ? str5.hashCode() : 0);
                }

                public final boolean equals(Object obj2) {
                    if (obj2 == this) {
                        return true;
                    }
                    if (!(obj2 instanceof C00AV)) {
                        return false;
                    }
                    C00AV c00av = (C00AV) obj2;
                    if (TextUtils.equals(this.LIZJ, c00av.LIZJ) && Float.compare(this.LIZIZ, c00av.LIZIZ) == 0 && TextUtils.equals(this.LIZ, c00av.LIZ)) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZ = str2 == null ? "" : str2;
                    this.LIZIZ = textSize;
                    this.LIZJ = str;
                }
            };
            C1301090jxj c1301090jxj = C1301060jxg.LIZ;
            Typeface typeface2 = c1301090jxj.LIZLLL.get(obj);
            if (typeface2 != null) {
                textPaint.setTypeface(typeface2);
            } else {
                if (str2 != null && i4 >= 26 && (i4 != 35 || C1289620jfE.LIZIZ() || (str4 = Build.BRAND) == null || str4.toLowerCase(Locale.ENGLISH).indexOf("honor") <= -1)) {
                    textPaint.setFontVariationSettings(str2);
                }
                if (z) {
                    Typeface typeface3 = textPaint.getTypeface();
                    if (typeface3 != null) {
                        c1301090jxj.LIZLLL.put((C00AV) obj, typeface3);
                    } else {
                        c1301090jxj.getClass();
                    }
                }
            }
            if (str3 != null) {
                textPaint.setFontFeatureSettings(str3);
            }
        }
    }

    public static C1289960jfm LJIIIZ(int i, Layout layout, int i2, int i3, int i4, int i5, float f, boolean z) {
        C1289960jfm c1289960jfm = new C1289960jfm(i, "layout");
        c1289960jfm.LIZIZ(Integer.valueOf(i3), "lineCount");
        if (i3 <= layout.getLineCount() && i3 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < i3; i6++) {
                HashMap map = new HashMap();
                map.put("start", Integer.valueOf(layout.getLineStart(i6)));
                map.put("end", Integer.valueOf(layout.getLineEnd(i6)));
                map.put("ellipsisCount", Integer.valueOf(layout.getEllipsisCount(i6)));
                arrayList.add(map);
            }
            HashMap map2 = (HashMap) ListProtector.get(arrayList, i3 - 1);
            int iIntValue = ((Integer) map2.get("ellipsisCount")).intValue();
            int iIntValue2 = ((Integer) map2.get("end")).intValue();
            if (i4 <= 0) {
                if (i3 >= layout.getLineCount() && i2 != 0) {
                    i4 = iIntValue;
                } else {
                    i4 = i5 - iIntValue2;
                }
            }
            map2.put("ellipsisCount", Integer.valueOf(i4));
            map2.put("end", Integer.valueOf(i5));
            c1289960jfm.LIZIZ(arrayList, "lines");
            if (z) {
                HashMap map3 = new HashMap();
                map3.put("width", Float.valueOf(C1311130kDv.LIZJ(f)));
                map3.put("height", Float.valueOf(C1311130kDv.LIZJ(layout.getLineBottom(r4))));
                c1289960jfm.LIZIZ(map3, "size");
            }
            return c1289960jfm;
        }
        LynxLog.e("TextHelper", "getTextLayoutEvent: get lineCount error");
        c1289960jfm.LIZIZ(0, "lineCount");
        return c1289960jfm;
    }

    public static void LIZLLL(Canvas canvas, Layout layout, int i, int i2, boolean z, boolean z2, int i3, int i4, int i5) {
        if (i3 < i4) {
            if (!z && !z2) {
                return;
            }
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                return;
                            }
                            float f = i5;
                            float f2 = 2.0f;
                            float f3 = f / 2.0f;
                            float f4 = f / 3.0f;
                            int lineForOffset = layout.getLineForOffset(i3);
                            int lineForOffset2 = layout.getLineForOffset(i4);
                            Paint paint = new Paint();
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setColor(i2);
                            paint.setStrokeWidth(f4 / 5.0f);
                            int i6 = lineForOffset;
                            while (i6 <= lineForOffset2) {
                                float lineLeft = layout.getLineLeft(i6);
                                float lineBaseline = layout.getLineBaseline(i6);
                                float lineMax = layout.getLineMax(i6);
                                if (i6 == lineForOffset) {
                                    lineMax = (lineLeft + lineMax) - layout.getPrimaryHorizontal(i3);
                                    lineLeft = layout.getPrimaryHorizontal(i3);
                                }
                                if (i6 == lineForOffset2) {
                                    lineMax = layout.getPrimaryHorizontal(i4) - lineLeft;
                                }
                                int iRound = Math.round(lineMax / f3);
                                if (z) {
                                    Path path = new Path();
                                    float f5 = lineBaseline + (f4 / f2);
                                    path.moveTo(lineLeft, f5);
                                    float f6 = 0.0f;
                                    for (int i7 = 0; i7 < iRound; i7++) {
                                        float f7 = f3 / 4.0f;
                                        path.quadTo(lineLeft + f7 + f6, lineBaseline, (f3 / 2.0f) + lineLeft + f6, f5);
                                        path.quadTo(lineLeft + (f7 * 3.0f) + f6, lineBaseline + f4, lineLeft + f3 + f6, f5);
                                        f6 += f3;
                                    }
                                    canvas.drawPath(path, paint);
                                }
                                if (z2) {
                                    Path path2 = new Path();
                                    float f8 = 4.0f;
                                    float f9 = lineBaseline - ((f / 15.0f) * 4.0f);
                                    path2.moveTo(lineLeft, f9);
                                    int i8 = 0;
                                    float f10 = 0.0f;
                                    while (i8 < iRound) {
                                        float f11 = f3 / f8;
                                        float f12 = f4 / 2.0f;
                                        path2.quadTo(lineLeft + f11 + f10, f9 - f12, (f3 / 2.0f) + lineLeft + f10, f9);
                                        path2.quadTo((f11 * 3.0f) + lineLeft + f10, f12 + f9, lineLeft + f3 + f10, f9);
                                        f10 += f3;
                                        i8++;
                                        f8 = 4.0f;
                                    }
                                    canvas.drawPath(path2, paint);
                                }
                                i6++;
                                f2 = 2.0f;
                            }
                            return;
                        }
                        float f13 = i5;
                        int lineForOffset3 = layout.getLineForOffset(i3);
                        int lineForOffset4 = layout.getLineForOffset(i4);
                        Paint paint2 = new Paint();
                        paint2.setColor(i2);
                        float f14 = f13 / 3.0f;
                        paint2.setStrokeWidth(f14 / 5.0f);
                        paint2.setPathEffect(new DashPathEffect(new float[]{f13 / 7.0f, f13 / 20.0f}, 0.0f));
                        for (int i9 = lineForOffset3; i9 <= lineForOffset4; i9++) {
                            float lineLeft2 = layout.getLineLeft(i9);
                            float lineBaseline2 = layout.getLineBaseline(i9);
                            float lineMax2 = layout.getLineMax(i9);
                            if (i9 == lineForOffset3) {
                                lineMax2 = (lineLeft2 + lineMax2) - layout.getPrimaryHorizontal(i3);
                                lineLeft2 = layout.getPrimaryHorizontal(i3);
                            }
                            if (i9 == lineForOffset4) {
                                lineMax2 = layout.getPrimaryHorizontal(i4) - lineLeft2;
                            }
                            if (z) {
                                float f15 = lineBaseline2 + (f14 / 3.0f);
                                canvas.drawLine(lineLeft2, f15, lineLeft2 + lineMax2, f15, paint2);
                            }
                            if (z2) {
                                float f16 = lineBaseline2 - ((f13 / 15.0f) * 4.0f);
                                canvas.drawLine(lineLeft2, f16, lineLeft2 + lineMax2, f16, paint2);
                            }
                        }
                        return;
                    }
                    float f18 = i5;
                    Paint paint3 = new Paint();
                    paint3.setColor(i2);
                    float f19 = f18 / 3.0f;
                    float f20 = f18 / 4.0f;
                    int lineForOffset5 = layout.getLineForOffset(i3);
                    int lineForOffset6 = layout.getLineForOffset(i4);
                    paint3.setStrokeWidth(f19 / 5.0f);
                    for (int i10 = lineForOffset5; i10 <= lineForOffset6; i10++) {
                        float lineLeft3 = layout.getLineLeft(i10);
                        float lineBaseline3 = layout.getLineBaseline(i10);
                        float lineMax3 = layout.getLineMax(i10);
                        if (i10 == lineForOffset5) {
                            lineMax3 = (lineLeft3 + lineMax3) - layout.getPrimaryHorizontal(i3);
                            lineLeft3 = layout.getPrimaryHorizontal(i3);
                        }
                        if (i10 == lineForOffset6) {
                            lineMax3 = layout.getPrimaryHorizontal(i4) - lineLeft3;
                        }
                        int iFloor = (int) Math.floor(lineMax3 / f20);
                        if (iFloor == 0) {
                            return;
                        }
                        if (z) {
                            float f21 = 0.0f;
                            for (int i11 = 0; i11 < iFloor + 1; i11++) {
                                canvas.drawPoint(lineLeft3 + f21, lineBaseline3 + (f19 / 3.0f), paint3);
                                f21 += f20;
                            }
                        }
                        if (z2) {
                            float f22 = lineBaseline3 - ((f18 / 15.0f) * 4.0f);
                            float f23 = 0.0f;
                            for (int i12 = 0; i12 < iFloor + 1; i12++) {
                                canvas.drawPoint(lineLeft3 + f23, f22, paint3);
                                f23 += f20;
                            }
                        }
                    }
                    return;
                }
                float f24 = i5;
                Paint paint4 = new Paint();
                paint4.setColor(i2);
                float f25 = f24 / 3.0f;
                int lineForOffset7 = layout.getLineForOffset(i3);
                int lineForOffset8 = layout.getLineForOffset(i4);
                float f26 = f25 / 5.0f;
                paint4.setStrokeWidth(f26);
                for (int i13 = lineForOffset7; i13 <= lineForOffset8; i13++) {
                    float lineLeft4 = layout.getLineLeft(i13);
                    float lineBaseline4 = layout.getLineBaseline(i13);
                    float lineMax4 = layout.getLineMax(i13);
                    if (i13 == lineForOffset7) {
                        lineMax4 = (lineLeft4 + lineMax4) - layout.getPrimaryHorizontal(i3);
                        lineLeft4 = layout.getPrimaryHorizontal(i3);
                    }
                    if (i13 == lineForOffset8) {
                        lineMax4 = layout.getPrimaryHorizontal(i4) - lineLeft4;
                    }
                    if (z) {
                        float f27 = lineBaseline4 + (f25 / 3.0f);
                        float f28 = lineLeft4 + lineMax4;
                        canvas.drawLine(lineLeft4, f27, f28, f27, paint4);
                        float f29 = lineBaseline4 + (f26 * 3.0f);
                        canvas.drawLine(lineLeft4, f29, f28, f29, paint4);
                    }
                    if (z2) {
                        float f30 = lineBaseline4 - ((f24 / 15.0f) * 4.0f);
                        float f31 = lineLeft4 + lineMax4;
                        float f32 = lineLeft4;
                        canvas.drawLine(f32, f30, f31, f30, paint4);
                        float f33 = f30 + ((f25 / 15.0f) * 4.0f);
                        canvas.drawLine(f32, f33, f31, f33, paint4);
                    }
                }
                return;
            }
            float f34 = i5;
            Paint paint5 = new Paint();
            paint5.setColor(i2);
            float f35 = f34 / 3.0f;
            paint5.setStrokeWidth(f35 / 5.0f);
            int lineForOffset9 = layout.getLineForOffset(i3);
            int lineForOffset10 = layout.getLineForOffset(i4);
            for (int i14 = lineForOffset9; i14 <= lineForOffset10; i14++) {
                float lineLeft5 = layout.getLineLeft(i14);
                float lineBaseline5 = layout.getLineBaseline(i14);
                float lineMax5 = layout.getLineMax(i14);
                if (i14 == lineForOffset9) {
                    lineMax5 = (lineLeft5 + lineMax5) - layout.getPrimaryHorizontal(i3);
                    lineLeft5 = layout.getPrimaryHorizontal(i3);
                }
                if (i14 == lineForOffset10) {
                    lineMax5 = layout.getPrimaryHorizontal(i4) - lineLeft5;
                }
                if (z) {
                    float f36 = lineBaseline5 + (f35 / 3.0f);
                    canvas.drawLine(lineLeft5, f36, lineLeft5 + lineMax5, f36, paint5);
                }
                if (z2) {
                    float f37 = lineBaseline5 - ((f34 / 15.0f) * 4.0f);
                    canvas.drawLine(lineLeft5, f37, lineLeft5 + lineMax5, f37, paint5);
                }
            }
        }
    }
}
