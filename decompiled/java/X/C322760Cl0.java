package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322760Cl0 implements InterfaceC0148002o {
    public final C291001Au<List<CommerceAgentActionBarItem>> LL;

    public C322760Cl0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C322760Cl0) && Intrinsics.LJFF(this.LL, ((C322760Cl0) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentSugDataState(regenerateSelectEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C322760Cl0(int i) {
        this((C291001Au<? extends List<CommerceAgentActionBarItem>>) new C291001Au(C13BV.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C322760Cl0(C291001Au<? extends List<CommerceAgentActionBarItem>> c291001Au) {
        this.LL = c291001Au;
    }
}
