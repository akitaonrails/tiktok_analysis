package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Do0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350100Do0 {
    public final C350040Dnu LIZ;
    public final List<NLETrackSlot> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C350100Do0)) {
            return false;
        }
        C350100Do0 c350100Do0 = (C350100Do0) obj;
        return Intrinsics.LJFF(this.LIZ, c350100Do0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c350100Do0.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainTrackData(diffResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mainTrackSlots=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C350100Do0(C350040Dnu c350040Dnu, List<? extends NLETrackSlot> list) {
        this.LIZ = c350040Dnu;
        this.LIZIZ = list;
    }
}
