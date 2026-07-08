package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556880Lsk {
    public static final C556880Lsk LIZ = new C556880Lsk();

    public static void LIZ(AwemeDraft awemeDraft, String str) {
        long jCurrentTimeMillis;
        if (Intrinsics.LJFF(str, "click_draft")) {
            awemeDraft.LIZ.commonMobModel.clickDraftTime = System.currentTimeMillis();
        }
        if (Intrinsics.LJFF(str, "click_draft")) {
            jCurrentTimeMillis = 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - awemeDraft.LIZ.commonMobModel.clickDraftTime;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", awemeDraft.LIZ());
        c0lab.LJ("shoot_way", awemeDraft.LJJJJIZL.shootWay);
        c0lab.LJ("content_source", C0MZ9.LIZIZ(awemeDraft));
        c0lab.LIZ(awemeDraft.LIZ.draftInfoModel.draftAwemeType, "aweme_type");
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LJ("restore_stage", str);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJIIJ(awemeDraft.LIZ, c0lab);
        C20684815ws.LJIILLIIL("draft_restore_stage", c0lab.LIZ);
    }
}
