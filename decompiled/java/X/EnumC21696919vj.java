package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21696919vj {
    public static final EnumC21696919vj HOX_CHANGE;
    public static final EnumC21696919vj INVALID;
    public static final EnumC21696919vj LAYOUT_CHANGE;
    public static final EnumC21696919vj LIFECYCLE_CHANGE;
    public static final /* synthetic */ EnumC21696919vj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21696919vj NAVIGATE_TO_DETAIL;
    public static final EnumC21696919vj ON_DETACHED;
    public static final EnumC21696919vj SESSION_CHANGE;
    public static final EnumC21696919vj VERTICAL_IDLE;
    public static final EnumC21696919vj VERTICAL_SCROLL;

    public static InterfaceC2044707zh<EnumC21696919vj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21696919vj enumC21696919vj = new EnumC21696919vj("INVALID", 0);
        INVALID = enumC21696919vj;
        EnumC21696919vj enumC21696919vj2 = new EnumC21696919vj("VERTICAL_SCROLL", 1);
        VERTICAL_SCROLL = enumC21696919vj2;
        EnumC21696919vj enumC21696919vj3 = new EnumC21696919vj("VERTICAL_IDLE", 2);
        VERTICAL_IDLE = enumC21696919vj3;
        EnumC21696919vj enumC21696919vj4 = new EnumC21696919vj("HOX_CHANGE", 3);
        HOX_CHANGE = enumC21696919vj4;
        EnumC21696919vj enumC21696919vj5 = new EnumC21696919vj("LIFECYCLE_CHANGE", 4);
        LIFECYCLE_CHANGE = enumC21696919vj5;
        EnumC21696919vj enumC21696919vj6 = new EnumC21696919vj("LAYOUT_CHANGE", 5);
        LAYOUT_CHANGE = enumC21696919vj6;
        EnumC21696919vj enumC21696919vj7 = new EnumC21696919vj("NAVIGATE_TO_DETAIL", 6);
        NAVIGATE_TO_DETAIL = enumC21696919vj7;
        EnumC21696919vj enumC21696919vj8 = new EnumC21696919vj("SESSION_CHANGE", 7);
        SESSION_CHANGE = enumC21696919vj8;
        EnumC21696919vj enumC21696919vj9 = new EnumC21696919vj("ON_DETACHED", 8);
        ON_DETACHED = enumC21696919vj9;
        EnumC21696919vj[] enumC21696919vjArr = {enumC21696919vj, enumC21696919vj2, enumC21696919vj3, enumC21696919vj4, enumC21696919vj5, enumC21696919vj6, enumC21696919vj7, enumC21696919vj8, enumC21696919vj9};
        LL = enumC21696919vjArr;
        LLILLJJLI = new C2254308sP(enumC21696919vjArr);
    }

    public static EnumC21696919vj[] values() {
        return (EnumC21696919vj[]) LL.clone();
    }

    public static EnumC21696919vj valueOf(String str) {
        return (EnumC21696919vj) C08FF.LIZ(EnumC21696919vj.class, str);
    }

    public EnumC21696919vj(String str, int i) {
    }
}
