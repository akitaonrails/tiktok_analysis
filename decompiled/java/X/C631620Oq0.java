package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631620Oq0 extends C09AY implements Function1<C631690Oq7, C631690Oq7> {
    public final /* synthetic */ MusicModel LL;
    public final /* synthetic */ MusicCellCollectIconViewModelCompose LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631620Oq0(MusicModel musicModel, MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose, String str, int i, boolean z) {
        super(1);
        this.LL = musicModel;
        this.LLILLJJLI = musicCellCollectIconViewModelCompose;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // kotlin.jvm.functions.Function1
    public final C631690Oq7 invoke(C631690Oq7 c631690Oq7) {
        boolean zBooleanValue;
        String str;
        String str2;
        ?? r4;
        String str3;
        C631690Oq7 c631690Oq72 = c631690Oq7;
        String musicId = this.LL.getMusicId();
        Boolean bool = this.LLILLJJLI.LL.get(musicId);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z = !zBooleanValue;
        this.LLILLJJLI.LL.put(musicId, Boolean.valueOf(z));
        MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose = this.LLILLJJLI;
        String str4 = this.LLILLL;
        MusicModel musicModel = this.LL;
        int i = this.LLILZ;
        boolean z2 = this.LLILZIL;
        C631640Oq2 c631640Oq2 = musicCellCollectIconViewModelCompose.LLILLJJLI;
        if (c631640Oq2 != null && c631640Oq2.LIZJ) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (c631640Oq2 == null || c631640Oq2.LIZJ || (str2 = c631640Oq2.LIZ) == null) {
            str2 = "";
        }
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("previous_page", str4);
            c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk.LJIIIIZZ("enter_method", "personal_list");
            c2344009Gk.LJIIIIZZ("to_user_id", str2);
            c2344009Gk.LIZJ(i, "pos");
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_pin_to_top");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("music_new_flag", str3);
            C20684815ws.LJIILLIIL("favourite_song", c2344009Gk.LIZ);
            r4 = z;
        } else {
            r4 = 0;
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("previous_page", str4);
            c2344009Gk2.LJIIIIZZ("music_id", musicModel.getMusicId());
            c2344009Gk2.LJIIIIZZ("enter_method", "personal_list");
            c2344009Gk2.LJIIIIZZ("to_user_id", str2);
            c2344009Gk2.LIZJ(i, "pos");
            c2344009Gk2.LIZJ(z2 ? 1 : 0, "is_pin_to_top");
            C20684815ws.LJIILLIIL("cancel_favourite_song", c2344009Gk2.LIZ);
        }
        C1440005kM.LIZ(new C629770On1(this.LL, r4));
        MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose2 = this.LLILLJJLI;
        MusicModel musicModel2 = this.LL;
        if (r4 == 1) {
            musicCellCollectIconViewModelCompose2.LLILLL.LIZJ(1, musicModel2.getMusicId(), 1);
        } else if (r4 == 0) {
            musicCellCollectIconViewModelCompose2.LLILLL.LIZJ(1, musicModel2.getMusicId(), 0);
        } else {
            musicCellCollectIconViewModelCompose2.getClass();
        }
        return C631690Oq7.LIZ(c631690Oq72, this.LL.getMusicId(), r4, null, 4);
    }
}
