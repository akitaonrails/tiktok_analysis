package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0p1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495470p1F extends IOException {
    public final EnumC1496090p2F errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1495470p1F(EnumC1496090p2F enumC1496090p2F) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stream was reset: ");
        sbLIZ.append(enumC1496090p2F);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.errorCode = enumC1496090p2F;
    }
}
