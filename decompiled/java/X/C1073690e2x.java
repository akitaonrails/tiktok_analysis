package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0e2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073690e2x {
    public final EnumC1073650e2t LIZ;
    public final Integer LIZIZ;
    public final Function2<Context, View, Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsEmptyButtonState(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1073690e2x) || this.LIZ != ((C1073690e2x) obj).LIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1073690e2x(EnumC1073650e2t enumC1073650e2t, Integer num, Function2<? super Context, ? super View, Unit> function2) {
        this.LIZ = enumC1073650e2t;
        this.LIZIZ = num;
        this.LIZJ = function2;
    }
}
