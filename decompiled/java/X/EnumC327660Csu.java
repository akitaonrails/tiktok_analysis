package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Csu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC327660Csu {
    public static final EnumC327660Csu DELAY;
    public static final EnumC327660Csu DISCARD;
    public static final /* synthetic */ EnumC327660Csu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC327660Csu NOT_START;
    public static final EnumC327660Csu OVERDUE;
    public static final EnumC327660Csu UNDER_WAY_ARRIVE_LATE;
    public static final EnumC327660Csu UNDER_WAY_OTHER_RUNNING;

    public static InterfaceC2044707zh<EnumC327660Csu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC327660Csu enumC327660Csu = new EnumC327660Csu("NOT_START", 0);
        NOT_START = enumC327660Csu;
        EnumC327660Csu enumC327660Csu2 = new EnumC327660Csu("UNDER_WAY_OTHER_RUNNING", 1);
        UNDER_WAY_OTHER_RUNNING = enumC327660Csu2;
        EnumC327660Csu enumC327660Csu3 = new EnumC327660Csu("UNDER_WAY_ARRIVE_LATE", 2);
        UNDER_WAY_ARRIVE_LATE = enumC327660Csu3;
        EnumC327660Csu enumC327660Csu4 = new EnumC327660Csu("OVERDUE", 3);
        OVERDUE = enumC327660Csu4;
        EnumC327660Csu enumC327660Csu5 = new EnumC327660Csu("DELAY", 4);
        DELAY = enumC327660Csu5;
        EnumC327660Csu enumC327660Csu6 = new EnumC327660Csu("DISCARD", 5);
        DISCARD = enumC327660Csu6;
        EnumC327660Csu[] enumC327660CsuArr = {enumC327660Csu, enumC327660Csu2, enumC327660Csu3, enumC327660Csu4, enumC327660Csu5, enumC327660Csu6};
        LL = enumC327660CsuArr;
        LLILLJJLI = new C2254308sP(enumC327660CsuArr);
    }

    public static EnumC327660Csu[] values() {
        return (EnumC327660Csu[]) LL.clone();
    }

    public static EnumC327660Csu valueOf(String str) {
        return (EnumC327660Csu) C08FF.LIZ(EnumC327660Csu.class, str);
    }

    public EnumC327660Csu(String str, int i) {
    }
}
