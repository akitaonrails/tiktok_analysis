package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990707qz {
    public static final EnumC1990707qz DIRECT_BATTLE;
    public static final /* synthetic */ EnumC1990707qz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990707qz NONE;

    public static InterfaceC2044707zh<EnumC1990707qz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990707qz enumC1990707qz = new EnumC1990707qz("NONE", 0);
        NONE = enumC1990707qz;
        EnumC1990707qz enumC1990707qz2 = new EnumC1990707qz("DIRECT_BATTLE", 1);
        DIRECT_BATTLE = enumC1990707qz2;
        EnumC1990707qz[] enumC1990707qzArr = {enumC1990707qz, enumC1990707qz2};
        LL = enumC1990707qzArr;
        LLILLJJLI = new C2254308sP(enumC1990707qzArr);
    }

    public static EnumC1990707qz[] values() {
        return (EnumC1990707qz[]) LL.clone();
    }

    public static EnumC1990707qz valueOf(String str) {
        return (EnumC1990707qz) C08FF.LIZ(EnumC1990707qz.class, str);
    }

    public EnumC1990707qz(String str, int i) {
    }
}
