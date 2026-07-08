package X;

import com.tiktok.kmp.eventbus.IEventBusService;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19281010bw implements InterfaceC1604050rqN {
    public static final C19281010bw LIZ = new C19281010bw();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(498));

    @Override // X.InterfaceC1604050rqN
    public final void LIZ() {
        C01GW c01gw = LIZIZ;
        IEventBusService iEventBusService = (IEventBusService) c01gw.getValue();
        if (iEventBusService != null) {
            iEventBusService.LIZ();
        }
        IEventBusService iEventBusService2 = (IEventBusService) c01gw.getValue();
        if (iEventBusService2 != null) {
            iEventBusService2.LIZIZ(new C19280810bu() { // from class: X.10bv
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r3
      0x0023: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:7:0x0013, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1604050rqN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, android.app.Activity r6, final int r7, java.lang.String r8) {
        /*
            r4 = this;
            X.10Um r0 = X.C19254610Um.LIZIZ
            X.10SM r0 = r0.LJJIL()
            r0.LJIIJJI(r6, r5, r8)
            if (r5 == 0) goto L11
            java.lang.String r3 = r5.getAid()
            if (r3 != 0) goto L23
        L11:
            java.lang.String r3 = ""
            if (r5 != 0) goto L23
            r2 = 0
        L16:
            java.util.concurrent.ExecutorService r1 = X.C823050WQl.LIZIZ()
            X.10bx r0 = new X.10bx
            r0.<init>()
            r1.execute(r0)
            return
        L23:
            int r2 = r5.getAwemeType()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19281010bw.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, int, java.lang.String):void");
    }
}
