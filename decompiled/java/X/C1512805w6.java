package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512805w6 extends AbstractC1492605sq {
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512805w6)) {
            return false;
        }
        C1512805w6 c1512805w6 = (C1512805w6) obj;
        return Intrinsics.LJFF(this.LJ, c1512805w6.LJ) && Intrinsics.LJFF(this.LJFF, c1512805w6.LJFF);
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LJFF);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1512805w6(String str) {
        this(str, "");
    }

    public C1512805w6(String str, String str2) {
        super("im_enter_chat_component", str, (EnumC1492905st) null, 12);
        this.LJ = str;
        this.LJFF = str2;
    }
}
