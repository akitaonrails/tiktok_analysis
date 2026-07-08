package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778350wNV {
    public static final EnumC1778350wNV APPLIED;
    public static final /* synthetic */ EnumC1778350wNV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778350wNV NONE;
    public static final EnumC1778350wNV NO_BADGE;

    public static InterfaceC2044707zh<EnumC1778350wNV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778350wNV enumC1778350wNV = new EnumC1778350wNV("NONE", 0);
        NONE = enumC1778350wNV;
        EnumC1778350wNV enumC1778350wNV2 = new EnumC1778350wNV("NO_BADGE", 1);
        NO_BADGE = enumC1778350wNV2;
        EnumC1778350wNV enumC1778350wNV3 = new EnumC1778350wNV("APPLIED", 2);
        APPLIED = enumC1778350wNV3;
        EnumC1778350wNV[] enumC1778350wNVArr = {enumC1778350wNV, enumC1778350wNV2, enumC1778350wNV3};
        LL = enumC1778350wNVArr;
        LLILLJJLI = new C2254308sP(enumC1778350wNVArr);
    }

    public static EnumC1778350wNV[] values() {
        return (EnumC1778350wNV[]) LL.clone();
    }

    public static EnumC1778350wNV valueOf(String str) {
        return (EnumC1778350wNV) C08FF.LIZ(EnumC1778350wNV.class, str);
    }

    public EnumC1778350wNV(String str, int i) {
    }
}
