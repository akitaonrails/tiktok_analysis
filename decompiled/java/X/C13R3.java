package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13R3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13R3 extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final Effect LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r5.LJIILJJIL(X.C2188811AlT.LIZIZ(r1)) != false) goto L24;
     */
    @Override // X.AbstractC20000013Ne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute() {
        /*
            r6 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.LIZIZ
            r4 = 10003(0x2713, float:1.4017E-41)
            if (r0 == 0) goto Lc
            X.13RD r0 = r6.LIZ
            X.13Ox r0 = r0.LJJIFFI
            if (r0 != 0) goto L14
        Lc:
            X.0tLr r0 = new X.0tLr
            r0.<init>(r4)
            r6.LIZ(r0)
        L14:
            X.13RD r0 = r6.LIZ
            X.13Ox r5 = r0.LJJIFFI
            if (r5 != 0) goto L1b
            return
        L1b:
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r6.LIZIZ
            if (r3 != 0) goto L20
            return
        L20:
            java.lang.String r0 = r3.getId()     // Catch: java.lang.Exception -> L8f
            boolean r1 = r5.LJIILJJIL(r0)     // Catch: java.lang.Exception -> L8f
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r3.getTrans_file_url()     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L37
            java.lang.String r2 = r0.getUri()     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L37
            if (r1 == 0) goto L86
            goto L43
        L37:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = X.C20007213Py.LIZ     // Catch: java.lang.Exception -> L8f
            X.13RD r0 = r6.LIZ     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r0.LJII     // Catch: java.lang.Exception -> L8f
            X.C20007213Py.LIZ(r3, r0)     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L86
            goto L60
        L43:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r3.getId()     // Catch: java.lang.Exception -> L8f
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "_trans_"
            r1.append(r0)     // Catch: java.lang.Exception -> L8f
            r1.append(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L8f
            boolean r0 = r5.LJIILJJIL(r0)     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L86
        L60:
            X.13RD r1 = r6.LIZ     // Catch: java.lang.Exception -> L8f
            boolean r0 = r1.LJJIZ     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L7b
            X.13Lr r1 = r1.LJJJIL     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = r6.LIZJ     // Catch: java.lang.Exception -> L8f
            X.13MA r2 = r1.LIZ(r0)     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L9b
            kotlin.jvm.internal.AwS274S0300000_30 r1 = new kotlin.jvm.internal.AwS274S0300000_30     // Catch: java.lang.Exception -> L8f
            r0 = 19
            r1.<init>(r2, r3, r6, r0)     // Catch: java.lang.Exception -> L8f
            r6.runOnMainThread(r1)     // Catch: java.lang.Exception -> L8f
            return
        L7b:
            kotlin.jvm.internal.AwS431S0200000_30 r1 = new kotlin.jvm.internal.AwS431S0200000_30     // Catch: java.lang.Exception -> L8f
            r0 = 105(0x69, float:1.47E-43)
            r1.<init>(r6, r3, r0)     // Catch: java.lang.Exception -> L8f
            r6.runOnMainThread(r1)     // Catch: java.lang.Exception -> L8f
            return
        L86:
            X.0tLr r0 = new X.0tLr     // Catch: java.lang.Exception -> L8f
            r0.<init>(r4)     // Catch: java.lang.Exception -> L8f
            r6.LIZ(r0)     // Catch: java.lang.Exception -> L8f
            return
        L8f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0tLr r0 = new X.0tLr
            r0.<init>(r1)
            r6.LIZ(r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13R3.execute():void");
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        C13RD c13rd = this.LIZ;
        if (c13rd.LJJIZ && c13rd.LJJJIL.LIZ(this.LIZJ) != null) {
            runOnMainThread(new AwS574S0100000_30(this, 433));
        }
        runOnMainThread(new AwS574S0100000_30(this, 434));
    }

    public final void LIZ(C1662010tLr c1662010tLr) {
        C13RD c13rd = this.LIZ;
        if (c13rd.LJJIZ) {
            C13MA c13maLIZ = c13rd.LJJJIL.LIZ(this.LIZJ);
            if (c13maLIZ != null) {
                runOnMainThread(new AwS274S0300000_30(c13maLIZ, (C13MA<Effect>) this, (C13R3) c1662010tLr, (C1662010tLr) 20));
                return;
            }
            return;
        }
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 106));
    }

    public C13R3(C13RD c13rd, Effect effect, String str) {
        super(str, null);
        this.LIZ = c13rd;
        this.LIZIZ = effect;
        this.LIZJ = str;
    }
}
