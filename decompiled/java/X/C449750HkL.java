package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449750HkL extends AbstractC1492605sq {
    public final Integer LJ;
    public final Long LJFF;

    public C449750HkL() {
        this((Integer) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C449750HkL)) {
            return false;
        }
        C449750HkL c449750HkL = (C449750HkL) obj;
        return Intrinsics.LJFF(this.LJ, c449750HkL.LJ) && Intrinsics.LJFF(this.LJFF, c449750HkL.LJFF);
    }

    public final int hashCode() {
        Integer num = this.LJ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.LJFF;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterStickerInputPanelEventKey(type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stickerSetId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C449750HkL(Integer num, Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(num);
        sbLIZ.append('_');
        sbLIZ.append(l);
        super("im_enter_sticker_input_panel_performance", C2188811AlT.LIZIZ(sbLIZ), (EnumC1492905st) null, 12);
        this.LJ = num;
        this.LJFF = l;
    }

    public /* synthetic */ C449750HkL(Integer num, int i) {
        this((i & 1) != 0 ? null : num, (Long) null);
    }
}
