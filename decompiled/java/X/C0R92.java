package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R92, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R92 implements InterfaceC0148002o {
    public final C291001Au<EnumC1778570wNr> LL;

    public C0R92() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R92) && Intrinsics.LJFF(this.LL, ((C0R92) obj).LL);
    }

    public final int hashCode() {
        C291001Au<EnumC1778570wNr> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageTemplateTabRefreshState(fetchTemplateTabState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0R92(C291001Au<? extends EnumC1778570wNr> c291001Au) {
        this.LL = c291001Au;
    }
}
