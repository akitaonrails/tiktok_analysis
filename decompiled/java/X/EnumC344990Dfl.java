package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC344990Dfl {
    public static final EnumC344990Dfl CLEAN_STORAGE_SILENCE;
    public static final EnumC344990Dfl CLEAN_STORAGE_WITH_LOADING;
    public static final EnumC344990Dfl CLICK_CANCEL_CLEAN_LOADING;
    public static final /* synthetic */ EnumC344990Dfl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC344990Dfl NOT_NEED_CLEAN_STORAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC344990Dfl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC344990Dfl enumC344990Dfl = new EnumC344990Dfl("NOT_NEED_CLEAN_STORAGE", 0, 1);
        NOT_NEED_CLEAN_STORAGE = enumC344990Dfl;
        EnumC344990Dfl enumC344990Dfl2 = new EnumC344990Dfl("CLEAN_STORAGE_WITH_LOADING", 1, 2);
        CLEAN_STORAGE_WITH_LOADING = enumC344990Dfl2;
        EnumC344990Dfl enumC344990Dfl3 = new EnumC344990Dfl("CLEAN_STORAGE_SILENCE", 2, 3);
        CLEAN_STORAGE_SILENCE = enumC344990Dfl3;
        EnumC344990Dfl enumC344990Dfl4 = new EnumC344990Dfl("CLICK_CANCEL_CLEAN_LOADING", 3, 4);
        CLICK_CANCEL_CLEAN_LOADING = enumC344990Dfl4;
        EnumC344990Dfl[] enumC344990DflArr = {enumC344990Dfl, enumC344990Dfl2, enumC344990Dfl3, enumC344990Dfl4};
        LLILLJJLI = enumC344990DflArr;
        LLILLL = new C2254308sP(enumC344990DflArr);
    }

    public static EnumC344990Dfl[] values() {
        return (EnumC344990Dfl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC344990Dfl valueOf(String str) {
        return (EnumC344990Dfl) C08FF.LIZ(EnumC344990Dfl.class, str);
    }

    public EnumC344990Dfl(String str, int i, int i2) {
        this.LL = i2;
    }
}
