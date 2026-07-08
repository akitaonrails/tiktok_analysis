package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.CardTag;

/* JADX INFO: renamed from: X.0Iqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479150Iqf extends AbstractC479160Iqg {
    public final C479170Iqh LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C479150Iqf) && Intrinsics.LJFF(this.LLILLL, ((C479150Iqf) obj).LLILLL);
    }

    public final int hashCode() {
        return this.LLILLL.hashCode();
    }

    @Override // X.AbstractC479160Iqg
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayFeedPowerItem(cardFeedItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC479160Iqg
    public final C479170Iqh LIZ() {
        return this.LLILLL;
    }

    public C479150Iqf(C479170Iqh c479170Iqh) {
        super(c479170Iqh);
        this.LLILLL = c479170Iqh;
    }

    @Override // X.AbstractC479160Iqg, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        if (!(interfaceC1891350zJl instanceof C479150Iqf)) {
            return false;
        }
        C479170Iqh c479170Iqh = this.LLILLL;
        long j = c479170Iqh.LIZ;
        C479150Iqf c479150Iqf = (C479150Iqf) interfaceC1891350zJl;
        C479170Iqh c479170Iqh2 = c479150Iqf.LLILLL;
        if (j != c479170Iqh2.LIZ || !Intrinsics.LJFF(c479170Iqh.LIZIZ, c479170Iqh2.LIZIZ)) {
            return false;
        }
        CardTag cardTag = this.LLILLL.LIZJ;
        Integer numValueOf2 = null;
        if (cardTag != null) {
            str = cardTag.text;
        } else {
            str = null;
        }
        CardTag cardTag2 = c479150Iqf.LLILLL.LIZJ;
        if (cardTag2 != null) {
            str2 = cardTag2.text;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        CardTag cardTag3 = this.LLILLL.LIZLLL;
        if (cardTag3 != null) {
            str3 = cardTag3.text;
        } else {
            str3 = null;
        }
        CardTag cardTag4 = c479150Iqf.LLILLL.LIZLLL;
        if (cardTag4 != null) {
            str4 = cardTag4.text;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str3, str4)) {
            return false;
        }
        List<User> list = this.LLILLL.LJ;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        List<User> list2 = c479150Iqf.LLILLL.LJ;
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC479160Iqg, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C479150Iqf) {
            C479170Iqh c479170Iqh = this.LLILLL;
            long j = c479170Iqh.LIZ;
            C479170Iqh c479170Iqh2 = ((C479150Iqf) interfaceC1891350zJl).LLILLL;
            if (j == c479170Iqh2.LIZ && Intrinsics.LJFF(c479170Iqh.LIZIZ, c479170Iqh2.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
