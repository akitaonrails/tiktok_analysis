package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588350N5t {
    public static final EnumC588350N5t CHANGE_END;
    public static final EnumC588350N5t CHANGING;
    public static final /* synthetic */ EnumC588350N5t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC588350N5t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC588350N5t enumC588350N5t = new EnumC588350N5t("CHANGING", 0);
        CHANGING = enumC588350N5t;
        EnumC588350N5t enumC588350N5t2 = new EnumC588350N5t("CHANGE_END", 1);
        CHANGE_END = enumC588350N5t2;
        EnumC588350N5t[] enumC588350N5tArr = {enumC588350N5t, enumC588350N5t2};
        LL = enumC588350N5tArr;
        LLILLJJLI = new C2254308sP(enumC588350N5tArr);
    }

    public static EnumC588350N5t[] values() {
        return (EnumC588350N5t[]) LL.clone();
    }

    public static EnumC588350N5t valueOf(String str) {
        return (EnumC588350N5t) C08FF.LIZ(EnumC588350N5t.class, str);
    }

    public EnumC588350N5t(String str, int i) {
    }
}
