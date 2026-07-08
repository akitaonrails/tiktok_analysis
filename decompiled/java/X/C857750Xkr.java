package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;

/* JADX INFO: renamed from: X.0Xkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857750Xkr {
    public static String LIZ(List list) {
        return GsonProtectorUtils.toJson(new Gson(), list);
    }
}
