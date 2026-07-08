package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0S9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716720S9m {
    public static final C716720S9m LIZ = new C716720S9m();
    public static final Keva LIZIZ = Keva.getRepo("photo_mode_swipe_keva");

    public static int LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo_mode_swipe_hint_show_count|");
        sbLIZ.append(curUserId);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }
}
