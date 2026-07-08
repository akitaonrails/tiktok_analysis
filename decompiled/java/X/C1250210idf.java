package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0idf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250210idf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(764));

    public static String LIZIZ(Object obj) {
        return GsonProtectorUtils.toJson((Gson) LIZ.getValue(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson((Gson) LIZ.getValue(), str, cls);
    }
}
