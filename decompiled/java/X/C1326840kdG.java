package X;

import Y.ACallableS433S0100000_30;
import android.net.Uri;
import android.util.LruCache;
import android.util.Pair;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.EcomArchServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326840kdG {
    public static final C1326840kdG LIZ = new C1326840kdG();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static void LJ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (!atomicBoolean.get()) {
            synchronized (EcomArchServiceImpl.class) {
                try {
                    if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
                        Uri uri = C1326230kcH.LIZ;
                        C1330620kjM.LIZ(new InterfaceC589610NAp() { // from class: X.0kcF
                            @Override // X.InterfaceC589610NAp
                            public final Pair LIZ(C1325710kbR c1325710kbR, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
                                String string;
                                int iHashCode;
                                Uri uri2;
                                Uri uri3;
                                if (obj == null || (string = obj.toString()) == null) {
                                    string = "";
                                }
                                String host = null;
                                JSONObject jSONObject2 = jSONObject;
                                C1325710kbR c1325710kbR2 = c1325710kbR;
                                if (a0.LJJIIZI(string, "ecom_operation_resource", false)) {
                                    if (c1325710kbR2 != null) {
                                        uri3 = c1325710kbR2.LIZIZ;
                                    } else {
                                        uri3 = null;
                                    }
                                    String strValueOf = String.valueOf(uri3);
                                    InterfaceC1326050kbz.LIZ.getClass();
                                    InterfaceC1326050kbz interfaceC1326050kbz = C1326040kby.LIZIZ;
                                    if (interfaceC1326050kbz != null) {
                                        interfaceC1326050kbz.LIZIZ(strValueOf, jSONObject2);
                                    }
                                } else if (!a0.LJJIIZI(string, "preload", false)) {
                                    Uri uri4 = C1326230kcH.LIZ;
                                    if (c1325710kbR2 != null) {
                                        Uri uri5 = c1325710kbR2.LIZIZ;
                                        if (z) {
                                            if (C1326230kcH.LJIILL(uri5.getHost()) || C1326230kcH.LJIILJJIL(uri5)) {
                                                C1326250kcJ.LIZ(new AwS407S0200000_6(c1325710kbR2, jSONObject2, 134));
                                                C1326230kcH.LIZLLL.put(Integer.valueOf(c1325710kbR2.hashCode()), jSONObject2);
                                            }
                                        } else if (C1326230kcH.LJIILL(uri5.getHost())) {
                                            C1326230kcH.LJII(false, c1325710kbR2, jSONObject2, null, null, null, null, null, null, null, 0, null, false, z2, 16376);
                                        }
                                    }
                                } else if (c1325710kbR2 != null && (C1326230kcH.LJIILL(c1325710kbR2.LIZIZ.getHost()) || C1326230kcH.LJIILJJIL(c1325710kbR2.LIZIZ))) {
                                    c1325710kbR2 = c1325710kbR2;
                                    jSONObject2 = jSONObject2;
                                    host = null;
                                    C1326230kcH.LJII(z, c1325710kbR2, jSONObject2, null, null, null, null, null, null, null, 0, null, true, z2, 8184);
                                }
                                LruCache<Integer, String> lruCache = C1326230kcH.LJI;
                                if (c1325710kbR2 != null) {
                                    iHashCode = c1325710kbR2.hashCode();
                                } else {
                                    iHashCode = 0;
                                }
                                lruCache.remove(Integer.valueOf(iHashCode));
                                if (c1325710kbR2 != null && (uri2 = c1325710kbR2.LIZIZ) != null) {
                                    host = uri2.getHost();
                                }
                                if (C1326230kcH.LJIILL(host)) {
                                    C15O7.LIZJ(new ACallableS433S0100000_30(c1325710kbR2, 8));
                                }
                                C01GW c01gw = C1326230kcH.LIZJ;
                                if ((!((List) c01gw.getValue()).isEmpty()) && jSONObject2.opt("net_timing_detail") != null) {
                                    Iterator it2 = ((List) c01gw.getValue()).iterator();
                                    while (it2.hasNext()) {
                                        ((InterfaceC1326220kcG) it2.next()).LIZ();
                                    }
                                }
                                return new Pair(Boolean.FALSE, new LinkedHashMap());
                            }
                        });
                        LIZ.getClass();
                        C1199304md.LIZ.getClass();
                        if (C1199304md.LIZIZ.enableClearZeroSizeDiskCache) {
                            long jLIZ = C1199304md.LIZ();
                            long jLIZIZ = C1199304md.LIZIZ();
                            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
                            if (jLIZ == 0) {
                                interfaceC1325460kb2LIZJ.LJIILJJIL("ecom_main_cache");
                            }
                            if (jLIZIZ == 0) {
                                interfaceC1325460kb2LIZJ.LJIILJJIL("ecom_operation_cache");
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1199304md.LIZ.getClass();
        C01GW<Boolean> c01gw = C1199304md.LIZJ;
        boolean z = (c01gw.getValue().booleanValue() && C1199304md.LIZIZ.enableCompositeMainCacheMigrationFallback) ? Keva.getRepo("ecom_image_repo").getBoolean("has_used_ecom_disk", false) : false;
        boolean z2 = (c01gw.getValue().booleanValue() && C1199304md.LIZIZ.enableMainCacheMigrationFallback) ? Keva.getRepo("ecom_image_repo").getBoolean("has_used_ecom_disk", false) : false;
        if ((z || z2) && C1328130kfL.LJIJJLI()) {
            AtomicBoolean atomicBoolean2 = LIZLLL;
            if (atomicBoolean2.compareAndSet(false, true)) {
                C1328130kfL c1328130kfLLJIILIIL = C1328130kfL.LJIILIIL();
                final InterfaceC1326920kdO interfaceC1326920kdO = (InterfaceC1326920kdO) c1328130kfLLJIILIIL.LJIIIZ().get("ecom_main_cache");
                C1326950kdR c1326950kdR = (C1326950kdR) c1328130kfLLJIILIIL.LJIIIIZZ().get("ecom_main_cache");
                if (c1326950kdR == null) {
                    atomicBoolean2.set(false);
                    return;
                }
                if (interfaceC1326920kdO == null) {
                    atomicBoolean2.set(false);
                    return;
                }
                if (z) {
                    final InterfaceC1326920kdO interfaceC1326920kdOLJIILL = c1328130kfLLJIILIIL.LJIILL();
                    interfaceC1326920kdO = new InterfaceC1326920kdO(interfaceC1326920kdO, interfaceC1326920kdOLJIILL) { // from class: X.0kdN
                        public final InterfaceC1326920kdO LIZ;
                        public final InterfaceC1326920kdO LIZIZ;

                        @Override // X.InterfaceC1326920kdO
                        public final C1325500kb6 LIZ() {
                            return this.LIZ.LIZ();
                        }

                        @Override // X.InterfaceC1326930kdP
                        public final void LIZLLL() {
                            this.LIZ.LIZLLL();
                            this.LIZIZ.LIZLLL();
                        }

                        @Override // X.InterfaceC1326930kdP
                        public final void LJFF() {
                            this.LIZ.LJFF();
                            this.LIZIZ.LJFF();
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final void clearAll() {
                            this.LIZ.clearAll();
                            this.LIZIZ.clearAll();
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final long getCount() {
                            return this.LIZ.getCount() + this.LIZIZ.getCount();
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final long getSize() {
                            return this.LIZ.getSize() + this.LIZIZ.getSize();
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final Map<String, String> LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
                            try {
                                return this.LIZ.LIZIZ(interfaceC1324680kZm);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return this.LIZIZ.LIZIZ(interfaceC1324680kZm);
                            }
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final void LIZJ(Double d) {
                            double dDoubleValue = d.doubleValue();
                            this.LIZ.LIZJ(Double.valueOf(dDoubleValue));
                            this.LIZIZ.LIZJ(Double.valueOf(dDoubleValue));
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final void LJ(InterfaceC1324680kZm interfaceC1324680kZm) {
                            this.LIZ.LJ(interfaceC1324680kZm);
                            this.LIZIZ.LJ(interfaceC1324680kZm);
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final long LJI(long j) {
                            long jLJI = this.LIZ.LJI(j);
                            long jLJI2 = this.LIZIZ.LJI(j);
                            if (jLJI <= 0) {
                                return jLJI2;
                            }
                            if (jLJI2 > 0) {
                                return Math.max(jLJI, jLJI2);
                            }
                            return jLJI;
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final boolean LJII(InterfaceC1324680kZm interfaceC1324680kZm) {
                            if (!this.LIZ.LJII(interfaceC1324680kZm) && !this.LIZIZ.LJII(interfaceC1324680kZm)) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final boolean LJIIIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
                            if (!this.LIZ.LJIIIZ(interfaceC1324680kZm) && !this.LIZIZ.LJIIIZ(interfaceC1324680kZm)) {
                                return false;
                            }
                            return true;
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final InterfaceC1317730kOZ LJIIJ(InterfaceC1324680kZm interfaceC1324680kZm) {
                            InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ = this.LIZ.LJIIJ(interfaceC1324680kZm);
                            if (interfaceC1317730kOZLJIIJ == null) {
                                return this.LIZIZ.LJIIJ(interfaceC1324680kZm);
                            }
                            return interfaceC1317730kOZLJIIJ;
                        }

                        {
                            this.LIZ = interfaceC1326920kdO;
                            this.LIZIZ = interfaceC1326920kdOLJIILL;
                        }

                        @Override // X.InterfaceC1326920kdO
                        public final InterfaceC1317730kOZ LJIIIIZZ(InterfaceC1324680kZm interfaceC1324680kZm, InterfaceC1327040kda interfaceC1327040kda) {
                            return this.LIZIZ.LJIIIIZZ(interfaceC1324680kZm, interfaceC1327040kda);
                        }
                    };
                }
                C1328730kgJ.LJIJJ = interfaceC1326920kdO;
                C1328730kgJ.LJIJI = c1326950kdR.LJFF;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:12:0x001f, B:14:0x002a), top: B:21:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = X.C1326840kdG.LIZJ
            boolean r0 = r3.get()
            if (r0 != 0) goto L37
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.EcomArchServiceImpl> r2 = com.ss.android.ugc.aweme.ecommerce.service.EcomArchServiceImpl.class
            monitor-enter(r2)
            boolean r0 = r3.get()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L36
            r1 = 1
            r0 = 0
            boolean r0 = r3.compareAndSet(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.ecommerce.image.EcomPriorityData r0 = X.C1326850kdH.LIZ     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.enable     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L2a
            X.0kW6 r0 = X.C1322400kW6.LIZ     // Catch: java.lang.Throwable -> L30
            r0.getClass()     // Catch: java.lang.Throwable -> L30
            com.ss.android.ugc.aweme.ecommerce.network.WeakNetworkOptimizeConfig r0 = X.C1322400kW6.LIZIZ     // Catch: java.lang.Throwable -> L30
            int r0 = r0.priorityOptimizeSwitch     // Catch: java.lang.Throwable -> L30
            if (r0 <= 0) goto L36
        L2a:
            X.0kcx r0 = new X.InterfaceC725990Sdp() { // from class: X.0kcx
                static {
                    /*
                        X.0kcx r0 = new X.0kcx
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0kcx) X.0kcx.LIZ X.0kcx
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1326650kcx.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1326650kcx.<init>():void");
                }

                @Override // X.InterfaceC725990Sdp
                public final int LIZ(int r3, java.lang.String r4) {
                    /*
                        r2 = this;
                        android.util.LruCache<java.lang.String, java.lang.Boolean> r0 = X.C1561210qjH.LIZ
                        java.lang.Object r0 = r0.get(r4)
                        if (r0 == 0) goto L11
                        android.util.LruCache<java.lang.String, java.lang.Boolean> r1 = X.C1561210qjH.LIZIZ
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        r1.put(r4, r0)
                    Lf:
                        r3 = 3
                    L10:
                        return r3
                    L11:
                        X.0kW6 r0 = X.C1322400kW6.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.ecommerce.network.WeakNetworkOptimizeConfig r1 = X.C1322400kW6.LIZIZ
                        int r0 = r1.priorityOptimizeSwitch
                        if (r0 <= 0) goto L10
                        java.util.List<java.lang.String> r0 = r1.highPriorityPaths
                        boolean r0 = r0.contains(r4)
                        if (r0 == 0) goto L10
                        goto Lf
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1326650kcx.LIZ(int, java.lang.String):int");
                }
            }     // Catch: java.lang.Throwable -> L30
            com.bytedance.retrofit2.SsHttpCall.setPriorityControl(r0)     // Catch: java.lang.Throwable -> L30
            goto L36
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)
            throw r0
        L36:
            monitor-exit(r2)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326840kdG.LJFF():void");
    }

    public static final C1326860kdI LIZ(String str, boolean z) {
        LJ();
        LJFF();
        C20155913tl c20155913tl = C20155913tl.LIZ;
        LruCache<String, C20155613ti> lruCache = C20155613ti.LJIIL;
        C20155613ti c20155613tiLIZIZ = C1334160kp4.LIZIZ(C1946007jm.LJ(str));
        if (c20155613tiLIZIZ != null) {
            return c20155913tl.LIZJ(c20155613tiLIZIZ, z);
        }
        Uri uriLJ = C1946007jm.LJ(str);
        String path = uriLJ.getPath();
        if (path != null) {
            C20155913tl.LIZLLL(path, new AwS564S0100000_20(uriLJ, 29), z);
        }
        return new C1326860kdI(str, null, null);
    }

    public static final C1326810kdD LIZIZ(Uri uri, boolean z) {
        LJ();
        LJFF();
        C20155913tl c20155913tl = C20155913tl.LIZ;
        LruCache<String, C20155613ti> lruCache = C20155613ti.LJIIL;
        C20155613ti c20155613tiLIZIZ = C1334160kp4.LIZIZ(uri);
        if (c20155613tiLIZIZ != null) {
            return new C1326810kdD(C1946007jm.LJ(c20155913tl.LIZJ(c20155613tiLIZIZ, z).LIZ));
        }
        String path = uri.getPath();
        if (path != null) {
            C20155913tl.LIZLLL(path, new AwS564S0100000_20(uri, 29), z);
        }
        String string = uri.toString();
        if (string != null) {
            String strLIZ = C1508050pLX.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            C1066210dqt.LIZLLL(string, "log", new kotlin.Pair("network_start_btm", strLIZ));
        }
        C20155913tl.LJ(uri.toString());
        return new C1326810kdD(uri);
    }

    public final C1326810kdD LIZJ(boolean z, Uri uri) {
        return LIZIZ(uri, z);
    }

    public final C1326860kdI LIZLLL(String str, boolean z) {
        return LIZ(str, z);
    }
}
