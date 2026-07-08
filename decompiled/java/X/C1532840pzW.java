package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.tiktok.forestx.RequestParamsX;
import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532840pzW implements InterfaceC1541110qCr<C1532900pzc, C1532310pyf> {
    public final String LIZ = "strict_match";
    public final String LIZIZ = "disable_gecko";
    public final String LIZJ = "disable_assets";
    public final String LIZLLL = "disable_cdn";
    public final String LJ = "ignored_all_keys";
    public final String LJFF = "ignored_match_keys";
    public final String LJI = "optimize_web_stream";
    public final String LJII = "need_common_params";
    public final HashSet<String> LJIIIIZZ = C093Y.LIZJ("disable_cdn", "disable_assets", "disable_gecko", "ignored_match_keys", "ignored_all_keys", "need_common_params", "strict_match");

    @Override // X.InterfaceC1541110qCr
    public final void LIZ(C1541080qCo<C1532310pyf> c1541080qCo, String str) {
    }

    @Override // X.InterfaceC1541110qCr
    public final void LIZIZ(InterfaceC1541060qCm interfaceC1541060qCm, AbstractC1541140qCu<C1532310pyf> abstractC1541140qCu, EnumC1541150qCv enumC1541150qCv) {
    }

    @Override // X.InterfaceC1541110qCr
    public final boolean LJI(C1541080qCo<C1532310pyf> c1541080qCo) {
        return true;
    }

    @Override // X.InterfaceC1541110qCr
    public final boolean LIZLLL(InterfaceC1541060qCm interfaceC1541060qCm, InterfaceC1541060qCm interfaceC1541060qCm2) {
        C1532710pzJ c1532710pzJ;
        C1532710pzJ c1532710pzJ2;
        String str;
        String str2 = null;
        if (interfaceC1541060qCm instanceof C1532710pzJ) {
            c1532710pzJ = (C1532710pzJ) interfaceC1541060qCm;
        } else {
            c1532710pzJ = null;
        }
        if (c1532710pzJ == null || !(interfaceC1541060qCm2 instanceof C1532710pzJ) || (c1532710pzJ2 = (C1532710pzJ) interfaceC1541060qCm2) == null) {
            return true;
        }
        if (Intrinsics.LJFF(c1532710pzJ2.LIZLLL, c1532710pzJ.LIZLLL)) {
            C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
            if (c1541080qCo != null) {
                str = c1541080qCo.LIZ.LIZIZ;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "ssp_global_optimize")) {
                C1541080qCo<C1532310pyf> c1541080qCo2 = c1532710pzJ2.LJJIIZI;
                if (c1541080qCo2 != null) {
                    str2 = c1541080qCo2.LIZ.LIZIZ;
                }
                if (!Intrinsics.LJFF(str2, "ssp_global_optimize")) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1541110qCr
    public final InterfaceC1541060qCm LJ(Object obj, boolean z) {
        String str;
        String str2;
        C1532900pzc c1532900pzc = (C1532900pzc) obj;
        boolean z2 = true;
        if (a0.LJJJIL(c1532900pzc.LIZIZ) && ((str = c1532900pzc.LIZJ.channel) == null || a0.LJJJIL(str) || (str2 = c1532900pzc.LIZJ.bundle) == null || a0.LJJJIL(str2))) {
            return null;
        }
        String str3 = c1532900pzc.LIZIZ;
        if (!c1532900pzc.LIZLLL && !z) {
            z2 = false;
        }
        return new C1532710pzJ(str3, z2, z, c1532900pzc.LIZ, c1532900pzc.LIZJ);
    }

    @Override // X.InterfaceC1541110qCr
    public final void LJII(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1532310pyf> c1541080qCo) {
        ((C1532710pzJ) interfaceC1541060qCm).LJJIIZI = c1541080qCo;
    }

    @Override // X.InterfaceC1541110qCr
    public final C1532900pzc LIZJ(k kVar, C08AB c08ab, Map map) {
        Object c098200Yq;
        InterfaceC679950Qll interfaceC679950Qll;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        InterfaceC1532890pzb interfaceC1532890pzb;
        String groupId;
        Object obj = null;
        if (!(kVar instanceof n)) {
            return null;
        }
        n nVarLJIILIIL = kVar.LJIILIIL();
        try {
            c098200Yq = nVarLJIILIIL.LJJIIZ("url").LJIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            C1532920pze.LIZJ.LIZIZ("ForestX", "parseInput", "cannot get url, which is required");
            return null;
        }
        final RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
        requestParamsX.enableContainerProcessUrl = true;
        if (map != null) {
            interfaceC679950Qll = (InterfaceC679950Qll) map.get("query");
        } else {
            interfaceC679950Qll = null;
        }
        if ((interfaceC679950Qll instanceof InterfaceC1532890pzb) && (interfaceC1532890pzb = (InterfaceC1532890pzb) interfaceC679950Qll) != null && (groupId = interfaceC1532890pzb.getGroupId()) != null) {
            requestParamsX.groupId = groupId;
        }
        try {
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ(this.LJI);
            if (kVarLJJIIZ != null) {
                c098200Yq2 = Boolean.valueOf(kVarLJJIIZ.LJ());
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Boolean bool = (Boolean) c098200Yq2;
        if (bool != null && bool.booleanValue()) {
            bool.booleanValue();
            requestParamsX.optimizeStreamForWeb = true;
        }
        try {
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("query");
            kVarLJJIIZ2.getClass();
            if (kVarLJJIIZ2 instanceof n) {
                c098200Yq3 = kVarLJJIIZ2.LJIILIIL();
            } else {
                c098200Yq3 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        n nVar = (n) c098200Yq3;
        if (nVar != null) {
            c08ab.LIZJ("parse_query");
            C1532870pzZ c1532870pzZ = C1532870pzZ.LIZ;
            InterfaceC1514200pVS interfaceC1514200pVS = new InterfaceC1514200pVS() { // from class: X.0pzX
                @Override // X.InterfaceC1514200pVS
                public final boolean LIZ(String str2, k kVar2) {
                    if (!this.LIZ.LJIIIIZZ.contains(str2)) {
                        return false;
                    }
                    C1532840pzW c1532840pzW = this.LIZ;
                    RequestParamsX requestParamsX2 = requestParamsX;
                    try {
                        if (Intrinsics.LJFF(str2, c1532840pzW.LIZIZ)) {
                            requestParamsX2.disableGecko = kVar2.LJ();
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LIZJ)) {
                            requestParamsX2.disableAssets = kVar2.LJ();
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LIZLLL)) {
                            requestParamsX2.disableCdn = kVar2.LJ();
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LJ)) {
                            requestParamsX2.ignoreAllQueryParams = kVar2.LJ();
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LIZ)) {
                            requestParamsX2.setStrictMatch(kVar2.LJ());
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LJFF)) {
                            HashSet hashSet = new HashSet();
                            Iterator<k> it2 = kVar2.LJIIL().iterator();
                            while (it2.hasNext()) {
                                hashSet.add(it2.next().LJIL());
                            }
                            requestParamsX2.ignoredQueryParams = hashSet;
                        } else if (Intrinsics.LJFF(str2, c1532840pzW.LJII)) {
                            requestParamsX2.needCommonParams = kVar2.LJ();
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return true;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                        return true;
                    }
                }
            };
            c1532870pzZ.getClass();
            requestParamsX.extraQueries = C1532870pzZ.LIZIZ(nVar, false, map, interfaceC1514200pVS, false).LJ();
        }
        try {
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("preferred_type");
            if (kVarLJJIIZ3 != null) {
                c098200Yq4 = kVarLJJIIZ3.LJIL();
            } else {
                c098200Yq4 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq4) && c098200Yq4 != null) {
            if (Intrinsics.LJFF(c098200Yq4, "stream")) {
                requestParamsX.consumeType = InputStream.class;
            } else if (Intrinsics.LJFF(c098200Yq4, "bytes")) {
                requestParamsX.consumeType = byte[].class;
            } else {
                Class<?> cls = C1532950pzh.LJI.get(c098200Yq4);
                if (cls == null) {
                    cls = File.class;
                }
                requestParamsX.consumeType = cls;
            }
        }
        try {
            k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("disable_redirect");
            if (kVarLJJIIZ4 != null) {
                c098200Yq5 = Boolean.valueOf(kVarLJJIIZ4.LJ());
            } else {
                c098200Yq5 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq5)) {
            c098200Yq5 = null;
        }
        if (((Boolean) c098200Yq5) != null) {
            requestParamsX.allowRedirectInternally = !r1.booleanValue();
        }
        try {
            k kVarLJJIIZ5 = nVarLJIILIIL.LJJIIZ("header");
            kVarLJJIIZ5.getClass();
            if (kVarLJJIIZ5 instanceof n) {
                c098200Yq6 = kVarLJJIIZ5.LJIILIIL();
            } else {
                c098200Yq6 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq6);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq6 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq6);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq6)) {
            obj = c098200Yq6;
        }
        n nVar2 = (n) obj;
        if (nVar2 != null) {
            c08ab.LIZJ("parse_header");
            C1532870pzZ.LIZ.getClass();
            requestParamsX.httpRequestHeaders = C1532870pzZ.LIZIZ(nVar2, true, map, null, false).LJ();
        }
        C1532680pzG.LIZ.getClass();
        return new C1532900pzc(C1532680pzG.LJJ, str, requestParamsX, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[EDGE_INSN: B:36:0x004a->B:16:0x004a BREAK  A[LOOP:0: B:9:0x0022->B:39:0x0022]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // X.InterfaceC1541110qCr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1535940q4W LJFF(X.C1532900pzc r17, X.InterfaceC1541060qCm r18, X.C1535940q4W r19) {
        /*
            r16 = this;
            r8 = r19
            r3 = r18
            r0 = r17
            X.0pzc r0 = (X.C1532900pzc) r0
            com.tiktok.forestx.RequestParamsX r1 = r0.LIZJ
            X.0pzJ r3 = (X.C1532710pzJ) r3
            java.lang.Long r0 = r1.cacheFreshTime
            if (r0 != 0) goto L4a
            boolean r0 = r3.LJIIIZ
            r7 = 0
            if (r0 == 0) goto L7d
            X.0pzG r0 = X.C1532680pzG.LIZ
            r0.getClass()
            com.google.gson.h r0 = X.C1532680pzG.LJI
            if (r0 == 0) goto L4a
            java.util.Iterator r6 = r0.iterator()
        L22:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r5 = r6.next()
            r4 = r5
            com.google.gson.k r4 = (com.google.gson.k) r4
            r4.getClass()
            boolean r0 = r4 instanceof com.google.gson.q
            if (r0 == 0) goto L22
            X.0pzK r0 = r3.LJJIII
            java.lang.String r2 = r0.LIZIZ
            com.google.gson.q r0 = r4.LJIILJJIL()
            java.lang.String r0 = r0.LJIL()
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r7)
            if (r0 == 0) goto L22
            if (r5 != 0) goto L7d
        L4a:
            boolean r0 = X.C1531760pxm.LIZ()
            if (r0 != 0) goto L7d
            if (r8 != 0) goto L63
            X.0q4W r8 = new X.0q4W
            r9 = 1
            r10 = 0
            r11 = 300000(0x493e0, double:1.482197E-318)
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.0q03 r15 = X.EnumC1533170q03.REMOVE_ON_CONSUME
            r8.<init>(r9, r10, r11, r13, r15)
        L63:
            boolean r0 = r1.enableMemoryCache
            if (r0 != 0) goto L6b
            boolean r0 = r3.LJIIIZ
            if (r0 == 0) goto L6f
        L6b:
            X.0q03 r0 = X.EnumC1533170q03.KEEP_ALIVE
            r8.LJ = r0
        L6f:
            java.lang.Long r0 = r1.cacheFreshTime
            if (r0 == 0) goto L7a
            long r0 = r0.longValue()
        L77:
            r8.LIZJ = r0
        L79:
            return r8
        L7a:
            long r0 = r8.LIZJ
            goto L77
        L7d:
            if (r8 != 0) goto L79
            X.0pzG r0 = X.C1532680pzG.LIZ
            r0.getClass()
            int r0 = X.C1532680pzG.LJIILLIIL
            if (r0 <= 0) goto L79
            X.0q4W r8 = new X.0q4W
            r9 = 1
            r10 = 0
            r11 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.0q03 r15 = X.EnumC1533170q03.REMOVE_ON_CONSUME
            r8.<init>(r9, r10, r11, r13, r15)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532840pzW.LJFF(java.lang.Object, X.0qCm, X.0q4W):X.0q4W");
    }

    @Override // X.InterfaceC1541110qCr
    public final void LJIIIIZZ(InterfaceC1541240qD4 interfaceC1541240qD4, C08AB c08ab, C1541080qCo c1541080qCo) {
        InterfaceC1532100pyK interfaceC1532100pyK;
        AbstractC1532350pyj<? extends Object> abstractC1532350pyj;
        C1532310pyf c1532310pyf = (C1532310pyf) interfaceC1541240qD4;
        C1532300pye c1532300pye = c1532310pyf.LIZIZ;
        if (c1532300pye != null && !c1532300pye.LJI) {
            C1532410pyp<? extends Object> c1532410pyp = c1532310pyf.LJI;
            Object obj = null;
            if (c1532410pyp != null && (abstractC1532350pyj = c1532410pyp.LIZ) != null) {
                obj = abstractC1532350pyj.LIZ;
            }
            if ((obj instanceof InterfaceC1532100pyK) && (interfaceC1532100pyK = (InterfaceC1532100pyK) obj) != null) {
                interfaceC1532100pyK.LIZLLL(c1532310pyf);
            } else {
                c1532310pyf.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC1541110qCr
    public final AbstractC1541130qCt<?> LJIIIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1532310pyf> c1541080qCo, AbstractC1541130qCt<?> abstractC1541130qCt) {
        C1532300pye c1532300pye;
        C1532710pzJ c1532710pzJ = (C1532710pzJ) interfaceC1541060qCm;
        String str = c1532710pzJ.LJIIL;
        if (str == null) {
            C1540860qCS c1540860qCSLJIIJ = c1541080qCo.LJIIJ();
            if (c1540860qCSLJIIJ != null) {
                str = c1540860qCSLJIIJ.LIZJ;
            } else {
                str = null;
            }
        }
        c1532710pzJ.LJIIL = str;
        C1532300pye c1532300pye2 = new C1532300pye(c1532710pzJ.LJJ, c1532710pzJ, c1532710pzJ.LIZLLL, false, c1541080qCo);
        if ((abstractC1541130qCt instanceof C1532300pye) && (c1532300pye = (C1532300pye) abstractC1541130qCt) != null) {
            c1532300pye2.LJIIIZ = c1532300pye.LJIIIZ;
            c1532300pye2.LJIIIIZZ = c1532300pye.LJIIIIZZ;
        }
        return c1532300pye2;
    }
}
