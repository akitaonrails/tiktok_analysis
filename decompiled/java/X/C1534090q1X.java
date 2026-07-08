package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS107S1000000_23;
import kotlin.jvm.internal.AwS172S1100000_23;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534090q1X extends AbstractC1534540q2G {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C1534070q1V LIZLLL;
    public final AbstractC1522680pj8 LJ;
    public final boolean LJFF;
    public final File LJI;
    public final Map<String, String> LJII;
    public final C1534110q1Z LJIIIIZZ;

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.AbstractC1534540q2G
    public final void LJI() {
    }

    @Override // X.InterfaceC1535220q3M
    public final String getName() {
        return "HTTPResponseProvider";
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return EnumC1528510psX.REGISTER_CALLBACK;
    }

    @Override // X.AbstractC1534540q2G
    public final boolean LJIIIZ(C1533790q13 c1533790q13) {
        C086F.LIZ.getClass();
        if ((!C086F.LIZ() || c1533790q13.LIZ.LJJJJJL) && !c1533790q13.LIZ.LJJIJL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1534540q2G
    public final void LJII(C1533790q13 c1533790q13, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
        Object c098200Yq;
        AbstractC1534540q2G abstractC1534540q2GFetchOnline$forest_release;
        CDNFetcher cDNFetcher;
        int i;
        String str;
        AbstractC1534540q2G abstractC1534540q2GFetchOnline$forest_release2;
        CDNFetcher cDNFetcher2;
        Map<String, String> map;
        try {
            c098200Yq = C1534080q1W.LJII(this.LIZLLL, this.LJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch http response failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1534250q1n.LJFF("HTTPResponseProvider", "provideData", strLIZIZ, null, true);
            LJ().LIZJ("load");
            LJIIIIZZ(strLIZIZ);
            C1534430q25 c1534430q25 = CDNFetcher.Companion;
            AbstractC1522680pj8 abstractC1522680pj8 = this.LJ;
            c1534430q25.getClass();
            C1534430q25.LIZIZ(abstractC1522680pj8);
            function1.invoke(null);
            return;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        final AbstractC1522730pjD abstractC1522730pjD = (AbstractC1522730pjD) c098200Yq;
        if (abstractC1522730pjD == null) {
            C1533880q1C.LIZJ("HTTPResponseProvider", "provideData", "cannot get HttpResponse without any error", null, null);
            LJ().LIZJ("load");
            LJIIIIZZ("cannot get HttpResponse without any error");
            C1534430q25 c1534430q252 = CDNFetcher.Companion;
            AbstractC1522680pj8 abstractC1522680pj82 = this.LJ;
            c1534430q252.getClass();
            C1534430q25.LIZIZ(abstractC1522680pj82);
            function1.invoke(null);
            return;
        }
        String str2 = abstractC1522730pjD.LIZLLL;
        if (str2 != null) {
            LJIIIIZZ(str2);
        }
        AbstractC1522680pj8 abstractC1522680pj83 = this.LJ;
        abstractC1522730pjD.LIZJ = abstractC1522680pj83;
        String str3 = abstractC1522680pj83.LIZ;
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        c1534250q1n.LJIIJ(new AwS424S0200000_23(this, abstractC1522730pjD, 9));
        c1533790q13.LIZLLL.LIZJ = abstractC1522730pjD.LIZ;
        if (this.LJFF && this.LJI != null && this.LJIIIIZZ != null && (map = this.LJII) != null && abstractC1522730pjD.LJFF(map)) {
            C1534000q1O c1534000q1OLJFF = this.LJIIIIZZ.LJFF();
            if (c1534000q1OLJFF == null) {
                this.LJIIIIZZ.LIZJ(true);
                C1534250q1n.LIZIZ("HTTPResponseProvider", "cache is corrupted " + str3, null);
                return;
            }
            c1534250q1n.LJIIJ(new AwS172S1100000_23(str3, abstractC1522730pjD, 7));
            abstractC1522730pjD.close();
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(this.LJI.setLastModified(System.currentTimeMillis())));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            C1529710puT c1529710puT = C1529710puT.LIZ;
            Map<String, String> map2 = this.LJII;
            c1529710puT.getClass();
            Map<String, String> mapLJFF = C1529710puT.LJFF(map2);
            ((HashMap) mapLJFF).putAll(abstractC1522730pjD.LIZIZ);
            try {
                C1534110q1Z c1534110q1Z = this.LJIIIIZZ;
                AbstractC1522680pj8 abstractC1522680pj84 = abstractC1522730pjD.LIZJ;
                String str4 = abstractC1522680pj84.LIZ;
                Map<String, String> mapLJ = abstractC1522680pj84.LJ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                c1534110q1Z.LJI(str4, mapLJ, mapLJFF, c1534000q1OLJFF);
                c1533790q13.LJIILIIL = Long.valueOf(this.LJIIIIZZ.LJ);
                c1533790q13.LJI = true;
                c1533790q13.LJIJ = EnumC1534700q2W.NEGOTIATED;
                C1534080q1W.LJIIIZ(mapLJFF, c1533790q13, false, Long.valueOf(this.LJIIIIZZ.LJ));
                C1534590q2L c1534590q2L = LIZLLL().LIZ;
                c1534590q2L.LIZIZ = Long.valueOf(c1533790q13.LJIIIZ);
                c1534590q2L.LIZLLL = c1533790q13.LIZIZ();
                c1534590q2L.LJ = c1533790q13.LJJIIZI;
                c1534590q2L.LJI = c1533790q13.LJIILIIL;
                c1534590q2L.LJII = mapLJFF;
                c1534590q2L.LJIIIIZZ = abstractC1522730pjD;
                c1533790q13.LJIILJJIL = abstractC1522730pjD;
                LIZLLL().LJIIJJI(new C1534410q23());
                LIZLLL().LJIIJJI(new C1534400q22());
                C1534350q1x c1534350q1x = new C1534350q1x(this.LJIIIIZZ);
                C1534430q25 c1534430q253 = CDNFetcher.Companion;
                AbstractC1522680pj8 abstractC1522680pj85 = this.LJ;
                c1534430q253.getClass();
                C1534430q25.LIZIZ(abstractC1522680pj85);
                function1.invoke(c1534350q1x);
                return;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update failed, url = ");
                sbLIZ2.append(str3);
                C1533880q1C.LIZJ("HTTPResponseProvider", "provideData", C2188811AlT.LIZIZ(sbLIZ2), th3, null);
                this.LJIIIIZZ.LIZJ(true);
                function1.invoke(null);
                return;
            }
        }
        C1529710puT c1529710puT2 = C1529710puT.LIZ;
        int i2 = abstractC1522730pjD.LIZ;
        c1529710puT2.getClass();
        if (200 <= i2 && i2 < 301) {
            c1534250q1n.LJIIJ(new AwS107S1000000_23(str3, 4));
            C1534080q1W.LJIIIZ(abstractC1522730pjD.LIZIZ, c1533790q13, false, null);
            C1534590q2L c1534590q2L2 = LIZLLL().LIZ;
            c1534590q2L2.LIZIZ = Long.valueOf(c1533790q13.LJIIIZ);
            c1534590q2L2.LIZLLL = c1533790q13.LIZIZ();
            c1534590q2L2.LJ = c1533790q13.LJJIIZI;
            c1534590q2L2.LJI = c1533790q13.LJIILIIL;
            c1534590q2L2.LJII = c1533790q13.LJIILLIIL;
            c1534590q2L2.LJIIIIZZ = abstractC1522730pjD;
            c1533790q13.LJIILJJIL = abstractC1522730pjD;
            LIZLLL().LJIIJJI(new C1534100q1Y(this));
            LIZLLL().LJIIJJI(new AbstractC1535150q3F<InputStream, File>(abstractC1522730pjD) { // from class: X.0q1c
                public final AbstractC1522730pjD LIZLLL;

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC1535220q3M
                public final String getName() {
                    return "HTTPStream2File";
                }

                @Override // X.InterfaceC1535220q3M
                public final EnumC1528510psX LIZJ() {
                    return EnumC1528510psX.REGISTER_CALLBACK;
                }

                {
                    super(InputStream.class, File.class);
                    this.LIZLLL = abstractC1522730pjD;
                }

                @Override // X.AbstractC1535150q3F
                public final void LJFF(AbstractC1534220q1k<InputStream> abstractC1534220q1k, C1533790q13 c1533790q132, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<File>, Unit> function12) {
                    C1534050q1T c1534050q1T;
                    C1534000q1O c1534000q1O;
                    C1534010q1P c1534010q1PLIZLLL;
                    C1534040q1S c1534040q1S;
                    InputStream inputStream = abstractC1534220q1k.LIZLLL;
                    C1528490psV c1528490psV = null;
                    if ((!(inputStream instanceof C1534040q1S) || (c1534040q1S = (C1534040q1S) inputStream) == null || (c1534010q1PLIZLLL = c1534040q1S.LL) == null) && (!(inputStream instanceof C1534050q1T) || (c1534050q1T = (C1534050q1T) inputStream) == null || (c1534000q1O = c1534050q1T.LLILZLL) == null || (c1534010q1PLIZLLL = c1534000q1O.LIZLLL()) == null)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("stream is not as expected of ForestInputStream, url: ");
                        sbLIZ3.append(c1533790q132.LIZ.LJJJJIZL);
                        C1533880q1C.LIZ("HTTPStream2File", "process", C2188811AlT.LIZIZ(sbLIZ3), null, null);
                        try {
                            abstractC1534220q1k.LIZJ();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            C189200o6.m2constructorimpl(new C098200Yq(th4));
                        }
                        function12.invoke(null);
                        return;
                    }
                    c1533790q132.LJIILJJIL(c1534010q1PLIZLLL);
                    LIZLLL().LIZ.LJIIIZ = c1533790q132.LJ();
                    File fileLJIILL = c1534010q1PLIZLLL.LJIILL();
                    if (fileLJIILL != null) {
                        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(this, 112));
                        c1533790q132.LJIIJJI = fileLJIILL.getAbsolutePath();
                        try {
                            abstractC1534220q1k.LIZJ();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                            C189200o6.m2constructorimpl(new C098200Yq(th5));
                        }
                        function12.invoke(new C1528490psV(fileLJIILL));
                        return;
                    }
                    synchronized (c1534010q1PLIZLLL) {
                        try {
                            File fileLJIILL2 = c1534010q1PLIZLLL.LJIILL();
                            if (fileLJIILL2 != null) {
                                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(this, 113));
                                c1533790q132.LJIIJJI = fileLJIILL2.getAbsolutePath();
                                try {
                                    abstractC1534220q1k.LIZJ();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                    C189200o6.m2constructorimpl(new C098200Yq(th6));
                                }
                                function12.invoke(new C1528490psV(fileLJIILL2));
                                return;
                            }
                            try {
                                c1534010q1PLIZLLL.LJIJJLI(c1533790q132);
                                C1534110q1Z c1534110q1ZLIZIZ = C1534020q1Q.LIZIZ(this.LIZLLL, new C1534000q1O(c1534010q1PLIZLLL));
                                c1534110q1ZLIZIZ.LIZIZ((C1534320q1u) this.LIZLLL.LIZJ.LJI.getValue());
                                final long j = c1534110q1ZLIZIZ.LJ;
                                try {
                                    abstractC1534220q1k.LIZJ();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th7) {
                                    TryCatchGuardChecker.doCheck(th7);
                                    C189200o6.m2constructorimpl(new C098200Yq(th7));
                                }
                                File fileLJIILL3 = c1534010q1PLIZLLL.LJIILL();
                                if (fileLJIILL3 != null) {
                                    c1533790q132.LJIIJJI = fileLJIILL3.getAbsolutePath();
                                    LIZLLL().LIZ.LJFF = c1533790q132.LIZLLL();
                                    c1528490psV = new C1528490psV(fileLJIILL3);
                                    c1528490psV.LIZIZ = new InterfaceC1535380q3c() { // from class: X.0q2m
                                        @Override // X.InterfaceC1535380q3c
                                        public final boolean isValid() {
                                            return System.currentTimeMillis() < j;
                                        }
                                    };
                                }
                                function12.invoke(c1528490psV);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th8) {
                                TryCatchGuardChecker.doCheck(th8);
                                C189200o6.m2constructorimpl(new C098200Yq(th8));
                            }
                            return;
                        } catch (Throwable th9) {
                            TryCatchGuardChecker.doCheck(th9);
                            throw th9;
                        }
                        TryCatchGuardChecker.doCheck(th9);
                        throw th9;
                    }
                }
            });
            LIZLLL().LJIIJJI(new C1534060q1U(false));
            Map<String, String> map3 = abstractC1522730pjD.LIZIZ;
            c1529710puT2.getClass();
            c1533790q13.LJIILIIL = Long.valueOf(C1529710puT.LIZ(map3));
            function1.invoke(new AbstractC1534220q1k<AbstractC1522730pjD>(abstractC1522730pjD) { // from class: X.0psU
                @Override // X.AbstractC1534220q1k
                public final AbstractC1534220q1k<AbstractC1522730pjD> LIZ(C1533790q13 c1533790q132) {
                    return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1534220q1k
                public final void LIZJ() {
                    try {
                        ((AbstractC1522730pjD) this.LIZLLL).close();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final String toString() {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("HTTPResponse, url: ");
                    sbLIZ3.append(((AbstractC1522730pjD) this.LIZLLL).LIZJ.LIZ);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
            });
            return;
        }
        abstractC1522730pjD.close();
        String str5 = "fetch failed, url: " + this.LJ.LIZ + ", code is " + abstractC1522730pjD.LIZ;
        if (this.LIZLLL.LJIIL && 300 <= (i = abstractC1522730pjD.LIZ) && i < 400 && (str = abstractC1522730pjD.LIZIZ.get("location")) != null) {
            c1534250q1n.LJIIJ(new AwS107S1000000_23(str, 5));
            C1533640q0o c1533640q0o = this.LIZLLL.LJII;
            c1533640q0o.getClass();
            c1533640q0o.LIZJ(UriProtector.parse(str), str);
            c1533640q0o.LJIIJ = false;
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if ((resourceFetcher instanceof CDNFetcher) && (cDNFetcher2 = (CDNFetcher) resourceFetcher) != null) {
                abstractC1534540q2GFetchOnline$forest_release2 = cDNFetcher2.fetchOnline$forest_release(c1533790q13.LIZ, c1533790q13);
            } else {
                abstractC1534540q2GFetchOnline$forest_release2 = null;
            }
            if (c1533790q13.LIZIZ) {
                C1534430q25 c1534430q254 = CDNFetcher.Companion;
                AbstractC1522680pj8 abstractC1522680pj86 = this.LJ;
                c1534430q254.getClass();
                C1534430q25.LIZIZ(abstractC1522680pj86);
                return;
            }
            if (abstractC1534540q2GFetchOnline$forest_release2 != null) {
                LJFF(abstractC1534540q2GFetchOnline$forest_release2);
                abstractC1534540q2GFetchOnline$forest_release2.LJII(c1533790q13, function1);
                C1534430q25 c1534430q255 = CDNFetcher.Companion;
                AbstractC1522680pj8 abstractC1522680pj87 = this.LJ;
                c1534430q255.getClass();
                C1534430q25.LIZIZ(abstractC1522680pj87);
                return;
            }
        }
        C1534110q1Z c1534110q1Z2 = this.LJIIIIZZ;
        if (c1534110q1Z2 != null) {
            c1534110q1Z2.LIZJ(true);
        }
        C1534430q25 c1534430q256 = CDNFetcher.Companion;
        AbstractC1522680pj8 abstractC1522680pj88 = this.LJ;
        c1534430q256.getClass();
        C1534430q25.LIZIZ(abstractC1522680pj88);
        if (this.LIZLLL.LJII.LJ(new C1533670q0r(7, abstractC1522730pjD.LIZ, str5))) {
            c1533790q13.LIZLLL.LIZ("cdn", str5);
            ResourceFetcher resourceFetcher2 = c1533790q13.LJIJJ;
            if ((resourceFetcher2 instanceof CDNFetcher) && (cDNFetcher = (CDNFetcher) resourceFetcher2) != null) {
                abstractC1534540q2GFetchOnline$forest_release = cDNFetcher.fetchOnline$forest_release(c1533790q13.LIZ, c1533790q13);
            } else {
                abstractC1534540q2GFetchOnline$forest_release = null;
            }
            if (c1533790q13.LIZIZ) {
                C1534430q25.LIZIZ(this.LJ);
                return;
            } else if (abstractC1534540q2GFetchOnline$forest_release != null) {
                LJFF(abstractC1534540q2GFetchOnline$forest_release);
                abstractC1534540q2GFetchOnline$forest_release.LJII(c1533790q13, function1);
                C1534430q25.LIZIZ(this.LJ);
                return;
            }
        }
        c1533790q13.LIZLLL.LIZIZ(7, "cdn", str5);
        function1.invoke(null);
    }

    public C1534090q1X(C1534070q1V c1534070q1V, AbstractC1522680pj8 abstractC1522680pj8, boolean z, File file, Map<String, String> map, C1534110q1Z c1534110q1Z) {
        this.LIZLLL = c1534070q1V;
        this.LJ = abstractC1522680pj8;
        this.LJFF = z;
        this.LJI = file;
        this.LJII = map;
        this.LJIIIIZZ = c1534110q1Z;
    }
}
