package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationTemplateNLEData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQ2 {
    public static boolean LJIIIZ;
    public static final C0MQ2 LIZ = new C0MQ2();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(389));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(391));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(390));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(388));
    public static final ConcurrentHashMap<Integer, HashMap<String, String>> LJFF = new ConcurrentHashMap<>();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(393));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(392));
    public static final Map<String, NLETemplateModel> LJIIIIZZ = new LinkedHashMap();
    public static final ConcurrentHashMap<Integer, String> LJIIJ = new ConcurrentHashMap<>();

    public static void LIZJ(int i) {
        Object c098200Yq;
        HashMap<String, String> map;
        long jCurrentTimeMillis;
        HashMap<String, String> map2 = LJFF.get(Integer.valueOf(i));
        if (map2 != null && !map2.isEmpty()) {
            return;
        }
        Object obj = null;
        String string = ((Keva) LIZLLL.getValue()).getString(String.valueOf(i), null);
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LIZIZ(string, CelebrationTemplateNLEData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        CelebrationTemplateNLEData celebrationTemplateNLEData = (CelebrationTemplateNLEData) obj;
        if (celebrationTemplateNLEData == null || (map = celebrationTemplateNLEData.templateNleMap) == null) {
            return;
        }
        if (((Boolean) C272840Amg.LIZ.getValue()).booleanValue()) {
            jCurrentTimeMillis = (System.currentTimeMillis() - celebrationTemplateNLEData.dataTimeStamp) / ((long) 1000000);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - celebrationTemplateNLEData.dataTimeStamp;
        }
        if (((int) jCurrentTimeMillis) <= ((Number) C272800Amc.LIZ.getValue()).intValue()) {
            LJFF.put(Integer.valueOf(i), map);
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "CeleTemplate", "nle read from keva, celebrationType = " + i);
            return;
        }
        ((Keva) LIZLLL.getValue()).erase(String.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.util.List<java.lang.String> r14, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, X.C532330KuF>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0MQ7
            if (r0 == 0) goto L20
            r2 = r15
            X.0MQ7 r2 = (X.C0MQ7) r2
            int r3 = r2.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L20
            int r3 = r3 - r1
            r2.LLILZ = r3
        L12:
            java.lang.Object r4 = r2.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r2.LLILZ
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L7c
        L20:
            X.0MQ7 r2 = new X.0MQ7
            r2.<init>(r13, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            r6 = r14
            r2.LL = r6     // Catch: java.lang.Throwable -> L85
            r2.getClass()     // Catch: java.lang.Throwable -> L85
            r2.LLILZ = r0     // Catch: java.lang.Throwable -> L85
            X.099m r4 = new X.099m     // Catch: java.lang.Throwable -> L85
            X.05Vn r0 = X.C099M.LIZLLL(r2)     // Catch: java.lang.Throwable -> L85
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L85
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L85
            java.lang.Class<com.ss.android.ugc.aweme.interfaces.ITemplateResourceService> r0 = com.ss.android.ugc.aweme.interfaces.ITemplateResourceService.class
            java.lang.Object r5 = r1.getService(r0)     // Catch: java.lang.Throwable -> L85
            com.ss.android.ugc.aweme.interfaces.ITemplateResourceService r5 = (com.ss.android.ugc.aweme.interfaces.ITemplateResourceService) r5     // Catch: java.lang.Throwable -> L85
            X.0nI7 r0 = X.C1429050nI7.LIZ     // Catch: java.lang.Throwable -> L85
            r0.getClass()     // Catch: java.lang.Throwable -> L85
            kotlin.Pair r7 = X.C1429050nI7.LIZ()     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.AwS587S0100000_8 r8 = new kotlin.jvm.internal.AwS587S0100000_8     // Catch: java.lang.Throwable -> L85
            r0 = 606(0x25e, float:8.49E-43)
            r8.<init>(r4, r0)     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.AwS622S0100000_8 r9 = new kotlin.jvm.internal.AwS622S0100000_8     // Catch: java.lang.Throwable -> L85
            r0 = 42
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r10 = "story_celebration"
            r11 = 0
            r12 = r11
            r5.LJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r4 = r4.LIZ()     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L85
            if (r4 != r0) goto L79
            X.C099Q.LIZJ(r2)     // Catch: java.lang.Throwable -> L85
        L79:
            if (r4 != r3) goto L7f
            return r3
        L7c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L85
        L7f:
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> L85
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L85
            goto L91
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L91:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)
            if (r0 == 0) goto L98
            r4 = 0
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LJ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, X.InterfaceC1364105Vn<? super X.C532330KuF> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0MQ8
            if (r0 == 0) goto La2
            r5 = r9
            X.0MQ8 r5 = (X.C0MQ8) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La2
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L32
            if (r0 != r4) goto Laa
            java.lang.Object r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L30
            java.lang.Object r0 = r1.get(r8)
        L2d:
            if (r0 == 0) goto La9
            return r0
        L30:
            r0 = r3
            goto L2d
        L32:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.interfaces.ITemplateResourceService> r0 = com.ss.android.ugc.aweme.interfaces.ITemplateResourceService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.interfaces.ITemplateResourceService r0 = (com.ss.android.ugc.aweme.interfaces.ITemplateResourceService) r0
            X.0KuF r0 = r0.LJIIIIZZ(r8)
            if (r0 == 0) goto L48
            return r0
        L48:
            X.01GW r0 = X.C0MQ2.LJII
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L57
            return r0
        L57:
            X.01GW r0 = X.C0MQ2.LJ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            java.lang.String r2 = r0.getString(r8, r3)
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L72
            java.lang.Class<X.0KuF> r0 = X.C532330KuF.class
            r1.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.Object r1 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L72
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L72
            goto L7e
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L85
            r1 = r3
        L85:
            if (r1 == 0) goto L93
            X.01GW r0 = X.C0MQ2.LJII
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r8, r1)
            return r1
        L93:
            java.util.List r0 = java.util.Collections.singletonList(r8)
            r5.LL = r8
            r5.LLILZ = r4
            java.lang.Object r1 = r7.LJ(r0, r5)
            if (r1 != r6) goto L25
            return r6
        La2:
            X.0MQ8 r5 = new X.0MQ8
            r5.<init>(r7, r9)
            goto L12
        La9:
            return r3
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final void LIZIZ(C013C c013c, InterfaceC1364105Vn<? super NLETemplateModel> interfaceC1364105Vn, NLETemplateModel nLETemplateModel) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C189200o6.m2constructorimpl(nLETemplateModel);
        interfaceC1364105Vn.resumeWith(nLETemplateModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(int r4, int r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LJI(int, int, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0132, code lost:
    
        if (r14 != false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.0MQ2] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r28, java.util.List<java.lang.String> r29, android.content.Context r30, int r31, int r32, boolean r33, X.InterfaceC1364105Vn<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LIZLLL(java.util.List, java.util.List, android.content.Context, int, int, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r16, boolean r17, int r18, android.content.Context r19, java.lang.String r20, boolean r21, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.String, X.C532330KuF, ? extends com.bytedance.ies.nle.editor_jni.NLETemplateModel>> r22) {
        /*
            r15 = this;
            r3 = r22
            r12 = r20
            r10 = r19
            r11 = r16
            r13 = r21
            boolean r0 = r3 instanceof X.C0MQ6
            r6 = r15
            if (r0 == 0) goto L8a
            r14 = r3
            X.0MQ6 r14 = (X.C0MQ6) r14
            int r2 = r14.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r14.LLIZLLLIL = r2
        L1d:
            java.lang.Object r1 = r14.LLILZLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r4 = r14.LLIZLLLIL
            r3 = 2
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            if (r4 == r0) goto L5c
            if (r4 != r3) goto L90
            java.lang.Object r0 = r14.LLILLL
            java.lang.Object r7 = r14.LLILLJJLI
            X.C155000ia.LIZIZ(r1)
        L35:
            X.0HZe r2 = new X.0HZe
            r2.<init>(r7, r0, r1)
            return r2
        L3b:
            X.C155000ia.LIZIZ(r1)
            r1 = r18
            r4 = r17
            java.lang.String r7 = LJI(r11, r1, r4)
            if (r7 != 0) goto L49
            return r2
        L49:
            r14.LLILLJJLI = r10
            r14.LLILLL = r12
            r14.LLILZ = r7
            r14.LL = r11
            r14.LLILZIL = r13
            r14.LLIZLLLIL = r0
            java.lang.Object r1 = r6.LJFF(r7, r14)
            if (r1 != r5) goto L6f
            return r5
        L5c:
            boolean r13 = r14.LLILZIL
            int r11 = r14.LL
            java.lang.Object r7 = r14.LLILZ
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r12 = r14.LLILLL
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r14.LLILLJJLI
            android.content.Context r10 = (android.content.Context) r10
            X.C155000ia.LIZIZ(r1)
        L6f:
            r0 = r1
            X.0KuF r0 = (X.C532330KuF) r0
            if (r0 == 0) goto L87
            java.lang.String r8 = r0.LIZ
            java.lang.String r9 = r0.LIZIZ
        L78:
            r14.LLILLJJLI = r7
            r14.LLILLL = r0
            r14.LLILZ = r2
            r14.LLIZLLLIL = r3
            java.lang.Object r1 = r6.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r5) goto L35
            return r5
        L87:
            r8 = r2
            r9 = r2
            goto L78
        L8a:
            X.0MQ6 r14 = new X.0MQ6
            r14.<init>(r6, r3)
            goto L1d
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LJII(int, boolean, int, android.content.Context, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final java.lang.String r31, final java.lang.String r32, java.lang.String r33, android.content.Context r34, final int r35, final java.lang.String r36, boolean r37, X.InterfaceC1364105Vn<? super com.bytedance.ies.nle.editor_jni.NLETemplateModel> r38) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MQ2.LIZ(java.lang.String, java.lang.String, java.lang.String, android.content.Context, int, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
