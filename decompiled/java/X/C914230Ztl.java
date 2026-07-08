package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEndLiveCardV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEndLivePageOptForGuestSetting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Ztl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914230Ztl {
    public static final List<String> LIZ = new ArrayList();
    public static final List<String> LIZIZ = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized boolean LIZ(java.lang.Long r7) {
        /*
            java.lang.Class<X.0Ztl> r6 = X.C914230Ztl.class
            monitor-enter(r6)
            r5 = 0
            if (r7 == 0) goto L3b
            long r3 = r7.longValue()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
            java.util.List<java.lang.String> r1 = X.C914230Ztl.LIZ     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L38
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L35
            boolean r0 = X.C930540aK4.LJFF()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L35
            X.0aAn r0 = X.C924790aAn.LIZLLL()     // Catch: java.lang.Throwable -> L38
            T r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L36
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L38
            r0 = 2
            if (r1 != r0) goto L36
        L35:
            r5 = 1
        L36:
            monitor-exit(r6)
            return r5
        L38:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L3b:
            monitor-exit(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914230Ztl.LIZ(java.lang.Long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void LIZIZ(Long l) {
        Integer num;
        if (!MultiGuestEndLivePageOptForGuestSetting.INSTANCE.enable() && !MultiGuestEndLiveCardV2Setting.INSTANCE.enable()) {
            return;
        }
        if (l != null && l.longValue() > 0) {
            if (!C930540aK4.LJFF() && ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) == null || num.intValue() != 2)) {
                return;
            }
            List<String> list = LIZ;
            if (((ArrayList) list).size() > 5) {
                C19719612Di.LJJIIZ(list);
            }
            ((ArrayList) list).add(l.toString());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markGuest, roomId = ");
            sbLIZ.append(l);
            C20441214yg.LIZIZ("MultiGuestGuestEndPageStateCache", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
