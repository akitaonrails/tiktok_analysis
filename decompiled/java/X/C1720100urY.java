package X;

import com.bytedance.pipo.stellar.base.model.ActionSheetDO;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.stellar.base.model.prop.CloseContentDO;
import com.bytedance.pipo.stellar.base.model.prop.DialogContentDO;
import com.bytedance.pipo.stellar.base.model.prop.RedirectContentDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.model.prop.ToastContentDO;
import com.bytedance.router.SmartRouter;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0urY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720100urY {
    public static final void LIZ(String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(C1717770unn.LIZJ().getApplicationContext(), str).open();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final AbstractC2201008jo LIZIZ(StellarActionDO stellarActionDO) {
        EnumC1720490usB enumC1720490usBLIZJ;
        Integer numValueOf;
        String str;
        Integer num = stellarActionDO.type;
        String str2 = null;
        if (num != null && (enumC1720490usBLIZJ = LIZJ(num.intValue())) != null) {
            switch (C1720500usC.LIZ[enumC1720490usBLIZJ.ordinal()]) {
                case 1:
                    RedirectContentDO redirectContentDO = stellarActionDO.redirectContent;
                    if (redirectContentDO != null && (str = redirectContentDO.schema) != null) {
                        return new C1720080urW(str, redirectContentDO.business, redirectContentDO.closePage, stellarActionDO.btm);
                    }
                    break;
                case 2:
                    for (EnumC1720110urZ enumC1720110urZ : EnumC1720110urZ.values()) {
                        int value = enumC1720110urZ.getValue();
                        CloseContentDO closeContentDO = stellarActionDO.closeContent;
                        if (closeContentDO == null || (numValueOf = closeContentDO.closeType) == null) {
                            numValueOf = Integer.valueOf(EnumC1720110urZ.PAGE.getValue());
                        }
                        if ((numValueOf instanceof Integer) && value == numValueOf.intValue()) {
                            CloseContentDO closeContentDO2 = stellarActionDO.closeContent;
                            if (closeContentDO2 != null) {
                                str2 = closeContentDO2.targetId;
                            }
                            return new C2200808jm(enumC1720110urZ, str2);
                        }
                    }
                    break;
                case 3:
                case 4:
                    return null;
                case 5:
                    DialogContentDO dialogContentDO = stellarActionDO.dialogContentDO;
                    if (dialogContentDO == null) {
                        return null;
                    }
                    return new C2200608jk(dialogContentDO);
                case 6:
                    ToastContentDO toastContentDO = stellarActionDO.toastContent;
                    if (toastContentDO == null) {
                        return null;
                    }
                    return new C2200508jj(toastContentDO);
                case 7:
                    ActionSheetDO actionSheetDO = stellarActionDO.sheetContent;
                    if (actionSheetDO == null) {
                        return null;
                    }
                    return new C1720130urb(actionSheetDO);
                case 8:
                    StellarTooltipDO stellarTooltipDO = stellarActionDO.tooltipContent;
                    if (stellarTooltipDO == null) {
                        return null;
                    }
                    return new C1720140urc(stellarTooltipDO);
            }
        }
        return null;
    }

    public static final EnumC1720490usB LIZJ(int i) {
        EnumC1720490usB next;
        Iterator<EnumC1720490usB> it2 = EnumC1720490usB.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (i == next.getValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
