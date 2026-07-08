package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216640hlW {
    public static final EnumC1216640hlW END_GROUP;
    public static final EnumC1216640hlW GO_LIVE_REMINDER;
    public static final EnumC1216640hlW HIDE_MEMBERS;
    public static final EnumC1216640hlW INVITE_BY_LINK;
    public static final EnumC1216640hlW JOIN_REQUEST;
    public static final /* synthetic */ EnumC1216640hlW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216640hlW MANAGE_ADMIN;
    public static final EnumC1216640hlW REMOVE_MEMBER;
    public static final EnumC1216640hlW REQUIRE_APPROVAL;
    public static final EnumC1216640hlW TRANSFER_OWNER;
    public static final EnumC1216640hlW WHO_CAN_JOIN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216640hlW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216640hlW enumC1216640hlW = new EnumC1216640hlW("WHO_CAN_JOIN", 0, R.id.ny9);
        WHO_CAN_JOIN = enumC1216640hlW;
        EnumC1216640hlW enumC1216640hlW2 = new EnumC1216640hlW("REQUIRE_APPROVAL", 1, R.id.ny5);
        REQUIRE_APPROVAL = enumC1216640hlW2;
        EnumC1216640hlW enumC1216640hlW3 = new EnumC1216640hlW("INVITE_BY_LINK", 2, R.id.nxy);
        INVITE_BY_LINK = enumC1216640hlW3;
        EnumC1216640hlW enumC1216640hlW4 = new EnumC1216640hlW("MANAGE_ADMIN", 3, R.id.ny1);
        MANAGE_ADMIN = enumC1216640hlW4;
        EnumC1216640hlW enumC1216640hlW5 = new EnumC1216640hlW("JOIN_REQUEST", 4, R.id.ny0);
        JOIN_REQUEST = enumC1216640hlW5;
        EnumC1216640hlW enumC1216640hlW6 = new EnumC1216640hlW("REMOVE_MEMBER", 5, R.id.ny4);
        REMOVE_MEMBER = enumC1216640hlW6;
        EnumC1216640hlW enumC1216640hlW7 = new EnumC1216640hlW("GO_LIVE_REMINDER", 6, R.id.nxu);
        GO_LIVE_REMINDER = enumC1216640hlW7;
        EnumC1216640hlW enumC1216640hlW8 = new EnumC1216640hlW("HIDE_MEMBERS", 7, R.id.nxv);
        HIDE_MEMBERS = enumC1216640hlW8;
        EnumC1216640hlW enumC1216640hlW9 = new EnumC1216640hlW("TRANSFER_OWNER", 8, R.id.ny7);
        TRANSFER_OWNER = enumC1216640hlW9;
        EnumC1216640hlW enumC1216640hlW10 = new EnumC1216640hlW("END_GROUP", 9, R.id.nxs);
        END_GROUP = enumC1216640hlW10;
        EnumC1216640hlW[] enumC1216640hlWArr = {enumC1216640hlW, enumC1216640hlW2, enumC1216640hlW3, enumC1216640hlW4, enumC1216640hlW5, enumC1216640hlW6, enumC1216640hlW7, enumC1216640hlW8, enumC1216640hlW9, enumC1216640hlW10};
        LLILLJJLI = enumC1216640hlWArr;
        LLILLL = new C2254308sP(enumC1216640hlWArr);
    }

    public static EnumC1216640hlW[] values() {
        return (EnumC1216640hlW[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1216640hlW valueOf(String str) {
        return (EnumC1216640hlW) C08FF.LIZ(EnumC1216640hlW.class, str);
    }

    public EnumC1216640hlW(String str, int i, int i2) {
        this.LL = i2;
    }
}
