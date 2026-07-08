package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.ImageContent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C408001iI {
    public static final /* synthetic */ int LIZ = 0;

    public static C11JF LIZ(final ImageView imageView, final ImageContent imageContent, final Function0 function0, final Function2 function2) {
        ImageView.ScaleType scaleType;
        View view;
        int iIntValue;
        int i = imageContent.fillMode;
        if (i != 1) {
            if (i != 2) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.FIT_XY;
            }
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
        Integer numLIZIZ = C00H4.LIZIZ(imageContent.imageWidth);
        Integer numLIZIZ2 = C00H4.LIZIZ(imageContent.imageHeight);
        Object parent = imageView.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int iIntValue2 = -2;
                if (numLIZIZ != null) {
                    iIntValue = numLIZIZ.intValue();
                } else {
                    iIntValue = -2;
                }
                layoutParams.width = iIntValue;
                if (numLIZIZ2 != null) {
                    iIntValue2 = numLIZIZ2.intValue();
                }
                layoutParams.height = iIntValue2;
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Bitmap bitmap = imageContent.LIZ;
        if (bitmap != null) {
            imageView.setImageDrawable(new BitmapDrawable(imageView.getResources(), bitmap));
            function0.invoke();
            return null;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01iH
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OverlayImageRenderer@da62.bind$4");
                Bitmap bitmap2 = (Bitmap) obj;
                imageContent.LIZ = bitmap2;
                ImageView imageView2 = imageView;
                imageView2.setImageDrawable(new BitmapDrawable(imageView2.getResources(), bitmap2));
                function2.invoke(Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), null);
                function0.invoke();
                C1C7U.LIZIZ("OverlayImageRenderer@da62.bind$4");
            }
        }, new C09JN() { // from class: X.00jy
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OverlayImageRenderer@da62.bind$5");
                function2.invoke(Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), obj);
                C1C7U.LIZIZ("OverlayImageRenderer@da62.bind$5");
            }
        });
    }
}
