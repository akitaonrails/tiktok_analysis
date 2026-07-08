package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2176951AHt {
    public static final EnumC2176951AHt END;
    public static final /* synthetic */ EnumC2176951AHt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2176951AHt NONE;
    public static final EnumC2176951AHt SETTLE;
    public static final EnumC2176951AHt START;
    public static final EnumC2176951AHt UPDATE;
    public static final EnumC2176951AHt UPDATE_TIME;

    public static InterfaceC2044707zh<EnumC2176951AHt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2176951AHt enumC2176951AHt = new EnumC2176951AHt("NONE", 0);
        NONE = enumC2176951AHt;
        EnumC2176951AHt enumC2176951AHt2 = new EnumC2176951AHt("START", 1);
        START = enumC2176951AHt2;
        EnumC2176951AHt enumC2176951AHt3 = new EnumC2176951AHt("UPDATE", 2);
        UPDATE = enumC2176951AHt3;
        EnumC2176951AHt enumC2176951AHt4 = new EnumC2176951AHt("UPDATE_TIME", 3);
        UPDATE_TIME = enumC2176951AHt4;
        EnumC2176951AHt enumC2176951AHt5 = new EnumC2176951AHt("SETTLE", 4);
        SETTLE = enumC2176951AHt5;
        EnumC2176951AHt enumC2176951AHt6 = new EnumC2176951AHt("END", 5);
        END = enumC2176951AHt6;
        EnumC2176951AHt[] enumC2176951AHtArr = {enumC2176951AHt, enumC2176951AHt2, enumC2176951AHt3, enumC2176951AHt4, enumC2176951AHt5, enumC2176951AHt6};
        LL = enumC2176951AHtArr;
        LLILLJJLI = new C2254308sP(enumC2176951AHtArr);
    }

    public static EnumC2176951AHt[] values() {
        return (EnumC2176951AHt[]) LL.clone();
    }

    public static EnumC2176951AHt valueOf(String str) {
        return (EnumC2176951AHt) C08FF.LIZ(EnumC2176951AHt.class, str);
    }

    public EnumC2176951AHt(String str, int i) {
    }
}
