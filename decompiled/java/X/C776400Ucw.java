package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Ucw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776400Ucw implements InterfaceC779560Ui2 {
    public final /* synthetic */ C776410Ucx LIZ;

    @Override // X.InterfaceC779560Ui2
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC779560Ui2
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC779560Ui2
    public final void LIZJ() {
        C776410Ucx c776410Ucx = this.LIZ;
        c776410Ucx.LLIZ = false;
        Map<String, Object> map = C1338270kvh.LIZ;
        c776410Ucx.LIZJ("", false);
        this.LIZ.LIZ();
        this.LIZ.LLILLJJLI.LIZIZ().UO0(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // X.InterfaceC779560Ui2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            r4 = this;
            X.0Ucx r2 = r4.LIZ
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r3 = 1
            if (r1 < r0) goto L2f
            r2.getClass()
            com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting r0 = com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting.INSTANCE
            boolean r0 = r0.enable()
            r2 = 0
            if (r0 == 0) goto L26
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.game.common.datachannel.GameLiveInternalRecordFallbackChannel> r0 = com.bytedance.android.livesdk.game.common.datachannel.GameLiveInternalRecordFallbackChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L26
        L25:
            r2 = 1
        L26:
            X.0Ucx r1 = r4.LIZ
            r1.LLIZ = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            if (r2 != 0) goto L33
            return
        L2f:
            r2.getClass()
            goto L25
        L33:
            r1.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776400Ucw.LJIIIIZZ():void");
    }

    public C776400Ucw(C776410Ucx c776410Ucx) {
        this.LIZ = c776410Ucx;
    }
}
