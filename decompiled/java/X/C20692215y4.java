package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20692215y4 extends AbstractC19293010ds {
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C20692215y4() {
        this(false, false);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThemeItem(blockBegin=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", blockEnd=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        AbstractC19293010ds abstractC19293010ds;
        String str = this.LLILLL;
        String str2 = null;
        if ((obj instanceof C20692215y4) && (abstractC19293010ds = (AbstractC19293010ds) obj) != null) {
            str2 = abstractC19293010ds.LLILLL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C20692215y4(boolean z, boolean z2) {
        super(false, null, 15);
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }
}
