package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.18nZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391518nZ {
    public static C21391618na LIZ(ViewGroup viewGroup, boolean z, boolean z2, C21391318nX c21391318nX) {
        boolean z3;
        Bitmap bitmap;
        float fFloatValue;
        float fFloatValue2;
        Bitmap bitmap2 = c21391318nX.LIZ;
        if (bitmap2 != null && !bitmap2.isRecycled() && !c21391318nX.LIZIZ.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || (bitmap = c21391318nX.LIZ) == null || !(!bitmap.isRecycled())) {
            return null;
        }
        Rect rect = new Rect();
        rect.set(c21391318nX.LIZIZ);
        if (rect.isEmpty()) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        viewGroup.getLocationOnScreen(new int[2]);
        float fExactCenterX = rect.exactCenterX() - r1[0];
        float fExactCenterY = rect.exactCenterY() - r1[1];
        Float fValueOf = Float.valueOf(c21391318nX.LJII);
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = width / 2.0f;
        }
        Float fValueOf2 = Float.valueOf(c21391318nX.LJIIIIZZ);
        if (fValueOf2.floatValue() > 0.0f) {
            fFloatValue2 = fValueOf2.floatValue();
        } else {
            fFloatValue2 = height / 2.0f;
        }
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setImageBitmap(bitmap);
        C786410Ut5.c6(imageView, new ViewGroup.LayoutParams(width, height));
        imageView.setPivotX(fFloatValue);
        imageView.setPivotY(fFloatValue2);
        viewGroup.getOverlay().add(imageView);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        imageView.layout(0, 0, width, height);
        C21391618na c21391618na = new C21391618na(viewGroup, imageView, z, fExactCenterX, fExactCenterY, fFloatValue, fFloatValue2);
        if (z2) {
            c21391618na.LIZJ(0.0f);
        } else {
            c21391618na.LIZ(0.0f);
            C786410Ut5.V4(imageView, 0.0f);
        }
        viewGroup.invalidate();
        return c21391618na;
    }
}
