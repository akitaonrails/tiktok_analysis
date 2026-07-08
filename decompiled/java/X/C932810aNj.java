package X;

import com.bytedance.android.livesdk.utils.ActionFrequencyData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932810aNj {
    public final long LIZ;

    public static void LIZ() {
        Object objLIZJ;
        n nVarLIZIZ = InterfaceC934710aQn.Fb.LIZIZ();
        String str = null;
        if (nVarLIZIZ != null) {
            try {
                objLIZJ = C19748512Ol.LIZIZ.LIZJ(nVarLIZIZ, ActionFrequencyData.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLIZJ = null;
            }
            ActionFrequencyData actionFrequencyData = (ActionFrequencyData) objLIZJ;
            if (actionFrequencyData != null) {
                str = actionFrequencyData.savedTime;
            }
        }
        String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        LIZLLL(new ActionFrequencyData(str2, 0L));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ() {
        /*
            LIZ()
            X.14i1<com.google.gson.n> r0 = X.InterfaceC934710aQn.Fb
            java.lang.Object r2 = r0.LIZIZ()
            com.google.gson.k r2 = (com.google.gson.k) r2
            if (r2 == 0) goto L22
            java.lang.Class<com.bytedance.android.livesdk.utils.ActionFrequencyData> r1 = com.bytedance.android.livesdk.utils.ActionFrequencyData.class
            com.google.gson.Gson r0 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.LIZJ(r2, r1)     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L1b:
            com.bytedance.android.livesdk.utils.ActionFrequencyData r0 = (com.bytedance.android.livesdk.utils.ActionFrequencyData) r0
            if (r0 == 0) goto L22
            long r3 = r0.happenedCount
            goto L24
        L22:
            r3 = 0
        L24:
            com.bytedance.android.livesdk.utils.ActionFrequencyData r5 = new com.bytedance.android.livesdk.utils.ActionFrequencyData
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.<init>(r1, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r2.format(r0)
            r0 = 1
            long r3 = r3 + r0
            r5.<init>(r2, r3)
            LIZLLL(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932810aNj.LIZJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r7 = this;
            LIZ()
            X.14i1<com.google.gson.n> r0 = X.InterfaceC934710aQn.Fb
            java.lang.Object r2 = r0.LIZIZ()
            com.google.gson.k r2 = (com.google.gson.k) r2
            r3 = 0
            if (r2 == 0) goto L17
            java.lang.Class<com.bytedance.android.livesdk.utils.ActionFrequencyData> r1 = com.bytedance.android.livesdk.utils.ActionFrequencyData.class
            com.google.gson.Gson r0 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.LIZJ(r2, r1)     // Catch: java.lang.Throwable -> L19
            goto L1e
        L17:
            r6 = r3
            goto L24
        L19:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r3
        L1e:
            com.bytedance.android.livesdk.utils.ActionFrequencyData r0 = (com.bytedance.android.livesdk.utils.ActionFrequencyData) r0
            if (r0 == 0) goto L17
            java.lang.String r6 = r0.savedTime
        L24:
            X.14i1<com.google.gson.n> r0 = X.InterfaceC934710aQn.Fb
            java.lang.Object r2 = r0.LIZIZ()
            com.google.gson.k r2 = (com.google.gson.k) r2
            if (r2 == 0) goto L37
            java.lang.Class<com.bytedance.android.livesdk.utils.ActionFrequencyData> r1 = com.bytedance.android.livesdk.utils.ActionFrequencyData.class
            com.google.gson.Gson r0 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r3 = r0.LIZJ(r2, r1)     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L37:
            r4 = 0
            goto L44
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3e:
            com.bytedance.android.livesdk.utils.ActionFrequencyData r3 = (com.bytedance.android.livesdk.utils.ActionFrequencyData) r3
            if (r3 == 0) goto L37
            long r4 = r3.happenedCount
        L44:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "happenedCount = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "ActionFrequencyControl"
            X.C20441214yg.LIZIZ(r0, r1)
            r3 = 1
            if (r6 == 0) goto L63
            long r1 = r7.LIZ
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L63
            return r3
        L63:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C932810aNj.LIZIZ():boolean");
    }

    public C932810aNj(long j) {
        this.LIZ = j;
    }

    public static void LIZLLL(ActionFrequencyData actionFrequencyData) {
        C20337914i1<n> c20337914i1 = InterfaceC934710aQn.Fb;
        n nVar = null;
        try {
            String strLJIILL = C19748512Ol.LIZIZ.LJIILL(actionFrequencyData);
            if (strLJIILL != null) {
                try {
                    nVar = (n) C19748512Ol.LIZIZ.LJII(strLJIILL, n.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        c20337914i1.LJFF(nVar);
    }
}
