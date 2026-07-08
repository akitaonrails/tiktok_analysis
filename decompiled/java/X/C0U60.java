package X;

import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;

/* JADX INFO: renamed from: X.0U60, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U60 {
    public static final /* synthetic */ int LIZ = 0;

    public static StickerEffectViewModel LIZ() {
        return (StickerEffectViewModel) C0U61.LIZ(new C767530U8x(LiveStickerDataSourceOptSetting.INSTANCE.enable() ? new C0UMB(C0UD4.LIZIZ) : new C0UMA(C0UD4.LIZIZ), new C0U6F())).get(StickerEffectViewModel.class);
    }

    public static BgEffectViewModel LIZIZ() {
        return (BgEffectViewModel) new ViewModelProvider(C0UPT.LL, new C766180U3s(new C0UMA("livebackground"), new C0U6F())).get(BgEffectViewModel.class);
    }
}
