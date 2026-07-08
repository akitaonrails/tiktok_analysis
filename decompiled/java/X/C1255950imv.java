package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0imv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255950imv {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final InterfaceC324670Co5 LJII;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        sbLIZ.append("/aweme/v1/aweme/post/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/aweme/v1/aweme/favorite/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("/aweme/v1/aweme/listcollection/");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append("/tiktok/user/profile/search/item/v1");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str);
        sbLIZ5.append("/aweme/v1/private/aweme/");
        LJ = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str);
        sbLIZ6.append("/aweme/v1/post/locate/");
        LJFF = C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(str);
        sbLIZ7.append("/api/cameo/post/list");
        LJI = C2188811AlT.LIZIZ(sbLIZ7);
        LJII = (InterfaceC324670Co5) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str).create(InterfaceC324670Co5.class);
    }

    public static Map<String, String> LIZLLL(FeedItemList feedItemList) {
        HashMap map = new HashMap();
        if (feedItemList == null) {
            return map;
        }
        map.put("log_id", feedItemList.getRequestId());
        List<Aweme> items = feedItemList.getItems();
        if (items == null) {
            return map;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : items) {
            HashMap map2 = new HashMap();
            if (aweme != null && aweme.getAid() != null) {
                map2.put("user_digged", String.valueOf(aweme.getUserDigg()));
                map2.put("aweme_id", aweme.getAid());
                if (aweme.getStatistics() != null) {
                    map2.put("digg_count", String.valueOf(aweme.getStatistics().getDiggCount()));
                }
                arrayList.add(map2.toString());
            }
        }
        map.put("aweme_list", arrayList.toString());
        return map;
    }

    public static String LIZIZ(Aweme aweme, LinkData linkData) {
        if (linkData == null || aweme == null) {
            return "";
        }
        HashMap map = new HashMap();
        String str = linkData.creativeId;
        String str2 = linkData.logExtra;
        String aid = aweme.getAid();
        if (!TextUtils.isEmpty(str)) {
            map.put("creative_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("log_extra", str2);
        }
        C0XDN.LIZJ(map, true);
        LJII.LIZ(aid, aweme.getRequestId(), map).execute();
        return aid;
    }

    public static void LIZJ(String str, Map<String, String> map) {
        try {
            LJII.LIZ(str, null, map).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIZ(FeedItemList feedItemList, C846160XHi c846160XHi) {
        if (feedItemList == null) {
            return;
        }
        if (!TextUtils.isEmpty("X-TT-LOGID")) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((ArrayList) c846160XHi.LL).size(); i++) {
                InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) ListProtector.get(c846160XHi.LL, i);
                if (interfaceC846210XHn.getName().equalsIgnoreCase("X-TT-LOGID")) {
                    arrayList.add(interfaceC846210XHn);
                }
            }
            InterfaceC846210XHn[] interfaceC846210XHnArr = (InterfaceC846210XHn[]) arrayList.toArray(new InterfaceC846210XHn[arrayList.size()]);
            if (interfaceC846210XHnArr != null) {
                for (InterfaceC846210XHn interfaceC846210XHn2 : interfaceC846210XHnArr) {
                    if ("X-TT-LOGID".equalsIgnoreCase(interfaceC846210XHn2.getName())) {
                        feedItemList.setRequestId(interfaceC846210XHn2.getValue());
                        return;
                    }
                }
            }
        }
        LogPbBean logPbBean = feedItemList.logPb;
        if (logPbBean != null) {
            feedItemList.setRequestId(logPbBean.getImprId());
        }
    }

    public static String LIZ(Aweme aweme, int i, String str, int i2, int i3) {
        String strValueOf;
        String strValueOf2;
        String logExtra;
        if (aweme == null) {
            return "";
        }
        HashMap map = new HashMap();
        String aid = aweme.getAid();
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            strValueOf = "";
            strValueOf2 = "";
            logExtra = "";
        } else {
            strValueOf = String.valueOf(aweme.getAwemeRawAd().getAdId());
            strValueOf2 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            logExtra = aweme.getAwemeRawAd().getLogExtra();
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put("ad_id", strValueOf);
        }
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put("creative_id", strValueOf2);
        }
        if (!TextUtils.isEmpty("")) {
            map.put("ad_category", "");
        }
        if (!TextUtils.isEmpty(logExtra)) {
            map.put("log_extra", logExtra);
        }
        if (!TextUtils.isEmpty("")) {
            map.put("dislike_source", "");
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("commit_type", str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        map.put("channel_id", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i2);
        sbLIZ2.append("");
        map.put("source", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i3);
        sbLIZ3.append("");
        map.put("action", C2188811AlT.LIZIZ(sbLIZ3));
        C0XDN.LIZJ(map, true);
        LJII.LIZ(aid, aweme.getRequestId(), map).execute();
        return aid;
    }

    public static FeedItemList LJI(boolean z, String str, String str2, int i, long j, int i2, String str3, C846160XHi c846160XHi, boolean z2, String str4) {
        boolean zLJI = MethodIDManager.LJI(202165);
        FeedItemList feedItemListLJFF = LJFF(z, str, str2, i, j, i2, str3, 0, 0, null, c846160XHi, "", z2, str4, null, 0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return feedItemListLJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0XI4] */
    public static FeedItemList LJIIIIZZ(boolean z, String str, String str2, int i, long j, int i2, int i3, int i4, boolean z2, String str3) {
        int i5;
        FeedItemList feedItemList = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C846160XHi c846160XHi = new C846160XHi();
        ?? c0xi4 = new C0XI4(LIZIZ);
        c0xi4.LIZIZ(i3, "invalid_item_count");
        c0xi4.LIZIZ(i4, "is_hiding_invalid_item");
        c0xi4.LIZJ(j, "max_cursor");
        ?? r5 = str2;
        if (TextUtils.isEmpty(r5) && !TextUtils.isEmpty(str)) {
            c0xi4.LJ("user_id", str);
        }
        if (!TextUtils.isEmpty(r5)) {
            c0xi4.LJ("sec_user_id", r5);
        }
        String str4 = "count";
        c0xi4.LIZIZ(i2, "count");
        C0XIR c0xir = null;
        try {
            try {
                str4 = str3;
                r5 = z2;
                int i6 = C2187451AjH.LIZ;
                ?? LIZ2 = C2188811AlT.LIZ();
                LIZ2.append("sendRequest: isCache: ");
                LIZ2.append(z);
                LIZ2.append(" type: ");
                try {
                    LIZ2.append(i);
                    LIZ2.append(" maxCursor ");
                    LIZ2.append(j);
                    LIZ2.append(" isMyProfilePage: ");
                    LIZ2.append(r5);
                    LIZ2.append(" source: ");
                    LIZ2.append(str4);
                    C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(LIZ2));
                    C1260090itb c1260090itb = C1260090itb.LIZIZ;
                    boolean z3 = false;
                    if (z) {
                        i5 = 60;
                    } else {
                        i5 = 0;
                    }
                    String strLJFF = c0xi4.LJFF();
                    if (j <= 0) {
                        z3 = true;
                    }
                    feedItemList = null;
                    FeedItemList feedItemList2 = (FeedItemList) c1260090itb.apiExecuteGetJSONObject(i5, strLJFF, FeedItemList.class, null, c846160XHi, z3, null);
                    LJIIIZ(feedItemList2, c846160XHi);
                    C0O0T.LIZ(i, str, feedItemList2, r5, false, str4, null, i2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSuccess response: ");
                    sbLIZ.append(LIZLLL(feedItemList2));
                    C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(sbLIZ));
                    return feedItemList2;
                } catch (C0XIR e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    int i7 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onError: exception: ");
                    sbLIZ2.append(e.getMessage());
                    C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(sbLIZ2));
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c0xir = e;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                FeedItemList feedItemList3 = feedItemList;
                                C0O0T.LIZ(i, str, feedItemList3, r5, false, str4, c0xir, i2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                                int i8 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onSuccess response: ");
                                sbLIZ3.append(LIZLLL(feedItemList3));
                                C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(sbLIZ3));
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    FeedItemList feedItemList32 = feedItemList;
                    C0O0T.LIZ(i, str, feedItemList32, r5, false, str4, c0xir, i2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    int i82 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append("onSuccess response: ");
                    sbLIZ32.append(LIZLLL(feedItemList32));
                    C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(sbLIZ32));
                    throw th;
                }
            }
        } catch (C0XIR e2) {
            e = e2;
        } catch (Throwable th4) {
            th = th4;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                FeedItemList feedItemList322 = feedItemList;
                C0O0T.LIZ(i, str, feedItemList322, r5, false, str4, c0xir, i2, SystemClock.elapsedRealtime() - jElapsedRealtime);
                int i822 = C2187451AjH.LIZ;
                StringBuilder sbLIZ322 = C2188811AlT.LIZ();
                sbLIZ322.append("onSuccess response: ");
                sbLIZ322.append(LIZLLL(feedItemList322));
                C1720106oR.LJI("ProfileLikeApi", C2188811AlT.LIZIZ(sbLIZ322));
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(java.lang.String r11, java.lang.String r12, int r13, long r14, long r16, int r18, int r19, int r20, java.lang.Integer r21, boolean r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255950imv.LJ(java.lang.String, java.lang.String, int, long, long, int, int, int, java.lang.Integer, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String):java.lang.String");
    }

    public static FeedItemList LJFF(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4, Integer num, C846160XHi c846160XHi, String str4, boolean z2, String str5, String str6, int i5) {
        boolean zLJI = MethodIDManager.LJI(202165);
        FeedItemList feedItemListLJII = LJII(z, str, str2, i, -1L, j, i2, str3, i3, i4, num, c846160XHi, false, str4, z2, str5, str6, i5, false, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return feedItemListLJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122 A[PHI: r0
      0x0122: PHI (r0v68 java.lang.Integer) = (r0v34 java.lang.Integer), (r0v72 java.lang.Integer) binds: [B:66:0x01b4, B:49:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c A[PHI: r2
      0x020c: PHI (r2v9 ??) = (r2v18 ??), (r2v19 ??), (r2v20 ??), (r2v21 ??) binds: [B:70:0x01fe, B:72:0x0204, B:58:0x0195, B:60:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021d  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0XHi] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0XHi] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList] */
    /* JADX WARN: Type inference failed for: r42v1, types: [X.0itb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:109:0x02a4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJII(boolean r50, java.lang.String r51, java.lang.String r52, int r53, long r54, long r56, int r58, java.lang.String r59, int r60, int r61, java.lang.Integer r62, X.C846160XHi r63, boolean r64, java.lang.String r65, boolean r66, java.lang.String r67, java.lang.String r68, int r69, boolean r70, java.lang.String r71) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255950imv.LJII(boolean, java.lang.String, java.lang.String, int, long, long, int, java.lang.String, int, int, java.lang.Integer, X.0XHi, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
