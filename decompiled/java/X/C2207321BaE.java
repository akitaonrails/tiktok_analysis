package X;

import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveAnchorLynxCpuBoostABSetting;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1BaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207321BaE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        EnumC1153460g7c[] enumC1153460g7cArrValues = EnumC1153460g7c.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC1153460g7c enumC1153460g7c : enumC1153460g7cArrValues) {
            if (VBoostGoLiveSetting.INSTANCE.isEnable(enumC1153460g7c)) {
                arrayList.add(enumC1153460g7c);
            }
        }
        return arrayList.size() > 0 || LiveAnchorLynxCpuBoostABSetting.INSTANCE.enable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        r4 = r2.getKey();
        r4.LLILZLL = true;
        r3.LIZIZ.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        r1 = (java.util.TreeSet) ((java.util.HashMap) r3.LIZ).get(r4.LL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r1.contains(r4) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r1.remove(r4);
        r0 = r4.LLJILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        r0.LLILLJJLI.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (((java.util.HashMap) r3.LIZJ).get(r4.LL) == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        X.C2207231Ba5.LIZ(3);
        r0 = ((X.C2207331BaF) ((java.util.HashMap) r3.LIZJ).get(r4.LL)).LLJILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        r0.LLILLJJLI.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        r3.LIZLLL.submit(new X.CallableC2207391BaL(r4));
        r3.LJ.remove(((java.util.HashMap) r3.LIZJ).get(r4.LL));
        ((java.util.HashMap) r3.LIZJ).remove(r4.LL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        r3.LIZIZ.unlock();
        r1 = r4.LLIZLLLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        if (r1 == X.EnumC2207371BaJ.USE_PROVIDERS) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        if (r1 != X.EnumC2207371BaJ.USER_CANCEL) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        if (r4.LLJ != X.EnumC19848712lJ.DIRECT) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0144, code lost:
    
        X.C2207341BaG.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        r3.LJ.remove(r2.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        r3.LIZLLL.submit(new X.CallableC2207391BaL(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r3.LIZIZ.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0166, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0034, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207321BaE.LIZIZ():void");
    }
}
