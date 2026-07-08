package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkGuestViewStartOptSetting;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467680IVq {
    public DataChannel LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL = true;
    public boolean LJ;
    public String LJFF;

    public final void LIZJ() {
        int i = this.LIZIZ;
        if (i > 0) {
            LJ(i, "live_play", this.LJFF);
        }
        this.LIZJ = true;
    }

    public C467680IVq(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static boolean LIZIZ(SeiRegion seiRegion) {
        Integer numLJIIJJI;
        String str = seiRegion.contentType;
        if (str != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        } else {
            numLJIIJJI = null;
        }
        if ((numLJIIJJI != null && numLJIIJJI.intValue() != 0) || seiRegion.uidStr == null) {
            return false;
        }
        return true;
    }

    public final void LIZ(int i, String str) {
        if (LiveSdkGuestViewStartOptSetting.isEnable()) {
            int i2 = this.LIZIZ;
            if (i2 <= 0) {
                if (i > 0 && this.LIZJ && this.LIZLLL) {
                    LJ(i, "connection_start", str);
                }
            } else if (i <= 0 && this.LIZLLL) {
                LIZLLL(i2, "connection_over", str);
            }
            this.LIZIZ = i;
            return;
        }
        int i3 = this.LIZIZ;
        if (i3 <= 0) {
            if (i > 0) {
                if (!this.LIZJ && this.LIZLLL) {
                    LJ(i, "live_play", str);
                } else if (this.LIZJ && this.LIZLLL) {
                    LJ(i, "connection_start", str);
                }
            }
        } else if (i <= 0 && this.LIZLLL) {
            LIZLLL(i3, "connection_over", str);
        }
        this.LIZIZ = i;
    }

    public final void LIZLLL(int i, String str, String str2) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            iInteractService.mN0(i, this.LIZ, str, str2);
        }
    }

    public final void LJ(int i, String str, String str2) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            iInteractService.Oo2(i, this.LIZ, str, str2);
        }
    }
}
