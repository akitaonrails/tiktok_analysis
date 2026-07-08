package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ZY {
    public static String LIZ = "";
    public static int LIZIZ = C386801es.DEFAULT;
    public static final ArrayList<C01ZZ> LIZJ = C1697810uHb.LJ(new C01ZZ("live_show", C1697810uHb.LJ(1, 2, 3, 4), C1697810uHb.LJ(5)), new C01ZZ("wallpaper", C1697810uHb.LJ(1), C1697810uHb.LJ(0)), new C01ZZ("countdown_for_all", C1697810uHb.LJ(1), C1697810uHb.LJ(0)));

    public static int LIZIZ(JSONObject jSONObject) {
        try {
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                if (jSONObject2.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                    return JSONObjectProtectorUtils.getInt(jSONObject2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                }
                return C386801es.DEFAULT;
            }
            return C386801es.DEFAULT;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("PlayBannerShowEventHandler", th.getMessage());
            return C386801es.DEFAULT;
        }
    }

    public static String LIZJ(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bannerType")) {
                String string = JSONObjectProtectorUtils.getString(jSONObject, "bannerType");
                if (string == null) {
                    return "";
                }
                return string;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("PlayBannerShowEventHandler", th.getMessage());
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(org.json.JSONObject r9) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01ZY.LIZLLL(org.json.JSONObject):void");
    }

    public static boolean LIZ(int i, String str) {
        C01ZZ next;
        Iterator<C01ZZ> it2 = LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C01ZZ c01zz = next;
        if (c01zz != null) {
            return c01zz.LIZIZ.contains(Integer.valueOf(i));
        }
        return false;
    }
}
