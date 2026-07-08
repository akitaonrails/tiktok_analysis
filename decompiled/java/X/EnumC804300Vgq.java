package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC804300Vgq {
    public static final /* synthetic */ EnumC804300Vgq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC804300Vgq NONE;
    public static final EnumC804300Vgq ONE;
    public static final EnumC804300Vgq TWO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC804300Vgq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC804300Vgq enumC804300Vgq = new EnumC804300Vgq("NONE", 0, -1);
        NONE = enumC804300Vgq;
        EnumC804300Vgq enumC804300Vgq2 = new EnumC804300Vgq("ONE", 1, 1);
        ONE = enumC804300Vgq2;
        EnumC804300Vgq enumC804300Vgq3 = new EnumC804300Vgq("TWO", 2, 2);
        TWO = enumC804300Vgq3;
        EnumC804300Vgq[] enumC804300VgqArr = {enumC804300Vgq, enumC804300Vgq2, enumC804300Vgq3};
        LLILLJJLI = enumC804300VgqArr;
        LLILLL = new C2254308sP(enumC804300VgqArr);
    }

    public static EnumC804300Vgq[] values() {
        return (EnumC804300Vgq[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC804300Vgq valueOf(String str) {
        return (EnumC804300Vgq) C08FF.LIZ(EnumC804300Vgq.class, str);
    }

    public EnumC804300Vgq(String str, int i, int i2) {
        this.LL = i2;
    }
}
