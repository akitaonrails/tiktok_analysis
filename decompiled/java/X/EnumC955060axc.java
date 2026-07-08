package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0axc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955060axc {
    public static final EnumC955060axc FAIL;
    public static final /* synthetic */ EnumC955060axc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC955060axc PIPELINE_REAL_TRIGGER;
    public static final EnumC955060axc PIPELINE_SUCCESS;
    public static final EnumC955060axc PIPELINE_TRIGGER;
    public static final EnumC955060axc PIPELINE_UI_DRAW_END;
    public static final EnumC955060axc PIPELINE_UI_UPDATED;
    public static final EnumC955060axc PIPELINE_WILL_START;
    public static final EnumC955060axc TIMEOUT;
    public final String LL;

    public EnumC955060axc() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC955060axc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955060axc enumC955060axc = new EnumC955060axc("PIPELINE_TRIGGER", 0, "trigger");
        PIPELINE_TRIGGER = enumC955060axc;
        EnumC955060axc enumC955060axc2 = new EnumC955060axc("PIPELINE_REAL_TRIGGER", 1, "real_trigger");
        PIPELINE_REAL_TRIGGER = enumC955060axc2;
        EnumC955060axc enumC955060axc3 = new EnumC955060axc("PIPELINE_WILL_START", 2, "will_start");
        PIPELINE_WILL_START = enumC955060axc3;
        EnumC955060axc enumC955060axc4 = new EnumC955060axc("PIPELINE_SUCCESS", 3, "success");
        PIPELINE_SUCCESS = enumC955060axc4;
        EnumC955060axc enumC955060axc5 = new EnumC955060axc("PIPELINE_UI_UPDATED", 4, "ui_updated");
        PIPELINE_UI_UPDATED = enumC955060axc5;
        EnumC955060axc enumC955060axc6 = new EnumC955060axc("PIPELINE_UI_DRAW_END", 5, "ui_draw_end");
        PIPELINE_UI_DRAW_END = enumC955060axc6;
        EnumC955060axc enumC955060axc7 = new EnumC955060axc("FAIL", 6, "fail");
        FAIL = enumC955060axc7;
        EnumC955060axc enumC955060axc8 = new EnumC955060axc("TIMEOUT", 7, "timeout");
        TIMEOUT = enumC955060axc8;
        EnumC955060axc[] enumC955060axcArr = {enumC955060axc, enumC955060axc2, enumC955060axc3, enumC955060axc4, enumC955060axc5, enumC955060axc6, enumC955060axc7, enumC955060axc8};
        LLILLJJLI = enumC955060axcArr;
        LLILLL = new C2254308sP(enumC955060axcArr);
    }

    public static EnumC955060axc[] values() {
        return (EnumC955060axc[]) LLILLJJLI.clone();
    }

    public final String getStageName() {
        return this.LL;
    }

    public static EnumC955060axc valueOf(String str) {
        return (EnumC955060axc) C08FF.LIZ(EnumC955060axc.class, str);
    }

    public EnumC955060axc(String str, int i, String str2) {
        this.LL = str2;
    }
}
