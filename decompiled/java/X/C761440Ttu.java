package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;

/* JADX INFO: renamed from: X.0Ttu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761440Ttu implements ViewModelProvider.Factory {
    public final C766010U3b LIZ;
    public final C766050U3f LIZIZ;

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
        if (cls.isAssignableFrom(VoiceEffectViewModel.class)) {
            return new VoiceEffectViewModel(this.LIZ, this.LIZIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C761440Ttu(C766010U3b c766010U3b, C766050U3f c766050U3f) {
        this.LIZ = c766010U3b;
        this.LIZIZ = c766050U3f;
    }
}
