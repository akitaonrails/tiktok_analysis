package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0kLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315900kLc extends AbstractC1291220jho {
    public Bitmap.Config mBitmapConfig;
    public float[] mBorderRadii;
    public C592490NLr mCacheKey;
    public String[] mCapInsets;
    public float mCapInsetsScale;
    public int mHeight;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public InterfaceC1320380kSq mScaleType;
    public int mWidth;

    private void adjustPaddings() {
        int i = this.mPaddingLeft;
        int i2 = this.mPaddingRight;
        int i3 = i + i2;
        int i4 = this.mWidth;
        if (i3 > i4 && i4 > 0) {
            float f = i4 / (i + i2);
            this.mPaddingLeft = (int) (i * f);
            this.mPaddingRight = (int) (i2 * f);
        }
        int i5 = this.mPaddingTop;
        int i6 = this.mPaddingBottom;
        int i7 = i5 + i6;
        int i8 = this.mHeight;
        if (i7 <= i8 || i8 <= 0) {
            return;
        }
        float f2 = i8 / (i5 + i6);
        this.mPaddingTop = (int) (i5 * f2);
        this.mPaddingBottom = (int) (i6 * f2);
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public InterfaceC1324680kZm getPostprocessorCacheKey() {
        return this.mCacheKey;
    }

    private float ceil(float f) {
        return (float) Math.ceil(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] getCapInsetsArr(java.lang.String r10) {
        /*
            r9 = 0
            if (r10 == 0) goto L7e
            java.lang.String r0 = ""
            boolean r0 = r10.equalsIgnoreCase(r0)
            if (r0 != 0) goto L7e
            java.lang.String r0 = " "
            java.lang.String[] r7 = r10.split(r0)
            int r0 = r7.length
            r6 = 4
            if (r0 > r6) goto L7e
            r5 = 1
            r4 = 0
            r8 = 1
            r3 = 0
        L19:
            int r0 = r7.length
            int r0 = java.lang.Math.min(r0, r6)
            if (r3 >= r0) goto L7b
            r0 = r7[r3]
            java.lang.String r2 = "px"
            boolean r0 = r0.endsWith(r2)
            java.lang.String r1 = "%"
            if (r0 != 0) goto L38
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r1)
            if (r0 != 0) goto L38
        L34:
            r8 = 0
        L35:
            int r3 = r3 + 1
            goto L19
        L38:
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r2)
            java.lang.String r2 = "[+]?[0-9]*\\.?[0-9]+"
            if (r0 == 0) goto L5b
            r0 = r7[r3]
            int r0 = r0.length()
            r8 = 2
            if (r0 <= r8) goto L34
            r1 = r7[r3]
            int r0 = r1.length()
            int r0 = r0 - r8
            java.lang.String r0 = r1.substring(r4, r0)
            boolean r8 = r0.matches(r2)
            goto L35
        L5b:
            r0 = r7[r3]
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L35
            r0 = r7[r3]
            int r0 = r0.length()
            if (r0 <= r5) goto L34
            r1 = r7[r3]
            int r0 = r1.length()
            int r0 = r0 - r5
            java.lang.String r0 = r1.substring(r4, r0)
            boolean r8 = r0.matches(r2)
            goto L35
        L7b:
            if (r8 == 0) goto L7e
            return r7
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315900kLc.getCapInsetsArr(java.lang.String):java.lang.String[]");
    }

    public static float getCapInsetsScale(String str) {
        float f = 1.0f;
        if (str != null && !str.equalsIgnoreCase("")) {
            try {
                f = CastFloatProtector.parseFloat(str);
                return f;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initCapInsetsScale error ");
                sbLIZ.append(th.getMessage());
                LynxLog.w("BaseRoundedCornerPostprocessor", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return f;
    }

    public static InterfaceC1316000kLm getScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        C1316090kLv c1316090kLv = InterfaceC1316000kLm.LIZ;
        if (interfaceC1320380kSq != InterfaceC1320380kSq.LIZ) {
            if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZJ) {
                return InterfaceC1316000kLm.LIZIZ;
            }
            if (interfaceC1320380kSq == InterfaceC1320380kSq.LJI) {
                return InterfaceC1316000kLm.LIZLLL;
            }
            if (interfaceC1320380kSq != InterfaceC1320380kSq.LJ) {
                return c1316090kLv;
            }
            return InterfaceC1316000kLm.LIZJ;
        }
        return c1316090kLv;
    }

    private void initCapInsets(String str) {
        this.mCapInsets = getCapInsetsArr(str);
    }

    private void initCapInsetsScale(String str) {
        this.mCapInsetsScale = getCapInsetsScale(str);
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        C1323050kX9<Bitmap> c1323050kX9LJFF;
        Bitmap.Config config = this.mBitmapConfig;
        if (config == null) {
            config = bitmap.getConfig();
        }
        try {
            int i = this.mWidth;
            int i2 = this.mHeight;
            if (config == null) {
                config = AbstractC1291220jho.FALLBACK_BITMAP_CONFIGURATION;
            }
            c1323050kX9LJFF = abstractC1301670jyf.LJFF(i, i2, config);
            try {
                if (this.mCapInsets != null) {
                    LynxLog.i("Lynx Image Processor", "process image from Fresco with cap-insets");
                    transformWithCapInsets(c1323050kX9LJFF.get(), bitmap);
                } else {
                    LynxLog.i("Lynx Image Processor", "process image from Fresco without cap-insets");
                    transform(c1323050kX9LJFF.get(), bitmap);
                }
                C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
                C1323050kX9.LJII(c1323050kX9LJFF);
                return c1323050kX9LJFF2;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("process image error ");
                    sbLIZ.append(th.getMessage());
                    LynxLog.e("BaseRoundedCornerPostprocessor", C2188811AlT.LIZIZ(sbLIZ));
                    if (c1323050kX9LJFF != null) {
                        C1323050kX9.LJII(c1323050kX9LJFF);
                    }
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (c1323050kX9LJFF != null) {
                        C1323050kX9.LJII(c1323050kX9LJFF);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c1323050kX9LJFF = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transform(android.graphics.Bitmap r27, android.graphics.Bitmap r28) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315900kLc.transform(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x013f, code lost:
    
        r14 = r14 * r18;
        r12 = r12 + ((r10 - r14) / 2.0f);
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0274, code lost:
    
        if (r19 > r18) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0276, code lost:
    
        r13 = r13 * r19;
        r11 = r11 + ((r9 - r13) / 2.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x013d, code lost:
    
        if (r19 > r18) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transformWithCapInsets(android.graphics.Bitmap r37, android.graphics.Bitmap r38) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315900kLc.transformWithCapInsets(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    public static float[] getFloatCapInsetsArr(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length <= 4) {
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (strArr[i3].endsWith("px")) {
                    String str = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str.substring(0, str.length() - 2));
                } else if (strArr[i3].endsWith("%")) {
                    if (i3 != 0 && i3 != 2) {
                        String str2 = strArr[i3];
                        fArr[i3] = CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 2)) * i;
                    } else {
                        String str3 = strArr[i3];
                        fArr[i3] = CastFloatProtector.parseFloat(str3.substring(0, str3.length() - 2)) * i2;
                    }
                }
            }
            return fArr;
        }
        return null;
    }

    private Canvas getInitCanvas(Bitmap bitmap, int i, int i2) {
        Canvas canvas = new Canvas(bitmap);
        canvas.clipRect(this.mPaddingLeft, this.mPaddingTop, i - this.mPaddingRight, i2 - this.mPaddingBottom);
        canvas.drawARGB(0, 0, 0, 0);
        return canvas;
    }

    public void updateCacheKey(String str, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq, boolean z) {
        StringBuilder sb = new StringBuilder("");
        if (!z) {
            sb.append(str);
        }
        sb.append(interfaceC1320380kSq);
        if (fArr != null) {
            for (float f : fArr) {
                sb.append(f);
            }
        }
        sb.append(this.mPaddingBottom);
        sb.append(this.mPaddingTop);
        sb.append(this.mPaddingLeft);
        sb.append(this.mPaddingRight);
        sb.append(this.mScaleType);
        String[] strArr = this.mCapInsets;
        if (strArr != null) {
            sb.append(strArr);
            sb.append(this.mCapInsetsScale);
        }
        sb.append(this.mBitmapConfig);
        this.mCacheKey = new C592490NLr(sb.toString());
    }

    public static Matrix getMatrix(int i, int i2, int i3, int i4, InterfaceC1320380kSq interfaceC1320380kSq) {
        return C1315910kLd.LJ(i, i2, i3, i4, getScaleType(interfaceC1320380kSq));
    }

    public static boolean customDraw(int i, int i2, int i3, int i4, InterfaceC1320380kSq interfaceC1320380kSq, String str, String str2, Canvas canvas, Bitmap bitmap) {
        return C1315910kLd.LIZ(i, i2, i3, i4, getScaleType(interfaceC1320380kSq), str, str2, canvas, bitmap);
    }

    public C1315900kLc(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq, String str2, String str3, Bitmap.Config config) {
        this(str, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq, str2, str3, config, false);
    }

    public C1315900kLc(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq, String str2, String str3, Bitmap.Config config, boolean z) {
        this.mScaleType = interfaceC1320380kSq;
        this.mWidth = i;
        this.mHeight = i2;
        this.mPaddingLeft = i3;
        this.mPaddingTop = i4;
        this.mPaddingRight = i5;
        this.mPaddingBottom = i6;
        this.mBorderRadii = fArr;
        initCapInsets(str2);
        initCapInsetsScale(str3);
        this.mBitmapConfig = config;
        updateCacheKey(str, fArr, interfaceC1320380kSq, z);
        adjustPaddings();
    }
}
