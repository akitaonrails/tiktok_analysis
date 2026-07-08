package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS56S0001000_13;
import kotlin.jvm.internal.AwS98S1000000_13;
import kotlin.ranges.IntRange;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0WbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826320WbG implements InterfaceC826390WbN {
    public static final C826320WbG LIZ = new C826320WbG();
    public static final Map<Integer, InterfaceC826390WbN> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(400204, new InterfaceC826390WbN() { // from class: X.0WbK
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "sshttpcall_execute";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        @Override // X.InterfaceC826390WbN
        public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
            C0X9S c0x9s;
            if ((obj instanceof C0X9S) && (c0x9s = (C0X9S) obj) != null) {
                return C826370WbL.LIZ("sshttpcall_execute", c0x9s, "SsHttpCallExecuteHookStrategy", c0wzw);
            }
            return new C0WSU(false, null);
        }
    }), new Pair(400205, new InterfaceC826390WbN() { // from class: X.0WbJ
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "sshttpcall_enqueue";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        @Override // X.InterfaceC826390WbN
        public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
            C0X9S c0x9s;
            if ((obj instanceof C0X9S) && (c0x9s = (C0X9S) obj) != null) {
                return C826370WbL.LIZ("sshttpcall_enqueue", c0x9s, "SsHttpCallEnqueueHookStrategy", c0wzw);
            }
            return new C0WSU(false, null);
        }
    }), new Pair(400206, new InterfaceC826390WbN() { // from class: X.0WbQ
        public static final C01GW<Field> LIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS200S0000000_13.get$arr$(203));

        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "retrofit_request_builder_build";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
        @Override // X.InterfaceC826390WbN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0WSU preInvoke(int r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9, java.lang.Object[] r10, java.lang.String r11, X.C0WZW r12) {
            /*
                r5 = this;
                boolean r0 = r9 instanceof com.bytedance.retrofit2.RequestBuilder
                r4 = 0
                if (r0 == 0) goto L10
                com.bytedance.retrofit2.RequestBuilder r9 = (com.bytedance.retrofit2.RequestBuilder) r9
            L7:
                r3 = 0
                if (r9 != 0) goto L12
                X.0WSU r0 = new X.0WSU
                r0.<init>(r3, r4)
                return r0
            L10:
                r9 = r4
                goto L7
            L12:
                X.01GW<java.lang.reflect.Field> r0 = X.C826420WbQ.LIZ
                java.lang.Object r0 = r0.getValue()
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                if (r0 == 0) goto L3d
                java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L39
                boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L37
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L39
                if (r1 == 0) goto L37
                java.lang.Class<X.0WbP> r0 = X.C826410WbP.class
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L39
            L2e:
                boolean r0 = r1 instanceof X.C826410WbP     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L3d
                X.0WbP r1 = (X.C826410WbP) r1     // Catch: java.lang.Throwable -> L39
                if (r1 != 0) goto L4d
                goto L3d
            L37:
                r1 = r4
                goto L2e
            L39:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L3d:
                java.lang.Class<X.0WbP> r2 = X.C826410WbP.class
                X.0WbP r0 = new X.0WbP
                r0.<init>()
                java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r9.LJJ
                java.lang.Object r0 = r2.cast(r0)
                r1.put(r2, r0)
            L4d:
                X.0WSU r0 = new X.0WSU
                r0.<init>(r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C826420WbQ.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
        }
    }), new Pair(400212, new InterfaceC826390WbN() { // from class: X.0WbE
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "ss_cronet_new_ss_call";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
        @Override // X.InterfaceC826390WbN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0WSU preInvoke(int r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, java.lang.Object[] r16, java.lang.String r17, X.C0WZW r18) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C826300WbE.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
        }
    }), new Pair(400207, new InterfaceC826390WbN() { // from class: X.0Wbb
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "okhttp_call_server_intercept";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        @Override // X.InterfaceC826390WbN
        public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
            Object objLJJIFFI;
            C0X0W c0x0w;
            LinkedHashMap linkedHashMap;
            String str4;
            String[] strArr;
            if (objArr != null) {
                objLJJIFFI = C13LQ.LJJIFFI(objArr);
            } else {
                objLJJIFFI = null;
            }
            if (objLJJIFFI instanceof C0X0W) {
                c0x0w = (C0X0W) objLJJIFFI;
            } else {
                c0x0w = null;
            }
            if (c0x0w == null) {
                return new C0WSU(false, null);
            }
            Request request = c0x0w.request();
            if (request == null) {
                return new C0WSU(false, null);
            }
            String str5 = request.url().LJIIIIZZ;
            try {
                URI uri = new URI(str5);
                C0X1V c0x1vHeaders = request.headers();
                String[] strArr2 = c0x1vHeaders.LIZ;
                if (strArr2.length / 2 > 0) {
                    IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, strArr2.length / 2);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iLIZIZ);
                    C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                    while (it2.LLILLL) {
                        int iNextInt = it2.nextInt();
                        Pair pair = new Pair(c0x1vHeaders.LJ(iNextInt), c0x1vHeaders.LJIIJ(iNextInt));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    linkedHashMap = null;
                }
                String host = uri.getHost();
                String scheme = uri.getScheme();
                String strMethod = request.method();
                Map mapLIZIZ = C205000qe.LIZIZ(uri.getRawQuery());
                if (linkedHashMap != null) {
                    str4 = (String) linkedHashMap.get("Cookie");
                } else {
                    str4 = null;
                }
                Map mapLIZ = C205000qe.LIZ(str4);
                if (c0wzw != null) {
                    strArr = c0wzw.LJ;
                } else {
                    strArr = null;
                }
                C826260WbA.LIZIZ(new C826120Waw(request, "okhttp_call_server_intercept", str5, host, scheme, strMethod, linkedHashMap, mapLIZIZ, mapLIZ, strArr), C826260WbA.LIZIZ);
                return new C0WSU(false, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("CallServerInterceptorHookStrategy", new AwS98S1000000_13(str5, 4), 3, null);
                return new C0WSU(false, null);
            }
        }
    }), new Pair(400208, new InterfaceC826390WbN() { // from class: X.0WbR
        public static final C01GW<Field> LIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS200S0000000_13.get$arr$(200));

        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "okhttp_request_builder_build";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
        @Override // X.InterfaceC826390WbN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0WSU preInvoke(int r5, java.lang.String r6, java.lang.String r7, java.lang.Object r8, java.lang.Object[] r9, java.lang.String r10, X.C0WZW r11) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof X.C0X33
                r3 = 0
                if (r0 == 0) goto L10
                X.0X33 r8 = (X.C0X33) r8
            L7:
                r2 = 0
                if (r8 != 0) goto L12
                X.0WSU r0 = new X.0WSU
                r0.<init>(r2, r3)
                return r0
            L10:
                r8 = r3
                goto L7
            L12:
                X.01GW<java.lang.reflect.Field> r0 = X.C826430WbR.LIZ
                java.lang.Object r0 = r0.getValue()
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                if (r0 == 0) goto L3d
                java.lang.Object r1 = r0.get(r8)     // Catch: java.lang.Throwable -> L39
                boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L37
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L39
                if (r1 == 0) goto L37
                java.lang.Class<X.0WbP> r0 = X.C826410WbP.class
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L39
            L2e:
                boolean r0 = r1 instanceof X.C826410WbP     // Catch: java.lang.Throwable -> L39
                if (r0 == 0) goto L3d
                X.0WbP r1 = (X.C826410WbP) r1     // Catch: java.lang.Throwable -> L39
                if (r1 != 0) goto L47
                goto L3d
            L37:
                r1 = r3
                goto L2e
            L39:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L3d:
                java.lang.Class<X.0WbP> r1 = X.C826410WbP.class
                X.0WbP r0 = new X.0WbP
                r0.<init>()
                r8.LJI(r1, r0)
            L47:
                X.0WSU r0 = new X.0WSU
                r0.<init>(r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C826430WbR.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
        }
    }), new Pair(400209, new InterfaceC826390WbN() { // from class: X.0WbI
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "okhttp_realcall_execute";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        @Override // X.InterfaceC826390WbN
        public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
            InterfaceC1495580p1Q interfaceC1495580p1Q;
            if ((obj instanceof InterfaceC1495580p1Q) && (interfaceC1495580p1Q = (InterfaceC1495580p1Q) obj) != null) {
                return C826520Wba.LIZ(interfaceC1495580p1Q, "okhttp_realcall_execute", interfaceC1495580p1Q, "RealCallExecuteHookStrategy", c0wzw);
            }
            return new C0WSU(false, null);
        }
    }), new Pair(400210, new InterfaceC826390WbN() { // from class: X.0WbH
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "okhttp_realcall_enqueue";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        @Override // X.InterfaceC826390WbN
        public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
            InterfaceC1495580p1Q interfaceC1495580p1Q;
            if ((obj instanceof InterfaceC1495580p1Q) && (interfaceC1495580p1Q = (InterfaceC1495580p1Q) obj) != null) {
                return C826520Wba.LIZ(interfaceC1495580p1Q, "okhttp_realcall_enqueue", interfaceC1495580p1Q, "RealCallEnqueueHookStrategy", c0wzw);
            }
            return new C0WSU(false, null);
        }
    }), new Pair(400001, new InterfaceC826390WbN() { // from class: X.0WbM
        @Override // X.InterfaceC826390WbN
        public final String getTriggerId() {
            return "urlconnection_on_connect";
        }

        @Override // X.InterfaceC826390WbN
        public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
        @Override // X.InterfaceC826390WbN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0WSU preInvoke(int r20, java.lang.String r21, java.lang.String r22, java.lang.Object r23, java.lang.Object[] r24, java.lang.String r25, X.C0WZW r26) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C826380WbM.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
        }
    }));

    @Override // X.InterfaceC826390WbN
    public final String getTriggerId() {
        return "";
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0043: INVOKE (r2v0 ?? I:kotlin.jvm.internal.AwS56S0001000_13), (r7 I:int), (r0 I:int) DIRECT call: kotlin.jvm.internal.AwS56S0001000_13.<init>(int, int):void A[MD:(int, int):void (m)] (LINE:117440579), block:B:14:0x003b */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    @Override // X.InterfaceC826390WbN
    public final C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        ?? awS56S0001000_13;
        try {
            InterfaceC826390WbN interfaceC826390WbN = LIZIZ.get(Integer.valueOf(i));
            if (interfaceC826390WbN == null) {
                return new C0WSU(false, null);
            }
            CopyOnWriteArrayList<InterfaceC826190Wb3> copyOnWriteArrayList = C826260WbA.LIZ;
            if (!C826260WbA.LIZ(interfaceC826390WbN.getTriggerId())) {
                return new C0WSU(false, null);
            }
            return interfaceC826390WbN.preInvoke(i, str, str2, obj, objArr, str3, c0wzw);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
            C0WSW.LIZ("NetworkInvokeDispatcher", new AwS56S0001000_13(awS56S0001000_13, 1), 3, th);
            return new C0WSU(false, null);
        }
    }

    @Override // X.InterfaceC826390WbN
    public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        try {
            InterfaceC826390WbN interfaceC826390WbN = LIZIZ.get(Integer.valueOf(i));
            if (interfaceC826390WbN == null) {
                return;
            }
            interfaceC826390WbN.postInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("NetworkInvokeDispatcher", new AwS56S0001000_13(i, 0), 3, th);
        }
    }
}
