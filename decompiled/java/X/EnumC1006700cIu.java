package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006700cIu {
    public static final EnumC1006700cIu DASH_STATE;
    public static final EnumC1006700cIu FAST_SCROLL_STATE;
    public static final /* synthetic */ EnumC1006700cIu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006700cIu MAIN_THREAD_STATE;
    public static final EnumC1006700cIu SCROLL_STATE;
    public static final EnumC1006700cIu UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1006700cIu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006700cIu enumC1006700cIu = new EnumC1006700cIu("DASH_STATE", 0, "dash_state");
        DASH_STATE = enumC1006700cIu;
        EnumC1006700cIu enumC1006700cIu2 = new EnumC1006700cIu("SCROLL_STATE", 1, "scroll_state");
        SCROLL_STATE = enumC1006700cIu2;
        EnumC1006700cIu enumC1006700cIu3 = new EnumC1006700cIu("MAIN_THREAD_STATE", 2, "main_thread_state");
        MAIN_THREAD_STATE = enumC1006700cIu3;
        EnumC1006700cIu enumC1006700cIu4 = new EnumC1006700cIu("FAST_SCROLL_STATE", 3, "fast_scroll_state");
        FAST_SCROLL_STATE = enumC1006700cIu4;
        EnumC1006700cIu enumC1006700cIu5 = new EnumC1006700cIu("UNKNOWN", 4, "Unknown");
        UNKNOWN = enumC1006700cIu5;
        EnumC1006700cIu[] enumC1006700cIuArr = {enumC1006700cIu, enumC1006700cIu2, enumC1006700cIu3, enumC1006700cIu4, enumC1006700cIu5};
        LLILLJJLI = enumC1006700cIuArr;
        LLILLL = new C2254308sP(enumC1006700cIuArr);
    }

    public static EnumC1006700cIu[] values() {
        return (EnumC1006700cIu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1006700cIu valueOf(String str) {
        return (EnumC1006700cIu) C08FF.LIZ(EnumC1006700cIu.class, str);
    }

    public EnumC1006700cIu(String str, int i, String str2) {
        this.LL = str2;
    }
}
