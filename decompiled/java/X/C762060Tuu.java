package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Tuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762060Tuu implements ViewModelProvider.Factory {
    public final C763390Tx3 LIZ;
    public final DataChannel LIZIZ;

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
        return new BGMSongListViewModel(this.LIZ, this.LIZIZ);
    }

    public C762060Tuu(C763390Tx3 c763390Tx3, DataChannel dataChannel) {
        this.LIZ = c763390Tx3;
        this.LIZIZ = dataChannel;
    }
}
