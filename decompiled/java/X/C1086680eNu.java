package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.dialogoeventbserver.LiveDialogStatusEventObserverManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086680eNu implements ViewModelProvider.Factory {
    public final /* synthetic */ DataChannel LIZ;
    public final /* synthetic */ Fragment LIZIZ;

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
        return new LiveDialogStatusEventObserverManager(this.LIZIZ, this.LIZ);
    }

    public C1086680eNu(Fragment fragment, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = fragment;
    }
}
