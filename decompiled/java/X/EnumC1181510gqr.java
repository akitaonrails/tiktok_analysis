package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181510gqr {
    public static final /* synthetic */ EnumC1181510gqr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1181510gqr LOAD_MORE;
    public static final EnumC1181510gqr PRE_LOAD;
    public static final EnumC1181510gqr REFRESH;
    public static final EnumC1181510gqr REQUEST;
    public static final EnumC1181510gqr UPDATE;

    public static InterfaceC2044707zh<EnumC1181510gqr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1181510gqr enumC1181510gqr = new EnumC1181510gqr("REQUEST", 0);
        REQUEST = enumC1181510gqr;
        EnumC1181510gqr enumC1181510gqr2 = new EnumC1181510gqr("REFRESH", 1);
        REFRESH = enumC1181510gqr2;
        EnumC1181510gqr enumC1181510gqr3 = new EnumC1181510gqr("UPDATE", 2);
        UPDATE = enumC1181510gqr3;
        EnumC1181510gqr enumC1181510gqr4 = new EnumC1181510gqr("LOAD_MORE", 3);
        LOAD_MORE = enumC1181510gqr4;
        EnumC1181510gqr enumC1181510gqr5 = new EnumC1181510gqr("PRE_LOAD", 4);
        PRE_LOAD = enumC1181510gqr5;
        EnumC1181510gqr[] enumC1181510gqrArr = {enumC1181510gqr, enumC1181510gqr2, enumC1181510gqr3, enumC1181510gqr4, enumC1181510gqr5};
        LL = enumC1181510gqrArr;
        LLILLJJLI = new C2254308sP(enumC1181510gqrArr);
    }

    public static EnumC1181510gqr[] values() {
        return (EnumC1181510gqr[]) LL.clone();
    }

    public static EnumC1181510gqr valueOf(String str) {
        return (EnumC1181510gqr) C08FF.LIZ(EnumC1181510gqr.class, str);
    }

    public EnumC1181510gqr(String str, int i) {
    }
}
