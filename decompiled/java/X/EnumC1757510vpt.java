package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vpt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757510vpt {
    public static final EnumC1757510vpt CACHE_RENDER_END;
    public static final /* synthetic */ EnumC1757510vpt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757510vpt NO_CACHE_PRELOAD;
    public static final EnumC1757510vpt ONLINE_RENDER_END;
    public static final EnumC1757510vpt ROUTER_JUMP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757510vpt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1757510vpt enumC1757510vpt = new EnumC1757510vpt("ROUTER_JUMP", 0, "router_jump");
        ROUTER_JUMP = enumC1757510vpt;
        EnumC1757510vpt enumC1757510vpt2 = new EnumC1757510vpt("NO_CACHE_PRELOAD", 1, "no_cache_preload");
        NO_CACHE_PRELOAD = enumC1757510vpt2;
        EnumC1757510vpt enumC1757510vpt3 = new EnumC1757510vpt("CACHE_RENDER_END", 2, "cache_render_end");
        CACHE_RENDER_END = enumC1757510vpt3;
        EnumC1757510vpt enumC1757510vpt4 = new EnumC1757510vpt("ONLINE_RENDER_END", 3, "online_render_end");
        ONLINE_RENDER_END = enumC1757510vpt4;
        EnumC1757510vpt[] enumC1757510vptArr = {enumC1757510vpt, enumC1757510vpt2, enumC1757510vpt3, enumC1757510vpt4};
        LLILLJJLI = enumC1757510vptArr;
        LLILLL = new C2254308sP(enumC1757510vptArr);
    }

    public static EnumC1757510vpt[] values() {
        return (EnumC1757510vpt[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1757510vpt valueOf(String str) {
        return (EnumC1757510vpt) C08FF.LIZ(EnumC1757510vpt.class, str);
    }

    public EnumC1757510vpt(String str, int i, String str2) {
        this.LL = str2;
    }
}
