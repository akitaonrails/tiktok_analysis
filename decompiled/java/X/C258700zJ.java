package X;

import com.ss.android.ugc.aweme.feed.model.live.GuessWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00zJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258700zJ {
    public final GuessWidget LIZ;
    public final EnumC259500zR LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C258700zJ)) {
            return false;
        }
        C258700zJ c258700zJ = (C258700zJ) obj;
        return Intrinsics.LJFF(this.LIZ, c258700zJ.LIZ) && this.LIZIZ == c258700zJ.LIZIZ;
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

    public C258700zJ(GuessWidget guessWidget, EnumC259500zR enumC259500zR) {
        this.LIZ = guessWidget;
        this.LIZIZ = enumC259500zR;
    }
}
