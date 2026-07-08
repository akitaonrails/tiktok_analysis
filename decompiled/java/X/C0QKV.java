package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QKV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QKV implements InterfaceC0148002o {
    public final Pair<Boolean, Boolean> LL;
    public final String LLILLJJLI;

    public C0QKV() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QKV)) {
            return false;
        }
        C0QKV c0qkv = (C0QKV) obj;
        return Intrinsics.LJFF(this.LL, c0qkv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0qkv.LLILLJJLI);
    }

    public final int hashCode() {
        Pair<Boolean, Boolean> pair = this.LL;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchBoxFYPState(isVisibleWithAnim=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reinforceWord=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QKV(String str, Pair pair) {
        this.LL = pair;
        this.LLILLJJLI = str;
    }

    public static C0QKV LIZ(C0QKV c0qkv, Pair pair, String str, int i) {
        if ((i & 1) != 0) {
            pair = c0qkv.LL;
        }
        if ((i & 2) != 0) {
            str = c0qkv.LLILLJJLI;
        }
        c0qkv.getClass();
        return new C0QKV(str, pair);
    }
}
