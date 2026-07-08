package X;

import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0uIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698620uIu implements InterfaceC1699130uJj {
    public final WeakReference<VideoLiveManager> LIZ;

    public C1698620uIu(VideoLiveManager videoLiveManager) {
        this.LIZ = new WeakReference<>(videoLiveManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r9) {
        /*
            r8 = this;
            java.lang.ref.WeakReference<com.ss.videoarch.liveplayer.VideoLiveManager> r0 = r8.LIZ
            java.lang.Object r5 = r0.get()
            com.ss.videoarch.liveplayer.VideoLiveManager r5 = (com.ss.videoarch.liveplayer.VideoLiveManager) r5
            if (r5 == 0) goto L8e
            X.0oIr r0 = r5.LIZLLL
            if (r0 == 0) goto L8e
            r5.LLLLZLL()
            r5.LLD()
            r7 = 1
            r5.LLLLJ(r7)
            X.0oIr r1 = r5.LIZLLL
            r0 = 1349(0x545, float:1.89E-42)
            X.0oMr r1 = (X.C1470430oMr) r1
            r1.LIZJ(r0, r7)
            boolean r0 = r5.LLJJJ()
            r6 = 2
            if (r0 == 0) goto L2c
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r5.LJIILLIIL
            r0.S1 = r6
        L2c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onRetryResetPlayer "
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
            X.C1698940uJQ.LIZJ()
            boolean r0 = r5.LJJJJ
            if (r0 != 0) goto L58
            r5.LJJJJ = r7
            com.ss.videoarch.liveplayer.log.LiveLoggerService r4 = r5.LJIILLIIL
            X.0oIr r3 = r5.LIZLLL
            r1 = 0
            X.0oMr r3 = (X.C1470430oMr) r3
            r0 = 314(0x13a, float:4.4E-43)
            long r1 = r3.LJIIJ(r0, r1)
            X.0uIh r0 = r4.LLILLL
            if (r0 == 0) goto L58
            r0.LJLLI = r1
        L58:
            r5.LJJJJ()
            X.0uIj r1 = r5.LJJII
            int r0 = r1.LIZLLL
            if (r0 != r7) goto L8f
            X.0uJF r0 = r1.LJIIJ()
            if (r0 == 0) goto Laf
            X.0uIj r0 = r5.LJJII
            X.0uJF r0 = r0.LJIIJ()
            java.lang.String r2 = r0.LIZ
        L6f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "retry url: "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.C1698940uJQ.LIZJ()
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r5.LJIILLIIL
            r0.LLJJIJIIJIL = r2
            X.0ooh r1 = r5.LJIIIZ
            X.0ooh r0 = X.EnumC1487690ooh.PREPARED
            if (r1 != r0) goto Lb1
            r5.LLLFF(r2)
        L8e:
            return
        L8f:
            if (r0 != r6) goto Laf
            java.lang.String r1 = r5.LLJILJIL
            java.lang.String r0 = "auto"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lac
            java.lang.String r4 = r5.LLILIL()
        L9f:
            X.0uIj r3 = r5.LJJII
            java.lang.String r2 = r5.LLJJ
            java.lang.String r1 = r5.LLJILLL
            boolean r0 = r5.LLJZIJLIL
            java.lang.String r2 = r3.LJIIJJI(r4, r2, r1, r0)
            goto L6f
        Lac:
            java.lang.String r4 = r5.LLJILJIL
            goto L9f
        Laf:
            r2 = 0
            goto L6f
        Lb1:
            r5.LJJIJLIJ()
            r5.LLLFF(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698620uIu.LIZ(boolean):void");
    }
}
