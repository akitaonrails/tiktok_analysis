package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19987013Ie {
    public static final EnumC19987013Ie LIST;
    public static final /* synthetic */ EnumC19987013Ie[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19987013Ie MAP;
    public static final EnumC19987013Ie OBJ;
    public static final EnumC19987013Ie POLY_OBJ;
    public final char begin;
    public final char end;

    public static InterfaceC2044707zh<EnumC19987013Ie> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19987013Ie enumC19987013Ie = new EnumC19987013Ie("OBJ", 0, '{', '}');
        OBJ = enumC19987013Ie;
        EnumC19987013Ie enumC19987013Ie2 = new EnumC19987013Ie("LIST", 1, '[', ']');
        LIST = enumC19987013Ie2;
        EnumC19987013Ie enumC19987013Ie3 = new EnumC19987013Ie("MAP", 2, '{', '}');
        MAP = enumC19987013Ie3;
        EnumC19987013Ie enumC19987013Ie4 = new EnumC19987013Ie("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = enumC19987013Ie4;
        EnumC19987013Ie[] enumC19987013IeArr = {enumC19987013Ie, enumC19987013Ie2, enumC19987013Ie3, enumC19987013Ie4};
        LL = enumC19987013IeArr;
        LLILLJJLI = new C2254308sP(enumC19987013IeArr);
    }

    public static EnumC19987013Ie[] values() {
        return (EnumC19987013Ie[]) LL.clone();
    }

    public static EnumC19987013Ie valueOf(String str) {
        return (EnumC19987013Ie) C08FF.LIZ(EnumC19987013Ie.class, str);
    }

    public EnumC19987013Ie(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }
}
