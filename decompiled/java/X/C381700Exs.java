package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Exs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381700Exs {
    public final EnumC337080DJi LIZ;
    public final NLETrackSlot LIZIZ;
    public final PromptModel LIZJ;
    public final boolean LIZLLL = false;
    public final String LJ = null;
    public final String LJFF = "";
    public final String LJI = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381700Exs)) {
            return false;
        }
        C381700Exs c381700Exs = (C381700Exs) obj;
        return this.LIZ == c381700Exs.LIZ && Intrinsics.LJFF(this.LIZIZ, c381700Exs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c381700Exs.LIZJ) && this.LIZLLL == c381700Exs.LIZLLL && Intrinsics.LJFF(this.LJ, c381700Exs.LJ) && Intrinsics.LJFF(this.LJFF, c381700Exs.LJFF) && Intrinsics.LJFF(this.LJI, c381700Exs.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VRequest(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needUseCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reuseTaskId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", originImagePath=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C381700Exs(EnumC337080DJi enumC337080DJi, NLETrackSlot nLETrackSlot, PromptModel promptModel) {
        this.LIZ = enumC337080DJi;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = promptModel;
    }
}
