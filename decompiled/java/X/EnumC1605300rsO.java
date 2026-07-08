package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605300rsO {
    public static final EnumC1605300rsO AI_SUMMARY_BANNER;
    public static final EnumC1605300rsO AMUSEMENT_BANNER;
    public static final EnumC1605300rsO COLLECT_BANNER;
    public static final /* synthetic */ EnumC1605300rsO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1605300rsO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1605300rsO enumC1605300rsO = new EnumC1605300rsO("AMUSEMENT_BANNER", 0);
        AMUSEMENT_BANNER = enumC1605300rsO;
        EnumC1605300rsO enumC1605300rsO2 = new EnumC1605300rsO("COLLECT_BANNER", 1);
        COLLECT_BANNER = enumC1605300rsO2;
        EnumC1605300rsO enumC1605300rsO3 = new EnumC1605300rsO("AI_SUMMARY_BANNER", 2);
        AI_SUMMARY_BANNER = enumC1605300rsO3;
        EnumC1605300rsO[] enumC1605300rsOArr = {enumC1605300rsO, enumC1605300rsO2, enumC1605300rsO3};
        LL = enumC1605300rsOArr;
        LLILLJJLI = new C2254308sP(enumC1605300rsOArr);
    }

    public static EnumC1605300rsO[] values() {
        return (EnumC1605300rsO[]) LL.clone();
    }

    public static EnumC1605300rsO valueOf(String str) {
        return (EnumC1605300rsO) C08FF.LIZ(EnumC1605300rsO.class, str);
    }

    public EnumC1605300rsO(String str, int i) {
    }
}
