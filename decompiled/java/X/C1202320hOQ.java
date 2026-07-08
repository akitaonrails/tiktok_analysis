package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202320hOQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("initial_poi_from_group_id");
        if (C123100dR.LIZ(strOptString)) {
            return strOptString;
        }
        return jSONObject.optString("group_id");
    }

    public static boolean LIZIZ(JSONObject jSONObject) {
        if (!Intrinsics.LJFF(jSONObject.optString("enter_from"), "homepage_hot") || !Intrinsics.LJFF(jSONObject.optString("main_anchor_type"), "poi") || jSONObject.optString("poi_id").length() <= 0) {
            return false;
        }
        return true;
    }
}
