package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854820Xg8 extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static C854820Xg8 get$arr$(int i) {
        C854820Xg8 c854820Xg8 = (C854820Xg8) arr$.get(i);
        if (c854820Xg8 != null) {
            return c854820Xg8;
        }
        arr$.compareAndSet(i, null, new C854820Xg8(i));
        return (C854820Xg8) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C854820Xg8(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C854820Xg8 c854820Xg8, Object obj, Object obj2, Object obj3, Object obj4) {
        Fragment fragment = (Fragment) obj;
        C0XYD c0xyd = (C0XYD) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        if (C852110Xbl.LIZ[c0xyd.scene().ordinal()] == 1) {
            return C0XZ4.LJJIII(C0XZ4.LIZ, fragment, c0xyd, "", C852100Xbk.LIZ(c0xyd), str2, null, null, null, null, null, 992);
        }
        return C0XZ4.LJJIII(C0XZ4.LIZ, fragment, c0xyd, str, C852100Xbk.LIZ(c0xyd), str2, null, null, null, null, null, 992);
    }

    public static final Object invoke$1(C854820Xg8 c854820Xg8, Object obj, Object obj2, Object obj3, Object obj4) {
        C0W9Y c0w9y;
        String uid;
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue2 = ((Number) obj3).intValue();
        User user = (User) obj4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append(", ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", ");
        String uid2 = null;
        if (user != null) {
            uid2 = user.getUid();
        }
        sbLIZ.append(uid2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue == 4) {
                        c0w9y = C0W9Y.ACCOUNT_LOGIN_END;
                    }
                    return Unit.LIZ;
                }
                c0w9y = C0W9Y.ACCOUNT_LOGOUT;
            } else {
                c0w9y = C0W9Y.ACCOUNT_SWITCH;
            }
        } else {
            c0w9y = C0W9Y.ACCOUNT_LOGIN;
        }
        if (c0w9y != null) {
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            C818000W7a c818000W7a = new C818000W7a(uid);
            Iterator<C0W7Z> it2 = C0W9Z.LIZ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ(c818000W7a);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C854820Xg8 c854820Xg8, Object obj, Object obj2, Object obj3, Object obj4) throws JSONException {
        long jLongValue = ((Number) obj3).longValue();
        long jLongValue2 = ((Number) obj4).longValue();
        C0XEY.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", obj);
        jSONObject.put("enter_from", obj2);
        jSONObject.put("since_inbound_ms", jLongValue);
        jSONObject.put("staleness_window_ms", jLongValue2);
        jSONObject.put("is_background", C1906580ziK.LJI() ? 1 : 0);
        jSONObject.put("network_level", C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportZombie], event = ws_zombie_recovery, json = ");
        sbLIZ.append(jSONObject);
        C845400XEk.LIZIZ("WsConnectivityReport", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIJ("ws_zombie_recovery", jSONObject);
        return Unit.LIZ;
    }
}
