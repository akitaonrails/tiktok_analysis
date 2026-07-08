package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767530U8x implements ViewModelProvider.Factory {
    public final InterfaceC401501hF LIZ;
    public final C0U6F LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (this.LIZ != null && this.LIZIZ != null && cls.isAssignableFrom(StickerEffectViewModel.class)) {
            return new StickerEffectViewModel(this.LIZ, this.LIZIZ);
        }
        if (cls.isAssignableFrom(MultiGuestStickerViewModel.class)) {
            return new MultiGuestStickerViewModel();
        }
        if (cls.isAssignableFrom(NaviAvatarListViewModel.class)) {
            return new NaviAvatarListViewModel(new C0U94());
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C767530U8x(InterfaceC401501hF interfaceC401501hF, C0U6F c0u6f) {
        this.LIZ = interfaceC401501hF;
        this.LIZIZ = c0u6f;
    }
}
