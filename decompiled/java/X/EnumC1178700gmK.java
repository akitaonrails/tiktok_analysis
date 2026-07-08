package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1178700gmK {
    public static final EnumC1178700gmK AFTER_QUIZ;
    public static final EnumC1178700gmK BEFORE_QUIZ;
    public static final EnumC1178700gmK DURING_QUIZ;
    public static final /* synthetic */ EnumC1178700gmK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1178700gmK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1178700gmK enumC1178700gmK = new EnumC1178700gmK("BEFORE_QUIZ", 0);
        BEFORE_QUIZ = enumC1178700gmK;
        EnumC1178700gmK enumC1178700gmK2 = new EnumC1178700gmK("DURING_QUIZ", 1);
        DURING_QUIZ = enumC1178700gmK2;
        EnumC1178700gmK enumC1178700gmK3 = new EnumC1178700gmK("AFTER_QUIZ", 2);
        AFTER_QUIZ = enumC1178700gmK3;
        EnumC1178700gmK[] enumC1178700gmKArr = {enumC1178700gmK, enumC1178700gmK2, enumC1178700gmK3};
        LL = enumC1178700gmKArr;
        LLILLJJLI = new C2254308sP(enumC1178700gmKArr);
    }

    public static EnumC1178700gmK[] values() {
        return (EnumC1178700gmK[]) LL.clone();
    }

    public static EnumC1178700gmK valueOf(String str) {
        return (EnumC1178700gmK) C08FF.LIZ(EnumC1178700gmK.class, str);
    }

    public EnumC1178700gmK(String str, int i) {
    }
}
