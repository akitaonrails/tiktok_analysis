package X;

import android.app.Activity;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0zRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896150zRV extends C09AY implements Function0<Unit> {
    public C1896150zRV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLJIILL;
        DynamicDialog dynamicDialog;
        C1895020zPg.LL.getClass();
        C1897800zUA c1897800zUA = C1897800zUA.LIZ;
        c1897800zUA.getClass();
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null && !C1897800zUA.LIZLLL && (dynamicDialog = C1897800zUA.LIZIZ) != null) {
            C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU7 == null) {
                c1897800zUA.getClass();
                C1897800zUA.LIZIZ(activityLJIILL, dynamicDialog, false, null, null, null);
            } else {
                AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(activityLJIILL, dynamicDialog, 72);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(dynamicDialog.jsSource);
                sbLIZ.append("&touchpointId=");
                sbLIZ.append(dynamicDialog.LIZ);
                sbLIZ.append("&launchPlanId=");
                sbLIZ.append(dynamicDialog.LIZJ);
                sbLIZ.append("&popupType=");
                sbLIZ.append(dynamicDialog.name);
                c1897770zU7.LJIIIZ(activityLJIILL, C2188811AlT.LIZIZ(sbLIZ), awS394S0200000_28);
                C1893680zNW.LIZ.getClass();
                C1893680zNW.LJIIJJI(4, null);
            }
        }
        return Unit.LIZ;
    }
}
