package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0P0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637900P0i extends C09AY implements Function1<C0P1Y, Unit> {
    public final /* synthetic */ VideoMusicTitleAssem LL;
    public final /* synthetic */ Music LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637900P0i(VideoMusicTitleAssem videoMusicTitleAssem, Music music) {
        super(1);
        this.LL = videoMusicTitleAssem;
        this.LLILLJJLI = music;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0P1Y c0p1y) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List<MusicOwnerInfo> artistProfileList;
        if (!c0p1y.LLILLJJLI) {
            this.LL.Qq(this.LLILLJJLI);
            VideoMusicTitleAssem videoMusicTitleAssem = this.LL;
            C724270Sb3 c724270Sb3 = videoMusicTitleAssem.LLJI;
            Object obj5 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!C729510SjV.LJJIIZ(((VideoItemParams) obj).getAweme())) {
                C724270Sb3 c724270Sb32 = videoMusicTitleAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                String aid = ((VideoItemParams) obj2).getAweme().getAid();
                if (aid != null) {
                    C724270Sb3 c724270Sb33 = videoMusicTitleAssem.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    Music music = ((VideoItemParams) obj3).getAweme().getMusic();
                    if (music != null && (artistProfileList = music.getArtistProfileList()) != null && (!artistProfileList.isEmpty())) {
                        videoMusicTitleAssem.fq().LL.put(aid, artistProfileList);
                    }
                    C724270Sb3 c724270Sb34 = videoMusicTitleAssem.LLJI;
                    if (c724270Sb34 != null) {
                        obj4 = c724270Sb34.LL;
                    } else {
                        obj4 = null;
                    }
                    C724270Sb3 c724270Sb35 = videoMusicTitleAssem.LLJI;
                    if (c724270Sb35 != null) {
                        obj5 = c724270Sb35.LL;
                    }
                    videoMusicTitleAssem.fq().LLILLJJLI.put(aid, Integer.valueOf(((VideoItemParams) obj5).getAweme().getMusicTitleStyle()));
                }
            }
        }
        return Unit.LIZ;
    }
}
