package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513450KBr {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC513400KBm LIZ(String str) {
        EnumC513400KBm next;
        Iterator<EnumC513400KBm> it2 = EnumC513400KBm.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getPageName(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC513400KBm enumC513400KBm = next;
        if (enumC513400KBm == null) {
            return EnumC513400KBm.UNKNOWN;
        }
        return enumC513400KBm;
    }

    public static boolean LIZIZ(EnumC513420KBo enumC513420KBo) {
        if (enumC513420KBo != EnumC513420KBo.LATE_CALLBACK_SCENE && enumC513420KBo != EnumC513420KBo.ONHOLD_SCENE && enumC513420KBo != EnumC513420KBo.AUTO_RENEWAL_CANCEL_SCENE) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(EnumC513420KBo enumC513420KBo) {
        if (enumC513420KBo != EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT && enumC513420KBo != EnumC513420KBo.INCORRECT_GP_ACCOUNT && enumC513420KBo != EnumC513420KBo.INCORRECT_PAYMENT_CHANNEL && enumC513420KBo != EnumC513420KBo.INCORRECT_PRECHECK_UNKNOWN) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(EnumC513400KBm enumC513400KBm) {
        if (enumC513400KBm != EnumC513400KBm.PACKAGE_PAGE && enumC513400KBm != EnumC513400KBm.PACKAGE_PAGE_V2) {
            return false;
        }
        return true;
    }
}
