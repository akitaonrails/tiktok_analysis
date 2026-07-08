package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331180kkG {
    public static int LIZIZ(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void LIZ(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Drawable drawable, Drawable.Callback callback, InterfaceC1331140kkC interfaceC1331140kkC) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC1331170kkF) {
                ((InterfaceC1331170kkF) drawable).LJIIIZ(interfaceC1331140kkC);
            }
        }
    }
}
