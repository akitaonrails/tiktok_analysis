package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1014780cVw {
    public static final /* synthetic */ EnumC1014780cVw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1014780cVw NOW_RENDER_AFTER_PRERENDER_FAIL;
    public static final EnumC1014780cVw NOW_RENDER_DIRECT;
    public static final EnumC1014780cVw PRERENDER;
    public static final EnumC1014780cVw UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1014780cVw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1014780cVw enumC1014780cVw = new EnumC1014780cVw("PRERENDER", 0, "prerender");
        PRERENDER = enumC1014780cVw;
        EnumC1014780cVw enumC1014780cVw2 = new EnumC1014780cVw("NOW_RENDER_DIRECT", 1, "now_render");
        NOW_RENDER_DIRECT = enumC1014780cVw2;
        EnumC1014780cVw enumC1014780cVw3 = new EnumC1014780cVw("NOW_RENDER_AFTER_PRERENDER_FAIL", 2, "prerender_fail");
        NOW_RENDER_AFTER_PRERENDER_FAIL = enumC1014780cVw3;
        EnumC1014780cVw enumC1014780cVw4 = new EnumC1014780cVw("UNKNOWN", 3, "unknown");
        UNKNOWN = enumC1014780cVw4;
        EnumC1014780cVw[] enumC1014780cVwArr = {enumC1014780cVw, enumC1014780cVw2, enumC1014780cVw3, enumC1014780cVw4};
        LLILLJJLI = enumC1014780cVwArr;
        LLILLL = new C2254308sP(enumC1014780cVwArr);
    }

    public static EnumC1014780cVw[] values() {
        return (EnumC1014780cVw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1014780cVw valueOf(String str) {
        return (EnumC1014780cVw) C08FF.LIZ(EnumC1014780cVw.class, str);
    }

    public EnumC1014780cVw(String str, int i, String str2) {
        this.LL = str2;
    }
}
