package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15VN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VN implements Serializable {
    public static final C15VS Companion;
    public static final C15VN EXPLORE_CHAT_GROUP_VERIFY_STATUS_CAN_JOIN;
    public static final C15VN EXPLORE_CHAT_GROUP_VERIFY_STATUS_FULL;
    public static final C15VN EXPLORE_CHAT_GROUP_VERIFY_STATUS_IN_GROUP;
    public static final C15VN EXPLORE_CHAT_GROUP_VERIFY_STATUS_NOT_QUALIFIED;
    public static final C15VN EXPLORE_CHAT_GROUP_VERIFY_STATUS_REQUEST_PENDING_APPROVAL;
    public static final C15VN EXPLORE_INSERT_CARD_TYPE_DEFAULT;
    public static final /* synthetic */ C15VN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static final C15VN fromValue(Integer num) {
        Companion.getClass();
        return C15VS.LIZ(num);
    }

    public static InterfaceC2044707zh<C15VN> getEntries() {
        return LLILLL;
    }

    public static final EnumC1229960i70 mapToUserGroupStatus(C15VN c15vn) {
        Companion.getClass();
        return C15VS.LIZIZ(c15vn);
    }

    static {
        C15VN c15vn = new C15VN("EXPLORE_INSERT_CARD_TYPE_DEFAULT", 0, 0);
        EXPLORE_INSERT_CARD_TYPE_DEFAULT = c15vn;
        C15VN c15vn2 = new C15VN("EXPLORE_CHAT_GROUP_VERIFY_STATUS_CAN_JOIN", 1, 1);
        EXPLORE_CHAT_GROUP_VERIFY_STATUS_CAN_JOIN = c15vn2;
        C15VN c15vn3 = new C15VN("EXPLORE_CHAT_GROUP_VERIFY_STATUS_IN_GROUP", 2, 2);
        EXPLORE_CHAT_GROUP_VERIFY_STATUS_IN_GROUP = c15vn3;
        C15VN c15vn4 = new C15VN("EXPLORE_CHAT_GROUP_VERIFY_STATUS_NOT_QUALIFIED", 3, 3);
        EXPLORE_CHAT_GROUP_VERIFY_STATUS_NOT_QUALIFIED = c15vn4;
        C15VN c15vn5 = new C15VN("EXPLORE_CHAT_GROUP_VERIFY_STATUS_REQUEST_PENDING_APPROVAL", 4, 4);
        EXPLORE_CHAT_GROUP_VERIFY_STATUS_REQUEST_PENDING_APPROVAL = c15vn5;
        C15VN c15vn6 = new C15VN("EXPLORE_CHAT_GROUP_VERIFY_STATUS_FULL", 5, 5);
        EXPLORE_CHAT_GROUP_VERIFY_STATUS_FULL = c15vn6;
        C15VN[] c15vnArr = {c15vn, c15vn2, c15vn3, c15vn4, c15vn5, c15vn6};
        LLILLJJLI = c15vnArr;
        LLILLL = new C2254308sP(c15vnArr);
        Companion = new C15VS();
    }

    public static C15VN[] values() {
        return (C15VN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15VN valueOf(String str) {
        return (C15VN) C08FF.LIZ(C15VN.class, str);
    }

    public C15VN(String str, int i, int i2) {
        this.LL = i2;
    }
}
