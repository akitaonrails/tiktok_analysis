package X;

import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634940OvM {
    public static void LIZ(AddYourRecordParam addYourRecordParam, boolean z, long j, String str, String str2) {
        String str3;
        String str4;
        String text;
        Object topicId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String enterFrom = addYourRecordParam.getEnterFrom();
        String str5 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("result", str3);
        c2344009Gk.LJIIIIZZ("preload", CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("effect_id", str2);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("music_id", str);
        String shootWay = addYourRecordParam.getShootWay();
        if (shootWay == null) {
            shootWay = "add_yours";
        }
        c2344009Gk.LJIIIIZZ("shoot_way", shootWay);
        String addYoursEnterMethod = addYourRecordParam.getAddYoursEnterMethod();
        if (addYoursEnterMethod == null) {
            addYoursEnterMethod = "";
        }
        c2344009Gk.LJIIIIZZ("add_yours_enter_method", addYoursEnterMethod);
        c2344009Gk.LJIIIIZZ("is_add_yours", "1");
        if (!addYourRecordParam.isFollowAY()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_initiator", str4);
        AddYoursStickerStruct addYoursStickerStruct = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct != null && Intrinsics.LJFF(addYoursStickerStruct.getViewerInvited(), Boolean.TRUE)) {
            str6 = "1";
        }
        c2344009Gk.LJIIIIZZ("is_invited", str6);
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 == null || (text = addYoursStickerStruct2.getText()) == null) {
            text = "";
        }
        c2344009Gk.LJIIIIZZ("add_yours_title", text);
        String fromGroupId = addYourRecordParam.getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        c2344009Gk.LJIIIIZZ("from_group_id", fromGroupId);
        AddYoursStickerStruct addYoursStickerStruct3 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 == null || (topicId = addYoursStickerStruct3.getTopicId()) == null) {
            topicId = "";
        }
        c2344009Gk.LJ(topicId, "add_yours_id");
        String followStatus = addYourRecordParam.getFollowStatus();
        if (followStatus != null) {
            str5 = followStatus;
        }
        c2344009Gk.LJIIIIZZ("follow_status", str5);
        c2344009Gk.LJIIIIZZ("music_selected_from", "add_yours");
        c2344009Gk.LJ(addYourRecordParam.isOperationSet(), "is_operation_set");
        C20684815ws.LJIILLIIL("tool_performance_add_yours_resource_download", c2344009Gk.LIZ);
    }
}
