package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC868870Y6r {
    public static final EnumC868870Y6r HANDLED;
    public static final EnumC868870Y6r IO_ERROR;
    public static final /* synthetic */ EnumC868870Y6r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC868870Y6r MISSING_ENTITY;
    public static final EnumC868870Y6r NOT_SUPPORTED;
    public static final EnumC868870Y6r UNKNOWN_ERROR;

    public static InterfaceC2044707zh<EnumC868870Y6r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC868870Y6r enumC868870Y6r = new EnumC868870Y6r("HANDLED", 0);
        HANDLED = enumC868870Y6r;
        EnumC868870Y6r enumC868870Y6r2 = new EnumC868870Y6r("MISSING_ENTITY", 1);
        MISSING_ENTITY = enumC868870Y6r2;
        EnumC868870Y6r enumC868870Y6r3 = new EnumC868870Y6r("NOT_SUPPORTED", 2);
        NOT_SUPPORTED = enumC868870Y6r3;
        EnumC868870Y6r enumC868870Y6r4 = new EnumC868870Y6r("IO_ERROR", 3);
        IO_ERROR = enumC868870Y6r4;
        EnumC868870Y6r enumC868870Y6r5 = new EnumC868870Y6r("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = enumC868870Y6r5;
        EnumC868870Y6r[] enumC868870Y6rArr = {enumC868870Y6r, enumC868870Y6r2, enumC868870Y6r3, enumC868870Y6r4, enumC868870Y6r5};
        LL = enumC868870Y6rArr;
        LLILLJJLI = new C2254308sP(enumC868870Y6rArr);
    }

    public static EnumC868870Y6r[] values() {
        return (EnumC868870Y6r[]) LL.clone();
    }

    public static EnumC868870Y6r valueOf(String str) {
        return (EnumC868870Y6r) C08FF.LIZ(EnumC868870Y6r.class, str);
    }

    public EnumC868870Y6r(String str, int i) {
    }
}
