package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.095a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23144095a extends C096H {
    public final NLEModel LIZ;

    public C23144095a() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23144095a) && Intrinsics.LJFF(this.LIZ, ((C23144095a) obj).LIZ);
    }

    public final int hashCode() {
        NLEModel nLEModel = this.LIZ;
        if (nLEModel == null) {
            return 0;
        }
        return nLEModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnEffectDownloadDone(nleModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23144095a(NLEModel nLEModel) {
        this.LIZ = nLEModel;
    }
}
