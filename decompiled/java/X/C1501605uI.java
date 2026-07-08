package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1501605uI extends AbstractC1492605sq {
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1501605uI) && Intrinsics.LJFF(this.LJ, ((C1501605uI) obj).LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerDownloadEventKey(resourceID=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1501605uI(String str) {
        super("aweme_im_sticker_download", str, EnumC1492905st.TEA, 4);
        this.LJ = str;
    }
}
