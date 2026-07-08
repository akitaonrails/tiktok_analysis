package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o4Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459090o4Z {
    public static final boolean LIZ(AVMusic aVMusic) {
        if (!Intrinsics.LJFF(aVMusic.getMusicSelectedFrom(), "single_song") && !Intrinsics.LJFF(aVMusic.getMusicSelectedFrom(), "prop_auto") && !Intrinsics.LJFF(aVMusic.getMusicBuzCompatModel().getMusicRootPageFrom(), "draft_again")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(MusicModel musicModel) {
        if (!Intrinsics.LJFF(musicModel.getMusicSelectedFrom(), "single_song") && !Intrinsics.LJFF(musicModel.getMusicSelectedFrom(), "prop_auto") && !Intrinsics.LJFF(musicModel.getMusicSelectedFrom(), "followup_square") && !Intrinsics.LJFF(musicModel.getMusicRootPageFrom(), "draft_again")) {
            return false;
        }
        return true;
    }
}
