package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: renamed from: X.13kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20097213kI {
    public final PointerIcon LIZ;

    public C20097213kI(PointerIcon pointerIcon) {
        this.LIZ = pointerIcon;
    }

    public static C20097213kI LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C20097213kI(C20097113kH.LIZIZ(context, 1002));
        }
        return new C20097213kI(null);
    }
}
