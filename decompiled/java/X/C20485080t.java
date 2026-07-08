package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.080t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20485080t {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20486080u());

    public static String LIZIZ(Object obj) {
        return GsonProtectorUtils.toJson((Gson) LIZ.getValue(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson((Gson) LIZ.getValue(), str, cls);
    }
}
