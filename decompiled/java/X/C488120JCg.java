package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488120JCg implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;

    public C488120JCg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C488120JCg)) {
            return false;
        }
        C488120JCg c488120JCg = (C488120JCg) obj;
        return this.LL == c488120JCg.LL && Intrinsics.LJFF(this.LLILLJJLI, c488120JCg.LLILLJJLI);
    }

    public final int hashCode() {
        EnumC488160JCk enumC488160JCk = this.LL;
        int iHashCode = (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletCommonStepState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C488120JCg(EnumC488160JCk enumC488160JCk, String str) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
    }
}
