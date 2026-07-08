package X;

import java.util.UUID;

/* JADX INFO: renamed from: X.0vPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741150vPV {
    public final EnumC1741200vPa LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public C1741150vPV(EnumC1741200vPa enumC1741200vPa, boolean z, int i) {
        String string;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        this.LIZ = enumC1741200vPa;
        this.LIZIZ = z;
        this.LIZJ = string;
    }
}
