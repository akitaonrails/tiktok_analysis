package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ru0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710540Ru0 implements InterfaceC0148002o {
    public final boolean LL;
    public final CharSequence LLILLJJLI;

    public C710540Ru0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C710540Ru0)) {
            return false;
        }
        C710540Ru0 c710540Ru0 = (C710540Ru0) obj;
        return this.LL == c710540Ru0.LL && Intrinsics.LJFF(this.LLILLJJLI, c710540Ru0.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        CharSequence charSequence = this.LLILLJJLI;
        return iZ2 + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoTopCautionState(visible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", text=");
        sbLIZ.append((Object) this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C710540Ru0(int i) {
        this(null, false);
    }

    public C710540Ru0(CharSequence charSequence, boolean z) {
        this.LL = z;
        this.LLILLJJLI = charSequence;
    }
}
