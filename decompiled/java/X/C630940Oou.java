package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import com.ss.android.ugc.aweme.music.ui.artistprofile.ArtistProfileTuxSheetFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0Oou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630940Oou extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ArtistProfileTuxSheetFragment LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ Music LLILLL;
    public final /* synthetic */ List<UncertMusicOwnerInfo> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ View LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630940Oou(ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment, Aweme aweme, Music music, List<UncertMusicOwnerInfo> list, String str, String str2, boolean z, int i, int i2, View view) {
        super(1);
        this.LL = artistProfileTuxSheetFragment;
        this.LLILLJJLI = aweme;
        this.LLILLL = music;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment = this.LL;
        assembler2.DQ2(artistProfileTuxSheetFragment, new C630950Oov(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, artistProfileTuxSheetFragment));
        assembler2.QQ2(this.LL, new AwS581S0100000_2(this.LLJI, 271));
        return Unit.LIZ;
    }
}
