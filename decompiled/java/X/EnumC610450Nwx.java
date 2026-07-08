package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC610450Nwx {
    public static final EnumC610450Nwx DEFAULT_OPEN_PUSH_PERMISSION;
    public static final EnumC610450Nwx GUIDE_OPEN_PUSH_PERMISSION;
    public static final /* synthetic */ EnumC610450Nwx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC610450Nwx MESSAGE_REQUEST_FILTER_WORD;
    public static final EnumC610450Nwx MESSAGE_REQUEST_PRIORITY;
    public static final EnumC610450Nwx MESSAGE_REQUEST_RECEIVE_MR_IN_INBOX;
    public static final EnumC610450Nwx MESSAGE_REQUEST_TURN_ON_PUSH_PERMISSION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC610450Nwx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC610450Nwx enumC610450Nwx = new EnumC610450Nwx("DEFAULT_OPEN_PUSH_PERMISSION", 0, 1);
        DEFAULT_OPEN_PUSH_PERMISSION = enumC610450Nwx;
        EnumC610450Nwx enumC610450Nwx2 = new EnumC610450Nwx("GUIDE_OPEN_PUSH_PERMISSION", 1, 2);
        GUIDE_OPEN_PUSH_PERMISSION = enumC610450Nwx2;
        EnumC610450Nwx enumC610450Nwx3 = new EnumC610450Nwx("MESSAGE_REQUEST_PRIORITY", 2, 3);
        MESSAGE_REQUEST_PRIORITY = enumC610450Nwx3;
        EnumC610450Nwx enumC610450Nwx4 = new EnumC610450Nwx("MESSAGE_REQUEST_TURN_ON_PUSH_PERMISSION", 3, 4);
        MESSAGE_REQUEST_TURN_ON_PUSH_PERMISSION = enumC610450Nwx4;
        EnumC610450Nwx enumC610450Nwx5 = new EnumC610450Nwx("MESSAGE_REQUEST_RECEIVE_MR_IN_INBOX", 4, 5);
        MESSAGE_REQUEST_RECEIVE_MR_IN_INBOX = enumC610450Nwx5;
        EnumC610450Nwx enumC610450Nwx6 = new EnumC610450Nwx("MESSAGE_REQUEST_FILTER_WORD", 5, 6);
        MESSAGE_REQUEST_FILTER_WORD = enumC610450Nwx6;
        EnumC610450Nwx[] enumC610450NwxArr = {enumC610450Nwx, enumC610450Nwx2, enumC610450Nwx3, enumC610450Nwx4, enumC610450Nwx5, enumC610450Nwx6};
        LLILLJJLI = enumC610450NwxArr;
        LLILLL = new C2254308sP(enumC610450NwxArr);
    }

    public static EnumC610450Nwx[] values() {
        return (EnumC610450Nwx[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC610450Nwx valueOf(String str) {
        return (EnumC610450Nwx) C08FF.LIZ(EnumC610450Nwx.class, str);
    }

    public EnumC610450Nwx(String str, int i, int i2) {
        this.LL = i2;
    }
}
