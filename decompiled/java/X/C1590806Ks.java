package X;

import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: renamed from: X.06Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1590806Ks {
    public static final boolean LIZ;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    static {
        /*
            X.06Ks r0 = new X.06Ks
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L1a
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L1a
            r0 = 0
        L17:
            X.C1590806Ks.LIZ = r0
            return
        L1a:
            r0 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1590806Ks.<clinit>():void");
    }

    public static void LIZ(String str) {
        if (!LIZ) {
            return;
        }
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            iIMDebugService.LJIIIZ();
        }
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.LIZ(3, "Streak-Pet", str);
        }
    }

    public static void LIZIZ(String str) {
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            iIMDebugService.LJIIIZ();
        }
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.LIZ(6, "Streak-Pet", str);
        }
    }
}
