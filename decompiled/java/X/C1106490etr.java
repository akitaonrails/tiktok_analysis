package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0etr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.AIPortraitBeamLightBackgroundKt$AIPortraitBeamLightBackground$1$1$1", f = "AIPortraitBeamLightBackground.kt", l = {}, m = "invokeSuspend")
public final class C1106490etr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1680820tqC>, Object> {
    public C1106490etr(InterfaceC1364105Vn<? super C1106490etr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1106490etr(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapCreateBitmap;
        C1C7U.LIZ("AIPortraitBeamLightBackgroundKt@dcd7.AIPortraitBeamLightBackground$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1696790uFx c1696790uFx = C1667510tUj.LIZIZ;
        if (c1696790uFx == null) {
            synchronized (C1667510tUj.LIZJ) {
                try {
                    bitmapCreateBitmap = C1667510tUj.LIZ;
                    if (bitmapCreateBitmap != null) {
                        C201955140j.LIZLLL(C545870Laz.LIZIZ, "AuroraBg", "bitmap cache hit");
                    } else {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(690, 1144, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(690, 1144, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
                        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(345, 572, Bitmap.Config.ARGB_8888);
                        Canvas canvas3 = new Canvas(bitmapCreateBitmap4);
                        Matrix matrix = new Matrix();
                        matrix.setScale(0.5f, 0.5f);
                        Rect rect = new Rect(0, 0, 345, 572);
                        Rect rect2 = new Rect(0, 0, 690, 1144);
                        Path path = new Path();
                        Paint paint = new Paint(1);
                        Paint paint2 = new Paint(2);
                        Paint paint3 = new Paint(2);
                        RenderScript renderScriptCreate = RenderScript.create(C0CHQ.LIZ);
                        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap4);
                        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                        try {
                            for (C1106500ets c1106500ets : C1667510tUj.LIZLLL) {
                                try {
                                    bitmapCreateBitmap3.eraseColor(0);
                                    path.rewind();
                                    int i = 0;
                                    for (Pair<Float, Float> pair : c1106500ets.LIZ) {
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            Pair<Float, Float> pair2 = pair;
                                            float f = 150;
                                            float fFloatValue = pair2.getFirst().floatValue() + f;
                                            float fFloatValue2 = pair2.getSecond().floatValue() + f;
                                            if (i == 0) {
                                                path.moveTo(fFloatValue, fFloatValue2);
                                            } else {
                                                path.lineTo(fFloatValue, fFloatValue2);
                                            }
                                            i = i2;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    path.close();
                                    float fFloatValue3 = c1106500ets.LIZLLL.getFirst().floatValue();
                                    float f2 = 150;
                                    paint.setShader(new LinearGradient(fFloatValue3 + f2, c1106500ets.LIZLLL.getSecond().floatValue() + f2, c1106500ets.LJ.getFirst().floatValue() + f2, c1106500ets.LJ.getSecond().floatValue() + f2, c1106500ets.LJFF, c1106500ets.LJI, Shader.TileMode.CLAMP));
                                    canvas2.drawPath(path, paint);
                                    bitmapCreateBitmap4.eraseColor(0);
                                    canvas3.drawBitmap(bitmapCreateBitmap3, matrix, paint2);
                                    allocationCreateFromBitmap.copyFrom(bitmapCreateBitmap4);
                                    scriptIntrinsicBlurCreate.setRadius(C13LZ.LIZLLL(c1106500ets.LIZJ / 2, 0.1f, 25.0f));
                                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                                    scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                                    allocationCreateTyped.copyTo(bitmapCreateBitmap4);
                                    paint3.setAlpha(C13LZ.LJ((int) ((c1106500ets.LIZIZ * 255.0f) + 0.5f), 0, 255));
                                    canvas.drawBitmap(bitmapCreateBitmap4, rect, rect2, paint3);
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            allocationCreateFromBitmap.destroy();
                                            allocationCreateTyped.destroy();
                                            scriptIntrinsicBlurCreate.destroy();
                                            renderScriptCreate.destroy();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                            allocationCreateFromBitmap.destroy();
                            allocationCreateTyped.destroy();
                            scriptIntrinsicBlurCreate.destroy();
                            renderScriptCreate.destroy();
                            C786410Ut5.LJJJJ(bitmapCreateBitmap3);
                            C786410Ut5.LJJJJ(bitmapCreateBitmap4);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, 150, 150, 390, 844);
                            C786410Ut5.LJJJJ(bitmapCreateBitmap2);
                            C545870Laz c545870Laz = C545870Laz.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("render done, renderCost=");
                            sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                            sbLIZ.append("ms");
                            C201955140j.LIZLLL(c545870Laz, "AuroraBg", C2188811AlT.LIZIZ(sbLIZ));
                            synchronized (C1667510tUj.LIZJ) {
                                try {
                                    Bitmap bitmap = C1667510tUj.LIZ;
                                    if (bitmap != null) {
                                        C786410Ut5.LJJJJ(bitmapCreateBitmap);
                                        bitmapCreateBitmap = bitmap;
                                    } else {
                                        C1667510tUj.LIZ = bitmapCreateBitmap;
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    throw th5;
                }
            }
            c1696790uFx = new C1696790uFx(bitmapCreateBitmap);
            C1667510tUj.LIZIZ = c1696790uFx;
        }
        C1C7U.LIZIZ("AIPortraitBeamLightBackgroundKt@dcd7.AIPortraitBeamLightBackground$1$1$1");
        return c1696790uFx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1680820tqC> interfaceC1364105Vn) {
        return new C1106490etr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
