package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingServiceKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458300o3I {
    public static final C1458300o3I LIZ = new C1458300o3I();
    public static int LIZIZ;

    public static C2344009Gk LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        String mid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJFF("shoot_way", videoPublishEditModel.mShootWay);
        C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
        String aid = null;
        if (replaceMusicModel != null) {
            mid = replaceMusicModel.getMid();
        } else {
            mid = null;
        }
        c2344009Gk.LJFF("music_id", mid);
        c2344009Gk.LJFF("replace_music_id", str);
        c2344009Gk.LJFF("enter_from", "video_edit_page");
        c2344009Gk.LJFF("enter_method", videoPublishEditModel.getShootEnterMethod());
        C1438590nXV replaceMusicModel2 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel2 != null) {
            aid = replaceMusicModel2.getAid();
        }
        c2344009Gk.LJFF("item_id", aid);
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "l8_import_music_edit")) {
            c2344009Gk.LJFF("modify_reason", "automatic_addition");
        }
        return c2344009Gk;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str, Integer num, boolean z) {
        String aid;
        String mid;
        int i;
        Integer numValueOf;
        int i2;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSetting$default;
        String musicId;
        String muteReason;
        int i3;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("creation_id", videoPublishEditModel.getCreationId());
        C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
        String aid2 = null;
        if (replaceMusicModel != null) {
            aid = replaceMusicModel.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJFF("group_id", aid);
        c2344009Gk.LJFF("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJFF("content_source", "upload");
        c2344009Gk.LIZJ(LIZIZ, "is_long_video");
        C1438590nXV replaceMusicModel2 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel2 != null) {
            mid = replaceMusicModel2.getMid();
        } else {
            mid = null;
        }
        c2344009Gk.LJFF("music_id", mid);
        c2344009Gk.LJFF("replace_music_content_type", C1403470mcr.LIZJ(videoPublishEditModel));
        c2344009Gk.LJFF("replace_music_id", str);
        int i4 = 0;
        if (videoPublishEditModel.getVeAudioRecorderParam() != null) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "has_original_sound");
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            c2344009Gk.LJFF("enter_from", "promote");
        } else {
            c2344009Gk.LJFF("enter_from", "video_edit_page");
        }
        String str3 = "other";
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            if (num != null && num.intValue() > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_similar_music");
            if (num != null && num.intValue() > 0) {
                c2344009Gk.LJFF("music_rec_reason", C570830Ma9.LIZLLL(videoPublishEditModel));
            }
            if (!Intrinsics.LJFF("change_ban_music", videoPublishEditModel.mShootWay)) {
                str2 = "other";
            } else {
                str2 = "copyright";
            }
            c2344009Gk.LJFF("mute_reason", str2);
        }
        if (C1453970nwJ.LIZIZ(videoPublishEditModel)) {
            int previewVideoLength = videoPublishEditModel.getPreviewInfo().getPreviewVideoLength();
            C1438590nXV replaceMusicModel3 = videoPublishEditModel.getReplaceMusicModel();
            if (replaceMusicModel3 != null && (muteReason = replaceMusicModel3.getMuteReason()) != null) {
                str3 = muteReason;
            }
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
                if (c1456960o18 == null || !c1456960o18.getStrippedMusic()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MusicObject musicObject = ((MusicBuzModel) it2.next()).music;
                if (musicObject != null && (musicId = MusicBeanUtilKt.getMusicId(musicObject)) != null) {
                    arrayList2.add(musicId);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((String) obj2).length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
            if (iMuteStripSettingService != null && (cachedAutoMuteStripSetting$default = IMuteStripSettingService.DefaultImpls.getCachedAutoMuteStripSetting$default(iMuteStripSettingService, false, 1, null)) != null) {
                numValueOf = Integer.valueOf(IMuteStripSettingServiceKt.toMob(cachedAutoMuteStripSetting$default));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", videoPublishEditModel.getEnterFrom());
            c2344009Gk.LJIIIIZZ("enter_method", videoPublishEditModel.getShootEnterMethod());
            C1438590nXV replaceMusicModel4 = videoPublishEditModel.getReplaceMusicModel();
            if (replaceMusicModel4 != null) {
                aid2 = replaceMusicModel4.getAid();
            }
            c2344009Gk.LJIIIIZZ("group_id", aid2);
            c2344009Gk.LIZJ(previewVideoLength, "creation_duration");
            c2344009Gk.LJIIIIZZ("mute_reason", str3);
            if (previewVideoLength > 61000) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_long_video");
            c2344009Gk.LIZJ(z ? 1 : 0, "is_remove_music");
            c2344009Gk.LIZJ(!arrayList3.isEmpty() ? 1 : 0, "is_add_music");
            if (arrayList3.size() > 1 && !C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
                i4 = 1;
            }
            c2344009Gk.LIZJ(i4, "is_multi_music");
            c2344009Gk.LJ(numValueOf, "is_auto_remove");
            String str4 = "";
            if (arrayList3.size() > 1) {
                c2344009Gk.LJFF("add_music_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
                c2344009Gk.LJFF("replace_music_id", "");
            } else {
                String str5 = (String) C13LP.LJJJLL(arrayList3);
                if (str5 != null) {
                    str4 = str5;
                }
                c2344009Gk.LJFF("replace_music_id", str4);
            }
        }
        if (Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "unmute_posts_page")) {
            c2344009Gk.LJFF("source", videoPublishEditModel.getEnterFrom());
        }
        C20684815ws.LJIILLIIL("publish_replace_music", c2344009Gk.LIZ);
    }
}
