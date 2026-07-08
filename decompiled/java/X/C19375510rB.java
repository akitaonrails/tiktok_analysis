package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19375510rB {
    public static List<C19375710rD> LIZ(JSONObject jSONObject) {
        List<C19375710rD> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int i = CastIntegerProtector.parseInt(next.substring(0, next.indexOf("digit")));
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
                C19375710rD c19375710rD = new C19375710rD();
                c19375710rD.LL = i;
                c19375710rD.LLILLJJLI = jSONObject2;
                listSynchronizedList.add(c19375710rD);
            }
            Collections.sort(listSynchronizedList, new Comparator<C19375710rD>() { // from class: X.10rE
                @Override // java.util.Comparator
                public final int compare(C19375710rD c19375710rD2, C19375710rD c19375710rD3) {
                    return c19375710rD2.LL - c19375710rD3.LL;
                }
            });
            return listSynchronizedList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return listSynchronizedList;
        }
    }

    public static C19375410rA LIZJ(JSONObject jSONObject) {
        C19375410rA c19375410rA = new C19375410rA();
        try {
            c19375410rA.LL = JSONObjectProtectorUtils.getString(jSONObject, "name");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "format");
            c19375410rA.LLILLL = JSONObjectProtectorUtils.getString(jSONObject, "standard");
            LIZLLL(c19375410rA, JSONObjectProtectorUtils.getString(jSONObject2, "pattern"));
            JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "proportional");
            c19375410rA.LLIZ = JSONObjectProtectorUtils.getString(jSONObject3, "percent");
            c19375410rA.LLIZLLLIL = JSONObjectProtectorUtils.getString(jSONObject3, "perMille");
            JSONObject jSONObject4 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "compact");
            c19375410rA.LLJILJIL = JSONObjectProtectorUtils.getString(jSONObject4, "formatLong");
            c19375410rA.LLJILJILJ = JSONObjectProtectorUtils.getString(jSONObject4, "formatShort");
            c19375410rA.LLJI = LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject4, "long"));
            c19375410rA.LLJIJIL = LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject4, "short"));
            c19375410rA.LLJ = JSONObjectProtectorUtils.getString(jSONObject, "scientific");
            JSONObject jSONObject5 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "range");
            C19375610rC c19375610rC = new C19375610rC();
            c19375610rC.LL = C19375610rC.LIZIZ("between", jSONObject5);
            c19375610rC.LLILLJJLI = C19375610rC.LIZIZ("approximately", jSONObject5);
            c19375610rC.LLILLL = C19375610rC.LIZIZ("atLeast", jSONObject5);
            c19375610rC.LLILZ = C19375610rC.LIZIZ("atMost", jSONObject5);
            c19375410rA.LLJILLL = c19375610rC;
            return c19375410rA;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c19375410rA;
        }
    }

    public static char LIZIZ(int i, String str) {
        char[] charArray = str.toCharArray();
        int i2 = 0;
        for (int length = charArray.length - 1; length >= 0; length--) {
            char c = charArray[length];
            if (c != '#' && c != '0' && (i2 = i2 + 1) == i) {
                return c;
            }
        }
        return ' ';
    }

    public static void LIZLLL(C19375410rA c19375410rA, String str) {
        if (!TextUtils.isEmpty(str)) {
            c19375410rA.LLILLJJLI = str;
            int i = 0;
            int i2 = 0;
            for (char c : str.toCharArray()) {
                if (c != '#' && c != '0') {
                    i2++;
                    if (i2 >= 2) {
                        break;
                    }
                } else {
                    i++;
                }
            }
            c19375410rA.LLILZ = Integer.valueOf(i);
            c19375410rA.LLILZIL = Character.valueOf(LIZIZ(1, c19375410rA.LLILLJJLI));
            c19375410rA.LLILZLL = Character.valueOf(LIZIZ(2, c19375410rA.LLILLJJLI));
        }
    }
}
