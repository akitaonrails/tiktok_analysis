package X;

import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcCombineSetting;

/* JADX INFO: renamed from: X.0TCV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCV implements C0TC3 {
    public final /* synthetic */ C743070TCv LIZ;

    @Override // X.C0TC3
    public final void LIZ(String str, String str2, String str3) {
    }

    @Override // X.C0TC3
    public final void LIZJ() {
    }

    @Override // X.C0TC3
    public final void LIZLLL(DualSourceStateMessage dualSourceStateMessage) {
    }

    public C0TCV(C743070TCv c743070TCv) {
        this.LIZ = c743070TCv;
    }

    @Override // X.C0TC3
    public final boolean LIZIZ(int i) {
        boolean z;
        int iIntValue;
        C11PQ<Integer> c11pq;
        Integer numLJLZ;
        if (GameDualDeviceRtcCombineSetting.INSTANCE.isDefault() && i == C0TC1.LIVE_STATE_TIME_OUT.getCode()) {
            C1276370jJr c1276370jJr = this.LIZ.LLILZIL;
            z = false;
            if (c1276370jJr != null && (c11pq = c1276370jJr.LJIIL) != null && (numLJLZ = c11pq.LJLZ()) != null) {
                iIntValue = numLJLZ.intValue();
                if (iIntValue == 0) {
                }
                String str = C743070TCv.LLJJL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDisconnected error = ");
                sbLIZ.append(i);
                sbLIZ.append(",userNum = ");
                sbLIZ.append(iIntValue);
                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                }
                return z;
            }
            iIntValue = 0;
            z = true;
            String str2 = C743070TCv.LLJJL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDisconnected error = ");
            sbLIZ2.append(i);
            sbLIZ2.append(",userNum = ");
            sbLIZ2.append(iIntValue);
            C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
            }
            return z;
        }
        z = true;
        ((C0TD0) this.LIZ.LLJJ.getValue()).LJ = i;
        return z;
    }
}
