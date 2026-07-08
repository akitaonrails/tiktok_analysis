package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531830pxt implements InterfaceC1532430pyr {
    public static final C1531830pxt LIZ = new C1531830pxt();
    public static final ConcurrentHashMap<C1532720pzK, C1541080qCo<C1532310pyf>> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1532430pyr
    public final boolean LIZJ(C1532300pye c1532300pye) {
        return true;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "cdn";
    }

    @Override // X.InterfaceC1532520pz0
    public final boolean LJFF() {
        InterfaceC1531740pxk interfaceC1531740pxk = C1531760pxm.LIZ;
        return !((interfaceC1531740pxk != null ? interfaceC1531740pxk.getNetworkStatus() : null) == EnumC1529850puh.STRESSFUL);
    }

    @Override // X.InterfaceC1532520pz0
    public final EnumC1528520psY LIZLLL() {
        return EnumC1528520psY.REGISTER_CALLBACK;
    }

    public static void LJI(C1531940py4 c1531940py4, C1541080qCo c1541080qCo) {
        ArrayList arrayList = (ArrayList) c1531940py4.LIZJ;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZIZ.remove(((C1531900py0) it2.next()).LIZIZ, c1541080qCo);
        }
        if (arrayList.isEmpty() || !Intrinsics.LJFF(((C1531900py0) C13LP.LJJLIIIJJI(arrayList)).LIZIZ, c1531940py4.LIZ())) {
            LIZIZ.remove(c1531940py4.LIZ(), c1541080qCo);
        }
    }

    @Override // X.InterfaceC1532520pz0
    public final void LJ(Function1 function1, Object obj) {
        C1532460pyu.LIZ(this, (C1532550pz3) obj, function1);
    }

    @Override // X.InterfaceC1532430pyr
    public final void LIZIZ(C08AB c08ab, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, Function1<? super C1532340pyi, Unit> function1) {
        C1531940py4 c1531940py4 = c1532710pzJ.LJJIJ;
        C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
        if (c1531940py4 != null && c1541080qCo != null) {
            LJII(0, c1532470pyv, c1532710pzJ, c1532170pyR, c1531940py4, c1541080qCo, c08ab, function1);
        } else {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "cdn", "provideResource", "cannot get required information", null, null, 48);
            function1.invoke(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c4, code lost:
    
        if (r11 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c6, code lost:
    
        r27.LIZ("failed to create NetRequest");
        r6.invoke(new X.C1531910py1(7, null, "failed to create NetRequest", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02da, code lost:
    
        r10 = new java.util.LinkedHashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
    
        r0 = r4.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e2, code lost:
    
        if (r0 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e4, code lost:
    
        r29.LJIILJJIL = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e6, code lost:
    
        r10 = new X.RunnableC1531790pxp(r28, r29, r6, r4, r26, r27, r5, r0, r33, r30, r31, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0301, code lost:
    
        if (r0 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0303, code lost:
    
        r1 = r5.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0305, code lost:
    
        if (r1 == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0307, code lost:
    
        r29.LIZIZ = "cdn_heuristic_cache";
        r29.LIZIZ(new X.C1531670pxd((X.C1531820pxs) r1));
        r29.LIZIZ(new X.C1531750pxl((X.C1531820pxs) r5.element));
        r29.LIZIZ(X.C1531650pxb.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0326, code lost:
    
        r2 = ((X.C1531820pxs) r5.element).LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x032e, code lost:
    
        if (r2 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0330, code lost:
    
        r0 = java.lang.Boolean.valueOf(r2.setLastModified(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x033c, code lost:
    
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0340, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0342, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0343, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0365, code lost:
    
        if (r28.LJJ == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0367, code lost:
    
        r1 = X.C786410Ut5.u3();
        r0 = r29.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x036d, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036f, code lost:
    
        r0 = r0.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0375, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r0) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0377, code lost:
    
        X.C0WP3.LIZ(com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2).execute(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0380, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r5 = r7.LIZIZ;
        X.C1532920pze.LIZJ.LIZJ(new kotlin.jvm.internal.AwS107S1000000_23(r5, 27));
        r0 = X.C1531210pwt.LIZ.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0381, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0383, code lost:
    
        r10.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0386, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0387, code lost:
    
        r6.invoke(new X.C1531910py1(1, null, "disable fetch online resource", null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0393, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0394, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0395, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0399, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r10 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r10 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        r0 = X.C1531830pxt.LIZ;
        r6 = new X.C1531920py2(r26, r27, r28, r29, r30, r31, r32, r33);
        r0.getClass();
        r16 = new X.C259800zU();
        r5 = new X.C259800zU();
        r30.LIZLLL = r10;
        r0 = new X.C259800zU();
        r0.element = r28.LJIILIIL;
        r12 = X.C2188811AlT.LIZ();
        r12.append("cdn_cache");
        r12.append(r26);
        r32.LIZJ(X.C2188811AlT.LIZIZ(r12));
        r4 = new X.C013C();
        r10.LIZIZ(new kotlin.jvm.internal.AwS106S1200000_23(r7.LIZ(), new kotlin.jvm.internal.AwS56S0500000_23(r0, (X.C259800zU<java.util.Map<java.lang.String, java.lang.String>>) r28, (X.C1532710pzJ) r5, (X.C259800zU<X.C1531820pxs>) r16, (X.C259800zU<X.C1531820pxs>) r4, (X.C013C) 0), r7.LIZIZ, 2));
        r10 = (X.C1531820pxs) r16.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
    
        if (r10 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f8, code lost:
    
        r29.LIZIZ = "cdn_cache";
        r29.LIZIZ(new X.C1531670pxd(r10));
        r29.LIZIZ(new X.C1531750pxl(r10));
        r29.LIZIZ(X.C1531650pxb.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
    
        r4 = new X.C1531990py9<>();
        r0 = new X.C013C();
        r0.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
    
        r13 = new java.lang.ref.WeakReference<>(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        r11 = X.C1531210pwt.LIZ;
        r8 = r11.putIfAbsent(r5, r13);
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        if (r8 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012e, code lost:
    
        r0.element = false;
        r10 = r8.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0136, code lost:
    
        if (r10 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0138, code lost:
    
        r11.remove(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013c, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013d, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0141, code lost:
    
        r10 = X.C1531200pws.LIZIZ.getStringJustDisk(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0147, code lost:
    
        if (r10 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0149, code lost:
    
        r8 = kotlin.text.a0.LJJLIIIJILLIZJL(r10, new java.lang.String[]{","}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0156, code lost:
    
        r6 = r8.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        if ((-1) >= r6) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015e, code lost:
    
        r11 = (java.lang.String) r8.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0164, code lost:
    
        X.C1531820pxs.LJIIL.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016d, code lost:
    
        if (X.C1531840pxu.LIZIZ(r5, r11, r4) != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016f, code lost:
    
        X.C1531210pwt.LIZ(r11, r0);
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0173, code lost:
    
        r9 = kotlin.Unit.LIZ;
        X.C189200o6.m2constructorimpl(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0179, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10);
        r9 = new X.C098200Yq(r10);
        X.C189200o6.m2constructorimpl(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b4, code lost:
    
        if (r12 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b6, code lost:
    
        X.C1532960pzi.LIZLLL(new Y.ARunnableS28S1100000_23(r4, r5, 26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c0, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c1, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c4, code lost:
    
        r0 = r10.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c8, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ca, code lost:
    
        r0 = java.lang.Boolean.valueOf(r0.setLastModified(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d6, code lost:
    
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01dc, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dd, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fa, code lost:
    
        if (r28.LJIILL != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fe, code lost:
    
        if (r28.LJFF != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        X.C1532680pzG.LIZ.getClass();
        r12 = X.C1532680pzG.LJJIFFI;
        r10 = (X.C1531820pxs) r5.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020b, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020f, code lost:
    
        if (r28.LJIILJJIL == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0211, code lost:
    
        r29.LIZIZ = "cdn_expired_cache";
        r29.LIZIZ(new X.C1531670pxd(r10));
        r29.LIZIZ(new X.C1531750pxl(r10));
        r29.LIZIZ(X.C1531650pxb.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022a, code lost:
    
        r0 = r10.LJII();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x022e, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0230, code lost:
    
        r0 = java.lang.Boolean.valueOf(r0.setLastModified(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023c, code lost:
    
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0240, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0242, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0243, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025e, code lost:
    
        r10 = r10.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0262, code lost:
    
        if (r10 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0264, code lost:
    
        r10 = X.C2097608Jq.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0268, code lost:
    
        r13 = r10.get("last-modified");
        r11 = r10.get("etag");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0274, code lost:
    
        if (r13 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0276, code lost:
    
        if (r11 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0278, code lost:
    
        r0 = (java.util.Map) r0.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x027c, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x027e, code lost:
    
        r10 = new java.util.LinkedHashMap(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0283, code lost:
    
        if (r13 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0285, code lost:
    
        r10.put("If-Modified-Since", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x028a, code lost:
    
        if (r11 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x028c, code lost:
    
        r10.put("If-None-Match", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0291, code lost:
    
        r0.element = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0295, code lost:
    
        if (r4.element != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0297, code lost:
    
        r10 = X.C2188811AlT.LIZ();
        r10.append("cdn_online_fetch");
        r10.append(r26);
        r32.LIZJ(X.C2188811AlT.LIZIZ(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ae, code lost:
    
        r11 = r12.LIZ(r30.LIZ().LIZ, r30.LIZ().LIZLLL(), (java.util.Map) r0.element, r28);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(final int r26, final X.C1532470pyv r27, final X.C1532710pzJ r28, final X.C1532170pyR r29, final X.C1531940py4 r30, final X.C1541080qCo r31, X.C08AB r32, final kotlin.jvm.functions.Function1 r33) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531830pxt.LJII(int, X.0pyv, X.0pzJ, X.0pyR, X.0py4, X.0qCo, X.08AB, kotlin.jvm.functions.Function1):void");
    }
}
