package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.08H5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08H5 {
    public final Set<String> LIZ;

    public C08H5(Set<String> set) {
        this.LIZ = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (C08H5.class == obj.getClass()) {
                    return Objects.equals(this.LIZ, ((C08H5) obj).LIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
