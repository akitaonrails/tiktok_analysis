package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463170oB9 {
    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAdjustClipsLogicComponent:");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(final VideoPublishEditModel videoPublishEditModel, final String str, final Function1 function1) {
        C15O7.LIZIZ(new Callable() { // from class: X.0EG4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BaseEditAdjustClipsLogicComponent$Companion@4426.editAdjustMobEvent$1");
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
                c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
                Function1<C0LAB, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(c0lab);
                }
                if (C123100dR.LIZ(C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel))) {
                    c0lab.LJ("ep_anchor_type", C537970L7z.LIZ(videoPublishEditModel.creativeModel.editorProSchemeModel));
                }
                C20684815ws.LJIILLIIL(str, c0lab.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseEditAdjustClipsLogicComponent$Companion@4426.editAdjustMobEvent$1");
                return unit;
            }
        }, C823050WQl.LIZLLL(), null);
    }
}
