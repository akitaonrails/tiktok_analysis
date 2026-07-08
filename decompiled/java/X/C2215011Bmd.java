package X;

import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Bmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215011Bmd {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(249));

    public static AbstractC1505170pGt LIZJ() {
        return (AbstractC1505170pGt) LIZ.getValue();
    }

    public static int LIZ() {
        return LIZJ().LJFF(0, "device_score");
    }

    public static int LIZIZ() {
        return LIZJ().LJFF(0, "cl_net_quality_level");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Performance: \ngetDeviceScore = ");
        sbLIZ.append(LIZ());
        sbLIZ.append(" \nisLowEndDevice = ");
        sbLIZ.append(LIZJ().LJFF(0, "cl_is_low_end_device") == 1);
        sbLIZ.append(", isInWifi = ");
        sbLIZ.append(LIZJ().LJFF(0, "cl_is_wifi") == 1);
        sbLIZ.append(" \ngetBatteryPct = ");
        sbLIZ.append(LIZJ().LJFF(0, "cl_battery_pct"));
        sbLIZ.append(", isCharging = ");
        sbLIZ.append(LIZJ().LJFF(0, "cl_is_charging"));
        sbLIZ.append(" \ngetNetQualityLevel = ");
        sbLIZ.append(LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
