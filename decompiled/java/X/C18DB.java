package X;

import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final EnumC21250718Ef enumC21250718Ef, PageInfo pageInfo) {
        C18CK.LIZJ("EnterPageLog_show", new C20333514hJ(enumC21250718Ef, pageInfo), false);
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm != null && pageBtm.length() != 0) {
            if (pageInfo.getHasSendEnterPage()) {
                C18CK.LIZJ("EnterPageLog_show", new C18DL(), false);
                return;
            }
            pageInfo.setHasSendEnterPage(true);
            final PageInfo pageInfoCopy = pageInfo.copy();
            if (C18CS.LIZ.LIZIZ().LJIIIIZZ() == 2) {
                C204700157y.LIZ.put(pageInfoCopy.getPageShowId(), pageInfoCopy);
            }
            if (C18CS.LIZ.LIZIZ().LJIIIIZZ() == 1) {
                C204700157y.LIZ.put(pageInfoCopy.getPageShowId(), pageInfoCopy);
            }
            C18GU.LIZ.LIZ(new Runnable() { // from class: X.18DG
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    PageInfo pageInfo2 = pageInfoCopy;
                    EnumC21250718Ef enumC21250718Ef2 = enumC21250718Ef;
                    C1C7U.LIZ("EnterPageLog@ac21.sendEnterPageEvent$1L");
                    C18DA.LIZ.getClass();
                    JSONObject jSONObjectLJ = C18DA.LJ(pageInfo2);
                    jSONObjectLJ.putOpt("type", Intrinsics.LJFF(pageInfo2.getFirstShow(), Boolean.TRUE) ? enumC21250718Ef2 == EnumC21250718Ef.HybridRegister ? "h5_init" : "init" : "default");
                    C18CK.LJ("enterPage", new C18DH(jSONObjectLJ));
                    FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
                    featureModelLIZJ.getClass();
                    Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "remove_enter_page", Integer.valueOf(featureModelLIZJ.removeEnterPage));
                    JSONArray jSONArray = null;
                    if (!(objLIZIZ instanceof Integer)) {
                        objLIZIZ = null;
                    }
                    Integer num = (Integer) objLIZIZ;
                    int iIntValue = num != null ? num.intValue() : featureModelLIZJ.removeEnterPage;
                    featureModelLIZJ.removeEnterPage = iIntValue;
                    if (iIntValue == 0) {
                        BtmServiceImpl.INSTANCE.getAppLogExp().onEventV3(new C1523880pl4("btm_enter_page", jSONObjectLJ));
                    }
                    try {
                        if (jSONObjectLJ.optInt("first_show") == 1) {
                            int iOptInt = jSONObjectLJ.optInt("from_unknown");
                            JSONObject jSONObjectOptJSONObject = jSONObjectLJ.optJSONObject("from_unknown_info");
                            C18EC.LIZLLL(pageInfo2, iOptInt, jSONArray, (jSONObjectOptJSONObject == null || (jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObjectOptJSONObject, "pages_name")) == null) ? 0 : jSONArray.length());
                            C18EC.LIZJ(pageInfo2, iOptInt, jSONArray);
                            C18EC.LIZIZ(pageInfo2, iOptInt, jSONArray);
                            C18EC.LIZ(pageInfo2, iOptInt, jSONArray);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C1C7U.LIZIZ("EnterPageLog@ac21.sendEnterPageEvent$1L");
                }
            }, false);
        }
    }
}
