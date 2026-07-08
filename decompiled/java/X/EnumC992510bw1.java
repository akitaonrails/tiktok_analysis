package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992510bw1 {
    public static final EnumC992510bw1 ACCEPT;
    public static final /* synthetic */ EnumC992510bw1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992510bw1 NOT_SET;
    public static final EnumC992510bw1 NO_ACCEPT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992510bw1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992510bw1 enumC992510bw1 = new EnumC992510bw1("NOT_SET", 0, 0);
        NOT_SET = enumC992510bw1;
        EnumC992510bw1 enumC992510bw12 = new EnumC992510bw1("NO_ACCEPT", 1, 1);
        NO_ACCEPT = enumC992510bw12;
        EnumC992510bw1 enumC992510bw13 = new EnumC992510bw1("ACCEPT", 2, 2);
        ACCEPT = enumC992510bw13;
        EnumC992510bw1[] enumC992510bw1Arr = {enumC992510bw1, enumC992510bw12, enumC992510bw13};
        LLILLJJLI = enumC992510bw1Arr;
        LLILLL = new C2254308sP(enumC992510bw1Arr);
    }

    public static EnumC992510bw1[] values() {
        return (EnumC992510bw1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992510bw1 valueOf(String str) {
        return (EnumC992510bw1) C08FF.LIZ(EnumC992510bw1.class, str);
    }

    public EnumC992510bw1(String str, int i, int i2) {
        this.LL = i2;
    }
}
