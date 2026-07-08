package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563520M8g extends C0M8P {
    public final String LIZIZ;

    public C563520M8g() {
        super(false);
        this.LIZIZ = "click_select_multiple";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C563520M8g) && Intrinsics.LJFF(this.LIZIZ, ((C563520M8g) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchMultiSelectClicked(clickMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
