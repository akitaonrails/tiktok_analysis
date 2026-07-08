package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403910mdZ {
    public static final C0FFO LIZIZ() {
        return new C0FFO(EnumC1466150oFx.ADD_YOURS, 0, true, false, false, true, false, null, new Pair(Float.valueOf(0.8f), Float.valueOf(1.2f)), false, false, false, false, false, false, new C0FXE(5), 1828738);
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, AddYoursStickerModel addYoursStickerModel, String str) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        C1403900mdY.LIZ.getClass();
        C1403900mdY.LJ(videoPublishEditModel, c0lab);
        c0lab.LJ("add_yours_title", addYoursStickerModel.getTopicText());
        Long topicID = addYoursStickerModel.getTopicID();
        if (topicID != null) {
            c0lab.LIZIZ(topicID.longValue(), "add_yours_id");
        }
        c0lab.LJ("action_type", str);
        C2341909Fp.LIZ("creation_add_yours_card_action", c0lab.LIZ);
    }
}
