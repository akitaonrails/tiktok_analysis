package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308440k9a {
    public static final /* synthetic */ EnumC1308440k9a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1308440k9a MINUS;
    public static final EnumC1308440k9a NOT;

    public static InterfaceC2044707zh<EnumC1308440k9a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308440k9a enumC1308440k9a = new EnumC1308440k9a("MINUS", 0);
        MINUS = enumC1308440k9a;
        EnumC1308440k9a enumC1308440k9a2 = new EnumC1308440k9a("NOT", 1);
        NOT = enumC1308440k9a2;
        EnumC1308440k9a[] enumC1308440k9aArr = {enumC1308440k9a, enumC1308440k9a2};
        LL = enumC1308440k9aArr;
        LLILLJJLI = new C2254308sP(enumC1308440k9aArr);
    }

    public static EnumC1308440k9a[] values() {
        return (EnumC1308440k9a[]) LL.clone();
    }

    public static EnumC1308440k9a valueOf(String str) {
        return (EnumC1308440k9a) C08FF.LIZ(EnumC1308440k9a.class, str);
    }

    public EnumC1308440k9a(String str, int i) {
    }
}
