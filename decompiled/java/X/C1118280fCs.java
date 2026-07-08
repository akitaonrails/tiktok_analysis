package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118280fCs {
    public static final /* synthetic */ int LIZ = 0;

    public static final EnumC1118290fCt LIZ(boolean z, boolean z2, boolean z3) {
        C1118330fCx c1118330fCxLIZ = C1118310fCv.LIZ(z, z2, z3);
        for (EnumC1118290fCt enumC1118290fCt : EnumC1118290fCt.values()) {
            List<C1118330fCx> mStatusSets = enumC1118290fCt.getMStatusSets();
            if (mStatusSets != null) {
                Iterator<C1118330fCx> it2 = mStatusSets.iterator();
                boolean z4 = false;
                while (it2.hasNext()) {
                    if (it2.next().LIZ(c1118330fCxLIZ)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return enumC1118290fCt;
                }
            }
        }
        return EnumC1118290fCt.TOAST;
    }
}
