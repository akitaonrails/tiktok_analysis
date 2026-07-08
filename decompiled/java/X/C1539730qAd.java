package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0qAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539730qAd implements InterfaceC1539830qAn {
    public final ArrayList<InterfaceC1539830qAn> LIZIZ;

    public C1539730qAd() {
        ArrayList<InterfaceC1539830qAn> arrayList = new ArrayList<>();
        this.LIZIZ = arrayList;
        arrayList.add(new InterfaceC1539830qAn() { // from class: X.0qAb
            @Override // X.InterfaceC1539830qAn
            public final boolean LIZIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
                C1537910q7h c1537910q7h;
                C650530PfP c650530PfP;
                InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null && (c650530PfP = c1537910q7h.LJJIL) != null && c650530PfP.LIZ != null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1539830qAn
            public final C1154850g9r LIZ(Context context, C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam, C1539590qAP c1539590qAP, C1539750qAf c1539750qAf) {
                C1537910q7h c1537910q7h;
                C650530PfP c650530PfP;
                byte[] bArr;
                try {
                    InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null && (c650530PfP = c1537910q7h.LJJIL) != null && (bArr = c650530PfP.LIZ) != null) {
                        c1539590qAP.invoke(new C1539820qAm(C1539720qAc.LIZ(bArr, c1537480q70), new LinkedHashMap(), null));
                        return new C1154850g9r(EnumC1154840g9q.INIT_DATA, new LinkedHashMap());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1539750qAf.invoke(th);
                }
                return null;
            }
        });
        arrayList.add(new InterfaceC1539830qAn() { // from class: X.0qAY
            /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r0 r1
              0x0015: PHI (r0v5 java.lang.String) = (r0v1 java.lang.String), (r0v6 java.lang.String) binds: [B:9:0x0013, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
              0x0015: PHI (r1v3 com.bytedance.lynx.hybrid.param.HybridSchemaParam) = (r1v1 com.bytedance.lynx.hybrid.param.HybridSchemaParam), (r1v4 com.bytedance.lynx.hybrid.param.HybridSchemaParam) binds: [B:9:0x0013, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1539830qAn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(X.C1537480q70 r5, com.bytedance.lynx.hybrid.param.HybridSchemaParam r6) {
                /*
                    r4 = this;
                    X.0pxS r0 = r5.hybridParams
                    r3 = 0
                    if (r0 == 0) goto L2c
                    com.bytedance.lynx.hybrid.param.HybridSchemaParam r1 = r0.LIZJ()
                    if (r1 == 0) goto L11
                    java.lang.String r0 = r1.getSsrCacheKey()
                    if (r0 != 0) goto L15
                L11:
                    java.lang.String r0 = r5.ssrCacheKey
                    if (r1 == 0) goto L19
                L15:
                    java.lang.String r3 = r1.getSsrUrl()
                L19:
                    r2 = 0
                    r1 = 1
                    if (r0 == 0) goto L2e
                    int r0 = r0.length()
                    if (r0 == 0) goto L2e
                    if (r3 == 0) goto L2e
                    int r0 = r3.length()
                    if (r0 == 0) goto L2e
                    return r1
                L2c:
                    r1 = r3
                    goto L11
                L2e:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1539680qAY.LIZIZ(X.0q70, com.bytedance.lynx.hybrid.param.HybridSchemaParam):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[PHI: r0 r2
              0x0086: PHI (r0v16 com.bytedance.lynx.hybrid.param.HybridSchemaParam) = (r0v2 com.bytedance.lynx.hybrid.param.HybridSchemaParam), (r0v17 com.bytedance.lynx.hybrid.param.HybridSchemaParam) binds: [B:9:0x0013, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]
              0x0086: PHI (r2v3 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:9:0x0013, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1539830qAn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1154850g9r LIZ(android.content.Context r7, X.C1537480q70 r8, com.bytedance.lynx.hybrid.param.HybridSchemaParam r9, X.C1539590qAP r10, X.C1539750qAf r11) {
                /*
                    r6 = this;
                    X.0pxS r0 = r8.hybridParams
                    r5 = 0
                    if (r0 == 0) goto L8b
                    com.bytedance.lynx.hybrid.param.HybridSchemaParam r0 = r0.LIZJ()
                    if (r0 == 0) goto L11
                    java.lang.String r2 = r0.getSsrCacheKey()
                    if (r2 != 0) goto L86
                L11:
                    java.lang.String r2 = r8.ssrCacheKey
                    if (r0 != 0) goto L86
                    r1 = r5
                L16:
                    if (r2 == 0) goto L8d
                    int r0 = r2.length()
                    if (r0 == 0) goto L8d
                    if (r1 == 0) goto L8d
                    int r0 = r1.length()
                    if (r0 == 0) goto L8d
                    com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager r0 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LIZ
                    r0.getClass()
                    java.lang.String r4 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LIZ(r1, r2)
                    java.util.Map<java.lang.String, java.util.List<kotlin.jvm.functions.Function2<X.0qAm, java.lang.Throwable, kotlin.Unit>>> r1 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LIZJ
                    boolean r0 = r1.containsKey(r4)
                    if (r0 == 0) goto L5a
                    java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                    java.lang.Object r1 = r1.get(r4)
                    java.util.List r1 = (java.util.List) r1
                    if (r1 == 0) goto L8d
                    X.0qAk r0 = new X.0qAk
                    r0.<init>(r10, r11)
                    r1.add(r0)
                    java.util.Map<java.lang.String, X.0g9r> r0 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LJ
                    java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
                    java.lang.Object r1 = r0.get(r4)
                    X.0g9r r1 = (X.C1154850g9r) r1
                L53:
                    if (r1 == 0) goto L8d
                    X.0g9q r0 = X.EnumC1154840g9q.CACHE
                    r1.LIZ = r0
                    return r1
                L5a:
                    java.util.Map<java.lang.String, X.0qAm> r1 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LIZLLL
                    boolean r0 = r1.containsKey(r4)
                    if (r0 == 0) goto L8d
                    java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
                    java.lang.Object r3 = r1.get(r4)
                    X.0qAm r3 = (X.C1539820qAm) r3
                    if (r3 == 0) goto L7b
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r3.LIZIZ
                    r0 = 2
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.String r0 = "cacheStatus"
                    r2.put(r0, r1)
                    r10.invoke(r3)
                L7b:
                    java.util.Map<java.lang.String, X.0g9r> r0 = com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager.LJ
                    java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
                    java.lang.Object r1 = r0.get(r4)
                    X.0g9r r1 = (X.C1154850g9r) r1
                    goto L53
                L86:
                    java.lang.String r1 = r0.getSsrUrl()
                    goto L16
                L8b:
                    r0 = r5
                    goto L11
                L8d:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1539680qAY.LIZ(android.content.Context, X.0q70, com.bytedance.lynx.hybrid.param.HybridSchemaParam, X.0qAP, X.0qAf):X.0g9r");
            }
        });
        arrayList.add(new InterfaceC1539830qAn() { // from class: X.0qAj
            public final String LIZIZ = null;

            @Override // X.InterfaceC1539830qAn
            public final boolean LIZIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
                String ssrUrl;
                if (hybridSchemaParam != null) {
                    ssrUrl = hybridSchemaParam.getSsrUrl();
                } else {
                    ssrUrl = null;
                }
                if (ssrUrl == null || ssrUrl.length() == 0) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1539830qAn
            public final C1154850g9r LIZ(Context context, C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam, C1539590qAP c1539590qAP, C1539750qAf c1539750qAf) {
                String ssrUrl;
                String ssrUrl2;
                boolean appendCommonParams;
                String globalPropsAllowList = null;
                if (hybridSchemaParam == null || (ssrUrl = hybridSchemaParam.getSsrUrl()) == null || ssrUrl.length() == 0) {
                    return null;
                }
                if (hybridSchemaParam != null) {
                    globalPropsAllowList = hybridSchemaParam.getGlobalPropsAllowList();
                }
                if (hybridSchemaParam == null || (ssrUrl2 = hybridSchemaParam.getSsrUrl()) == null) {
                    ssrUrl2 = "";
                }
                if (hybridSchemaParam != null) {
                    appendCommonParams = hybridSchemaParam.getAppendCommonParams();
                } else {
                    appendCommonParams = true;
                }
                C1539530qAJ c1539530qAJ = C1539530qAJ.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = this.LIZIZ;
                C1539840qAo c1539840qAo = new C1539840qAo(c1539590qAP, c1539750qAf);
                c1539530qAJ.getClass();
                return C1539530qAJ.LJ(context, ssrUrl2, linkedHashMap, globalPropsAllowList, appendCommonParams, c1537480q70, hybridSchemaParam, str, c1539840qAo);
            }
        });
    }

    @Override // X.InterfaceC1539830qAn
    public final boolean LIZIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        C1537910q7h c1537910q7h;
        if (hybridSchemaParam == null) {
            InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
            hybridSchemaParam = null;
            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                hybridSchemaParam = c1537910q7h.LJJIIJ;
            }
        }
        Iterator<InterfaceC1539830qAn> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(c1537480q70, hybridSchemaParam)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1539830qAn
    public final C1154850g9r LIZ(Context context, C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam, C1539590qAP c1539590qAP, C1539750qAf c1539750qAf) {
        Iterator<InterfaceC1539830qAn> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C1154850g9r c1154850g9rLIZ = it2.next().LIZ(context, c1537480q70, hybridSchemaParam, c1539590qAP, c1539750qAf);
            if (c1154850g9rLIZ != null) {
                return c1154850g9rLIZ;
            }
        }
        return null;
    }
}
