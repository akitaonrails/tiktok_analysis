package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC564890MDn {
    public static final EnumC564890MDn CANCEL;
    public static final EnumC564890MDn GENERATE;
    public static final /* synthetic */ EnumC564890MDn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC564890MDn NONE;

    public static InterfaceC2044707zh<EnumC564890MDn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC564890MDn enumC564890MDn = new EnumC564890MDn("NONE", 0);
        NONE = enumC564890MDn;
        EnumC564890MDn enumC564890MDn2 = new EnumC564890MDn("CANCEL", 1);
        CANCEL = enumC564890MDn2;
        EnumC564890MDn enumC564890MDn3 = new EnumC564890MDn("GENERATE", 2);
        GENERATE = enumC564890MDn3;
        EnumC564890MDn[] enumC564890MDnArr = {enumC564890MDn, enumC564890MDn2, enumC564890MDn3};
        LL = enumC564890MDnArr;
        LLILLJJLI = new C2254308sP(enumC564890MDnArr);
    }

    public static EnumC564890MDn[] values() {
        return (EnumC564890MDn[]) LL.clone();
    }

    public static EnumC564890MDn valueOf(String str) {
        return (EnumC564890MDn) C08FF.LIZ(EnumC564890MDn.class, str);
    }

    public EnumC564890MDn(String str, int i) {
    }
}
