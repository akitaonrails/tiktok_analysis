package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499670Jif extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499670Jif(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initRegionLabel", "initRegionLabel(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        PreviewSettingsConfigBridge previewSettingsConfigBridge = (PreviewSettingsConfigBridge) this.receiver;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = previewSettingsConfigBridge.LLILZIL;
        View view = c499640Jic2.LIZ;
        C16F5 c16f5 = c499640Jic2.LIZLLL;
        C20743716Ff c20743716Ff = c499640Jic2.LJI;
        C20484615Do c20484615Do = previewSettingsConfigBridge.LLILLL;
        DataChannel dataChannel = previewSettingsConfigBridge.LLILLJJLI;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.YO(view, c16f5, c20743716Ff, null, null, c20484615Do, dataChannel);
        }
        return Unit.LIZ;
    }
}
