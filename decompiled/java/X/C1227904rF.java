package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.04rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1294060jmO
public final class C1227904rF {
    public static final C1227904rF LIZ = new C1227904rF();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C051H());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1197004mG());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1197104mH());

    public static Gson LIZLLL() {
        return (Gson) LIZLLL.getValue();
    }

    public static Gson LJ() {
        return (Gson) LIZIZ.getValue();
    }

    public static String LJI(Object obj) {
        return GsonProtectorUtils.toJson(LIZLLL(), obj);
    }

    public static Object LIZ(k kVar, Class cls) {
        return GsonProtectorUtils.fromJson(LIZLLL(), kVar, cls);
    }

    public static Object LIZIZ(String str, Class cls) {
        return GsonProtectorUtils.fromJson(LIZLLL(), str, cls);
    }

    public static Object LIZJ(String str, Type type) {
        return GsonProtectorUtils.fromJson(LIZLLL(), str, type);
    }

    public static List LJFF(Class cls, String str) {
        Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(LIZLLL(), str, cls);
        if (objArr != null) {
            return C13LQ.LJLI(objArr);
        }
        return new ArrayList();
    }
}
