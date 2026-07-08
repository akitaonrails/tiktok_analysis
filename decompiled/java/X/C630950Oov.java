package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.music.ui.artistprofile.ArtistProfileTuxSheetFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630950Oov extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Music LLILLJJLI;
    public final /* synthetic */ List<UncertMusicOwnerInfo> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ ArtistProfileTuxSheetFragment LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630950Oov(Aweme aweme, Music music, List<UncertMusicOwnerInfo> list, String str, String str2, boolean z, int i, int i2, ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = music;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = artistProfileTuxSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        c062p2.LIZ = new C630990Ooz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ.LL);
        c062p2.LIZIZ = "hierarchy_data_key";
        return Unit.LIZ;
    }
}
