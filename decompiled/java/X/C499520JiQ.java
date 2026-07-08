package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0JiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499520JiQ extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499520JiQ(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initDonationView", "initDonationView(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = ((PreviewSettingsConfigBridge) this.receiver).LLILZIL;
        View view = c499640Jic.LIZ;
        DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.EQ2(basePreviewSettingMainFragmentSheetInitializer.LL, RoomCreateInfoChannel.class, new AwS378S0200000_12(view, basePreviewSettingMainFragmentSheetInitializer, 57));
        }
        return Unit.LIZ;
    }
}
