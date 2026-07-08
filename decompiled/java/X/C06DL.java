package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06DL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DL {
    public static final C06DL CONVERSATION_ID;
    public static final C06DL CONVERSATION_TYPE;
    public static final C06DL ENABLE_RESTORE;
    public static final C06DL ENTER_FROM;
    public static final /* synthetic */ C06DL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06DL MSG_SCENE;
    public static final C06DL PET_STATUS;
    public static final C06DL PET_SUB_STATUS;
    public static final C06DL STREAK_CNT;
    public static final C06DL STREAK_LEVEL;
    public static final C06DL STREAK_STATUS;
    public final String LL;

    public static InterfaceC2044707zh<C06DL> getEntries() {
        return LLILLL;
    }

    static {
        C06DL c06dl = new C06DL("MSG_SCENE", 0, "msg_scene");
        MSG_SCENE = c06dl;
        C06DL c06dl2 = new C06DL("CONVERSATION_ID", 1, "conversation_id");
        CONVERSATION_ID = c06dl2;
        C06DL c06dl3 = new C06DL("CONVERSATION_TYPE", 2, "conversation_type");
        CONVERSATION_TYPE = c06dl3;
        C06DL c06dl4 = new C06DL("ENTER_FROM", 3, "enter_from");
        ENTER_FROM = c06dl4;
        C06DL c06dl5 = new C06DL("STREAK_CNT", 4, "streak_cnt");
        STREAK_CNT = c06dl5;
        C06DL c06dl6 = new C06DL("STREAK_LEVEL", 5, "streak_level");
        STREAK_LEVEL = c06dl6;
        C06DL c06dl7 = new C06DL("ENABLE_RESTORE", 6, "enable_restore");
        ENABLE_RESTORE = c06dl7;
        C06DL c06dl8 = new C06DL("STREAK_STATUS", 7, "streak_status");
        STREAK_STATUS = c06dl8;
        C06DL c06dl9 = new C06DL("PET_STATUS", 8, "pet_status");
        PET_STATUS = c06dl9;
        C06DL c06dl10 = new C06DL("PET_SUB_STATUS", 9, "pet_sub_status");
        PET_SUB_STATUS = c06dl10;
        C06DL[] c06dlArr = {c06dl, c06dl2, c06dl3, c06dl4, c06dl5, c06dl6, c06dl7, c06dl8, c06dl9, c06dl10};
        LLILLJJLI = c06dlArr;
        LLILLL = new C2254308sP(c06dlArr);
    }

    public static C06DL[] values() {
        return (C06DL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06DL valueOf(String str) {
        return (C06DL) C08FF.LIZ(C06DL.class, str);
    }

    public C06DL(String str, int i, String str2) {
        this.LL = str2;
    }
}
