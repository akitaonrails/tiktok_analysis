package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1643006c0 {
    public static final EnumC1643006c0 EVERY_ONE;
    public static final EnumC1643006c0 FRIENDS;
    public static final /* synthetic */ EnumC1643006c0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1643006c0 NO_ONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1643006c0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1643006c0 enumC1643006c0 = new EnumC1643006c0("NO_ONE", 0, 0);
        NO_ONE = enumC1643006c0;
        EnumC1643006c0 enumC1643006c02 = new EnumC1643006c0("EVERY_ONE", 1, 1);
        EVERY_ONE = enumC1643006c02;
        EnumC1643006c0 enumC1643006c03 = new EnumC1643006c0("FRIENDS", 2, 2);
        FRIENDS = enumC1643006c03;
        EnumC1643006c0[] enumC1643006c0Arr = {enumC1643006c0, enumC1643006c02, enumC1643006c03};
        LLILLJJLI = enumC1643006c0Arr;
        LLILLL = new C2254308sP(enumC1643006c0Arr);
    }

    public static EnumC1643006c0[] values() {
        return (EnumC1643006c0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1643006c0 valueOf(String str) {
        return (EnumC1643006c0) C08FF.LIZ(EnumC1643006c0.class, str);
    }

    public EnumC1643006c0(String str, int i, int i2) {
        this.LL = i2;
    }
}
