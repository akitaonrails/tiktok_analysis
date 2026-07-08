package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265440j2E {
    public static int LIZ(InterfaceC1265060j1c interfaceC1265060j1c, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (!z) {
            if (C13LQ.LJLIIL(new Integer[]{1, 3}).contains(Integer.valueOf(((Number) C277610AuN.LIZ.getValue()).intValue()))) {
                return EnumC1265510j2L.SOURCE_TYPE_BY_MAF_TOP.getValue();
            }
            return EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue();
        }
        if (interfaceC1265060j1c.El0() > 1000) {
            return EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue();
        }
        if (Intrinsics.LJFF(interfaceC1265060j1c.getEnterFrom(), "notification_page") && C0BMR.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJFF = Intrinsics.LJFF(interfaceC1265060j1c.getEnterFrom(), "push");
        if (!z2 && !zLJFF) {
            if (!Intrinsics.LJFF(interfaceC1265060j1c.getEnterFrom(), "notification_page") && !Intrinsics.LJFF(interfaceC1265060j1c.getEnterFrom(), "push")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (((Number) C0BMR.LIZ.getValue()).intValue() == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                return EnumC1265510j2L.SOURCE_TYPE_BY_LOW_FAN.getValue();
            }
            return EnumC1265510j2L.SOURCE_TYPE_BY_CREATE_TIME.getValue();
        }
        return EnumC1265510j2L.SOURCE_TYPE_BY_MAF_FAN_NOTICE.getValue();
    }
}
