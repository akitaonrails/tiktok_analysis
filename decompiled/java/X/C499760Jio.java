package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499760Jio extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499760Jio(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initGiftsWrapper", "initGiftsWrapper(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        PreviewSettingsConfigBridge previewSettingsConfigBridge = (PreviewSettingsConfigBridge) this.receiver;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = previewSettingsConfigBridge.LLILZIL;
        View view = c499640Jic2.LIZ;
        basePreviewSettingMainFragmentSheetInitializer.LLJJL = view;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        View view2 = c499640Jic2.LIZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(previewSettingsConfigBridge, 200), view2);
        }
        return Unit.LIZ;
    }
}
