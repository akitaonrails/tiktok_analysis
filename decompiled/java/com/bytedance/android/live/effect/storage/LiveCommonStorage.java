package com.bytedance.android.live.effect.storage;

import X.C13VI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C768270UBt;
import X.EnumC1335420kr6;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastClearExpiredResourceNormal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommonStorage extends C13VI {
    public final File LIZIZ = null;

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "live_storage_business_tag";
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[EDGE_INSN: B:128:0x0142->B:61:0x0142 BREAK  A[LOOP:6: B:56:0x0129->B:130:?], EDGE_INSN: B:134:0x0142->B:61:0x0142 BREAK  A[LOOP:8: B:74:0x0185->B:136:?]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150 A[LOOP:9: B:62:0x014a->B:64:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIILL(boolean r14) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.storage.LiveCommonStorage.LJIILL(boolean):long");
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jLJIILL;
        long jLJIILL2 = 0;
        if (LiveBroadcastClearExpiredResourceNormal.enable()) {
            return 0L;
        }
        try {
            jLJIILL = LJIILL(false);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveCommonStorage search total size: ");
                sbLIZ.append(jLJIILL);
                sbLIZ.append(", doClean: ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ));
                if (jLJIILL > 0) {
                    if (z) {
                        jLJIILL2 = LJIILL(true);
                    } else {
                        jLJIILL2 = jLJIILL;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LiveCommonStorage delete total size: ");
                    sbLIZ2.append(jLJIILL2);
                    sbLIZ2.append(", canClean: ");
                    sbLIZ2.append(z);
                    C20441214yg.LIZIZ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ2));
                    C768270UBt.LIZ.getClass();
                    C768270UBt.LIZ((int) jLJIILL2, "LiveCommonStorage");
                    return jLJIILL2;
                }
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C768270UBt.LIZ.getClass();
                C768270UBt.LIZ(0, "catch_crash");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LiveCommonStorage, error log: ");
                sbLIZ3.append(Log.getStackTraceString(th));
                C20441214yg.LJ("LiveStorage", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } catch (Throwable th2) {
            th = th2;
            jLJIILL = jLJIILL2;
        }
        return jLJIILL;
    }
}
