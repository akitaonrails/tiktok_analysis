package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994420bz6 {
    public static final EnumC994420bz6 HIDE;
    public static final /* synthetic */ EnumC994420bz6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994420bz6 NOT_HIDE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC994420bz6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994420bz6 enumC994420bz6 = new EnumC994420bz6("NOT_HIDE", 0, 1);
        NOT_HIDE = enumC994420bz6;
        EnumC994420bz6 enumC994420bz62 = new EnumC994420bz6("HIDE", 1, 2);
        HIDE = enumC994420bz62;
        EnumC994420bz6[] enumC994420bz6Arr = {enumC994420bz6, enumC994420bz62};
        LLILLJJLI = enumC994420bz6Arr;
        LLILLL = new C2254308sP(enumC994420bz6Arr);
    }

    public static EnumC994420bz6[] values() {
        return (EnumC994420bz6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC994420bz6 valueOf(String str) {
        return (EnumC994420bz6) C08FF.LIZ(EnumC994420bz6.class, str);
    }

    public EnumC994420bz6(String str, int i, int i2) {
        this.LL = i2;
    }
}
