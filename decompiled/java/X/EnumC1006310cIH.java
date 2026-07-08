package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006310cIH {
    public static final EnumC1006310cIH FETCHED;
    public static final EnumC1006310cIH INITIALIZED;
    public static final /* synthetic */ EnumC1006310cIH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1006310cIH UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC1006310cIH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1006310cIH enumC1006310cIH = new EnumC1006310cIH("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1006310cIH;
        EnumC1006310cIH enumC1006310cIH2 = new EnumC1006310cIH("INITIALIZED", 1);
        INITIALIZED = enumC1006310cIH2;
        EnumC1006310cIH enumC1006310cIH3 = new EnumC1006310cIH("FETCHED", 2);
        FETCHED = enumC1006310cIH3;
        EnumC1006310cIH[] enumC1006310cIHArr = {enumC1006310cIH, enumC1006310cIH2, enumC1006310cIH3};
        LL = enumC1006310cIHArr;
        LLILLJJLI = new C2254308sP(enumC1006310cIHArr);
    }

    public static EnumC1006310cIH[] values() {
        return (EnumC1006310cIH[]) LL.clone();
    }

    public static EnumC1006310cIH valueOf(String str) {
        return (EnumC1006310cIH) C08FF.LIZ(EnumC1006310cIH.class, str);
    }

    public EnumC1006310cIH(String str, int i) {
    }
}
