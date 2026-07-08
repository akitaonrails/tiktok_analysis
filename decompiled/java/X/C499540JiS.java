package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS42S0500000_7;

/* JADX INFO: renamed from: X.0JiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499540JiS extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499540JiS(Object obj) {
        super(3, obj, PreviewSettingsConfigBridge.class, "initBoard", "initBoard(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = ((PreviewSettingsConfigBridge) this.receiver).LLILZIL;
        View view = c499640Jic2.LIZ;
        C16F5 c16f5 = c499640Jic2.LIZJ;
        LiveIconView liveIconView = c499640Jic2.LJIIIIZZ;
        View view2 = c499640Jic2.LJFF;
        basePreviewSettingMainFragmentSheetInitializer.LJIIJ(view, view2, liveIconView, c16f5);
        DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.BQ2(basePreviewSettingMainFragmentSheetInitializer.LLILZ, PanelLayoutTypeChangeEvent.class, new AwS42S0500000_7(basePreviewSettingMainFragmentSheetInitializer, view, c16f5, liveIconView, view2, 0));
        }
        return Unit.LIZ;
    }
}
