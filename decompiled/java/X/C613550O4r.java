package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.compose.ArtistCertificationSoundOnBannerKt$ArtistCertificationSoundOnBanner$2$1", f = "ArtistCertificationSoundOnBanner.kt", l = {}, m = "invokeSuspend")
public final class C613550O4r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OriginMusicArg LL;
    public final /* synthetic */ User LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613550O4r(OriginMusicArg originMusicArg, User user, InterfaceC1364105Vn<? super C613550O4r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = originMusicArg;
        this.LLILLJJLI = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613550O4r(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String userId;
        String strLIZJ;
        C1C7U.LIZ("ArtistCertificationSoundOnBannerKt@a75.ArtistCertificationSoundOnBanner$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        OriginMusicArg originMusicArg = this.LL;
        if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
            userId = "";
        }
        c2344009Gk.LJIIIIZZ("to_user_id", userId);
        User user = this.LLILLJJLI;
        if (user == null || (strLIZJ = C632050Oqh.LIZJ(user)) == null) {
            strLIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strLIZJ);
        C20684815ws.LJIILLIIL("apply_music_tab_show", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArtistCertificationSoundOnBannerKt@a75.ArtistCertificationSoundOnBanner$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
