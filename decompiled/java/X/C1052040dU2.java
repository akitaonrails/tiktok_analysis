package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceLynxCard;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.CommerceLynxCardComponentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052040dU2 {
    public final CommerceLynxCard LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1052040dU2) && Intrinsics.LJFF(this.LIZ, ((C1052040dU2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceLynxCardAdapter(commerceLynxCard=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        String str = this.LIZ.rawValue;
        return str == null ? "" : str;
    }

    public final String LIZIZ() {
        String str;
        CommerceLynxCardComponentData commerceLynxCardComponentData = this.LIZ.componentData;
        return (commerceLynxCardComponentData == null || (str = commerceLynxCardComponentData.lynxSchema) == null) ? "" : str;
    }

    public C1052040dU2(CommerceLynxCard commerceLynxCard) {
        this.LIZ = commerceLynxCard;
    }
}
