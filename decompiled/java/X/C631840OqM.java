package X;

import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellAdd2DspViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellFeaturedVideosIconViewModelCompose;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631840OqM extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C632090Oql LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ OriginMusicListViewModel LLILLL;
    public final /* synthetic */ MusicPlayViewModel LLILZ;
    public final /* synthetic */ MusicHighlightBackgroundViewModel LLILZIL;
    public final /* synthetic */ MusicCellCollectIconViewModelCompose LLILZLL;
    public final /* synthetic */ MusicCellAdd2DspViewModelCompose LLIZ;
    public final /* synthetic */ MusicCellFeaturedVideosIconViewModelCompose LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631840OqM(C632090Oql c632090Oql, int i, OriginMusicListViewModel originMusicListViewModel, MusicPlayViewModel musicPlayViewModel, MusicHighlightBackgroundViewModel musicHighlightBackgroundViewModel, MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose, MusicCellAdd2DspViewModelCompose musicCellAdd2DspViewModelCompose, MusicCellFeaturedVideosIconViewModelCompose musicCellFeaturedVideosIconViewModelCompose, int i2) {
        super(2);
        this.LL = c632090Oql;
        this.LLILLJJLI = i;
        this.LLILLL = originMusicListViewModel;
        this.LLILZ = musicPlayViewModel;
        this.LLILZIL = musicHighlightBackgroundViewModel;
        this.LLILZLL = musicCellCollectIconViewModelCompose;
        this.LLIZ = musicCellAdd2DspViewModelCompose;
        this.LLIZLLLIL = musicCellFeaturedVideosIconViewModelCompose;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) throws Throwable {
        num.intValue();
        C631830OqL.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1));
        return Unit.LIZ;
    }
}
