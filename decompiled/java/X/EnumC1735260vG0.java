package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1735260vG0 {
    public static final EnumC1735260vG0 BLOCKED;
    public static final EnumC1735260vG0 FULL_SCREEN;
    public static final EnumC1735260vG0 HALF_SCREEN;
    public static final /* synthetic */ EnumC1735260vG0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1735260vG0 PDP;
    public static final EnumC1735260vG0 TAB;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1735260vG0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1735260vG0 enumC1735260vG0 = new EnumC1735260vG0("BLOCKED", 0, -1);
        BLOCKED = enumC1735260vG0;
        EnumC1735260vG0 enumC1735260vG02 = new EnumC1735260vG0("TAB", 1, 0);
        TAB = enumC1735260vG02;
        EnumC1735260vG0 enumC1735260vG03 = new EnumC1735260vG0("HALF_SCREEN", 2, 1);
        HALF_SCREEN = enumC1735260vG03;
        EnumC1735260vG0 enumC1735260vG04 = new EnumC1735260vG0("FULL_SCREEN", 3, 2);
        FULL_SCREEN = enumC1735260vG04;
        EnumC1735260vG0 enumC1735260vG05 = new EnumC1735260vG0("PDP", 4, 3);
        PDP = enumC1735260vG05;
        EnumC1735260vG0[] enumC1735260vG0Arr = {enumC1735260vG0, enumC1735260vG02, enumC1735260vG03, enumC1735260vG04, enumC1735260vG05};
        LLILLJJLI = enumC1735260vG0Arr;
        LLILLL = new C2254308sP(enumC1735260vG0Arr);
    }

    public static EnumC1735260vG0[] values() {
        return (EnumC1735260vG0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1735260vG0 valueOf(String str) {
        return (EnumC1735260vG0) C08FF.LIZ(EnumC1735260vG0.class, str);
    }

    public EnumC1735260vG0(String str, int i, int i2) {
        this.LL = i2;
    }
}
