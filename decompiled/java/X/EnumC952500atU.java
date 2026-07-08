package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0atU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC952500atU {
    public static final EnumC952500atU ANCHOR_CONN_COHOST_WIDGET_LOAD;
    public static final EnumC952500atU ANCHOR_CONN_LAYOUT_FAIL;
    public static final EnumC952500atU ANCHOR_CONN_LAYOUT_INIT;
    public static final EnumC952500atU ANCHOR_CONN_LAYOUT_RENDER;
    public static final EnumC952500atU ANCHOR_CONN_SUCCESS;
    public static final /* synthetic */ EnumC952500atU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC952500atU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC952500atU enumC952500atU = new EnumC952500atU("ANCHOR_CONN_SUCCESS", 0, "conn_success");
        ANCHOR_CONN_SUCCESS = enumC952500atU;
        EnumC952500atU enumC952500atU2 = new EnumC952500atU("ANCHOR_CONN_COHOST_WIDGET_LOAD", 1, "cohost_widget_load");
        ANCHOR_CONN_COHOST_WIDGET_LOAD = enumC952500atU2;
        EnumC952500atU enumC952500atU3 = new EnumC952500atU("ANCHOR_CONN_LAYOUT_INIT", 2, "biz_layout_init");
        ANCHOR_CONN_LAYOUT_INIT = enumC952500atU3;
        EnumC952500atU enumC952500atU4 = new EnumC952500atU("ANCHOR_CONN_LAYOUT_RENDER", 3, "layout_render");
        ANCHOR_CONN_LAYOUT_RENDER = enumC952500atU4;
        EnumC952500atU enumC952500atU5 = new EnumC952500atU("ANCHOR_CONN_LAYOUT_FAIL", 4, "fail");
        ANCHOR_CONN_LAYOUT_FAIL = enumC952500atU5;
        EnumC952500atU[] enumC952500atUArr = {enumC952500atU, enumC952500atU2, enumC952500atU3, enumC952500atU4, enumC952500atU5};
        LLILLJJLI = enumC952500atUArr;
        LLILLL = new C2254308sP(enumC952500atUArr);
    }

    public static EnumC952500atU[] values() {
        return (EnumC952500atU[]) LLILLJJLI.clone();
    }

    public final boolean isEndState() {
        return this == ANCHOR_CONN_LAYOUT_RENDER || this == ANCHOR_CONN_LAYOUT_FAIL;
    }

    public final String getStageName() {
        return this.LL;
    }

    public static EnumC952500atU valueOf(String str) {
        return (EnumC952500atU) C08FF.LIZ(EnumC952500atU.class, str);
    }

    public EnumC952500atU(String str, int i, String str2) {
        this.LL = str2;
    }
}
