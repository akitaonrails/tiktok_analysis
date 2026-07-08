package X;

import android.os.SystemClock;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147400fxq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147400fxq(MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0);
        this.LL = musicGiftDetailPageDialogFragment;
        this.LLILLJJLI = musicGiftDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LL;
        musicGiftDetailPageDialogFragment.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - musicGiftDetailPageDialogFragment.LLLFF >= 800) {
            musicGiftDetailPageDialogFragment.LLLFF = jUptimeMillis;
            MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLILLJJLI;
            C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
            C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
            C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
            musicGiftDetailViewModel.yQ2();
            c1147090fxL.LIZIZ("faq", c1147350fxlBQ2, c1147390fxpXQ2);
            MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment2 = this.LL;
            musicGiftDetailPageDialogFragment2.getClass();
            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
            if (iActionHandlerService != null) {
                iActionHandlerService.handle(musicGiftDetailPageDialogFragment2.getContext(), "aweme://roma_redirect/?spark_page=music_gift_viewer_faq");
            }
        }
        return Unit.LIZ;
    }
}
