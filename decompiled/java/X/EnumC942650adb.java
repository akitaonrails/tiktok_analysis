package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0adb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC942650adb {
    public static final EnumC942650adb COUNT_DOWN_FOR_ALL;
    public static final EnumC942650adb GUEST_SHOWDOWN;
    public static final EnumC942650adb LETS_DANCE;
    public static final EnumC942650adb LIVE_SHOW;
    public static final /* synthetic */ EnumC942650adb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC942650adb TOP_GUEST;

    public static InterfaceC2044707zh<EnumC942650adb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC942650adb enumC942650adb = new EnumC942650adb("LIVE_SHOW", 0);
        LIVE_SHOW = enumC942650adb;
        EnumC942650adb enumC942650adb2 = new EnumC942650adb("COUNT_DOWN_FOR_ALL", 1);
        COUNT_DOWN_FOR_ALL = enumC942650adb2;
        EnumC942650adb enumC942650adb3 = new EnumC942650adb("GUEST_SHOWDOWN", 2);
        GUEST_SHOWDOWN = enumC942650adb3;
        EnumC942650adb enumC942650adb4 = new EnumC942650adb("TOP_GUEST", 3);
        TOP_GUEST = enumC942650adb4;
        EnumC942650adb enumC942650adb5 = new EnumC942650adb("LETS_DANCE", 4);
        LETS_DANCE = enumC942650adb5;
        EnumC942650adb[] enumC942650adbArr = {enumC942650adb, enumC942650adb2, enumC942650adb3, enumC942650adb4, enumC942650adb5};
        LL = enumC942650adbArr;
        LLILLJJLI = new C2254308sP(enumC942650adbArr);
    }

    public static EnumC942650adb[] values() {
        return (EnumC942650adb[]) LL.clone();
    }

    public static EnumC942650adb valueOf(String str) {
        return (EnumC942650adb) C08FF.LIZ(EnumC942650adb.class, str);
    }

    public EnumC942650adb(String str, int i) {
    }
}
