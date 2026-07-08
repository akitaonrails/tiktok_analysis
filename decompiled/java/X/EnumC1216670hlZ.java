package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216670hlZ {
    public static final EnumC1216670hlZ FIRST_GENERATING;
    public static final EnumC1216670hlZ GENERATED;
    public static final EnumC1216670hlZ IN_QUEUE;
    public static final /* synthetic */ EnumC1216670hlZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216670hlZ NONE;
    public static final EnumC1216670hlZ REGENERATING;

    public static InterfaceC2044707zh<EnumC1216670hlZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216670hlZ enumC1216670hlZ = new EnumC1216670hlZ("NONE", 0);
        NONE = enumC1216670hlZ;
        EnumC1216670hlZ enumC1216670hlZ2 = new EnumC1216670hlZ("IN_QUEUE", 1);
        IN_QUEUE = enumC1216670hlZ2;
        EnumC1216670hlZ enumC1216670hlZ3 = new EnumC1216670hlZ("FIRST_GENERATING", 2);
        FIRST_GENERATING = enumC1216670hlZ3;
        EnumC1216670hlZ enumC1216670hlZ4 = new EnumC1216670hlZ("GENERATED", 3);
        GENERATED = enumC1216670hlZ4;
        EnumC1216670hlZ enumC1216670hlZ5 = new EnumC1216670hlZ("REGENERATING", 4);
        REGENERATING = enumC1216670hlZ5;
        EnumC1216670hlZ[] enumC1216670hlZArr = {enumC1216670hlZ, enumC1216670hlZ2, enumC1216670hlZ3, enumC1216670hlZ4, enumC1216670hlZ5};
        LL = enumC1216670hlZArr;
        LLILLJJLI = new C2254308sP(enumC1216670hlZArr);
    }

    public static EnumC1216670hlZ[] values() {
        return (EnumC1216670hlZ[]) LL.clone();
    }

    public static EnumC1216670hlZ valueOf(String str) {
        return (EnumC1216670hlZ) C08FF.LIZ(EnumC1216670hlZ.class, str);
    }

    public EnumC1216670hlZ(String str, int i) {
    }
}
