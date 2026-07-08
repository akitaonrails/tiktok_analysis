package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499680Jig extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499680Jig(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initLocationNew", "initLocationNew(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        PreviewSettingsConfigBridge previewSettingsConfigBridge = (PreviewSettingsConfigBridge) this.receiver;
        previewSettingsConfigBridge.LLILZIL.LJJJJL(c499640Jic2.LIZ, c499640Jic2.LIZLLL, previewSettingsConfigBridge.LLILLJJLI);
        return Unit.LIZ;
    }
}
