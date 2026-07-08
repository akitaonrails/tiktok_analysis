package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C229900uf implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C229900uf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C229900uf)) {
            return false;
        }
        C229900uf c229900uf = (C229900uf) obj;
        return Intrinsics.LJFF(this.LL, c229900uf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c229900uf.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoRecordState(cameraSwitchState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", flashState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C229900uf(Object obj) {
        Boolean bool = Boolean.FALSE;
        C291001Au<Boolean> c291001Au = new C291001Au<>(bool);
        C291001Au<Boolean> c291001Au2 = new C291001Au<>(bool);
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
