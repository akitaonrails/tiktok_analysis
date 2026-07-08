package X;

/* JADX INFO: renamed from: X.0V9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793290V9z {
    public static final C793290V9z LJ = new C793290V9z();
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C0VA0 LIZLLL = new Object() { // from class: X.0VA0
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CpuAbnormalConfig{cpuHardWare='");
            sbLIZ.append("unknown");
            sbLIZ.append('\'');
            sbLIZ.append(", scene='");
            sbLIZ.append("default");
            sbLIZ.append('\'');
            sbLIZ.append(", cpuSpeed=");
            sbLIZ.append(0.0f);
            sbLIZ.append(", smallCpuCoreTimePercent=");
            sbLIZ.append(0.0f);
            sbLIZ.append(", middleCpuCoreTimePercent=");
            sbLIZ.append(0.0f);
            sbLIZ.append(", BigCpuCoreTimePercent=");
            sbLIZ.append(0.0f);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssistConfig{enableProcessCpuSpeedStat=");
        sbLIZ.append(false);
        sbLIZ.append(", enableProcessCpuUsageStat=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", threadCpuUsageStatProcessThreshold=");
        sbLIZ.append(0.0d);
        sbLIZ.append(", threadCpuSpeedStatProcessThreshold=");
        sbLIZ.append(0.0d);
        sbLIZ.append(", enableThreadCpuSpeedStat=");
        sbLIZ.append(false);
        sbLIZ.append(", enableThreadCpuUsageStat=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableCareThreadStat=");
        sbLIZ.append(false);
        sbLIZ.append(", enableSystemCpuUsageStat=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableProcessTimeFreqPercent=");
        sbLIZ.append(false);
        sbLIZ.append(", enableSystemCpuTimeFreqPercent=");
        sbLIZ.append(false);
        sbLIZ.append(", cpuSampleBatteryTemp=");
        sbLIZ.append(37);
        sbLIZ.append(", cpuSampleBatteryLevel=");
        sbLIZ.append(30);
        sbLIZ.append(", cpuAbnormalConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableProcExtraInfo=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
