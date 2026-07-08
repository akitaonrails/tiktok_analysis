package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464911Dj {
    public final List<Boolean> LIZ = new ArrayList();

    public final void LIZ(int i, boolean z) {
        if (i >= 0 && i <= ((ArrayList) this.LIZ).size()) {
            if (z) {
                if (i < ((ArrayList) this.LIZ).size()) {
                    ListProtector.set(this.LIZ, i, Boolean.TRUE);
                    return;
                } else {
                    ListProtector.add(this.LIZ, i, Boolean.TRUE);
                    return;
                }
            }
            ListProtector.add(this.LIZ, i, Boolean.FALSE);
        }
    }
}
