package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.model.StrippedMusicInfo;
import com.ss.android.ugc.aweme.music.model.StrippedMusicInfoStruct;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingServiceKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458310o3J {
    public static final C1458310o3J LIZ = new C1458310o3J();

    public static C2344009Gk LIZ(VideoPublishEditModel videoPublishEditModel) {
        String mid;
        String muteReason;
        String aid;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSetting$default;
        String musicId;
        String enterFrom = videoPublishEditModel.getEnterFrom();
        String shootEnterMethod = videoPublishEditModel.getShootEnterMethod();
        int previewVideoLength = videoPublishEditModel.getPreviewInfo().getPreviewVideoLength();
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            C1456960o18 c1456960o18 = ((MusicBuzModel) obj).stripMusicModel;
            if (c1456960o18 != null && c1456960o18.getStrippedMusic()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            mid = null;
            if (!it2.hasNext()) {
                break;
            }
            MusicObject musicObject = ((MusicBuzModel) it2.next()).music;
            if (musicObject != null && (musicId = MusicBeanUtilKt.getMusicId(musicObject)) != null) {
                arrayList2.add(musicId);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String str = (String) obj2;
            if (str.length() > 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                arrayList3.add(obj2);
            }
        }
        C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel == null || (muteReason = replaceMusicModel.getMuteReason()) == null) {
            muteReason = "other";
        }
        C1438590nXV replaceMusicModel2 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel2 == null || (aid = replaceMusicModel2.getAid()) == null) {
            aid = "";
        }
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        if (iMuteStripSettingService != null && (cachedAutoMuteStripSetting$default = IMuteStripSettingService.DefaultImpls.getCachedAutoMuteStripSetting$default(iMuteStripSettingService, false, 1, null)) != null) {
            IMuteStripSettingServiceKt.toMob(cachedAutoMuteStripSetting$default);
        }
        String strLIZJ = LIZJ(videoPublishEditModel);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LJIIIIZZ("enter_method", shootEnterMethod);
        c2344009Gk.LJIIIIZZ("group_id", aid);
        C1438590nXV replaceMusicModel3 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel3 != null) {
            mid = replaceMusicModel3.getMid();
        }
        c2344009Gk.LJIIIIZZ("music_id", mid);
        c2344009Gk.LIZJ(previewVideoLength, "creation_duration");
        c2344009Gk.LJIIIIZZ("mute_reason", muteReason);
        c2344009Gk.LJIIIIZZ("load_type", strLIZJ);
        return c2344009Gk;
    }

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "strip_music_preview")) {
            return "preview";
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "change_ban_music_ep")) {
            return "add_sound";
        }
        if (C1416310mxZ.LJJJJZ(videoPublishEditModel)) {
            return "replace";
        }
        C0CHQ.LIZ().isDebugConfigOpen();
        return "";
    }

    public static C2344009Gk LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String muteReason;
        int i;
        String aid;
        Integer numValueOf;
        String mid;
        int i2;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSetting$default;
        String musicId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String enterFrom = videoPublishEditModel.getEnterFrom();
        int previewVideoLength = videoPublishEditModel.getPreviewInfo().getPreviewVideoLength();
        C1438590nXV replaceMusicModel = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel == null || (muteReason = replaceMusicModel.getMuteReason()) == null) {
            muteReason = "other";
        }
        List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(videoPublishEditModel.creativeModel.musicBuzModel);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1456960o18 c1456960o18 = ((MusicBuzModel) next).stripMusicModel;
            if (c1456960o18 == null || !c1456960o18.getStrippedMusic()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (true) {
            aid = null;
            if (!it3.hasNext()) {
                break;
            }
            MusicObject musicObject = ((MusicBuzModel) it3.next()).music;
            if (musicObject != null && (musicId = MusicBeanUtilKt.getMusicId(musicObject)) != null) {
                arrayList2.add(musicId);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        if (iMuteStripSettingService != null && (cachedAutoMuteStripSetting$default = IMuteStripSettingService.DefaultImpls.getCachedAutoMuteStripSetting$default(iMuteStripSettingService, false, 1, null)) != null) {
            numValueOf = Integer.valueOf(IMuteStripSettingServiceKt.toMob(cachedAutoMuteStripSetting$default));
        } else {
            numValueOf = null;
        }
        String strLIZJ = LIZJ(videoPublishEditModel);
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        C1438590nXV replaceMusicModel2 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel2 != null) {
            mid = replaceMusicModel2.getMid();
        } else {
            mid = null;
        }
        c2344009Gk.LJIIIIZZ("music_id", mid);
        c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
        c2344009Gk.LJIIIIZZ("enter_method", videoPublishEditModel.getShootEnterMethod());
        C1438590nXV replaceMusicModel3 = videoPublishEditModel.getReplaceMusicModel();
        if (replaceMusicModel3 != null) {
            aid = replaceMusicModel3.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LIZJ(previewVideoLength, "creation_duration");
        if (previewVideoLength > 61000) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_long_video");
        c2344009Gk.LJIIIIZZ("mute_reason", muteReason);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_remove_music");
        c2344009Gk.LIZJ(!arrayList3.isEmpty() ? 1 : 0, "is_add_music");
        if (arrayList3.size() > 1 && !C1416310mxZ.LJJJJLI(videoPublishEditModel)) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_multi_music");
        c2344009Gk.LJ(numValueOf, "is_auto_remove");
        c2344009Gk.LJIIIIZZ("load_type", strLIZJ);
        String str = "unmute_posts_page";
        String str2 = "";
        if (!Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "unmute_posts_page")) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("source", str);
        if (arrayList3.size() > 1) {
            c2344009Gk.LJFF("add_music_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
            c2344009Gk.LJFF("replace_music_id", "");
            return c2344009Gk;
        }
        String str3 = (String) C13LP.LJJJLL(arrayList3);
        if (str3 != null) {
            str2 = str3;
        }
        c2344009Gk.LJFF("replace_music_id", str2);
        return c2344009Gk;
    }

    public static void LJ(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        int i;
        C2344009Gk c2344009GkLIZ = LIZ(videoPublishEditModel);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009GkLIZ.LIZJ(i, "is_success");
        c2344009GkLIZ.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("restore_load_finish", c2344009GkLIZ.LIZ);
    }

    public static void LJI(String str, String str2, String str3) {
        String profileSnackType;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("music_id", str2);
        c2344009Gk.LJIIIIZZ("mute_reason", str3);
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        if (iMuteStripSettingService != null) {
            profileSnackType = iMuteStripSettingService.getProfileSnackType();
        } else {
            profileSnackType = null;
        }
        c2344009Gk.LJIIIIZZ("type", profileSnackType);
        C20684815ws.LJIILLIIL("snackbar_show", c2344009Gk.LIZ);
    }

    public static void LJFF(String str, String str2, String str3, String str4) {
        String profileSnackType;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("music_id", str2);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        c2344009Gk.LJIIIIZZ("mute_reason", str4);
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        if (iMuteStripSettingService != null) {
            profileSnackType = iMuteStripSettingService.getProfileSnackType();
        } else {
            profileSnackType = null;
        }
        c2344009Gk.LJIIIIZZ("type", profileSnackType);
        C20684815ws.LJIILLIIL("snackbar_click", c2344009Gk.LIZ);
    }

    public static void LIZLLL(Aweme aweme, String str, String str2, String str3, boolean z, long j) {
        int duration;
        String str4;
        CachedAutoMuteStripSettingStatus cachedAutoMuteStripSetting$default;
        StrippedMusicInfoStruct strippedMusicInfoStruct;
        List<StrippedMusicInfo> strippedMusicList;
        Video video = aweme.getVideo();
        int i = 0;
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        Music music = aweme.getMusic();
        if (music != null && (strippedMusicInfoStruct = music.strippedMusicInfo) != null && (strippedMusicList = strippedMusicInfoStruct.getStrippedMusicList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<StrippedMusicInfo> it2 = strippedMusicList.iterator();
            while (it2.hasNext()) {
                String musicId = it2.next().getMusicId();
                if (musicId != null) {
                    arrayList.add(musicId);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str5 = (String) obj;
                if (str5.length() > 0 && !Intrinsics.LJFF(str5, CardStruct.IStatusCode.DEFAULT)) {
                    arrayList2.add(obj);
                }
            }
            C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        }
        if (C10IT.LJII(aweme)) {
            str4 = "copyright";
        } else {
            str4 = "other";
        }
        IMuteStripSettingService iMuteStripSettingService = (IMuteStripSettingService) PluggableExtentionKt.pluggableSpi$default(IMuteStripSettingService.class, false, false, false, 14, null);
        String mid = null;
        if (iMuteStripSettingService != null && (cachedAutoMuteStripSetting$default = IMuteStripSettingService.DefaultImpls.getCachedAutoMuteStripSetting$default(iMuteStripSettingService, false, 1, null)) != null) {
            IMuteStripSettingServiceKt.toMob(cachedAutoMuteStripSetting$default);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        Music music2 = aweme.getMusic();
        if (music2 != null) {
            mid = music2.getMid();
        }
        c2344009Gk.LJIIIIZZ("music_id", mid);
        if (duration > 61000) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_long_video");
        c2344009Gk.LIZJ(duration, "creation_duration");
        c2344009Gk.LJIIIIZZ("mute_reason", str4);
        c2344009Gk.LJIIIIZZ("load_type", str3);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("remove_music_preview_load_finish", c2344009Gk.LIZ);
    }
}
