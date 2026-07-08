package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1588720rRe {
    public static final EnumC1588720rRe COLD_LAUNCH;
    public static final /* synthetic */ EnumC1588720rRe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1588720rRe RED_DOT;

    public static InterfaceC2044707zh<EnumC1588720rRe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1588720rRe enumC1588720rRe = new EnumC1588720rRe("COLD_LAUNCH", 0);
        COLD_LAUNCH = enumC1588720rRe;
        EnumC1588720rRe enumC1588720rRe2 = new EnumC1588720rRe("RED_DOT", 1);
        RED_DOT = enumC1588720rRe2;
        EnumC1588720rRe[] enumC1588720rReArr = {enumC1588720rRe, enumC1588720rRe2};
        LL = enumC1588720rReArr;
        LLILLJJLI = new C2254308sP(enumC1588720rReArr);
    }

    public static EnumC1588720rRe[] values() {
        return (EnumC1588720rRe[]) LL.clone();
    }

    public static EnumC1588720rRe valueOf(String str) {
        return (EnumC1588720rRe) C08FF.LIZ(EnumC1588720rRe.class, str);
    }

    public EnumC1588720rRe(String str, int i) {
    }
}
