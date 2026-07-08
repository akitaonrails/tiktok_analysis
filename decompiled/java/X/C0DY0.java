package X;

import android.widget.ImageView;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DY0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DY0 {
    public static final ImageView.ScaleType LIZ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1362001767) {
                if (iHashCode != -797304696) {
                    if (iHashCode == 727618043 && string.equals("aspectFill")) {
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                } else if (string.equals("scaleToFill")) {
                    return ImageView.ScaleType.CENTER;
                }
            } else if (string.equals("aspectFit")) {
                return ImageView.ScaleType.FIT_CENTER;
            }
        }
        return ImageView.ScaleType.CENTER;
    }
}
