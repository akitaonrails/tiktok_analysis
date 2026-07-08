package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1193700hAW {
    public static final /* synthetic */ EnumC1193700hAW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1193700hAW NETWORK;
    public static final EnumC1193700hAW NETWORK_FAIL;
    public static final EnumC1193700hAW NOT_RENDER;
    public static final EnumC1193700hAW PAGE_OPEN;
    public static final EnumC1193700hAW RENDER;
    public static final EnumC1193700hAW RENDER_FINISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1193700hAW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1193700hAW enumC1193700hAW = new EnumC1193700hAW("PAGE_OPEN", 0, "page_open");
        PAGE_OPEN = enumC1193700hAW;
        EnumC1193700hAW enumC1193700hAW2 = new EnumC1193700hAW("NETWORK", 1, "network");
        NETWORK = enumC1193700hAW2;
        EnumC1193700hAW enumC1193700hAW3 = new EnumC1193700hAW("RENDER", 2, "render");
        RENDER = enumC1193700hAW3;
        EnumC1193700hAW enumC1193700hAW4 = new EnumC1193700hAW("RENDER_FINISH", 3, "render_finish");
        RENDER_FINISH = enumC1193700hAW4;
        EnumC1193700hAW enumC1193700hAW5 = new EnumC1193700hAW("NETWORK_FAIL", 4, "network_fail");
        NETWORK_FAIL = enumC1193700hAW5;
        EnumC1193700hAW enumC1193700hAW6 = new EnumC1193700hAW("NOT_RENDER", 5, "not_render");
        NOT_RENDER = enumC1193700hAW6;
        EnumC1193700hAW[] enumC1193700hAWArr = {enumC1193700hAW, enumC1193700hAW2, enumC1193700hAW3, enumC1193700hAW4, enumC1193700hAW5, enumC1193700hAW6};
        LLILLJJLI = enumC1193700hAWArr;
        LLILLL = new C2254308sP(enumC1193700hAWArr);
    }

    public static EnumC1193700hAW[] values() {
        return (EnumC1193700hAW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1193700hAW valueOf(String str) {
        return (EnumC1193700hAW) C08FF.LIZ(EnumC1193700hAW.class, str);
    }

    public EnumC1193700hAW(String str, int i, String str2) {
        this.LL = str2;
    }
}
