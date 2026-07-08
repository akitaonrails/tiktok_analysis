package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631960OqY extends C09AY implements Function1<C631970OqZ, C631970OqZ> {
    public final /* synthetic */ MusicCellCollectIconViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MusicModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ ArtistHonorLabel LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631960OqY(MusicCellCollectIconViewModel musicCellCollectIconViewModel, String str, MusicModel musicModel, int i, boolean z, boolean z2, Integer num, Integer num2, ArtistHonorLabel artistHonorLabel, boolean z3) {
        super(1);
        this.LL = musicCellCollectIconViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = musicModel;
        this.LLILZ = i;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = num;
        this.LLIZLLLIL = num2;
        this.LLJ = artistHonorLabel;
        this.LLJI = z3;
    }

    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // kotlin.jvm.functions.Function1
    public final C631970OqZ invoke(C631970OqZ c631970OqZ) {
        String str;
        OriginMusicArg originMusicArg;
        String userId;
        String str2;
        ?? r12;
        String str3;
        C631970OqZ c631970OqZ2 = c631970OqZ;
        boolean z = !c631970OqZ2.LL;
        MusicCellCollectIconViewModel musicCellCollectIconViewModel = this.LL;
        String str4 = this.LLILLJJLI;
        MusicModel musicModel = this.LLILLL;
        int i = this.LLILZ;
        boolean z2 = this.LLILZIL;
        boolean z3 = this.LLILZLL;
        Integer num = this.LLIZ;
        Integer num2 = this.LLIZLLLIL;
        ArtistHonorLabel artistHonorLabel = this.LLJ;
        boolean z4 = this.LLJI;
        OriginMusicArg originMusicArg2 = (OriginMusicArg) musicCellCollectIconViewModel.LL.getValue();
        if (originMusicArg2 != null && originMusicArg2.isMe()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        OriginMusicArg originMusicArg3 = (OriginMusicArg) musicCellCollectIconViewModel.LL.getValue();
        if ((originMusicArg3 != null && originMusicArg3.isMe()) || (originMusicArg = (OriginMusicArg) musicCellCollectIconViewModel.LL.getValue()) == null || (userId = originMusicArg.getUserId()) == null) {
            userId = "";
        }
        if (z4) {
            str2 = "spotlight";
        } else {
            str2 = "personal_list";
        }
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("previous_page", str4);
            c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJIIIIZZ("to_user_id", userId);
            c2344009Gk.LIZJ(i, "pos");
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_pin_to_top");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("music_new_flag", str3);
            if (artistHonorLabel != null) {
                c2344009Gk.LJFF("artist_type", artistHonorLabel.getLabel());
            }
            if (z3) {
                if (num != null && num2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(num);
                    sbLIZ.append('-');
                    sbLIZ.append(num2);
                    c2344009Gk.LJFF("similar_song_order", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (!z3 && num != null) {
                c2344009Gk.LJFF("main_song_order", String.valueOf(num));
            }
            C20684815ws.LJIILLIIL("favourite_song", c2344009Gk.LIZ);
            r12 = z;
        } else {
            r12 = 0;
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("previous_page", str4);
            c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk2.LJIIIIZZ("enter_method", str2);
            c2344009Gk2.LJIIIIZZ("to_user_id", userId);
            c2344009Gk2.LIZJ(i, "pos");
            c2344009Gk2.LIZJ(z2 ? 1 : 0, "is_pin_to_top");
            C20684815ws.LJIILLIIL("cancel_favourite_song", c2344009Gk2.LIZ);
        }
        C1440005kM.LIZ(new C629770On1(this.LLILLL, r12));
        MusicCellCollectIconViewModel musicCellCollectIconViewModel2 = this.LL;
        MusicModel musicModel2 = this.LLILLL;
        if (r12 == 1) {
            musicCellCollectIconViewModel2.LLILLL.LIZJ(1, musicModel2.getMusicId(), 1);
        } else if (r12 == 0) {
            musicCellCollectIconViewModel2.LLILLL.LIZJ(1, musicModel2.getMusicId(), 0);
        } else {
            musicCellCollectIconViewModel2.getClass();
        }
        return C631970OqZ.LIZ(c631970OqZ2, r12, null, 2);
    }
}
