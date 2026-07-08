package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1704040uRe {
    public static final EnumC1704040uRe FETCH_LANDING_RESPONSE;
    public static final EnumC1704040uRe JUMP_TO_MALL;
    public static final EnumC1704040uRe LANDING_CONTAINER_READY;
    public static final EnumC1704040uRe LANDING_MEANINGFUL_RENDERED;
    public static final EnumC1704040uRe LANDING_PAGE_UPDATED;
    public static final /* synthetic */ EnumC1704040uRe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1704040uRe NO_LANDING_FINISHED;
    public static final EnumC1704040uRe SEND_LANDING_REQUEST;
    public static final EnumC1704040uRe START_JUMP_LANDING;
    public static final EnumC1704040uRe SWITCH_TO_MALL;
    public static final EnumC1704040uRe USER_CLICK_ENTRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1704040uRe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1704040uRe enumC1704040uRe = new EnumC1704040uRe("USER_CLICK_ENTRY", 0, "user_click_entry");
        USER_CLICK_ENTRY = enumC1704040uRe;
        EnumC1704040uRe enumC1704040uRe2 = new EnumC1704040uRe("JUMP_TO_MALL", 1, "jump_to_mall");
        JUMP_TO_MALL = enumC1704040uRe2;
        EnumC1704040uRe enumC1704040uRe3 = new EnumC1704040uRe("SWITCH_TO_MALL", 2, "switch_to_mall");
        SWITCH_TO_MALL = enumC1704040uRe3;
        EnumC1704040uRe enumC1704040uRe4 = new EnumC1704040uRe("START_JUMP_LANDING", 3, "start_jump_landing");
        START_JUMP_LANDING = enumC1704040uRe4;
        EnumC1704040uRe enumC1704040uRe5 = new EnumC1704040uRe("SEND_LANDING_REQUEST", 4, "send_landing_request");
        SEND_LANDING_REQUEST = enumC1704040uRe5;
        EnumC1704040uRe enumC1704040uRe6 = new EnumC1704040uRe("FETCH_LANDING_RESPONSE", 5, "fetch_landing_response");
        FETCH_LANDING_RESPONSE = enumC1704040uRe6;
        EnumC1704040uRe enumC1704040uRe7 = new EnumC1704040uRe("LANDING_CONTAINER_READY", 6, "landing_container_ready");
        LANDING_CONTAINER_READY = enumC1704040uRe7;
        EnumC1704040uRe enumC1704040uRe8 = new EnumC1704040uRe("LANDING_MEANINGFUL_RENDERED", 7, "landing_meaningful_rendered");
        LANDING_MEANINGFUL_RENDERED = enumC1704040uRe8;
        EnumC1704040uRe enumC1704040uRe9 = new EnumC1704040uRe("LANDING_PAGE_UPDATED", 8, "landing_page_update");
        LANDING_PAGE_UPDATED = enumC1704040uRe9;
        EnumC1704040uRe enumC1704040uRe10 = new EnumC1704040uRe("NO_LANDING_FINISHED", 9, "no_landing_finished");
        NO_LANDING_FINISHED = enumC1704040uRe10;
        EnumC1704040uRe[] enumC1704040uReArr = {enumC1704040uRe, enumC1704040uRe2, enumC1704040uRe3, enumC1704040uRe4, enumC1704040uRe5, enumC1704040uRe6, enumC1704040uRe7, enumC1704040uRe8, enumC1704040uRe9, enumC1704040uRe10};
        LLILLJJLI = enumC1704040uReArr;
        LLILLL = new C2254308sP(enumC1704040uReArr);
    }

    public static EnumC1704040uRe[] values() {
        return (EnumC1704040uRe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1704040uRe valueOf(String str) {
        return (EnumC1704040uRe) C08FF.LIZ(EnumC1704040uRe.class, str);
    }

    public EnumC1704040uRe(String str, int i, String str2) {
        this.LL = str2;
    }
}
