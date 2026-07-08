package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153460g7c {
    public static final EnumC1153460g7c CPU;
    public static final EnumC1153460g7c CPU_CORE;
    public static final EnumC1153460g7c GPU;
    public static final /* synthetic */ EnumC1153460g7c[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final EnumC2207531BaZ LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1153460g7c> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1153460g7c enumC1153460g7c = new EnumC1153460g7c("CPU", 0, 1, EnumC2207531BaZ.CPU_FREQ_MIN);
        CPU = enumC1153460g7c;
        EnumC1153460g7c enumC1153460g7c2 = new EnumC1153460g7c("CPU_CORE", 1, 2, EnumC2207531BaZ.CPU_CORE_MIN);
        CPU_CORE = enumC1153460g7c2;
        EnumC1153460g7c enumC1153460g7c3 = new EnumC1153460g7c("GPU", 2, 4, EnumC2207531BaZ.GPU_FREQ_MIN);
        GPU = enumC1153460g7c3;
        EnumC1153460g7c[] enumC1153460g7cArr = {enumC1153460g7c, enumC1153460g7c2, enumC1153460g7c3};
        LLILLL = enumC1153460g7cArr;
        LLILZ = new C2254308sP(enumC1153460g7cArr);
    }

    public static EnumC1153460g7c[] values() {
        return (EnumC1153460g7c[]) LLILLL.clone();
    }

    public final EnumC2207531BaZ getCapType() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153460g7c valueOf(String str) {
        return (EnumC1153460g7c) C08FF.LIZ(EnumC1153460g7c.class, str);
    }

    public EnumC1153460g7c(String str, int i, int i2, EnumC2207531BaZ enumC2207531BaZ) {
        this.LL = i2;
        this.LLILLJJLI = enumC2207531BaZ;
    }
}
