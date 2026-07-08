package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PA6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PA6 {
    public final List<String> LIZ = new ArrayList();

    public final void LIZ() {
        if (((ArrayList) this.LIZ).size() > 20) {
            List listLL = C13LP.LL(this.LIZ, 20);
            ((ArrayList) this.LIZ).clear();
            ((ArrayList) this.LIZ).addAll(listLL);
        }
    }
}
