package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC645530PTr {
    public static final EnumC645530PTr DATA_FETCHING;
    public static final EnumC645530PTr ENTER_DETAIL;
    public static final EnumC645530PTr FINISHED;
    public static final /* synthetic */ EnumC645530PTr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC645530PTr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC645530PTr enumC645530PTr = new EnumC645530PTr("ENTER_DETAIL", 0);
        ENTER_DETAIL = enumC645530PTr;
        EnumC645530PTr enumC645530PTr2 = new EnumC645530PTr("DATA_FETCHING", 1);
        DATA_FETCHING = enumC645530PTr2;
        EnumC645530PTr enumC645530PTr3 = new EnumC645530PTr("FINISHED", 2);
        FINISHED = enumC645530PTr3;
        EnumC645530PTr[] enumC645530PTrArr = {enumC645530PTr, enumC645530PTr2, enumC645530PTr3};
        LL = enumC645530PTrArr;
        LLILLJJLI = new C2254308sP(enumC645530PTrArr);
    }

    public static EnumC645530PTr[] values() {
        return (EnumC645530PTr[]) LL.clone();
    }

    public static EnumC645530PTr valueOf(String str) {
        return (EnumC645530PTr) C08FF.LIZ(EnumC645530PTr.class, str);
    }

    public EnumC645530PTr(String str, int i) {
    }
}
