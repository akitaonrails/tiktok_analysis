package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147300fxg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MusicGiftDetailViewModel LL;
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147300fxg(MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0);
        this.LL = musicGiftDetailViewModel;
        this.LLILLJJLI = musicGiftDetailPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1147410fxr c1147410fxr;
        C1147340fxk c1147340fxk = (C1147340fxk) this.LL.LLILZLL.getValue();
        MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LLILLJJLI;
        long j = c1147340fxk.LJII;
        long j2 = c1147340fxk.LJIILJJIL;
        musicGiftDetailPageDialogFragment.getClass();
        if (j > 0) {
            IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
            if (C500260Jjc.LJJJI(iMusicGiftService != null ? Boolean.valueOf(iMusicGiftService.Sd2(j, j2, musicGiftDetailPageDialogFragment.LLJLLL)) : null)) {
                MusicGiftDetailViewModel musicGiftDetailViewModel = musicGiftDetailPageDialogFragment.LLJZIJLIL;
                if (musicGiftDetailViewModel != null) {
                    C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
                    C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
                    C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
                    musicGiftDetailViewModel.yQ2();
                    C474500IjA c474500IjALIZ = c1147090fxL.LIZ("livesdk_music_gift_page_song_send", c1147350fxlBQ2, c1147390fxpXQ2);
                    int i = 0;
                    if (c1147350fxlBQ2 != null && (c1147410fxr = c1147350fxlBQ2.LJ) != null && c1147410fxr.LIZ == c1147090fxL.LIZIZ && c1147090fxL.LIZIZ > 0) {
                        i = 1;
                    }
                    c474500IjALIZ.LJJII(Integer.valueOf(i), "music_from_anchor");
                    c474500IjALIZ.LJJII(Long.valueOf(c1147350fxlBQ2 != null ? c1147350fxlBQ2.LIZIZ : 0L), "gift_price");
                    c474500IjALIZ.LIZ();
                }
                musicGiftDetailPageDialogFragment.close(1);
            }
        }
        return Unit.LIZ;
    }
}
