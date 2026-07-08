package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19355710nz {
    public static final EnumC19355710nz ENQUEUE_SERIAL;
    public static final EnumC19355710nz EXTERNAL_RECEIVE_MSG;
    public static final EnumC19355710nz FRONTIER_RECEIVE_MSG;
    public static final EnumC19355710nz JSON_PARSE_OBJECT;
    public static final /* synthetic */ EnumC19355710nz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19355710nz LOOP_SERIAL;
    public static final EnumC19355710nz MOB_CLICK;
    public static final EnumC19355710nz MOB_DISMISS;
    public static final EnumC19355710nz MOB_RECEIVE;
    public static final EnumC19355710nz MOB_SHOW;
    public static final EnumC19355710nz OBJECT_TO_JSON;
    public static final EnumC19355710nz PULL_MESSAGE;
    public static final EnumC19355710nz SHOW_PUSH_MESSAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19355710nz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19355710nz enumC19355710nz = new EnumC19355710nz("ENQUEUE_SERIAL", 0, "enqueue_serial");
        ENQUEUE_SERIAL = enumC19355710nz;
        EnumC19355710nz enumC19355710nz2 = new EnumC19355710nz("LOOP_SERIAL", 1, "loop_serial");
        LOOP_SERIAL = enumC19355710nz2;
        EnumC19355710nz enumC19355710nz3 = new EnumC19355710nz("SHOW_PUSH_MESSAGE", 2, "show_push_message");
        SHOW_PUSH_MESSAGE = enumC19355710nz3;
        EnumC19355710nz enumC19355710nz4 = new EnumC19355710nz("EXTERNAL_RECEIVE_MSG", 3, "external_receive_msg");
        EXTERNAL_RECEIVE_MSG = enumC19355710nz4;
        EnumC19355710nz enumC19355710nz5 = new EnumC19355710nz("FRONTIER_RECEIVE_MSG", 4, "frontier_receive_msg");
        FRONTIER_RECEIVE_MSG = enumC19355710nz5;
        EnumC19355710nz enumC19355710nz6 = new EnumC19355710nz("PULL_MESSAGE", 5, "pull_message");
        PULL_MESSAGE = enumC19355710nz6;
        EnumC19355710nz enumC19355710nz7 = new EnumC19355710nz("JSON_PARSE_OBJECT", 6, "json_parse_object");
        JSON_PARSE_OBJECT = enumC19355710nz7;
        EnumC19355710nz enumC19355710nz8 = new EnumC19355710nz("OBJECT_TO_JSON", 7, "object_to_json");
        OBJECT_TO_JSON = enumC19355710nz8;
        EnumC19355710nz enumC19355710nz9 = new EnumC19355710nz("MOB_CLICK", 8, "mob_click");
        MOB_CLICK = enumC19355710nz9;
        EnumC19355710nz enumC19355710nz10 = new EnumC19355710nz("MOB_SHOW", 9, "mob_show");
        MOB_SHOW = enumC19355710nz10;
        EnumC19355710nz enumC19355710nz11 = new EnumC19355710nz("MOB_RECEIVE", 10, "mob_receive");
        MOB_RECEIVE = enumC19355710nz11;
        EnumC19355710nz enumC19355710nz12 = new EnumC19355710nz("MOB_DISMISS", 11, "mob_dismiss");
        MOB_DISMISS = enumC19355710nz12;
        EnumC19355710nz[] enumC19355710nzArr = {enumC19355710nz, enumC19355710nz2, enumC19355710nz3, enumC19355710nz4, enumC19355710nz5, enumC19355710nz6, enumC19355710nz7, enumC19355710nz8, enumC19355710nz9, enumC19355710nz10, enumC19355710nz11, enumC19355710nz12};
        LLILLJJLI = enumC19355710nzArr;
        LLILLL = new C2254308sP(enumC19355710nzArr);
    }

    public static EnumC19355710nz[] values() {
        return (EnumC19355710nz[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19355710nz valueOf(String str) {
        return (EnumC19355710nz) C08FF.LIZ(EnumC19355710nz.class, str);
    }

    public EnumC19355710nz(String str, int i, String str2) {
        this.LL = str2;
    }
}
