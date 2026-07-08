package X;

import com.bytedance.android.live.ShowUserProfileEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147370fxn extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ MusicGiftDetailViewModel LL;
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147370fxn(MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(1);
        this.LL = musicGiftDetailViewModel;
        this.LLILLJJLI = musicGiftDetailPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        MusicGiftDetailViewModel musicGiftDetailViewModel = this.LL;
        if (jLongValue <= 0) {
            musicGiftDetailViewModel.getClass();
        } else {
            C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
            C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
            C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
            musicGiftDetailViewModel.yQ2();
            c1147090fxL.LIZIZ("author", c1147350fxlBQ2, c1147390fxpXQ2);
        }
        MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LLILLJJLI;
        musicGiftDetailPageDialogFragment.getClass();
        if (jLongValue > 0) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(jLongValue);
            userProfileEvent.mSource = "music_gift_secondary_page";
            userProfileEvent.mShowEntrance = "music_gift_secondary_page";
            userProfileEvent.clickModule = "music_gift_artist_name";
            DataChannel dataChannel = musicGiftDetailPageDialogFragment.LLJLLL;
            if (dataChannel != null) {
                dataChannel.LC0(ShowUserProfileEvent.class, userProfileEvent);
            } else {
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                if (iActionHandlerService != null) {
                    iActionHandlerService.showUserProfile(jLongValue);
                }
            }
        }
        return Unit.LIZ;
    }
}
