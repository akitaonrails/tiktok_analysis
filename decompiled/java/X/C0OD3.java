package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OD3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OD3 {
    public static final C0OD3 LIZ = new C0OD3();

    public static boolean LIZ(boolean z) {
        if (!C0BXQ.LIZ() && z) {
            return true;
        }
        return false;
    }

    public static List LIZJ(List list) {
        String text;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
            if (interactStickerStruct.getType() != 88 || (C304900BxI.LIZ() && interactStickerStruct.getAddYoursStickerStruct() != null && interactStickerStruct.getAddYoursStickerStruct().getTopicId() != null && (text = interactStickerStruct.getAddYoursStickerStruct().getText()) != null && text.length() != 0)) {
                arrayList.add(interactStickerStruct);
            }
        }
        return new ArrayList(arrayList);
    }

    public static int LIZLLL(boolean z) {
        if (!C0BXQ.LIZ() && z) {
            return 2131836221;
        }
        return 2131825072;
    }

    public static void LIZIZ(AddYoursStickerStruct addYoursStickerStruct, Aweme aweme, C705930RmZ c705930RmZ) {
        String groupId;
        String authorUid;
        String str;
        Object objValueOf;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Object objValueOf2 = null;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJFF("group_id", groupId);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJFF("author_id", authorUid);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        c2344009Gk.LJFF("enter_from", str);
        if (aweme != null) {
            objValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            objValueOf = null;
        }
        c2344009Gk.LJ(objValueOf, "aweme_type");
        if (aweme != null) {
            objValueOf2 = Integer.valueOf(AwemeExtKt.getFollowStatus(aweme));
        }
        c2344009Gk.LJ(objValueOf2, "follow_status");
        Object topicId = addYoursStickerStruct.getTopicId();
        Object obj = "";
        if (topicId == null) {
            topicId = "";
        }
        c2344009Gk.LJ(topicId, "add_yours_id");
        String text = addYoursStickerStruct.getText();
        if (text == null) {
            text = "";
        }
        c2344009Gk.LJFF("add_yours_title", text);
        c2344009Gk.LIZJ(Intrinsics.LJFF(addYoursStickerStruct.getViewerInvited(), Boolean.TRUE) ? 1 : 0, "is_invited");
        Object videoCount = addYoursStickerStruct.getVideoCount();
        if (videoCount != null) {
            obj = videoCount;
        }
        c2344009Gk.LJ(obj, "video_cnt");
        C20684815ws.LJIILLIIL("add_yours_sticker_show", c2344009Gk.LIZ);
    }
}
