package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544720LXy extends C0LYS {
    public final Function1<Activity, Unit> LIZ;

    public C544720LXy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C544720LXy) && Intrinsics.LJFF(this.LIZ, ((C544720LXy) obj).LIZ);
    }

    public final int hashCode() {
        Function1<Activity, Unit> function1 = this.LIZ;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigateToEditFromDraft(executeDraftNavigation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C544720LXy(Function1<? super Activity, Unit> function1) {
        this.LIZ = function1;
    }
}
