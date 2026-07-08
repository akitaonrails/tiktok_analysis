package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1733870vDl {
    public static final EnumC1733870vDl EDIT;
    public static final /* synthetic */ EnumC1733870vDl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1733870vDl PUBLISH;

    public static InterfaceC2044707zh<EnumC1733870vDl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1733870vDl enumC1733870vDl = new EnumC1733870vDl("EDIT", 0);
        EDIT = enumC1733870vDl;
        EnumC1733870vDl enumC1733870vDl2 = new EnumC1733870vDl("PUBLISH", 1);
        PUBLISH = enumC1733870vDl2;
        EnumC1733870vDl[] enumC1733870vDlArr = {enumC1733870vDl, enumC1733870vDl2};
        LL = enumC1733870vDlArr;
        LLILLJJLI = new C2254308sP(enumC1733870vDlArr);
    }

    public static EnumC1733870vDl[] values() {
        return (EnumC1733870vDl[]) LL.clone();
    }

    public static EnumC1733870vDl valueOf(String str) {
        return (EnumC1733870vDl) C08FF.LIZ(EnumC1733870vDl.class, str);
    }

    public EnumC1733870vDl(String str, int i) {
    }
}
