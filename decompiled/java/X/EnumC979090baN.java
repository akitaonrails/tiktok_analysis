package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0baN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC979090baN {
    public static final EnumC979090baN BACK;
    public static final EnumC979090baN END;
    public static final /* synthetic */ EnumC979090baN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC979090baN START;

    public static InterfaceC2044707zh<EnumC979090baN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC979090baN enumC979090baN = new EnumC979090baN("START", 0);
        START = enumC979090baN;
        EnumC979090baN enumC979090baN2 = new EnumC979090baN("END", 1);
        END = enumC979090baN2;
        EnumC979090baN enumC979090baN3 = new EnumC979090baN("BACK", 2);
        BACK = enumC979090baN3;
        EnumC979090baN[] enumC979090baNArr = {enumC979090baN, enumC979090baN2, enumC979090baN3};
        LL = enumC979090baNArr;
        LLILLJJLI = new C2254308sP(enumC979090baNArr);
    }

    public static EnumC979090baN[] values() {
        return (EnumC979090baN[]) LL.clone();
    }

    public static EnumC979090baN valueOf(String str) {
        return (EnumC979090baN) C08FF.LIZ(EnumC979090baN.class, str);
    }

    public EnumC979090baN(String str, int i) {
    }
}
