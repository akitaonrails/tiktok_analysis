package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QP4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QP4 {
    public static final C0QP4 LIZ = new C0QP4();

    public static void LIZ(SearchResultParam searchResultParam) {
        C0QXN ecommerceNewUserModel;
        C0QXN ecommerceNewUserModel2;
        List arrayList;
        C0QXL.LIZ.getClass();
        Object obj = null;
        C0QXL.LJ(null, searchResultParam);
        if (C0QXL.LIZIZ) {
            String keyword = searchResultParam.getKeyword();
            if (keyword == null) {
                keyword = "";
            }
            String strLIZ = C0QXL.LIZ(keyword);
            ArrayList arrayList2 = (ArrayList) C0QXL.LJ;
            boolean z = !arrayList2.isEmpty();
            List<String> list = arrayList2;
            if (!z) {
                Map<String, Object> map = C0QXL.LIZJ;
                if (map != null) {
                    obj = map.get("activity_query_list");
                }
                try {
                    Object objLJIIIIZZ = C7740030o.LIZ().getGson().LJIIIIZZ(String.valueOf(obj), new TypeToken<List<String>>() { // from class: X.04Z4
                    }.getType());
                    arrayList = (List) objLJIIIIZZ;
                    if (arrayList == null) {
                        arrayList = C13BV.INSTANCE;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList = new ArrayList();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) C0QXL.LJ).add(C0QXL.LIZ((String) it2.next()));
                }
                list = C0QXL.LJ;
            }
            if (list.contains(strLIZ) && (ecommerceNewUserModel2 = searchResultParam.getEcommerceNewUserModel()) != null) {
                ecommerceNewUserModel2.setLandingToNewUserPage(true);
            }
            if (Intrinsics.LJFF(searchResultParam.getEnterMethod(), C0QXV.SOURCE_MIDDLE_PAGE_NEW_USER.getValue()) && (ecommerceNewUserModel = searchResultParam.getEcommerceNewUserModel()) != null) {
                ecommerceNewUserModel.setLandingToNewUserPage(true);
            }
        }
        C0QXN ecommerceNewUserModel3 = searchResultParam.getEcommerceNewUserModel();
        if (ecommerceNewUserModel3 != null && ecommerceNewUserModel3.landingToNewUserPage) {
            searchResultParam.setEcomTargetTab(EnumC669620QOi.SHOP);
            searchResultParam.setLandTap("shop");
        }
    }

    public static void LIZIZ(SearchResultParam searchResultParam) throws JSONException {
        C0QJ5 c0qj5LJIILJJIL;
        Activity activityLIZIZ;
        C19EG c19eg;
        Activity activityLIZIZ2;
        SearchResultParam searchResultParam2 = new SearchResultParam();
        searchResultParam2.setShouldRecordInHistory(0);
        searchResultParam2.setEnterMethod(searchResultParam.getEnterMethod());
        searchResultParam2.setKeyword(searchResultParam.getKeyword());
        searchResultParam2.setResultAttachCard(searchResultParam.getResultAttachCard());
        searchResultParam2.setNewUserExtraInfo(searchResultParam.getNewUserExtraInfo());
        SAFHelper.LIZ.getClass();
        String enterSearchFrom = null;
        Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
        if (activityLJIIIIZZ == null && C1205604ne.LIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
            } else {
                activityLIZIZ = null;
            }
            if (activityLIZIZ instanceof C19EG) {
                c19eg = (C19EG) activityLIZIZ;
            } else {
                c19eg = null;
            }
            if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJJI(c19eg)) {
                activityLJIIIIZZ = c19eg;
            }
        }
        Fragment fragmentLJIIIZ = SAFHelper.LJIIIZ();
        if (activityLJIIIIZZ != null && (activityLJIIIIZZ instanceof C19EG)) {
            ISearchMiddleForECService iSearchMiddleForECService = (ISearchMiddleForECService) ServiceManager.get().getService(ISearchMiddleForECService.class);
            C19EG c19eg2 = (C19EG) activityLJIIIIZZ;
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) C679340Qkm.LIZIZ(fragmentLJIIIZ, c19eg2).get(EcSearchIntermediateViewModelNew.class);
            if (iSearchMiddleForECService.LJJIIJZLJL(c19eg2)) {
                C0QJ6 c0qj6LJII = iSearchMiddleForECService.LJII(fragmentLJIIIZ, c19eg2);
                if (c0qj6LJII != null && c0qj6LJII.LIZ() == 0) {
                    return;
                }
                ecSearchIntermediateViewModelNew.wQ2().setValue(searchResultParam2);
                C0QJ6 c0qj6LJII2 = iSearchMiddleForECService.LJII(fragmentLJIIIZ, c19eg2);
                if (c0qj6LJII2 != null) {
                    c0qj6LJII2.LJFF(0);
                }
                InterfaceC664090Q3b interfaceC664090Q3bLJIL = iSearchMiddleForECService.LJIL(fragmentLJIIIZ, c19eg2);
                if (interfaceC664090Q3bLJIL != null) {
                    interfaceC664090Q3bLJIL.LIZ(0);
                }
                C0QJ6 c0qj6LJII3 = iSearchMiddleForECService.LJII(fragmentLJIIIZ, c19eg2);
                if ((c0qj6LJII3 == null || c0qj6LJII3.getInnerState() != 0) && (c0qj5LJIILJJIL = iSearchMiddleForECService.LJIILJJIL(fragmentLJIIIZ, c19eg2)) != null) {
                    c0qj5LJIILJJIL.LIZ(searchResultParam2);
                }
                C0QJ6 c0qj6LJII4 = iSearchMiddleForECService.LJII(fragmentLJIIIZ, c19eg2);
                if (c0qj6LJII4 == null) {
                    return;
                }
                c0qj6LJII4.LIZJ();
                return;
            }
            if (!(activityLJIIIIZZ instanceof EcSearchActivity)) {
                return;
            }
            C0QPB c0qpbLIZ = C669580QOe.LIZ(C1558360qeg.LJI(c19eg2, null));
            if (c0qpbLIZ != null) {
                c0qpbLIZ.LIZIZ(searchResultParam2, true);
            }
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = (ISearchSuggestContextAbilityNew) C1558520qew.LIZ(C1558360qeg.LJI(c19eg2, null), ISearchSuggestContextAbilityNew.class, null);
            if (iSearchSuggestContextAbilityNew != null) {
                iSearchSuggestContextAbilityNew.LLIILII(searchResultParam2);
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "middle_click");
            jSONObject.put("is_native_request", 1);
            jSONObject.put("enter_method", searchResultParam2.getEnterMethod());
            C0QER searchEnterParam = searchResultParam2.getSearchEnterParam();
            if (searchEnterParam != null) {
                enterSearchFrom = searchEnterParam.getEnterSearchFrom();
            }
            jSONObject.put("enter_from", enterSearchFrom);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject);
        }
    }
}
