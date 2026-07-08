package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784460wXM {
    public static final C1784460wXM LIZ = new C1784460wXM();
    public static final C19283010cG LIZIZ = new InterfaceC1784430wXJ() { // from class: X.10cG
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v8, types: [X.13BV] */
        @Override // X.InterfaceC1784430wXJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.C1784480wXO> LIZIZ() {
            /*
                r6 = this;
                java.lang.String r1 = "share_prop_cache_repo"
                java.lang.String r0 = "share_prop_cache_list"
                java.lang.String r2 = X.C10ZP.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L81
                int r0 = r2.length()     // Catch: java.lang.Throwable -> L81
                if (r0 != 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                if (r0 == 0) goto L15
                goto L75
            L15:
                X.13IV r1 = X.C19253410Ua.LIZ     // Catch: java.lang.Throwable -> L81
                r1.getClass()     // Catch: java.lang.Throwable -> L81
                X.13GI r0 = X.C13GI.LIZ     // Catch: java.lang.Throwable -> L81
                java.lang.Object r1 = r1.LIZIZ(r0, r2)     // Catch: java.lang.Throwable -> L81
                X.13Fd r1 = (X.AbstractC19979113Fd) r1     // Catch: java.lang.Throwable -> L81
                X.13H0 r0 = X.C19988013Io.LIZ     // Catch: java.lang.Throwable -> L81
                boolean r0 = r1 instanceof X.C13BE     // Catch: java.lang.Throwable -> L81
                r5 = 0
                if (r0 == 0) goto L2d
                r0 = r1
                X.13BE r0 = (X.C13BE) r0     // Catch: java.lang.Throwable -> L81
                goto L2e
            L2d:
                r0 = r5
            L2e:
                if (r0 == 0) goto L7b
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
                r2.<init>()     // Catch: java.lang.Throwable -> L81
                java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L81
            L39:
                boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L81
                if (r0 == 0) goto L77
                java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L81
                X.13Fd r3 = (X.AbstractC19979113Fd) r3     // Catch: java.lang.Throwable -> L81
                X.13IV r1 = X.C19253410Ua.LIZ     // Catch: java.lang.Throwable -> L5a
                r1.getClass()     // Catch: java.lang.Throwable -> L5a
                X.0wXP r0 = X.C1784480wXO.Companion     // Catch: java.lang.Throwable -> L5a
                X.13HG r0 = r0.serializer()     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r1 = r1.LIZ(r0, r3)     // Catch: java.lang.Throwable -> L5a
                X.0wXO r1 = (X.C1784480wXO) r1     // Catch: java.lang.Throwable -> L5a
                X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L5a
                goto L66
            L5a:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
                X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> L81
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L81
                X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L81
            L66:
                boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> L81
                if (r0 == 0) goto L6d
                r1 = r5
            L6d:
                X.0wXO r1 = (X.C1784480wXO) r1     // Catch: java.lang.Throwable -> L81
                if (r1 == 0) goto L39
                r2.add(r1)     // Catch: java.lang.Throwable -> L81
                goto L39
            L75:
                X.13BV r2 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L81
            L77:
                X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L81
                goto L8d
            L7b:
                java.lang.String r0 = "JsonArray"
                X.C19988013Io.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L81
                throw r5     // Catch: java.lang.Throwable -> L81
            L81:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                X.00Yq r2 = new X.00Yq
                r2.<init>(r0)
                X.C189200o6.m2constructorimpl(r2)
            L8d:
                X.13BV r1 = X.C13BV.INSTANCE
                boolean r0 = X.C189200o6.m7isFailureimpl(r2)
                if (r0 == 0) goto L96
                r2 = r1
            L96:
                java.util.List r2 = (java.util.List) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C19283010cG.LIZIZ():java.util.List");
        }

        @Override // X.InterfaceC1784430wXJ
        public final void LIZ(List<C1784480wXO> list) {
            try {
                C13IV c13iv = C19253410Ua.LIZ;
                c13iv.getClass();
                C10ZP.LIZJ("share_prop_cache_repo", "share_prop_cache_list", c13iv.LIZJ(new C19979613Fi(C1784480wXO.Companion.serializer()), list));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    };
    public static final C1784440wXK LIZJ = C1784440wXK.LIZ;

    public static Map LIZIZ(C1784480wXO c1784480wXO) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sp_root_d", c1784480wXO.LIZJ);
        String str = c1784480wXO.LJ;
        if (str != null) {
            linkedHashMap.put("sp_root_u", str);
        }
        String str2 = c1784480wXO.LJFF;
        if (str2 != null) {
            linkedHashMap.put("sp_root_od", str2);
        }
        String str3 = c1784480wXO.LJI;
        if (str3 != null) {
            linkedHashMap.put("sp_source_d", str3);
        }
        String str4 = c1784480wXO.LJII;
        if (str4 != null) {
            linkedHashMap.put("sp_source_od", str4);
        }
        String str5 = c1784480wXO.LJIIIIZZ;
        if (str5 != null) {
            linkedHashMap.put("sp_source_u", str5);
        }
        String str6 = c1784480wXO.LJIIIZ;
        if (str6 != null) {
            linkedHashMap.put("sp_source_w", str6);
        }
        linkedHashMap.put("sp_level", c1784480wXO.LIZLLL);
        String str7 = c1784480wXO.LJIIJ;
        if (str7 != null) {
            linkedHashMap.put("sp_root_share_link_id", str7);
        }
        return linkedHashMap;
    }

    public static C1784480wXO LIZ(int i, String str, String str2) {
        Object c098200Yq;
        Integer numLJIIJJI;
        Object obj = null;
        try {
            C018A.LIZ.getClass();
            Map mapLIZ = C018A.LIZ(str);
            if (!Intrinsics.LJFF(mapLIZ.get("utm_campaign"), "client_share")) {
                return null;
            }
            String str3 = (String) mapLIZ.get("sp_root_d");
            String str4 = (String) mapLIZ.get("sp_level");
            if (str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
                return null;
            }
            String str5 = (String) mapLIZ.get("u_code");
            if (str5 == null || ((numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null && numLJIIJJI.intValue() <= 0)) {
                str5 = null;
            }
            c098200Yq = new C1784480wXO(str2, i, str3, str4, (String) mapLIZ.get("sp_root_u"), (String) mapLIZ.get("sp_root_od"), (String) mapLIZ.get("_d"), (String) mapLIZ.get("_oid"), str5, (String) mapLIZ.get("sp_source_w"), (String) mapLIZ.get("sp_root_share_link_id"), C19267610Zm.LIZ.now().toEpochMilliseconds() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1784480wXO) obj;
    }

    public static void LIZJ(long j, String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("cold_start_load", str2);
        pairArr[2] = new Pair("duration", String.valueOf(C19267610Zm.LIZ.now().toEpochMilliseconds() - j));
        C20684815ws.LJIILLIIL("share_prop_duration", C2097608Jq.LJI(pairArr));
    }
}
