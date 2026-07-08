package X;

/* JADX INFO: renamed from: X.0JUO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUO extends C0JUN {
    public final boolean LL;
    public final int LLILLJJLI;

    public C0JUO() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JUO) && this.LL == ((C0JUO) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubWaveSuggestEmoteEntranceData(hasRedDot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0JUN
    public final int getType() {
        return this.LLILLJJLI;
    }

    public C0JUO(boolean z) {
        this.LL = z;
        this.LLILLJJLI = 4;
    }
}
