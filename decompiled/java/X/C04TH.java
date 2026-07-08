package X;

import com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;

/* JADX INFO: renamed from: X.04TH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TH {
    public static final ISkylightCellLongClickAbility LIZ;

    static {
        ISkylightCellLongClickAbility iSkylightCellLongClickAbility;
        Object objLIZ = C04TD.LIZ(ISkylightCellLongClickAbility.class, false);
        if (objLIZ != null) {
            iSkylightCellLongClickAbility = (ISkylightCellLongClickAbility) objLIZ;
        } else {
            if (C04TD.o5 == null) {
                synchronized (ISkylightCellLongClickAbility.class) {
                    if (C04TD.o5 == null) {
                        C04TD.o5 = new SkylightCellLongClickAbilityImpl();
                    }
                }
            }
            iSkylightCellLongClickAbility = C04TD.o5;
        }
        LIZ = iSkylightCellLongClickAbility;
    }
}
