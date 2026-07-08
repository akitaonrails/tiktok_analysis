package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280304zh extends C1089610eSd {
    public final Map<String, ? extends Object> LIZLLL;

    public C1280304zh() {
        throw null;
    }

    public C1280304zh(Map map) {
        super("", false);
        this.LIZLLL = map;
    }

    @Override // X.C1089610eSd
    public final boolean LIZ(C1089610eSd c1089610eSd) {
        boolean z = false;
        if (!(c1089610eSd instanceof C1280304zh)) {
            return false;
        }
        Map<String, ? extends Object> map = this.LIZLLL;
        Map<String, ? extends Object> map2 = ((C1280304zh) c1089610eSd).LIZLLL;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object obj = map2.get(entry.getKey());
                if (obj == null || !Intrinsics.LJFF(obj, entry.getValue())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        return !z;
    }
}
