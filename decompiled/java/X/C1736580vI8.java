package X;

import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736580vI8 extends AbstractC1736670vIH {
    public final String LIZ;
    public final DraftSavedExtraData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736580vI8)) {
            return false;
        }
        C1736580vI8 c1736580vI8 = (C1736580vI8) obj;
        return Intrinsics.LJFF(this.LIZ, c1736580vI8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1736580vI8.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        DraftSavedExtraData draftSavedExtraData = this.LIZIZ;
        return iHashCode + (draftSavedExtraData == null ? 0 : draftSavedExtraData.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSaved(draftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", draftSavedExtraData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1736580vI8(String str, DraftSavedExtraData draftSavedExtraData) {
        this.LIZ = str;
        this.LIZIZ = draftSavedExtraData;
    }
}
