package X;

import Y.ARunnableS28S0400000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0kOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317680kOU {
    public static final int LJFF = Math.min(3379, 3379);
    public static final int LJI = Math.min(3379, 3379);
    public final InterfaceC1317720kOY LIZ;
    public C1317700kOW LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public int LIZLLL;
    public boolean LJ;

    public final void LIZJ() {
        C1317700kOW c1317700kOW = this.LIZIZ;
        if (c1317700kOW != null) {
            c1317700kOW.LIZ();
        }
        this.LIZIZ = null;
    }

    public static void LIZIZ(C1325260kai c1325260kai) {
        if (c1325260kai != null) {
            try {
                c1325260kai.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Point LJFF(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), LJFF), Math.min(canvas.getMaximumBitmapHeight(), LJI));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1317700kOW LJIIIZ(X.C1317710kOX r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L7d
            java.lang.String r0 = r7.LJFF
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7d
            java.lang.Class<?> r0 = X.C1322200kVm.LIZ
            X.0kfL r0 = X.C1328130kfL.LJIILIIL()
            X.0kdO r2 = r0.LJIILL()
            X.0NLr r1 = new X.0NLr
            java.lang.String r0 = r7.LJFF
            r1.<init>(r0)
            X.0kOZ r2 = r2.LJIIJ(r1)
            X.0krc r2 = (X.C1335740krc) r2
            r4 = 0
            if (r2 == 0) goto L29
            java.io.File r0 = r2.LIZ
            if (r0 != 0) goto L44
        L29:
            boolean r0 = r6.LJ
            if (r0 == 0) goto L7d
            java.lang.String r1 = r7.LJFF
            java.lang.String r0 = "://"
            int r0 = r1.indexOf(r0)
            java.lang.String r1 = r7.LJFF
            if (r0 <= 0) goto L42
            int r0 = r0 + 3
        L3b:
            java.lang.String r0 = r1.substring(r0)
            if (r0 != 0) goto L4a
            goto L44
        L42:
            r0 = 0
            goto L3b
        L44:
            java.io.File r0 = r2.LIZ     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L79
        L4a:
            android.graphics.BitmapRegionDecoder r3 = android.graphics.BitmapRegionDecoder.newInstance(r0, r4)     // Catch: java.lang.Throwable -> L79
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            int r0 = r3.getWidth()     // Catch: java.lang.Throwable -> L79
            float r1 = (float) r0     // Catch: java.lang.Throwable -> L79
            int r0 = r3.getHeight()     // Catch: java.lang.Throwable -> L79
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L79
            X.0kOW r1 = r6.LJI(r7, r1, r0)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L75
            int r0 = r1.LIZ     // Catch: java.lang.Throwable -> L79
            r2.inSampleSize = r0     // Catch: java.lang.Throwable -> L79
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L79
            r2.inPreferredConfig = r0     // Catch: java.lang.Throwable -> L79
            android.graphics.Rect r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L79
            android.graphics.Bitmap r0 = r3.decodeRegion(r0, r2)     // Catch: java.lang.Throwable -> L79
            r1.LIZLLL = r0     // Catch: java.lang.Throwable -> L79
            r1.LJ = r4     // Catch: java.lang.Throwable -> L79
        L75:
            r3.recycle()     // Catch: java.lang.Throwable -> L79
            return r1
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1317680kOU.LJIIIZ(X.0kOX):X.0kOW");
    }

    public final void LJIIJJI(C1317700kOW c1317700kOW) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (c1317700kOW != null && (bitmap = c1317700kOW.LIZLLL) != null && !bitmap.isRecycled()) {
            if (c1317700kOW.LJFF.LIZ != this.LIZLLL) {
                c1317700kOW.LIZ();
                return;
            }
            C1317700kOW c1317700kOW2 = this.LIZIZ;
            if (c1317700kOW2 == null || (bitmap2 = c1317700kOW2.LIZLLL) == null || (bitmap2.getWidth() < c1317700kOW.LIZLLL.getWidth() && this.LIZIZ.LIZLLL.getHeight() < c1317700kOW.LIZLLL.getHeight())) {
                LIZJ();
                this.LIZIZ = c1317700kOW;
                InterfaceC1317720kOY interfaceC1317720kOY = this.LIZ;
                if (interfaceC1317720kOY != null) {
                    interfaceC1317720kOY.LIZJ();
                }
            }
        }
    }

    public C1317680kOU(InterfaceC1317720kOY interfaceC1317720kOY, int i) {
        this.LIZ = interfaceC1317720kOY;
        this.LIZLLL = i;
    }

    public final void LJ(Canvas canvas, C1317700kOW c1317700kOW) {
        Bitmap bitmap;
        if (c1317700kOW != null && (bitmap = c1317700kOW.LIZLLL) != null && !bitmap.isRecycled()) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            C1317710kOX c1317710kOX = c1317700kOW.LJFF;
            if (c1317710kOX.LJ == InterfaceC1320380kSq.LIZJ && c1317710kOX.LIZLLL) {
                Bitmap bitmap2 = this.LIZIZ.LIZLLL;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                Matrix matrix = new Matrix();
                float fMin = Math.min((canvas.getWidth() * 1.0f) / this.LIZIZ.LIZLLL.getWidth(), (canvas.getHeight() * 1.0f) / this.LIZIZ.LIZLLL.getHeight());
                matrix.postScale(fMin, fMin);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                canvas.drawRect(new Rect(0, 0, canvas.getWidth(), canvas.getHeight()), paint);
                return;
            }
            Matrix matrix2 = new Matrix();
            Rect rect = this.LIZIZ.LIZJ;
            matrix2.preTranslate(rect.left, rect.top);
            C1317700kOW c1317700kOW2 = this.LIZIZ;
            if (c1317700kOW2.LJ) {
                Rect rect2 = c1317700kOW2.LIZJ;
                Rect rect3 = c1317700kOW2.LIZIZ;
                matrix2.postScale(((rect2.right - rect2.left) * 1.0f) / (rect3.right - rect3.left), ((rect2.bottom - rect2.top) * 1.0f) / (rect3.bottom - rect3.top));
                canvas.drawBitmap(this.LIZIZ.LIZLLL, matrix2, paint);
                return;
            }
            Rect rect4 = c1317700kOW2.LIZJ;
            float width = ((rect4.right - rect4.left) * 1.0f) / c1317700kOW2.LIZLLL.getWidth();
            Rect rect5 = this.LIZIZ.LIZJ;
            matrix2.postScale(width, ((rect5.bottom - rect5.top) * 1.0f) / r2.LIZLLL.getHeight());
            canvas.drawBitmap(this.LIZIZ.LIZLLL, matrix2, paint);
        }
    }

    public final C1317700kOW LJIIIIZZ(Context context, C1317710kOX c1317710kOX) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(c1317710kOX.LJFF.substring(9));
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpen, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            C1317700kOW c1317700kOWLJI = LJI(c1317710kOX, bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight());
            if (c1317700kOWLJI != null) {
                options.inSampleSize = c1317700kOWLJI.LIZ;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                c1317700kOWLJI.LIZLLL = bitmapRegionDecoderNewInstance.decodeRegion(c1317700kOWLJI.LIZIZ, options);
                c1317700kOWLJI.LJ = false;
            }
            bitmapRegionDecoderNewInstance.recycle();
            inputStreamOpen.close();
            return c1317700kOWLJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadBitmapFromAssetSync error: ");
            sbLIZ.append(th.getMessage());
            LynxLog.e("LynxImageHelper", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final void LJIIJ(Context context, final C1317710kOX c1317710kOX) {
        if (c1317710kOX != null && !TextUtils.isEmpty(c1317710kOX.LJFF)) {
            LynxLog.d("LynxImageHelper", "loadBitmapFromRemote");
            Uri uri = UriProtector.parse(c1317710kOX.LJFF);
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            C1315790kLR.LIZ(c1325700kbQLIZLLL);
            c1325540kbALIZ.LJIIIIZZ(c1325700kbQLIZLLL.LIZ(), context).LIZJ(new C0HWE<C1323050kX9<InterfaceC1327060kdc>>() { // from class: X.0kOV
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
                    C1317710kOX c1317710kOX2;
                    Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                    if (thLIZLLL != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadBitmapFromRemote failed: ");
                        sbLIZ.append(thLIZLLL.toString());
                        LynxLog.e("LynxImageHelper", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1317680kOU c1317680kOU = this.LIZIZ;
                    if (c1317680kOU.LIZ != null) {
                        C1317700kOW c1317700kOW = c1317680kOU.LIZIZ;
                        if (c1317700kOW != null && (c1317710kOX2 = c1317700kOW.LJFF) != null && c1317710kOX2.LJFF != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Android BigImageDrawingHelper loading image from remote failed, and the url is ");
                            sbLIZ2.append(this.LIZIZ.LIZIZ.LJFF.LJFF);
                            sbLIZ2.append(". The Fresco throw error msg is ");
                            sbLIZ2.append(thLIZLLL.toString());
                            C2188811AlT.LIZIZ(sbLIZ2);
                        } else if (thLIZLLL != null) {
                            thLIZLLL.toString();
                        }
                        this.LIZIZ.LIZ.LIZ();
                    }
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<C1323050kX9<InterfaceC1327060kdc>> interfaceC1320200kSY) {
                    C1323050kX9<InterfaceC1327060kdc> result;
                    C1325260kai c1325260kai;
                    C1317710kOX c1317710kOX2;
                    if (interfaceC1320200kSY.LIZ() && (result = interfaceC1320200kSY.getResult()) != null) {
                        C1323050kX9<InterfaceC1327060kdc> c1323050kX9Clone = result.clone();
                        try {
                            c1325260kai = new C1325260kai(c1323050kX9Clone.get());
                            try {
                                BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance((InputStream) c1325260kai, false);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                C1317700kOW c1317700kOWLJI = this.LIZIZ.LJI(c1317710kOX, bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight());
                                if (c1317700kOWLJI != null) {
                                    options.inSampleSize = c1317700kOWLJI.LIZ;
                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    c1317700kOWLJI.LIZLLL = bitmapRegionDecoderNewInstance.decodeRegion(c1317700kOWLJI.LIZIZ, options);
                                    c1317700kOWLJI.LJ = false;
                                    C1317680kOU c1317680kOU = this.LIZIZ;
                                    C786410Ut5.LJJZZIII(c1317680kOU.LIZJ, new ARunnableS89S0200000_20(c1317680kOU, c1317700kOWLJI, 130));
                                }
                                bitmapRegionDecoderNewInstance.recycle();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1317680kOU c1317680kOU2 = this.LIZIZ;
                                    if (c1317680kOU2.LIZ != null) {
                                        C1317700kOW c1317700kOW = c1317680kOU2.LIZIZ;
                                        if (c1317700kOW != null && (c1317710kOX2 = c1317700kOW.LJFF) != null && c1317710kOX2.LJFF != null) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Android BigImageDrawingHelper loading image from remote onNewResultImpl failed, and the url is ");
                                            sbLIZ.append(this.LIZIZ.LIZIZ.LJFF.LJFF);
                                            sbLIZ.append(". The Fresco throw error msg is ");
                                            sbLIZ.append(th.toString());
                                            C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            th.toString();
                                        }
                                        this.LIZIZ.LIZ.LIZ();
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C1317680kOU.LIZIZ(c1325260kai);
                                    result.close();
                                    c1323050kX9Clone.close();
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c1325260kai = null;
                        }
                        C1317680kOU.LIZIZ(c1325260kai);
                        result.close();
                        c1323050kX9Clone.close();
                    }
                }
            }, C786410Ut5.h4());
        }
    }

    public final C1317700kOW LJI(C1317710kOX c1317710kOX, float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            float f3 = c1317710kOX.LIZIZ;
            if (f3 != 0.0f) {
                float f4 = c1317710kOX.LIZJ;
                if (f4 != 0.0f) {
                    C1317700kOW c1317700kOW = new C1317700kOW(c1317710kOX);
                    InterfaceC1320380kSq interfaceC1320380kSq = c1317710kOX.LJ;
                    if (interfaceC1320380kSq == InterfaceC1320380kSq.LJ) {
                        c1317700kOW.LIZIZ = new Rect();
                        Rect rect = new Rect();
                        c1317700kOW.LIZJ = rect;
                        float f5 = c1317710kOX.LIZIZ;
                        if (f <= f5) {
                            Rect rect2 = c1317700kOW.LIZIZ;
                            rect2.left = 0;
                            rect2.right = (int) f;
                            rect.left = (int) ((f5 - f) / 2.0f);
                            rect.right = (int) ((f5 + f) / 2.0f);
                        } else {
                            Rect rect3 = c1317700kOW.LIZIZ;
                            float f6 = (f - f5) / 2.0f;
                            rect3.left = (int) f6;
                            rect3.right = (int) (f - f6);
                            rect.left = 0;
                            rect.right = (int) f5;
                        }
                        float f7 = c1317710kOX.LIZJ;
                        if (f2 <= f7) {
                            Rect rect4 = c1317700kOW.LIZIZ;
                            rect4.top = 0;
                            rect4.bottom = (int) f2;
                            rect.top = (int) ((f7 - f2) / 2.0f);
                            rect.bottom = (int) ((f7 + f2) / 2.0f);
                        } else {
                            Rect rect5 = c1317700kOW.LIZIZ;
                            float f8 = (f2 - f7) / 2.0f;
                            rect5.top = (int) f8;
                            rect5.bottom = (int) (f2 - f8);
                            rect.top = 0;
                            rect.bottom = (int) f7;
                        }
                        Rect rect6 = c1317700kOW.LIZIZ;
                        float f9 = rect6.right - rect6.left;
                        float f10 = rect6.bottom - rect6.top;
                        c1317700kOW.LIZ = LIZ(c1317710kOX.LJI, f9, f10, f9, f10);
                    } else if (interfaceC1320380kSq == InterfaceC1320380kSq.LIZJ) {
                        float f11 = f3 / f;
                        float f12 = f4 / f2;
                        Rect rect7 = new Rect();
                        c1317700kOW.LIZIZ = rect7;
                        rect7.top = 0;
                        rect7.bottom = (int) f2;
                        rect7.left = 0;
                        rect7.right = (int) f;
                        Rect rect8 = new Rect();
                        c1317700kOW.LIZJ = rect8;
                        if (f11 <= f12) {
                            float f13 = f11 * f2;
                            rect8.left = 0;
                            rect8.right = (int) c1317710kOX.LIZIZ;
                            float f14 = c1317710kOX.LIZJ;
                            rect8.top = (int) ((f14 - f13) / 2.0f);
                            rect8.bottom = (int) ((f14 + f13) / 2.0f);
                        } else {
                            float f15 = f12 * f;
                            rect8.top = 0;
                            rect8.bottom = (int) c1317710kOX.LIZJ;
                            float f16 = c1317710kOX.LIZIZ;
                            rect8.left = (int) ((f16 - f15) / 2.0f);
                            rect8.right = (int) ((f16 + f15) / 2.0f);
                        }
                        c1317700kOW.LIZ = LIZ(c1317710kOX.LJI, rect8.right - rect8.left, rect8.bottom - rect8.top, f, f2);
                    } else if (interfaceC1320380kSq == InterfaceC1320380kSq.LJI) {
                        float f18 = f3 / f;
                        float f19 = f4 / f2;
                        Rect rect9 = new Rect();
                        c1317700kOW.LIZJ = rect9;
                        rect9.top = 0;
                        rect9.bottom = (int) c1317710kOX.LIZJ;
                        rect9.left = 0;
                        rect9.right = (int) c1317710kOX.LIZIZ;
                        Rect rect10 = new Rect();
                        c1317700kOW.LIZIZ = rect10;
                        if (f18 >= f19) {
                            float f20 = c1317710kOX.LIZJ / f18;
                            rect10.left = 0;
                            rect10.right = (int) f;
                            rect10.top = (int) ((f2 - f20) / 2.0f);
                            rect10.bottom = (int) ((f2 + f20) / 2.0f);
                        } else {
                            float f21 = c1317710kOX.LIZIZ / f19;
                            rect10.left = (int) ((f - f21) / 2.0f);
                            rect10.right = (int) ((f21 + f) / 2.0f);
                            rect10.top = 0;
                            rect10.bottom = (int) f2;
                        }
                        c1317700kOW.LIZ = LIZ(c1317710kOX.LJI, c1317710kOX.LIZIZ, c1317710kOX.LIZJ, rect10.right - rect10.left, rect10.bottom - rect10.top);
                    } else {
                        c1317700kOW.LIZIZ = new Rect(0, 0, (int) f, (int) f2);
                        c1317700kOW.LIZJ = new Rect(0, 0, (int) c1317710kOX.LIZIZ, (int) c1317710kOX.LIZJ);
                        c1317700kOW.LIZ = LIZ(c1317710kOX.LJI, c1317710kOX.LIZIZ, c1317710kOX.LIZJ, f, f2);
                    }
                    if (this.LJ) {
                        c1317700kOW.LIZ = 1;
                    }
                    return c1317700kOW;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void LJII(Context context, C1325710kbR c1325710kbR, C1317710kOX c1317710kOX) {
        String strCopyValueOf;
        if (!TextUtils.isEmpty(c1317710kOX.LJFF)) {
            if (!TextUtils.isEmpty(c1317710kOX.LJFF)) {
                strCopyValueOf = String.copyValueOf(c1317710kOX.LJFF.toCharArray());
            } else {
                strCopyValueOf = null;
            }
            C1317710kOX c1317710kOX2 = new C1317710kOX(c1317710kOX.LIZ, c1317710kOX.LIZIZ, c1317710kOX.LIZJ, c1317710kOX.LIZLLL, c1317710kOX.LJ, strCopyValueOf, c1317710kOX.LJI, c1317710kOX.LJII, c1317710kOX.LJIIIIZZ);
            C0V18 c0v18LIZIZ = C0V18.LIZIZ();
            ARunnableS28S0400000_20 aRunnableS28S0400000_20 = new ARunnableS28S0400000_20(this, c1317710kOX2, context, c1325710kbR, c1317710kOX, 15);
            c0v18LIZIZ.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                BPEAHandler bPEAHandler = c0v18LIZIZ.LLILZ;
                if (bPEAHandler == null) {
                    if (c0v18LIZIZ.LLILLJJLI == null) {
                        c0v18LIZIZ.LLILLJJLI = new LinkedList();
                    }
                    ((LinkedList) c0v18LIZIZ.LLILLJJLI).add(aRunnableS28S0400000_20);
                } else {
                    C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS28S0400000_20);
                }
            }
        }
        if (c1325710kbR != null) {
            try {
                C1324660kZk c1324660kZkLIZJ = C1322200kVm.LIZ().LJIIJJI.LIZJ(c1325710kbR, null);
                if (C1322200kVm.LIZ().LIZLLL.get(c1324660kZkLIZJ) != null) {
                    C1323050kX9<AbstractC1327750kej> c1323050kX9Clone = C1322200kVm.LIZ().LIZLLL.get(c1324660kZkLIZJ).clone();
                    if (c1323050kX9Clone.get() != null && (c1323050kX9Clone.get() instanceof C1325120kaU)) {
                        Bitmap underlyingBitmap = ((C1325120kaU) c1323050kX9Clone.get()).getUnderlyingBitmap();
                        C1317700kOW c1317700kOWLJI = LJI(c1317710kOX, underlyingBitmap.getWidth(), underlyingBitmap.getHeight());
                        if (c1317700kOWLJI != null) {
                            c1317700kOWLJI.LJI = c1323050kX9Clone;
                            c1317700kOWLJI.LIZLLL = underlyingBitmap;
                            LJIIJJI(c1317700kOWLJI);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadBitmapFromMemory failed: ");
                sbLIZ.append(th.toString());
                LynxLog.e("BigImageDrawingHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final boolean LIZLLL(Context context, Canvas canvas, C1325710kbR c1325710kbR, C1317710kOX c1317710kOX) {
        Bitmap bitmap;
        this.LJ = true;
        C1317700kOW c1317700kOW = this.LIZIZ;
        if (c1317700kOW == null || c1317700kOW.LIZLLL == null || c1317700kOW.LJFF.LIZ != c1317710kOX.LIZ) {
            LIZJ();
            LJII(context, c1325710kbR, c1317710kOX);
        }
        C1317700kOW c1317700kOW2 = this.LIZIZ;
        if (c1317700kOW2 != null && (bitmap = c1317700kOW2.LIZLLL) != null) {
            C1315900kLc.customDraw((int) c1317710kOX.LIZIZ, (int) c1317710kOX.LIZJ, bitmap.getWidth(), this.LIZIZ.LIZLLL.getHeight(), c1317710kOX.LJ, c1317710kOX.LJII, c1317710kOX.LJIIIIZZ, canvas, this.LIZIZ.LIZLLL);
            return true;
        }
        return false;
    }

    public static int LIZ(Point point, float f, float f2, float f3, float f4) {
        if (f4 != 0.0f && f3 != 0.0f) {
            float fMin = Math.min(Math.min(f / f3, f2 / f4), Math.min(point.x / f3, point.y / f4));
            int i = (int) (f3 * fMin);
            int i2 = (int) (fMin * f4);
            if (i != 0 && i2 != 0) {
                float f5 = i2;
                int i3 = 1;
                if (f4 > f5 || f3 > i) {
                    int iRound = Math.round(f4 / f5);
                    int iRound2 = Math.round(f3 / i);
                    if (iRound >= iRound2) {
                        iRound = iRound2;
                    }
                    while (true) {
                        int i4 = i3 * 2;
                        if (i4 > iRound) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return i3;
            }
            return 32;
        }
        return 32;
    }
}
