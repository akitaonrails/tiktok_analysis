package X;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.04lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1191204lK implements Serializable {
    public final Set<String> LL = new LinkedHashSet();

    public final Set<String> getShownMsgSet() {
        return this.LL;
    }

    public final boolean getIsFirstShowAndRecord(String str) {
        if (!this.LL.contains(str)) {
            this.LL.add(str);
            return true;
        }
        return false;
    }
}
