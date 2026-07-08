package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;

/* JADX INFO: renamed from: X.0JiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499510JiP extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499510JiP(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initIntroView", "initIntroView(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = ((PreviewSettingsConfigBridge) this.receiver).LLILZIL;
        View view = c499640Jic.LIZ;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C753070TgP.LJFF(basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI, AFwS237S0000000_7.get$arr$(266), new AwS373S0200000_7(view, basePreviewSettingMainFragmentSheetInitializer, 51));
        return Unit.LIZ;
    }
}
