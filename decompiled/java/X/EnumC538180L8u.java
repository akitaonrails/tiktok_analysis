package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538180L8u {
    public static final EnumC538180L8u CLICK_ADD_MATERIAL;
    public static final EnumC538180L8u CLICK_AI_AUTOCUT;
    public static final EnumC538180L8u CLICK_AUTOCUT;
    public static final EnumC538180L8u CLICK_DELETE_MATERIAL;
    public static final EnumC538180L8u CLICK_EXIT;
    public static final /* synthetic */ EnumC538180L8u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538180L8u SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC538180L8u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC538180L8u enumC538180L8u = new EnumC538180L8u("SHOW", 0, "show");
        SHOW = enumC538180L8u;
        EnumC538180L8u enumC538180L8u2 = new EnumC538180L8u("CLICK_DELETE_MATERIAL", 1, "click_delete_material");
        CLICK_DELETE_MATERIAL = enumC538180L8u2;
        EnumC538180L8u enumC538180L8u3 = new EnumC538180L8u("CLICK_ADD_MATERIAL", 2, "click_add_material");
        CLICK_ADD_MATERIAL = enumC538180L8u3;
        EnumC538180L8u enumC538180L8u4 = new EnumC538180L8u("CLICK_AI_AUTOCUT", 3, "click_ai_autocut");
        CLICK_AI_AUTOCUT = enumC538180L8u4;
        EnumC538180L8u enumC538180L8u5 = new EnumC538180L8u("CLICK_AUTOCUT", 4, "click_autocut");
        CLICK_AUTOCUT = enumC538180L8u5;
        EnumC538180L8u enumC538180L8u6 = new EnumC538180L8u("CLICK_EXIT", 5, "click_exit");
        CLICK_EXIT = enumC538180L8u6;
        EnumC538180L8u[] enumC538180L8uArr = {enumC538180L8u, enumC538180L8u2, enumC538180L8u3, enumC538180L8u4, enumC538180L8u5, enumC538180L8u6};
        LLILLJJLI = enumC538180L8uArr;
        LLILLL = new C2254308sP(enumC538180L8uArr);
    }

    public static EnumC538180L8u[] values() {
        return (EnumC538180L8u[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC538180L8u valueOf(String str) {
        return (EnumC538180L8u) C08FF.LIZ(EnumC538180L8u.class, str);
    }

    public EnumC538180L8u(String str, int i, String str2) {
        this.LL = str2;
    }
}
