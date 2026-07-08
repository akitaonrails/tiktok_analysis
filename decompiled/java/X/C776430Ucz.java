package X;

import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableScreenCaptureInterruptCheckSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ucz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776430Ucz {
    public final /* synthetic */ GameBroadcastFragment LIZ;

    public final void LIZ() {
        C776870Udh c776870Udh;
        EnableScreenCaptureInterruptCheckSetting enableScreenCaptureInterruptCheckSetting = EnableScreenCaptureInterruptCheckSetting.INSTANCE;
        if (!enableScreenCaptureInterruptCheckSetting.enable() || (c776870Udh = this.LIZ.LLJJIJI) == null) {
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (enableScreenCaptureInterruptCheckSetting.enable()) {
            c776870Udh.LIZJ.zW(PauseLiveChannel.class, Boolean.TRUE);
            C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Uf6
                public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P0;
                public final EnumC777480Ueg LJFF = EnumC777480Ueg.CAPTURE_ERROR;
                public final CharSequence LJI = C497740JfY.LJIJI(2131853810);

                {
                    this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uf7
                        public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

                        @Override // X.AbstractC777790UfB
                        public final EnumC777770Uf9 LIZ() {
                            return this.LIZ;
                        }
                    };
                    this.LIZ = new AbstractC777790UfB() { // from class: X.0Uf8
                        public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_WHITE;

                        @Override // X.AbstractC777790UfB
                        public final EnumC777770Uf9 LIZ() {
                            return this.LIZ;
                        }
                    };
                    this.LIZLLL = "error";
                }

                @Override // X.AbstractC777950UfR
                public final EnumC777930UfP LIZJ() {
                    return this.LJ;
                }

                @Override // X.AbstractC777950UfR
                public final CharSequence LIZLLL() {
                    return this.LJI;
                }

                @Override // X.AbstractC777950UfR
                public final EnumC777480Ueg LJ() {
                    return this.LJFF;
                }
            });
            c776870Udh.LJJJJJ = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_message_alert_pause_hover_show");
            c474500IjALIZ.LJJII(c776870Udh.LJIILIIL(), "anchor_id");
            c474500IjALIZ.LJJII("screen_share", "live_type");
            c474500IjALIZ.LJJII(Long.valueOf(c776870Udh.LJIILL()), "room_id");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZIZ() {
        C776870Udh c776870Udh = this.LIZ.LLJJIJI;
        if (c776870Udh != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            c776870Udh.LJIJJ(true);
        }
    }

    public final void LIZJ() {
        if (this.LIZ.LLJJIJI != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    public final void LIZLLL() {
        C776870Udh c776870Udh = this.LIZ.LLJJIJI;
        if (c776870Udh != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            c776870Udh.LJIJJ(false);
            if (EnableScreenCaptureInterruptCheckSetting.INSTANCE.enable()) {
                try {
                    C777840UfG.LIZIZ(EnumC777480Ueg.CAPTURE_ERROR);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("GameUiStrategy", "onLiveStart", e);
                }
            }
        }
    }

    public final void LJ() {
        C776870Udh c776870Udh = this.LIZ.LLJJIJI;
        if (c776870Udh != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            c776870Udh.LJIJJ(true);
        }
    }

    public C776430Ucz(GameBroadcastFragment gameBroadcastFragment) {
        this.LIZ = gameBroadcastFragment;
    }
}
