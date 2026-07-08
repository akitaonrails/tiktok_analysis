package X;

import com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility;
import com.bytedance.hybrid.spark.roma.internal.RomaAbilityImpl;

/* JADX INFO: renamed from: X.0qK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545580qK4 implements IRomaInternalAbility {
    public static final C1545580qK4 LIZIZ = new C1545580qK4();
    public final /* synthetic */ IRomaInternalAbility LIZ;

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final InterfaceC1546060qKq LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final C1545830qKT LJFF(C1550360qRm c1550360qRm) {
        return this.LIZ.LJFF(c1550360qRm);
    }

    @Override // com.bytedance.hybrid.spark.roma.internal.IRomaInternalAbility
    public final double getSampleRatio(String str) {
        return this.LIZ.getSampleRatio(str);
    }

    public C1545580qK4() {
        IRomaInternalAbility iRomaInternalAbility;
        Object objLIZ = C04TD.LIZ(IRomaInternalAbility.class, false);
        if (objLIZ != null) {
            iRomaInternalAbility = (IRomaInternalAbility) objLIZ;
        } else {
            if (C04TD.LJJII == null) {
                synchronized (IRomaInternalAbility.class) {
                    if (C04TD.LJJII == null) {
                        C04TD.LJJII = new RomaAbilityImpl();
                    }
                }
            }
            iRomaInternalAbility = C04TD.LJJII;
        }
        this.LIZ = iRomaInternalAbility;
    }
}
