package X;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;

/* JADX INFO: renamed from: X.0JBW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBW {
    public static final boolean LIZLLL(BasePanelUISlotComponent basePanelUISlotComponent) {
        Activity activityLIZ;
        Context context = basePanelUISlotComponent.getContext();
        C19EG c19eg = null;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        }
        if (c19eg == null || !Hox.LLJILJIL.LIZ(c19eg).KQ2("For You")) {
            return false;
        }
        return true;
    }

    public static final int LIZ(int i, Context context) {
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(int r3, java.lang.Object... r4) {
        /*
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto Lc
            android.app.Activity r1 = r0.LIZIZ()
            if (r1 != 0) goto L15
        Lc:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
        L15:
            r2 = 0
            int r0 = r4.length     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L22
            if (r1 == 0) goto L2e
            goto L30
        L22:
            if (r1 == 0) goto L2e
            int r0 = r4.length     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.getString(r3, r0)     // Catch: java.lang.Throwable -> L38
            goto L34
        L2e:
            r1 = r2
            goto L34
        L30:
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L38
        L34:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L38
            goto L44
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L44:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L4b
            r2 = r1
        L4b:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L51
            java.lang.String r2 = ""
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JBW.LIZJ(int, java.lang.Object[]):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(int r3, int r4, java.lang.Object... r5) {
        /*
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto Lc
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 != 0) goto L15
        Lc:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
        L15:
            r2 = 0
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r1 = r2
            goto L2a
        L1b:
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L19
            int r0 = r5.length     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getQuantityString(r3, r4, r0)     // Catch: java.lang.Throwable -> L2e
        L2a:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L41
            r2 = r1
        L41:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L47
            java.lang.String r2 = ""
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JBW.LIZIZ(int, int, java.lang.Object[]):java.lang.String");
    }
}
