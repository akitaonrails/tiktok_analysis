package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21180817ug {
    public static final EnumC21180817ug ENTER_ROOM_ASYNC;
    public static final EnumC21180817ug ENTER_ROOM_SYNC;
    public static final EnumC21180817ug INTERACTION;
    public static final /* synthetic */ EnumC21180817ug[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21180817ug MESSAGE_CLOSE;
    public static final EnumC21180817ug MESSAGE_FORCE_GLOBAL;
    public static final EnumC21180817ug MESSAGE_PIN;
    public static final EnumC21180817ug MESSAGE_REFRESH_GLOBAL;
    public static final EnumC21180817ug MESSAGE_REFRESH_PART;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21180817ug> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21180817ug enumC21180817ug = new EnumC21180817ug("ENTER_ROOM_SYNC", 0, "enter_room_sync");
        ENTER_ROOM_SYNC = enumC21180817ug;
        EnumC21180817ug enumC21180817ug2 = new EnumC21180817ug("ENTER_ROOM_ASYNC", 1, "enter_room_async");
        ENTER_ROOM_ASYNC = enumC21180817ug2;
        EnumC21180817ug enumC21180817ug3 = new EnumC21180817ug("MESSAGE_PIN", 2, "message_pin");
        MESSAGE_PIN = enumC21180817ug3;
        EnumC21180817ug enumC21180817ug4 = new EnumC21180817ug("MESSAGE_REFRESH_PART", 3, "message_refresh_part");
        MESSAGE_REFRESH_PART = enumC21180817ug4;
        EnumC21180817ug enumC21180817ug5 = new EnumC21180817ug("MESSAGE_REFRESH_GLOBAL", 4, "message_refresh_global");
        MESSAGE_REFRESH_GLOBAL = enumC21180817ug5;
        EnumC21180817ug enumC21180817ug6 = new EnumC21180817ug("MESSAGE_FORCE_GLOBAL", 5, "message_force_global");
        MESSAGE_FORCE_GLOBAL = enumC21180817ug6;
        EnumC21180817ug enumC21180817ug7 = new EnumC21180817ug("MESSAGE_CLOSE", 6, "message_close");
        MESSAGE_CLOSE = enumC21180817ug7;
        EnumC21180817ug enumC21180817ug8 = new EnumC21180817ug("INTERACTION", 7, "interaction");
        INTERACTION = enumC21180817ug8;
        EnumC21180817ug[] enumC21180817ugArr = {enumC21180817ug, enumC21180817ug2, enumC21180817ug3, enumC21180817ug4, enumC21180817ug5, enumC21180817ug6, enumC21180817ug7, enumC21180817ug8};
        LLILLJJLI = enumC21180817ugArr;
        LLILLL = new C2254308sP(enumC21180817ugArr);
    }

    public static EnumC21180817ug[] values() {
        return (EnumC21180817ug[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21180817ug valueOf(String str) {
        return (EnumC21180817ug) C08FF.LIZ(EnumC21180817ug.class, str);
    }

    public EnumC21180817ug(String str, int i, String str2) {
        this.LL = str2;
    }
}
