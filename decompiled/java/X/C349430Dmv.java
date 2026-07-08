package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349430Dmv {
    public final NLEModel LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C349430Dmv)) {
            return false;
        }
        C349430Dmv c349430Dmv = (C349430Dmv) obj;
        return Intrinsics.LJFF(this.LIZ, c349430Dmv.LIZ) && this.LIZIZ == c349430Dmv.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NLEModelDoneNode(nleModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstDone=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C349430Dmv(NLEModel nLEModel, boolean z) {
        this.LIZ = nLEModel;
        this.LIZIZ = z;
    }
}
