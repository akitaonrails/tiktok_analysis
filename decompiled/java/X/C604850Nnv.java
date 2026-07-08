package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bulletin.KeyValueHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Nnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604850Nnv {
    public static final C604850Nnv LIZ;
    public static final Map<Integer, C604860Nnw> LIZIZ;

    static {
        C604850Nnv c604850Nnv = new C604850Nnv();
        LIZ = c604850Nnv;
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, new C604860Nnw(2131828152, 1, new C604830Nnt(c604850Nnv), false)), new Pair(1, new C604860Nnw(R.string.f1_, 1, new C604780Nno(c604850Nnv), true)), new Pair(2, new C604860Nnw(2131828132, 0, new C604790Nnp(c604850Nnv), true)), new Pair(3, new C604860Nnw(2131828152, 0, new C604840Nnu(c604850Nnv), false)));
    }

    public static void LIZ(Context context, C604870Nnx c604870Nnx) {
        String string;
        String str;
        String str2;
        String str3;
        String string2;
        List<KeyValueHolder> list;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://inbox/bulletin_board");
        String str4 = null;
        if (c604870Nnx != null) {
            string = Long.valueOf(c604870Nnx.LIZ).toString();
        } else {
            string = null;
        }
        smartRouteBuildRoute.withParam("bulletin_board_id", string);
        if (c604870Nnx != null) {
            str = c604870Nnx.LIZJ;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("previous_page", str);
        if (c604870Nnx != null) {
            str4 = c604870Nnx.LIZIZ;
        }
        smartRouteBuildRoute.withParam("enter_from", str4);
        smartRouteBuildRoute.open();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c604870Nnx != null && (list = c604870Nnx.LIZLLL) != null) {
            for (KeyValueHolder keyValueHolder : list) {
                linkedHashMap.put(keyValueHolder.key, keyValueHolder.value);
            }
        }
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("click_type", "enter_cell");
        String str5 = "";
        if (c604870Nnx == null || (str2 = c604870Nnx.LIZJ) == null) {
            str2 = "";
        }
        linkedHashMap.put("previous_page", str2);
        if (c604870Nnx == null || (str3 = c604870Nnx.LIZIZ) == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        C0OPQ c0opq = C0OPQ.LIZ;
        if (c604870Nnx != null && (string2 = Long.valueOf(c604870Nnx.LIZ).toString()) != null) {
            str5 = string2;
        }
        Boolean bool = Boolean.FALSE;
        c0opq.getClass();
        C0OPQ.LJ(bool, str5, linkedHashMap);
    }
}
