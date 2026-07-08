package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376300EpA {
    public static void LIZ(String str, VideoPublishEditModel videoPublishEditModel, String str2, String str3, Boolean bool, int i) {
        String str4;
        String str5;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("is_from_create_template", str4);
            c0lab.LIZ(1, "is_from_edit_tab");
            c0lab.LJ("is_editor_pro", "1");
            if (bool != null) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    str5 = "available";
                } else {
                    str5 = "not_available";
                }
                c0lab.LJ("stroke_button_status", str5);
            }
            if (str2 != null) {
                c0lab.LJ("effect_id", str2);
            }
            if (str3 != null) {
                c0lab.LJ("adjust_type", str3);
            }
            C20684815ws.LJIILLIIL(str, c0lab.LIZ);
        }
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, boolean z, long j, int i) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("use_cache", C1529305yl.LIZ(Boolean.valueOf(z)));
        if (str2 != null) {
            c0lab.LJ("resource_id", str2);
        }
        if (str3 != null) {
            c0lab.LJ("error_code", str3);
        }
        if (str4 != null) {
            c0lab.LJ("error_domain", str4);
        }
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
