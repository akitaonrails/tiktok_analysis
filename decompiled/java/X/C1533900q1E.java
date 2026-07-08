package X;

import Y.ARunnableS123S0100000_23;
import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.model.RequestParams;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS151S0400000_23;
import kotlin.jvm.internal.AwS32S2000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533900q1E {
    public static volatile int LJIIZILJ;
    public static final ConcurrentHashMap<String, C1533970q1L> LJIJ = new ConcurrentHashMap<>();
    public Forest LIZ;
    public final String LIZIZ;
    public final Set<String> LIZJ;
    public volatile boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final JSONObject LJIILJJIL;
    public boolean LJIILL;
    public final HashSet<AbstractC1530000puw> LJIILLIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceGroup: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Pair<C1533790q13, InterfaceC1534830q2j> LJ(C1533910q1F c1533910q1F) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = c1533910q1F.LIZIZ;
        RequestParams requestParams = c1533910q1F.LIZ;
        boolean z = c1533910q1F.LJII;
        C1534490q2B.LIZIZ(str, requestParams);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1533540q0e c1533540q0e = C1533540q0e.LIZ;
        Forest forest = this.LIZ;
        boolean z2 = c1533910q1F.LJ;
        c1533540q0e.getClass();
        C1533490q0Z c1533490q0ZLIZ = C1533540q0e.LIZ(forest, requestParams, str, z2);
        c1533490q0ZLIZ.LJJ = true;
        c1533490q0ZLIZ.LJJJLZIJ = c1533910q1F;
        c1533490q0ZLIZ.LJJIIZ = z;
        C1534490q2B.LIZJ(c1533490q0ZLIZ);
        C1535170q3H c1535170q3H = c1533490q0ZLIZ.LJJJJJ.getConfig().LJIIJ;
        if (c1535170q3H != null) {
            c1535170q3H.LIZJ(c1533490q0ZLIZ);
        }
        C1533790q13 c1533790q13 = new C1533790q13(c1533490q0ZLIZ);
        InterfaceC1534830q2j interfaceC1534830q2jLIZ = C1533780q12.LIZ(c1533790q13);
        if (interfaceC1534830q2jLIZ instanceof C1535040q34) {
            C1533970q1L c1533970q1L = new C1533970q1L((C1535040q34) interfaceC1534830q2jLIZ, c1533490q0ZLIZ.LJJJZ, this.LIZIZ, c1533910q1F.LJFF, c1533790q13);
            c1533790q13.LJIJJLI = c1533970q1L;
            c1533910q1F.LJIIIZ = c1533970q1L;
        }
        C1492150ovt c1492150ovt = c1533790q13.LIZJ;
        c1492150ovt.LJI(jCurrentTimeMillis2, "init");
        c1492150ovt.LJII(jCurrentTimeMillis);
        c1492150ovt.LIZJ("init");
        c1492150ovt.LIZLLL("fetch");
        return new Pair<>(c1533790q13, interfaceC1534830q2jLIZ);
    }

    public static void LIZ(C1533900q1E c1533900q1E, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        c1533900q1E.getClass();
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1533900q1E, 150));
        c1533900q1E.LIZLLL = true;
        if (!c1533900q1E.LJIILLIIL.isEmpty()) {
            C086F c086f = C086F.LIZ;
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(c1533900q1E, 115);
            c086f.getClass();
            C086F.LIZLLL(aRunnableS123S0100000_23);
        }
        boolean z2 = !LJIJ.isEmpty();
        C086F c086f2 = C086F.LIZ;
        C1533930q1H c1533930q1H = new C1533930q1H(z2, c1533900q1E, null, z);
        c086f2.getClass();
        C086F.LJI(c1533930q1H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r10.contains(r8) == true) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, X.0q2J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1533910q1F r32, boolean r33, kotlin.jvm.functions.Function1<? super X.C1533790q13, kotlin.Unit> r34) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533900q1E.LIZIZ(X.0q1F, boolean, kotlin.jvm.functions.Function1):void");
    }

    public C1533900q1E(Forest forest, String str, boolean z, int i) {
        Set<String> setNewSetFromMap;
        str = (i & 2) != 0 ? UUID.randomUUID().toString() : str;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = forest;
        this.LIZIZ = str;
        if (z) {
            setNewSetFromMap = null;
        } else {
            setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.LIZJ = setNewSetFromMap;
        this.LJIILJJIL = new JSONObject();
        this.LJIILL = ForestExperiment.INSTANCE.getFetchIfDestroyed();
        this.LJIILLIIL = new HashSet<>();
    }

    public final C1533910q1F LIZJ(String str, RequestParams requestParams, boolean z, Function1<? super C1533790q13, Unit> function1) {
        C1533910q1F c1533910q1FLIZLLL = LIZLLL(str, requestParams, true, z, "fetchAsyncIfNeed", false);
        if (c1533910q1FLIZLLL == null) {
            return null;
        }
        this.LJ++;
        C086F.LIZ.getClass();
        LIZIZ(c1533910q1FLIZLLL, C086F.LIZ(), function1);
        return c1533910q1FLIZLLL;
    }

    public final C1533910q1F LJFF(String str, RequestParams requestParams, boolean z, Function1 function1) {
        C1533910q1F c1533910q1FLIZLLL = LIZLLL(str, requestParams, true, z, "prefetch", true);
        if (c1533910q1FLIZLLL == null) {
            return null;
        }
        C086F c086f = C086F.LIZ;
        AwS151S0400000_23 awS151S0400000_23 = new AwS151S0400000_23(this, (C1533900q1E) requestParams, (RequestParams) c1533910q1FLIZLLL, (C1533910q1F) function1, (Function1<? super C1533790q13, Unit>) 2);
        c086f.getClass();
        C086F.LJI(awS151S0400000_23);
        return c1533910q1FLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1534660q2S r8, java.lang.String r9, java.lang.String r10, kotlin.jvm.functions.Function1 r11) {
        /*
            r7 = this;
            X.0q2R r1 = r8.LIZIZ
            X.0q2R r0 = X.EnumC1534650q2R.WEB
            r3 = 1
            java.lang.String r2 = "image"
            if (r1 != r0) goto L44
            java.lang.String r4 = "other"
            java.lang.String r1 = "css"
            java.lang.String r0 = "script"
            java.lang.String[] r6 = new java.lang.String[]{r1, r0, r2, r4}
            r5 = 0
        L14:
            r1 = r6[r5]
            java.util.Map<java.lang.String, java.util.List<X.0q00>> r0 = r8.LIZJ
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3e
            java.util.Iterator r4 = r0.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r4.next()
            X.0q00 r2 = (X.C1533140q00) r2
            java.lang.String r1 = r2.LIZ
            X.0q1M r0 = X.EnumC1533980q1M.WEB_CHILD_RESOURCE
            com.bytedance.forest.model.RequestParams r0 = r7.LJII(r2, r0, r10, r9)
            r7.LJFF(r1, r0, r3, r11)
            goto L26
        L3e:
            int r5 = r5 + 1
            r0 = 4
            if (r5 >= r0) goto Lb6
            goto L14
        L44:
            java.util.Map<java.lang.String, java.util.List<X.0q00>> r0 = r8.LIZJ
            if (r0 == 0) goto Lb6
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb6
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r5.hashCode()
            r0 = 3148879(0x300c4f, float:4.41252E-39)
            if (r4 == r0) goto La8
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r4 == r0) goto L9f
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r4 != r0) goto Lb3
            java.lang.String r0 = "video"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb3
            X.0q1M r5 = X.EnumC1533980q1M.LYNX_VIDEO
        L7f:
            java.lang.Object r0 = r1.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L89:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r4.next()
            X.0q00 r0 = (X.C1533140q00) r0
            java.lang.String r1 = r0.LIZ
            com.bytedance.forest.model.RequestParams r0 = r7.LJII(r0, r5, r10, r9)
            r7.LJFF(r1, r0, r3, r11)
            goto L89
        L9f:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto Lb3
            X.0q1M r5 = X.EnumC1533980q1M.LYNX_IMAGE
            goto L7f
        La8:
            java.lang.String r0 = "font"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb3
            X.0q1M r5 = X.EnumC1533980q1M.LYNX_FONT
            goto L7f
        Lb3:
            X.0q1M r5 = X.EnumC1533980q1M.LYNX_CHILD_RESOURCE
            goto L7f
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533900q1E.LJI(X.0q2S, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public final RequestParams LJII(C1533140q00 c1533140q00, EnumC1533980q1M enumC1533980q1M, String str, String str2) {
        boolean z;
        RequestParams requestParams = new RequestParams(enumC1533980q1M);
        boolean z2 = c1533140q00.LIZIZ;
        boolean z3 = true;
        if (z2 && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            z = true;
        } else {
            z = false;
        }
        requestParams.loadToMemory = z;
        requestParams.needLocalFile = Boolean.FALSE;
        requestParams.enableMemoryCache = Boolean.valueOf(z2);
        if (!c1533140q00.LIZJ && enumC1533980q1M != EnumC1533980q1M.LYNX_IMAGE) {
            z3 = false;
        }
        requestParams.disableCdn = z3;
        requestParams.groupId = this.LIZIZ;
        Map<String, ? extends Object> map = c1533140q00.LIZLLL;
        if (map != null) {
            requestParams.customParams.putAll(map);
        }
        requestParams.sessionId = str;
        requestParams.source = str2;
        return requestParams;
    }

    public final C1533910q1F LIZLLL(String str, RequestParams requestParams, boolean z, boolean z2, String str2, boolean z3) {
        if (!this.LIZ.checkParams$forest_release(str, requestParams)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid params, url=");
            sbLIZ.append(str);
            C1534250q1n.LJFF("ResourceGroup", str2, C2188811AlT.LIZIZ(sbLIZ), null, false);
            return null;
        }
        if (this.LIZLLL && !this.LJIILL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("destroyed, url:");
            sbLIZ2.append(str);
            C1533880q1C.LIZJ("ResourceGroup", "generateRequestOperation", C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return null;
        }
        C1534250q1n.LIZ.LJIIJ(new AwS32S2000000_23(str2, str, 2));
        C1533910q1F c1533910q1F = new C1533910q1F(requestParams, str, this.LIZ, null, null, z, z2, this, z3, 24);
        requestParams.groupId = this.LIZIZ;
        return c1533910q1F;
    }
}
