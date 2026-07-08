package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147440fxu extends C2217421BqW implements Function0<Unit> {
    public C1147440fxu(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onSongListScrolled", "onSongListScrolled()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
        C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
        C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
        C1147330fxj c1147330fxjYQ2 = musicGiftDetailViewModel.yQ2();
        C474500IjA c474500IjALIZ = c1147090fxL.LIZ("livesdk_music_gift_page_song_scroll", c1147350fxlBQ2, c1147390fxpXQ2);
        if (c1147330fxjYQ2 == null || (str = c1147330fxjYQ2.LIZIZ) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "tab_name");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
