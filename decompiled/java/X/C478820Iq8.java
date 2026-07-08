package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478820Iq8 implements InterfaceC0148002o {
    public final List<AbstractC479160Iqg> LL;
    public final FeedExtra LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public C478820Iq8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478820Iq8)) {
            return false;
        }
        C478820Iq8 c478820Iq8 = (C478820Iq8) obj;
        return Intrinsics.LJFF(this.LL, c478820Iq8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c478820Iq8.LLILLJJLI) && this.LLILLL == c478820Iq8.LLILLL && this.LLILZ == c478820Iq8.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        FeedExtra feedExtra = this.LLILLJJLI;
        return ((((iHashCode + (feedExtra == null ? 0 : feedExtra.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HangoutRoomFeedState(listItems=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", feedExtra=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", savedPosition=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C478820Iq8(int i) {
        this(C13BV.INSTANCE, null, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C478820Iq8(List<? extends AbstractC479160Iqg> list, FeedExtra feedExtra, boolean z, int i) {
        this.LL = list;
        this.LLILLJJLI = feedExtra;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    public static C478820Iq8 LIZ(C478820Iq8 c478820Iq8, List list, FeedExtra feedExtra, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = c478820Iq8.LL;
        }
        if ((i2 & 2) != 0) {
            feedExtra = c478820Iq8.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z = c478820Iq8.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i = c478820Iq8.LLILZ;
        }
        c478820Iq8.getClass();
        return new C478820Iq8(list, feedExtra, z, i);
    }
}
