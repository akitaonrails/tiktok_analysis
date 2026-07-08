package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC951803no {
    public static final EnumC951803no BELOW;
    public static final /* synthetic */ EnumC951803no[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC951803no RIGHT;
    public static final EnumC951803no UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC951803no> getEntries() {
        return LLILLL;
    }

    static {
        EnumC951803no enumC951803no = new EnumC951803no("UNKNOWN", 0, 0);
        UNKNOWN = enumC951803no;
        EnumC951803no enumC951803no2 = new EnumC951803no("RIGHT", 1, 1);
        RIGHT = enumC951803no2;
        EnumC951803no enumC951803no3 = new EnumC951803no("BELOW", 2, 2);
        BELOW = enumC951803no3;
        EnumC951803no[] enumC951803noArr = {enumC951803no, enumC951803no2, enumC951803no3};
        LLILLJJLI = enumC951803noArr;
        LLILLL = new C2254308sP(enumC951803noArr);
    }

    public static EnumC951803no[] values() {
        return (EnumC951803no[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC951803no valueOf(String str) {
        return (EnumC951803no) C08FF.LIZ(EnumC951803no.class, str);
    }

    public EnumC951803no(String str, int i, int i2) {
        this.LL = i2;
    }
}
