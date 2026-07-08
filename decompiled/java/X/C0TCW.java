package X;

import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcCombineSetting;

/* JADX INFO: renamed from: X.0TCW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCW implements C0TC2 {
    public final /* synthetic */ C0TCX LIZ;

    @Override // X.C0TC2
    public final void LIZ() {
        C0TCX c0tcx = this.LIZ;
        c0tcx.LJIIJJI = true;
        C0TC2 c0tc2 = c0tcx.LIZLLL;
        if (c0tc2 != null) {
            c0tc2.LIZ();
        }
        this.LIZ.LIZ(null);
        C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "onConnected");
        C742860TCa.LIZIZ(this.LIZ.LJFF, "source onConnected");
    }

    @Override // X.C0TC2
    public final void LJ() {
        C742860TCa.LIZIZ(this.LIZ.LJFF, "start heart beat()");
    }

    public C0TCW(C0TCX c0tcx) {
        this.LIZ = c0tcx;
    }

    @Override // X.C0TC2
    public final void LIZIZ(boolean z) {
        C0TC2 c0tc2 = this.LIZ.LIZLLL;
        if (c0tc2 != null) {
            c0tc2.LIZIZ(z);
        }
        String str = C0TCX.LJIILJJIL;
        String str2 = C0TCX.LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWsStateChanged isConnect = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0TC2
    public final boolean LIZJ(C0TCZ c0tcz) {
        boolean z;
        int iIntValue;
        C11PQ<Integer> c11pq;
        Integer numLJLZ;
        if (GameDualDeviceRtcCombineSetting.INSTANCE.isDefault() && c0tcz == C0TC0.STATE_TIME_OUT) {
            C1276370jJr c1276370jJr = this.LIZ.LJI;
            if (c1276370jJr != null && (c11pq = c1276370jJr.LJIIL) != null && (numLJLZ = c11pq.LJLZ()) != null) {
                iIntValue = numLJLZ.intValue();
                if (iIntValue != 0) {
                    z = false;
                }
                String str = C0TCX.LJIILJJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDisconnected error = ");
                sbLIZ.append(c0tcz);
                sbLIZ.append(",userNum = ");
                sbLIZ.append(iIntValue);
                C20441214yg.LJ(str, C2188811AlT.LIZIZ(sbLIZ));
                if (z) {
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("source onDisconnected error = ");
                sbLIZ2.append(c0tcz.getDescription());
                sbLIZ2.append(" result = ");
                sbLIZ2.append(z);
                C742860TCa.LIZIZ(this.LIZ.LJFF, C2188811AlT.LIZIZ(sbLIZ2));
                C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "onDisconnected");
                return z;
            }
            iIntValue = 0;
            z = true;
            String str2 = C0TCX.LJIILJJIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onDisconnected error = ");
            sbLIZ3.append(c0tcz);
            sbLIZ3.append(",userNum = ");
            sbLIZ3.append(iIntValue);
            C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ3));
            if (z) {
            }
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("source onDisconnected error = ");
            sbLIZ22.append(c0tcz.getDescription());
            sbLIZ22.append(" result = ");
            sbLIZ22.append(z);
            C742860TCa.LIZIZ(this.LIZ.LJFF, C2188811AlT.LIZIZ(sbLIZ22));
            C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "onDisconnected");
            return z;
        }
        z = true;
        C0TCX c0tcx = this.LIZ;
        c0tcx.LJIIJJI = false;
        c0tcx.LIZIZ();
        C0TC2 c0tc2 = this.LIZ.LIZLLL;
        if (c0tc2 != null) {
            c0tc2.LIZJ(c0tcz);
        }
        StringBuilder sbLIZ222 = C2188811AlT.LIZ();
        sbLIZ222.append("source onDisconnected error = ");
        sbLIZ222.append(c0tcz.getDescription());
        sbLIZ222.append(" result = ");
        sbLIZ222.append(z);
        C742860TCa.LIZIZ(this.LIZ.LJFF, C2188811AlT.LIZIZ(sbLIZ222));
        C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "onDisconnected");
        return z;
    }

    @Override // X.C0TC2
    public final void LIZLLL(DualSinkStateMessage dualSinkStateMessage) {
        C0TC2 c0tc2 = this.LIZ.LIZLLL;
        if (c0tc2 != null) {
            c0tc2.LIZLLL(dualSinkStateMessage);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source onLiveState message = ");
        sbLIZ.append(dualSinkStateMessage);
        C742860TCa.LIZIZ(this.LIZ.LJFF, C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LJIIIZ(C0TCX.LJIILJJIL, "onLiveState");
    }
}
