package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434710nRF extends C09AY implements Function2<String, Size, ImageSynthesisResult> {
    public final /* synthetic */ VEVideoEncodeSettings LL;
    public final /* synthetic */ CanvasBackground LLILLJJLI;
    public final /* synthetic */ C1432320nNO LLILLL;
    public final /* synthetic */ SrcImageInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1434710nRF(VEVideoEncodeSettings vEVideoEncodeSettings, CanvasBackground canvasBackground, C1432320nNO c1432320nNO, SrcImageInfo srcImageInfo) {
        super(2);
        this.LL = vEVideoEncodeSettings;
        this.LLILLJJLI = canvasBackground;
        this.LLILLL = c1432320nNO;
        this.LLILZ = srcImageInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ImageSynthesisResult invoke(String str, Size size) {
        Bitmap.CompressFormat compressFormat;
        int startColor;
        RectF rectF;
        String str2 = str;
        Size size2 = size;
        if (this.LL.compileType == VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_WEBP) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if (this.LLILLJJLI.getType() == 2) {
            startColor = this.LLILLJJLI.getEndColor();
        } else {
            startColor = this.LLILLJJLI.getStartColor();
        }
        C1432320nNO c1432320nNO = this.LLILLL;
        String path = this.LLILZ.getPath();
        int width = size2.getWidth();
        int height = size2.getHeight();
        int startColor2 = this.LLILLJJLI.getStartColor();
        int iFloatValue = (int) this.LL.getImageCompileQuality().floatValue();
        c1432320nNO.getClass();
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = height;
            try {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, startColor2, startColor, Shader.TileMode.CLAMP);
                float f2 = width;
                Paint paint = new Paint(1);
                paint.setShader(linearGradient);
                canvas.drawRect(0.0f, 0.0f, f2, f, paint);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
                if (bitmapDecodeFile != null) {
                    float width2 = bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight();
                    if (width2 > f2 / f) {
                        float f3 = f2 / width2;
                        float f4 = (f - f3) / 2.0f;
                        rectF = new RectF(0.0f, f4, f2, f3 + f4);
                    } else {
                        float f5 = width2 * f;
                        float f6 = (f2 - f5) / 2.0f;
                        rectF = new RectF(f6, 0.0f, f5 + f6, f);
                    }
                    canvas.drawBitmap(bitmapDecodeFile, (Rect) null, rectF, (Paint) null);
                    bitmapDecodeFile.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                }
                C0VSV c0vsv = new C0VSV(str2);
                try {
                    try {
                        bitmapCreateBitmap.compress(compressFormat, C13LZ.LJ(iFloatValue, 0, 100), c0vsv);
                        C2107108Nh.LIZ(c0vsv, null);
                        bitmapCreateBitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                        return new ImageSynthesisResult(str2, size2.getWidth(), size2.getHeight(), null, null, null, null, null, null, 504, null);
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
