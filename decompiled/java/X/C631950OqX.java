package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631950OqX extends C09AY implements Function1<C631220OpM, Unit> {
    public final /* synthetic */ MusicPlayViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MusicModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ArtistHonorLabel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631950OqX(MusicPlayViewModel musicPlayViewModel, boolean z, MusicModel musicModel, int i, boolean z2, ArtistHonorLabel artistHonorLabel, boolean z3, Integer num, Integer num2, boolean z4) {
        super(1);
        this.LL = musicPlayViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = musicModel;
        this.LLILZ = i;
        this.LLILZIL = z2;
        this.LLILZLL = artistHonorLabel;
        this.LLIZ = z3;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
        this.LLJI = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C631220OpM c631220OpM) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        MusicPlayViewModel musicPlayViewModel = this.LL;
        boolean z = this.LLILLJJLI;
        MusicModel musicModel = this.LLILLL;
        int i = this.LLILZ;
        EnumC631410Opf enumC631410Opf = c631220OpM.LLILLJJLI;
        boolean z2 = this.LLILZIL;
        ArtistHonorLabel artistHonorLabel = this.LLILZLL;
        boolean z3 = this.LLIZ;
        Integer num = this.LLIZLLLIL;
        Integer num2 = this.LLJ;
        boolean z4 = this.LLJI;
        if (musicPlayViewModel.LLIZLLLIL) {
            str = "personal_homepage";
            str2 = "";
        } else {
            str = "others_homepage";
            str2 = musicPlayViewModel.LLIZ;
        }
        if (z4) {
            str3 = "spotlight";
        } else {
            str3 = "personal_list";
        }
        if (musicPlayViewModel.LLJ) {
            if (enumC631410Opf != EnumC631410Opf.PLAYING) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
                c2344009Gk.LJIIIIZZ("button_type", "play_music");
                c2344009Gk.LJIIIIZZ("search_result_id", musicModel.getMusicId());
                c2344009Gk.LIZJ(i, "rank");
                C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
            }
        } else {
            if (enumC631410Opf == EnumC631410Opf.PLAYING) {
                str4 = "pause";
            } else {
                str4 = "play";
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("previous_page", musicPlayViewModel.getPreviousPage());
            c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk2.LJIIIIZZ("to_user_id", str2);
            c2344009Gk2.LIZJ(i, "pos");
            c2344009Gk2.LIZJ(z ? 1 : 0, "is_pin_to_top");
            c2344009Gk2.LJIIIIZZ("play_status", str4);
            c2344009Gk2.LJIIIIZZ("enter_method", str3);
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJIIIIZZ("music_new_flag", str5);
            c2344009Gk2.LIZJ(z2 ? 1 : 0, "highlight");
            if (artistHonorLabel != null) {
                c2344009Gk2.LJFF("artist_type", artistHonorLabel.getLabel());
            }
            if (z3) {
                if (num != null && num2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(num);
                    sbLIZ.append('-');
                    sbLIZ.append(num2);
                    c2344009Gk2.LJFF("similar_song_order", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (num != null) {
                c2344009Gk2.LJFF("main_song_order", String.valueOf(num));
            }
            C20684815ws.LJIILLIIL("play_music", c2344009Gk2.LIZ);
        }
        return Unit.LIZ;
    }
}
