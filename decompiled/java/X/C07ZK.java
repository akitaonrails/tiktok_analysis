package X;

import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZK implements InterfaceC2753014t {
    public final Map<String, EventModel> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07ZK) && Intrinsics.LJFF(this.LL, ((C07ZK) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventsSource(events=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZK(Map<String, EventModel> map) {
        this.LL = map;
    }
}
