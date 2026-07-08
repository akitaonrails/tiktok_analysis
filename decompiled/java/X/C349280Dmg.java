package X;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349280Dmg implements IAudioParams {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC1452170ntP LIZIZ;
    public final AbstractC1452680nuE LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C349280Dmg)) {
            return false;
        }
        C349280Dmg c349280Dmg = (C349280Dmg) obj;
        return Intrinsics.LJFF(this.LIZ, c349280Dmg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c349280Dmg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c349280Dmg.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZIZ;
        int iHashCode2 = (iHashCode + (interfaceC1452170ntP == null ? 0 : interfaceC1452170ntP.hashCode())) * 31;
        AbstractC1452680nuE abstractC1452680nuE = this.LIZJ;
        return iHashCode2 + (abstractC1452680nuE != null ? abstractC1452680nuE.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioEnhanceParams(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", veEditor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", veVideoEditor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C349280Dmg(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, AbstractC1452680nuE abstractC1452680nuE) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC1452170ntP;
        this.LIZJ = abstractC1452680nuE;
    }
}
