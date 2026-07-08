package X;

import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;

/* JADX INFO: renamed from: X.0TCR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCR implements C0TC3 {
    public final /* synthetic */ C0TCQ LIZ;

    @Override // X.C0TC3
    public final void LIZJ() {
        C0TCQ c0tcq = this.LIZ;
        c0tcq.LJ(c0tcq.LJIIJJI);
    }

    public final void LJ() {
        this.LIZ.LIZ.onNext(C0TCU.StateServerStart);
    }

    public C0TCR(C0TCQ c0tcq) {
        this.LIZ = c0tcq;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[ORIG_RETURN, RETURN] */
    @Override // X.C0TC3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r5) {
        /*
            r4 = this;
            X.0TCQ r0 = r4.LIZ
            X.0TCV r0 = r0.LJIIL
            r3 = 1
            if (r0 == 0) goto L40
            boolean r2 = r0.LIZIZ(r5)
            if (r2 != r3) goto L16
        Ld:
            X.0TCQ r0 = r4.LIZ
            X.11PQ<X.0TCU> r1 = r0.LIZ
            X.0TCU r0 = X.C0TCU.StateDisconnected
            r1.onNext(r0)
        L16:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onDisconnected error ="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " , result = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            X.0TCQ r0 = r4.LIZ
            X.0TCS r0 = r0.LJIIJJI
            java.lang.Long r0 = r0.LIZIZ
            X.C742860TCa.LIZ(r0, r1)
            X.0TCQ r1 = r4.LIZ
            r0 = 0
            r1.LJIIIIZZ = r0
            if (r2 == r3) goto L3f
            r3 = 0
        L3f:
            return r3
        L40:
            r2 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TCR.LIZIZ(int):boolean");
    }

    @Override // X.C0TC3
    public final void LIZLLL(DualSourceStateMessage dualSourceStateMessage) {
        boolean z;
        C11PQ<Boolean> c11pq = this.LIZ.LIZJ;
        if (dualSourceStateMessage.cameraState == 0) {
            z = true;
        } else {
            z = false;
        }
        c11pq.onNext(Boolean.valueOf(z));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraState = ");
        sbLIZ.append(dualSourceStateMessage.cameraState);
        C20441214yg.LJIIIZ("DualDeviceRtc", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onCameraState cameraState =");
        sbLIZ2.append(dualSourceStateMessage.cameraState);
        C742860TCa.LIZ(this.LIZ.LJIIJJI.LIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C0TC3
    public final void LIZ(String str, String str2, String str3) {
        this.LIZ.LIZ.onNext(C0TCU.StateConnected);
        C0TCQ c0tcq = this.LIZ;
        c0tcq.LJIIIIZZ = str2;
        c0tcq.LJIIIZ = str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConnected did =");
        sbLIZ.append(str);
        sbLIZ.append(",connectType=");
        sbLIZ.append(this.LIZ.LJIIIZ);
        C742860TCa.LIZ(this.LIZ.LJIIJJI.LIZIZ, C2188811AlT.LIZIZ(sbLIZ));
    }
}
