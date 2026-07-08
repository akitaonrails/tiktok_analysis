package X;

import android.text.Spannable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231500uv implements InterfaceC0148002o {
    public final C291001Au<Pair<String, Spannable>> LL;

    public C231500uv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231500uv) && Intrinsics.LJFF(this.LL, ((C231500uv) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Pair<String, Spannable>> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostEventState(onRepostInputDismiss=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231500uv(Object obj) {
        this.LL = null;
    }
}
