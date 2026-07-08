package X;

import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.15IR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IR {
    public static final boolean LIZ(Music music) {
        String lyricContent;
        if (!C1400490mY3.LIZ()) {
            return false;
        }
        if (music != null) {
            lyricContent = music.getLyricContent();
        } else {
            lyricContent = null;
        }
        if (!C123100dR.LIZ(lyricContent) || music == null || music.getLyricContentType() != 2) {
            return false;
        }
        return true;
    }
}
