package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1579060rC4 {
    public static final EnumC1579060rC4 CAPSULE;
    public static final /* synthetic */ EnumC1579060rC4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1579060rC4 RECTANGLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1579060rC4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1579060rC4 enumC1579060rC4 = new EnumC1579060rC4("CAPSULE", 0, 16);
        CAPSULE = enumC1579060rC4;
        EnumC1579060rC4 enumC1579060rC42 = new EnumC1579060rC4("RECTANGLE", 1, 5);
        RECTANGLE = enumC1579060rC42;
        EnumC1579060rC4[] enumC1579060rC4Arr = {enumC1579060rC4, enumC1579060rC42};
        LLILLJJLI = enumC1579060rC4Arr;
        LLILLL = new C2254308sP(enumC1579060rC4Arr);
    }

    public static EnumC1579060rC4[] values() {
        return (EnumC1579060rC4[]) LLILLJJLI.clone();
    }

    public final int getCornerRadiusDp() {
        return this.LL;
    }

    public static EnumC1579060rC4 valueOf(String str) {
        return (EnumC1579060rC4) C08FF.LIZ(EnumC1579060rC4.class, str);
    }

    public EnumC1579060rC4(String str, int i, int i2) {
        this.LL = i2;
    }
}
