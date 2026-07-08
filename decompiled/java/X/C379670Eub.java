package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379670Eub {
    public final EditorProAIGCMediaItemModel LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379670Eub)) {
            return false;
        }
        C379670Eub c379670Eub = (C379670Eub) obj;
        return Intrinsics.LJFF(this.LIZ, c379670Eub.LIZ) && this.LIZIZ == c379670Eub.LIZIZ && this.LIZJ == c379670Eub.LIZJ && this.LIZLLL == c379670Eub.LIZLLL && this.LJ == c379670Eub.LJ;
    }

    public final int hashCode() {
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = this.LIZ;
        return ((((((((editorProAIGCMediaItemModel == null ? 0 : editorProAIGCMediaItemModel.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCResultPanelSelectEvent(itemModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needMob=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scrollDy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", useLegacySmoothScroll=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", legacySnapToEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C379670Eub(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, boolean z, int i, boolean z2, boolean z3) {
        this.LIZ = editorProAIGCMediaItemModel;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
