package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0EZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZ7 {
    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel);
        if (((ArrayList) listLIZIZ).isEmpty()) {
            return "";
        }
        return C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, AFwS234S0000000_5.get$arr$(444), 30);
    }

    public static final void LIZJ(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("position", str);
        C20684815ws.LJIILLIIL("ttcrt_lyrics_guide_show", c0lab.LIZ);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("music_id", LIZ(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_editor_pro", str2);
        c0lab.LJ("click_method", str);
        C20684815ws.LJIILLIIL("ttcrt_click_lyrics_style_entrance", c0lab.LIZ);
    }
}
