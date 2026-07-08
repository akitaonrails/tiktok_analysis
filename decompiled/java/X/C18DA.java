package X;

import android.app.Activity;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.page.unknown.UnionBufferBtm;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DA implements InterfaceC20146913sJ {
    public static final C18DA LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final LazyNullable LIZJ;
    public static final C01GW LIZLLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C18DA.class, "callback", "getCallback()Lcom/bytedance/android/btm/impl/pageshow/PageShowCallback;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C18DA();
        LIZJ = LazyKt.INSTANCE.lazyNullable(new C21243618Bm());
        LIZLLL = C452501pT.LIZIZ(new C18DD());
    }

    public static void LIZIZ(String str) {
        String str2;
        C18G6 c18g6 = (C18G6) LIZLLL.getValue();
        if (c18g6 != null) {
            LIZ.getClass();
            if (Intrinsics.LJFF(str, "crash")) {
                str2 = "key_btm_page_show_crash";
            } else {
                str2 = "key_btm_page_show_kill";
            }
            c18g6.LIZIZ.remove(str2);
            c18g6.LIZIZ.apply();
            C18CK.LJIIJ("cleanBtmPageShowCache", new C1700200uLS(str), false);
        }
    }

    public static JSONObject LJ(PageInfo pageInfo) throws JSONException {
        String str;
        String schema;
        String str2;
        JSONObject jSONObject = new JSONObject();
        String pageBtm = pageInfo.getPageBtm();
        Regex regex = C18C3.LIZ;
        String strLJ = C18C3.LJ(pageInfo.getBtmPre());
        BtmServiceImpl btmServiceImpl = BtmServiceImpl.INSTANCE;
        String strLJ2 = C18C3.LJ(btmServiceImpl.getChainRecorderExp().LIZIZ(pageInfo.getBtmPre()));
        if (pageBtm != null) {
            jSONObject.putOpt("btm", pageBtm);
        }
        if (strLJ != null) {
            jSONObject.putOpt("btm_pre", strLJ);
            C21246818Cs c21246818CsLJFF = C21248618Dk.LIZ.LJFF(pageInfo.getBtmPre());
            if (c21246818CsLJFF != null) {
                str2 = c21246818CsLJFF.LIZ;
            } else {
                str2 = null;
            }
            jSONObject.putOpt("btm_pre_show_id", str2);
        }
        if (strLJ2 != null) {
            jSONObject.putOpt("btm_ppre", strLJ2);
        }
        jSONObject.putOpt("step", Integer.valueOf(pageInfo.getStep()));
        jSONObject.putOpt("launch_id", btmServiceImpl.getLaunchIdExp());
        jSONObject.putOpt("btm_show_id", pageInfo.getPageShowId());
        if (C18CS.LIZ.LIZLLL().LJIJJ() != 1) {
            jSONObject.putOpt("btm_instance_id", pageInfo.getInstanceId());
        }
        jSONObject.putOpt(Scene.SCENE_SERVICE, pageInfo.getScene());
        jSONObject.putOpt("enter_time", Long.valueOf(pageInfo.getEnterTime()));
        jSONObject.putOpt("btm_sdk_version", "2.0.0");
        if (Intrinsics.LJFF(pageInfo.getFirstShow(), Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("first_show", str);
        LIZ.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("recovery_from", pageInfo.getRecoveryFrom());
        jSONObject2.putOpt("unknown_token", pageInfo.getUnknownSourceBtmToken());
        if (pageInfo.getIgnoreFirstResumeFlag() != 0) {
            jSONObject2.put("ignore_first_resume_error", pageInfo.getIgnoreFirstResumeFlag());
        }
        if (pageInfo.isFirstPage()) {
            jSONObject2.putOpt("launch_intent_extra", C18DC.LIZJ);
            jSONObject2.putOpt("launch_intent_data", C18DC.LIZLLL);
        }
        jSONObject.put("debug_params", jSONObject2);
        jSONObject.putOpt("bcm_gecko_version", C18A2.LIZIZ);
        jSONObject.putOpt("setting_version", C18CS.LIZ.LJFF());
        int[] iArr = C21244618Bw.LIZ;
        jSONObject.putOpt("libra_version", String.valueOf(C21244618Bw.LIZIZ.getVersion()));
        String unionPre = pageInfo.getUnionPre();
        String strLIZLLL = C18C3.LIZLLL(unionPre);
        if (C18CS.LIZ.LIZJ().LJIILJJIL() == 1) {
            C18DN c18dnLIZIZ = C18DP.LIZIZ(unionPre);
            if (c18dnLIZIZ != null) {
                schema = c18dnLIZIZ.getSchema();
            } else {
                schema = null;
            }
        } else {
            schema = "";
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z = false;
            if (strLIZLLL == null) {
                break;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("class", strLIZLLL);
                if (schema == null || schema.length() == 0) {
                    z = true;
                }
                if (!z && C18CS.LIZ.LIZJ().LJIILJJIL() == 1) {
                    jSONObject3.put("schema", schema);
                }
                C189200o6.m2constructorimpl(Boolean.valueOf(arrayList.add(jSONObject3)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && unionPre != null) {
                String str3 = C1287110jbB.LIZIZ.get(unionPre);
                if (str3 == null) {
                    str3 = C1287110jbB.LIZJ.get(unionPre);
                }
                unionPre = str3;
            } else {
                unionPre = null;
            }
            strLIZLLL = C18C3.LIZLLL(unionPre);
            if (C18CS.LIZ.LIZJ().LJIILJJIL() == 1) {
                C18DN c18dnLIZIZ2 = C18DP.LIZIZ(unionPre);
                if (c18dnLIZIZ2 != null) {
                    schema = c18dnLIZIZ2.getSchema();
                } else {
                    schema = null;
                }
            }
        }
        if (arrayList.size() > 0) {
            jSONObject.putOpt("from_unknown", 1);
            JSONArray jSONArray = new JSONArray();
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                jSONArray.put(ListProtector.get(arrayList, size));
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.putOpt("page_count", Integer.valueOf(arrayList.size()));
            jSONObject4.putOpt("pages_name", jSONArray);
            jSONObject.putOpt("from_unknown_info", jSONObject4);
        } else {
            jSONObject.putOpt("from_unknown", 0);
        }
        UnionBufferBtm earlierUnionBuffer = pageInfo.getEarlierUnionBuffer();
        if (earlierUnionBuffer != null && earlierUnionBuffer.getUnionStep() > pageInfo.getUnionStep()) {
            Regex regex2 = C18C3.LIZ;
            String strLIZLLL2 = C18C3.LIZLLL(earlierUnionBuffer.getBtm());
            if (strLIZLLL2 != null) {
                jSONObject.putOpt("from_unknown_back", 1);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.putOpt("pages_name", new JSONArray().put(strLIZLLL2));
                jSONObject.putOpt("from_unknown_back_info", jSONObject5);
            }
        }
        return jSONObject;
    }

    public static void LJII(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        C18G6 c18g6 = (C18G6) LIZLLL.getValue();
        if (c18g6 != null) {
            LIZ.getClass();
            if (Intrinsics.LJFF(str, "crash")) {
                str2 = "key_btm_page_show_crash";
            } else {
                str2 = "key_btm_page_show_kill";
            }
            String str3 = "{}";
            String strLIZIZ = c18g6.LIZIZ(str2, "{}");
            if (strLIZIZ != null) {
                str3 = strLIZIZ;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                if (jSONObject.has("list")) {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "list");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add((JSONObject) jSONArray.get(i));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scene: ");
                sbLIZ.append(str);
                C18CE.LIZ.LJFF(1109, C2188811AlT.LIZIZ(sbLIZ), null, e, false);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJIIJ((JSONObject) it2.next());
        }
        C18CK.LJIIJ("sendBtmPageShowCacheSync", new C1700190uLR(arrayList), false);
    }

    public static void LJIIJ(JSONObject jSONObject) {
        C18CK.LJ("pageShow", new C20331614h0(jSONObject));
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.btmPageShow, "btm_page_show");
        if (featureModelLIZJ.btmPageShow.LIZ() == 0) {
            return;
        }
        BtmServiceImpl.INSTANCE.getAppLogExp().onEventV3(new C1523880pl4("btm_page_show", jSONObject));
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        ((Boolean) C18IP.LJIILLIIL.getValue(c18ip, C18IP.LIZIZ[13])).booleanValue();
    }

    @Override // X.InterfaceC20146913sJ
    public final void LIZ(Activity activity) {
        C18CK.LJIIJ("onAppForeground", new C18DF(activity.getClass().getName()), false);
        if (C18CS.LIZ.LIZLLL().LJII() == 1) {
            LIZIZ("kill");
        }
    }

    @Override // X.InterfaceC20146913sJ
    public final void onAppBackground(Activity activity) throws JSONException {
        C21247918Dd c21247918Dd;
        PageInfo pageInfo;
        int iIntValue;
        C18CK.LJIIJ("onAppBackground", new C18DE(activity.getClass().getName()), false);
        if (C18CS.LIZ.LIZLLL().LJII() == 1 && (c21247918Dd = C18E3.LJII) != null && (pageInfo = c21247918Dd.LIZIZ) != null && !c21247918Dd.LIZLLL) {
            BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
            bugfixModelLIZIZ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_last_page_show", Integer.valueOf(bugfixModelLIZIZ.fixLastPageShow));
            if (!(objLIZIZ instanceof Integer)) {
                objLIZIZ = null;
            }
            Integer num = (Integer) objLIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = bugfixModelLIZIZ.fixLastPageShow;
            }
            bugfixModelLIZIZ.fixLastPageShow = iIntValue;
            if (iIntValue == 1) {
                C18DA c18da = LIZ;
                PageInfo pageInfoCopy = pageInfo.copy();
                c18da.getClass();
                LJFF(pageInfoCopy, "kill", true);
                return;
            }
            C18DA c18da2 = LIZ;
            final PageInfo pageInfoCopy2 = pageInfo.copy();
            c18da2.getClass();
            C18GU.LIZ.LIZ(new Runnable() { // from class: X.14gx
                public final /* synthetic */ String LLILLJJLI = "kill";

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    PageInfo pageInfo2 = pageInfoCopy2;
                    String str = this.LLILLJJLI;
                    C1C7U.LIZ("PageShowLog@a20a.saveBtmPageShowToCacheAsync$1L");
                    C18DA.LIZ.getClass();
                    C18DA.LJFF(pageInfo2, str, false);
                    C1C7U.LIZIZ("PageShowLog@a20a.saveBtmPageShowToCacheAsync$1L");
                }
            }, false);
        }
    }

    public static void LJIIIIZZ(final PageInfo pageInfo, final boolean z) {
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm != null && pageBtm.length() != 0) {
            C18GU.LIZ.LIZ(new Runnable() { // from class: X.14gz
                @Override // java.lang.Runnable
                public final void run() {
                    PageInfo pageInfo2 = pageInfo;
                    boolean z2 = z;
                    C1C7U.LIZ("PageShowLog@a20a.sendCore$1L");
                    C18DA.LJIIJ(C18DA.LIZ.LIZLLL(pageInfo2, z2));
                    C1C7U.LIZIZ("PageShowLog@a20a.sendCore$1L");
                }
            }, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZLLL(com.bytedance.android.btm.impl.page.model.PageInfo r18, boolean r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18DA.LIZLLL(com.bytedance.android.btm.impl.page.model.PageInfo, boolean):org.json.JSONObject");
    }

    public static String LIZJ(C18DA c18da, PageInfo pageInfo, JSONObject jSONObject) {
        c18da.getClass();
        C21248618Dk.LIZ.getClass();
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(C21248618Dk.LJII(pageInfo));
        try {
            jSONObject.put("pageInfo", pageInfo.toString());
            if (c18e9LIZIZ != null) {
                jSONObject.put("pageTree", c18e9LIZIZ.toString());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static void LJFF(PageInfo pageInfo, String str, boolean z) throws JSONException {
        String str2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm != null && pageBtm.length() != 0 && !a0.LJJIIZI(pageInfo.getPageBtm(), ".b0.", false)) {
            C18G6 c18g6 = (C18G6) LIZLLL.getValue();
            if (c18g6 != null) {
                pageInfo.setScene(str);
                JSONObject jSONObjectLIZLLL = LIZ.LIZLLL(pageInfo, false);
                if (Intrinsics.LJFF(str, "crash")) {
                    str2 = "key_btm_page_show_crash";
                } else {
                    str2 = "key_btm_page_show_kill";
                }
                String str3 = "{}";
                String strLIZIZ = c18g6.LIZIZ(str2, "{}");
                if (strLIZIZ != null) {
                    str3 = strLIZIZ;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject = new JSONObject(str3);
                    try {
                        if (jSONObject.has("list")) {
                            jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "list");
                        } else {
                            jSONArray = new JSONArray();
                            jSONObject.put("list", jSONArray);
                        }
                        jSONArray.put(jSONObjectLIZLLL);
                    } catch (Exception e) {
                        e = e;
                        jSONObject2 = jSONObject;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("scene: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", params: ");
                        sbLIZ.append(jSONObjectLIZLLL);
                        C18CE.LIZ.LJFF(1111, C2188811AlT.LIZIZ(sbLIZ), null, e, z);
                        jSONObject = jSONObject2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                if (z) {
                    c18g6.LIZ(str2, C786410Ut5.J3(jSONObject));
                } else {
                    c18g6.LIZJ(str2, C786410Ut5.J3(jSONObject));
                }
                C18CK.LJIIJ("saveBtmPageShowToCache", new C20331214gw(jSONObjectLIZLLL), z);
                return;
            }
            return;
        }
        C21248618Dk.LIZ.getClass();
        C18CE.LJII(C18CE.LIZ, 2301, "saveBtmPageShowToCache", C21248618Dk.LJII(pageInfo), pageInfo, true, false, null, z, null, null, 864);
    }

    public static final void LJIIIZ(PageInfo pageInfo, C21247918Dd c21247918Dd, boolean z) {
        if (C18CK.LIZJ) {
            C18CK.LJIIJ("sendEventOnPaused", new C20331814h2(pageInfo.copy(), z), false);
        }
        LJI(pageInfo, z, null, null);
        pageInfo.resetDataAfterPageShow();
        if (c21247918Dd != null) {
            c21247918Dd.LIZLLL = true;
        }
    }

    public static void LJI(PageInfo pageInfo, boolean z, EnumC21250718Ef enumC21250718Ef, String str) {
        String pageId;
        int step;
        boolean z2;
        boolean zBooleanValue;
        PageInfo pageInfoCopy = pageInfo.copy();
        C18CK.LJIIJ("send", new C20331914h3(pageInfoCopy, z, enumC21250718Ef, str), false);
        if (!pageInfo.getHasSendEnterPage()) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "reissued_enter_page_when_page_show", Boolean.valueOf(featureModelLIZJ.reissuedEnterPageWhenPageShow));
            if (!(objLIZIZ instanceof Boolean)) {
                objLIZIZ = null;
            }
            Boolean bool = (Boolean) objLIZIZ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = featureModelLIZJ.reissuedEnterPageWhenPageShow;
            }
            featureModelLIZJ.reissuedEnterPageWhenPageShow = zBooleanValue;
            if (zBooleanValue) {
                boolean zContainsKey = C204700157y.LIZ.containsKey(pageInfo.getPageShowId());
                C18CK.LJIIJ("EventDoubleChecker_onSendPageShow", new C20330814gs(pageInfo, zContainsKey), false);
                if (C18CS.LIZ.LIZIZ().LJIIIIZZ() <= 0 || !zContainsKey) {
                    C18DB.LIZ(enumC21250718Ef, pageInfo);
                }
            }
        }
        if (C18CS.LIZ.LIZIZ().LJIIIIZZ() != 0) {
            ConcurrentHashMap<String, PageInfo> concurrentHashMap = C204700157y.LIZ;
            concurrentHashMap.remove(pageInfo.getPageShowId());
            for (Map.Entry<String, PageInfo> entry : concurrentHashMap.entrySet()) {
                if (!Intrinsics.LJFF(entry.getValue().getPageId(), str)) {
                    C21248618Dk c21248618Dk = C21248618Dk.LIZ;
                    Object objLIZ = C18CJ.LIZ();
                    c21248618Dk.getClass();
                    PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
                    if (pageInfoLJIIIIZZ != null) {
                        pageId = pageInfoLJIIIIZZ.getPageId();
                    } else {
                        pageId = null;
                    }
                    if (!Intrinsics.LJFF(pageId, entry.getValue().getPageId())) {
                        if (pageInfoLJIIIIZZ != null) {
                            step = pageInfoLJIIIIZZ.getStep();
                        } else {
                            step = pageInfo.getStep();
                        }
                        if (step < entry.getValue().getStep()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C18CK.LJIIJ("EventDoubleChecker_onSendPageShow", new C1280504zj(entry), false);
                        C18DA c18da = LIZ;
                        PageInfo value = entry.getValue();
                        c18da.getClass();
                        LJIIIIZZ(value, z2);
                        Iterator<T> it2 = C21248618Dk.LIZLLL.values().iterator();
                        while (it2.hasNext()) {
                            PageInfo pageInfoCurrent = ((PageInfoStack) it2.next()).current();
                            if (Intrinsics.LJFF(pageInfoCurrent.getPageId(), entry.getValue().getPageId()) && Intrinsics.LJFF(pageInfoCurrent.getPageShowId(), entry.getKey())) {
                                pageInfoCurrent.resetDataAfterPageShow();
                            }
                        }
                    }
                }
            }
            C204700157y.LIZ.clear();
        }
        LJIIIIZZ(pageInfoCopy, z);
    }
}
