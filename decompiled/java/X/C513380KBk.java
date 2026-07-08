package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513380KBk {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC513390KBl LIZ(String str) {
        for (EnumC513390KBl enumC513390KBl : EnumC513390KBl.values()) {
            if (Intrinsics.LJFF(enumC513390KBl.getPageName(), str)) {
                return enumC513390KBl;
            }
        }
        return EnumC513390KBl.UNKNOWN;
    }

    public static boolean LIZIZ(EnumC513410KBn enumC513410KBn) {
        if (enumC513410KBn != EnumC513410KBn.LATE_CALLBACK_SCENE && enumC513410KBn != EnumC513410KBn.ONHOLD_SCENE && enumC513410KBn != EnumC513410KBn.AUTO_RENEWAL_CANCEL_SCENE) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(EnumC513410KBn enumC513410KBn) {
        if (enumC513410KBn != EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT && enumC513410KBn != EnumC513410KBn.INCORRECT_GP_ACCOUNT && enumC513410KBn != EnumC513410KBn.INCORRECT_PAYMENT_CHANNEL && enumC513410KBn != EnumC513410KBn.INCORRECT_PRECHECK_UNKNOWN) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(EnumC513390KBl enumC513390KBl) {
        if (enumC513390KBl != EnumC513390KBl.PACKAGE_PAGE && enumC513390KBl != EnumC513390KBl.PACKAGE_PAGE_V2) {
            return false;
        }
        return true;
    }
}
