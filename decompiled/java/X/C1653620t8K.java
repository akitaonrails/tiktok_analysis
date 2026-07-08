package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.widget.TextView;
import bfk.b0;

/* JADX INFO: renamed from: X.0t8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653620t8K {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC497601wk LIZ;

    public C1653620t8K(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    public static final void LIZ(TextView textView, Bitmap bitmap) {
        float width = (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd();
        float height = (textView.getHeight() - textView.getPaddingTop()) - textView.getPaddingBottom();
        if (width > 0.0f && height > 0.0f) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setScale(width / bitmap.getWidth(), height / bitmap.getHeight());
            bitmapShader.setLocalMatrix(matrix);
            textView.getPaint().setShader(bitmapShader);
            textView.invalidate();
        }
    }

    public static void LIZIZ(b0 b0Var, C1655280tB0 c1655280tB0) {
        TextView textView = b0Var.getTextView();
        if (textView == null) {
            return;
        }
        if (textView.getWidth() > 0 && textView.getHeight() > 0) {
            LIZJ(textView, c1655280tB0);
        } else {
            C786410Ut5.x3(textView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1698160uIA(textView, textView, c1655280tB0, 1));
        }
    }

    public static final void LIZJ(TextView textView, C1655280tB0 c1655280tB0) {
        float width = textView.getWidth() - (textView.getPaddingStart() + textView.getPaddingEnd());
        float height = textView.getHeight() - (textView.getPaddingTop() + textView.getPaddingBottom());
        if (width > 0.0f && height > 0.0f) {
            float f = height / 2.0f;
            float[] fArr = c1655280tB0.LIZJ;
            textView.getPaint().setShader(new LinearGradient(0.0f, f * (1.0f - fArr[0]), width, f * (1.0f - fArr[1]), c1655280tB0.LIZ, c1655280tB0.LIZIZ, Shader.TileMode.CLAMP));
            textView.invalidate();
        }
    }

    public static void LIZLLL(b0 b0Var, boolean z) {
        float f;
        C1295960jpS lottieView = b0Var.getLottieView();
        if (lottieView == null || lottieView.getVisibility() != 0) {
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.8f;
        }
        C786410Ut5.f5(lottieView, f);
    }
}
