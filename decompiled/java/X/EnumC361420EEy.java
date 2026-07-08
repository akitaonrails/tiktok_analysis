package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361420EEy {
    public static final /* synthetic */ EnumC361420EEy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC361420EEy SEARCH_FLOAT;
    public static final EnumC361420EEy SEARCH_HEAD;
    public static final EnumC361420EEy SEARCH_TAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC361420EEy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC361420EEy enumC361420EEy = new EnumC361420EEy("SEARCH_TAIL", 0, "search_tail");
        SEARCH_TAIL = enumC361420EEy;
        EnumC361420EEy enumC361420EEy2 = new EnumC361420EEy("SEARCH_HEAD", 1, "search_head");
        SEARCH_HEAD = enumC361420EEy2;
        EnumC361420EEy enumC361420EEy3 = new EnumC361420EEy("SEARCH_FLOAT", 2, "search_float");
        SEARCH_FLOAT = enumC361420EEy3;
        EnumC361420EEy[] enumC361420EEyArr = {enumC361420EEy, enumC361420EEy2, enumC361420EEy3};
        LLILLJJLI = enumC361420EEyArr;
        LLILLL = new C2254308sP(enumC361420EEyArr);
    }

    public static EnumC361420EEy[] values() {
        return (EnumC361420EEy[]) LLILLJJLI.clone();
    }

    public final String getTypeVal() {
        return this.LL;
    }

    public static EnumC361420EEy valueOf(String str) {
        return (EnumC361420EEy) C08FF.LIZ(EnumC361420EEy.class, str);
    }

    public EnumC361420EEy(String str, int i, String str2) {
        this.LL = str2;
    }
}
