package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QGO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGO {
    public static WeakReference<C649290PdP> LIZIZ;
    public static boolean LIZJ;
    public static volatile boolean LJI;
    public static boolean LJII;
    public static SparkContext LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C0QGO LIZ = new C0QGO();
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static final C01GW LJIIIIZZ = C1935507i5.LIZ(new C650510PfN());

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C667650QGt());
        LJIIJ = c01gwLIZIZ;
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.0QGl
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                C0QGO.LIZIZ = null;
            }
        });
        if (C272600AmI.LIZ() == 2 || C272600AmI.LIZ() == 3) {
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            C667610QGp c667610QGp = (C667610QGp) c01gwLIZIZ.getValue();
            c2188561Al4.getClass();
            C2188561Al4.LJII(c667610QGp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0QGh] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZ() {
        C01GW c01gw = C270830AjR.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 0) {
            LJ();
            return;
        }
        C1BX5 c1bx5 = C1BX5.LIZIZ;
        int i = C668150QIr.LIZ[c1bx5.LJIJJLI().ordinal()];
        if (i == 1) {
            if (((Number) c01gw.getValue()).intValue() == 2) {
                LJ();
            }
        } else if (i == 2) {
            c1bx5.LJIIIZ(new InterfaceC1539390qA5() { // from class: X.0QGh
                @Override // X.InterfaceC1539390qA5
                public final void LIZ() throws JSONException {
                    C0QGO.LIZ.getClass();
                    C0QGO.LJ();
                    C1BX5.LIZIZ.LJI(this);
                }
            });
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            LJ();
        }
    }

    public static Pair LJFF() {
        CharSequence charSequenceLJIIIIZZ;
        C649290PdP c649300PdQ;
        ViewGroup viewGroup;
        C649120Pd8 c649120Pd8;
        C1537720q7O c1537720q7O;
        C1537720q7O c1537720q7O2;
        SAFHelper.LIZ.getClass();
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
        boolean z = true;
        if (((Boolean) C270950Ajd.LIZ.getValue()).booleanValue()) {
            String string = C1550610qSB.LIZLLL(C1553670qX7.LIZ(), "fe_tiktok_lynx_search_transfer").toString();
            if (!TextUtils.isEmpty(string)) {
                if (LIZIZ != null && !TextUtils.isEmpty(LJFF) && !TextUtils.equals(string, LJFF)) {
                    String str = ((DynamicData) ListProtector.get(C646980PZg.LIZ(), 0)).dynamicPatch.schema;
                    LIZIZ = null;
                    if (str != null) {
                        C649310PdR.LIZ.getClass();
                        if (C649310PdR.LIZLLL().containsKey(str)) {
                            C649120Pd8 c649120Pd82 = (C649120Pd8) C649310PdR.LIZLLL().remove(str);
                            if (c649120Pd82 != null && (c1537720q7O2 = c649120Pd82.LIZIZ) != null) {
                                c1537720q7O2.LLD(true);
                            }
                        } else if (C649310PdR.LJ().containsKey(str) && (c649120Pd8 = (C649120Pd8) C649310PdR.LJ().remove(str)) != null && (c1537720q7O = c649120Pd8.LIZIZ) != null) {
                            c1537720q7O.LLD(true);
                        }
                        C1536910q65.LIZ.remove(C01CL.LIZ(str));
                    }
                }
                LJFF = string;
            }
        }
        if (activityLJIIIIZZ == null || (charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(activityLJIIIIZZ)) == null) {
            charSequenceLJIIIIZZ = "";
        }
        if ((TextUtils.equals(charSequenceLJIIIIZZ, "TikTok Theme Dark") || TextUtils.equals(LJ, "TikTok Theme Dark")) && !TextUtils.equals(charSequenceLJIIIIZZ, LJ)) {
            LIZIZ = null;
            LJ = charSequenceLJIIIIZZ.toString();
        }
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        WeakReference<C649290PdP> weakReference = LIZIZ;
        if (weakReference == null || weakReference.get() == null || C649470Pdh.LJJIFFI()) {
            z = false;
            c649300PdQ = new C649300PdQ(context, EnumC648990Pcv.SEARCH_MIDDLE, LJIIIZ);
        } else {
            WeakReference<C649290PdP> weakReference2 = LIZIZ;
            if (weakReference2 == null || (c649300PdQ = weakReference2.get()) == null) {
                return null;
            }
        }
        View viewLIZIZ = c649300PdQ.LIZIZ();
        ViewParent parent = viewLIZIZ != null ? viewLIZIZ.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        LIZIZ = new WeakReference<>(c649300PdQ);
        return new Pair(c649300PdQ, Boolean.valueOf(z));
    }

    public static String LIZIZ() throws JSONException {
        if (C1837507Hp.LIZ()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        C665010Q6p.LIZ.getClass();
        if (C665010Q6p.LIZ()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<SearchHistory> listLJIIL = C0QPJ.LJIJI(null).LJIIL(C0QPJ.LJIJJLI());
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory : listLJIIL) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("historyList", jSONArray);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSearchHistory cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C649190PdF.LIZ.getClass();
        if (C649190PdF.LIZ()) {
            LJII = true;
            Object objLIZ = C0QGS.LIZ();
            if (objLIZ != null) {
                jSONObject.put("isFromCache", true);
                jSONObject.put("guessSearchData", objLIZ);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static TemplateData LIZJ() throws JSONException {
        TemplateData templateDataLJIIIIZZ;
        if (!C1837507Hp.LIZ()) {
            return null;
        }
        C649190PdF.LIZ.getClass();
        if (C649190PdF.LIZ()) {
            LJII = true;
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(C0QGS.LIZJ() ? null : C0QGS.LIZIZ().getString("search_intermediate_recom_reponse", ""));
            templateDataLJIIIIZZ.LJIILIIL("isFromCache", Boolean.TRUE);
        } else {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ("");
        }
        C665010Q6p.LIZ.getClass();
        if (C665010Q6p.LIZ()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<SearchHistory> listLJIIL = C0QPJ.LJIJI(null).LJIIL(C0QPJ.LJIJJLI());
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory : listLJIIL) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject);
            }
            templateDataLJIIIIZZ.LJIILIIL("historyList", jSONArray.toString());
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSearchHistory cost:");
            sbLIZ.append(jCurrentTimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (ComplianceServiceProvider.LJI().P9()) {
            templateDataLJIIIIZZ.LJIILIIL("enable_manage_search_entry", 1);
        }
        templateDataLJIIIIZZ.LJIILIIL("enable_visual_search", Integer.valueOf(C673080Qag.LIZIZ() ? 1 : 0));
        return templateDataLJIIIIZZ;
    }

    public static void LJ() throws JSONException {
        String str = ((DynamicData) ListProtector.get(C646980PZg.LIZ(), 0)).dynamicPatch.schema;
        if (str != null) {
            LIZJ = true;
            C649350PdV c649350PdV = ((Boolean) LJIIIIZZ.getValue()).booleanValue() ? C649390PdZ.LIZIZ : null;
            C665010Q6p.LIZ.getClass();
            if (!C665010Q6p.LIZ()) {
                C649190PdF.LIZ.getClass();
                if (!C649190PdF.LIZ()) {
                    C1ECQ.LIZ.getClass();
                    if (!C1ECQ.LIZIZ()) {
                        C649270PdN c649270PdN = C649270PdN.LIZ;
                        C844470XAv.LIZ.getClass();
                        C649270PdN.LIZLLL(c649270PdN, C844470XAv.LIZ(), str, null, c649350PdV, null);
                        return;
                    } else {
                        C649310PdR c649310PdR = C649310PdR.LIZ;
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        c649310PdR.getClass();
                        C649310PdR.LJFF(contextLIZ, str, null, false, false, c649350PdV, null);
                        return;
                    }
                }
            }
            C1ECQ.LIZ.getClass();
            if (!C1ECQ.LIZIZ()) {
                C649270PdN c649270PdN2 = C649270PdN.LIZ;
                C844470XAv.LIZ.getClass();
                C649270PdN.LIZLLL(c649270PdN2, C844470XAv.LIZ(), str, LIZIZ(), c649350PdV, LIZJ());
                return;
            }
            C649310PdR c649310PdR2 = C649310PdR.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ2 = C844470XAv.LIZ();
            String strLIZIZ = LIZIZ();
            TemplateData templateDataLIZJ = LIZJ();
            c649310PdR2.getClass();
            C649310PdR.LJFF(contextLIZ2, str, strLIZIZ, false, false, c649350PdV, templateDataLIZJ);
        }
    }

    public static void LIZLLL(String str) {
        C844470XAv.LIZ.getClass();
        if (C2188561Al4.LJIIJ(C844470XAv.LIZ()) && ((C272600AmI.LIZ() == 1 || C272600AmI.LIZ() == 3) && Intrinsics.LJFF("feed", str))) {
            return;
        }
        C667590QGn.LIZ.getClass();
        if (C667590QGn.LIZ() || C649470Pdh.LJJIFFI()) {
            return;
        }
        if (((Boolean) LJIIIIZZ.getValue()).booleanValue()) {
            if (LJI) {
                return;
            } else {
                LJI = true;
            }
        }
        List listLIZ = C646980PZg.LIZ();
        if (listLIZ.isEmpty()) {
            return;
        }
        String str2 = ((DynamicData) ListProtector.get(listLIZ, 0)).dynamicPatch.schema;
        LIZLLL = str;
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "start_preload");
        c647890Pb9.LJIIZILJ("schema", str2);
        c647890Pb9.LJIJJ(str);
        c647890Pb9.LJIILJJIL();
        String str3 = HybridKitConfigTask.LL;
        if (!HybridKitConfigTask.LLILLL) {
            C647890Pb9 c647890Pb92 = new C647890Pb9();
            c647890Pb92.LJIIZILJ("type", "hybrid_kit_config_not_ready");
            c647890Pb92.LJIIZILJ("schema", str2);
            c647890Pb92.LJIJJ(str);
            c647890Pb92.LJIILJJIL();
            return;
        }
        if (C0IB2.LIZ()) {
            C2102208Lk.LIZ(null, AFwS196S0000000_10.get$arr$(425), 31);
            return;
        }
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "search_lynx_preload_opt", true, false)) {
            C0X35.LJ();
        }
        LIZ();
        LJI = false;
    }
}
