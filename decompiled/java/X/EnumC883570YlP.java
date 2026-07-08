package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC883570YlP {
    public static final EnumC883570YlP ENTER_CHAT_ROOM;
    public static final EnumC883570YlP ENTER_SESSION_LIST;
    public static final EnumC883570YlP ENTER_SHARE_PANEL;
    public static final EnumC883570YlP GROUP_CHAT_RELATED;
    public static final EnumC883570YlP LAUNCH_FROM_OUT_PUSH;
    public static final /* synthetic */ EnumC883570YlP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC883570YlP ON_RECEIVE_SHARER_INFO;
    public static final EnumC883570YlP RELATION_BUTTON;
    public static final EnumC883570YlP SEND_TO_DIALOG;

    public static InterfaceC2044707zh<EnumC883570YlP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC883570YlP enumC883570YlP = new EnumC883570YlP("ENTER_SESSION_LIST", 0);
        ENTER_SESSION_LIST = enumC883570YlP;
        EnumC883570YlP enumC883570YlP2 = new EnumC883570YlP("ENTER_SHARE_PANEL", 1);
        ENTER_SHARE_PANEL = enumC883570YlP2;
        EnumC883570YlP enumC883570YlP3 = new EnumC883570YlP("ENTER_CHAT_ROOM", 2);
        ENTER_CHAT_ROOM = enumC883570YlP3;
        EnumC883570YlP enumC883570YlP4 = new EnumC883570YlP("LAUNCH_FROM_OUT_PUSH", 3);
        LAUNCH_FROM_OUT_PUSH = enumC883570YlP4;
        EnumC883570YlP enumC883570YlP5 = new EnumC883570YlP("ON_RECEIVE_SHARER_INFO", 4);
        ON_RECEIVE_SHARER_INFO = enumC883570YlP5;
        EnumC883570YlP enumC883570YlP6 = new EnumC883570YlP("SEND_TO_DIALOG", 5);
        SEND_TO_DIALOG = enumC883570YlP6;
        EnumC883570YlP enumC883570YlP7 = new EnumC883570YlP("RELATION_BUTTON", 6);
        RELATION_BUTTON = enumC883570YlP7;
        EnumC883570YlP enumC883570YlP8 = new EnumC883570YlP("GROUP_CHAT_RELATED", 7);
        GROUP_CHAT_RELATED = enumC883570YlP8;
        EnumC883570YlP[] enumC883570YlPArr = {enumC883570YlP, enumC883570YlP2, enumC883570YlP3, enumC883570YlP4, enumC883570YlP5, enumC883570YlP6, enumC883570YlP7, enumC883570YlP8};
        LL = enumC883570YlPArr;
        LLILLJJLI = new C2254308sP(enumC883570YlPArr);
    }

    public static EnumC883570YlP[] values() {
        return (EnumC883570YlP[]) LL.clone();
    }

    public static EnumC883570YlP valueOf(String str) {
        return (EnumC883570YlP) C08FF.LIZ(EnumC883570YlP.class, str);
    }

    public EnumC883570YlP(String str, int i) {
    }
}
