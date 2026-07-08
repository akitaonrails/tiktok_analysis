package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C770802zi {
    public final OSPPageModuleConfig LIZ;
    public final InterfaceC7746030u LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C770802zi)) {
            return false;
        }
        C770802zi c770802zi = (C770802zi) obj;
        return Intrinsics.LJFF(this.LIZ, c770802zi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c770802zi.LIZIZ);
    }

    public final int hashCode() {
        OSPPageModuleConfig oSPPageModuleConfig = this.LIZ;
        return ((oSPPageModuleConfig == null ? 0 : oSPPageModuleConfig.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspVOCreationContext(layoutConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer LIZ() {
        OSPPageModuleConfig oSPPageModuleConfig = this.LIZ;
        if (oSPPageModuleConfig != null) {
            return Integer.valueOf(oSPPageModuleConfig.visibleType);
        }
        return null;
    }

    public C770802zi(OSPPageModuleConfig oSPPageModuleConfig, InterfaceC7746030u interfaceC7746030u) {
        this.LIZ = oSPPageModuleConfig;
        this.LIZIZ = interfaceC7746030u;
    }
}
