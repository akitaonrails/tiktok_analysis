package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.FinishPreviewBlockInfoEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveContinueDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771840UPm {
    public final Fragment LIZ;
    public final DataChannel LIZIZ;
    public C0ULC LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Boolean LJFF;

    public final boolean LIZ() {
        LiveMode liveMode;
        if (!this.LIZLLL && !C500260Jjc.LJJIJIL(this.LJFF) && this.LJ) {
            DataChannel dataChannel = this.LIZIZ;
            Boolean boolValueOf = null;
            if (dataChannel == null || dataChannel.gg0(PreviewBlockInfoChannel.class) == null) {
                DataChannel dataChannel2 = this.LIZIZ;
                if (!C500260Jjc.LJJJI(dataChannel2 != null ? (Boolean) dataChannel2.gg0(LiveAccessTipsShowChannel.class) : null)) {
                    DataChannel dataChannel3 = this.LIZIZ;
                    if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) != null) {
                        boolValueOf = Boolean.valueOf(C354201Zc.LIZLLL(liveMode));
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        return LIZIZ();
                    }
                }
            }
        }
        return false;
    }

    public final boolean LIZIZ() {
        C0ULC c0ulc;
        LiveDialog dialog;
        if (this.LIZJ == null) {
            this.LIZJ = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).Z70(this.LIZ);
        }
        C0ULC c0ulc2 = this.LIZJ;
        if (!C500260Jjc.LJJJI(c0ulc2 != null ? Boolean.valueOf(c0ulc2.LJJLIL()) : null) || (c0ulc = this.LIZJ) == null || (dialog = c0ulc.getDialog()) == null) {
            return false;
        }
        dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC786080UsY(this, 26));
        this.LIZLLL = true;
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZ(dialog, C0URF.HIGH, new C0UQ3() { // from class: X.0UPo
            @Override // X.C0UQ3
            public final void LIZ() {
                C771840UPm c771840UPm = this.LIZ;
                C0ULC c0ulc3 = c771840UPm.LIZJ;
                if (c0ulc3 != null) {
                    c771840UPm.LIZ.getLifecycle().addObserver(c0ulc3);
                }
            }
        }, null);
        return true;
    }

    public C771840UPm(Fragment fragment, DataChannel dataChannel) {
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(fragment, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 788));
            dataChannel.EQ2(fragment, FinishPreviewBlockInfoEvent.class, new AwS591S0100000_12(this, 789));
            dataChannel.EQ2(fragment, GameLiveContinueDialogShowChannel.class, new AwS591S0100000_12(this, 790));
        }
    }
}
