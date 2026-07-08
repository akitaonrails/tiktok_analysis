package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452640nuA {
    public static final C1452640nuA LIZ = new C1452640nuA();
    public static String LIZIZ = "";
    public static List<? extends AVMusic> LIZJ;

    public static final void LJ(MusicBuzModel musicBuzModel) {
        ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).s90(null, null);
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, null);
        }
    }

    @InterfaceC1294060jmO
    public static final void LJI(AVMusic aVMusic) {
        String str;
        String musicId;
        String imprId;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String title;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        LogPbBean logPb;
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDataCenter.setCurrentMusic1-->name:");
        if (aVMusic != null) {
            str = aVMusic.musicName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" music_id:");
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(" musicLogId:");
        if (aVMusic != null && (logPb = aVMusic.getLogPb()) != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        sbLIZ.append(imprId);
        sbLIZ.append(" isPgc:");
        if (aVMusic != null) {
            boolValueOf = Boolean.valueOf(aVMusic.isPgc());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" isLocalMusic:");
        if (aVMusic != null) {
            boolValueOf2 = Boolean.valueOf(aVMusic.isLocalMusic());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(" matchedPGCSoundInfo.name:");
        if (aVMusic != null && (matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo()) != null) {
            title = matchedPGCSoundInfo.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        sbLIZ.append(" isRenamedUGC:");
        if (aVMusic != null) {
            boolValueOf3 = Boolean.valueOf(aVMusic.getIsRenamedUGC());
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(boolValueOf3);
        sbLIZ.append(" isCollected:");
        if (aVMusic != null) {
            boolValueOf4 = Boolean.valueOf(aVMusic.isCollected());
        } else {
            boolValueOf4 = null;
        }
        sbLIZ.append(boolValueOf4);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MusicDataCenter.setCurrentMusic1-->musicStart:");
        if (aVMusic != null) {
            numValueOf = Integer.valueOf(aVMusic.getMusicStart());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" musicEndTime:");
        if (aVMusic != null) {
            numValueOf2 = Integer.valueOf(aVMusic.getMusicEndTime());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        sbLIZ2.append(" musicEndFromCut:");
        if (aVMusic != null) {
            numValueOf3 = Integer.valueOf(aVMusic.getMusicEndFromCut());
        } else {
            numValueOf3 = null;
        }
        sbLIZ2.append(numValueOf3);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ2));
        ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).s90(aVMusic, null);
    }

    public static void LIZ(MusicBuzModel musicBuzModel, AVMusic aVMusic) {
        AVMusic aVMusicExtractAVMusic;
        if (aVMusic == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null) {
            return;
        }
        if (aVMusicExtractAVMusic.getExtendMusicList() == null) {
            aVMusicExtractAVMusic.setExtendMusicList(new ArrayList());
        }
        List<AVMusic> extendMusicList = aVMusicExtractAVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            extendMusicList.add(aVMusic);
        }
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, aVMusicExtractAVMusic);
        }
    }

    public static final AVMusic LIZLLL(MusicBuzModel musicBuzModel, int i) {
        MusicBuzModel musicBuzModel2;
        if (musicBuzModel == null || i < 0 || (musicBuzModel2 = (MusicBuzModel) C13LP.LJJJLZIJ(i, C1429680nJ8.LIZIZ(musicBuzModel))) == null) {
            return null;
        }
        return MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
    }

    public static void LJFF(MusicBuzModel musicBuzModel, AVMusic aVMusic) {
        AVMusic aVMusicExtractAVMusic;
        if (aVMusic == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null) {
            return;
        }
        List<AVMusic> extendMusicList = aVMusicExtractAVMusic.getExtendMusicList();
        if (extendMusicList != null) {
            ArrayList arrayList = new ArrayList();
            for (AVMusic aVMusic2 : extendMusicList) {
                if (Intrinsics.LJFF(aVMusic2.getMusicId(), aVMusic.getMusicId())) {
                    arrayList.add(aVMusic2);
                }
            }
            for (Object obj : arrayList) {
                List<AVMusic> extendMusicList2 = aVMusicExtractAVMusic.getExtendMusicList();
                if (extendMusicList2 != null) {
                    extendMusicList2.remove(obj);
                }
            }
        }
        List<AVMusic> extendMusicList3 = aVMusicExtractAVMusic.getExtendMusicList();
        if (extendMusicList3 != null && extendMusicList3.isEmpty()) {
            aVMusicExtractAVMusic.setExtendMusicList(null);
            aVMusicExtractAVMusic.setMultiMusicFromTemplate(false);
        }
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, aVMusicExtractAVMusic);
        }
    }

    public static final void LJII(AVMusic aVMusic, boolean z, MusicBuzModel musicBuzModel) {
        String str;
        String musicId;
        String imprId;
        Integer numValueOf;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String title;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Boolean boolValueOf5;
        List<AVMusic> extendMusicList;
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        LogPbBean logPb;
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDataCenter.setCurrentMusic2-->name:");
        if (aVMusic != null) {
            str = aVMusic.musicName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" music_id:");
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(" musicLogId:");
        if (aVMusic != null && (logPb = aVMusic.getLogPb()) != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        sbLIZ.append(imprId);
        sbLIZ.append(" duration:");
        if (aVMusic != null) {
            numValueOf = Integer.valueOf(aVMusic.getDuration());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" isPgc:");
        if (aVMusic != null) {
            boolValueOf = Boolean.valueOf(aVMusic.isPgc());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" isLocalMusic:");
        if (aVMusic != null) {
            boolValueOf2 = Boolean.valueOf(aVMusic.isLocalMusic());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(" matchedPGCSoundInfo.name:");
        if (aVMusic != null && (matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo()) != null) {
            title = matchedPGCSoundInfo.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        sbLIZ.append(" isRenamedUGC:");
        if (aVMusic != null) {
            boolValueOf3 = Boolean.valueOf(aVMusic.getIsRenamedUGC());
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(boolValueOf3);
        sbLIZ.append(" isCollected:");
        if (aVMusic != null) {
            boolValueOf4 = Boolean.valueOf(aVMusic.isCollected());
        } else {
            boolValueOf4 = null;
        }
        sbLIZ.append(boolValueOf4);
        sbLIZ.append(" extendSize:");
        if (aVMusic != null && (extendMusicList = aVMusic.getExtendMusicList()) != null) {
            numValueOf2 = Integer.valueOf(extendMusicList.size());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(" musicBuzModel:");
        if (musicBuzModel != null) {
            numValueOf3 = Integer.valueOf(musicBuzModel.hashCode());
        } else {
            numValueOf3 = null;
        }
        sbLIZ.append(numValueOf3);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MusicDataCenter.setCurrentMusic2-->musicStart:");
        if (aVMusic != null) {
            numValueOf4 = Integer.valueOf(aVMusic.getMusicStart());
        } else {
            numValueOf4 = null;
        }
        sbLIZ2.append(numValueOf4);
        sbLIZ2.append(" musicEndTime:");
        if (aVMusic != null) {
            numValueOf5 = Integer.valueOf(aVMusic.getMusicEndTime());
        } else {
            numValueOf5 = null;
        }
        sbLIZ2.append(numValueOf5);
        sbLIZ2.append(" musicEndFromCut:");
        if (aVMusic != null) {
            numValueOf6 = Integer.valueOf(aVMusic.getMusicEndFromCut());
        } else {
            numValueOf6 = null;
        }
        sbLIZ2.append(numValueOf6);
        sbLIZ2.append(" isUnlimitedMusic:");
        if (aVMusic != null) {
            boolValueOf5 = Boolean.valueOf(aVMusic.isUnlimitedMusic());
        } else {
            boolValueOf5 = null;
        }
        sbLIZ2.append(boolValueOf5);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ2));
        if (musicBuzModel != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, aVMusic);
            musicBuzModel.isPhotoMvModeMusic = z;
        }
        if (aVMusic != null && musicBuzModel != null) {
            musicBuzModel.unSelectMusic = null;
        }
        ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).s90(aVMusic, null);
    }

    public static void LJIIIIZZ(MusicBuzModel musicBuzModel, boolean z, int i) {
        LJIIIZ(musicBuzModel, z, i);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic == null) {
            return;
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDataCenter.setMusicLoopList-->name:");
        sbLIZ.append(aVMusicExtractAVMusic.musicName);
        sbLIZ.append(" music_id:");
        sbLIZ.append(aVMusicExtractAVMusic.getMusicId());
        sbLIZ.append(" isLoop:");
        sbLIZ.append(z);
        sbLIZ.append(" avMusicIsLoop:");
        sbLIZ.append(aVMusicExtractAVMusic.isLoopMusic());
        sbLIZ.append(" maxDuration:");
        sbLIZ.append(i);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = false;
        if (!z) {
            if (aVMusicExtractAVMusic.isLoopMusic()) {
                List<AVMusic> extendMusicList = aVMusicExtractAVMusic.getExtendMusicList();
                if (extendMusicList != null) {
                    extendMusicList.clear();
                }
                if (musicBuzModel != null) {
                    z2 = musicBuzModel.isPhotoMvModeMusic;
                }
                LJII(aVMusicExtractAVMusic, z2, musicBuzModel);
                return;
            }
            return;
        }
        if (aVMusicExtractAVMusic.isLoopMusic()) {
            return;
        }
        LJIIJ(aVMusicExtractAVMusic, true, i);
        if (musicBuzModel != null) {
            z2 = musicBuzModel.isPhotoMvModeMusic;
        }
        LJII(aVMusicExtractAVMusic, z2, musicBuzModel);
    }

    public static void LJIIIZ(MusicBuzModel musicBuzModel, boolean z, int i) {
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDataCenter.updateCurMusicLoopStatus-->shouldMusicLoop:");
        sbLIZ.append(z);
        sbLIZ.append(" maxDuration:");
        sbLIZ.append(i);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        if (musicBuzModel != null) {
            musicBuzModel.shouldMusicLoop = z;
            musicBuzModel.musicMaxLoopDuration = i;
        }
    }

    public static AVMusic LJIIJ(AVMusic aVMusic, boolean z, int i) {
        String str;
        List<AVMusic> extendMusicList;
        List<AVMusic> extendMusicList2;
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDataCenter.updateMusicModeLoopList-->name:");
        String musicId = null;
        if (aVMusic != null) {
            str = aVMusic.musicName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" music_id:");
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        }
        sbLIZ.append(musicId);
        sbLIZ.append(" isLoop:");
        sbLIZ.append(z);
        sbLIZ.append(" maxDuration:");
        sbLIZ.append(i);
        C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0 && aVMusic != null) {
            if (!z) {
                if (aVMusic.isLoopMusic() && (extendMusicList2 = aVMusic.getExtendMusicList()) != null) {
                    extendMusicList2.clear();
                }
                return aVMusic;
            }
            int iMin = Math.min(aVMusic.getDuration(), aVMusic.getTrimmedMusicDuration());
            if (i <= iMin) {
                return aVMusic;
            }
            if (aVMusic.isLoopMusic() && (extendMusicList = aVMusic.getExtendMusicList()) != null) {
                extendMusicList.clear();
            }
            ArrayList arrayList = new ArrayList();
            aVMusic.setMaxLoopDuration(i);
            for (int i2 = iMin; i2 < i; i2 += iMin) {
                arrayList.add(aVMusic.deepCopy());
            }
            if (!arrayList.isEmpty()) {
                aVMusic.setExtendMusicList(arrayList);
            }
        }
        return aVMusic;
    }
}
