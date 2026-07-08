package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2219721BuE {
    public static final C2219801BuM Companion;
    public static final /* synthetic */ EnumC2219721BuE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2219721BuE LONG;
    public static final EnumC2219721BuE SHORT;
    public static final EnumC2219721BuE SHORT_HEAVY;
    public static final EnumC2219721BuE SHORT_LIGHT;
    public static final EnumC2219721BuE SHORT_MEDIUM;

    public static InterfaceC2044707zh<EnumC2219721BuE> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1BuM] */
    static {
        EnumC2219721BuE enumC2219721BuE = new EnumC2219721BuE("SHORT_LIGHT", 0);
        SHORT_LIGHT = enumC2219721BuE;
        EnumC2219721BuE enumC2219721BuE2 = new EnumC2219721BuE("SHORT_MEDIUM", 1);
        SHORT_MEDIUM = enumC2219721BuE2;
        EnumC2219721BuE enumC2219721BuE3 = new EnumC2219721BuE("SHORT_HEAVY", 2);
        SHORT_HEAVY = enumC2219721BuE3;
        EnumC2219721BuE enumC2219721BuE4 = new EnumC2219721BuE("LONG", 3);
        LONG = enumC2219721BuE4;
        EnumC2219721BuE[] enumC2219721BuEArr = {enumC2219721BuE, enumC2219721BuE2, enumC2219721BuE3, enumC2219721BuE4};
        LL = enumC2219721BuEArr;
        LLILLJJLI = new C2254308sP(enumC2219721BuEArr);
        Companion = new Object() { // from class: X.1BuM
        };
        SHORT = enumC2219721BuE;
    }

    public static EnumC2219721BuE[] values() {
        return (EnumC2219721BuE[]) LL.clone();
    }

    public static EnumC2219721BuE valueOf(String str) {
        return (EnumC2219721BuE) C08FF.LIZ(EnumC2219721BuE.class, str);
    }

    public EnumC2219721BuE(String str, int i) {
    }
}
