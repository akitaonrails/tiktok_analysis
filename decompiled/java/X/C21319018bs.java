package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21319018bs {
    public final C21328418dO LIZ;
    public final InterfaceC21319518bx LIZIZ;
    public final C1874840yt8 LIZJ = new C1874840yt8();
    public final C21319118bt LIZLLL = new C21319118bt();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.HashMap] */
    public static Object LIZJ(Object obj) {
        Object arrayList;
        int i = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            arrayList = new Object[length];
            while (i < length) {
                arrayList[i] = LIZJ(C13LQ.LJJIIZ(i, objArr));
                i++;
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            arrayList = new ArrayList();
            while (i < size) {
                arrayList.add(LIZJ(C13LP.LJJJLZIJ(i, list)));
                i++;
            }
        } else {
            if (obj instanceof Map) {
                obj = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if ((key instanceof String) && key != null) {
                        obj.put(key, LIZJ(entry.getValue()));
                    }
                }
            } else if (obj instanceof Number) {
                obj = (Number) obj;
                double dDoubleValue = obj.doubleValue();
                int iIntValue = obj.intValue();
                if (dDoubleValue == iIntValue) {
                    return Integer.valueOf(iIntValue);
                }
                long jLongValue = obj.longValue();
                if (dDoubleValue == jLongValue) {
                    return Long.valueOf(jLongValue);
                }
            }
            return obj;
        }
        return arrayList;
    }

    public C21319018bs(C21328418dO c21328418dO, InterfaceC21319518bx interfaceC21319518bx) {
        this.LIZ = c21328418dO;
        this.LIZIZ = interfaceC21319518bx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r4 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto> LIZIZ(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            X.18bt r5 = r6.LIZLLL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto>>> r0 = r5.LIZ
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r3 = 0
            if (r0 == 0) goto L16
            java.lang.Object r4 = r0.get(r8)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L16
        L15:
            return r4
        L16:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.LIZIZ
            java.lang.Object r1 = r0.get(r7)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L49
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r1.get(r8)
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto>>> r0 = r5.LIZ
            java.lang.Object r1 = r0.get(r7)
            if (r1 != 0) goto L3e
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r7, r1)
            if (r0 == 0) goto L3e
            r1 = r0
        L3e:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.util.List r2 = (java.util.List) r2
            java.util.List r0 = X.C21319118bt.LIZIZ(r2)
            r1.put(r8, r0)
        L49:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.action.framework.ECActionDto>>> r0 = r5.LIZ
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L7a
            java.lang.Object r4 = r0.get(r8)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L15
        L5b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "can_not_find_action_chain: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " -  "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r1 = 1
            java.lang.String r0 = ""
            r6.LIZ(r1, r2, r0, r3)
            return r4
        L7a:
            r4 = r3
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21319018bs.LIZIZ(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[PHI: r7
      0x005a: PHI (r7v7 X.18bk<?>) = (r7v1 X.18bk<?>), (r7v2 X.18bk<?>), (r7v4 X.18bk<?>), (r7v6 X.18bk<?>), (r7v9 X.18bk<?>) binds: [B:20:0x0041, B:28:0x005e, B:33:0x006c, B:25:0x0055, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:34:0x006f, B:36:0x0073, B:38:0x0081, B:40:0x0085, B:41:0x0090, B:43:0x0094, B:45:0x00a0, B:46:0x00a2, B:48:0x00aa, B:49:0x00ac, B:51:0x00b9, B:54:0x00c4), top: B:67:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:34:0x006f, B:36:0x0073, B:38:0x0081, B:40:0x0085, B:41:0x0090, B:43:0x0094, B:45:0x00a0, B:46:0x00a2, B:48:0x00aa, B:49:0x00ac, B:51:0x00b9, B:54:0x00c4), top: B:67:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Object r19, X.C21319318bv r20) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21319018bs.LIZLLL(java.lang.Object, X.18bv):void");
    }

    public final void LJ(String str, Function0<? extends AbstractC21318218bk<?>> function0) {
        this.LIZJ.LIZ.put(str, function0);
    }

    public final void LIZ(int i, String str, String str2, Throwable th) {
        C1768180w76.LIZ("tiktokec_rd_geccard_action_error", null, C2097608Jq.LJIIJ(new Pair("error_code", Integer.valueOf(i)), new Pair("error_msg", str), new Pair("extra_params", str2)), false);
        if (th != null) {
            C1AF0.LJI(th, "GECCardAction", C2097608Jq.LJIIIIZZ(new Pair("biz", "GECCardAction"), new Pair("msg", str)));
        }
        InterfaceC21319518bx interfaceC21319518bx = this.LIZIZ;
        if (interfaceC21319518bx != null) {
            interfaceC21319518bx.ensureNotReachHere();
        }
    }
}
