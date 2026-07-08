package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Etr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379210Etr {
    public static final EnumC379210Etr GENERATION_SUCCESS;
    public static final /* synthetic */ EnumC379210Etr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC379210Etr USER_CLOSE;

    public static InterfaceC2044707zh<EnumC379210Etr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC379210Etr enumC379210Etr = new EnumC379210Etr("GENERATION_SUCCESS", 0);
        GENERATION_SUCCESS = enumC379210Etr;
        EnumC379210Etr enumC379210Etr2 = new EnumC379210Etr("USER_CLOSE", 1);
        USER_CLOSE = enumC379210Etr2;
        EnumC379210Etr[] enumC379210EtrArr = {enumC379210Etr, enumC379210Etr2};
        LL = enumC379210EtrArr;
        LLILLJJLI = new C2254308sP(enumC379210EtrArr);
    }

    public static EnumC379210Etr[] values() {
        return (EnumC379210Etr[]) LL.clone();
    }

    public static EnumC379210Etr valueOf(String str) {
        return (EnumC379210Etr) C08FF.LIZ(EnumC379210Etr.class, str);
    }

    public EnumC379210Etr(String str, int i) {
    }
}
