package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC704080Rja {
    public static final /* synthetic */ EnumC704080Rja[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC704080Rja NEGATIVE;
    public static final EnumC704080Rja POSITIVE;
    public static final EnumC704080Rja UNKNOWN;

    public static InterfaceC2044707zh<EnumC704080Rja> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC704080Rja enumC704080Rja = new EnumC704080Rja("UNKNOWN", 0);
        UNKNOWN = enumC704080Rja;
        EnumC704080Rja enumC704080Rja2 = new EnumC704080Rja("POSITIVE", 1);
        POSITIVE = enumC704080Rja2;
        EnumC704080Rja enumC704080Rja3 = new EnumC704080Rja("NEGATIVE", 2);
        NEGATIVE = enumC704080Rja3;
        EnumC704080Rja[] enumC704080RjaArr = {enumC704080Rja, enumC704080Rja2, enumC704080Rja3};
        LL = enumC704080RjaArr;
        LLILLJJLI = new C2254308sP(enumC704080RjaArr);
    }

    public static EnumC704080Rja[] values() {
        return (EnumC704080Rja[]) LL.clone();
    }

    public static EnumC704080Rja valueOf(String str) {
        return (EnumC704080Rja) C08FF.LIZ(EnumC704080Rja.class, str);
    }

    public EnumC704080Rja(String str, int i) {
    }
}
