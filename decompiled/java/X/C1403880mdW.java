package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;

/* JADX INFO: renamed from: X.0mdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403880mdW {
    public static final C1403880mdW LIZ = new C1403880mdW();

    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0LAB LIZ(java.lang.String r10, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403880mdW.LIZ(java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):X.0LAB");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1403880mdW r4, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r6, java.lang.String r7) {
        /*
            r4.getClass()
            r3 = 0
            X.0LAB r2 = LIZ(r3, r5, r3)
            if (r6 == 0) goto L90
            X.0oFx r0 = r6.getStickerType()
        Le:
            r4 = -1
            if (r0 == 0) goto L8d
            int[] r1 = X.C1403890mdX.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 3
            if (r1 != r0) goto L8d
            java.lang.String r1 = "text_sticker"
        L1e:
            java.lang.String r0 = "prop_id"
            r2.LJ(r0, r1)
            java.lang.String r0 = "method"
            r2.LJ(r0, r7)
            if (r5 == 0) goto L8b
            java.lang.String r1 = r5.mShootWay
        L2c:
            java.lang.String r0 = "shoot_entrance"
            r2.LJ(r0, r1)
            if (r6 == 0) goto L3d
            X.0oFx r0 = r6.getStickerType()
            if (r0 == 0) goto L3d
            int r4 = r0.getType()
        L3d:
            java.lang.String r0 = "sticker_type"
            r2.LIZ(r4, r0)
            if (r5 == 0) goto L89
            int r0 = r5.getDraftId()
            if (r0 == 0) goto L84
            int r0 = r5.getDraftId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L52:
            java.lang.String r0 = "draft_id"
            r2.LIZLLL(r1, r0)
            if (r5 != 0) goto L84
            r0 = r3
        L5a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6b
            if (r5 == 0) goto L66
            java.lang.String r3 = r5.getNewDraftId()
        L66:
            java.lang.String r0 = "new_draft_id"
            r2.LJ(r0, r3)
        L6b:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel r6 = (com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel) r6
            if (r6 == 0) goto L7c
            int r1 = r6.getUiStyle()
            java.lang.String r0 = "ui_style"
            r2.LIZ(r1, r0)
        L7c:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "prop_time_set"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L84:
            java.lang.String r0 = r5.getNewDraftId()
            goto L5a
        L89:
            r1 = r3
            goto L52
        L8b:
            r1 = r3
            goto L2c
        L8d:
            java.lang.String r1 = ""
            goto L1e
        L90:
            r0 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403880mdW.LIZIZ(X.0mdW, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, java.lang.String):void");
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, StickerModel stickerModel, String str) {
        Object objValueOf;
        DMGroupChatStickerModel dMGroupChatStickerModel;
        EnumC1466150oFx stickerType;
        C0LAB c0labLIZ = LIZ(str, videoPublishEditModel, shortVideoContext);
        if (stickerModel != null && (stickerType = stickerModel.getStickerType()) != null) {
            objValueOf = Integer.valueOf(stickerType.getType());
        } else {
            objValueOf = "";
        }
        c0labLIZ.LIZLLL(objValueOf, "sticker_type");
        if ((stickerModel instanceof DMGroupChatStickerModel) && (dMGroupChatStickerModel = (DMGroupChatStickerModel) stickerModel) != null) {
            c0labLIZ.LIZ(dMGroupChatStickerModel.getUiStyle(), "ui_style");
        }
        C20684815ws.LJIILLIIL("prop_adjust", c0labLIZ.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r64, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r65, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r66, java.lang.String r67) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403880mdW.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, java.lang.String):void");
    }
}
