package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12950054y {
    public static final /* synthetic */ EnumC12950054y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12950054y NOT_SET;
    public static final EnumC12950054y SAVE_STATE_IN_DB_WHEN_CREATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC12950054y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12950054y enumC12950054y = new EnumC12950054y("NOT_SET", 0, 0);
        NOT_SET = enumC12950054y;
        EnumC12950054y enumC12950054y2 = new EnumC12950054y("SAVE_STATE_IN_DB_WHEN_CREATE", 1, 1);
        SAVE_STATE_IN_DB_WHEN_CREATE = enumC12950054y2;
        EnumC12950054y[] enumC12950054yArr = {enumC12950054y, enumC12950054y2};
        LLILLJJLI = enumC12950054yArr;
        LLILLL = new C2254308sP(enumC12950054yArr);
    }

    public static EnumC12950054y[] values() {
        return (EnumC12950054y[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC12950054y valueOf(String str) {
        return (EnumC12950054y) C08FF.LIZ(EnumC12950054y.class, str);
    }

    public EnumC12950054y(String str, int i, int i2) {
        this.LL = i2;
    }
}
