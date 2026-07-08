package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996207rs {
    public static final EnumC1996207rs ENTER_ROOM_SUCCESS;
    public static final EnumC1996207rs FIRST_FRAME;
    public static final /* synthetic */ EnumC1996207rs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1996207rs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1996207rs enumC1996207rs = new EnumC1996207rs("ENTER_ROOM_SUCCESS", 0);
        ENTER_ROOM_SUCCESS = enumC1996207rs;
        EnumC1996207rs enumC1996207rs2 = new EnumC1996207rs("FIRST_FRAME", 1);
        FIRST_FRAME = enumC1996207rs2;
        EnumC1996207rs[] enumC1996207rsArr = {enumC1996207rs, enumC1996207rs2};
        LL = enumC1996207rsArr;
        LLILLJJLI = new C2254308sP(enumC1996207rsArr);
    }

    public static EnumC1996207rs[] values() {
        return (EnumC1996207rs[]) LL.clone();
    }

    public static EnumC1996207rs valueOf(String str) {
        return (EnumC1996207rs) C08FF.LIZ(EnumC1996207rs.class, str);
    }

    public EnumC1996207rs(String str, int i) {
    }
}
