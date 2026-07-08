package X;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC780370UjL {
    public static final EnumC780370UjL CRITICAL;
    public static final EnumC780370UjL IMMEDIATE;
    public static final /* synthetic */ EnumC780370UjL[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC780370UjL LONG;
    public static final EnumC780370UjL MEDIUM;
    public static final EnumC780370UjL SHORT;
    public final long LL;
    public final List<String> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC780370UjL> getEntries() {
        return LLILZ;
    }

    static {
        EnumC780370UjL enumC780370UjL = new EnumC780370UjL(0, 0L, "IMMEDIATE", C1697810uHb.LJIIJJI("mem_relief_light", "clear_record_filter_cache", "clear_search_cache", "pause_fresco", "pause_gecko", "clear_fresco_anim_cache"));
        IMMEDIATE = enumC780370UjL;
        EnumC780370UjL enumC780370UjL2 = new EnumC780370UjL(1, 10000L, "SHORT", C1697810uHb.LJIIJJI("clear_broadcast_effect_cache", "close_broadcast_dialog", "clear_multi_guest_dsl", "suspend_lego_tasks", "gc"));
        SHORT = enumC780370UjL2;
        EnumC780370UjL enumC780370UjL3 = new EnumC780370UjL(2, 20000L, "MEDIUM", C1697810uHb.LJIIJJI("clear_sticker_viewmodel_cache", "clear_live_center_view", "clear_effect_aes_cache", "clear_model_config_cache", "clear_font_effect_cache", "clear_gecko_cache", "cpu_suppress"));
        MEDIUM = enumC780370UjL3;
        EnumC780370UjL enumC780370UjL4 = new EnumC780370UjL(3, 30000L, "LONG", C1697810uHb.LJIIJJI("register_bg_net_control", "clear_net_data_pipeline"));
        LONG = enumC780370UjL4;
        EnumC780370UjL enumC780370UjL5 = new EnumC780370UjL(4, 40000L, "CRITICAL", Collections.singletonList("finish_other_page"));
        CRITICAL = enumC780370UjL5;
        EnumC780370UjL[] enumC780370UjLArr = {enumC780370UjL, enumC780370UjL2, enumC780370UjL3, enumC780370UjL4, enumC780370UjL5};
        LLILLL = enumC780370UjLArr;
        LLILZ = new C2254308sP(enumC780370UjLArr);
    }

    public static EnumC780370UjL[] values() {
        return (EnumC780370UjL[]) LLILLL.clone();
    }

    public final List<String> getDefaultActions() {
        return this.LLILLJJLI;
    }

    public final long getDefaultDelayMs() {
        return this.LL;
    }

    public static EnumC780370UjL valueOf(String str) {
        return (EnumC780370UjL) C08FF.LIZ(EnumC780370UjL.class, str);
    }

    public EnumC780370UjL(int i, long j, String str, List list) {
        this.LL = j;
        this.LLILLJJLI = list;
    }
}
