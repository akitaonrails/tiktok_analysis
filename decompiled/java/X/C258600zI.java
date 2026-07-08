package X;

import com.bytedance.android.livesdk.game.model.GuessWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00zI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258600zI {
    public final GuessWidget LIZ;
    public final EnumC259400zQ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C258600zI)) {
            return false;
        }
        C258600zI c258600zI = (C258600zI) obj;
        return Intrinsics.LJFF(this.LIZ, c258600zI.LIZ) && this.LIZIZ == c258600zI.LIZIZ;
    }

    public final int hashCode() {
        GuessWidget guessWidget = this.LIZ;
        return ((guessWidget == null ? 0 : guessWidget.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserGuessingWidgetStatus(widget=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C258600zI(GuessWidget guessWidget, EnumC259400zQ enumC259400zQ) {
        this.LIZ = guessWidget;
        this.LIZIZ = enumC259400zQ;
    }
}
