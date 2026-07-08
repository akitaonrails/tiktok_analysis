package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC814950Vy1 {
    public static final EnumC814950Vy1 DIGITAL_0;
    public static final EnumC814950Vy1 DIGITAL_1;
    public static final /* synthetic */ EnumC814950Vy1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC814950Vy1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC814950Vy1 enumC814950Vy1 = new EnumC814950Vy1("DIGITAL_0", 0, 0);
        DIGITAL_0 = enumC814950Vy1;
        EnumC814950Vy1 enumC814950Vy12 = new EnumC814950Vy1("DIGITAL_1", 1, 1);
        DIGITAL_1 = enumC814950Vy12;
        EnumC814950Vy1[] enumC814950Vy1Arr = {enumC814950Vy1, enumC814950Vy12};
        LLILLJJLI = enumC814950Vy1Arr;
        LLILLL = new C2254308sP(enumC814950Vy1Arr);
    }

    public static EnumC814950Vy1[] values() {
        return (EnumC814950Vy1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC814950Vy1 valueOf(String str) {
        return (EnumC814950Vy1) C08FF.LIZ(EnumC814950Vy1.class, str);
    }

    public EnumC814950Vy1(String str, int i, int i2) {
        this.LL = i2;
    }
}
