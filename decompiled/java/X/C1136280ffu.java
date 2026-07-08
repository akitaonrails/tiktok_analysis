package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0ffu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136280ffu {
    public final InterfaceC1136810fgl LIZ;
    public Room LIZIZ;
    public boolean LIZJ;
    public InterfaceC1140970fnT LIZLLL;
    public InterfaceC1140970fnT LJ;
    public C1138600fje LJFF;
    public AnonymousClass0956 LJI;
    public InterfaceC1138060fim LJII;

    public C1136280ffu(InterfaceC1136810fgl interfaceC1136810fgl) {
        this.LIZ = interfaceC1136810fgl;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.message.GiftMessage r7, X.C1135280feI r8, int r9, java.lang.String r10) {
        /*
            r6 = this;
            X.0fgl r0 = r6.LIZ
            r0.onShowVideoError(r8)
            X.0ffg r5 = X.C1136940fgy.LIZ
            X.0fgl r0 = r6.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.getDataChannel()
            if (r7 == 0) goto L59
            boolean r0 = r7.LLILLL
            if (r0 == 0) goto L2d
            java.lang.String r2 = "_self"
        L15:
            X.0fgl r0 = r6.LIZ
            int r1 = r0.getShowErrorToast()
            X.0fgl r0 = r6.LIZ
            int r0 = r0.getGiftType()
            r5.getClass()
            X.C1136140ffg.LIZIZ(r9, r1, r0, r2, r10)
            X.0fgl r0 = r6.LIZ
            r0.onVideoFinished()
            return
        L2d:
            if (r1 == 0) goto L50
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L50
            long r3 = r0.getOwnerUserId()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            java.lang.String r2 = "_anchor"
            goto L15
        L50:
            boolean r0 = X.C1128450fTH.LJJIJ()
            if (r0 == 0) goto L59
            java.lang.String r2 = "_guest"
            goto L15
        L59:
            java.lang.String r2 = ""
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136280ffu.LIZ(com.bytedance.android.livesdk.model.message.GiftMessage, X.0feI, int, java.lang.String):void");
    }
}
