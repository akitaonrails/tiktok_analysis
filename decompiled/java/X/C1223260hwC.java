package X;

/* JADX INFO: renamed from: X.0hwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223260hwC implements InterfaceC0148002o {
    public final EnumC1223310hwH LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1223260hwC) && this.LL == ((C1223260hwC) obj).LL;
    }

    public final int hashCode() {
        EnumC1223310hwH enumC1223310hwH = this.LL;
        if (enumC1223310hwH == null) {
            return 0;
        }
        return enumC1223310hwH.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorStatusVMState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1223260hwC(EnumC1223310hwH enumC1223310hwH) {
        this.LL = enumC1223310hwH;
    }
}
