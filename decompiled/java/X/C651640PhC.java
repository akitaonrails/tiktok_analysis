package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651640PhC {
    public static final C651640PhC LIZIZ = new C651640PhC();
    public static final HashMap<String, C0PLZ> LIZJ = new HashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(461));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(462));
    public static String LJFF = "";
    public static int LJI = -1;
    public final /* synthetic */ C651690PhH LIZ = new Object() { // from class: X.0PhH
    };

    public static Map LJI() {
        return (Map) LIZLLL.getValue();
    }

    public static void LIZLLL(ArrayList arrayList) {
        String str;
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                LIZIZ.getClass();
                Aweme aweme = (Aweme) LJI().get(obj);
                if (aweme != null) {
                    if (AwemeExtKt.isPhotoMode(aweme)) {
                        str = "article";
                    } else {
                        str = "video";
                    }
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_third_result_type", str);
                    AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_third_item_rank", String.valueOf(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final Aweme LJFF(String str) {
        if (str == null) {
            return null;
        }
        LIZIZ.getClass();
        return (Aweme) LJI().get(str);
    }

    public static final void LJII(List<? extends Aweme> list) {
        if (list != null) {
            for (Aweme aweme : list) {
                LIZIZ.getClass();
                LJI().put(aweme.getAid(), aweme);
            }
        }
    }

    public static final void LJIIIIZZ(List<? extends DynamicPatch.SearchMultiTabListData> list) {
        if (list != null) {
            Iterator<? extends DynamicPatch.SearchMultiTabListData> it2 = list.iterator();
            while (it2.hasNext()) {
                List<Aweme> list2 = it2.next().tabAwemeList;
                if (list2 != null) {
                    for (Aweme aweme : list2) {
                        LIZIZ.getClass();
                        LJI().put(aweme.getAid(), aweme);
                    }
                }
            }
        }
    }

    public static void LIZIZ(Aweme aweme, s sVar) {
        Object objLIZ;
        String str;
        Object objLIZ2;
        Object objLIZ3;
        String str2;
        String str3 = null;
        if (sVar != null) {
            objLIZ = C0DYC.LIZ(sVar, "*_search_lynx_context_token_type");
        } else {
            objLIZ = null;
        }
        if (objLIZ instanceof String) {
            str = (String) objLIZ;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (sVar != null) {
            objLIZ2 = C0DYC.LIZ(sVar, "*_search_lynx_context_search_result_id");
        } else {
            objLIZ2 = null;
        }
        if ((objLIZ2 instanceof String) && (str2 = (String) objLIZ2) != null) {
            str4 = str2;
        }
        if (sVar != null) {
            objLIZ3 = C0DYC.LIZ(sVar, "*_search_lynx_context_universal_rank");
        } else {
            objLIZ3 = null;
        }
        if (objLIZ3 instanceof String) {
            str3 = (String) objLIZ3;
        }
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", str);
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "search_result_id", str4);
        C643200PKs.LIZJ(aweme, str3);
        AwemeBizExtKt.setSearchFeedType(aweme, "SearchLynxVideo");
    }

    public static void LIZJ(Aweme aweme, C0DQP c0dqp) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = c0dqp.LJ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(key, string);
            }
        }
        AwemeBizExtKt.setSearchLynxLogParams(aweme, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.Integer r11, java.lang.String r12) {
        /*
            r10 = this;
            X.0PhH r0 = r10.LIZ
            r0.getClass()
            if (r12 == 0) goto Lad
            boolean r0 = kotlin.text.a0.LJJJIL(r12)
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto Lad
            if (r11 == 0) goto Lad
            int r0 = r11.intValue()
            r5 = 0
            if (r0 == 0) goto L1b
            if (r0 != r7) goto Lad
        L1b:
            int r8 = r11.intValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r12)
            r0 = 45
            r1.append(r0)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            X.0PhC r0 = X.C651640PhC.LIZIZ
            r0.getClass()
            java.util.Map r0 = LJI()
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r12)
            if (r0 != 0) goto L5e
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r6, r5)
            if (r0 == 0) goto L45
        L5e:
            r4.add(r2)
            goto L45
        L62:
            java.util.List r0 = X.C13LP.LLIIII(r4)
            java.util.Iterator r9 = r0.iterator()
        L6a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r1 = r9.next()
            X.0PhC r0 = X.C651640PhC.LIZIZ
            r0.getClass()
            java.util.Map r0 = LJI()
            java.lang.Object r1 = r0.get(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L6a
            int r0 = r1.getUserDigg()
            if (r0 == r8) goto L6a
            r1.setUserDigg(r8)
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r6 = r1.getStatistics()
            if (r6 == 0) goto L6a
            long r4 = r6.getDiggCount()
            r2 = 1
            if (r0 == r7) goto La5
            if (r8 != r7) goto La3
            long r4 = r4 + r2
        L9f:
            r6.setDiggCount(r4)
            goto L6a
        La3:
            if (r0 != r7) goto L9f
        La5:
            r0 = 0
            long r4 = r4 - r2
            long r4 = java.lang.Math.max(r0, r4)
            goto L9f
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C651640PhC.LJIIIZ(java.lang.Integer, java.lang.String):void");
    }

    public static void LIZ(Aweme aweme, C0DQP c0dqp, boolean z, boolean z2) {
        Object obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("itemKey", c0dqp.LIZ);
        pairArr[1] = new Pair("tabIndex", c0dqp.LIZIZ);
        pairArr[2] = new Pair("tabShowName", c0dqp.LIZJ);
        pairArr[3] = new Pair("tabCount", c0dqp.LIZLLL);
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("isFirstInTab", obj);
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[5] = new Pair("isLastInTab", str);
        AwemeBizExtKt.setIdentifier(aweme, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static C0DRV LJ(C19EG c19eg, String str, List list, Map map, C054000Hq c054000Hq) {
        C0DY4 c0dy4 = new C0DY4(list, C651830PhV.LIZLLL(str), map, c054000Hq);
        C1012040cRW.LIZIZ().LIZ = C640060P8q.LIZ.LIZ();
        return new C0DRV(c19eg, c0dy4);
    }
}
