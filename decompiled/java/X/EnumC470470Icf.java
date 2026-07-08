package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Icf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC470470Icf {
    public static final EnumC470470Icf FIRST_SEI;
    public static final /* synthetic */ EnumC470470Icf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC470470Icf NONE;
    public static final EnumC470470Icf OTHER_SEI;
    public static final EnumC470470Icf ROOM_ENTER;
    public static final EnumC470470Icf SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC470470Icf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC470470Icf enumC470470Icf = new EnumC470470Icf("NONE", 0, "none");
        NONE = enumC470470Icf;
        EnumC470470Icf enumC470470Icf2 = new EnumC470470Icf("SUCCESS", 1, "success");
        SUCCESS = enumC470470Icf2;
        EnumC470470Icf enumC470470Icf3 = new EnumC470470Icf("ROOM_ENTER", 2, "room_enter");
        ROOM_ENTER = enumC470470Icf3;
        EnumC470470Icf enumC470470Icf4 = new EnumC470470Icf("FIRST_SEI", 3, "first_sei");
        FIRST_SEI = enumC470470Icf4;
        EnumC470470Icf enumC470470Icf5 = new EnumC470470Icf("OTHER_SEI", 4, "other_sei");
        OTHER_SEI = enumC470470Icf5;
        EnumC470470Icf[] enumC470470IcfArr = {enumC470470Icf, enumC470470Icf2, enumC470470Icf3, enumC470470Icf4, enumC470470Icf5};
        LLILLJJLI = enumC470470IcfArr;
        LLILLL = new C2254308sP(enumC470470IcfArr);
    }

    public static EnumC470470Icf[] values() {
        return (EnumC470470Icf[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC470470Icf valueOf(String str) {
        return (EnumC470470Icf) C08FF.LIZ(EnumC470470Icf.class, str);
    }

    public EnumC470470Icf(String str, int i, String str2) {
        this.LL = str2;
    }
}
