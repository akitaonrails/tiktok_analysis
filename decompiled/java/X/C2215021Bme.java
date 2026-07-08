package X;

/* JADX INFO: renamed from: X.1Bme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215021Bme {
    public static final C2215001Bmc LIZ = C2215001Bmc.LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Performance: \ngetDeviceScore = ");
        C2215001Bmc c2215001Bmc = LIZ;
        c2215001Bmc.getClass();
        sbLIZ.append(C2215001Bmc.LIZ("device_score"));
        sbLIZ.append(" \nisLowEndDevice = ");
        c2215001Bmc.getClass();
        sbLIZ.append(C2215001Bmc.LIZ("cl_is_low_end_device") == 1);
        sbLIZ.append(", isInWifi = ");
        sbLIZ.append(C2215001Bmc.LIZ("cl_is_wifi") == 1);
        sbLIZ.append(" \ngetBatteryPct = ");
        sbLIZ.append(C2215001Bmc.LIZ("cl_battery_pct"));
        sbLIZ.append(", isCharging = ");
        sbLIZ.append(C2215001Bmc.LIZ("cl_is_charging"));
        sbLIZ.append(" \ngetNetQualityLevel = ");
        sbLIZ.append(C2215001Bmc.LIZ("cl_net_quality_level"));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
