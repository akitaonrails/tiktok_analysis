package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04E6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04E6 {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04E6)) {
            return false;
        }
        C04E6 c04e6 = (C04E6) obj;
        return Intrinsics.LJFF(this.LIZ, c04e6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04e6.LIZIZ);
    }

    public C04E6(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
