package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175804iq implements InterfaceC1175904ir {
    public final Function1<View, Unit> LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175804iq)) {
            return false;
        }
        C1175804iq c1175804iq = (C1175804iq) obj;
        return Intrinsics.LJFF(this.LIZ, c1175804iq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1175804iq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCameraBtnAction(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onEffectFlip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1175804iq(Function1<? super View, Unit> function1, Function0<Unit> function0) {
        this.LIZ = function1;
        this.LIZIZ = function0;
    }
}
