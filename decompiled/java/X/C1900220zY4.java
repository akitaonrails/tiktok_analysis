package X;

/* JADX INFO: renamed from: X.0zY4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900220zY4 implements InterfaceC0148002o {
    public final EnumC588090N4t LL;
    public final EnumC1895270zQ5 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1900220zY4)) {
            return false;
        }
        C1900220zY4 c1900220zY4 = (C1900220zY4) obj;
        return this.LL == c1900220zY4.LL && this.LLILLJJLI == c1900220zY4.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveCommonState(dataType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loginType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1900220zY4(EnumC588090N4t enumC588090N4t, EnumC1895270zQ5 enumC1895270zQ5) {
        this.LL = enumC588090N4t;
        this.LLILLJJLI = enumC1895270zQ5;
    }
}
