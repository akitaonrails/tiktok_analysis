package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499620Jia extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499620Jia(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initVideoQuality", "initVideoQuality(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        ((PreviewSettingsConfigBridge) this.receiver).LLILZIL.LJJIIZ(c499640Jic2.LIZ, c499640Jic2.LJ);
        return Unit.LIZ;
    }
}
