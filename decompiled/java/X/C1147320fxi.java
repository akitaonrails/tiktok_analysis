package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147320fxi extends C2217421BqW implements Function0<Unit> {
    public C1147320fxi(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onPlayPauseClicked", "onPlayPauseClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1142100fpI c1142100fpI;
        InterfaceC1147550fy5 interfaceC1147550fy5B20;
        C1142100fpI c1142100fpILIZ;
        InterfaceC1147550fy5 interfaceC1147550fy5B202;
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        musicGiftDetailViewModel.wQ2();
        C1147350fxl c1147350fxlBQ2 = musicGiftDetailViewModel.BQ2();
        C1142100fpI c1142100fpI2 = musicGiftDetailViewModel.LLL;
        EnumC1142150fpN enumC1142150fpN = (c1142100fpI2 == null || !MusicGiftDetailViewModel.KQ2(c1142100fpI2, musicGiftDetailViewModel.LLJILJIL, musicGiftDetailViewModel.LLJILLL)) ? null : c1142100fpI2.LJIJ;
        if ((c1147350fxlBQ2 != null && (c1142100fpILIZ = musicGiftDetailViewModel.SQ2(c1147350fxlBQ2)) != null) || ((c1142100fpI = musicGiftDetailViewModel.LLL) != null && MusicGiftDetailViewModel.KQ2(c1142100fpI, musicGiftDetailViewModel.LLJILJIL, musicGiftDetailViewModel.LLJILLL) && (c1142100fpILIZ = C1142100fpI.LIZ(c1142100fpI, EnumC1142190fpR.SECONDARY_PAGE, null, null, null, null, null, null, false, 4194047)) != null)) {
            if (enumC1142150fpN != EnumC1142150fpN.PLAYING && enumC1142150fpN != EnumC1142150fpN.LOADING) {
                C1147090fxL c1147090fxL = musicGiftDetailViewModel.LLJLL;
                C1147390fxp c1147390fxpXQ2 = musicGiftDetailViewModel.xQ2();
                musicGiftDetailViewModel.yQ2();
                c1147090fxL.LIZIZ("play_song", c1147350fxlBQ2, c1147390fxpXQ2);
            }
            IMusicGiftService iMusicGiftService = musicGiftDetailViewModel.LLJLILLLLZIIL;
            if (iMusicGiftService != null && (interfaceC1147550fy5B202 = iMusicGiftService.b20()) != null) {
                interfaceC1147550fy5B202.LIZIZ(musicGiftDetailViewModel.LLJZ, c1142100fpILIZ);
            }
        } else if (c1147350fxlBQ2 != null) {
            musicGiftDetailViewModel.LLL = null;
            IMusicGiftService iMusicGiftService2 = musicGiftDetailViewModel.LLJLILLLLZIIL;
            if (iMusicGiftService2 != null && (interfaceC1147550fy5B20 = iMusicGiftService2.b20()) != null) {
                interfaceC1147550fy5B20.LIZ();
            }
            musicGiftDetailViewModel.QQ2();
        }
        return Unit.LIZ;
    }
}
