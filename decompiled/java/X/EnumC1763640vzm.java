package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1763640vzm {
    public static final EnumC1763640vzm AUTO_WRAP;
    public static final EnumC1763640vzm FORCE_WRAP;
    public static final /* synthetic */ EnumC1763640vzm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1763640vzm NO_WRAP;

    public static InterfaceC2044707zh<EnumC1763640vzm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1763640vzm enumC1763640vzm = new EnumC1763640vzm("NO_WRAP", 0);
        NO_WRAP = enumC1763640vzm;
        EnumC1763640vzm enumC1763640vzm2 = new EnumC1763640vzm("FORCE_WRAP", 1);
        FORCE_WRAP = enumC1763640vzm2;
        EnumC1763640vzm enumC1763640vzm3 = new EnumC1763640vzm("AUTO_WRAP", 2);
        AUTO_WRAP = enumC1763640vzm3;
        EnumC1763640vzm[] enumC1763640vzmArr = {enumC1763640vzm, enumC1763640vzm2, enumC1763640vzm3};
        LL = enumC1763640vzmArr;
        LLILLJJLI = new C2254308sP(enumC1763640vzmArr);
    }

    public static EnumC1763640vzm[] values() {
        return (EnumC1763640vzm[]) LL.clone();
    }

    public static EnumC1763640vzm valueOf(String str) {
        return (EnumC1763640vzm) C08FF.LIZ(EnumC1763640vzm.class, str);
    }

    public EnumC1763640vzm(String str, int i) {
    }
}
