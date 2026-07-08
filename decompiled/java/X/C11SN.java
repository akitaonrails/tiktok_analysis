package X;

/* JADX INFO: renamed from: X.11SN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SN {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r3 = r2.LL.addAndGet(-r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC19495011Oy r10, X.InterfaceC626120Oh8 r11, X.InterfaceC420801kM r12, X.C11SO r13) {
        /*
            r3 = 1
        L1:
            r9 = r13
            r2 = r9
            X.11SK r2 = (X.C11SK) r2
            boolean r4 = r2.LLILZIL
            r7 = r10
            boolean r5 = r7.isEmpty()
            r8 = r12
            r6 = r11
            boolean r0 = LIZ(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L15
            return
        L15:
            boolean r4 = r2.LLILZIL
            java.lang.Object r1 = r7.poll()
            if (r1 != 0) goto L35
            r5 = 1
        L1e:
            boolean r0 = LIZ(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L25
            return
        L25:
            if (r5 == 0) goto L31
            int r1 = -r3
            java.util.concurrent.atomic.AtomicInteger r0 = r2.LL
            int r3 = r0.addAndGet(r1)
            if (r3 != 0) goto L1
            return
        L31:
            r9.LIZ(r6, r1)
            goto L15
        L35:
            r5 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11SN.LIZIZ(X.11Oy, X.0Oh8, X.01kM, X.11SO):void");
    }

    public static boolean LIZ(boolean z, boolean z2, InterfaceC626120Oh8 interfaceC626120Oh8, InterfaceC19494911Ox interfaceC19494911Ox, InterfaceC420801kM interfaceC420801kM, C11SO c11so) {
        if (((C11SK) c11so).LLILZ) {
            interfaceC19494911Ox.clear();
            interfaceC420801kM.dispose();
            return true;
        }
        if (z && z2) {
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            interfaceC626120Oh8.onComplete();
            return true;
        }
        return false;
    }
}
