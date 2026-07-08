package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0E0N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0N {
    public final List<String> LIZ = new ArrayList();

    public final void LIZ(String str) {
        int iIndexOf = ((ArrayList) this.LIZ).indexOf(str);
        if (iIndexOf == 0) {
            return;
        }
        if (iIndexOf > 0) {
            ListProtector.remove(this.LIZ, iIndexOf);
            ListProtector.add(this.LIZ, 0, str);
        } else {
            ListProtector.add(this.LIZ, 0, str);
        }
    }
}
