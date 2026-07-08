package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955050axb {
    public static final EnumC955050axb FAIL;
    public static final /* synthetic */ EnumC955050axb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC955050axb PIPELINE_REAL_TRIGGER;
    public static final EnumC955050axb PIPELINE_SUCCESS;
    public static final EnumC955050axb PIPELINE_TRIGGER;
    public static final EnumC955050axb PIPELINE_UI_DRAW_END;
    public static final EnumC955050axb PIPELINE_UI_UPDATED;
    public static final EnumC955050axb PIPELINE_WILL_START;
    public static final EnumC955050axb TIMEOUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC955050axb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955050axb enumC955050axb = new EnumC955050axb("PIPELINE_TRIGGER", 0, "trigger");
        PIPELINE_TRIGGER = enumC955050axb;
        EnumC955050axb enumC955050axb2 = new EnumC955050axb("PIPELINE_REAL_TRIGGER", 1, "real_trigger");
        PIPELINE_REAL_TRIGGER = enumC955050axb2;
        EnumC955050axb enumC955050axb3 = new EnumC955050axb("PIPELINE_WILL_START", 2, "will_start");
        PIPELINE_WILL_START = enumC955050axb3;
        EnumC955050axb enumC955050axb4 = new EnumC955050axb("PIPELINE_SUCCESS", 3, "success");
        PIPELINE_SUCCESS = enumC955050axb4;
        EnumC955050axb enumC955050axb5 = new EnumC955050axb("PIPELINE_UI_UPDATED", 4, "ui_updated");
        PIPELINE_UI_UPDATED = enumC955050axb5;
        EnumC955050axb enumC955050axb6 = new EnumC955050axb("PIPELINE_UI_DRAW_END", 5, "ui_draw_end");
        PIPELINE_UI_DRAW_END = enumC955050axb6;
        EnumC955050axb enumC955050axb7 = new EnumC955050axb("FAIL", 6, "fail");
        FAIL = enumC955050axb7;
        EnumC955050axb enumC955050axb8 = new EnumC955050axb("TIMEOUT", 7, "timeout");
        TIMEOUT = enumC955050axb8;
        EnumC955050axb[] enumC955050axbArr = {enumC955050axb, enumC955050axb2, enumC955050axb3, enumC955050axb4, enumC955050axb5, enumC955050axb6, enumC955050axb7, enumC955050axb8};
        LLILLJJLI = enumC955050axbArr;
        LLILLL = new C2254308sP(enumC955050axbArr);
    }

    public static EnumC955050axb[] values() {
        return (EnumC955050axb[]) LLILLJJLI.clone();
    }

    public final String getStageName() {
        return this.LL;
    }

    public static EnumC955050axb valueOf(String str) {
        return (EnumC955050axb) C08FF.LIZ(EnumC955050axb.class, str);
    }

    public EnumC955050axb(String str, int i, String str2) {
        this.LL = str2;
    }
}
