package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspLinkState;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.LogData;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicETBusinessModule;
import com.ss.android.ugc.aweme.music.model.TTToDspLogExtra;

/* JADX INFO: renamed from: X.0OpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631160OpG {
    public static LogData LIZ(C631640Oq2 c631640Oq2, Music music) {
        DspPlatform dspPlatformLJIILJJIL = C633020OsG.LIZIZ.LJIILJJIL(music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.PROFILE_MUSIC_TAB;
        C0P0X c0p0x = C0P0X.SMALL;
        String str = "profile_music_tab_others";
        if (c631640Oq2.LIZJ) {
            str = "profile_music_tab_personal";
        }
        return new LogData(dspPlatformLJIILJJIL, enumC631120OpC, c0p0x, str, str, MusicETBusinessModule.MUSIC_TAB, null, music, null, null, "", "", CardStruct.IStatusCode.DEFAULT, null, null, new TTToDspLogExtra(), "", null, null, false, 0, null);
    }

    public static AddSongContextData LIZIZ(C631640Oq2 c631640Oq2, Music music, DspPlatform dspPlatform) {
        String id;
        DspLinkState dspLinkState;
        String str = "profile_music_tab_others";
        if (c631640Oq2.LIZJ) {
            str = "profile_music_tab_personal";
        }
        MusicETBusinessModule musicETBusinessModule = MusicETBusinessModule.MUSIC_TAB;
        String eventValue = C0P0X.SMALL.getEventValue();
        MatchedSoundInfo matchedSongInfo = music.getMatchedSongInfo();
        if (matchedSongInfo != null) {
            id = matchedSongInfo.getId();
        } else {
            id = null;
        }
        String strLIZLLL = C630980Ooy.LIZLLL(music);
        EnumC631120OpC enumC631120OpC = EnumC631120OpC.PROFILE_MUSIC_TAB;
        if (dspPlatform == DspPlatform.UNKNOWN) {
            dspLinkState = DspLinkState.UNLINKED;
        } else {
            dspLinkState = DspLinkState.LINKED;
        }
        return new AddSongContextData(str, str, musicETBusinessModule, null, "", eventValue, music, 0, id, "", strLIZLLL, enumC631120OpC, dspLinkState, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, false, null, false, 2147475464, null);
    }
}
