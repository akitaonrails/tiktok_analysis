package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114600c4 {
    public static final EnumC114600c4 COMBINE;
    public static final EnumC114600c4 INDEPENDENT;
    public static final /* synthetic */ EnumC114600c4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114600c4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114600c4 enumC114600c4 = new EnumC114600c4("INDEPENDENT", 0, 0);
        INDEPENDENT = enumC114600c4;
        EnumC114600c4 enumC114600c42 = new EnumC114600c4("COMBINE", 1, 1);
        COMBINE = enumC114600c42;
        EnumC114600c4[] enumC114600c4Arr = {enumC114600c4, enumC114600c42};
        LLILLJJLI = enumC114600c4Arr;
        LLILLL = new C2254308sP(enumC114600c4Arr);
    }

    public static EnumC114600c4[] values() {
        return (EnumC114600c4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC114600c4 valueOf(String str) {
        return (EnumC114600c4) C08FF.LIZ(EnumC114600c4.class, str);
    }

    public EnumC114600c4(String str, int i, int i2) {
        this.LL = i2;
    }
}
