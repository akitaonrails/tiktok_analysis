package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;

/* JADX INFO: renamed from: X.0U76, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U76 implements ViewModelProvider.Factory {
    public final String LIZ;
    public final boolean LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public /* synthetic */ C0U76() {
        this(C0UD4.LJFF, true);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(LiveSmallItemBeautyViewModel.class)) {
            return new LiveSmallItemBeautyViewModel(new C0U8I(this.LIZ, this.LIZIZ));
        }
        throw new IllegalArgumentException("UnKnown class");
    }

    public C0U76(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
