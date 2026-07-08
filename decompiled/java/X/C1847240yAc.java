package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeBenefitSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansLynxStickerExtra;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansStickerViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847240yAc extends AbstractC1847300yAi {
    public final FansStickerViewModel LLJI;
    public final FansLynxStickerExtra LLJIJIL;

    @Override // X.AbstractC1847300yAi
    public final Pair<Integer, Integer> B0() {
        FansLynxStickerExtra fansLynxStickerExtra = this.LLJIJIL;
        Integer numValueOf = Integer.valueOf(fansLynxStickerExtra != null ? C439101nJ.LIZ(fansLynxStickerExtra.maxWidth) : 0);
        FansLynxStickerExtra fansLynxStickerExtra2 = this.LLJIJIL;
        return new Pair<>(numValueOf, Integer.valueOf(fansLynxStickerExtra2 != null ? C439101nJ.LIZ(fansLynxStickerExtra2.maxHeight) : 0));
    }

    @Override // X.AbstractC1847300yAi
    public final void l0() {
        FansStickerViewModel fansStickerViewModel;
        super.l0();
        if (C500260Jjc.LJIIZILJ(getDataChannel()) || FansClubCustomizeBenefitSetting.INSTANCE.getValue()) {
            FansLynxStickerExtra fansLynxStickerExtra = this.LLJIJIL;
            if (fansLynxStickerExtra != null && (fansStickerViewModel = this.LLJI) != null) {
                fansStickerViewModel.LL = fansLynxStickerExtra;
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(getContext(), "aweme://roma_redirect/?spark_page=fan-club-custom-sticker", ViewTreeLifecycleOwner.get(this), true, new AwS606S0100000_27(this, 379));
            FansLynxStickerExtra fansLynxStickerExtra2 = this.LLJIJIL;
            int iLIZ = fansLynxStickerExtra2 != null ? C439101nJ.LIZ(fansLynxStickerExtra2.maxWidth) : 0;
            FansLynxStickerExtra fansLynxStickerExtra3 = this.LLJIJIL;
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, new FrameLayout.LayoutParams(iLIZ, fansLynxStickerExtra3 != null ? C439101nJ.LIZ(fansLynxStickerExtra3.maxHeight) : 0));
            addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1);
        }
    }

    @Override // X.AbstractC1847300yAi
    public final void p0() {
        super.p0();
        if (C500260Jjc.LJIIZILJ(getDataChannel())) {
            return;
        }
        FansClubCustomizeBenefitSetting.INSTANCE.getValue();
    }

    @Override // X.AbstractC1847300yAi
    public final void s0() {
        FansStickerViewModel fansStickerViewModel;
        super.s0();
        if ((!C500260Jjc.LJIIZILJ(getDataChannel()) && !FansClubCustomizeBenefitSetting.INSTANCE.getValue()) || this.LLJIJIL == null || (fansStickerViewModel = this.LLJI) == null) {
            return;
        }
        fansStickerViewModel.LL = null;
    }

    public C1847240yAc(RoomSticker roomSticker, Context context, DataChannel dataChannel) {
        FansLynxStickerExtra fansLynxStickerExtra;
        super(context, roomSticker, dataChannel, R.layout.hri);
        this.LLJI = C1094930ebD.LIZ.get();
        try {
            fansLynxStickerExtra = (FansLynxStickerExtra) C19748512Ol.LIZJ.LJII(roomSticker.extra, FansLynxStickerExtra.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            fansLynxStickerExtra = null;
        }
        this.LLJIJIL = fansLynxStickerExtra;
    }
}
