package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212670hf7 implements InterfaceC1212660hf6 {
    public final AwemeDraft LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1212670hf7) && Intrinsics.LJFF(this.LIZ, ((C1212670hf7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OperationUpdate(awemeDraft=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1212670hf7(AwemeDraft awemeDraft) {
        this.LIZ = awemeDraft;
    }
}
