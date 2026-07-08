package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884110YmH implements InterfaceC882750Yk5 {
    public static long LIZJ;
    public static volatile int LIZLLL;
    public static volatile int LJ;
    public static final C884110YmH LIZ = new C884110YmH();
    public static final List<Pair<String, String>> LIZIZ = new ArrayList();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C884100YmG());

    @Override // X.InterfaceC882750Yk5
    public final void LIZ() {
    }

    @Override // X.InterfaceC882750Yk5
    public final String LIZIZ() {
        List listLLD;
        synchronized (this) {
            try {
                listLLD = C13LP.LLD(100, LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!listLLD.isEmpty()) {
            sb.append((String) ((Pair) ListProtector.get(listLLD, 0)).getFirst());
            sb.append(":");
            sb.append((String) ((Pair) ListProtector.get(listLLD, 0)).getSecond());
            int size = listLLD.size();
            for (int i = 1; i < size; i++) {
                Pair pair = (Pair) ListProtector.get(listLLD, i);
                sb.append("_");
                sb.append((String) pair.getFirst());
                sb.append(":");
                sb.append((String) pair.getSecond());
            }
            if (listLLD.size() == 100) {
                sb.append("_more");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("_s(");
        sbLIZ.append(LIZLLL);
        sbLIZ.append('_');
        sbLIZ.append(LJ);
        sbLIZ.append(')');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        return sb.toString();
    }

    @Override // X.InterfaceC882750Yk5
    public final void LIZJ() {
        LJ(this, "2");
    }

    public final void LIZLLL(C0Y6X c0y6x) {
        C881500Yi4 c881500Yi4 = AbstractC883730Ylf.LJIIIIZZ;
        String str = c0y6x.LIZ.LIZ;
        c881500Yi4.getClass();
        if (C881500Yi4.LJFF(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("6(");
            sbLIZ.append(c0y6x.LIZIZ.size());
            sbLIZ.append('_');
            sbLIZ.append(c0y6x.LJ);
            sbLIZ.append('_');
            sbLIZ.append(c0y6x.LIZ.LIZIZ);
            sbLIZ.append(')');
            LJ(this, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (C869290Y8h.LJIIL.contains(c0y6x.LIZ.LIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("6_extra_light(");
            sbLIZ2.append(c0y6x.LIZIZ.size());
            sbLIZ2.append('_');
            sbLIZ2.append(c0y6x.LJ);
            sbLIZ2.append('_');
            sbLIZ2.append(c0y6x.LIZ.LIZIZ);
            sbLIZ2.append(')');
            LJ(this, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("7(");
        sbLIZ3.append(c0y6x.LIZIZ.size());
        sbLIZ3.append('_');
        sbLIZ3.append(c0y6x.LIZ.LIZIZ);
        sbLIZ3.append(')');
        LJ(this, C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0027, B:11:0x0037, B:13:0x003f, B:14:0x004b, B:16:0x0051, B:18:0x0065, B:21:0x0071, B:22:0x0076, B:19:0x006a, B:7:0x0016), top: B:28:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0027, B:11:0x0037, B:13:0x003f, B:14:0x004b, B:16:0x0051, B:18:0x0065, B:21:0x0071, B:22:0x0076, B:19:0x006a, B:7:0x0016), top: B:28:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x0019, B:10:0x0027, B:11:0x0037, B:13:0x003f, B:14:0x004b, B:16:0x0051, B:18:0x0065, B:21:0x0071, B:22:0x0076, B:19:0x006a, B:7:0x0016), top: B:28:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C884110YmH r11, java.lang.String r12) {
        /*
            monitor-enter(r11)
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r2 = X.C884110YmH.LIZIZ     // Catch: java.lang.Throwable -> L86
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L86
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L86
            r0 = 100
            r6 = 0
            if (r1 < r0) goto L19
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L86
            r2.remove(r6)     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L86
            goto L19
        L15:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
        L19:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L86
            long r9 = X.C884110YmH.LIZJ     // Catch: java.lang.Throwable -> L86
            long r7 = r2 - r9
            r4 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L6a
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "dd-HH-mm-ss"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L86
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L86
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = r1.format(r0)     // Catch: java.lang.Throwable -> L86
        L37:
            java.lang.String r0 = "r"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r12, r0, r6)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L76
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r1 = X.C884110YmH.LIZIZ     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L86
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L86
            java.util.ListIterator r4 = r1.listIterator(r0)     // Catch: java.lang.Throwable -> L86
        L4b:
            boolean r0 = r4.hasPrevious()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L76
            java.lang.Object r0 = r4.previous()     // Catch: java.lang.Throwable -> L86
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "r"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r6)     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L4b
            int r1 = r4.nextIndex()     // Catch: java.lang.Throwable -> L86
            goto L6f
        L6a:
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L86
            goto L37
        L6f:
            if (r1 < 0) goto L76
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r0 = X.C884110YmH.LIZIZ     // Catch: java.lang.Throwable -> L86
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r1)     // Catch: java.lang.Throwable -> L86
        L76:
            X.C884110YmH.LIZJ = r2     // Catch: java.lang.Throwable -> L86
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r1 = X.C884110YmH.LIZIZ     // Catch: java.lang.Throwable -> L86
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L86
            r0.<init>(r12, r5)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L86
            r1.add(r0)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r11)
            return
        L86:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C884110YmH.LJ(X.0YmH, java.lang.String):void");
    }
}
