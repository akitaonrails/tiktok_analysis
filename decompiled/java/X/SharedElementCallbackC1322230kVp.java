package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class SharedElementCallbackC1322230kVp extends SharedElementCallback {
    public final AbstractC1322240kVq LIZ;

    public SharedElementCallbackC1322230kVp(AbstractC1322240kVq abstractC1322240kVq) {
        this.LIZ = abstractC1322240kVq;
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List<View> list) {
        this.LIZ.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        this.LIZ.getClass();
        ImageView imageView = null;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap != null) {
                imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                    Matrix matrix = new Matrix();
                    matrix.setValues(floatArray);
                    imageView.setImageMatrix(matrix);
                }
            }
        } else if (parcelable instanceof Bitmap) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
        return imageView;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        this.LIZ.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapCreateBitmap;
        AbstractC1322240kVq abstractC1322240kVq = this.LIZ;
        abstractC1322240kVq.getClass();
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                    if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                        bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
                    } else {
                        int i = (int) (intrinsicWidth * fMin);
                        int i2 = (int) (intrinsicHeight * fMin);
                        bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect bounds = drawable.getBounds();
                        int i3 = bounds.left;
                        int i4 = bounds.top;
                        int i5 = bounds.right;
                        int i6 = bounds.bottom;
                        drawable.setBounds(0, 0, i, i2);
                        drawable.draw(canvas);
                        drawable.setBounds(i3, i4, i5, i6);
                    }
                    if (bitmapCreateBitmap != null) {
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJIJL(bundle, "sharedElement:snapshot:bitmap", bitmapCreateBitmap);
                        C786410Ut5.LJJJI("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString(), bundle);
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            C786410Ut5.LJJIJIIJIL(bundle, "sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                }
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin2 = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int i7 = (int) (iRound * fMin2);
            int i8 = (int) (iRound2 * fMin2);
            if (abstractC1322240kVq.LIZ == null) {
                abstractC1322240kVq.LIZ = new Matrix();
            }
            abstractC1322240kVq.LIZ.set(matrix);
            abstractC1322240kVq.LIZ.postTranslate(-rectF.left, -rectF.top);
            abstractC1322240kVq.LIZ.postScale(fMin2, fMin2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.concat(abstractC1322240kVq.LIZ);
            view.draw(canvas2);
            return bitmapCreateBitmap2;
        }
        return null;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        this.LIZ.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        this.LIZ.getClass();
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.LIZ.getClass();
        C0VEA.LIZ(onSharedElementsReadyListener);
    }
}
