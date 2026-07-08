package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC638200P1m {
    public static final /* synthetic */ EnumC638200P1m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC638200P1m PRIMARY;
    public static final EnumC638200P1m SECONDARY;

    public static InterfaceC2044707zh<EnumC638200P1m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC638200P1m enumC638200P1m = new EnumC638200P1m("PRIMARY", 0);
        PRIMARY = enumC638200P1m;
        EnumC638200P1m enumC638200P1m2 = new EnumC638200P1m("SECONDARY", 1);
        SECONDARY = enumC638200P1m2;
        EnumC638200P1m[] enumC638200P1mArr = {enumC638200P1m, enumC638200P1m2};
        LL = enumC638200P1mArr;
        LLILLJJLI = new C2254308sP(enumC638200P1mArr);
    }

    public static EnumC638200P1m[] values() {
        return (EnumC638200P1m[]) LL.clone();
    }

    public static EnumC638200P1m valueOf(String str) {
        return (EnumC638200P1m) C08FF.LIZ(EnumC638200P1m.class, str);
    }

    public EnumC638200P1m(String str, int i) {
    }
}
