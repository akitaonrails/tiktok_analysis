package X;

/* JADX INFO: renamed from: X.0UXG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UXG {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.EnumC1102750enp> LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5, com.bytedance.ies.sdk.datachannel.DataChannel r6) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 0
            if (r6 == 0) goto L64
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r1 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r4 = r6.gg0(r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r4
        L10:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r3 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r5 != r3) goto L1e
            X.0enp r1 = X.EnumC1102750enp.REVERSE_CAMERA
            r2.add(r1)
            X.0enp r1 = X.EnumC1102750enp.MIRROR_CAMERA
            r2.add(r1)
        L1e:
            if (r5 == r3) goto L28
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_VOICE
            if (r5 == r1) goto L28
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r5 != r1) goto L2d
        L28:
            X.0enp r1 = X.EnumC1102750enp.MUTE_MIC
            r2.add(r1)
        L2d:
            if (r5 != r3) goto L46
            if (r4 == 0) goto L62
            com.bytedance.android.livesdkapi.depend.model.live.LiveRecordConfig r1 = r4.liveRecordConfig
            if (r1 == 0) goto L62
            boolean r1 = r1.canRecord
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L3b:
            boolean r1 = X.C500260Jjc.LJJJI(r1)
            if (r1 == 0) goto L46
            X.0enp r1 = X.EnumC1102750enp.RECORD_LIVE
            r2.add(r1)
        L46:
            if (r5 != r3) goto L58
            if (r6 == 0) goto L52
            java.lang.Class<com.bytedance.android.live.broadcast.api.StartPushStreamChannel> r0 = com.bytedance.android.live.broadcast.api.StartPushStreamChannel.class
            java.lang.Object r0 = r6.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L52:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L5c
        L58:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r5 != r0) goto L61
        L5c:
            X.0enp r0 = X.EnumC1102750enp.PAUSE_LIVE
            r2.add(r0)
        L61:
            return r2
        L62:
            r1 = r0
            goto L3b
        L64:
            r4 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UXG.LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode, com.bytedance.ies.sdk.datachannel.DataChannel):java.util.List");
    }
}
