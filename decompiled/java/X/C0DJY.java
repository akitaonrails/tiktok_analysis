package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DJY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ImageView imageView) {
        int iLIZ;
        Context context = imageView.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.a02, typedValue, true)) {
            iLIZ = -1118482;
        } else {
            int i = typedValue.type;
            if (28 <= i && i < 32) {
                iLIZ = typedValue.data;
            } else {
                iLIZ = C446980Hfs.LIZ(context, typedValue.resourceId);
            }
        }
        gradientDrawable.setColor(iLIZ);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.b7));
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_bag_fill);
        tuxIconDrawable.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxIconDrawable.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxIconDrawable.LJI(R.attr.a03, context);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, tuxIconDrawable});
        layerDrawable.setLayerGravity(1, 17);
        imageView.setImageDrawable(layerDrawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
