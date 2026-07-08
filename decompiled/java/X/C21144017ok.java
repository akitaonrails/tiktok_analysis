package X;

import android.app.Activity;
import android.content.Context;
import java.util.UUID;

/* JADX INFO: renamed from: X.17ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21144017ok {
    public final C21143617og LIZ(int i, Context context, InterfaceC21138617ns interfaceC21138617ns, C21143417oe c21143417oe, InterfaceC21143917oj interfaceC21143917oj) {
        Integer numValueOf;
        boolean z;
        int iIntValue;
        boolean z2;
        Integer num;
        String string = UUID.randomUUID().toString();
        Activity activityLIZ = C21145417oy.LIZ(context);
        String type = null;
        if (activityLIZ != null) {
            numValueOf = Integer.valueOf(activityLIZ.hashCode());
        } else {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 != null) {
                numValueOf = Integer.valueOf(contextN3.hashCode());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot get hashcode for context : ");
            sbLIZ.append(this);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            if (activityLIZ != null) {
                z = true;
            } else {
                z = false;
            }
            String strLIZ = C740760T3y.LIZ(i);
            if (c21143417oe != null && (num = c21143417oe.LIZ) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            if (interfaceC21143917oj != null) {
                z2 = true;
                type = interfaceC21143917oj.getType();
            } else {
                z2 = false;
            }
            return new C21143617og(i, strLIZ, string, interfaceC21138617ns, iIntValue, iIntValue2, z, z2, type);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cannot get hashcode for context : ");
        sbLIZ2.append(this);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
