package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1366205Wi {
    public static final EnumC1366205Wi EVENT_TOOLS_LYRIC_MOTION_GEN_DEP_RES_DOWNLOAD;
    public static final EnumC1366205Wi EVENT_TOOLS_LYRIC_MOTION_GEN_FALLBACK_FONT_DOWNLOAD;
    public static final EnumC1366205Wi EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST;
    public static final EnumC1366205Wi EVENT_TOOLS_LYRIC_MOTION_GEN_TOTAL;
    public static final /* synthetic */ EnumC1366205Wi[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1366205Wi> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1366205Wi enumC1366205Wi = new EnumC1366205Wi("EVENT_TOOLS_LYRIC_MOTION_GEN_TOTAL", 0, "tools_lyric_motion_gen_total", 0);
        EVENT_TOOLS_LYRIC_MOTION_GEN_TOTAL = enumC1366205Wi;
        EnumC1366205Wi enumC1366205Wi2 = new EnumC1366205Wi("EVENT_TOOLS_LYRIC_MOTION_GEN_DEP_RES_DOWNLOAD", 1, "tools_lyric_motion_gen_dep_res_download", 1);
        EVENT_TOOLS_LYRIC_MOTION_GEN_DEP_RES_DOWNLOAD = enumC1366205Wi2;
        EnumC1366205Wi enumC1366205Wi3 = new EnumC1366205Wi("EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST", 2, "tools_lyric_motion_gen_minidraft_request", 2);
        EVENT_TOOLS_LYRIC_MOTION_GEN_MINIDRAFT_REQUEST = enumC1366205Wi3;
        EnumC1366205Wi enumC1366205Wi4 = new EnumC1366205Wi("EVENT_TOOLS_LYRIC_MOTION_GEN_FALLBACK_FONT_DOWNLOAD", 3, "tools_lyric_motion_gen_fallback_font_download", 3);
        EVENT_TOOLS_LYRIC_MOTION_GEN_FALLBACK_FONT_DOWNLOAD = enumC1366205Wi4;
        EnumC1366205Wi[] enumC1366205WiArr = {enumC1366205Wi, enumC1366205Wi2, enumC1366205Wi3, enumC1366205Wi4};
        LLILLL = enumC1366205WiArr;
        LLILZ = new C2254308sP(enumC1366205WiArr);
    }

    public static EnumC1366205Wi[] values() {
        return (EnumC1366205Wi[]) LLILLL.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public final int getStep() {
        return this.LLILLJJLI;
    }

    public static EnumC1366205Wi valueOf(String str) {
        return (EnumC1366205Wi) C08FF.LIZ(EnumC1366205Wi.class, str);
    }

    public EnumC1366205Wi(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
