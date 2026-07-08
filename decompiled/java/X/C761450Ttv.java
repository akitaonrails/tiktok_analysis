package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;

/* JADX INFO: renamed from: X.0Ttv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761450Ttv implements ViewModelProvider.Factory {
    public final C761960Tuk LIZ;
    public final C761740TuO LIZIZ;

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
        if (cls.isAssignableFrom(SoundEffectViewModel.class)) {
            return new SoundEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C761450Ttv(C761960Tuk c761960Tuk, C761740TuO c761740TuO) {
        this.LIZ = c761960Tuk;
        this.LIZIZ = c761740TuO;
    }
}
