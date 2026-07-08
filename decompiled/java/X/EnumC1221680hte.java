package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221680hte {
    public static final EnumC1221680hte FAIL;
    public static final EnumC1221680hte IN_PROGRESS;
    public static final /* synthetic */ EnumC1221680hte[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221680hte NONE;
    public static final EnumC1221680hte SUCCESS;
    public static final EnumC1221680hte WAITING;

    public static InterfaceC2044707zh<EnumC1221680hte> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221680hte enumC1221680hte = new EnumC1221680hte("WAITING", 0);
        WAITING = enumC1221680hte;
        EnumC1221680hte enumC1221680hte2 = new EnumC1221680hte("IN_PROGRESS", 1);
        IN_PROGRESS = enumC1221680hte2;
        EnumC1221680hte enumC1221680hte3 = new EnumC1221680hte("SUCCESS", 2);
        SUCCESS = enumC1221680hte3;
        EnumC1221680hte enumC1221680hte4 = new EnumC1221680hte("FAIL", 3);
        FAIL = enumC1221680hte4;
        EnumC1221680hte enumC1221680hte5 = new EnumC1221680hte("NONE", 4);
        NONE = enumC1221680hte5;
        EnumC1221680hte[] enumC1221680hteArr = {enumC1221680hte, enumC1221680hte2, enumC1221680hte3, enumC1221680hte4, enumC1221680hte5};
        LL = enumC1221680hteArr;
        LLILLJJLI = new C2254308sP(enumC1221680hteArr);
    }

    public static EnumC1221680hte[] values() {
        return (EnumC1221680hte[]) LL.clone();
    }

    public static EnumC1221680hte valueOf(String str) {
        return (EnumC1221680hte) C08FF.LIZ(EnumC1221680hte.class, str);
    }

    public EnumC1221680hte(String str, int i) {
    }
}
