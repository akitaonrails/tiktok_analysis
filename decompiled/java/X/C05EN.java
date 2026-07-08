package X;

import com.tiktok.ssc.event.EventFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05EN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05EN implements Comparable<C05EN> {
    public final C05EL LL;
    public final EventFilter LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05EN)) {
            return false;
        }
        C05EN c05en = (C05EN) obj;
        return Intrinsics.LJFF(this.LL, c05en.LL) && Intrinsics.LJFF(this.LLILLJJLI, c05en.LLILLJJLI) && this.LLILLL == c05en.LLILLL && this.LLILZ == c05en.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        EventFilter eventFilter = this.LLILLJJLI;
        return ((((iHashCode + (eventFilter == null ? 0 : eventFilter.hashCode())) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListenerWrapper(listener=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filter=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", once=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C05EN c05en) {
        return c05en.LLILLL - this.LLILLL;
    }

    public C05EN(C05EL c05el, EventFilter eventFilter, int i, boolean z) {
        this.LL = c05el;
        this.LLILLJJLI = eventFilter;
        this.LLILLL = i;
        this.LLILZ = z;
    }
}
