package X;

import com.bytedance.android.live.room.SubscribeSuccessToastEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0KIT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIT {
    public static final void LIZIZ(String str) {
        if (C500260Jjc.LJJIIZ(str)) {
            C766270U4b.LJIIJJI(str);
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (str == null) {
            str = "";
        }
        dataChannelGlobal.HQ2(SubscribeSuccessToastEvent.class, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[PHI: r7
      0x0016: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:10:0x0014, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C0KJK r10, com.bytedance.android.live.base.model.user.SubscribeBadge r11) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.room.SubscribeSuccessEvent> r1 = com.bytedance.android.live.room.SubscribeSuccessEvent.class
            r5 = 0
            if (r10 == 0) goto L28
            boolean r6 = r10.LJIIIIZZ
            boolean r5 = r10.LJII
        Lb:
            java.lang.String r8 = ""
            if (r10 == 0) goto L13
            java.lang.String r7 = r10.LJI
            if (r7 != 0) goto L16
        L13:
            r7 = r8
            if (r10 == 0) goto L1b
        L16:
            java.lang.String r0 = r10.LJIIIZ
            if (r0 == 0) goto L1b
            r8 = r0
        L1b:
            X.0K6y r3 = new X.0K6y
            r9 = 0
            r10 = 604(0x25c, float:8.46E-43)
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.HQ2(r1, r3)
            return
        L28:
            r6 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KIT.LIZ(X.0KJK, com.bytedance.android.live.base.model.user.SubscribeBadge):void");
    }
}
