package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719160uq2 implements Serializable {
    public final String errorCode;
    public final String errorContent;
    public final EnumC1718480uow status;

    public C1719160uq2() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1719160uq2)) {
            return false;
        }
        C1719160uq2 c1719160uq2 = (C1719160uq2) obj;
        return this.status == c1719160uq2.status && Intrinsics.LJFF(this.errorCode, c1719160uq2.errorCode) && Intrinsics.LJFF(this.errorContent, c1719160uq2.errorContent);
    }

    public C1719160uq2(EnumC1718480uow enumC1718480uow, String str, String str2) {
        this.status = enumC1718480uow;
        this.errorCode = str;
        this.errorContent = str2;
    }
}
