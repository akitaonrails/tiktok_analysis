package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC913010Zrn {
    public static final EnumC913010Zrn AUTO;
    public static final C913180Zs4 Companion;
    public static final EnumC913010Zrn LIKE_VIDEO;
    public static final /* synthetic */ EnumC913010Zrn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC913010Zrn MESSAGE_BTN;
    public static final EnumC913010Zrn MESSAGE_CELL;
    public static final EnumC913010Zrn UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC913010Zrn> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Zs4] */
    static {
        EnumC913010Zrn enumC913010Zrn = new EnumC913010Zrn("LIKE_VIDEO", 0, "like_video");
        LIKE_VIDEO = enumC913010Zrn;
        EnumC913010Zrn enumC913010Zrn2 = new EnumC913010Zrn("AUTO", 1, "auto");
        AUTO = enumC913010Zrn2;
        EnumC913010Zrn enumC913010Zrn3 = new EnumC913010Zrn("MESSAGE_BTN", 2, "message_btn");
        MESSAGE_BTN = enumC913010Zrn3;
        EnumC913010Zrn enumC913010Zrn4 = new EnumC913010Zrn("MESSAGE_CELL", 3, "message_cell");
        MESSAGE_CELL = enumC913010Zrn4;
        EnumC913010Zrn enumC913010Zrn5 = new EnumC913010Zrn("UNKNOWN", 4, "unknown");
        UNKNOWN = enumC913010Zrn5;
        EnumC913010Zrn[] enumC913010ZrnArr = {enumC913010Zrn, enumC913010Zrn2, enumC913010Zrn3, enumC913010Zrn4, enumC913010Zrn5};
        LLILLJJLI = enumC913010ZrnArr;
        LLILLL = new C2254308sP(enumC913010ZrnArr);
        Companion = new Object() { // from class: X.0Zs4
        };
    }

    public static EnumC913010Zrn[] values() {
        return (EnumC913010Zrn[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC913010Zrn valueOf(String str) {
        return (EnumC913010Zrn) C08FF.LIZ(EnumC913010Zrn.class, str);
    }

    public EnumC913010Zrn(String str, int i, String str2) {
        this.LL = str2;
    }
}
