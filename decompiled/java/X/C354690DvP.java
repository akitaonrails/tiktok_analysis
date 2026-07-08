package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354690DvP {
    public final boolean LIZ;
    public final List<ResourceItem> LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354690DvP)) {
            return false;
        }
        C354690DvP c354690DvP = (C354690DvP) obj;
        return this.LIZ == c354690DvP.LIZ && Intrinsics.LJFF(this.LIZIZ, c354690DvP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c354690DvP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c354690DvP.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return ((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutPanelResourceResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cutoutResourceList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354690DvP(List list, String str, boolean z, Integer num) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = num;
        this.LIZLLL = str;
    }
}
