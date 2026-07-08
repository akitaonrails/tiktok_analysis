package X;

/* JADX INFO: renamed from: X.1BaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2207531BaZ {
    CPU_FREQ_MIN("cpu_freq_min", 1),
    CPU_FREQ_MAX("cpu_freq_max", 2),
    CPU_CORE_MIN("cpu_core_min", 3),
    CPU_CORE_MAX("cpu_core_max", 4),
    GPU_FREQ_MIN("gpu_freq_min", 5),
    GPU_FREQ_MAX("gpu_freq_max", 6),
    BUS_FREQ_MIN("bus_freq_min", 7),
    BUS_FREQ_MAX("bus_freq_max", 8),
    UFS_FREQ_MIN("ufs_freq_min", 9),
    UFS_FREQ_MAX("ufs_freq_max", 10),
    TASK_PRIORITY("task_priority", 11),
    CPU_AFFINITY("cpu_affinity", 12),
    IDLE_STATE("idle_state", 13),
    IO_PRELOAD("io_preload", 14),
    NETWORK_ENHANCE("network_enhance", 15),
    PRESET_SCENE("preset_scene", 16),
    THUMB_FETCH("thumb_fetch", 17),
    VIBRATE_ENHANCE("vibrate_enhance", 18),
    TYPE_MIN(CPU_FREQ_MIN),
    TYPE_MAX(VIBRATE_ENHANCE);

    public final String LL;
    public final int LLILLJJLI;

    EnumC2207531BaZ(EnumC2207531BaZ enumC2207531BaZ) {
        this.LL = enumC2207531BaZ.LL;
        this.LLILLJJLI = enumC2207531BaZ.LLILLJJLI;
    }

    EnumC2207531BaZ(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }

    public static EnumC2207531BaZ valueOf(int i) {
        for (EnumC2207531BaZ enumC2207531BaZ : values()) {
            if (i == enumC2207531BaZ.LLILLJJLI) {
                return enumC2207531BaZ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't find enum type for index: ");
        sbLIZ.append(i);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC2207531BaZ valueOf(String str) {
        return (EnumC2207531BaZ) C08FF.LIZ(EnumC2207531BaZ.class, str);
    }

    public int getIndex() {
        return this.LLILLJJLI;
    }

    public String getName() {
        return this.LL;
    }
}
