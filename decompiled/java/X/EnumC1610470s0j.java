package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1610470s0j {
    public static final EnumC1610470s0j FEED;
    public static final /* synthetic */ EnumC1610470s0j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1610470s0j MEDIUM;
    public static final EnumC1610470s0j NORMAL;
    public static final EnumC1610470s0j SKYLIGHT;
    public static final EnumC1610470s0j SPECIAL_STRONG;
    public static final EnumC1610470s0j STRONG;

    public static InterfaceC2044707zh<EnumC1610470s0j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1610470s0j enumC1610470s0j = new EnumC1610470s0j("NORMAL", 0);
        NORMAL = enumC1610470s0j;
        EnumC1610470s0j enumC1610470s0j2 = new EnumC1610470s0j("SKYLIGHT", 1);
        SKYLIGHT = enumC1610470s0j2;
        EnumC1610470s0j enumC1610470s0j3 = new EnumC1610470s0j("FEED", 2);
        FEED = enumC1610470s0j3;
        EnumC1610470s0j enumC1610470s0j4 = new EnumC1610470s0j("STRONG", 3);
        STRONG = enumC1610470s0j4;
        EnumC1610470s0j enumC1610470s0j5 = new EnumC1610470s0j("MEDIUM", 4);
        MEDIUM = enumC1610470s0j5;
        EnumC1610470s0j enumC1610470s0j6 = new EnumC1610470s0j("SPECIAL_STRONG", 5);
        SPECIAL_STRONG = enumC1610470s0j6;
        EnumC1610470s0j[] enumC1610470s0jArr = {enumC1610470s0j, enumC1610470s0j2, enumC1610470s0j3, enumC1610470s0j4, enumC1610470s0j5, enumC1610470s0j6};
        LL = enumC1610470s0jArr;
        LLILLJJLI = new C2254308sP(enumC1610470s0jArr);
    }

    public static EnumC1610470s0j[] values() {
        return (EnumC1610470s0j[]) LL.clone();
    }

    public static EnumC1610470s0j valueOf(String str) {
        return (EnumC1610470s0j) C08FF.LIZ(EnumC1610470s0j.class, str);
    }

    public EnumC1610470s0j(String str, int i) {
    }
}
