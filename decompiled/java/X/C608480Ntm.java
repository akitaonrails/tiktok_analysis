package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ntm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608480Ntm extends C09AY implements Function2<VideoMusicTitleAssem, C608290NtT, Unit> {
    public C608480Ntm() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C608290NtT c608290NtT) {
        Object obj;
        Music music;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        C608290NtT c608290NtT2 = c608290NtT;
        if (c608290NtT2 != null && !videoMusicTitleAssem2.LLLJIL && c608290NtT2.LIZ.length() > 0) {
            C724270Sb3 c724270Sb3 = videoMusicTitleAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (aweme != null && (music = aweme.getMusic()) != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null && !tT2DSPSongInfos.isEmpty()) {
                Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it2.next().songId, c608290NtT2.LIZ)) {
                        videoMusicTitleAssem2.Rt1();
                        break;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
