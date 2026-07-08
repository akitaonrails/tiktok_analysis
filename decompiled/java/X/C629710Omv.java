package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Omv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629710Omv {
    public static final /* synthetic */ int LIZ = 0;

    public static final C1722300uv6 LIZ(Fragment fragment) {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = fragment.getString(2131837788);
        c1722300uv6.LJIIIIZZ = fragment.getString(2131836772);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_music_note;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        return c1722300uv6;
    }

    public static final void LIZIZ(Activity activity, String str) {
        C0XPD.LIZIZ(activity, str, "click_favorite_music", null, null);
    }
}
