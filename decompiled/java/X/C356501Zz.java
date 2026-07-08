package X;

/* JADX INFO: renamed from: X.01Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C356501Zz {
    public static C01ZR LIZIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("TOP_GUEST");
        if (objLJIIIZ instanceof C01ZR) {
            return (C01ZR) objLJIIIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r6) {
        /*
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestTopGuestGamePlaySetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestTopGuestGamePlaySetting.INSTANCE
            boolean r5 = r0.isEnableTopGuest()
            r4 = 0
            if (r6 == 0) goto L53
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r6.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
        L11:
            r3 = 1
            if (r0 == 0) goto L51
            java.lang.String r2 = r0.roomCreateAbParam
            if (r2 == 0) goto L51
            com.google.gson.Gson r1 = X.C19748512Ol.LIZJ
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            com.google.gson.n r1 = (com.google.gson.n) r1
            if (r1 == 0) goto L36
            java.lang.String r0 = "linkmic_ab_params"
            com.google.gson.k r0 = r1.LJJIIZ(r0)
            if (r0 == 0) goto L36
            com.google.gson.n r1 = r0.LJIILIIL()
            java.lang.String r0 = "multi_guest_top_guest_opt"
            com.google.gson.k r4 = r1.LJJIIZ(r0)
        L36:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L51
        L4a:
            r0 = 1
        L4b:
            if (r5 != 0) goto L50
            if (r0 != 0) goto L50
            r3 = 0
        L50:
            return r3
        L51:
            r0 = 0
            goto L4b
        L53:
            r0 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356501Zz.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel):boolean");
    }
}
