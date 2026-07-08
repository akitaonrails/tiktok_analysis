package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689480R2s implements InterfaceC1891350zJl, InterfaceC689340R2e {
    public final TakoUserItem LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ = true;
    public final boolean LLILZIL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689480R2s)) {
            return false;
        }
        C689480R2s c689480R2s = (C689480R2s) obj;
        return Intrinsics.LJFF(this.LL, c689480R2s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c689480R2s.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c689480R2s.LLILLL) && this.LLILZ == c689480R2s.LLILZ && this.LLILZIL == c689480R2s.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLILLJJLI;
        return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoUserListItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bindIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bindMessageId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listStyle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", footPadding=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC689340R2e
    public final String LJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC689340R2e
    public final Integer LJZL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC689340R2e
    public final TakoUserItem getUser() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0R31) {
            return Intrinsics.LJFF(this.LL, ((C0R31) interfaceC1891350zJl).LLJJJJLIIL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C689480R2s) {
            if (this.LL.userId == ((C689480R2s) interfaceC1891350zJl).LL.userId) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C689480R2s(TakoUserItem takoUserItem, Integer num, String str) {
        this.LL = takoUserItem;
        this.LLILLJJLI = num;
        this.LLILLL = str;
    }
}
