package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0luR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1375930luR {
    public static final EnumC1375930luR ACCOUNT;
    public static final EnumC1375930luR CREATION;
    public static final EnumC1375930luR LIVE;
    public static final /* synthetic */ EnumC1375930luR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1375930luR MAIN;
    public static final EnumC1375930luR MUSIC;
    public static final EnumC1375930luR SEARCH;
    public static final EnumC1375930luR SOCIAL;
    public static final EnumC1375930luR TECH;
    public static final EnumC1375930luR UNKNOWN;

    public static InterfaceC2044707zh<EnumC1375930luR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1375930luR enumC1375930luR = new EnumC1375930luR("UNKNOWN", 0);
        UNKNOWN = enumC1375930luR;
        EnumC1375930luR enumC1375930luR2 = new EnumC1375930luR("LIVE", 1);
        LIVE = enumC1375930luR2;
        EnumC1375930luR enumC1375930luR3 = new EnumC1375930luR("SOCIAL", 2);
        SOCIAL = enumC1375930luR3;
        EnumC1375930luR enumC1375930luR4 = new EnumC1375930luR("ACCOUNT", 3);
        ACCOUNT = enumC1375930luR4;
        EnumC1375930luR enumC1375930luR5 = new EnumC1375930luR("MUSIC", 4);
        MUSIC = enumC1375930luR5;
        EnumC1375930luR enumC1375930luR6 = new EnumC1375930luR("CREATION", 5);
        CREATION = enumC1375930luR6;
        EnumC1375930luR enumC1375930luR7 = new EnumC1375930luR("TECH", 6);
        TECH = enumC1375930luR7;
        EnumC1375930luR enumC1375930luR8 = new EnumC1375930luR("MAIN", 7);
        MAIN = enumC1375930luR8;
        EnumC1375930luR enumC1375930luR9 = new EnumC1375930luR("SEARCH", 8);
        SEARCH = enumC1375930luR9;
        EnumC1375930luR[] enumC1375930luRArr = {enumC1375930luR, enumC1375930luR2, enumC1375930luR3, enumC1375930luR4, enumC1375930luR5, enumC1375930luR6, enumC1375930luR7, enumC1375930luR8, enumC1375930luR9};
        LL = enumC1375930luRArr;
        LLILLJJLI = new C2254308sP(enumC1375930luRArr);
    }

    public static EnumC1375930luR[] values() {
        return (EnumC1375930luR[]) LL.clone();
    }

    public static EnumC1375930luR valueOf(String str) {
        return (EnumC1375930luR) C08FF.LIZ(EnumC1375930luR.class, str);
    }

    public EnumC1375930luR(String str, int i) {
    }
}
