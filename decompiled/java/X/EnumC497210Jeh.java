package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jeh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC497210Jeh {
    public static final EnumC497210Jeh FALLBACK;
    public static final EnumC497210Jeh FETCHING;
    public static final EnumC497210Jeh FINISHED;
    public static final EnumC497210Jeh IDLE;
    public static final /* synthetic */ EnumC497210Jeh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC497210Jeh PREPARE;

    public static InterfaceC2044707zh<EnumC497210Jeh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC497210Jeh enumC497210Jeh = new EnumC497210Jeh("IDLE", 0);
        IDLE = enumC497210Jeh;
        EnumC497210Jeh enumC497210Jeh2 = new EnumC497210Jeh("PREPARE", 1);
        PREPARE = enumC497210Jeh2;
        EnumC497210Jeh enumC497210Jeh3 = new EnumC497210Jeh("FETCHING", 2);
        FETCHING = enumC497210Jeh3;
        EnumC497210Jeh enumC497210Jeh4 = new EnumC497210Jeh("FINISHED", 3);
        FINISHED = enumC497210Jeh4;
        EnumC497210Jeh enumC497210Jeh5 = new EnumC497210Jeh("FALLBACK", 4);
        FALLBACK = enumC497210Jeh5;
        EnumC497210Jeh[] enumC497210JehArr = {enumC497210Jeh, enumC497210Jeh2, enumC497210Jeh3, enumC497210Jeh4, enumC497210Jeh5};
        LL = enumC497210JehArr;
        LLILLJJLI = new C2254308sP(enumC497210JehArr);
    }

    public static EnumC497210Jeh[] values() {
        return (EnumC497210Jeh[]) LL.clone();
    }

    public static EnumC497210Jeh valueOf(String str) {
        return (EnumC497210Jeh) C08FF.LIZ(EnumC497210Jeh.class, str);
    }

    public EnumC497210Jeh(String str, int i) {
    }
}
