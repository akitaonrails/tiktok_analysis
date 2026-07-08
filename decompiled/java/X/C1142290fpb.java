package X;

import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142290fpb implements InterfaceC0148002o {
    public final long LL;
    public final Gift.ColorPickerInfo LLILLJJLI;
    public final long LLILLL;
    public final List<InterfaceC1891350zJl> LLILZ;
    public final C291001Au<GiftColorInfo> LLILZIL;

    public C1142290fpb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142290fpb)) {
            return false;
        }
        C1142290fpb c1142290fpb = (C1142290fpb) obj;
        return this.LL == c1142290fpb.LL && Intrinsics.LJFF(this.LLILLJJLI, c1142290fpb.LLILLJJLI) && this.LLILLL == c1142290fpb.LLILLL && Intrinsics.LJFF(this.LLILZ, c1142290fpb.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1142290fpb.LLILZIL);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LL) * 31;
        Gift.ColorPickerInfo colorPickerInfo = this.LLILLJJLI;
        int iHashCode = (((((iY2 + (colorPickerInfo == null ? 0 : colorPickerInfo.hashCode())) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<GiftColorInfo> c291001Au = this.LLILZIL;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountryListDialogState(giftId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", colorPickerInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pendingColorId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", confirmedCountry=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1142290fpb(int i) {
        this(0L, null, -1L, C13BV.INSTANCE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1142290fpb(long j, Gift.ColorPickerInfo colorPickerInfo, long j2, List<? extends InterfaceC1891350zJl> list, C291001Au<GiftColorInfo> c291001Au) {
        this.LL = j;
        this.LLILLJJLI = colorPickerInfo;
        this.LLILLL = j2;
        this.LLILZ = list;
        this.LLILZIL = c291001Au;
    }

    public static C1142290fpb LIZ(C1142290fpb c1142290fpb, long j, Gift.ColorPickerInfo colorPickerInfo, long j2, List list, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        long j3 = j2;
        Gift.ColorPickerInfo colorPickerInfo2 = colorPickerInfo;
        List list2 = list;
        long j4 = j;
        if ((i & 1) != 0) {
            j4 = c1142290fpb.LL;
        }
        if ((i & 2) != 0) {
            colorPickerInfo2 = c1142290fpb.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            j3 = c1142290fpb.LLILLL;
        }
        if ((i & 8) != 0) {
            list2 = c1142290fpb.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1142290fpb.LLILZIL;
        }
        c1142290fpb.getClass();
        return new C1142290fpb(j4, colorPickerInfo2, j3, list2, c291001Au2);
    }
}
