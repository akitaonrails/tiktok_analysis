package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;

/* JADX INFO: renamed from: X.0IeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471440IeE implements ViewModelProvider.Factory {
    public final InterfaceC470890IdL LIZ;
    public InterfaceC470900IdM LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C471440IeE(FeedRepository feedRepository) {
        this.LIZ = feedRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            return new TabFeedViewModel(this.LIZ, this.LIZIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown model ");
        sbLIZ.append(cls.getName());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
