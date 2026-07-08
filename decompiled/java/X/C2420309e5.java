package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.09e5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2420309e5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, EnumC1990307qv enumC1990307qv, Map map) {
        String str2;
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.put("to_uid", str);
        c13da.put("push_type", String.valueOf(i));
        if (enumC1990307qv == EnumC1990307qv.INTERCEPT_ENQUEUE) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        c13da.put("intercept_stage", str2);
        c13da.putAll(map);
        C20684815ws.LJIILLIIL("activity_status_in_app_push_intercept", c13da.build());
    }
}
