package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC461660I8m {
    public static final EnumC461660I8m CENTER;
    public static final EnumC461660I8m END;
    public static final /* synthetic */ EnumC461660I8m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC461660I8m START;

    public static InterfaceC2044707zh<EnumC461660I8m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC461660I8m enumC461660I8m = new EnumC461660I8m("START", 0);
        START = enumC461660I8m;
        EnumC461660I8m enumC461660I8m2 = new EnumC461660I8m("CENTER", 1);
        CENTER = enumC461660I8m2;
        EnumC461660I8m enumC461660I8m3 = new EnumC461660I8m("END", 2);
        END = enumC461660I8m3;
        EnumC461660I8m[] enumC461660I8mArr = {enumC461660I8m, enumC461660I8m2, enumC461660I8m3};
        LL = enumC461660I8mArr;
        LLILLJJLI = new C2254308sP(enumC461660I8mArr);
    }

    public static EnumC461660I8m[] values() {
        return (EnumC461660I8m[]) LL.clone();
    }

    public static EnumC461660I8m valueOf(String str) {
        return (EnumC461660I8m) C08FF.LIZ(EnumC461660I8m.class, str);
    }

    public EnumC461660I8m(String str, int i) {
    }
}
