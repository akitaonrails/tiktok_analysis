package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8H implements VORightOperationType {
    public final VOLightInteractionEntryConf LL;

    public final C0Z8H copy(VOLightInteractionEntryConf vOLightInteractionEntryConf) {
        return new C0Z8H(vOLightInteractionEntryConf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Z8H) && Intrinsics.LJFF(this.LL, ((C0Z8H) obj).LL);
    }

    public int hashCode() {
        VOLightInteractionEntryConf vOLightInteractionEntryConf = this.LL;
        if (vOLightInteractionEntryConf == null) {
            return 0;
        }
        return vOLightInteractionEntryConf.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VORightLightInteractionType(lightInteractionConf=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final VOLightInteractionEntryConf getLightInteractionConf() {
        return this.LL;
    }

    public C0Z8H(VOLightInteractionEntryConf vOLightInteractionEntryConf) {
        this.LL = vOLightInteractionEntryConf;
    }
}
