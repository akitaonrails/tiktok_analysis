package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0zFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888930zFr {
    public static final <T> T LIZ(Class<T> cls) {
        return (T) C100C.LIZ.LIZLLL().LIZJ(cls);
    }

    public static final String LIZJ(Object obj) {
        return GsonProtectorUtils.toJson(C1703730uR9.LIZ(), obj);
    }

    public static final <T> C11NZ<T> LIZIZ(C11NZ<T> c11nz, String str, Map<String, String> map) {
        C11NZ<T> c11nzLIZJ;
        C19482711Kf c19482711KfLIZ;
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ != null && (c19482711KfLIZ = interfaceC1888940zFsLIZJ.LIZ(c11nz, str, map)) != null) {
            c11nz = c19482711KfLIZ;
        }
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ2 = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ2 != null && (c11nzLIZJ = interfaceC1888940zFsLIZJ2.LIZJ(c11nz, str, map)) != null) {
            return c11nzLIZJ;
        }
        return c11nz;
    }
}
