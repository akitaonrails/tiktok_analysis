package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.13uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20159113uH {
    public static EnumC20158813uE LIZ(String str) {
        for (EnumC20158813uE enumC20158813uE : EnumC20158813uE.values()) {
            if (enumC20158813uE != EnumC20158813uE.PIX && u.LJIIZILJ(str, enumC20158813uE.getSuffix(), false)) {
                return enumC20158813uE;
            }
        }
        return EnumC20158813uE.PIX;
    }
}
