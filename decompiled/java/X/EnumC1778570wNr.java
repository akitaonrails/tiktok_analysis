package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778570wNr {
    public static final EnumC1778570wNr ERROR;
    public static final /* synthetic */ EnumC1778570wNr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778570wNr NO_RESULT;
    public static final EnumC1778570wNr SUCCESS;

    public static InterfaceC2044707zh<EnumC1778570wNr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778570wNr enumC1778570wNr = new EnumC1778570wNr("SUCCESS", 0);
        SUCCESS = enumC1778570wNr;
        EnumC1778570wNr enumC1778570wNr2 = new EnumC1778570wNr("NO_RESULT", 1);
        NO_RESULT = enumC1778570wNr2;
        EnumC1778570wNr enumC1778570wNr3 = new EnumC1778570wNr("ERROR", 2);
        ERROR = enumC1778570wNr3;
        EnumC1778570wNr[] enumC1778570wNrArr = {enumC1778570wNr, enumC1778570wNr2, enumC1778570wNr3};
        LL = enumC1778570wNrArr;
        LLILLJJLI = new C2254308sP(enumC1778570wNrArr);
    }

    public static EnumC1778570wNr[] values() {
        return (EnumC1778570wNr[]) LL.clone();
    }

    public static EnumC1778570wNr valueOf(String str) {
        return (EnumC1778570wNr) C08FF.LIZ(EnumC1778570wNr.class, str);
    }

    public EnumC1778570wNr(String str, int i) {
    }
}
