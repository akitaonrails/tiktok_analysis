package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.08HO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HO {
    public static final List LIZ(int i, int i2, Collection collection) {
        try {
            return new ArrayList(collection).subList(i, i2);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }
}
