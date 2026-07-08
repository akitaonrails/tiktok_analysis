package X;

import android.webkit.WebResourceResponse;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533790q13 {
    public C1533490q0Z LIZ;
    public boolean LIZIZ;
    public final C1492150ovt LIZJ;
    public final C1533810q15 LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public Long LJIILIIL;
    public AbstractC1522730pjD LJIILJJIL;
    public Pair<Integer, String> LJIILL;
    public Map<String, String> LJIILLIIL;
    public C1534070q1V LJIIZILJ;
    public EnumC1534700q2W LJIJ;
    public boolean LJIJI;
    public ResourceFetcher LJIJJ;
    public C1533970q1L LJIJJLI;
    public final AtomicBoolean LJIL;
    public boolean LJJ;
    public String LJJI;
    public volatile C1534000q1O LJJIFFI;
    public final StringBuilder LJJII;
    public WeakReference<C1534000q1O> LJJIII;
    public WeakReference<AbstractC1533800q14> LJJIIJ;
    public C1534360q1y<?> LJJIIJZLJL;
    public boolean LJJIIZ;
    public String LJJIIZI;
    public volatile transient SoftReference<C1323050kX9<AbstractC1325130kaV>> LJJIJ;
    public boolean LJJIJIIJI;
    public String LJJIJIIJIL;
    public EnumC1534440q26 LJJIJIL;
    public boolean LJJIJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533790q13.LJIIIZ():byte[]");
    }

    public final String toString() {
        return "Response(request=" + this.LIZ + ", isSucceed=" + this.LIZIZ + ", timer=" + this.LIZJ + ", errorInfo=" + this.LIZLLL + ", from=" + this.LJ + ", originFrom=" + this.LJFF + ", isCache=" + this.LJI + ", geckoCompress=" + this.LJII + ", geckoCompressTimeout=" + this.LJIIIIZZ + ", version=" + this.LJIIIZ + ", successFetcher=" + this.LJIIJ + ')';
    }

    public final AbstractC1534220q1k<?> LIZ() {
        AbstractC1533800q14 abstractC1533800q14;
        AbstractC1534220q1k<?> abstractC1534220q1kLIZ;
        C1534360q1y<?> c1534360q1y = this.LJJIIJZLJL;
        if (c1534360q1y != null && (abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y, this, false, 6)) != null) {
            return abstractC1534220q1kLIZ;
        }
        C1534000q1O c1534000q1OLJ = LJ();
        if (c1534000q1OLJ == null || (abstractC1533800q14 = c1534000q1OLJ.LIZ) == null) {
            return null;
        }
        return abstractC1533800q14.LIZ();
    }

    public final String LIZIZ() {
        String strLJ;
        String str = this.LJJI;
        if (str == null || str.length() == 0) {
            String strLIZJ = LIZJ();
            if (ForestExperiment.INSTANCE.getOptimizeDataType()) {
                C1529710puT.LIZ.getClass();
                strLJ = C1529710puT.LJ(strLIZJ);
                if (strLJ == null) {
                    strLJ = "";
                }
            } else {
                C1529710puT.LIZ.getClass();
                strLJ = C1529710puT.LJ(strLIZJ);
                if (strLJ == null) {
                    strLJ = "unknown";
                }
            }
            this.LJJI = strLJ;
        }
        return this.LJJI;
    }

    public final String LIZJ() {
        String strLIZLLL;
        if (!Intrinsics.LJFF(this.LJ, "cdn") && (strLIZLLL = LIZLLL()) != null) {
            C1529710puT.LIZ.getClass();
            return C1529710puT.LIZIZ(strLIZLLL, true);
        }
        C1529710puT c1529710puT = C1529710puT.LIZ;
        String str = this.LIZ.LJJJJIZL;
        c1529710puT.getClass();
        return C1529710puT.LIZIZ(str, false);
    }

    public final String LIZLLL() {
        C1534000q1O c1534000q1OLJ;
        String fetcherName;
        File fileLIZJ;
        if (this.LIZIZ) {
            String absolutePath = this.LJIIJJI;
            if (absolutePath != null || ((c1534000q1OLJ = LJ()) != null && (fileLIZJ = c1534000q1OLJ.LIZJ()) != null && (absolutePath = fileLIZJ.getAbsolutePath()) != null)) {
                return absolutePath;
            }
            if (this.LIZ.LJJIJIL.booleanValue()) {
                Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                EnumC1533980q1M enumC1533980q1M = this.LIZ.LJJJ;
                ResourceFetcher resourceFetcher = this.LJIJJ;
                if (resourceFetcher == null || (fetcherName = resourceFetcher.getFetcherName()) == null) {
                    fetcherName = this.LJ;
                }
                Boolean boolValueOf = Boolean.valueOf(this.LIZ.LJJJJZ instanceof C1534080q1W);
                String str = this.LIZ.LJJJJIZL;
                C1534000q1O c1534000q1OLJ2 = LJ();
                C1533480q0Y.LIZJ("response", enumC1533980q1M, fetcherName, boolValueOf, "need local file but no valid file", str, null, null, null, c1534000q1OLJ2 != null ? c1534000q1OLJ2.LIZ : null, null, 6848);
            }
        }
        return null;
    }

    public final C1534000q1O LJ() {
        WeakReference<C1534000q1O> weakReference;
        AbstractC1533800q14 abstractC1533800q14;
        C1534000q1O c1534000q1O = this.LJJIFFI;
        if (c1534000q1O != null || ((weakReference = this.LJJIII) != null && (c1534000q1O = weakReference.get()) != null)) {
            return c1534000q1O;
        }
        WeakReference<AbstractC1533800q14> weakReference2 = this.LJJIIJ;
        if (weakReference2 == null || (abstractC1533800q14 = weakReference2.get()) == null) {
            return null;
        }
        return new C1534000q1O(abstractC1533800q14);
    }

    public final C1323050kX9<AbstractC1325130kaV> LJFF() {
        SoftReference<C1323050kX9<AbstractC1325130kaV>> softReference = this.LJJIJ;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public final Integer LJI() {
        Integer numLIZIZ;
        if (!this.LIZIZ) {
            return null;
        }
        C1534360q1y<?> c1534360q1y = this.LJJIIJZLJL;
        if (c1534360q1y != null && (numLIZIZ = c1534360q1y.LIZ.LIZIZ()) != null) {
            return numLIZIZ;
        }
        C1534000q1O c1534000q1OLJ = LJ();
        if (c1534000q1OLJ != null) {
            Integer numLIZIZ2 = c1534000q1OLJ.LIZ.LIZIZ();
            if (numLIZIZ2 != null) {
                return numLIZIZ2;
            }
            byte[] bArrLJII = c1534000q1OLJ.LIZ.LJII();
            if (bArrLJII != null) {
                return Integer.valueOf(bArrLJII.length);
            }
        }
        return null;
    }

    public final void LJIIIIZZ() {
        C1534010q1P c1534010q1PLIZLLL;
        if (this.LIZIZ) {
            C1534000q1O c1534000q1OLJ = LJ();
            if (c1534000q1OLJ != null) {
                c1534000q1OLJ.LIZ(this);
            }
            C1534000q1O c1534000q1OLJ2 = LJ();
            if (c1534000q1OLJ2 == null || (c1534010q1PLIZLLL = c1534000q1OLJ2.LIZLLL()) == null) {
                return;
            }
            c1534010q1PLIZLLL.LJJJLL(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1533790q13(C1533490q0Z c1533490q0Z) {
        Function1<? super C1533490q0Z, ? extends AbstractC1491750ovF> function1;
        AbstractC1491750ovF abstractC1491750ovFInvoke;
        C1491740ovE c1491740ovELIZIZ;
        EnumC1533980q1M enumC1533980q1M = c1533490q0Z.LJJJ;
        if ((enumC1533980q1M == EnumC1533980q1M.WEB_MAIN_DOCUMENT || enumC1533980q1M == EnumC1533980q1M.LYNX_TEMPLATE) && (function1 = C1533480q0Y.LIZLLL) != null && (abstractC1491750ovFInvoke = function1.invoke(c1533490q0Z)) != null) {
            c1491740ovELIZIZ = abstractC1491750ovFInvoke.LIZIZ("resource");
        } else {
            c1491740ovELIZIZ = null;
        }
        this(c1533490q0Z, false, new C1492150ovt(c1491740ovELIZIZ, c1533490q0Z.LJJJJIZL, "", new LinkedHashMap()), new C1533810q15(), null, null, false, false, false, 0L, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static File LJIIJ(C1533790q13 c1533790q13) {
        String fetcherName;
        AbstractC1533800q14 abstractC1533800q14;
        File fileLIZJ;
        C1535040q34 c1535040q34;
        C1534360q1y c1534360q1y;
        Object obj;
        File file;
        Object obj2;
        File file2;
        if (c1533790q13.LIZIZ) {
            Intrinsics.LJFF(c1533790q13.LJ, "builtin");
            C1534360q1y<?> c1534360q1y2 = c1533790q13.LJJIIJZLJL;
            if (c1534360q1y2 != null && Intrinsics.LJFF(c1534360q1y2.LIZJ, File.class)) {
                AbstractC1534220q1k abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y2, c1533790q13, false, 6);
                if (abstractC1534220q1kLIZ != null) {
                    obj2 = abstractC1534220q1kLIZ.LIZLLL;
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof File) && (file2 = (File) obj2) != null) {
                    return file2;
                }
            }
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL != null) {
                return new C0VSJ(strLIZLLL);
            }
            C1533970q1L c1533970q1L = c1533790q13.LJIJJLI;
            if (c1533970q1L != null && (c1535040q34 = c1533970q1L.LIZ) != null) {
                C259800zU c259800zU = new C259800zU();
                if (c1535040q34.LJIILJJIL(null, c1533790q13, File.class, new LinkedList(), new AwS602S0100000_23(c259800zU, (C259800zU<C1540900qCW>) 55), false) && (c1534360q1y = (C1534360q1y) c259800zU.element) != null && Intrinsics.LJFF(c1534360q1y.LIZJ, File.class)) {
                    AbstractC1534220q1k abstractC1534220q1kLIZ2 = C1534360q1y.LIZ(c1534360q1y, c1533790q13, false, 6);
                    if (abstractC1534220q1kLIZ2 != null) {
                        obj = abstractC1534220q1kLIZ2.LIZLLL;
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof File) && (file = (File) obj) != null) {
                        return file;
                    }
                }
                String strLIZLLL2 = c1533790q13.LIZLLL();
                if (strLIZLLL2 != null) {
                    return new C0VSJ(strLIZLLL2);
                }
            } else {
                Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                C1533480q0Y.LJ(c1533790q13, null);
                C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
                if (c1534000q1OLJ != null && (fileLIZJ = c1534000q1OLJ.LIZJ()) != null) {
                    return fileLIZJ;
                }
                if (c1533790q13.LIZ.LJJIJIL.booleanValue()) {
                    EnumC1533980q1M enumC1533980q1M = c1533790q13.LIZ.LJJJ;
                    ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
                    if (resourceFetcher == null || (fetcherName = resourceFetcher.getFetcherName()) == null) {
                        fetcherName = c1533790q13.LJ;
                    }
                    Boolean boolValueOf = Boolean.valueOf(c1533790q13.LIZ.LJJJJZ instanceof C1534080q1W);
                    String str = c1533790q13.LIZ.LJJJJIZL;
                    C1534000q1O c1534000q1OLJ2 = c1533790q13.LJ();
                    if (c1534000q1OLJ2 != null) {
                        abstractC1533800q14 = c1534000q1OLJ2.LIZ;
                    } else {
                        abstractC1533800q14 = null;
                    }
                    C1533480q0Y.LIZJ("response", enumC1533980q1M, fetcherName, boolValueOf, "need local file but no valid file", str, null, null, null, abstractC1533800q14, null, 6848);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[PHI: r1
      0x003a: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String) binds: [B:22:0x0037, B:19:0x002e, B:15:0x0023, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L3b
            int r0 = r3.hashCode()
            switch(r0) {
                case -1077756671: goto L28;
                case 98349: goto La;
                case 98230121: goto L19;
                case 230960163: goto L31;
                default: goto L9;
            }
        L9:
            return r3
        La:
            java.lang.String r1 = "cdn"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L9
            boolean r0 = r2.LJI
            if (r0 == 0) goto L3a
            java.lang.String r3 = "cdn_cache"
            return r3
        L19:
            java.lang.String r1 = "gecko"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L9
            boolean r0 = r2.LJI
            if (r0 != 0) goto L3a
            java.lang.String r3 = "gecko_update"
            return r3
        L28:
            java.lang.String r1 = "memory"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L3a
            return r3
        L31:
            java.lang.String r1 = "builtin"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L3a
            return r3
        L3a:
            return r1
        L3b:
            java.lang.String r3 = "unknown"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533790q13.LJII(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream LJIIJJI(boolean z) {
        Object obj;
        AbstractC1533800q14 abstractC1533800q14;
        InputStream inputStreamLJIILLIIL;
        AbstractC1534220q1k<?> abstractC1534220q1k;
        String fetcherName;
        AbstractC1533800q14 abstractC1533800q142;
        File fileLIZJ;
        InputStream inputStreamLJ;
        InputStream inputStreamLJ2;
        C1535040q34 c1535040q34;
        Class<?> cls;
        Object obj2;
        File file;
        Object c098200Yq;
        AbstractC1534220q1k abstractC1534220q1kLIZ;
        C1534360q1y c1534360q1y;
        Object obj3;
        InputStream inputStream;
        Object obj4;
        byte[] bArr;
        Object obj5;
        InputStream inputStream2;
        Object obj6 = null;
        if (!this.LIZIZ) {
            return null;
        }
        C1534360q1y<?> c1534360q1y2 = this.LJJIIJZLJL;
        boolean z2 = false;
        if (c1534360q1y2 != null) {
            if (Intrinsics.LJFF(c1534360q1y2.LIZJ, InputStream.class)) {
                AbstractC1534220q1k abstractC1534220q1kLIZ2 = C1534360q1y.LIZ(c1534360q1y2, this, false, 6);
                if (abstractC1534220q1kLIZ2 != null) {
                    obj5 = abstractC1534220q1kLIZ2.LIZLLL;
                } else {
                    obj5 = null;
                }
                if (obj5 instanceof InputStream) {
                    inputStream2 = (InputStream) obj5;
                } else {
                    inputStream2 = null;
                }
                if (inputStream2 != null) {
                    return inputStream2;
                }
            }
            if (Intrinsics.LJFF(c1534360q1y2.LIZJ, byte[].class)) {
                AbstractC1534220q1k abstractC1534220q1kLIZ3 = C1534360q1y.LIZ(c1534360q1y2, this, false, 6);
                if (abstractC1534220q1kLIZ3 != null) {
                    obj4 = abstractC1534220q1kLIZ3.LIZLLL;
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof byte[]) {
                    bArr = (byte[]) obj4;
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    return new ByteArrayInputStream(bArr);
                }
            }
        }
        C1533970q1L c1533970q1L = this.LJIJJLI;
        if (c1533970q1L != null && (c1535040q34 = c1533970q1L.LIZ) != null) {
            C259800zU c259800zU = new C259800zU();
            if (c1535040q34.LJIILJJIL(null, this, InputStream.class, new LinkedList(), new AwS602S0100000_23(c259800zU, (C259800zU<C1540900qCW>) 54), false) && (c1534360q1y = (C1534360q1y) c259800zU.element) != null && Intrinsics.LJFF(c1534360q1y.LIZJ, InputStream.class)) {
                AbstractC1534220q1k abstractC1534220q1kLIZ4 = C1534360q1y.LIZ(c1534360q1y, this, false, 6);
                if (abstractC1534220q1kLIZ4 != null) {
                    obj3 = abstractC1534220q1kLIZ4.LIZLLL;
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof InputStream) {
                    inputStream = (InputStream) obj3;
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    return inputStream;
                }
            }
            C1534360q1y<?> c1534360q1y3 = this.LJJIIJZLJL;
            if (c1534360q1y3 != null) {
                cls = c1534360q1y3.LIZJ;
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(cls, File.class)) {
                return null;
            }
            C1534360q1y<?> c1534360q1y4 = this.LJJIIJZLJL;
            if (c1534360q1y4 != null && (abstractC1534220q1kLIZ = C1534360q1y.LIZ(c1534360q1y4, this, false, 6)) != null) {
                obj2 = abstractC1534220q1kLIZ.LIZLLL;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof File) {
                file = (File) obj2;
            } else {
                file = null;
            }
            if (file == null) {
                return null;
            }
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot generate inputStream when data type is file, processed_chain: ");
                sbLIZ.append(c1535040q34.LIZJ);
                C1533880q1C.LIZJ("Response", "provideInputStream", C2188811AlT.LIZIZ(sbLIZ), null, null);
                c098200Yq = new C0VSP(file);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj6 = c098200Yq;
            }
            return (InputStream) obj6;
        }
        C1534000q1O c1534000q1OLJ = LJ();
        if (c1534000q1OLJ != null && (inputStreamLJ2 = c1534000q1OLJ.LJ(this, z)) != null) {
            return inputStreamLJ2;
        }
        if (this.LIZ.LJIIZILJ.booleanValue() || this.LIZ.LJIJJ) {
            C1534840q2k c1534840q2kLIZIZ = C1533940q1I.LIZIZ(this);
            if (c1534840q2kLIZIZ != null && (abstractC1534220q1k = c1534840q2kLIZIZ.LIZIZ) != null) {
                obj = abstractC1534220q1k.LIZLLL;
            } else {
                obj = null;
            }
            if (obj instanceof C1534010q1P) {
                abstractC1533800q14 = (AbstractC1533800q14) obj;
            } else {
                abstractC1533800q14 = null;
            }
            if (abstractC1533800q14 != null && (inputStreamLJIILLIIL = abstractC1533800q14.LJIILLIIL()) != null) {
                LJIILJJIL(abstractC1533800q14);
                return inputStreamLJIILLIIL;
            }
        }
        C1533940q1I.LJ(this);
        C1534000q1O c1534000q1OLJ2 = LJ();
        if (c1534000q1OLJ2 != null && (inputStreamLJ = c1534000q1OLJ2.LJ(this, z)) != null) {
            return inputStreamLJ;
        }
        C1534000q1O c1534000q1OLJ3 = LJ();
        if (c1534000q1OLJ3 != null && (fileLIZJ = c1534000q1OLJ3.LIZJ()) != null && fileLIZJ.isDirectory()) {
            z2 = true;
        }
        if (!z2) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            EnumC1533980q1M enumC1533980q1M = this.LIZ.LJJJ;
            ResourceFetcher resourceFetcher = this.LJIJJ;
            if (resourceFetcher == null || (fetcherName = resourceFetcher.getFetcherName()) == null) {
                fetcherName = this.LJ;
            }
            Boolean boolValueOf = Boolean.valueOf(this.LIZ.LJJJJZ instanceof C1534080q1W);
            String str = this.LIZ.LJJJJIZL;
            C1534000q1O c1534000q1OLJ4 = LJ();
            if (c1534000q1OLJ4 != null) {
                abstractC1533800q142 = c1534000q1OLJ4.LIZ;
            } else {
                abstractC1533800q142 = null;
            }
            C1533480q0Y.LIZJ("response", enumC1533980q1M, fetcherName, boolValueOf, "fetch succeeded but no inputstream provided", str, null, null, null, abstractC1533800q142, null, 6848);
        }
        return null;
    }

    public final WebResourceResponse LJIIL(boolean z) {
        String str;
        int iIntValue;
        int iIntValue2;
        if (this.LIZIZ) {
            C1529710puT c1529710puT = C1529710puT.LIZ;
            String strLIZIZ = LIZIZ();
            String str2 = this.LJJIIZI;
            InputStream inputStreamLJIIJJI = LJIIJJI(z);
            C1534070q1V c1534070q1V = this.LJIIZILJ;
            if (c1534070q1V == null || (str = c1534070q1V.LJII.LIZLLL) == null) {
                str = this.LIZ.LJJJJIZL;
            }
            Map<String, String> map = this.LJIILLIIL;
            c1529710puT.getClass();
            WebResourceResponse webResourceResponseLIZLLL = C1529710puT.LIZLLL(strLIZIZ, str2, inputStreamLJIIJJI, str, map);
            if (webResourceResponseLIZLLL != null) {
                Pair<Integer, String> pair = this.LJIILL;
                if (pair != null && ((100 <= (iIntValue = pair.getFirst().intValue()) && iIntValue < 300) || (400 <= (iIntValue2 = pair.getFirst().intValue()) && iIntValue2 < 500))) {
                    webResourceResponseLIZLLL.setStatusCodeAndReasonPhrase(pair.getFirst().intValue(), pair.getSecond());
                }
                return webResourceResponseLIZLLL;
            }
        }
        return null;
    }

    public final void LJIILIIL(C1535250q3P c1535250q3P) {
        if (this.LJJII == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1535250q3P.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c1535250q3P.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c1535250q3P.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJJII.length() == 0) {
            this.LJJII.append(strLIZIZ);
            return;
        }
        StringBuilder sb = this.LJJII;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('\n');
        sbLIZ2.append(strLIZIZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIILJJIL(AbstractC1533800q14 abstractC1533800q14) {
        if (abstractC1533800q14 == null) {
            LJIILL(null);
        } else {
            LJIILL(new C1534000q1O(abstractC1533800q14));
        }
    }

    public final void LJIILL(C1534000q1O c1534000q1O) {
        if (c1534000q1O == null) {
            C1534000q1O c1534000q1O2 = this.LJJIFFI;
            if (c1534000q1O2 != null) {
                this.LJJIII = new WeakReference<>(c1534000q1O2);
                this.LJJIIJ = new WeakReference<>(c1534000q1O2.LIZ);
            }
            this.LJJIFFI = null;
            return;
        }
        AbstractC1533800q14 abstractC1533800q14 = c1534000q1O.LIZ;
        abstractC1533800q14.getClass();
        this.LJJ = abstractC1533800q14 instanceof C1532360pyk;
        this.LJJIFFI = c1534000q1O;
    }

    public C1533790q13(C1533490q0Z c1533490q0Z, boolean z, C1492150ovt c1492150ovt, C1533810q15 c1533810q15, String str, String str2, boolean z2, boolean z3, boolean z4, long j, String str3) {
        StringBuilder sb;
        this.LIZ = c1533490q0Z;
        this.LIZIZ = z;
        this.LIZJ = c1492150ovt;
        this.LIZLLL = c1533810q15;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = j;
        this.LJIIJ = str3;
        this.LJIL = new AtomicBoolean(this.LIZ.LJIILJJIL);
        if (C19994513Lb.LIZIZ(System.currentTimeMillis()).nextFloat() >= 0.001d && !Forest.Companion.isDebug()) {
            sb = null;
        } else {
            sb = new StringBuilder();
        }
        this.LJJII = sb;
        this.LJJIIZ = this.LIZ.LJJJLL.contains("cdn") && this.LIZ.LJIILL.booleanValue();
    }
}
