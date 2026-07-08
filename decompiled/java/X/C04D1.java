package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04D1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04D1 {
    public final LynxCreatorModule LIZ;

    public C04D1() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04D1)) {
            return false;
        }
        C04D1 c04d1 = (C04D1) obj;
        c04d1.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LIZ, c04d1.LIZ);
    }

    public C04D1(LynxCreatorModule lynxCreatorModule, int i) {
        this.LIZ = (i & 2) != 0 ? null : lynxCreatorModule;
    }
}
