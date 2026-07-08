package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861130XqJ implements InterfaceC1461640o8g<C1678310tm9> {
    public final boolean LIZ;
    public final String LIZIZ;

    public /* synthetic */ C861130XqJ() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861130XqJ)) {
            return false;
        }
        C861130XqJ c861130XqJ = (C861130XqJ) obj;
        return this.LIZ == c861130XqJ.LIZ && Intrinsics.LJFF(this.LIZIZ, c861130XqJ.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarItemStickerState(showGuide=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guideText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861130XqJ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
