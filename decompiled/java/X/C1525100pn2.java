package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525100pn2 {
    public static final String LIZ(String str, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || !(!Intrinsics.LJFF(objOpt, JSONObject.NULL))) {
            return null;
        }
        return objOpt.toString();
    }
}
