package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1231170i8x {
    public static final EnumC1231170i8x ACTION_COMMON_ROUTER;
    public static final EnumC1231170i8x ACTION_FOLLOW_AND_JOIN;
    public static final EnumC1231170i8x ACTION_JOIN_GROUP;
    public static final EnumC1231170i8x ACTION_OPEN_CHAT_ROOM;
    public static final /* synthetic */ EnumC1231170i8x[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1231170i8x> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1231170i8x enumC1231170i8x = new EnumC1231170i8x("ACTION_JOIN_GROUP", 0, 1);
        ACTION_JOIN_GROUP = enumC1231170i8x;
        EnumC1231170i8x enumC1231170i8x2 = new EnumC1231170i8x("ACTION_COMMON_ROUTER", 1, 2);
        ACTION_COMMON_ROUTER = enumC1231170i8x2;
        EnumC1231170i8x enumC1231170i8x3 = new EnumC1231170i8x("ACTION_FOLLOW_AND_JOIN", 2, 3);
        ACTION_FOLLOW_AND_JOIN = enumC1231170i8x3;
        EnumC1231170i8x enumC1231170i8x4 = new EnumC1231170i8x("ACTION_OPEN_CHAT_ROOM", 3, 4);
        ACTION_OPEN_CHAT_ROOM = enumC1231170i8x4;
        EnumC1231170i8x[] enumC1231170i8xArr = {enumC1231170i8x, enumC1231170i8x2, enumC1231170i8x3, enumC1231170i8x4};
        LLILLJJLI = enumC1231170i8xArr;
        LLILLL = new C2254308sP(enumC1231170i8xArr);
    }

    public static EnumC1231170i8x[] values() {
        return (EnumC1231170i8x[]) LLILLJJLI.clone();
    }

    public final int getAction() {
        return this.LL;
    }

    public static EnumC1231170i8x valueOf(String str) {
        return (EnumC1231170i8x) C08FF.LIZ(EnumC1231170i8x.class, str);
    }

    public EnumC1231170i8x(String str, int i, int i2) {
        this.LL = i2;
    }
}
