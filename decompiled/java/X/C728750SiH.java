package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728750SiH {
    public static final C728750SiH LIZ = new C728750SiH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1537));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1536));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(486));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(488));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(487));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1538));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(489));

    public static LinkedHashMap LIZ() {
        return (LinkedHashMap) LIZLLL.getValue();
    }

    public static int LIZJ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static void LJIIIIZZ(Aweme aweme) {
        String strLIZ = C712440Rx4.LIZ(aweme);
        if (strLIZ == null) {
            return;
        }
        synchronized (LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) LIZ().get(strLIZ);
                if (c713190RyH == null) {
                    return;
                }
                int i = c713190RyH.LIZ;
                boolean z = true;
                if (i == 1) {
                    z = false;
                }
                if (z) {
                    C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C2143808aa(aweme, null), 3);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryRequestData --- NO,  return, key = ");
                sbLIZ.append(strLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C713190RyH LIZIZ(Aweme aweme, String str) {
        if (str == null && (str = C712440Rx4.LIZ(aweme)) == null) {
            return null;
        }
        synchronized (LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) LIZ().get(str);
                if (c713190RyH == null) {
                    return null;
                }
                int i = c713190RyH.LIZ;
                if (i != 2) {
                    return null;
                }
                return c713190RyH;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Aweme LIZLLL(Integer num, String str) {
        Aweme aweme;
        if (num == null) {
            return null;
        }
        synchronized (LIZ) {
            try {
                HashMap map = (HashMap) LJI.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(num);
                sbLIZ.append('-');
                sbLIZ.append(str);
                aweme = (Aweme) ((LinkedHashMap) LJII.getValue()).get((String) map.get(C2188811AlT.LIZIZ(sbLIZ)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aweme;
    }

    public static void LJIIIZ(Aweme aweme, Integer num) {
        if (num == null) {
            return;
        }
        synchronized (LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(num);
                sbLIZ.append('-');
                sbLIZ.append(AwemeExtKt.getAuthorUid(aweme));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Iterator it2 = ((HashMap) LJI.getValue()).entrySet().iterator();
                while (it2.hasNext()) {
                    if (!((LinkedHashMap) LJII.getValue()).containsKey(((Map.Entry) it2.next()).getValue())) {
                        it2.remove();
                    }
                }
                LIZ.getClass();
                C01GW c01gw = LJI;
                if (((HashMap) c01gw.getValue()).get(strLIZIZ) == null) {
                    ((HashMap) c01gw.getValue()).put(strLIZIZ, strLIZIZ);
                    ((LinkedHashMap) LJII.getValue()).put(strLIZIZ, aweme);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJ(int i, Aweme aweme, String str) {
        String aid;
        Aweme awemeLIZJ = C712440Rx4.LIZJ(aweme);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAndFetchInsertAweme, key = ");
        if (awemeLIZJ != null) {
            aid = awemeLIZJ.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", pos = ");
        sbLIZ.append(i);
        sbLIZ.append(", from = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        HashMap map = (HashMap) LJFF.getValue();
        String strLIZ = C712440Rx4.LIZ(awemeLIZJ);
        if (strLIZ == null) {
            strLIZ = "";
        }
        map.put(strLIZ, Boolean.TRUE);
        String strLIZ2 = C712440Rx4.LIZ(awemeLIZJ);
        if (strLIZ2 != null) {
            synchronized (LIZ) {
                try {
                    if (!LIZ().containsKey(strLIZ2)) {
                        LIZ().put(strLIZ2, new C713190RyH(null));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJIIIIZZ(awemeLIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.0SiH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.feed.model.Aweme r25, boolean r26, java.lang.String r27, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r28, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r29) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C728750SiH.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[PHI: r12
      0x007b: PHI (r12v2 java.lang.Boolean) = (r12v1 java.lang.Boolean), (r12v4 java.lang.Boolean), (r12v4 java.lang.Boolean) binds: [B:28:0x0089, B:22:0x0075, B:24:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.feed.model.Aweme r25, java.lang.String r26, boolean r27, java.lang.String r28, com.ss.android.ugc.aweme.story.inbox.InsertStory r29, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r30, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r31) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C728750SiH.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.story.inbox.InsertStory, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public static AbstractC316870CbV LJFF(Aweme aweme, String str, List list, Boolean bool, boolean z, String str2, Function2 function2, String str3) {
        Integer numValueOf;
        List listLIZLLL;
        List listLIZLLL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFetchSkylightDataSuccess end, key = ");
        sbLIZ.append(str);
        sbLIZ.append(", size = ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("，hasMore = ");
        sbLIZ.append(bool);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIJJI(aweme, str, 2, Boolean.valueOf(z), bool, str2, list, str3);
        if (function2 != null) {
            function2.invoke(str, str2);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            if (list != null) {
                listLIZLLL2 = C712440Rx4.LIZLLL(list);
            } else {
                listLIZLLL2 = C13BV.INSTANCE;
            }
            return C317290CcB.LJ(c317290CcB, null, str2, listLIZLLL2, 1);
        }
        C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
        if (list != null) {
            listLIZLLL = C712440Rx4.LIZLLL(list);
        } else {
            listLIZLLL = C13BV.INSTANCE;
        }
        c317290CcB2.getClass();
        return new C316640Cb8(listLIZLLL);
    }

    public static void LJIIJJI(Aweme aweme, String str, int i, Boolean bool, Boolean bool2, String str2, List list, String str3) {
        if (str == null && (str = C712440Rx4.LIZ(aweme)) == null) {
            return;
        }
        synchronized (LIZ) {
            try {
                C713190RyH c713190RyH = (C713190RyH) LIZ().get(str);
                if (c713190RyH == null) {
                    return;
                }
                if (c713190RyH.LIZ != 2 || (i != 1 && i != 3)) {
                    c713190RyH.LIZ = i;
                    if (bool != null && bool2 != null && list != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        c713190RyH.LIZJ = bool2.booleanValue();
                        c713190RyH.LIZIZ = str2;
                        c713190RyH.LJ = str3;
                        if (zBooleanValue) {
                            c713190RyH.LIZLLL = C712440Rx4.LIZLLL(list);
                        } else {
                            c713190RyH.LIZLLL.addAll(C712440Rx4.LIZLLL(list));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.feed.model.Aweme r25, java.lang.String r26, boolean r27, java.lang.String r28, com.ss.android.ugc.aweme.story.inbox.InsertStory r29, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r30, java.lang.String r31, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r32) {
        /*
            r24 = this;
            r8 = r32
            r0 = r26
            r3 = r25
            r1 = r30
            r2 = r27
            boolean r4 = r8 instanceof X.C728770SiJ
            if (r4 == 0) goto La3
            r6 = r8
            X.0SiJ r6 = (X.C728770SiJ) r6
            int r7 = r6.LLIZ
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r7 & r5
            if (r4 == 0) goto La3
            int r7 = r7 - r5
            r6.LLIZ = r7
        L1c:
            java.lang.Object r8 = r6.LLILZIL
            java.lang.Object r5 = X.C099R.LJFF()
            int r4 = r6.LLIZ
            r7 = 1
            if (r4 == 0) goto L59
            if (r4 != r7) goto Lac
            boolean r2 = r6.LLILZ
            kotlin.jvm.functions.Function2 r1 = r6.LLILLL
            java.lang.Object r0 = r6.LLILLJJLI
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.LL
            X.C155000ia.LIZIZ(r8)
        L36:
            com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse r8 = (com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse) r8
            java.util.List r6 = r8.getAwemes()
            boolean r4 = r8.getHasMore()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            long r4 = r8.getCursor()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r11 = r8.getPageControlToken()
            r10 = r1
            r4 = r3
            r5 = r0
            r8 = r2
            X.0CbV r0 = LJFF(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L59:
            X.C155000ia.LIZIZ(r8)
            if (r29 == 0) goto La1
            java.lang.String r12 = X.C728840SiQ.LIZ(r29)
        L62:
            X.0O9j r4 = X.C614770O9j.LIZIZ
            com.ss.android.ugc.aweme.service.IFeedSkylightCommonService r8 = r4.LJ()
            if (r2 != 0) goto L9e
            java.lang.Long r4 = X.C2095008Iq.LJIILIIL(r28)
            if (r4 == 0) goto L9e
            long r9 = r4.longValue()
        L74:
            X.0reG r13 = X.EnumC1596540reG.GUIDE_CARD
            r11 = 0
            r6.LL = r3
            r6.LLILLJJLI = r0
            r6.LLILLL = r1
            r6.LLILZ = r2
            r6.LLIZ = r7
            r14 = 0
            X.0rHr r4 = X.EnumC1582650rHr.DEFAULT
            int r18 = r4.getType()
            r22 = r31
            r15 = r14
            r16 = r11
            r17 = r14
            r19 = r11
            r20 = r11
            r21 = r11
            r23 = r6
            java.lang.Object r8 = r8.LJJJ(r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r8 != r5) goto L36
            return r5
        L9e:
            r9 = 0
            goto L74
        La1:
            r12 = 0
            goto L62
        La3:
            X.0SiJ r6 = new X.0SiJ
            r4 = r24
            r6.<init>(r4, r8)
            goto L1c
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C728750SiH.LJII(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.story.inbox.InsertStory, kotlin.jvm.functions.Function2, java.lang.String, X.05Vn):java.lang.Object");
    }
}
