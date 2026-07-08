package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665210Q7j implements InterfaceC1891350zJl {
    public final Boolean LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final Map<String, String> LLILZ;
    public final Function0<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C665210Q7j)) {
            return false;
        }
        C665210Q7j c665210Q7j = (C665210Q7j) obj;
        return Intrinsics.LJFF(this.LL, c665210Q7j.LL) && this.LLILLJJLI == c665210Q7j.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c665210Q7j.LLILLL) && Intrinsics.LJFF(this.LLILZ, c665210Q7j.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c665210Q7j.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Function0<Unit> function0 = this.LLILZIL;
        return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugCardItem(isAskTakoCard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sugContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sugMobParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C665210Q7j() {
        this(Boolean.TRUE, 0, null, null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C665210Q7j) {
            return Intrinsics.LJFF(this.LLILLL, ((C665210Q7j) interfaceC1891350zJl).LLILLL);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C665210Q7j) {
            if (this.LLILLJJLI == ((C665210Q7j) interfaceC1891350zJl).LLILLJJLI) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C665210Q7j(Boolean bool, int i, String str, Map<String, String> map, Function0<Unit> function0) {
        this.LL = bool;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = function0;
    }
}
