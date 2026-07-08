package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533720q0w {
    public static final C1533720q0w LIZ = new C1533720q0w();
    public static final String LIZIZ = "ContainerUrlParser";
    public static final C2027907wz LIZJ;
    public static Map<String, C1533750q0z<C2027907wz>> LIZLLL;
    public static Map<String, List<C1533770q11>> LJ;

    static {
        C1551940qUK.LJIIL(new AbstractC1552040qUU() { // from class: X.0q0y
            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                String accessKey;
                String channel;
                C1533750q0z c1533750q0z;
                Forest forest;
                C1533750q0z c1533750q0z2;
                Forest forest2;
                if (updatePackage == null || (accessKey = updatePackage.getAccessKey()) == null || (channel = updatePackage.getChannel()) == null) {
                    return;
                }
                C1533720q0w.LIZ.getClass();
                String strLIZ = C1533720q0w.LIZ(accessKey, channel);
                Map<String, C1533750q0z<C2027907wz>> map = C1533720q0w.LIZLLL;
                if (map != null && (c1533750q0z2 = (C1533750q0z) ((LinkedHashMap) map).get(strLIZ)) != null) {
                    c1533750q0z2.LIZ = null;
                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                    if (iResourceServiceXLIZIZ != null && (forest2 = iResourceServiceXLIZIZ.getForest()) != null) {
                        C1533720q0w.LJFF(accessKey, channel, forest2);
                        return;
                    }
                    return;
                }
                String strLIZ2 = C1533720q0w.LIZ("", channel);
                Map<String, C1533750q0z<C2027907wz>> map2 = C1533720q0w.LIZLLL;
                if (map2 != null && (c1533750q0z = (C1533750q0z) ((LinkedHashMap) map2).get(strLIZ2)) != null) {
                    c1533750q0z.LIZ = null;
                    IResourceServiceX iResourceServiceXLIZIZ2 = C1533710q0v.LIZIZ(null, false);
                    if (iResourceServiceXLIZIZ2 != null && (forest = iResourceServiceXLIZIZ2.getForest()) != null) {
                        C1533720q0w.LJFF("", channel, forest);
                    }
                }
            }
        });
        LIZJ = new C2027907wz();
    }

    public static void LIZIZ(n nVar) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            n nVarLJIILIIL = ((k) entry.getValue()).LJIILIIL();
            try {
                c098200Yq2 = nVarLJIILIIL.LJJIIZ("accessKey").LJIL();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            try {
                String str = (String) c098200Yq2;
                if (str == null) {
                    str = "";
                }
                c098200Yq = new C1533510q0b(str, nVarLJIILIIL.LJJIIZ("channel").LJIL(), nVarLJIILIIL.LJJIIZ("bundle").LJIL());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1533510q0b c1533510q0b = (C1533510q0b) c098200Yq;
            if (c1533510q0b != null) {
                C1533720q0w c1533720q0w = LIZ;
                String str2 = c1533510q0b.LIZ;
                String str3 = c1533510q0b.LIZIZ;
                c1533720q0w.getClass();
                String strLIZ = LIZ(str2, str3);
                linkedHashMap2.put(strLIZ, new C1533750q0z());
                linkedHashMap.put(entry.getKey(), c1533510q0b);
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator<k> it3 = nVarLJIILIIL.LJJIIZ("subChannel").LJIIL().iterator();
                    while (it3.hasNext()) {
                        n nVarLJIILIIL2 = it3.next().LJIILIIL();
                        String strLJIL = nVarLJIILIIL2.LJJIIZ("channel").LJIL();
                        try {
                            c098200Yq3 = nVarLJIILIIL2.LJJIIZ("accessKey").LJIL();
                            C189200o6.m2constructorimpl(c098200Yq3);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq3 = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq3);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                            c098200Yq3 = null;
                        }
                        String str4 = (String) c098200Yq3;
                        if (str4 == null) {
                            str4 = c1533510q0b.LIZ;
                        }
                        LIZ.getClass();
                        linkedHashMap2.put(LIZ(str4, strLJIL), new C1533750q0z());
                        arrayList.add(new C1533770q11(str4, strLJIL));
                    }
                    linkedHashMap3.put(strLIZ, arrayList);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                }
            }
        }
        LIZJ.LIZJ(linkedHashMap);
        C086F c086f = C086F.LIZ;
        C1530460pvg c1530460pvg = new C1530460pvg();
        c086f.getClass();
        C086F.LJI(c1530460pvg);
        Map<String, C1533750q0z<C2027907wz>> mapLJ = LIZLLL;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapLJ);
        linkedHashMap4.putAll(linkedHashMap2);
        LIZLLL = linkedHashMap4;
        Map<String, List<C1533770q11>> mapLJ2 = LJ;
        if (mapLJ2 == null) {
            mapLJ2 = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(mapLJ2);
        linkedHashMap5.putAll(linkedHashMap3);
        LJ = linkedHashMap5;
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1533510q0b LIZJ(String str, C1533760q10 c1533760q10) {
        List<C1533770q11> list;
        C1533750q0z c1533750q0z;
        C2027907wz c2027907wz;
        C1533750q0z c1533750q0z2;
        C2027907wz c2027907wz2;
        if (c1533760q10 == null) {
            return null;
        }
        String strLIZ = LIZ(c1533760q10.LIZ, c1533760q10.LIZIZ);
        C1533510q0b c1533510q0b = new C1533510q0b("", "", "");
        Map<String, C1533750q0z<C2027907wz>> map = LIZLLL;
        if (map != null && (c1533750q0z2 = (C1533750q0z) ((LinkedHashMap) map).get(strLIZ)) != null && (c2027907wz2 = (C2027907wz) c1533750q0z2.LIZ) != null && c2027907wz2.LIZ(str, c1533510q0b, true)) {
            return c1533510q0b;
        }
        Map<String, List<C1533770q11>> map2 = LJ;
        if (map2 != null && (list = (List) ((LinkedHashMap) map2).get(strLIZ)) != null) {
            for (C1533770q11 c1533770q11 : list) {
                C1533720q0w c1533720q0w = LIZ;
                String str2 = c1533770q11.LIZ;
                String str3 = c1533770q11.LIZIZ;
                c1533720q0w.getClass();
                String strLIZ2 = LIZ(str2, str3);
                Map<String, C1533750q0z<C2027907wz>> map3 = LIZLLL;
                if (map3 != null && (c1533750q0z = (C1533750q0z) ((LinkedHashMap) map3).get(strLIZ2)) != null && (c2027907wz = (C2027907wz) c1533750q0z.LIZ) != null && c2027907wz.LIZ(str, c1533510q0b, true)) {
                    return c1533510q0b;
                }
            }
        }
        return null;
    }

    public static C1533510q0b LIZLLL(String str, C1537480q70 c1537480q70, boolean z) {
        Forest forest;
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
        if (iResourceServiceXLIZIZ == null || (forest = iResourceServiceXLIZIZ.getForest()) == null) {
            return null;
        }
        String str2 = "";
        C1533510q0b c1533510q0b = new C1533510q0b("", "", "");
        if (LIZJ.LIZ(C1956907lX.LIZ(str), c1533510q0b, true)) {
            LJFF(c1533510q0b.LIZ, c1533510q0b.LIZIZ, forest);
            if (c1537480q70 != null) {
                c1537480q70.mainDocumentGeckoInfo = new C1533760q10(c1533510q0b.LIZ, c1533510q0b.LIZIZ, c1533510q0b.LIZJ);
            }
            c1533510q0b.LJIIIIZZ = GeckoSource.SPARK_MANIFEST;
            return c1533510q0b;
        }
        if (z) {
            C1533510q0b c1533510q0bTryParseGeckoModelViaPrefix2Ak = GeckoXAdapter.Companion.tryParseGeckoModelViaPrefix2Ak(str);
            if (c1533510q0bTryParseGeckoModelViaPrefix2Ak == null) {
                if (!forest.getConfig().LIZJ(str, c1533510q0b)) {
                    return null;
                }
                return c1533510q0b;
            }
            return c1533510q0bTryParseGeckoModelViaPrefix2Ak;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gecko_channel")) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gecko_bundle")) == null) {
            return null;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gecko_access_key");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        }
        c1533510q0b.LIZ = str2;
        c1533510q0b.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        c1533510q0b.LIZJ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        return c1533510q0b;
    }

    public static /* synthetic */ C1533510q0b LJ(C1533720q0w c1533720q0w, String str, C1537480q70 c1537480q70) {
        c1533720q0w.getClass();
        return LIZLLL(str, c1537480q70, false);
    }

    public static void LJFF(String str, String str2, Forest forest) {
        List<C1533770q11> list;
        C1533750q0z c1533750q0z;
        String strLIZ = LIZ(str, str2);
        Map<String, C1533750q0z<C2027907wz>> map = LIZLLL;
        if (map != null && (c1533750q0z = (C1533750q0z) ((LinkedHashMap) map).get(strLIZ)) != null) {
            if (c1533750q0z.LIZ != 0) {
                return;
            }
            C086F c086f = C086F.LIZ;
            C1533730q0x c1533730q0x = new C1533730q0x(c1533750q0z, str, str2, forest);
            c086f.getClass();
            C086F.LJI(c1533730q0x);
        }
        Map<String, List<C1533770q11>> map2 = LJ;
        if (map2 != null && (list = (List) ((LinkedHashMap) map2).get(strLIZ)) != null) {
            for (C1533770q11 c1533770q11 : list) {
                if (!Intrinsics.LJFF(c1533770q11.LIZ, str) || !Intrinsics.LJFF(c1533770q11.LIZIZ, str2)) {
                    C1533720q0w c1533720q0w = LIZ;
                    String str3 = c1533770q11.LIZ;
                    String str4 = c1533770q11.LIZIZ;
                    c1533720q0w.getClass();
                    LJFF(str3, str4, forest);
                }
            }
        }
    }
}
