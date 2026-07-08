package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0rZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593860rZw {
    public static final void LIZ(ImageView imageView, Integer num, boolean z) {
        TuxIconDrawable tuxIconDrawable;
        Drawable drawable = imageView.getDrawable();
        if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null) {
            if (num == null) {
                tuxIconDrawable.LIZ();
                return;
            } else {
                tuxIconDrawable.LJFF(num.intValue());
                return;
            }
        }
        if (num == null) {
            if (z) {
                imageView.setImageTintMode(null);
            }
            imageView.setImageTintList(null);
        } else {
            if (z) {
                imageView.setImageTintMode(PorterDuff.Mode.MULTIPLY);
            }
            imageView.setImageTintList(ColorStateList.valueOf(num.intValue()));
        }
    }
}
