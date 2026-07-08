package X;

import android.app.Application;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.exp.MinisPreDownloadConfig;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.MinisManifestData;
import com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.MinisResourceData;
import com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.fetcher.MinisH5ResourceFetcher;
import defpackage.c3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0puI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529600puI {
    public static final C1529600puI LIZ = new C1529600puI();
    public static final C2196951Ayb LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static Long LJI;

    static {
        C844470XAv.LIZ.getClass();
        LIZIZ = new C2196951Ayb((Application) C844470XAv.LIZ());
        LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(176));
        LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(175));
        LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(401));
        LJFF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(174));
    }

    public static boolean LIZLLL(String str) {
        String string = a0.LJLIIIL(str).toString();
        if (u.LJIJI(string, "importmap", true) || u.LJIIZILJ(string, ".importmap", true) || u.LJIIZILJ(string, ".importmap.json", true)) {
            return true;
        }
        int iLJJJJ = a0.LJJJJ(string, '.', 0, 6);
        if (iLJJJJ <= 0 || iLJJJJ == string.length() - 1) {
            return false;
        }
        return ((MinisPreDownloadConfig) LJFF.getValue()).mimeTypeWhiteList.contains(string.substring(iLJJJJ + 1).toLowerCase(Locale.ROOT));
    }

    public static List LJ(MinisManifestData minisManifestData) {
        ArrayList arrayList = new ArrayList();
        Iterator<MinisResourceData> it2 = minisManifestData.resourceList.iterator();
        while (it2.hasNext()) {
            LJFF(arrayList, it2.next(), "");
        }
        return arrayList;
    }

    public static Object LIZ(String str, C2196831AyP c2196831AyP) {
        C09AE c09ae = (C09AE) ((ConcurrentHashMap) LIZJ.getValue()).get(str);
        if (c09ae != null) {
            Object objLJJZ = c09ae.LJJZ(c2196831AyP);
            if (objLJJZ == C099R.LJFF()) {
                return objLJJZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static void LIZIZ(EnumC992080bvK enumC992080bvK, String str) {
        C01GW c01gw = LIZJ;
        Collection collectionValues = ((ConcurrentHashMap) c01gw.getValue()).values();
        ((ConcurrentHashMap) c01gw.getValue()).clear();
        int i = C992090bvL.LIZ[enumC992080bvK.ordinal()];
        if (i == 1) {
            str = "ads_display";
        } else if (i == 2) {
            if (str == null) {
                str = "";
            }
        } else {
            throw new C1954807lC();
        }
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(new CancellationException("MinisH5PreDownloadProcessor : canceled by #cancelAll"));
        }
        Long l = LJI;
        if (l != null) {
            long jLongValue = l.longValue();
            if (((Number) C297050Bkd.LIZ.getValue()).intValue() == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                HashMap mapLJI = C2097608Jq.LJI(new Pair("enter_from", str));
                HashMap mapLJI2 = C2097608Jq.LJI(new Pair("preload_duration", String.valueOf(jCurrentTimeMillis)));
                if (!Intrinsics.LJFF(str, "ads_display")) {
                    mapLJI2.put("watch_duration", String.valueOf(jCurrentTimeMillis));
                }
                C08S3.LIZLLL("tm_preload_perf", mapLJI, mapLJI2, null);
            }
        }
        LJI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[Catch: IOException -> 0x00c4, TryCatch #2 {IOException -> 0x00c4, blocks: (B:22:0x006b, B:24:0x0071, B:29:0x008f, B:33:0x009a, B:35:0x009e, B:37:0x00af, B:46:0x00c0, B:47:0x00c3, B:28:0x0084, B:32:0x0097, B:36:0x00a2, B:26:0x007b), top: B:60:0x006b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529600puI.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.minis.model.MinisMetaResp r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529600puI.LJI(com.ss.android.ugc.aweme.minis.model.MinisMetaResp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.minis.model.MinisMetaResp r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1529620puK
            if (r0 == 0) goto L62
            r7 = r10
            X.0puK r7 = (X.C1529620puK) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r0 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r2 = r7.LLILZLL
            r1 = 1
            if (r2 == 0) goto L35
            if (r2 != r1) goto L90
            java.lang.Object r5 = r7.LLILLL
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r4 = r7.LLILLJJLI
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r7.LL
            java.lang.String r3 = (java.lang.String) r3
            X.C155000ia.LIZIZ(r0)
        L2e:
            com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.MinisManifestData r0 = (com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.MinisManifestData) r0
            if (r0 != 0) goto L68
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r0)
            java.lang.String r3 = r9.minisUrl
            if (r3 != 0) goto L3f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            java.lang.String r4 = r9.clientKey
            if (r4 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            java.lang.String r0 = X.C592560NLy.LIZIZ(r3)
            if (r0 != 0) goto L4f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4f:
            java.io.File r5 = X.C1528780psy.LIZ(r4, r0)
            r7.LL = r3
            r7.LLILLJJLI = r4
            r7.LLILLL = r5
            r7.LLILZLL = r1
            java.lang.Object r0 = r8.LIZJ(r3, r7)
            if (r0 != r6) goto L2e
            return r6
        L62:
            X.0puK r7 = new X.0puK
            r7.<init>(r8, r10)
            goto L12
        L68:
            java.util.List r0 = LJ(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0puI r0 = X.C1529600puI.LIZ
            r0.getClass()
            boolean r0 = LIZLLL(r1)
            if (r0 == 0) goto L72
            LJIIIZ(r5, r4, r3, r1)
            goto L72
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529600puI.LJII(com.ss.android.ugc.aweme.minis.model.MinisMetaResp, X.05Vn):java.lang.Object");
    }

    public static final void LJFF(List<String> list, MinisResourceData minisResourceData, String str) {
        String strLIZIZ;
        if (str.length() == 0) {
            strLIZIZ = minisResourceData.name;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(minisResourceData.name);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str2 = minisResourceData.type;
        if (Intrinsics.LJFF(str2, "folder")) {
            List<MinisResourceData> list2 = minisResourceData.children;
            if (list2 != null) {
                Iterator<MinisResourceData> it2 = list2.iterator();
                while (it2.hasNext()) {
                    LJFF(list, it2.next(), strLIZIZ);
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str2, "file")) {
            ((ArrayList) list).add(strLIZIZ);
        }
    }

    public static void LJIIIIZZ(SchemaParserData schemaParserData, long j, MinisMetaResp minisMetaResp) {
        long jLongValue;
        Forest forest;
        MinisH5ResourceFetcher.Companion.getClass();
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            forest.registerCustomFetcher("MinisH5ResourceFetcher", MinisH5ResourceFetcher.class);
        }
        String str = schemaParserData.clientKey;
        if (str == null) {
            return;
        }
        C01GW c01gw = LJ;
        Long l = (Long) ((ConcurrentHashMap) c01gw.getValue()).get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((ConcurrentHashMap) c01gw.getValue()).put(str, Long.valueOf(jCurrentTimeMillis));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = ((MinisPreDownloadConfig) LJFF.getValue()).sameAppDownloadInterval + 0;
        }
        if (jLongValue > jCurrentTimeMillis) {
            return;
        }
        if (((MinisPreDownloadConfig) LJFF.getValue()).downloadOnWifiOnly) {
            C844470XAv.LIZ.getClass();
            if (!C804420Vh2.LJI(C844470XAv.LIZ())) {
                return;
            }
        }
        LJI = Long.valueOf(jCurrentTimeMillis);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) C315120CWw.LIZ.getValue(), C0PEM.LIZJ.plus(new C1138320fjC(str)), null, new C1529640puM(j, minisMetaResp, schemaParserData, str, null), 2);
        ((ConcurrentHashMap) LIZJ.getValue()).put(str, anonymousClass0956LIZLLL);
        anonymousClass0956LIZLLL.LJII(new AwS73S1000000_23(str, 11));
    }

    public static void LJIIIZ(File file, String str, String str2, String str3) {
        File fileLJIL = C08QA.LJIL(file, str3);
        if (!fileLJIL.exists()) {
            String parent = fileLJIL.getParent();
            if (parent != null) {
                C2137908Zd.LIZJ.LIZIZ(parent);
            }
            C00AQ c00aq = C00AQ.IN_ORDER;
            c3 c3Var = (c3) C1528810pt1.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('/');
            sbLIZ.append(str3);
            c3Var.LIZ(c00aq.ordinal(), C2188811AlT.LIZIZ(sbLIZ), new C592550NLx(str2, str3, str, null));
        }
    }
}
