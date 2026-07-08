package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647400PaM {
    public static void LIZ(C1537480q70 c1537480q70, C647340PaG c647340PaG) {
        ISearchContextAbility iSearchContextAbility;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (c1537480q70 != null && (iSearchContextAbility = (ISearchContextAbility) c1537480q70.LJFF(ISearchContextAbility.class)) != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            int i = c0prc.LL;
            try {
                JSONObject jSONObject = c647340PaG.LIZIZ;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", C0PYW.LIZLLL(i));
                jSONObject.put("requestInfo", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
