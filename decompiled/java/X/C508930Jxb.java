package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;

/* JADX INFO: renamed from: X.0Jxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508930Jxb implements ViewModelProvider.Factory {
    public final String LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C508930Jxb(String str) {
        this.LIZ = str;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(EmotePerformanceTrackerViewModel.class)) {
            return new EmotePerformanceTrackerViewModel(this.LIZ);
        }
        throw new IllegalArgumentException("EmotePerformanceTrackerViewModel.get(): Unknown ViewModel class");
    }
}
