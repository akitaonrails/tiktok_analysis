package X;

import com.bytedance.android.live.livepullstream.api.IPullStreamService;

/* JADX INFO: renamed from: X.0KRI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRI extends C0KRJ {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        if (C0KRN.LIZ != null) {
            String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
            C0IEB c0iebLIZLLL = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Qt1().LIZLLL(str);
            C0KRL c0krl = C0KRN.LIZ;
            if (c0krl != null) {
                if (interfaceC480510IsrLIZIZ != null && c0krl.LIZIZ != interfaceC480510IsrLIZIZ.isMute()) {
                    interfaceC480510IsrLIZIZ.t0(str, "restore mute from JSB", c0krl.LIZIZ);
                }
                if (c0iebLIZLLL == null || (!c0krl.LIZ) != c0iebLIZLLL.isPlaying()) {
                    if (c0krl.LIZ) {
                        if (c0iebLIZLLL != null) {
                            c0iebLIZLLL.stopWhenJoinInteract();
                        }
                    } else if (c0iebLIZLLL != null) {
                        c0iebLIZLLL.tryResumePlay();
                    }
                }
            }
            C0KRN.LIZ = null;
        }
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            X.0KRK r9 = (X.C0KRK) r9
            java.lang.Number r3 = r9.getPause()
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r3 != 0) goto Le
            r3 = r2
        Le:
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r7 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            java.lang.Number r0 = r9.getMute()
            if (r0 == 0) goto L1e
            r2 = r0
        L1e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            X.0INV r0 = X.C0IL2.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r0.mEnterRoomConfig
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            java.lang.String r4 = r0.warmUpPlayerTag
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.0It8 r0 = r0.YY()
            X.0Isr r3 = r0.LIZIZ(r4)
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.0ILv r0 = r0.Qt1()
            X.0IEB r6 = r0.LIZLLL(r4)
            if (r6 == 0) goto L9f
            if (r3 == 0) goto L6b
            boolean r0 = r6.isPlaying()
            r2 = r0 ^ 1
            boolean r1 = r3.isMute()
            X.0KRL r0 = X.C0KRN.LIZ
            if (r0 != 0) goto L6b
            X.0KRL r0 = new X.0KRL
            r0.<init>(r2, r1)
            X.C0KRN.LIZ = r0
        L6b:
            boolean r0 = r6.isPlaying()
            if (r7 != r0) goto L9f
        L71:
            if (r3 == 0) goto L90
            boolean r0 = r3.isMute()
            if (r5 == r0) goto L90
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "set mute from JSB , current hybrid page url is "
            r1.append(r0)
            java.lang.String r0 = r8.getHybridUrl(r11)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.t0(r4, r0, r5)
        L90:
            java.lang.Class<X.0KRM> r1 = X.C0KRM.class
            r0 = 0
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r0)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = ""
            r10.onSuccess(r1, r0)
            return
        L9f:
            if (r7 == 0) goto La7
            if (r6 == 0) goto L71
            r6.stopWhenJoinInteract()
            goto L71
        La7:
            if (r6 == 0) goto L71
            r6.tryResumePlay()
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KRI.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
