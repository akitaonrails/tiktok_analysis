package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenter.TTMStrategyRunCallBack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1BkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213711BkX implements TTMStrategyRunCallBack {
    public final AbstractC2213701BkW LIZ;

    public C2213711BkX(AbstractC2213701BkW abstractC2213701BkW) {
        this.LIZ = abstractC2213701BkW;
    }

    public final void LIZ(C2213641BkQ c2213641BkQ) {
        C830870Wib c830870Wib;
        C830870Wib c830870Wib2;
        for (AbstractC2213871Bkn abstractC2213871Bkn : (ArrayList) this.LIZ.LJII) {
            String str = null;
            try {
                WeakReference<C830870Wib> weakReference = this.LIZ.LJI;
                if (weakReference != null) {
                    c830870Wib2 = weakReference.get();
                } else {
                    c830870Wib2 = null;
                }
                abstractC2213871Bkn.LIZ(c830870Wib2, c2213641BkQ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (AbstractC19994813Le.Default.nextInt(1, 100001) <= C2213421Bk4.LJIIIIZZ) {
                    C2213741Bka c2213741Bka = new C2213741Bka();
                    c2213741Bka.LJ = C204536151q.LIZ(EnumC2213771Bkd.TTMRunSceneCallBackError);
                    c2213741Bka.LJFF = th.getMessage();
                    AbstractC2213701BkW abstractC2213701BkW = this.LIZ;
                    c2213741Bka.LIZ = abstractC2213701BkW.LIZIZ;
                    WeakReference<C830870Wib> weakReference2 = abstractC2213701BkW.LJI;
                    if (weakReference2 != null && (c830870Wib = weakReference2.get()) != null) {
                        str = c830870Wib.LIZ;
                    }
                    c2213741Bka.LIZLLL = str;
                    c2213741Bka.LJI = this.LIZ.LJII().LIZ;
                    c2213741Bka.LJII = this.LIZ.LJII().LJ;
                    c2213741Bka.LIZ();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    @Override // com.tiktok.strategycenter.TTMStrategyRunCallBack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(com.tiktok.strategycenter.TTMStrategyResult r10) {
        /*
            r9 = this;
            X.1BkW r0 = r9.LIZ     // Catch: java.lang.Throwable -> L74
            java.lang.ref.WeakReference<X.0Wib> r0 = r0.LJI     // Catch: java.lang.Throwable -> L74
            r2 = 1
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L74
            X.0Wib r0 = (X.C830870Wib) r0     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L3f
            X.0Wih r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L3f
            boolean r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L74
            if (r0 != r2) goto L3f
            X.1BkW r0 = r9.LIZ     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = r0.LIZ     // Catch: java.lang.Throwable -> L74
            com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl r0 = com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl.LIZ     // Catch: java.lang.Throwable -> L74
            r0.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl.LIZIZ     // Catch: java.lang.Throwable -> L74
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L3f
            X.1BkW r0 = r9.LIZ     // Catch: java.lang.Throwable -> L74
            r0.LIZ()     // Catch: java.lang.Throwable -> L74
            X.1BkQ r1 = new X.1BkQ     // Catch: java.lang.Throwable -> L74
            X.0zoT r2 = X.EnumC1910390zoT.AccountChange     // Catch: java.lang.Throwable -> L74
            r3 = 0
            X.1BkW r4 = r9.LIZ     // Catch: java.lang.Throwable -> L74
            r7 = 48
            r5 = r3
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L74
        L3b:
            r9.LIZ(r1)     // Catch: java.lang.Throwable -> L74
            goto L73
        L3f:
            r7 = 0
            if (r10 == 0) goto L43
            goto L46
        L43:
            X.0zoT r3 = X.EnumC1910390zoT.CepResult     // Catch: java.lang.Throwable -> L74
            goto L4e
        L46:
            java.lang.Exception r0 = r10.getError()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L43
            X.0zoT r3 = X.EnumC1910390zoT.RunError     // Catch: java.lang.Throwable -> L74
        L4e:
            X.1BkQ r1 = new X.1BkQ     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L71
            boolean r0 = r10.isSuccess()     // Catch: java.lang.Throwable -> L74
            if (r0 != r2) goto L71
        L58:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            X.1BkW r5 = r9.LIZ     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L6f
            java.lang.Exception r6 = r10.getError()     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r7 = r10.getMatchedEvents()     // Catch: java.lang.Throwable -> L74
        L68:
            r8 = 32
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L74
            goto L3b
        L6f:
            r6 = r7
            goto L68
        L71:
            r2 = 0
            goto L58
        L73:
            return
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2213711BkX.run(com.tiktok.strategycenter.TTMStrategyResult):void");
    }
}
