package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMorePanelViewModel;
import com.bytedance.android.livesdk.broadcast.interaction.function.ToolbarCampaignCenterViewModel;
import com.bytedance.android.livesdk.broadcast.stablemode.StableModeViewModel;
import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;

/* JADX INFO: renamed from: X.0UNS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNS implements ViewModelProvider.Factory {
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
        if (cls.isAssignableFrom(BroadcastMorePanelViewModel.class)) {
            return new BroadcastMorePanelViewModel();
        }
        if (cls.isAssignableFrom(ToolbarCampaignCenterViewModel.class)) {
            return new ToolbarCampaignCenterViewModel();
        }
        if (cls.isAssignableFrom(NoiseSuppressionViewModel.class)) {
            return new NoiseSuppressionViewModel();
        }
        if (cls.isAssignableFrom(StableModeViewModel.class)) {
            return new StableModeViewModel();
        }
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
