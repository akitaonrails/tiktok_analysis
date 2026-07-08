package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;

/* JADX INFO: renamed from: X.0y84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845660y84 implements ViewModelProvider.Factory {
    public final RssLinkParam LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C1845660y84(RssLinkParam rssLinkParam) {
        this.LIZ = rssLinkParam;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        return new RssLinkViewModel(this.LIZ, C1165270gQf.LIZIZ);
    }
}
