package X;

import Y.ARunnableS124S0100000_24;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601420rm8 {
    public static final C1601420rm8 LIZ = new C1601420rm8();

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:58|13)|56|18|54|23|52|28|50|42|48|45|34|(1:41)(1:37)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[PHI: r4
      0x0070: PHI (r4v9 java.lang.String) = (r4v1 java.lang.String), (r4v10 java.lang.String) binds: [B:20:0x006d, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[PHI: r4 r5
      0x007e: PHI (r4v8 java.lang.String) = (r4v2 java.lang.String), (r4v9 java.lang.String) binds: [B:25:0x007b, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r5v7 java.lang.String) = (r5v1 java.lang.String), (r5v8 java.lang.String) binds: [B:25:0x007b, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[PHI: r4 r5 r6
      0x008c: PHI (r4v7 java.lang.String) = (r4v3 java.lang.String), (r4v8 java.lang.String) binds: [B:30:0x0089, B:27:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v7 java.lang.String) binds: [B:30:0x0089, B:27:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v6 java.lang.String) binds: [B:30:0x0089, B:27:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601420rm8.LIZIZ(android.content.Intent):void");
    }

    public static final boolean LIZJ(Intent intent) {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (intent.getIntExtra("is_from_push", 0) != 1) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(Intent intent) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadFeedRequest() called with: realHasCache = ");
        C0NET.LIZ.getClass();
        sbLIZ.append(C0NET.LJIIZILJ(true));
        sbLIZ.append("   isFeedNoCache = ");
        sbLIZ.append(C104100aN.LIZ().LJIILIIL());
        sbLIZ.append("   ColdBootUIExperiments.INSTANCE.getDelayFeedRequestOpt() = ");
        sbLIZ.append(C285090BFj.LIZ());
        sbLIZ.append("   !((instance as ColdBootLogger).getFirstFeedShowAd()) = ");
        if (C1150504el.LIZ().LJIIJJI == 1) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(true ^ z);
        sbLIZ.append("  ProcessStartupReason.isLaunchFromHomeAbsolutely() = ");
        sbLIZ.append(C2456309jt.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        if (C285090BFj.LIZ() && C0CBM.LIZ()) {
            if (((Boolean) C285090BFj.LJJIJL.getValue()).booleanValue()) {
                C0CN5.LIZ(((Boolean) C285090BFj.LJJIL.getValue()).booleanValue(), ((Boolean) C285090BFj.LJJIZ.getValue()).booleanValue(), ((Number) C285090BFj.LJJJI.getValue()).longValue(), new ARunnableS124S0100000_24(intent, 131));
                return;
            } else {
                C0CN5.LIZ(((Boolean) C285090BFj.LJJIL.getValue()).booleanValue(), ((Boolean) C285090BFj.LJJIZ.getValue()).booleanValue(), ((Number) C285090BFj.LJJJI.getValue()).longValue(), new ARunnableS124S0100000_24(intent, 132));
                return;
            }
        }
        LIZ.getClass();
        LIZIZ(intent);
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
