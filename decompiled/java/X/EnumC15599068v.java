package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.068v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15599068v {
    public static final EnumC15599068v COMMON_CHAT_NOTICE_GET_MESSAGE_EVENT;
    public static final EnumC15599068v COMMON_CHAT_NOTICE_SEND_MESSAGE_EVENT;
    public static final EnumC15599068v COMMON_LOCAL_TASK;
    public static final EnumC15599068v FETCH_NOTICE;
    public static final EnumC15599068v GROUP_CHAT_NOTICE_GET_MESSAGE_EVENT;
    public static final EnumC15599068v GROUP_CHAT_NOTICE_SEND_MESSAGE_EVENT;
    public static final EnumC15599068v GROUP_LOCAL_TASK;
    public static final /* synthetic */ EnumC15599068v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC15599068v LOAD_ROOM;
    public static final EnumC15599068v ON_SEND_UPDATE_MESSAGE_LIST;
    public static final EnumC15599068v SINGLE_CHAT_NOTICE_GET_MESSAGE_EVENT;
    public static final EnumC15599068v SINGLE_CHAT_NOTICE_SEND_MESSAGE_EVENT;
    public static final EnumC15599068v SINGLE_LOCAL_TASK;
    public static final EnumC15599068v UPDATE_MESSAGE_LIST;

    public static InterfaceC2044707zh<EnumC15599068v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC15599068v enumC15599068v = new EnumC15599068v("LOAD_ROOM", 0);
        LOAD_ROOM = enumC15599068v;
        EnumC15599068v enumC15599068v2 = new EnumC15599068v("UPDATE_MESSAGE_LIST", 1);
        UPDATE_MESSAGE_LIST = enumC15599068v2;
        EnumC15599068v enumC15599068v3 = new EnumC15599068v("ON_SEND_UPDATE_MESSAGE_LIST", 2);
        ON_SEND_UPDATE_MESSAGE_LIST = enumC15599068v3;
        EnumC15599068v enumC15599068v4 = new EnumC15599068v("SINGLE_LOCAL_TASK", 3);
        SINGLE_LOCAL_TASK = enumC15599068v4;
        EnumC15599068v enumC15599068v5 = new EnumC15599068v("GROUP_LOCAL_TASK", 4);
        GROUP_LOCAL_TASK = enumC15599068v5;
        EnumC15599068v enumC15599068v6 = new EnumC15599068v("COMMON_LOCAL_TASK", 5);
        COMMON_LOCAL_TASK = enumC15599068v6;
        EnumC15599068v enumC15599068v7 = new EnumC15599068v("COMMON_CHAT_NOTICE_SEND_MESSAGE_EVENT", 6);
        COMMON_CHAT_NOTICE_SEND_MESSAGE_EVENT = enumC15599068v7;
        EnumC15599068v enumC15599068v8 = new EnumC15599068v("SINGLE_CHAT_NOTICE_SEND_MESSAGE_EVENT", 7);
        SINGLE_CHAT_NOTICE_SEND_MESSAGE_EVENT = enumC15599068v8;
        EnumC15599068v enumC15599068v9 = new EnumC15599068v("GROUP_CHAT_NOTICE_SEND_MESSAGE_EVENT", 8);
        GROUP_CHAT_NOTICE_SEND_MESSAGE_EVENT = enumC15599068v9;
        EnumC15599068v enumC15599068v10 = new EnumC15599068v("COMMON_CHAT_NOTICE_GET_MESSAGE_EVENT", 9);
        COMMON_CHAT_NOTICE_GET_MESSAGE_EVENT = enumC15599068v10;
        EnumC15599068v enumC15599068v11 = new EnumC15599068v("SINGLE_CHAT_NOTICE_GET_MESSAGE_EVENT", 10);
        SINGLE_CHAT_NOTICE_GET_MESSAGE_EVENT = enumC15599068v11;
        EnumC15599068v enumC15599068v12 = new EnumC15599068v("GROUP_CHAT_NOTICE_GET_MESSAGE_EVENT", 11);
        GROUP_CHAT_NOTICE_GET_MESSAGE_EVENT = enumC15599068v12;
        EnumC15599068v enumC15599068v13 = new EnumC15599068v("FETCH_NOTICE", 12);
        FETCH_NOTICE = enumC15599068v13;
        EnumC15599068v[] enumC15599068vArr = {enumC15599068v, enumC15599068v2, enumC15599068v3, enumC15599068v4, enumC15599068v5, enumC15599068v6, enumC15599068v7, enumC15599068v8, enumC15599068v9, enumC15599068v10, enumC15599068v11, enumC15599068v12, enumC15599068v13};
        LL = enumC15599068vArr;
        LLILLJJLI = new C2254308sP(enumC15599068vArr);
    }

    public static EnumC15599068v[] values() {
        return (EnumC15599068v[]) LL.clone();
    }

    public static EnumC15599068v valueOf(String str) {
        return (EnumC15599068v) C08FF.LIZ(EnumC15599068v.class, str);
    }

    public EnumC15599068v(String str, int i) {
    }
}
