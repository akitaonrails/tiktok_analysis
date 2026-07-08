package X;

import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079440eCE extends GroupableElementSpecImpl {
    public C1079440eCE() {
        super(R.id.mvo);
        addSceneObserver(new DataChannelSceneObserver<EnumC1083260eIO, LiveExtendedScreenStatus>() { // from class: X.0eCY
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveExtendedScreenStatus> getType() {
                return LiveExtendedScreenStatus.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, EnumC1083260eIO enumC1083260eIO) {
                if (!LiveExtendedScreenUiOptimizeSetting.INSTANCE.hideFirstRow(layeredElementContext.getDataChannel())) {
                    if (enumC1083260eIO == EnumC1083260eIO.SHOW) {
                        constraintProperty.visibility(8);
                    } else {
                        if (enumC1083260eIO != EnumC1083260eIO.HIDE) {
                            return;
                        }
                        constraintProperty.visibility(0);
                    }
                }
            }
        });
    }
}
