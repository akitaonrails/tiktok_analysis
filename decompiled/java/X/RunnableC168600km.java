package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.00km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC168600km implements Runnable {
    public final /* synthetic */ Room LL;
    public final /* synthetic */ int LLILLJJLI;

    public RunnableC168600km(int i, Room room) {
        this.LL = room;
        this.LLILLJJLI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            java.lang.String r3 = "MultiLiveAudienceLogger@4877.logAudienceGetAnchorPannelSettingSuccessRate$1"
            X.C1C7U.LIZ(r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r11.LL     // Catch: java.lang.Throwable -> L40
            r7 = 0
            if (r0 == 0) goto L3e
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings r0 = r0.multiLiveUserSettings     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings r0 = r0.multiLiveUserApplySettings     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission r0 = r0.multiLiveUserApplyPermission     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L3e
            int r0 = r0.multiLiveApplyPermission     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L40
            r5 = 1
            if (r2 == 0) goto L3e
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L40
            if (r0 == r5) goto L33
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L40
            r0 = 2
            if (r1 == r0) goto L33
            int r1 = r2.intValue()     // Catch: java.lang.Throwable -> L40
            r0 = 3
            if (r1 != r0) goto L3e
        L33:
            java.lang.String r4 = "audience_get_anchor_pannel_setting"
            int r6 = r11.LLILLJJLI     // Catch: java.lang.Throwable -> L40
            r8 = r7
            r9 = r7
            r10 = r7
            X.C924640aAY.LIZLLL(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L40
            goto L4b
        L3e:
            r5 = 0
            goto L33
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L4b
            throw r1
        L4b:
            X.C1C7U.LIZIZ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC168600km.run():void");
    }
}
