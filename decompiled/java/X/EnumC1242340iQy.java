package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242340iQy {
    public static final EnumC1242340iQy EMPTY;
    public static final EnumC1242340iQy ERROR;
    public static final /* synthetic */ EnumC1242340iQy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1242340iQy LOADING;
    public static final EnumC1242340iQy SUCCESS;
    public static final EnumC1242340iQy UNKNOWN;

    public static InterfaceC2044707zh<EnumC1242340iQy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1242340iQy enumC1242340iQy = new EnumC1242340iQy("UNKNOWN", 0);
        UNKNOWN = enumC1242340iQy;
        EnumC1242340iQy enumC1242340iQy2 = new EnumC1242340iQy("LOADING", 1);
        LOADING = enumC1242340iQy2;
        EnumC1242340iQy enumC1242340iQy3 = new EnumC1242340iQy("EMPTY", 2);
        EMPTY = enumC1242340iQy3;
        EnumC1242340iQy enumC1242340iQy4 = new EnumC1242340iQy("SUCCESS", 3);
        SUCCESS = enumC1242340iQy4;
        EnumC1242340iQy enumC1242340iQy5 = new EnumC1242340iQy("ERROR", 4);
        ERROR = enumC1242340iQy5;
        EnumC1242340iQy[] enumC1242340iQyArr = {enumC1242340iQy, enumC1242340iQy2, enumC1242340iQy3, enumC1242340iQy4, enumC1242340iQy5};
        LL = enumC1242340iQyArr;
        LLILLJJLI = new C2254308sP(enumC1242340iQyArr);
    }

    public static EnumC1242340iQy[] values() {
        return (EnumC1242340iQy[]) LL.clone();
    }

    public static EnumC1242340iQy valueOf(String str) {
        return (EnumC1242340iQy) C08FF.LIZ(EnumC1242340iQy.class, str);
    }

    public EnumC1242340iQy(String str, int i) {
    }
}
