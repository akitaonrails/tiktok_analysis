package X;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.13qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20136913qh {
    public static Parcelable LIZ(Bundle bundle, String str) {
        ClassLoader classLoader = C20136913qh.class.getClassLoader();
        C0W3J.LJIIIIZZ(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void LIZIZ(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable parcelableLIZ = LIZ(bundle, "MapOptions");
            if (parcelableLIZ != null) {
                LIZJ(bundle2, "MapOptions", parcelableLIZ);
            }
            Parcelable parcelableLIZ2 = LIZ(bundle, "StreetViewPanoramaOptions");
            if (parcelableLIZ2 != null) {
                LIZJ(bundle2, "StreetViewPanoramaOptions", parcelableLIZ2);
            }
            Parcelable parcelableLIZ3 = LIZ(bundle, "camera");
            if (parcelableLIZ3 != null) {
                LIZJ(bundle2, "camera", parcelableLIZ3);
            }
            if (bundle.containsKey("position")) {
                C786410Ut5.LJJJI("position", bundle.getString("position"), bundle2);
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void LIZJ(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = C20136913qh.class.getClassLoader();
        C0W3J.LJIIIIZZ(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        C786410Ut5.LJJIJL(bundle2, str, parcelable);
        C786410Ut5.LJJIIZI(bundle, bundle2, "map_state");
    }
}
