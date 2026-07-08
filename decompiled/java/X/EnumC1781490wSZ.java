package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781490wSZ {
    public static final EnumC1781490wSZ EXPAND_ENTRANCE;
    public static final EnumC1781490wSZ EXPAND_ENTRANCE_NO_RESHOW;
    public static final /* synthetic */ EnumC1781490wSZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1781490wSZ MEDITATION_NO_RESHOW;
    public static final EnumC1781490wSZ MEDITATION_RESHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1781490wSZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781490wSZ enumC1781490wSZ = new EnumC1781490wSZ("MEDITATION_RESHOW", 0, 4);
        MEDITATION_RESHOW = enumC1781490wSZ;
        EnumC1781490wSZ enumC1781490wSZ2 = new EnumC1781490wSZ("MEDITATION_NO_RESHOW", 1, 5);
        MEDITATION_NO_RESHOW = enumC1781490wSZ2;
        EnumC1781490wSZ enumC1781490wSZ3 = new EnumC1781490wSZ("EXPAND_ENTRANCE", 2, 6);
        EXPAND_ENTRANCE = enumC1781490wSZ3;
        EnumC1781490wSZ enumC1781490wSZ4 = new EnumC1781490wSZ("EXPAND_ENTRANCE_NO_RESHOW", 3, 7);
        EXPAND_ENTRANCE_NO_RESHOW = enumC1781490wSZ4;
        EnumC1781490wSZ[] enumC1781490wSZArr = {enumC1781490wSZ, enumC1781490wSZ2, enumC1781490wSZ3, enumC1781490wSZ4};
        LLILLJJLI = enumC1781490wSZArr;
        LLILLL = new C2254308sP(enumC1781490wSZArr);
    }

    public static EnumC1781490wSZ[] values() {
        return (EnumC1781490wSZ[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC1781490wSZ valueOf(String str) {
        return (EnumC1781490wSZ) C08FF.LIZ(EnumC1781490wSZ.class, str);
    }

    public EnumC1781490wSZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
