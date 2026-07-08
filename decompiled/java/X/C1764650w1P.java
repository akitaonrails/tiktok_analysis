package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0w1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764650w1P {
    public static final InterfaceC665370Q7z LIZ(View view) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        while (view != null) {
            Object tag = view.getTag(R.id.ehk);
            if ((tag instanceof InterfaceC665370Q7z) && (interfaceC665370Q7z = (InterfaceC665370Q7z) tag) != null) {
                return interfaceC665370Q7z;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }
}
