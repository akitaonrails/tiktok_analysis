package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDiscoveryInfo;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.music.model.SearchInflowParam;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;
import com.ss.android.ugc.aweme.music.report.model.ExtraData;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import com.ss.android.ugc.aweme.music.report.model.TT2DspActionInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631270OpR {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(Music music) {
        boolean z;
        List<FusedMusic> list;
        FusedMusic next;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        MusicFusion musicFusion;
        if (music != null && (musicFusion = music.getMusicFusion()) != null && C631290OpT.LIZ(musicFusion)) {
            z = true;
        } else {
            z = false;
        }
        Music music2 = null;
        if (z) {
            MusicFusion musicFusion2 = music.getMusicFusion();
            if (musicFusion2 != null && (list = musicFusion2.fusedMusicInfos) != null) {
                Iterator<FusedMusic> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Music music3 = next.music;
                        if (music3 != null && (tT2DSPSongInfos = music3.getTT2DSPSongInfos()) != null && !tT2DSPSongInfos.isEmpty()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                FusedMusic fusedMusic = next;
                if (fusedMusic != null) {
                    music2 = fusedMusic.music;
                }
            }
            return new Pair(music2, music);
        }
        return new Pair(music, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static TTToDspLogExtra LIZIZ(VideoItemParams videoItemParams, Music music) {
        Map<String, String> mapLJ;
        ?? LJ;
        Map<String, String> logExtraMap;
        TTToDspLogExtra tTToDspLogExtra = new TTToDspLogExtra();
        MusicDiscoveryInfo musicDiscoveryInfo = videoItemParams.getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo == null || (mapLJ = musicDiscoveryInfo.getTTToDspLogExtraMap()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (music != null && (logExtraMap = music.getLogExtraMap()) != null) {
            LJ = new LinkedHashMap();
            for (Map.Entry<String, String> entry : logExtraMap.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "meta_song_matched_type")) {
                    LJ.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        tTToDspLogExtra.append(C2097608Jq.LJIIL(mapLJ, LJ));
        return tTToDspLogExtra;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r28, java.lang.Integer r29) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C631270OpR.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams, java.lang.Integer):void");
    }

    public static void LIZLLL(VideoItemParams videoItemParams, boolean z, boolean z2) {
        String aid;
        String eventName;
        String playlistPreviousPage;
        MusicETBusinessModule musicETBusinessModule;
        String requestId;
        String musicPromoId;
        boolean z3;
        Music music;
        String aid2;
        String musicVolume;
        String string;
        C2189821An6 c2189821An6;
        DspPlatform dspPlatform;
        Music music2;
        String idStr;
        MatchedSoundInfo matchedSongInfo;
        String id = null;
        if (C2140508a3.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1387505bt(videoItemParams, z, null), 3);
            return;
        }
        Pair pairLIZ = LIZ(C631280OpS.LIZ(videoItemParams.getAweme()));
        Music music3 = (Music) pairLIZ.getFirst();
        Music music4 = (Music) pairLIZ.getSecond();
        if (z && C0R93.LIZLLL(videoItemParams.mEventType)) {
            C633020OsG c633020OsG = C633020OsG.LIZIZ;
            int value = EnumC631330OpX.SHOW.getValue();
            int value2 = EnumC631300OpU.TT_TO_DSP.getValue();
            String aid3 = videoItemParams.getAweme().getAid();
            if (music4 == null) {
                music2 = music3;
                if (music3 == null) {
                    idStr = null;
                }
                if (music3 != null && (matchedSongInfo = music3.getMatchedSongInfo()) != null) {
                    id = matchedSongInfo.getId();
                }
                c633020OsG.LJJJZ(new ReportData(value, value2, aid3, idStr, id, new ExtraData(new TT2DspActionInfo(Integer.valueOf(c633020OsG.LJIILJJIL(music3).getValue()), Integer.valueOf(C0P0X.BIG.getValue()))), null));
            } else {
                music2 = music4;
            }
            idStr = music2.getIdStr();
            if (music3 != null) {
                id = matchedSongInfo.getId();
            }
            c633020OsG.LJJJZ(new ReportData(value, value2, aid3, idStr, id, new ExtraData(new TT2DspActionInfo(Integer.valueOf(c633020OsG.LJIILJJIL(music3).getValue()), Integer.valueOf(C0P0X.BIG.getValue()))), null));
        }
        C631140OpE.LIZ.getClass();
        EnumC631120OpC enumC631120OpCLIZ = C631140OpE.LIZ(videoItemParams);
        C633020OsG c633020OsG2 = C633020OsG.LIZIZ;
        DspPlatform dspPlatformLJIILJJIL = c633020OsG2.LJIILJJIL(music3);
        C0P0X c0p0x = C0P0X.BIG;
        String str = videoItemParams.mEventType;
        String str2 = videoItemParams.mEventType;
        if (str2 == null) {
            str2 = "";
        }
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C610010NwF c610010NwFLIZIZ = c633020OsG2.LIZIZ(enumC631120OpCLIZ, aid);
        if (c610010NwFLIZIZ == null || (dspPlatform = c610010NwFLIZIZ.LIZ) == null || (eventName = dspPlatform.getEventName()) == null) {
            eventName = DspPlatform.UNKNOWN.getEventName();
        }
        String str3 = videoItemParams.mEventType;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
            playlistPreviousPage = c2189821An6.getPlaylistPreviousPage();
        } else {
            playlistPreviousPage = null;
        }
        if (C652090Phv.LJ(str3, playlistPreviousPage)) {
            musicETBusinessModule = MusicETBusinessModule.SEARCH;
        } else {
            musicETBusinessModule = MusicETBusinessModule.FEED;
        }
        Aweme aweme2 = videoItemParams.getAweme();
        SearchInflowParam searchInflowParamLIZJ = C631140OpE.LIZJ(videoItemParams);
        TTToDspLogExtra tTToDspLogExtraLIZIZ = LIZIZ(videoItemParams, music3);
        if (z2) {
            tTToDspLogExtraLIZIZ.append("is_lose_fcp_policy", "1");
        }
        Aweme aweme3 = videoItemParams.getAweme();
        if (aweme3 != null) {
            requestId = aweme3.getRequestId();
        } else {
            requestId = null;
        }
        Aweme aweme4 = videoItemParams.getAweme();
        if (aweme4 != null) {
            musicPromoId = aweme4.getMusicPromoId();
        } else {
            musicPromoId = null;
        }
        if (music4 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aweme2 != null) {
            music = aweme2.getMusic();
        } else {
            music = null;
        }
        if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
            aid2 = "";
        }
        if (aweme2 == null || (musicVolume = aweme2.getMusicVolume()) == null) {
            musicVolume = "";
        }
        if (aweme2 == null || (string = Integer.valueOf(aweme2.getAwemeType()).toString()) == null) {
            string = "";
        }
        c633020OsG2.LJI(z, new LogData(dspPlatformLJIILJJIL, enumC631120OpCLIZ, c0p0x, str, str2, musicETBusinessModule, aweme2, music, searchInflowParamLIZJ, null, aid2, musicVolume, string, null, null, tTToDspLogExtraLIZIZ, requestId, musicPromoId, eventName, z3, 0, null));
    }
}
