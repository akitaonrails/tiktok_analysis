package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407680mje implements InterfaceC1411260mpQ {
    public final InterfaceC1650230t2r LIZ;

    @Override // X.InterfaceC1411260mpQ
    public final String LIZIZ() {
        return "POKER";
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1411260mpQ
    public final InterfaceC1650230t2r getCameraApiComponent() {
        return this.LIZ;
    }

    public static boolean LJFF(PokerBundle pokerBundle) {
        if (!TextUtils.isEmpty(pokerBundle.adcode) && !TextUtils.isEmpty(pokerBundle.district) && !TextUtils.isEmpty(pokerBundle.country) && !TextUtils.isEmpty(pokerBundle.province) && !TextUtils.isEmpty(pokerBundle.city)) {
            return true;
        }
        return false;
    }

    public C1407680mje(InterfaceC1650230t2r interfaceC1650230t2r, Context context) {
        this.LIZ = interfaceC1650230t2r;
    }

    public static JSONObject LJ(int i, PokerBundle pokerBundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "POKER");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("adcode", pokerBundle.adcode);
        jSONObject2.put("district", pokerBundle.district);
        jSONObject2.put("country", pokerBundle.country);
        jSONObject2.put("province", pokerBundle.province);
        jSONObject2.put("city", pokerBundle.city);
        jSONObject.put("body", jSONObject2);
        return jSONObject;
    }

    @Override // X.InterfaceC1411260mpQ
    public final void LIZ(int i, String str) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1407620mjY(i, this, str, null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1411250mpP.LIZIZ(this, i, C786410Ut5.J3(LJ(2, new PokerBundle("", "", "", "", ""))));
    }

    @Override // X.InterfaceC1411260mpQ
    public final boolean LIZJ(int i, int i2, int i3, String str) {
        return C1411250mpP.LIZ(this, i, i2, i3, str);
    }
}
