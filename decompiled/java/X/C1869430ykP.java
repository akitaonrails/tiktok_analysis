package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ykP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869430ykP {
    public final Function0<Float> LIZ;
    public final Function0<Float> LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollAxisRange(value=");
        sbLIZ.append(this.LIZ.invoke().floatValue());
        sbLIZ.append(", maxValue=");
        sbLIZ.append(this.LIZIZ.invoke().floatValue());
        sbLIZ.append(", reverseScrolling=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869430ykP(Function0<Float> function0, Function0<Float> function02, boolean z) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = z;
    }
}
