package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0R {
    public static final C0E0R LIZ = new C0E0R();

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, ResourceItem resourceItem, int i, String str) {
        ArrayList<String> arrayList;
        Object objLJJJLZIJ;
        String str2;
        if (videoPublishEditModel != null && (arrayList = resourceItem.magicResourceTypeList) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList)) != null) {
            if (Intrinsics.LJFF(objLJJJLZIJ, "photo")) {
                str2 = "only_photo";
            } else {
                str2 = "only_video";
            }
            if (c0e48 != null) {
                String name = resourceItem.getName();
                String effectId = resourceItem.getEffectId();
                String resourceId = resourceItem.getResourceId();
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
                c0labLJFF.LJ("tab_name", name);
                c0labLJFF.LJ("magic_id", effectId);
                c0labLJFF.LJ("magic_res_id", resourceId);
                c0labLJFF.LIZ(i, "index");
                c0labLJFF.LJ("magic_type", str2);
                c0labLJFF.LJ("is_editor_pro", "1");
                c0labLJFF.LJ("to_status", str);
                c0labLJFF.LJ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("magic_apply_popup", c0labLJFF.LIZ);
            }
        }
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, ResourceItem resourceItem, int i, boolean z, int i2, boolean z2, String str) {
        VideoPublishEditModel videoPublishEditModel2;
        ArrayList<String> arrayList;
        Object objLJJJLZIJ;
        String str2;
        if (c0e48 != null && (videoPublishEditModel2 = videoPublishEditModel) != null && resourceItem != null && (arrayList = resourceItem.magicResourceTypeList) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList)) != null) {
            if (Intrinsics.LJFF(objLJJJLZIJ, "photo")) {
                str2 = "only_photo";
            } else {
                str2 = "only_video";
            }
            String str3 = null;
            String str4 = "1";
            if (z) {
                String name = resourceItem.getName();
                String effectId = resourceItem.getEffectId();
                String resourceId = resourceItem.getResourceId();
                C357590E0f category = resourceItem.getCategory();
                if (category != null) {
                    str3 = category.LIZIZ;
                }
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel2, c0e48, new Pair(-1, -1));
                c0labLJFF.LJ("tab_name", name);
                c0labLJFF.LJ("magic_id", effectId);
                c0labLJFF.LJ("magic_res_id", resourceId);
                c0labLJFF.LIZ(i2, "index");
                c0labLJFF.LJ("magic_type", str2);
                c0labLJFF.LJ("is_editor_pro", "1");
                if (!z2) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c0labLJFF.LJ("is_from_pip", str4);
                c0labLJFF.LJ("tab_panel_name", str3);
                c0labLJFF.LJ("enter_from", "video_edit_page");
                if (C123100dR.LIZ(str)) {
                    c0labLJFF.LJ("magic_tab_tier_1", str);
                }
                C20684815ws.LJIILLIIL("magic_click", c0labLJFF.LIZ);
            } else {
                String name2 = resourceItem.getName();
                String effectId2 = resourceItem.getEffectId();
                String resourceId2 = resourceItem.getResourceId();
                C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModel2, c0e48, new Pair(-1, -1));
                c0labLJFF2.LJ("tab_name", name2);
                c0labLJFF2.LJ("magic_id", effectId2);
                c0labLJFF2.LJ("magic_res_id", resourceId2);
                c0labLJFF2.LIZ(i, "index");
                c0labLJFF2.LJ("magic_type", str2);
                c0labLJFF2.LJ("is_editor_pro", "1");
                c0labLJFF2.LJ("enter_from", "video_edit_page");
                C20684815ws.LJIILLIIL("magic_disable_click_popup", c0labLJFF2.LIZ);
                String name3 = resourceItem.getName();
                String effectId3 = resourceItem.getEffectId();
                String resourceId3 = resourceItem.getResourceId();
                C357590E0f category2 = resourceItem.getCategory();
                if (category2 != null) {
                    str3 = category2.LIZIZ;
                }
                videoPublishEditModel2 = videoPublishEditModel2;
                C361680EFy.LJJLIIIJ(videoPublishEditModel2, c0e48, "disable_click", z2, name3, effectId3, resourceId3, str2, str3);
            }
            C1413450msx c1413450msx = C1413450msx.LIZ;
            String name4 = resourceItem.getName();
            String str5 = "";
            if (name4 == null) {
                name4 = "";
            }
            String effectId4 = resourceItem.getEffectId();
            if (effectId4 != null) {
                str5 = effectId4;
            }
            C1413450msx.LJIILIIL(c1413450msx, videoPublishEditModel2, name4, str5, "magic", true, true, null, i, null, null, false, 3584);
        }
    }
}
