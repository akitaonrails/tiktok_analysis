package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664940Q6i implements C0PWT {
    public final EnumC664960Q6k LL;
    public final String LLILLJJLI;

    public C664940Q6i() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664940Q6i)) {
            return false;
        }
        C664940Q6i c664940Q6i = (C664940Q6i) obj;
        return this.LL == c664940Q6i.LL && Intrinsics.LJFF(this.LLILLJJLI, c664940Q6i.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPublishStateUpdateAction(searchPublishState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y52().LIZIZ(C13LE.LIZ(C664940Q6i.class), AFwS293S0000000_10.get$arr$(153));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C664940Q6i(String str, int i) {
        EnumC664960Q6k enumC664960Q6k;
        if ((i & 1) != 0) {
            enumC664960Q6k = EnumC664960Q6k.INIT;
        } else {
            enumC664960Q6k = null;
        }
        this(enumC664960Q6k, (i & 2) != 0 ? "" : str);
    }

    public C664940Q6i(EnumC664960Q6k enumC664960Q6k, String str) {
        this.LL = enumC664960Q6k;
        this.LLILLJJLI = str;
    }
}
