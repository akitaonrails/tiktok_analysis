package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ful, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1145490ful {
    public static final EnumC1145490ful ERROR;
    public static final EnumC1145490ful EXIT_ROOM_BEFORE_COMPLETION;
    public static final /* synthetic */ EnumC1145490ful[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1145490ful NO_ITEMS_TO_RENDER;
    public static final EnumC1145490ful PARTIAL_SUCCESS;
    public static final EnumC1145490ful SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1145490ful> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1145490ful enumC1145490ful = new EnumC1145490ful("SUCCESS", 0, 1);
        SUCCESS = enumC1145490ful;
        EnumC1145490ful enumC1145490ful2 = new EnumC1145490ful("PARTIAL_SUCCESS", 1, 2);
        PARTIAL_SUCCESS = enumC1145490ful2;
        EnumC1145490ful enumC1145490ful3 = new EnumC1145490ful("EXIT_ROOM_BEFORE_COMPLETION", 2, 3);
        EXIT_ROOM_BEFORE_COMPLETION = enumC1145490ful3;
        EnumC1145490ful enumC1145490ful4 = new EnumC1145490ful("NO_ITEMS_TO_RENDER", 3, 4);
        NO_ITEMS_TO_RENDER = enumC1145490ful4;
        EnumC1145490ful enumC1145490ful5 = new EnumC1145490ful("ERROR", 4, -1);
        ERROR = enumC1145490ful5;
        EnumC1145490ful[] enumC1145490fulArr = {enumC1145490ful, enumC1145490ful2, enumC1145490ful3, enumC1145490ful4, enumC1145490ful5};
        LLILLJJLI = enumC1145490fulArr;
        LLILLL = new C2254308sP(enumC1145490fulArr);
    }

    public static EnumC1145490ful[] values() {
        return (EnumC1145490ful[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1145490ful valueOf(String str) {
        return (EnumC1145490ful) C08FF.LIZ(EnumC1145490ful.class, str);
    }

    public EnumC1145490ful(String str, int i, int i2) {
        this.LL = i2;
    }
}
