package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ujt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715350ujt {
    public static void LIZ(Fragment fragment, String str, long j, int i) {
        int i2;
        if ((i & 2) != 0) {
            str = C20642515q3.LJI(2131840454);
        }
        int i3 = 0;
        if ((i & 4) != 0) {
            i2 = R.raw.icon_shield_tick;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = R.attr.a0i;
        }
        if ((i & 16) != 0) {
            j = C1715340ujs.LIZ();
        }
        C1389880mGw c1389880mGw = new C1389880mGw(fragment);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJ(i2);
        c1389880mGw.LJI(i3);
        c1389880mGw.LIZLLL(j);
        c1389880mGw.LJIIJ();
    }
}
