package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935820aSa implements ViewModelProvider.Factory {
    public final DataChannel LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C935820aSa(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (this.LIZ != null && cls.isAssignableFrom(AigcWallpaperAnchorViewModel.class)) {
            return new AigcWallpaperAnchorViewModel(this.LIZ);
        }
        if (this.LIZ != null && cls.isAssignableFrom(AigcWallpaperGuestViewModel.class)) {
            return new AigcWallpaperGuestViewModel(this.LIZ);
        }
        if (this.LIZ != null && cls.isAssignableFrom(KaraokeAnchorViewModel.class)) {
            return new KaraokeAnchorViewModel(this.LIZ);
        }
        if (this.LIZ != null && cls.isAssignableFrom(KaraokeGuestViewModel.class)) {
            return new KaraokeGuestViewModel(this.LIZ);
        }
        throw new IllegalArgumentException("UnKnown class");
    }
}
