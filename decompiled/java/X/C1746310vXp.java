package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionOption;

/* JADX INFO: renamed from: X.0vXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746310vXp {
    public final DeliveryInstructionOption LIZ;
    public final boolean LIZIZ;
    public final C1745340vWG LIZJ;
    public final String LIZLLL;

    public C1746310vXp(DeliveryInstructionOption deliveryInstructionOption, boolean z, C1745340vWG c1745340vWG, String str) {
        this.LIZ = deliveryInstructionOption;
        this.LIZIZ = z;
        this.LIZJ = c1745340vWG;
        this.LIZLLL = str;
    }

    public static C1746310vXp LIZ(C1746310vXp c1746310vXp, boolean z, C1745340vWG c1745340vWG, int i) {
        DeliveryInstructionOption deliveryInstructionOption;
        String str = null;
        if ((i & 1) != 0) {
            deliveryInstructionOption = c1746310vXp.LIZ;
        } else {
            deliveryInstructionOption = null;
        }
        if ((i & 2) != 0) {
            z = c1746310vXp.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1745340vWG = c1746310vXp.LIZJ;
        }
        if ((i & 8) != 0) {
            str = c1746310vXp.LIZLLL;
        }
        c1746310vXp.getClass();
        return new C1746310vXp(deliveryInstructionOption, z, c1745340vWG, str);
    }
}
