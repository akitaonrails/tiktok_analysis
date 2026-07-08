package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.IAccountUserService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HCS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HCS {
    public static final C0HCS LIZ = new C0HCS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(464));
    public static final Gson LIZJ = new Gson();
    public static final Type LIZLLL = new TypeToken<List<? extends String>>() { // from class: X.0HCT
    }.getType();

    public static List LIZ() {
        String curUserId;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            return C13BV.INSTANCE;
        }
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_history_");
        sbLIZ.append(curUserId);
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
        if (string == null) {
            return C13BV.INSTANCE;
        }
        List list = (List) GsonProtectorUtils.fromJson(LIZJ, string, LIZLLL);
        return list == null ? C13BV.INSTANCE : list;
    }

    public static void LIZIZ(String str) {
        String curUserId;
        String string;
        String strLJZL;
        ArrayList arrayList;
        int iIndexOf;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null || str == null || (string = a0.LJLIIIL(str).toString()) == null || (strLJZL = C13LN.LJZL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, string)) == null || a0.LJJJIL(strLJZL) || (iIndexOf = (arrayList = new ArrayList(LIZ())).indexOf(strLJZL)) == 0) {
            return;
        }
        if (iIndexOf > 0) {
            ListProtector.remove(arrayList, iIndexOf);
        }
        while (arrayList.size() >= 5) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
        }
        ListProtector.add(arrayList, 0, strLJZL);
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("search_history_");
        sbLIZ.append(curUserId);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), GsonProtectorUtils.toJson(LIZJ, arrayList));
    }
}
