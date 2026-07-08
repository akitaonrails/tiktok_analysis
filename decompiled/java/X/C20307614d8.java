package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.loader.app.LoaderManagerImpl;
import com.ss.android.ugc.aweme.album.AlbumUpdateGuideViewModel;

/* JADX INFO: renamed from: X.14d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20307614d8 implements ViewModelProvider.Factory {
    public final int $t;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C20307614d8(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C20307614d8 c20307614d8, Class cls) {
        return new LoaderManagerImpl.LoaderViewModel();
    }

    public static final ViewModel create$1(C20307614d8 c20307614d8, Class cls) {
        return new AlbumUpdateGuideViewModel();
    }
}
