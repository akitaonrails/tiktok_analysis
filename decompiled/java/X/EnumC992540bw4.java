package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992540bw4 {
    public static final EnumC992540bw4 IM_USER_GROUP_PERMISSION_CHECK_AB;
    public static final EnumC992540bw4 IM_USER_GROUP_PERMISSION_CHECK_AGE;
    public static final EnumC992540bw4 IM_USER_GROUP_PERMISSION_CHECK_PUNISH;
    public static final EnumC992540bw4 IM_USER_GROUP_PERMISSION_CHECK_REGION;
    public static final EnumC992540bw4 IM_USER_GROUP_PERMISSION_CHECK_UNKNOWN;
    public static final /* synthetic */ EnumC992540bw4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992540bw4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992540bw4 enumC992540bw4 = new EnumC992540bw4("IM_USER_GROUP_PERMISSION_CHECK_UNKNOWN", 0, 0);
        IM_USER_GROUP_PERMISSION_CHECK_UNKNOWN = enumC992540bw4;
        EnumC992540bw4 enumC992540bw42 = new EnumC992540bw4("IM_USER_GROUP_PERMISSION_CHECK_REGION", 1, 1);
        IM_USER_GROUP_PERMISSION_CHECK_REGION = enumC992540bw42;
        EnumC992540bw4 enumC992540bw43 = new EnumC992540bw4("IM_USER_GROUP_PERMISSION_CHECK_AGE", 2, 2);
        IM_USER_GROUP_PERMISSION_CHECK_AGE = enumC992540bw43;
        EnumC992540bw4 enumC992540bw44 = new EnumC992540bw4("IM_USER_GROUP_PERMISSION_CHECK_PUNISH", 3, 3);
        IM_USER_GROUP_PERMISSION_CHECK_PUNISH = enumC992540bw44;
        EnumC992540bw4 enumC992540bw45 = new EnumC992540bw4("IM_USER_GROUP_PERMISSION_CHECK_AB", 4, 4);
        IM_USER_GROUP_PERMISSION_CHECK_AB = enumC992540bw45;
        EnumC992540bw4[] enumC992540bw4Arr = {enumC992540bw4, enumC992540bw42, enumC992540bw43, enumC992540bw44, enumC992540bw45};
        LLILLJJLI = enumC992540bw4Arr;
        LLILLL = new C2254308sP(enumC992540bw4Arr);
    }

    public static EnumC992540bw4[] values() {
        return (EnumC992540bw4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992540bw4 valueOf(String str) {
        return (EnumC992540bw4) C08FF.LIZ(EnumC992540bw4.class, str);
    }

    public EnumC992540bw4(String str, int i, int i2) {
        this.LL = i2;
    }
}
