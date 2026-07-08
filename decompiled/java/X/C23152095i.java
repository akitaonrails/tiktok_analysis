package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.095i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23152095i extends C096H {
    public final NLEModel LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23152095i)) {
            return false;
        }
        C23152095i c23152095i = (C23152095i) obj;
        return Intrinsics.LJFF(this.LIZ, c23152095i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c23152095i.LIZIZ);
    }

    public final int hashCode() {
        NLEModel nLEModel = this.LIZ;
        int iHashCode = (nLEModel == null ? 0 : nLEModel.hashCode()) * 31;
        Map<String, String> map = this.LIZIZ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnResponse(nleModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23152095i(NLEModel nLEModel, Map<String, String> map) {
        this.LIZ = nLEModel;
        this.LIZIZ = map;
    }
}
