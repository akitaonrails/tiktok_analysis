package X;

import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Q9 {
    public final ModelInfo LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C13Q9(ModelInfo modelInfo) {
        this.LIZ = modelInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.LJFF(this.LIZ, ((C13Q9) obj).LIZ);
    }
}
