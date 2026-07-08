package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046900Ex {
    public static final /* synthetic */ EnumC046900Ex[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046900Ex PAGE_CREATION_TO_FIRST_FRAME_RENDER;
    public static final EnumC046900Ex PAGE_CREATION_TO_VIEW_VISIBLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC046900Ex> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046900Ex enumC046900Ex = new EnumC046900Ex("PAGE_CREATION_TO_VIEW_VISIBLE", 0, "page_creation_to_view_visible");
        PAGE_CREATION_TO_VIEW_VISIBLE = enumC046900Ex;
        EnumC046900Ex enumC046900Ex2 = new EnumC046900Ex("PAGE_CREATION_TO_FIRST_FRAME_RENDER", 1, "page_creation_to_first_frame_render");
        PAGE_CREATION_TO_FIRST_FRAME_RENDER = enumC046900Ex2;
        EnumC046900Ex[] enumC046900ExArr = {enumC046900Ex, enumC046900Ex2};
        LLILLJJLI = enumC046900ExArr;
        LLILLL = new C2254308sP(enumC046900ExArr);
    }

    public static EnumC046900Ex[] values() {
        return (EnumC046900Ex[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC046900Ex valueOf(String str) {
        return (EnumC046900Ex) C08FF.LIZ(EnumC046900Ex.class, str);
    }

    public EnumC046900Ex(String str, int i, String str2) {
        this.LL = str2;
    }
}
