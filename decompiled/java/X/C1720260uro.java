package X;

import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.NavBarDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720260uro {
    public final NavBarDO LIZ;
    public final BackgroundDO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720260uro)) {
            return false;
        }
        C1720260uro c1720260uro = (C1720260uro) obj;
        return Intrinsics.LJFF(this.LIZ, c1720260uro.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1720260uro.LIZIZ);
    }

    public C1720260uro(NavBarDO navBarDO, BackgroundDO backgroundDO) {
        this.LIZ = navBarDO;
        this.LIZIZ = backgroundDO;
    }
}
