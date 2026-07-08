package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ER6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ER6 {
    public final Function1<List<TextStickerData>, Unit> LIZ;
    public final InterfaceC1631630sYr<List<Integer>, List<? extends C0EVA>, Boolean, Boolean, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function1<EnumC364790ERx, Unit> LJ;
    public final Function1<String, Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ER6)) {
            return false;
        }
        C0ER6 c0er6 = (C0ER6) obj;
        return Intrinsics.LJFF(this.LIZ, c0er6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0er6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0er6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0er6.LIZLLL) && Intrinsics.LJFF(this.LJ, c0er6.LJ) && Intrinsics.LJFF(this.LJFF, c0er6.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFillerWordContentActions(onConfirmBtnClicked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onFilterWordSelectChanged=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onPanelClose=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onRetryClicked=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onLoadingStateChanged=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onMobFillerWordAction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ER6(C354320Duo c354320Duo, C0ER5 c0er5, AwS549S0100000_5 awS549S0100000_5, C0ER8 c0er8, C364530EQx c364530EQx, C0ER7 c0er7) {
        this.LIZ = c354320Duo;
        this.LIZIZ = c0er5;
        this.LIZJ = awS549S0100000_5;
        this.LIZLLL = c0er8;
        this.LJ = c364530EQx;
        this.LJFF = c0er7;
    }
}
