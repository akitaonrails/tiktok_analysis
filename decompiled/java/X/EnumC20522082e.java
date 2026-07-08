package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.082e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20522082e {
    public static final EnumC20522082e FALSE;
    public static final /* synthetic */ EnumC20522082e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20522082e TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20522082e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20522082e enumC20522082e = new EnumC20522082e("FALSE", 0, "false");
        FALSE = enumC20522082e;
        EnumC20522082e enumC20522082e2 = new EnumC20522082e("TRUE", 1, "true");
        TRUE = enumC20522082e2;
        EnumC20522082e[] enumC20522082eArr = {enumC20522082e, enumC20522082e2};
        LLILLJJLI = enumC20522082eArr;
        LLILLL = new C2254308sP(enumC20522082eArr);
    }

    public static EnumC20522082e[] values() {
        return (EnumC20522082e[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20522082e valueOf(String str) {
        return (EnumC20522082e) C08FF.LIZ(EnumC20522082e.class, str);
    }

    public EnumC20522082e(String str, int i, String str2) {
        this.LL = str2;
    }
}
