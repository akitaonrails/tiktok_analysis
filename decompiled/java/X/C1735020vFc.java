package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.common.model.AnchorIcon;
import com.ss.android.ugc.aweme.ecommerce.common.model.AnchorPrefix;
import com.ss.android.ugc.aweme.ecommerce.common.model.ProductEnterContext;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735020vFc {
    public static final C1735020vFc LIZ = new C1735020vFc();

    public static Map LIZJ(List list) {
        String strLJJLIIIJ;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((Map) it2.next()).keySet(), arrayList);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                Map map = (Map) obj;
                for (Object obj2 : setLLIIJI) {
                    if (linkedHashMap.get(obj2) == null) {
                        linkedHashMap.put(obj2, new ArrayList());
                    }
                    List list2 = (List) linkedHashMap.get(obj2);
                    if (list2 != null) {
                        Object obj3 = map.get(obj2);
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        list2.add(obj3);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            List<String> list3 = (List) entry.getValue();
            if (Intrinsics.LJFF(key2, "tool_extra_information")) {
                LIZ.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (String str : list3) {
                    if (str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (Intrinsics.LJFF(next, "user_tool_list")) {
                                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_tool_list");
                                    if (jSONArrayOptJSONArray != null) {
                                        int length = jSONArrayOptJSONArray.length();
                                        for (int i3 = 0; i3 < length; i3++) {
                                            String strOptString = jSONArrayOptJSONArray.optString(i3);
                                            if (strOptString == null || strOptString.length() == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (!z2) {
                                                arrayList3.add(strOptString);
                                            }
                                        }
                                    }
                                } else {
                                    String strOptString2 = jSONObject.optString(next);
                                    if (strOptString2 == null || strOptString2.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        Object arrayList4 = linkedHashMap4.get(next);
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                            linkedHashMap4.put(next, arrayList4);
                                        }
                                        ((List) arrayList4).add(strOptString2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), C13LP.LJJLIIIJ((Iterable) entry2.getValue(), ",", null, null, 0, null, null, 62));
                }
                linkedHashMap3.put("user_tool_list", arrayList3);
                strLJJLIIIJ = C1741890vQh.LJIIIIZZ(linkedHashMap3);
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, null, 62);
            }
            linkedHashMap2.put(key, strLJJLIIIJ);
        }
        return linkedHashMap2;
    }

    public static boolean LJ(View view) {
        if (!view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect(0, 0, view.getResources().getDisplayMetrics().widthPixels, view.getResources().getDisplayMetrics().heightPixels);
        if (!globalVisibleRect || !rect.intersect(rect2)) {
            return false;
        }
        return true;
    }

    public static int LJI(String str) {
        Object obj;
        String string;
        Type type;
        Integer num;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null && (obj = mapLJIIJ.get("anchor_prefix")) != null && (string = obj.toString()) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AnchorPrefix.class));
                } else {
                    type = new TypeToken<AnchorPrefix>() { // from class: X.0vFd
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
                if (!(objFromJson instanceof AnchorPrefix)) {
                    objFromJson = null;
                }
                AnchorPrefix anchorPrefix = (AnchorPrefix) objFromJson;
                if (anchorPrefix != null && (num = anchorPrefix.prefixType) != null) {
                    return num.intValue();
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }

    public static SpannableString LJIIJ(String str) {
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.p2(spannableString, new UnderlineSpan(), 0, str.length(), 33);
        return spannableString;
    }

    public static void LIZIZ(RecyclerView recyclerView, InterfaceC1631620sYq interfaceC1631620sYq) {
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (adapter != null && layoutManager != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View viewFindViewByPosition = layoutManager.findViewByPosition(i);
                if (viewFindViewByPosition != null) {
                    interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf(adapter.getItemViewType(i)), viewFindViewByPosition);
                }
            }
        }
    }

    public static int LJFF(int i, String str) {
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        String string;
        Type type;
        Integer num;
        int iIntValue;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null && (obj = mapLJIIJ.get("anchor_icon")) != null && (string = obj.toString()) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AnchorIcon.class));
                } else {
                    type = new TypeToken<AnchorIcon>() { // from class: X.0Neh
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
                if (!(objFromJson instanceof AnchorIcon)) {
                    objFromJson = null;
                }
                AnchorIcon anchorIcon = (AnchorIcon) objFromJson;
                if (anchorIcon != null && (num = anchorIcon.iconType) != null && (iIntValue = num.intValue()) != 99) {
                    return iIntValue;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public static void LIZ(C1735020vFc c1735020vFc, Context context, Function0 function0) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        c1735020vFc.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (!iAccountDependencyService.isLogin()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                iAccountDependencyService.showLoginAndRegisterView(activityLIZ, null, new AwS581S0100000_2(function0, (Function0<Unit>) 34), null);
                return;
            }
            return;
        }
        function0.invoke();
    }

    public static SpannableString LIZLLL(C1735020vFc c1735020vFc, String str, List list) {
        c1735020vFc.getClass();
        SpannableString spannableString = new SpannableString(str);
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
                while (iLJJJ != -1) {
                    int length = str2.length() + iLJJJ;
                    C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, length, 33);
                    iLJJJ = a0.LJJJ(str, str2, length, false, 4);
                }
            }
        }
        return spannableString;
    }

    public static String LJII(String str, Object obj, String str2) {
        Map linkedHashMap;
        if (str != null && str.length() != 0 && "trackParams".length() != 0 && str2.length() != 0) {
            Uri uri = UriProtector.parse(str);
            String strLIZ = C2011207uI.LIZ(uri, "trackParams");
            if (strLIZ == null || (linkedHashMap = C1741890vQh.LJIIJ(strLIZ)) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, obj);
            }
            return C2011207uI.LIZIZ(uri, "trackParams").buildUpon().appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)).toString();
        }
        return str;
    }

    public static String LJIIIIZZ(String str, String str2, Map map) {
        Map linkedHashMap;
        if (str != null && str.length() != 0 && str2.length() != 0 && !map.isEmpty()) {
            Uri uri = UriProtector.parse(str);
            String strLIZ = C2011207uI.LIZ(uri, str2);
            if (strLIZ == null || (linkedHashMap = C1741890vQh.LJIIJ(strLIZ)) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    linkedHashMap.put(key, value);
                }
            }
            return C2011207uI.LIZIZ(uri, str2).buildUpon().appendQueryParameter(str2, C1741890vQh.LJIIIIZZ(linkedHashMap)).toString();
        }
        return str;
    }

    public static String LJIIIZ(Long l, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (l != null) {
            l.longValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(l.toString(), new ProductEnterContext(2, str2));
            return UriProtector.parse(str).buildUpon().appendQueryParameter("product_enter_context", C1741890vQh.LJIIIIZZ(linkedHashMap)).build().toString();
        }
        return str;
    }
}
