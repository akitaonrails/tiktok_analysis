package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006610cIl {
    public static final /* synthetic */ EnumC1006610cIl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006610cIl LOAD_FAILED;
    public static final EnumC1006610cIl MEMORY_WARNING;
    public static final EnumC1006610cIl NOT_READY;
    public static final EnumC1006610cIl REFRESH;
    public static final EnumC1006610cIl SWIPE_UP_COUNT_OVER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1006610cIl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006610cIl enumC1006610cIl = new EnumC1006610cIl("NOT_READY", 0, "not_ready");
        NOT_READY = enumC1006610cIl;
        EnumC1006610cIl enumC1006610cIl2 = new EnumC1006610cIl("LOAD_FAILED", 1, "load_failed");
        LOAD_FAILED = enumC1006610cIl2;
        EnumC1006610cIl enumC1006610cIl3 = new EnumC1006610cIl("MEMORY_WARNING", 2, "memory_warning");
        MEMORY_WARNING = enumC1006610cIl3;
        EnumC1006610cIl enumC1006610cIl4 = new EnumC1006610cIl("REFRESH", 3, "refresh");
        REFRESH = enumC1006610cIl4;
        EnumC1006610cIl enumC1006610cIl5 = new EnumC1006610cIl("SWIPE_UP_COUNT_OVER", 4, "swipe_up_count_over");
        SWIPE_UP_COUNT_OVER = enumC1006610cIl5;
        EnumC1006610cIl[] enumC1006610cIlArr = {enumC1006610cIl, enumC1006610cIl2, enumC1006610cIl3, enumC1006610cIl4, enumC1006610cIl5};
        LLILLJJLI = enumC1006610cIlArr;
        LLILLL = new C2254308sP(enumC1006610cIlArr);
    }

    public static EnumC1006610cIl[] values() {
        return (EnumC1006610cIl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1006610cIl valueOf(String str) {
        return (EnumC1006610cIl) C08FF.LIZ(EnumC1006610cIl.class, str);
    }

    public EnumC1006610cIl(String str, int i, String str2) {
        this.LL = str2;
    }
}
