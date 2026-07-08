package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13DT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DT {
    public final Map<EnumC2207531BaZ, Object> LIZ = new HashMap();
    public final Map<EnumC2207531BaZ, Object> LIZIZ = new HashMap();

    public final <T extends Map> T LIZ(EnumC19857412mi enumC19857412mi, EnumC2207531BaZ enumC2207531BaZ) {
        return (T) ((HashMap) (EnumC19857412mi.VENDOR == enumC19857412mi ? this.LIZ : this.LIZIZ)).get(enumC2207531BaZ);
    }

    public final <T extends Map> void LIZIZ(EnumC19857412mi enumC19857412mi, EnumC2207531BaZ enumC2207531BaZ, T t) {
        ((HashMap) (EnumC19857412mi.VENDOR == enumC19857412mi ? this.LIZ : this.LIZIZ)).put(enumC2207531BaZ, t);
    }
}
