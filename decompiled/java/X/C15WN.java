package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15WN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1294060jmO
public final class C15WN {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(482));

    public final <T extends InterfaceC336510DHd> T LIZ(Class<T> cls) {
        T t;
        Object obj = ((Map) this.LIZ.getValue()).get(cls);
        if (!(obj instanceof InterfaceC336510DHd) || (t = (T) obj) == null) {
            for (Map.Entry entry : ((Map) this.LIZ.getValue()).entrySet()) {
                if (cls.isAssignableFrom(entry.getValue().getClass())) {
                    return (T) entry.getValue();
                }
            }
            return null;
        }
        return t;
    }
}
