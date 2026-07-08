package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingsConfigBridge;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS290S0000000_7;

/* JADX INFO: renamed from: X.0JiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C499500JiO extends C2217421BqW implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public C499500JiO(PreviewSettingsConfigBridge previewSettingsConfigBridge) {
        super(3, previewSettingsConfigBridge, PreviewSettingsConfigBridge.class, "initAutoCover", "initAutoCover(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/android/live/broadcast/settingpage/SettingsItemVhViews;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = ((PreviewSettingsConfigBridge) this.receiver).LLILZIL;
        View view = c499640Jic.LIZ;
        basePreviewSettingMainFragmentSheetInitializer.getClass();
        if (view != null) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new ACListenerS147S0100000_12(basePreviewSettingMainFragmentSheetInitializer, 316), view);
            C444140HbI.LIZ(view, AFwS290S0000000_7.get$arr$(18));
        }
        return Unit.LIZ;
    }
}
