package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AZW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZW {
    public static boolean LJIIIZ;
    public static final C1AZW LIZ = new C1AZW();
    public static final long LIZIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
    public static final long LIZJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIJ = "";

    @InterfaceC1294060jmO
    public static final void LJIIIIZZ(String str, String str2) {
        LJIIJ(12, str, str2, null, null);
    }

    public static String LIZLLL(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get("event_id")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event_id:");
            sbLIZ.append(str2);
            sbLIZ.append(", event_detail:");
            sbLIZ.append((String) map.get("event_detail"));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @InterfaceC1294060jmO
    public static final void LJ(String str, String str2) {
        LJFF(str, str2, null, null);
    }

    public static String LJIIJJI(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get("event_type")) != null && (!a0.LJJJIL(str2)) && !Intrinsics.LJFF(str2, "-")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @InterfaceC1294060jmO
    public static final void LJIILJJIL(String str, String str2) {
        LJIILL(str, str2, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8) {
        /*
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L3a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L28
        L3a:
            r2 = 0
        L3b:
            r4.append(r2)
            if (r7 == 0) goto L52
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L54
        L52:
            java.lang.String r0 = ""
        L54:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LIZIZ(r3, r0)
            r3 = 0
            java.lang.String r4 = "d"
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LIZ(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L3f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L2d
        L3f:
            r2 = 0
        L40:
            r4.append(r2)
            if (r7 == 0) goto L57
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L59
        L57:
            java.lang.String r0 = ""
        L59:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LJ(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            r3 = 0
            java.lang.String r4 = "e"
            r0.getClass()
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJFF(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L3f
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L2d
        L3f:
            r2 = 0
        L40:
            r4.append(r2)
            if (r7 == 0) goto L57
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L59
        L57:
            java.lang.String r0 = ""
        L59:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LJIIL(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            r3 = 0
            java.lang.String r4 = "w"
            r0.getClass()
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIILL(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC2181441AZa r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            r8 = r13
            r5 = r10
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L30
        L42:
            r2 = 0
        L43:
            r4.append(r2)
            r7 = r12
            if (r7 == 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L5d
        L5b:
            java.lang.String r0 = ""
        L5d:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LIZIZ(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            java.lang.String r4 = "d"
            r0.getClass()
            r3 = r9
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LIZIZ(X.1AZa, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.InterfaceC2181441AZa r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            r8 = r13
            r5 = r10
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L30
        L42:
            r2 = 0
        L43:
            r4.append(r2)
            r7 = r12
            if (r7 == 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L5d
        L5b:
            java.lang.String r0 = ""
        L5d:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LJ(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            java.lang.String r4 = "e"
            r0.getClass()
            r3 = r9
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJI(X.1AZa, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(X.InterfaceC2181441AZa r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            r8 = r13
            r5 = r10
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L30
        L42:
            r2 = 0
        L43:
            r4.append(r2)
            r7 = r12
            if (r7 == 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L5d
        L5b:
            java.lang.String r0 = ""
        L5d:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LJIIIZ(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            java.lang.String r4 = "i"
            r0.getClass()
            r3 = r9
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIIIZ(X.1AZa, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map r13) {
        /*
            r8 = r13
            r7 = r12
            r0 = r9 & 4
            r4 = 0
            if (r0 == 0) goto L8
            r7 = r4
        L8:
            r0 = r9 & 8
            if (r0 == 0) goto Ld
            r8 = r4
        Ld:
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            r5 = r10
            java.lang.String r2 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r3.append(r0)
            java.lang.String r0 = ", params:"
            r3.append(r0)
            if (r8 == 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r8.size()
            r4.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4e
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r4.add(r0)
            goto L3c
        L4e:
            r3.append(r4)
            if (r7 == 0) goto L65
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L67
        L65:
            java.lang.String r0 = ""
        L67:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            X.C20441214yg.LJIIIZ(r2, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            r3 = 0
            java.lang.String r4 = "i"
            r0.getClass()
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIIJ(int, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(X.InterfaceC2181441AZa r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            X.1AZW r0 = X.C1AZW.LIZ
            r0.getClass()
            r8 = r13
            r5 = r10
            java.lang.String r3 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r4.append(r0)
            java.lang.String r0 = ", params:"
            r4.append(r0)
            if (r8 == 0) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r8.size()
            r2.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L43
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r2.add(r0)
            goto L30
        L42:
            r2 = 0
        L43:
            r4.append(r2)
            r7 = r12
            if (r7 == 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L5d
        L5b:
            java.lang.String r0 = ""
        L5d:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            X.C20441214yg.LJIIL(r3, r0)
            X.1AZW r0 = X.C1AZW.LIZ
            java.lang.String r4 = "w"
            r0.getClass()
            r3 = r9
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIILLIIL(X.1AZa, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(X.InterfaceC2181441AZa r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIIL(X.1AZa, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(X.C1AZW r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map r13, int r14) {
        /*
            r8 = r13
            r7 = r12
            r0 = r14 & 4
            r4 = 0
            if (r0 == 0) goto L8
            r7 = r4
        L8:
            r0 = r14 & 8
            if (r0 == 0) goto Ld
            r8 = r4
        Ld:
            r9.getClass()
            r5 = r10
            java.lang.String r2 = LJIIJJI(r5, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = r11
            java.lang.String r0 = LIZLLL(r6, r8)
            r3.append(r0)
            java.lang.String r0 = ", params:"
            r3.append(r0)
            if (r8 == 0) goto L4c
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r8.size()
            r4.<init>(r0)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4c
            r1.next()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            r4.add(r0)
            goto L3a
        L4c:
            r3.append(r4)
            if (r7 == 0) goto L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = ", extra: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L65
        L63:
            java.lang.String r0 = ""
        L65:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            X.C20441214yg.LJIIJJI(r2, r0)
            r3 = 0
            java.lang.String r4 = "v"
            LJIIL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AZW.LJIILIIL(X.1AZW, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):void");
    }
}
