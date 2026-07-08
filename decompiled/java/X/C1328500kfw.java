package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328500kfw implements InterfaceC1327390ke9<C1328480kfu> {
    public static InterfaceC1330390kiz LIZLLL;
    public final InterfaceC1327440keE LIZ;
    public final InterfaceC1330410kj1 LIZIZ;
    public final InterfaceC1328710kgH LIZJ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        interfaceC1327930kf1.LIZ().LJI(interfaceC1327930kf1.getId(), "NetworkFetchProducer");
        C1328680kgE c1328680kgELIZJ = this.LIZJ.LIZJ(interfaceC1328020kfA, interfaceC1327930kf1);
        InterfaceC1330390kiz interfaceC1330390kiz = LIZLLL;
        if (interfaceC1330390kiz != null && !interfaceC1330390kiz.LIZ(c1328680kgELIZJ.LIZJ())) {
            LJFF(c1328680kgELIZJ, new Throwable("The expired url does not initiate the request"));
        } else {
            this.LIZJ.LIZ(c1328680kgELIZJ, new C1328510kfx(this, c1328680kgELIZJ));
        }
    }

    public final Map<String, String> LIZJ(C1328680kgE c1328680kgE, int i) {
        if (!c1328680kgE.LIZIZ().LJIIJ(c1328680kgE.LIZ())) {
            return null;
        }
        return this.LIZJ.LJ(c1328680kgE, i);
    }

    public final void LIZLLL(AbstractC1328940kge abstractC1328940kge, C1328680kgE c1328680kgE) throws Throwable {
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1325710kbR c1325710kbRLJFF = c1328680kgE.LIZIZ.LJFF();
        if (c1328680kgE.LIZIZ.LIZLLL()) {
            this.LIZJ.LIZIZ();
            long j2 = jUptimeMillis - c1328680kgE.LIZJ;
            if (c1325710kbRLJFF.LJJJJJ) {
                j = 10;
            } else {
                j = 100;
            }
            if (j2 >= j) {
                c1328680kgE.LIZJ = jUptimeMillis;
                c1328680kgE.LIZIZ().LJFF(c1328680kgE.LIZ());
                LJ(abstractC1328940kge, 0, c1328680kgE.LIZ, c1328680kgE.LJFF);
            }
        }
    }

    public final void LJFF(C1328680kgE c1328680kgE, Throwable th) {
        String strLIZIZ;
        Map mapLIZJ = LIZJ(c1328680kgE, -1);
        if (mapLIZJ == null) {
            mapLIZJ = new HashMap(1);
        }
        if (this.LIZJ == null) {
            strLIZIZ = "null";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZJ.getClass().getName());
            sbLIZ.append(", ");
            sbLIZ.append(this.LIZJ.toString());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        mapLIZJ.put("NetworkFetcher", strLIZIZ);
        c1328680kgE.LIZIZ().LIZ(c1328680kgE.LIZ(), th, "NetworkFetchProducer", mapLIZJ);
        c1328680kgE.LIZIZ().LJIIIZ(c1328680kgE.LIZ(), "NetworkFetchProducer", false);
        c1328680kgE.LIZ.onFailure(th);
    }

    public C1328500kfw(InterfaceC1327440keE interfaceC1327440keE, InterfaceC1330410kj1 interfaceC1330410kj1, InterfaceC1328710kgH interfaceC1328710kgH) {
        this.LIZ = interfaceC1327440keE;
        this.LIZIZ = interfaceC1330410kj1;
        this.LIZJ = interfaceC1328710kgH;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0088
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJ(X.AbstractC1328940kge r7, int r8, X.InterfaceC1328020kfA r9, java.util.Map r10) throws java.lang.Throwable {
        /*
            java.lang.String r5 = "viewHeight"
            java.lang.String r6 = "viewWidth"
            X.0kgM r7 = (X.C1328760kgM) r7
            X.0kgT r0 = r7.LIZ()
            X.0kX9 r2 = X.C1323050kX9.LJIJJLI(r0)
            r3 = 0
            X.0kfu r1 = new X.0kfu     // Catch: java.lang.Throwable -> L88
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L88
            r4 = 0
            if (r10 == 0) goto L55
            java.lang.String r0 = "url"
            java.lang.Object r0 = r10.get(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            r1.LLJJJJLIIL = r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r10.get(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L85
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L2f
            r0 = 0
            goto L39
        L2f:
            java.lang.Object r0 = r10.get(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L85
        L39:
            r1.LLJJL = r0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r10.get(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L85
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L49
            r0 = 0
            goto L53
        L49:
            java.lang.Object r0 = r10.get(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L85
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L85
        L53:
            r1.LLJJLIIIJLLLLLLLZ = r0     // Catch: java.lang.Throwable -> L85
        L55:
            r1.LLJILLL = r10     // Catch: java.lang.Throwable -> L85
            X.0kX9<X.0kdc> r0 = r1.LL     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0 instanceof X.C1327050kdb     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L6d
            X.0kX9<X.0kdc> r0 = r1.LL     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L85
            X.0kdb r0 = (X.C1327050kdb) r0     // Catch: java.lang.Throwable -> L85
            r0.LLILLJJLI = r10     // Catch: java.lang.Throwable -> L85
        L6d:
            r1.LLJI = r3     // Catch: java.lang.Throwable -> L85
            r1.LJIJJ()     // Catch: java.lang.Throwable -> L85
            r1.LLJJIII = r4     // Catch: java.lang.Throwable -> L85
            r1.LLJJIJI = r4     // Catch: java.lang.Throwable -> L85
            r1.LLJJI = r4     // Catch: java.lang.Throwable -> L85
            r0 = 1
            r1.LLJJ = r0     // Catch: java.lang.Throwable -> L85
            r9.LIZJ(r8, r1)     // Catch: java.lang.Throwable -> L85
            X.C1328480kfu.LIZIZ(r1)
            X.C1323050kX9.LJII(r2)
            return
        L85:
            r0 = move-exception
            r3 = r1
            goto L89
        L88:
            r0 = move-exception
        L89:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L88
            X.C1328480kfu.LIZIZ(r3)
            X.C1323050kX9.LJII(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328500kfw.LJ(X.0kge, int, X.0kfA, java.util.Map):void");
    }
}
