package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC368970EdL {
    public static final EnumC368970EdL END;
    public static final /* synthetic */ EnumC368970EdL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC368970EdL NULL;
    public static final EnumC368970EdL START;

    public static InterfaceC2044707zh<EnumC368970EdL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC368970EdL enumC368970EdL = new EnumC368970EdL("NULL", 0);
        NULL = enumC368970EdL;
        EnumC368970EdL enumC368970EdL2 = new EnumC368970EdL("START", 1);
        START = enumC368970EdL2;
        EnumC368970EdL enumC368970EdL3 = new EnumC368970EdL("END", 2);
        END = enumC368970EdL3;
        EnumC368970EdL[] enumC368970EdLArr = {enumC368970EdL, enumC368970EdL2, enumC368970EdL3};
        LL = enumC368970EdLArr;
        LLILLJJLI = new C2254308sP(enumC368970EdLArr);
    }

    public static EnumC368970EdL[] values() {
        return (EnumC368970EdL[]) LL.clone();
    }

    public static EnumC368970EdL valueOf(String str) {
        return (EnumC368970EdL) C08FF.LIZ(EnumC368970EdL.class, str);
    }

    public EnumC368970EdL(String str, int i) {
    }
}
