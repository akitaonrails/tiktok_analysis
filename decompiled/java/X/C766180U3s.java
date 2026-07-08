package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;

/* JADX INFO: renamed from: X.0U3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766180U3s implements ViewModelProvider.Factory {
    public final C0UMA LIZ;
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
        if (this.LIZ != null && this.LIZIZ != null && cls.isAssignableFrom(BgEffectViewModel.class)) {
            return new BgEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C766180U3s(C0UMA c0uma, C0U6F c0u6f) {
        this.LIZ = c0uma;
        this.LIZIZ = c0u6f;
    }
}
