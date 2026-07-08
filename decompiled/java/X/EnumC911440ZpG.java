package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC911440ZpG {
    public static final EnumC911440ZpG ALL_PUBLIC_GROUP;
    public static final EnumC911440ZpG FAN_GROUP_ONLY;
    public static final /* synthetic */ EnumC911440ZpG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC911440ZpG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC911440ZpG enumC911440ZpG = new EnumC911440ZpG("FAN_GROUP_ONLY", 0);
        FAN_GROUP_ONLY = enumC911440ZpG;
        EnumC911440ZpG enumC911440ZpG2 = new EnumC911440ZpG("ALL_PUBLIC_GROUP", 1);
        ALL_PUBLIC_GROUP = enumC911440ZpG2;
        EnumC911440ZpG[] enumC911440ZpGArr = {enumC911440ZpG, enumC911440ZpG2};
        LL = enumC911440ZpGArr;
        LLILLJJLI = new C2254308sP(enumC911440ZpGArr);
    }

    public static EnumC911440ZpG[] values() {
        return (EnumC911440ZpG[]) LL.clone();
    }

    public static EnumC911440ZpG valueOf(String str) {
        return (EnumC911440ZpG) C08FF.LIZ(EnumC911440ZpG.class, str);
    }

    public EnumC911440ZpG(String str, int i) {
    }
}
