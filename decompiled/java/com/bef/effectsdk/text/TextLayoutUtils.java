package com.bef.effectsdk.text;

import X.C08FF;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class TextLayoutUtils {

    /* JADX INFO: renamed from: com.bef.effectsdk.text.TextLayoutUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE;
        public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        static {
            int[] iArr = new int[COLOR_TYPE.values().length];
            $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = iArr;
            try {
                iArr[COLOR_TYPE.COLOR_TYPE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[COLOR_TYPE.COLOR_TYPE_RGBA.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            int[] iArr2 = new int[BitmapType.values().length];
            $SwitchMap$com$bef$effectsdk$text$data$BitmapType = iArr2;
            try {
                iArr2[BitmapType.TEXT_BITMAP_SHAKE_ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.TEXT_BITMAP_NEON_ALPHA.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA;

        public static COLOR_TYPE valueOf(String str) {
            return (COLOR_TYPE) C08FF.LIZ(COLOR_TYPE.class, str);
        }
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int length;
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < strArrSplit.length) {
                if (!strArrSplit[i].isEmpty()) {
                    int length2 = sb.toString().length();
                    if (length2 == 0) {
                        if (strArrSplit[i].length() < 10) {
                            sb.append(strArrSplit[i]);
                        } else if (strArrSplit[i].length() == 10) {
                            arrayList.add(strArrSplit[i]);
                        } else {
                            arrayList.add(strArrSplit[i].substring(0, 10));
                            if ((strArrSplit[i].length() - 10) % 9 == 0) {
                                z = true;
                                length = (strArrSplit[i].length() - 10) / 9;
                            } else {
                                z = false;
                                length = ((strArrSplit[i].length() - 10) / 9) + 1;
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                if (i2 == 0) {
                                    if (z) {
                                        sb.append("-");
                                        sb.append(strArrSplit[i].substring(10, 19));
                                        String string = sb.toString();
                                        arrayList.add(string);
                                        sb.delete(0, string.length());
                                    } else {
                                        if (length == 1) {
                                            int length3 = strArrSplit[i].length();
                                            sb.append("-");
                                            sb.append(strArrSplit[i].substring(10, length3));
                                            break;
                                        }
                                        sb.append("-");
                                        sb.append(strArrSplit[i].substring(10, 19));
                                        String string2 = sb.toString();
                                        arrayList.add(string2);
                                        sb.delete(0, string2.length());
                                    }
                                } else {
                                    int i3 = ((i2 - 1) * 9) + 19;
                                    if (i2 < length - 1) {
                                        sb.append("-");
                                        sb.append(strArrSplit[i].substring(i3, (i2 * 9) + 19));
                                        String string3 = sb.toString();
                                        arrayList.add(string3);
                                        sb.delete(0, string3.length());
                                    } else if (z) {
                                        sb.append("-");
                                        sb.append(strArrSplit[i].substring(i3, (i2 * 9) + 19));
                                        String string4 = sb.toString();
                                        arrayList.add(string4);
                                        sb.delete(0, string4.length());
                                    } else {
                                        int length4 = strArrSplit[i].length();
                                        sb.append("-");
                                        sb.append(strArrSplit[i].substring(i3, length4));
                                    }
                                }
                                i2++;
                            }
                        }
                    } else if (sb.toString().length() + strArrSplit[i].length() + 1 <= 10) {
                        sb.append(" ");
                        sb.append(strArrSplit[i]);
                    } else {
                        arrayList.add(sb.toString());
                        sb.delete(0, length2);
                        i--;
                    }
                }
                i++;
            }
            if (sb.toString().length() != 0) {
                arrayList.add(sb.toString());
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public static String[] splitLyric(String str) {
        int i;
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.replace("\n", " ").replace("\r", " ").split(" ");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < strArrSplit.length) {
                StringBuilder sb = new StringBuilder();
                if ((i3 % 5) % 3 == 0) {
                    i = 6;
                } else {
                    i = 10;
                }
                int length = 0;
                while (i2 < strArrSplit.length && (strArrSplit[i2].length() + length + 1 <= i || length <= 3)) {
                    length += strArrSplit[i2].length() + 1;
                    int i4 = i2 + 1;
                    sb.append(strArrSplit[i2]);
                    sb.append(" ");
                    if (i4 == strArrSplit.length - 1 && strArrSplit[i4].length() < 3) {
                        sb.append(strArrSplit[i4]);
                    }
                    i2 = i4;
                }
                i3++;
                arrayList.add(sb.substring(0, sb.length() - 1));
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr != null && iArr.length >= 1) {
            return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str != null && !str.isEmpty()) {
            return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr != null && iArr.length >= 1) {
            return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str != null && !str.isEmpty()) {
            return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr != null && iArr.length >= 1) {
            return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i = AnonymousClass1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
        }
        return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr != null && iArr.length >= 1) {
            return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str != null && !str.isEmpty()) {
            return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr != null && iArr.length >= 1) {
            return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
        }
        return null;
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str != null && !str.isEmpty()) {
            return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
        }
        return null;
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        float f;
        float f2;
        float f3;
        String[] strArrSplitLyric = splitLyric(str);
        if (!TextUtils.isEmpty(str) && textLayoutParam != null) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.LEFT);
            textPaint.setAntiAlias(true);
            if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
                textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
            }
            if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
                z = true;
            } else {
                z = false;
            }
            TextBitmapResult textBitmapResult = new TextBitmapResult();
            textBitmapResult.channel = 1;
            textBitmapResult.lineCount = strArrSplitLyric.length;
            textBitmapResult.type = 0;
            textBitmapResult.charLayouts = new CharLayout[strArrSplitLyric.length];
            int[] iArr = new int[strArrSplitLyric.length];
            float f4 = 0.0f;
            for (int i = 0; i < strArrSplitLyric.length; i++) {
                String str2 = strArrSplitLyric[i];
                int i2 = 10;
                textPaint.setTextSize(10);
                for (float fMeasureText = textPaint.measureText(str2, 0, str2.length()); fMeasureText <= textLayoutParam.lineWidth; fMeasureText = textPaint.measureText(str2, 0, str2.length())) {
                    i2 += 2;
                    textPaint.setTextSize(i2);
                }
                int i3 = i2 - 2;
                iArr[i] = i3;
                textPaint.setTextSize(i3);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                if (z) {
                    f2 = fontMetrics.bottom;
                    f3 = fontMetrics.top;
                } else {
                    f2 = fontMetrics.descent;
                    f3 = fontMetrics.ascent;
                }
                f4 += f2 - f3;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f4, Bitmap.Config.ALPHA_8);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            textBitmapResult.bitmap = bitmapCreateBitmap;
            float f5 = 0.0f;
            for (int i4 = 0; i4 < strArrSplitLyric.length; i4++) {
                String str3 = strArrSplitLyric[i4];
                textPaint.setTextSize(iArr[i4]);
                Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
                StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint, canvas.getWidth()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build().draw(canvas);
                CharLayout charLayout = new CharLayout();
                if (z) {
                    float f6 = fontMetrics2.bottom;
                    float f7 = fontMetrics2.top;
                    f = f6 - f7;
                    charLayout.baseline = (f5 - f7) / f4;
                } else {
                    float f8 = fontMetrics2.descent;
                    float f9 = fontMetrics2.ascent;
                    f = f8 - f9;
                    charLayout.baseline = (f5 - f9) / f4;
                }
                charLayout.top = f5 / f4;
                f5 += f;
                charLayout.bottom = f5 / f4;
                charLayout.left = 0.0f;
                charLayout.right = 1.0f;
                textBitmapResult.charLayouts[i4] = charLayout;
                canvas.translate(0.0f, f);
            }
            return textBitmapResult;
        }
        return null;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        String[] strArrLyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f = textLayoutParam.lineWidth;
        int lineCount = 0;
        float height = 0.0f;
        for (String str2 : strArrLyricShakeSplit) {
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            lineCount += staticLayoutBuild.getLineCount();
            arrayList.add(staticLayoutBuild);
            height += staticLayoutBuild.getHeight();
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = lineCount;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[lineCount];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) height, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        textBitmapResult.bitmap = bitmapCreateBitmap;
        int i = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < strArrLyricShakeSplit.length; i2++) {
            float height2 = ((Layout) ListProtector.get(arrayList, i2)).getHeight();
            float lineCount2 = height2 / ((StaticLayout) ListProtector.get(arrayList, i2)).getLineCount();
            for (int i3 = 0; i3 < ((StaticLayout) ListProtector.get(arrayList, i2)).getLineCount(); i3++) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((Layout) ListProtector.get(arrayList, i2)).getLineWidth(i3);
                if (z) {
                    z = true;
                    charLayout.baseline = (f2 - fontMetrics.top) / height;
                } else {
                    z = false;
                    charLayout.baseline = (f2 - fontMetrics.ascent) / height;
                }
                charLayout.top = f2 / height;
                f2 += lineCount2;
                charLayout.bottom = (f2 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / height;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f - lineWidth) / f;
                } else {
                    charLayout.left = (f - lineWidth) / f;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i] = charLayout;
                i++;
            }
            ((Layout) ListProtector.get(arrayList, i2)).draw(canvas);
            canvas.translate(0.0f, height2 * ((StaticLayout) ListProtector.get(arrayList, i2)).getLineCount());
        }
        return textBitmapResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf A[PHI: r5
      0x01bf: PHI (r5v12 short) = (r5v10 short), (r5v10 short), (r5v10 short), (r5v10 short), (r5v14 short) binds: [B:42:0x0130, B:44:0x0136, B:46:0x013e, B:48:0x0146, B:50:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapAtlasUTF8(java.lang.String r27, com.bef.effectsdk.text.data.TextLayoutParam r28, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r29) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapAtlasUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r26, com.bef.effectsdk.text.data.TextLayoutParam r27, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r28) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
