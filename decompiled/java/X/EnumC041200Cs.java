package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041200Cs {
    public static final EnumC041200Cs APP_EXIT;
    public static final /* synthetic */ EnumC041200Cs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC041200Cs MANUAL_EXIT;

    public static InterfaceC2044707zh<EnumC041200Cs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC041200Cs enumC041200Cs = new EnumC041200Cs("MANUAL_EXIT", 0);
        MANUAL_EXIT = enumC041200Cs;
        EnumC041200Cs enumC041200Cs2 = new EnumC041200Cs("APP_EXIT", 1);
        APP_EXIT = enumC041200Cs2;
        EnumC041200Cs[] enumC041200CsArr = {enumC041200Cs, enumC041200Cs2};
        LL = enumC041200CsArr;
        LLILLJJLI = new C2254308sP(enumC041200CsArr);
    }

    public static EnumC041200Cs[] values() {
        return (EnumC041200Cs[]) LL.clone();
    }

    public static EnumC041200Cs valueOf(String str) {
        return (EnumC041200Cs) C08FF.LIZ(EnumC041200Cs.class, str);
    }

    public EnumC041200Cs(String str, int i) {
    }
}
