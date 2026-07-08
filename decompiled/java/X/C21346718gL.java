package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.18gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21346718gL {
    public final C21344618g0 LIZ;

    public C21346718gL(C21344618g0 c21344618g0) {
        this.LIZ = c21344618g0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r3.LIZIZ();
        r2 = r13.LIZ;
        r10 = r8.LIZJ.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        r1 = r2.LIZ.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r9 >= r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (((X.InterfaceC21345718gB) com.bytedance.mt.protector.impl.collections.ListProtector.get(r2.LIZ, r9)).I0(r10) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        r0 = (X.InterfaceC21345518g9) com.bytedance.mt.protector.impl.collections.ListProtector.get(r2.LIZIZ, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r0.LIZ(r4, r8, r3) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r3.LIZJ = 500;
        r3.LIZLLL = "Internal Server Error";
        r0 = new java.io.StringWriter();
        r1 = new java.io.PrintWriter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r2.printStackTrace(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r1.close();
        r3.LJ = X.AbstractC21348018gY.LIZ(r0.toString(), "text/plain");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        r3.LIZJ = 404;
        r3.LIZLLL = "Not found";
        r3.LJ = X.AbstractC21348018gY.LIZ("No handler found\n", "text/plain");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.18gP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C21345418g8 r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21346718gL.LIZ(X.18g8):void");
    }

    public static void LIZIZ(C21347218gQ c21347218gQ, C21347618gU c21347618gU) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HTTP/1.1 ");
        sbLIZ.append(c21347218gQ.LIZJ);
        sbLIZ.append(" ");
        sbLIZ.append(c21347218gQ.LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int length = strLIZIZ.length();
        for (int i = 0; i < length; i++) {
            c21347618gU.LIZ.write(strLIZIZ.charAt(i));
        }
        c21347618gU.LIZ.write(C21347618gU.LIZIZ);
        int size = c21347218gQ.LIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) ListProtector.get(c21347218gQ.LIZ, i2);
            String str2 = (String) ListProtector.get(c21347218gQ.LIZIZ, i2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(": ");
            sbLIZ2.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            int length2 = strLIZIZ2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                c21347618gU.LIZ.write(strLIZIZ2.charAt(i3));
            }
            c21347618gU.LIZ.write(C21347618gU.LIZIZ);
        }
        c21347618gU.LIZ.write(C21347618gU.LIZIZ);
        c21347618gU.LIZ.flush();
    }
}
