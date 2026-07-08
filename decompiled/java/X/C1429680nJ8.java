package X;

import com.ss.android.ugc.aweme.creative.model.music.FusedMusicCreationModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicFusionCreationInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429680nJ8 {
    public static final MusicFusionCreationInfo LIZ(MusicBuzModel musicBuzModel) {
        ArrayList arrayList = new ArrayList();
        for (MusicBuzModel musicBuzModel2 : (ArrayList) LIZIZ(musicBuzModel)) {
            C443120HZe<Long, Integer, Integer> c443120HZeLIZLLL = LIZLLL(musicBuzModel2);
            if (c443120HZeLIZLLL != null) {
                arrayList.add(new FusedMusicCreationModel(c443120HZeLIZLLL.getFirst(), Integer.valueOf(arrayList.size()), c443120HZeLIZLLL.getSecond(), c443120HZeLIZLLL.getThird(), 0, false, Double.valueOf(((double) musicBuzModel2.musicVolume) * ((double) 50))));
            }
        }
        return new MusicFusionCreationInfo(arrayList, 0);
    }

    public static final List<MusicBuzModel> LIZIZ(MusicBuzModel musicBuzModel) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(musicBuzModel);
        List<MusicBuzModel> list = musicBuzModel.extendMusicList;
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((MusicBuzModel) obj).music != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final String LIZJ(MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        String strValueOf;
        if (musicBuzModel == null || (musicObject = musicBuzModel.music) == null || (strValueOf = String.valueOf(musicObject.id)) == null) {
            return "";
        }
        return strValueOf;
    }

    public static final C443120HZe<Long, Integer, Integer> LIZLLL(MusicBuzModel musicBuzModel) {
        int i;
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject == null) {
            return null;
        }
        int i2 = musicBuzModel.musicEndFromCut;
        if (i2 > 0) {
            i = i2 - musicBuzModel.musicStartFromCut;
        } else {
            i = musicObject.duration;
            int i3 = musicObject.shootDuration;
            if (i - i3 > 1000) {
                i = i3;
            }
        }
        return new C443120HZe<>(Long.valueOf(musicObject.id), 0, Integer.valueOf(i));
    }

    public static final boolean LJ(MusicBuzModel musicBuzModel) {
        if (musicBuzModel == null) {
            return false;
        }
        int i = musicBuzModel.musicType;
        if (i == 0) {
            if (musicBuzModel.music != null) {
                return true;
            }
        } else if (i == 3 || i == 6) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(MusicBuzModel musicBuzModel) {
        MusicObject musicObject;
        if (musicBuzModel != null && (musicObject = musicBuzModel.music) != null && musicObject.memeSong != null) {
            return true;
        }
        return false;
    }
}
