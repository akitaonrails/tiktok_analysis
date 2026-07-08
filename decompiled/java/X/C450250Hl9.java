package X;

import X.InterfaceC456120Huc;
import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450250Hl9<T extends InterfaceC456120Huc> extends C0SZ4<UISlotAssem> {
    public final C13IQ<T> LLJILJIL;

    public C450250Hl9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C450250Hl9) && Intrinsics.LJFF(this.LLJILJIL, ((C450250Hl9) obj).LLJILJIL);
    }

    public final int hashCode() {
        C13IQ<T> c13iq = this.LLJILJIL;
        if (c13iq == null) {
            return 0;
        }
        return c13iq.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelConfig(panelType=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C450250Hl9(C13IQ<T> c13iq) {
        this.LLJILJIL = c13iq;
    }
}
