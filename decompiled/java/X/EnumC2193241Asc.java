package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Asc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193241Asc {
    public static final EnumC2193241Asc CLICK_PUBLISH;
    public static final EnumC2193241Asc COLD_START;
    public static final EnumC2193241Asc DELETE_POST;
    public static final EnumC2193241Asc DRAFT_DELETED;
    public static final EnumC2193241Asc DRAFT_SAVED;
    public static final /* synthetic */ EnumC2193241Asc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193241Asc PULL_REFRESH;
    public static final EnumC2193241Asc USER_INTERACTION;
    public static final EnumC2193241Asc VISIBILITY_CHANGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2193241Asc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193241Asc enumC2193241Asc = new EnumC2193241Asc("COLD_START", 0, "cold_start");
        COLD_START = enumC2193241Asc;
        EnumC2193241Asc enumC2193241Asc2 = new EnumC2193241Asc("PULL_REFRESH", 1, "pull_refresh");
        PULL_REFRESH = enumC2193241Asc2;
        EnumC2193241Asc enumC2193241Asc3 = new EnumC2193241Asc("VISIBILITY_CHANGE", 2, "visibility_change");
        VISIBILITY_CHANGE = enumC2193241Asc3;
        EnumC2193241Asc enumC2193241Asc4 = new EnumC2193241Asc("CLICK_PUBLISH", 3, "click_publish");
        CLICK_PUBLISH = enumC2193241Asc4;
        EnumC2193241Asc enumC2193241Asc5 = new EnumC2193241Asc("DELETE_POST", 4, "delete_post");
        DELETE_POST = enumC2193241Asc5;
        EnumC2193241Asc enumC2193241Asc6 = new EnumC2193241Asc("DRAFT_SAVED", 5, "draft_saved");
        DRAFT_SAVED = enumC2193241Asc6;
        EnumC2193241Asc enumC2193241Asc7 = new EnumC2193241Asc("DRAFT_DELETED", 6, "draft_deleted");
        DRAFT_DELETED = enumC2193241Asc7;
        EnumC2193241Asc enumC2193241Asc8 = new EnumC2193241Asc("USER_INTERACTION", 7, "user_interaction");
        USER_INTERACTION = enumC2193241Asc8;
        EnumC2193241Asc[] enumC2193241AscArr = {enumC2193241Asc, enumC2193241Asc2, enumC2193241Asc3, enumC2193241Asc4, enumC2193241Asc5, enumC2193241Asc6, enumC2193241Asc7, enumC2193241Asc8};
        LLILLJJLI = enumC2193241AscArr;
        LLILLL = new C2254308sP(enumC2193241AscArr);
    }

    public static EnumC2193241Asc[] values() {
        return (EnumC2193241Asc[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2193241Asc valueOf(String str) {
        return (EnumC2193241Asc) C08FF.LIZ(EnumC2193241Asc.class, str);
    }

    public EnumC2193241Asc(String str, int i, String str2) {
        this.LL = str2;
    }
}
