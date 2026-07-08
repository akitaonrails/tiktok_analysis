package X;

/* JADX INFO: renamed from: X.0D3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332960D3m extends AbstractC332980D3o {
    public final EnumC333530D5r LL;

    public final C332960D3m copy(EnumC333530D5r enumC333530D5r) {
        return new C332960D3m(enumC333530D5r);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C332960D3m) && this.LL == ((C332960D3m) obj).LL;
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332960D3m() {
        this(EnumC333530D5r.SERVER);
    }

    public final EnumC333530D5r getErrorType() {
        return this.LL;
    }

    public C332960D3m(EnumC333530D5r enumC333530D5r) {
        this.LL = enumC333530D5r;
    }
}
