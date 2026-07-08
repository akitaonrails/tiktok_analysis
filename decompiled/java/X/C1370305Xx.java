package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.05Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370305Xx {
    public static final C1370305Xx LIZ = new C1370305Xx();

    public static void LIZ(long j, Integer num, String str, boolean z, boolean z2, boolean z3) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJFF("use_cache", z2);
        c0lab.LJFF("use_built_in", z3);
        if (!z && num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
            c0lab.LJ("error_domain", str);
        }
        C20684815ws.LJIILLIIL("load_layout_panel", c0lab.LIZ);
    }
}
