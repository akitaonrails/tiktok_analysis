package X;

/* JADX INFO: renamed from: X.0lB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347810lB5 implements InterfaceC0148002o {
    public final EnumC1347820lB6 LL;

    public C1347810lB5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1347810lB5) && this.LL == ((C1347810lB5) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickMentionState(showQuickMention=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1347810lB5(int i) {
        this(EnumC1347820lB6.INIT);
    }

    public C1347810lB5(EnumC1347820lB6 enumC1347820lB6) {
        this.LL = enumC1347820lB6;
    }
}
