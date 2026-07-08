package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04D0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04D0 {
    public final LynxCreatorModule LIZ;

    public C04D0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04D0)) {
            return false;
        }
        C04D0 c04d0 = (C04D0) obj;
        c04d0.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LIZ, c04d0.LIZ);
    }

    public C04D0(LynxCreatorModule lynxCreatorModule, int i) {
        this.LIZ = (i & 2) != 0 ? null : lynxCreatorModule;
    }
}
