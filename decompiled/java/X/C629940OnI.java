package X;

import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.0OnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629940OnI {
    public static final C629940OnI LIZ = new C629940OnI();

    public static boolean LIZ(Music music) {
        if ((music == null || !music.available()) && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAccountType() != 3 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_allow_offline_music_to_detail_page", true, false) && music != null && music.allowOfflineMusicToDetailPage()) {
            return true;
        }
        return false;
    }
}
