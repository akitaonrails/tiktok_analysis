package X;

import Y.AcS186S0300000_12;
import android.content.Context;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Tqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759550Tqr implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 203;
    }

    public static final void LIZLLL(DataChannel dataChannel, String str) {
        String strLIZ;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_microphone_occupied_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "btn_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        LiveMode liveMode;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        Context context = c500840JkY.LIZ;
        String strLIZ = null;
        if (C0U30.LIZ(context, null)) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131843086);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843085));
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843083), new AcS186S0300000_12(this, c500840JkY, c23260099m, 4));
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843084), new AcS186S0300000_12(this, c500840JkY, c23260099m, 0));
            c782110Um9.LJIILLIIL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
            DataChannel dataChannel = c500840JkY.LIZIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_microphone_occupied_popup_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                strLIZ = C354201Zc.LIZ(liveMode);
            }
            c474500IjALIZ.LJJII(strLIZ, "live_type");
            c474500IjALIZ.LIZ();
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
