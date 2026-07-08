package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587420N2e {
    public static final EnumC587420N2e APPLYING;
    public static final /* synthetic */ EnumC587420N2e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587420N2e NONE;

    public static InterfaceC2044707zh<EnumC587420N2e> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587420N2e enumC587420N2e = new EnumC587420N2e("APPLYING", 0);
        APPLYING = enumC587420N2e;
        EnumC587420N2e enumC587420N2e2 = new EnumC587420N2e("NONE", 1);
        NONE = enumC587420N2e2;
        EnumC587420N2e[] enumC587420N2eArr = {enumC587420N2e, enumC587420N2e2};
        LL = enumC587420N2eArr;
        LLILLJJLI = new C2254308sP(enumC587420N2eArr);
    }

    public static EnumC587420N2e[] values() {
        return (EnumC587420N2e[]) LL.clone();
    }

    public static EnumC587420N2e valueOf(String str) {
        return (EnumC587420N2e) C08FF.LIZ(EnumC587420N2e.class, str);
    }

    public EnumC587420N2e(String str, int i) {
    }
}
