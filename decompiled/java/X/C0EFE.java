package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EFE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFE {
    public static final C0EFE LIZ = new C0EFE();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, EnumC362430EIv enumC362430EIv) {
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("action", enumC362430EIv.getValue());
        C20684815ws.LJIILLIIL("editorpro_animation_guide", c0labLJFF.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, boolean z) {
        String str;
        Long lValueOf;
        C0E55 player;
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        if (z) {
            str = "edit_panel";
        } else {
            str = "edit_entrance";
        }
        c0labLJFF.LJ("is_editor_pro", "1");
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            lValueOf = Long.valueOf(player.qq());
        } else {
            lValueOf = null;
        }
        c0labLJFF.LIZLLL(lValueOf, "creation_duration");
        c0labLJFF.LJ("show_entrance", str);
        C20684815ws.LJIILLIIL("video_animation_guidance_show", c0labLJFF.LIZ);
    }
}
