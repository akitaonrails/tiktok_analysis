package X;

import android.content.Context;
import com.bytedance.hybrid.spark.roma.IRomaAbility;
import com.bytedance.hybrid.spark.roma.internal.RomaAbilityImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0qK5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545590qK5 implements IRomaAbility {
    public static final C1545590qK5 LIZIZ = new C1545590qK5();
    public final /* synthetic */ IRomaAbility LIZ;

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final String LIZIZ(String str, Map<String, String> map) {
        return this.LIZ.LIZIZ(str, map);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void LIZJ(Context context, String str, Map<String, String> map) {
        this.LIZ.LIZJ(context, str, map);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.bytedance.hybrid.spark.roma.IRomaAbility
    public final void initialize() {
        this.LIZ.initialize();
    }

    public C1545590qK5() {
        IRomaAbility iRomaAbility;
        Object objLIZ = C04TD.LIZ(IRomaAbility.class, false);
        if (objLIZ != null) {
            iRomaAbility = (IRomaAbility) objLIZ;
        } else {
            if (C04TD.LJJII == null) {
                synchronized (IRomaAbility.class) {
                    if (C04TD.LJJII == null) {
                        C04TD.LJJII = new RomaAbilityImpl();
                    }
                }
            }
            iRomaAbility = C04TD.LJJII;
        }
        this.LIZ = iRomaAbility;
    }
}
