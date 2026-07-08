package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.BuiltinFetcher;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.chain.fetchers.MemoryFetcher;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS61S2100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533950q1J {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(C1533790q13 c1533790q13) {
        boolean z;
        ConcurrentHashMap<String, C1533970q1L> concurrentHashMap;
        C1533970q1L c1533970q1L;
        String str;
        C1534010q1P c1534010q1PLIZLLL;
        String str2;
        EnumC1533980q1M enumC1533980q1M = c1533790q13.LIZ.LJJJ;
        if (enumC1533980q1M != EnumC1533980q1M.LYNX_TEMPLATE && enumC1533980q1M != EnumC1533980q1M.LYNX_SSR_TEMPLATE && enumC1533980q1M != EnumC1533980q1M.WEB_MAIN_DOCUMENT) {
            z = false;
        } else {
            z = true;
        }
        try {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
            if (function22 != null) {
                if (!z) {
                    str2 = "bd_hybrid_monitor_res_loader_perf_template";
                } else {
                    str2 = "bd_hybrid_monitor_res_loader_perf";
                }
                JSONObject jSONObject = new JSONObject(C1533480q0Y.LIZIZ(c1533790q13));
                jSONObject.put("is_broken", true);
                function22.invoke(str2, new C1535250q3P("LoaderUtils", "dealCorruptedResponse", null, null, null, false, jSONObject, 60));
            }
            C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
            if (c1534000q1OLJ != null && (c1534010q1PLIZLLL = c1534000q1OLJ.LIZLLL()) != null) {
                c1534010q1PLIZLLL.LJJ();
            }
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if (resourceFetcher != null) {
                resourceFetcher.onResponseCorrupted(c1533790q13);
            }
            String str3 = c1533790q13.LIZ.LJJJZ;
            if (str3 != null && (c1533970q1L = (concurrentHashMap = C1533900q1E.LJIJ).get(str3)) != null && (str = c1533970q1L.LIZIZ) != null) {
                concurrentHashMap.remove(str, c1533970q1L);
            }
            C1533940q1I.LJ(c1533790q13);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LJ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static InterfaceC1534970q2x LJFF(File file) {
        C098200Yq c098200Yq;
        Object obj = null;
        if (file == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (file.isFile()) {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            return new InterfaceC1534970q2x() { // from class: X.0q2i
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    randomAccessFile.close();
                }

                @Override // X.InterfaceC1534970q2x
                public final void LJ(int i) throws IOException {
                    randomAccessFile.seek(i);
                }

                @Override // X.InterfaceC1534970q2x
                public final int read(byte[] bArr, int i, int i2) {
                    return randomAccessFile.read(bArr, i, i2);
                }
            };
        }
        C189200o6.m2constructorimpl(null);
        c098200Yq = null;
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InterfaceC1534970q2x) obj;
    }

    public static InterfaceC1534970q2x LJI(AbstractC1533800q14 abstractC1533800q14) {
        Object c098200Yq;
        if (!abstractC1533800q14.LJI()) {
            return null;
        }
        InterfaceC1534970q2x interfaceC1534970q2xLJFF = LJFF(abstractC1533800q14.LJIILL());
        if (interfaceC1534970q2xLJFF != null) {
            return interfaceC1534970q2xLJFF;
        }
        try {
            c098200Yq = abstractC1533800q14.LJIILLIIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        final InputStream inputStream = (InputStream) c098200Yq;
        if (inputStream == null) {
            return null;
        }
        return new InterfaceC1534970q2x() { // from class: X.0q2c
            public int LL;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                inputStream.close();
            }

            @Override // X.InterfaceC1534970q2x
            public final void LJ(int i) throws IOException {
                int i2 = i - this.LL;
                if (i2 >= 0) {
                    inputStream.skip(i2);
                    return;
                }
                throw new IOException("seek failed since position less than pointer");
            }

            @Override // X.InterfaceC1534970q2x
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = inputStream.read(bArr, i, i2);
                if (i3 != -1) {
                    this.LL += i3;
                }
                return i3;
            }
        };
    }

    public static boolean LIZ(C1533790q13 c1533790q13, C1533790q13 c1533790q132) {
        ResourceFetcher resourceFetcherLIZIZ;
        C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
        if (c1534000q1OLJ == null || !c1533790q13.LIZIZ || !c1534000q1OLJ.LIZIZ()) {
            return false;
        }
        C1533510q0b c1533510q0b = c1533790q13.LIZ.LJJJJLI;
        if (!c1533510q0b.LIZ() && !c1533790q132.LIZ.LJIIJJI && a0.LJJIIZI(c1533790q13.LJII(c1533790q13.LJ), "gecko", false)) {
            GeckoXAdapter geckoXAdapter = c1533790q132.LIZ.LJJJJJ.getGeckoXAdapter();
            String str = c1533510q0b.LIZIZ;
            String str2 = c1533510q0b.LIZ;
            C086F c086f = C086F.LIZ;
            AwS61S2100000_23 awS61S2100000_23 = new AwS61S2100000_23(geckoXAdapter, str2, str, 1);
            c086f.getClass();
            C086F.LJI(awS61S2100000_23);
        }
        c1533790q132.LJIILL(c1534000q1OLJ);
        c1533790q132.LJIIZILJ = c1533790q13.LJIIZILJ;
        c1533790q132.LJIILLIIL = c1533790q13.LJIILLIIL;
        c1533790q132.LJJIJ = c1533790q13.LJJIJ;
        c1533790q132.LJIIIZ = c1533790q13.LJIIIZ;
        c1533790q132.LJIILJJIL = c1533790q13.LJIILJJIL;
        c1533790q132.LJJIIZI = c1533790q13.LJJIIZI;
        c1533790q132.LJJI = c1533790q13.LIZIZ();
        c1533790q132.LJJ = c1533790q13.LJJ;
        c1533790q132.LJJIJIIJIL = c1533790q13.LIZ.LJJJIL;
        try {
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if (resourceFetcher != null) {
                resourceFetcherLIZIZ = LIZIZ(c1533790q132.LIZ.LJJJJJ, resourceFetcher.getFetcherName(), c1533790q132);
            } else {
                resourceFetcherLIZIZ = null;
            }
            c1533790q132.LJIJJ = resourceFetcherLIZIZ;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c1534000q1OLJ.LIZ.LJII() != null) {
            c1533790q132.LJ = "memory";
            c1533790q132.LJFF = c1533790q13.LJ;
        } else {
            c1533790q132.LJ = c1533790q13.LJ;
        }
        c1533790q132.LIZIZ = true;
        c1533790q132.LJI = true;
        return true;
    }

    public static boolean LIZLLL(final C1533790q13 c1533790q13, boolean z) {
        C1534010q1P c1534010q1PLIZLLL;
        InputStream inputStreamLJIILLIIL;
        C1534000q1O c1534000q1OLJ;
        ResourceFetcher resourceFetcher;
        C1534010q1P c1534010q1PLIZLLL2;
        c1533790q13.LIZJ.LIZLLL("load");
        C1534000q1O c1534000q1OLJ2 = c1533790q13.LJ();
        if (c1534000q1OLJ2 == null) {
            ResourceFetcher resourceFetcher2 = c1533790q13.LJIJJ;
            if (resourceFetcher2 != null) {
                resourceFetcher2.postDeal(c1533790q13);
            }
            c1533790q13.LIZJ.LIZJ("load");
            return false;
        }
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        if (c1533490q0Z.LJJIJIIJI) {
            C086F.LIZ.getClass();
            if (C086F.LIZ()) {
                C1534250q1n.LIZIZ("ForestFacade", "IO operation in UI thread", null);
                if (!c1534000q1OLJ2.LIZ.LJFF()) {
                    ResourceFetcher resourceFetcher3 = c1533790q13.LJIJJ;
                    if (resourceFetcher3 != null) {
                        resourceFetcher3.postDeal(c1533790q13);
                    }
                    c1533790q13.LIZJ.LIZJ("load");
                    return false;
                }
            }
            c1533790q13.LJIIIIZZ();
            C1534000q1O c1534000q1OLJ3 = c1533790q13.LJ();
            if (c1534000q1OLJ3 == null || c1534000q1OLJ3.LIZ.LJII() == null) {
                C1534000q1O c1534000q1OLJ4 = c1533790q13.LJ();
                if (c1534000q1OLJ4 != null && (c1534010q1PLIZLLL2 = c1534000q1OLJ4.LIZLLL()) != null) {
                    c1534010q1PLIZLLL2.LLJILJIL.set(0);
                    c1534010q1PLIZLLL2.LJIIZILJ(false);
                }
                ResourceFetcher resourceFetcher4 = c1533790q13.LJIJJ;
                if (resourceFetcher4 != null) {
                    resourceFetcher4.postDeal(c1533790q13);
                }
                c1533790q13.LIZJ.LIZJ("load");
                return false;
            }
        } else if (c1533490q0Z.LJJIL) {
            c1534000q1OLJ2.LIZ(c1533790q13);
            WeakReference weakReference = new WeakReference(c1533790q13);
            C086F c086f = C086F.LIZ;
            AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(weakReference, (WeakReference<C1541080qCo<InterfaceC1541240qD4>>) 195);
            c086f.getClass();
            C086F.LJI(awS567S0100000_23);
        }
        if (c1534000q1OLJ2.LIZJ() == null) {
            if (c1533790q13.LIZ.LJJIJIL.booleanValue()) {
                c1534000q1OLJ2.LIZ(c1533790q13);
                ResourceFetcher resourceFetcher5 = c1533790q13.LJIJJ;
                if (resourceFetcher5 != null && !resourceFetcher5.isFileCommitted$forest_release()) {
                    C086F.LIZ.getClass();
                    if (C086F.LIZ() && !c1534000q1OLJ2.LIZ.LJFF()) {
                        ResourceFetcher resourceFetcher6 = c1533790q13.LJIJJ;
                        if (resourceFetcher6 != null) {
                            resourceFetcher6.postDeal(c1533790q13);
                        }
                        c1533790q13.LIZJ.LIZJ("load");
                        return false;
                    }
                    synchronized (c1534000q1OLJ2) {
                        try {
                            if (c1534000q1OLJ2.LIZJ() == null && ((resourceFetcher = c1533790q13.LJIJJ) == null || !resourceFetcher.isFileCommitted$forest_release())) {
                                ResourceFetcher resourceFetcher7 = c1533790q13.LJIJJ;
                                if (resourceFetcher7 != null) {
                                    resourceFetcher7.writeFile(c1533790q13);
                                }
                                ResourceFetcher resourceFetcher8 = c1533790q13.LJIJJ;
                                if (resourceFetcher8 != null) {
                                    resourceFetcher8.setFileCommitted$forest_release(true);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            } else if (c1533790q13.LJJIIZ) {
                c1534000q1OLJ2.LIZ(c1533790q13);
            }
        }
        if (c1533790q13.LIZ.LJJIJIL.booleanValue() && ((c1534000q1OLJ = c1533790q13.LJ()) == null || c1534000q1OLJ.LIZJ() == null)) {
            ResourceFetcher resourceFetcher9 = c1533790q13.LJIJJ;
            if (resourceFetcher9 != null) {
                resourceFetcher9.postDeal(c1533790q13);
            }
            c1533790q13.LIZJ.LIZJ("load");
            return false;
        }
        if (c1533790q13.LIZ.LJIIZILJ.booleanValue() && !Intrinsics.LJFF(c1533790q13.LJ, "memory") && !Intrinsics.LJFF(c1533790q13.LJ, "builtin") && c1533790q13.LIZ.LJJJ != EnumC1533980q1M.LYNX_IMAGE && !(c1533790q13.LJIJJ instanceof MemoryFetcher)) {
            if (c1533790q13.LJJ) {
                C1533940q1I.LJI(new C1534840q2k(c1533790q13) { // from class: X.0q2q
                    {
                        super(c1533790q13, new C1534790q2f(C1533790q13.class, c1533790q13, true));
                    }
                });
            } else {
                c1534000q1OLJ2.LIZ(c1533790q13);
                if ((c1534000q1OLJ2.LIZ.LJII() != null || !z) && (c1534010q1PLIZLLL = c1534000q1OLJ2.LIZLLL()) != null) {
                    if (c1534010q1PLIZLLL.LJJJJ() && (inputStreamLJIILLIIL = c1534010q1PLIZLLL.LJIILLIIL()) != null) {
                        C1533940q1I.LJI(new C1534840q2k(c1533790q13, new C1533990q1N(c1534010q1PLIZLLL, inputStreamLJIILLIIL)));
                    }
                    c1533790q13.LJIILJJIL(c1534010q1PLIZLLL);
                }
            }
        }
        ResourceFetcher resourceFetcher10 = c1533790q13.LJIJJ;
        if (resourceFetcher10 != null) {
            boolean zPostDeal = resourceFetcher10.postDeal(c1533790q13);
            c1533790q13.LIZJ.LIZJ("load");
            return zPostDeal;
        }
        c1533790q13.LIZJ.LIZJ("load");
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ResourceFetcher LIZIZ(Forest forest, String str, C1533790q13 c1533790q13) {
        ResourceFetcher builtinFetcher;
        Constructor<? extends ResourceFetcher> constructor;
        switch (str.hashCode()) {
            case -1077756671:
                if (str.equals("memory")) {
                    builtinFetcher = new MemoryFetcher(forest);
                }
                builtinFetcher.init(str, c1533790q13);
                return builtinFetcher;
            case 98349:
                if (str.equals("cdn")) {
                    builtinFetcher = new CDNFetcher(forest);
                }
                builtinFetcher.init(str, c1533790q13);
                return builtinFetcher;
            case 98230121:
                if (str.equals("gecko")) {
                    builtinFetcher = new GeckoFetcher(forest);
                }
                builtinFetcher.init(str, c1533790q13);
                return builtinFetcher;
            case 230960163:
                if (str.equals("builtin")) {
                    builtinFetcher = new BuiltinFetcher(forest);
                }
                builtinFetcher.init(str, c1533790q13);
                return builtinFetcher;
        }
        Class<? extends ResourceFetcher> cls = forest.getFetcherMap$forest_release().get(str);
        if (cls == null || (constructor = cls.getConstructor(Forest.class)) == null || (builtinFetcher = constructor.newInstance(forest)) == null) {
            return null;
        }
        builtinFetcher.init(str, c1533790q13);
        return builtinFetcher;
    }
}
