package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961060b7I {
    public static final C961800b8U Companion;
    public static final EnumC961060b7I INVITE_MORE;
    public static final /* synthetic */ EnumC961060b7I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC961060b7I Normal;
    public static final EnumC961060b7I WONT_INVITE_BUT_JUST_GET_FULL_LIST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC961060b7I> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0b8U] */
    static {
        EnumC961060b7I enumC961060b7I = new EnumC961060b7I("Normal", 0, 0);
        Normal = enumC961060b7I;
        EnumC961060b7I enumC961060b7I2 = new EnumC961060b7I("INVITE_MORE", 1, 1);
        INVITE_MORE = enumC961060b7I2;
        EnumC961060b7I enumC961060b7I3 = new EnumC961060b7I("WONT_INVITE_BUT_JUST_GET_FULL_LIST", 2, 2);
        WONT_INVITE_BUT_JUST_GET_FULL_LIST = enumC961060b7I3;
        EnumC961060b7I[] enumC961060b7IArr = {enumC961060b7I, enumC961060b7I2, enumC961060b7I3};
        LLILLJJLI = enumC961060b7IArr;
        LLILLL = new C2254308sP(enumC961060b7IArr);
        Companion = new Object() { // from class: X.0b8U
        };
    }

    public static EnumC961060b7I[] values() {
        return (EnumC961060b7I[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC961060b7I valueOf(String str) {
        return (EnumC961060b7I) C08FF.LIZ(EnumC961060b7I.class, str);
    }

    public EnumC961060b7I(String str, int i, int i2) {
        this.LL = i2;
    }
}
