package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.p;

/* JADX INFO: renamed from: X.0de3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058250de3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1058260de4());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1058270de5());

    public static Gson LIZIZ() {
        return (Gson) LIZ.getValue();
    }

    public static p LIZJ() {
        return (p) LIZIZ.getValue();
    }

    public static String LIZLLL(Object obj) {
        return GsonProtectorUtils.toJson(LIZIZ(), obj);
    }

    public static Object LIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson(LIZIZ(), str, cls);
    }
}
