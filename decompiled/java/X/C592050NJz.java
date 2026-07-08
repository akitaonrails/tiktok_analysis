package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592050NJz {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC1631630sYr<Boolean, List<String>, Boolean, InterfaceC1364105Vn<? super C595260NWi>, Object> LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final C1DEK LIZLLL = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final long LJ;
    public final int LJFF;
    public final C2252331DDr LJI;
    public final C2252331DDr LJII;
    public final List<String> LJIIIIZZ;
    public final C1DEV LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public AnonymousClass0956 LJIIL;

    public final void LIZ() {
        if (this.LJIIJ.getAndSet(true)) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJIIJJI = C23250099c.LIZLLL(this.LIZ, null, null, new C591980NJs(this, null), 3);
        this.LJIIL = C23250099c.LIZLLL(this.LIZ, null, null, new C592030NJx(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r10, X.InterfaceC1364105Vn r11) {
        /*
            r9 = this;
            r0 = 137270(0x21836, float:1.92356E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r11 instanceof X.C0NK0
            if (r0 == 0) goto L34
            r6 = r11
            X.0NK0 r6 = (X.C0NK0) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r6.LLILZ = r2
        L19:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L3a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r8 == 0) goto L33
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L33:
            throw r1
        L34:
            X.0NK0 r6 = new X.0NK0
            r6.<init>(r9, r11)
            goto L19
        L3a:
            int r3 = r6.LL
            goto L70
        L3d:
            X.C155000ia.LIZIZ(r1)
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r9.LIZJ
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            r3 = 1
            goto L51
        L50:
            r3 = 0
        L51:
            X.0sYr<java.lang.Boolean, java.util.List<java.lang.String>, java.lang.Boolean, X.05Vn<? super X.0NWi>, java.lang.Object> r2 = r9.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L7b
            r6.LL = r3     // Catch: java.lang.Throwable -> L7b
            r6.LLILZ = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r2.invoke(r1, r10, r0, r6)     // Catch: java.lang.Throwable -> L7b
            if (r1 != r7) goto L73
            if (r8 == 0) goto L6f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L6f:
            return r7
        L70:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L79
        L73:
            X.0NWi r1 = (X.C595260NWi) r1     // Catch: java.lang.Throwable -> L79
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L79
            goto L87
        L79:
            r0 = move-exception
            goto L7c
        L7b:
            r0 = move-exception
        L7c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L87:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L8e
            r1 = 0
        L8e:
            X.0NWi r1 = (X.C595260NWi) r1
            X.0NJv r0 = new X.0NJv
            if (r3 == 0) goto L95
            r5 = 1
        L95:
            r0.<init>(r1, r5)
            if (r8 == 0) goto L9d
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C592050NJz.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    public C592050NJz(C0NXH c0nxh, C054G c054g, C595290NWl c595290NWl, AwS553S0100000_9 awS553S0100000_9) {
        this.LIZ = c054g;
        this.LIZIZ = c595290NWl;
        this.LIZJ = awS553S0100000_9;
        this.LJ = c0nxh.LJIIJ;
        this.LJFF = c0nxh.LJIIIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LJI = c2252331DDrLIZIZ;
        this.LJII = c2252331DDrLIZIZ;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = C2191201ApK.LIZ();
        this.LJIIJ = new AtomicBoolean(false);
    }
}
