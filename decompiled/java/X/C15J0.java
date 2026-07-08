package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.music.model.SmartExtendMusicData;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15J0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15J0 {
    public static String LIZLLL(int i) {
        return (i == 0 || i == 14) ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    public static List<MusicModel> LIZ(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                musicModelConvertToMusicModel.setChallengeUserCount(music.getUserCount());
                musicModelConvertToMusicModel.setChallengeMusic(true);
                musicModelConvertToMusicModel.setDataType(0);
                arrayList.add(musicModelConvertToMusicModel);
            }
        }
        return arrayList;
    }

    public static List<MusicModel> LIZIZ(List<Music> list, BaseResponse.ServerTimeExtra serverTimeExtra) {
        return LIZJ(list, null, serverTimeExtra, Boolean.FALSE);
    }

    public static List<MusicModel> LIZJ(List<Music> list, List<SmartExtendMusicData> list2, BaseResponse.ServerTimeExtra serverTimeExtra, Boolean bool) {
        int iConvertS2MS;
        SmartExtendMusicData next;
        ArrayList arrayList;
        int iConvertS2MS2;
        Float durationPrecision;
        Float durationPrecision2;
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                if (serverTimeExtra != null) {
                    LogPbBean logPbBean = new LogPbBean();
                    logPbBean.setImprId(serverTimeExtra.logid);
                    musicModelConvertToMusicModel.setLogPb(logPbBean);
                }
                musicModelConvertToMusicModel.setFromRecommend(bool.booleanValue());
                if (C07N9.LIZ() && list2 != null) {
                    MusicHighPrecisionDuration durationHighPrecision = musicModelConvertToMusicModel.getDurationHighPrecision();
                    int duration = musicModelConvertToMusicModel.getDuration();
                    if (durationHighPrecision != null && (durationPrecision2 = durationHighPrecision.getDurationPrecision()) != null && durationHighPrecision.checkDataValidate(durationPrecision2)) {
                        iConvertS2MS = durationHighPrecision.convertS2MS(durationPrecision2.floatValue());
                    } else {
                        iConvertS2MS = duration * LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                    if (iConvertS2MS >= C1454930nxr.LIZ().clipMinLength) {
                        Iterator<SmartExtendMusicData> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                Long l = next.musicId;
                                long id = musicModelConvertToMusicModel.getId();
                                if (l != null && l.longValue() == id) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        SmartExtendMusicData smartExtendMusicData = next;
                        if (smartExtendMusicData != null) {
                            List<Music> list3 = smartExtendMusicData.smartExtendMusicList;
                            if (list3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Music music2 : list3) {
                                    Music music3 = music2;
                                    if (music3 != null && music3.getId() != musicModelConvertToMusicModel.getId()) {
                                        MusicHighPrecisionDuration durationHighPrecision2 = music3.getDurationHighPrecision();
                                        int duration2 = music3.getDuration();
                                        if (durationHighPrecision2 != null && (durationPrecision = durationHighPrecision2.getDurationPrecision()) != null && durationHighPrecision2.checkDataValidate(durationPrecision)) {
                                            iConvertS2MS2 = durationHighPrecision2.convertS2MS(durationPrecision.floatValue());
                                        } else {
                                            iConvertS2MS2 = duration2 * LSPassThroughRecordSizeConfig.DEFAULT;
                                        }
                                        if (iConvertS2MS2 >= C1454930nxr.LIZ().clipMinLength) {
                                            arrayList3.add(music2);
                                        }
                                    }
                                }
                                List listLJJJJLI = C13LP.LJJJJLI(arrayList3);
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj : (ArrayList) listLJJJJLI) {
                                    if (hashSet.add(Long.valueOf(((Music) obj).getId()))) {
                                        arrayList4.add(obj);
                                    }
                                }
                                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(((Music) it3.next()).convertToMusicModel());
                                }
                            } else {
                                arrayList = null;
                            }
                            musicModelConvertToMusicModel.setSmartExtendMusicList(arrayList);
                            musicModelConvertToMusicModel.setSmartExtended(C13LQ.LJLIIL(new Integer[]{1, 2}).contains(Integer.valueOf(((Number) C07N9.LIZ.getValue()).intValue())));
                        }
                    }
                }
                arrayList2.add(musicModelConvertToMusicModel);
            }
        }
        return arrayList2;
    }
}
