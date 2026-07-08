package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC879230YeP {
    public static final EnumC879230YeP AI_OTHER;
    public static final EnumC879230YeP AI_SELF;
    public static final C879220YeO Companion;
    public static final /* synthetic */ EnumC879230YeP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC879230YeP OTHER;
    public static final EnumC879230YeP SELF;

    public static InterfaceC2044707zh<EnumC879230YeP> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0YeO] */
    static {
        EnumC879230YeP enumC879230YeP = new EnumC879230YeP("SELF", 0);
        SELF = enumC879230YeP;
        EnumC879230YeP enumC879230YeP2 = new EnumC879230YeP("OTHER", 1);
        OTHER = enumC879230YeP2;
        EnumC879230YeP enumC879230YeP3 = new EnumC879230YeP("AI_SELF", 2);
        AI_SELF = enumC879230YeP3;
        EnumC879230YeP enumC879230YeP4 = new EnumC879230YeP("AI_OTHER", 3);
        AI_OTHER = enumC879230YeP4;
        EnumC879230YeP[] enumC879230YePArr = {enumC879230YeP, enumC879230YeP2, enumC879230YeP3, enumC879230YeP4};
        LL = enumC879230YePArr;
        LLILLJJLI = new C2254308sP(enumC879230YePArr);
        Companion = new Object() { // from class: X.0YeO
        };
    }

    public static EnumC879230YeP[] values() {
        return (EnumC879230YeP[]) LL.clone();
    }

    public final boolean isBot() {
        return this == AI_SELF || this == AI_OTHER;
    }

    public final boolean isSelf() {
        return this == SELF || this == AI_SELF;
    }

    public static EnumC879230YeP valueOf(String str) {
        return (EnumC879230YeP) C08FF.LIZ(EnumC879230YeP.class, str);
    }

    public EnumC879230YeP(String str, int i) {
    }
}
