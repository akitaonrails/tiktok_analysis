package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312110CLh {
    public static final C312110CLh LIZ = new C312110CLh();
    public static final Keva LIZIZ = Keva.getRepo("ags_warning_info");

    public static int LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_shown_item_warning_level_");
        sbLIZ.append(curUserId);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LIZIZ(int i) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_shown_item_warning_level_");
        sbLIZ.append(curUserId);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }
}
