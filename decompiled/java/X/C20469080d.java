package X;

import Y.AComparatorS22S0000000_3;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.account.login.model.PhoneCountryCodeResponse;
import com.ss.android.ugc.aweme.account.login.model.PhoneCountryData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.080d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20469080d {
    public static void LIZ() {
        PhoneCountryCodeResponse phoneCountryCodeResponse;
        HashMap<String, List<PhoneCountryData>> map = C1862307Rd.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            if (((HashMap) SettingsManager.LJII("choose_phone_country_list", HashMap.class)) != null) {
                try {
                    if (C1862307Rd.LIZ.isEmpty()) {
                        SettingsManager.LIZLLL().getClass();
                        HashMap map2 = (HashMap) SettingsManager.LJII("choose_phone_country_list", HashMap.class);
                        if (map2 != null) {
                            for (String str : map2.keySet()) {
                                List list = (List) map2.get(str);
                                if (list != null) {
                                    Gson gson = C1862307Rd.LIZIZ;
                                    C1862307Rd.LIZ.put(str, (List) gson.LJIIIIZZ(gson.LJIILL(list), new TypeToken<List<? extends PhoneCountryData>>() { // from class: X.080e
                                    }.getType()));
                                }
                            }
                        }
                    }
                    phoneCountryCodeResponse = new PhoneCountryCodeResponse(C1862307Rd.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    phoneCountryCodeResponse = new PhoneCountryCodeResponse(C1862307Rd.LIZ);
                }
                HashMap<String, List<PhoneCountryData>> map3 = phoneCountryCodeResponse.map;
                Map<String, Integer> map4 = C2277691EDf.LIZ;
                ArrayList arrayList = new ArrayList();
                if (map3 != null && !map3.isEmpty()) {
                    for (String str2 : map3.keySet()) {
                        List<PhoneCountryData> list2 = map3.get(str2);
                        if (list2 != null && !list2.isEmpty()) {
                            for (PhoneCountryData phoneCountryData : list2) {
                                String str3 = phoneCountryData.displayname;
                                if (str3 != null && phoneCountryData.key != null && (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(phoneCountryData.key))) {
                                    LinkedHashMap linkedHashMap = (LinkedHashMap) C2277691EDf.LIZ;
                                    if (linkedHashMap.get(phoneCountryData.key) != null) {
                                        Integer num = (Integer) linkedHashMap.get(phoneCountryData.key);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append('+');
                                        sbLIZ.append(phoneCountryData.code);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        String str4 = phoneCountryData.displayname;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        if (num != null) {
                                            int iIntValue = num.intValue();
                                            String upperCase = String.valueOf(C13LN.LJLLI(phoneCountryData.en)).toUpperCase(Locale.ROOT);
                                            upperCase.toString();
                                            arrayList.add(new C2280601EOk(iIntValue, upperCase, str2, strLIZIZ, str4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        C08XD.LJJ(arrayList, new AComparatorS22S0000000_3(37));
                    }
                }
                C2280601EOk.LJI = AbstractC19875512pd.copyOf((Collection) arrayList);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
