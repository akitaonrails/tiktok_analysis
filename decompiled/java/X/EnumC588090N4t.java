package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC588090N4t {
    public static final /* synthetic */ EnumC588090N4t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC588090N4t TYPE_INIT;
    public static final EnumC588090N4t TYPE_UPDATE;

    public static InterfaceC2044707zh<EnumC588090N4t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC588090N4t enumC588090N4t = new EnumC588090N4t("TYPE_INIT", 0);
        TYPE_INIT = enumC588090N4t;
        EnumC588090N4t enumC588090N4t2 = new EnumC588090N4t("TYPE_UPDATE", 1);
        TYPE_UPDATE = enumC588090N4t2;
        EnumC588090N4t[] enumC588090N4tArr = {enumC588090N4t, enumC588090N4t2};
        LL = enumC588090N4tArr;
        LLILLJJLI = new C2254308sP(enumC588090N4tArr);
    }

    public static EnumC588090N4t[] values() {
        return (EnumC588090N4t[]) LL.clone();
    }

    public static EnumC588090N4t valueOf(String str) {
        return (EnumC588090N4t) C08FF.LIZ(EnumC588090N4t.class, str);
    }

    public EnumC588090N4t(String str, int i) {
    }
}
