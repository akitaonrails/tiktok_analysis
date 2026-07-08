package X;

import Y.AfS178S0100000_9;
import Y.AfS71S0400000_27;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812030xFp implements InterfaceC594210NSh {
    public static final C1812030xFp LIZ = new C1812030xFp();

    @Override // X.InterfaceC594210NSh
    public final void LIZ(Context context, JSONObject jSONObject, InterfaceC594650NTz interfaceC594650NTz) {
        long j;
        HashMap<String, String> map;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(jSONObject.optString("user_id"));
        long jLongValue = 0;
        try {
            j = CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, "room_id"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StackTraceElement[] stackTrace = e.getStackTrace();
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJIIJ(stackTrace, 5);
            j = 0;
        }
        jSONObject.optString("from_label");
        jSONObject.optString("url");
        boolean zOptBoolean = jSONObject.optBoolean("is_follow", true);
        FollowPair followPair = new FollowPair();
        followPair.LIZLLL = EnumC1812050xFr.FromClient;
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        }
        followPair.LIZ = jLongValue;
        followPair.LIZIZ = j;
        followPair.LJ = zOptBoolean;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("send_log");
        if (jSONObjectOptJSONObject != null) {
            map = new HashMap<>();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        } else {
            map = null;
        }
        followPair.LJFF = map;
        if (map != null && (Intrinsics.LJFF("program_list", map.get("click_user_position")) || Intrinsics.LJFF("program_list_new", map.get("click_user_position")))) {
            followPair.LJI = true;
        }
        LIZIZ(context, followPair, interfaceC594650NTz);
    }

    public final void LIZIZ(Context context, FollowPair followPair, InterfaceC594650NTz interfaceC594650NTz) {
        if (!UserService.getInstance().user().isLogin()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C476760Imo c476760Imo = new C476760Imo();
                c476760Imo.LIZ = C497740JfY.LJIJI(2131853574);
                c476760Imo.LIZJ = -1;
                c476760Imo.LJ = "search_result";
                c476760Imo.LIZLLL = "recommend";
                c476760Imo.LJFF = "follow";
                interfaceC500940JkiUser.LJIILL(activityLIZ, new C501600Jlm(c476760Imo)).LJJLL(new AfS71S0400000_27(this, context, followPair, interfaceC594650NTz, 0), new AfS178S0100000_9(interfaceC594650NTz, 20));
                return;
            }
            return;
        }
        if (followPair.LJ) {
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            C1099430eiT c1099430eiT = new C1099430eiT();
            c1099430eiT.LIZIZ(followPair.LIZ);
            c1099430eiT.LJ(followPair.LIZIZ);
            c1099430eiT.LIZLLL = followPair.LJFF;
            c1099430eiT.LIZLLL();
            c1099430eiT.LJ = followPair.LIZLLL;
            c1099430eiT.LIZLLL();
            c1099430eiT.LJI = followPair.LJI;
            c1099430eiT.LIZLLL();
            c1099430eiT.LIZLLL();
            interfaceC500940JkiUser2.LIZ(c1099430eiT.LIZJ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(interfaceC594650NTz, 21), new AfS178S0100000_9(interfaceC594650NTz, 22));
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser3 = UserService.getInstance().user();
        C1113650f5P c1113650f5P = new C1113650f5P();
        c1113650f5P.LIZIZ(followPair.LIZ);
        c1113650f5P.LIZJ();
        c1113650f5P.LJ = followPair.LJFF;
        c1113650f5P.LJFF = followPair.LIZLLL;
        c1113650f5P.LIZLLL(followPair.followStatus);
        c1113650f5P.getClass();
        interfaceC500940JkiUser3.LJI(new C1812120xFy(c1113650f5P)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(interfaceC594650NTz, 23), new AfS178S0100000_9(interfaceC594650NTz, 24));
    }
}
