package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465190oEP {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(AVMusic aVMusic, Integer num) {
        Integer numValueOf;
        if (C1399580mWa.LIZ() && aVMusic != null && C1459090o4Z.LIZ(aVMusic) && aVMusic.getMusicEndTime() > aVMusic.getMusicBeginTime()) {
            return aVMusic.getMusicEndTime() - aVMusic.getMusicBeginTime();
        }
        if (num != null) {
            return num.intValue();
        }
        if (aVMusic != null && (numValueOf = Integer.valueOf(aVMusic.getDuration())) != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static int LIZJ(MusicModel musicModel, Integer num) {
        Integer numValueOf;
        if (C1399580mWa.LIZ() && musicModel != null && C1459090o4Z.LIZIZ(musicModel) && musicModel.getMusicEndTime() > musicModel.getMusicBeginTime()) {
            return musicModel.getMusicEndTime() - musicModel.getMusicBeginTime();
        }
        if (num != null) {
            return num.intValue();
        }
        if (musicModel != null && (numValueOf = Integer.valueOf(musicModel.getDuration())) != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static int LIZIZ(MusicBuzModel musicBuzModel, MusicModel musicModel, Integer num) {
        int i;
        if ((C1399580mWa.LIZ() || C1452500ntw.LIZ()) && C1459090o4Z.LIZIZ(musicModel) && musicBuzModel != null && Intrinsics.LJFF(C1429680nJ8.LIZJ(musicBuzModel), musicModel.getMusicId()) && (i = musicBuzModel.originalMusicEndFromFollowup) > 0) {
            return i - musicBuzModel.originalMusicStartFromFollowup;
        }
        if ((C1399580mWa.LIZ() || C1452500ntw.LIZ()) && C1459090o4Z.LIZIZ(musicModel) && musicModel.getMusicEndTime() > 0) {
            return musicModel.getMusicEndTime() - musicModel.getMusicStart();
        }
        if (num != null) {
            return num.intValue();
        }
        return musicModel.getDuration();
    }
}
