package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0maz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402310maz implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onProgress$0(C1402310maz c1402310maz, float f) {
    }

    public static final void onProgress$1(C1402310maz c1402310maz, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C1402310maz c1402310maz) {
        InterfaceC1388600mEs interfaceC1388600mEs;
        C1388590mEr c1388590mEr = (C1388590mEr) c1402310maz.l0;
        c1388590mEr.LLILZ = 3;
        if (c1388590mEr.LLILZIL == 2 && (interfaceC1388600mEs = c1388590mEr.LLILZLL) != null) {
            interfaceC1388600mEs.LIZIZ();
        }
    }

    public static final void onCanceled$1(C1402310maz c1402310maz) {
        InterfaceC1388600mEs interfaceC1388600mEs = ((C1388590mEr) c1402310maz.l0).LLILZLL;
        if (interfaceC1388600mEs != null) {
            interfaceC1388600mEs.LIZ();
        }
    }

    public C1402310maz(C1388590mEr c1388590mEr, int i) {
        this.$t = i;
        this.l0 = c1388590mEr;
    }

    public static final void LIZ$0(C1402310maz c1402310maz, Bitmap bitmap) {
        int i;
        InterfaceC1388600mEs interfaceC1388600mEs;
        C1388590mEr c1388590mEr = (C1388590mEr) c1402310maz.l0;
        if (bitmap != null) {
            ImageView imageView = c1388590mEr.LLILLJJLI;
            c1388590mEr.getClass();
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f = iMin / 2;
            canvas.drawCircle(f, f, f, paint);
            imageView.setImageBitmap(bitmapCreateBitmap);
            i = 2;
        } else {
            i = 3;
        }
        c1388590mEr.LLILZ = i;
        C1388590mEr c1388590mEr2 = (C1388590mEr) c1402310maz.l0;
        if (c1388590mEr2.LLILZIL == 2 && (interfaceC1388600mEs = c1388590mEr2.LLILZLL) != null) {
            interfaceC1388600mEs.LIZIZ();
        }
    }

    public static final void LIZ$1(C1402310maz c1402310maz, Bitmap bitmap) {
        int i;
        InterfaceC1388600mEs interfaceC1388600mEs;
        C1388590mEr c1388590mEr = (C1388590mEr) c1402310maz.l0;
        if (bitmap != null) {
            c1388590mEr.LLILLL.setImageBitmap(bitmap);
            C1388590mEr c1388590mEr2 = (C1388590mEr) c1402310maz.l0;
            if (c1388590mEr2.LLILZ != 1 && (interfaceC1388600mEs = c1388590mEr2.LLILZLL) != null) {
                interfaceC1388600mEs.LIZIZ();
            }
            i = 2;
        } else {
            InterfaceC1388600mEs interfaceC1388600mEs2 = c1388590mEr.LLILZLL;
            if (interfaceC1388600mEs2 != null) {
                interfaceC1388600mEs2.LIZ();
            }
            i = 3;
        }
        c1388590mEr.LLILZIL = i;
    }

    public static final void onFailed$0(C1402310maz c1402310maz, Throwable th) {
        InterfaceC1388600mEs interfaceC1388600mEs;
        C1388590mEr c1388590mEr = (C1388590mEr) c1402310maz.l0;
        c1388590mEr.LLILZ = 3;
        if (c1388590mEr.LLILZIL == 2 && (interfaceC1388600mEs = c1388590mEr.LLILZLL) != null) {
            interfaceC1388600mEs.LIZIZ();
        }
    }

    public static final void onFailed$1(C1402310maz c1402310maz, Throwable th) {
        InterfaceC1388600mEs interfaceC1388600mEs = ((C1388590mEr) c1402310maz.l0).LLILZLL;
        if (interfaceC1388600mEs != null) {
            interfaceC1388600mEs.LIZ();
        }
    }
}
