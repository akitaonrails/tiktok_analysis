package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1085350eLl {
    public static final EnumC1085350eLl CANCEL;
    public static final EnumC1085350eLl LEAVE_ROOM;
    public static final EnumC1085350eLl LIVE_END;
    public static final /* synthetic */ EnumC1085350eLl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1085350eLl NULL;
    public static final EnumC1085350eLl REPLACE;
    public static final EnumC1085350eLl TIME_OUT;

    public static InterfaceC2044707zh<EnumC1085350eLl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1085350eLl enumC1085350eLl = new EnumC1085350eLl("TIME_OUT", 0);
        TIME_OUT = enumC1085350eLl;
        EnumC1085350eLl enumC1085350eLl2 = new EnumC1085350eLl("CANCEL", 1);
        CANCEL = enumC1085350eLl2;
        EnumC1085350eLl enumC1085350eLl3 = new EnumC1085350eLl("REPLACE", 2);
        REPLACE = enumC1085350eLl3;
        EnumC1085350eLl enumC1085350eLl4 = new EnumC1085350eLl("LEAVE_ROOM", 3);
        LEAVE_ROOM = enumC1085350eLl4;
        EnumC1085350eLl enumC1085350eLl5 = new EnumC1085350eLl("LIVE_END", 4);
        LIVE_END = enumC1085350eLl5;
        EnumC1085350eLl enumC1085350eLl6 = new EnumC1085350eLl("NULL", 5);
        NULL = enumC1085350eLl6;
        EnumC1085350eLl[] enumC1085350eLlArr = {enumC1085350eLl, enumC1085350eLl2, enumC1085350eLl3, enumC1085350eLl4, enumC1085350eLl5, enumC1085350eLl6};
        LL = enumC1085350eLlArr;
        LLILLJJLI = new C2254308sP(enumC1085350eLlArr);
    }

    public static EnumC1085350eLl[] values() {
        return (EnumC1085350eLl[]) LL.clone();
    }

    public static EnumC1085350eLl valueOf(String str) {
        return (EnumC1085350eLl) C08FF.LIZ(EnumC1085350eLl.class, str);
    }

    public EnumC1085350eLl(String str, int i) {
    }
}
