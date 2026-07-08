package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689470R2r implements InterfaceC1891350zJl, InterfaceC689370R2h {
    public final TakoUserItem LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689470R2r)) {
            return false;
        }
        C689470R2r c689470R2r = (C689470R2r) obj;
        return Intrinsics.LJFF(this.LL, c689470R2r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c689470R2r.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c689470R2r.LLILLL) && this.LLILZ == c689470R2r.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLILLJJLI;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleUserListItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bindIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bindMessageId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listStyle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689370R2h
    public final String LJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC689370R2h
    public final TakoUserItem getUser() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C689470R2r) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LL, ((C689470R2r) interfaceC1891350zJl).LL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C689470R2r) {
            if (this.LL.userId == ((C689470R2r) interfaceC1891350zJl).LL.userId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C689470R2r(TakoUserItem takoUserItem, Integer num, String str) {
        this.LL = takoUserItem;
        this.LLILLJJLI = num;
        this.LLILLL = str;
    }
}
