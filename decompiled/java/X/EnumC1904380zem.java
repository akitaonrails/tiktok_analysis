package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1904380zem {
    public static final EnumC1904380zem DM_DATA_READY_TIME;
    public static final EnumC1904380zem DM_READY_BUT_NO_DATA;
    public static final EnumC1904380zem DM_SHOW_TIME;
    public static final EnumC1904380zem ENTRANCE_DATA_READY_TIME;
    public static final EnumC1904380zem ENTRANCE_LIST_IS_PRELOAD;
    public static final EnumC1904380zem ENTRANCE_LIST_NETWORK_TIME;
    public static final EnumC1904380zem ENTRANCE_LIST_PRELOAD_IS_CANCELLED;
    public static final EnumC1904380zem ENTRANCE_LIST_SHOW_TIME;
    public static final EnumC1904380zem FRAGMENT_CREATE_TIME;
    public static final EnumC1904380zem FRAGMENT_ON_CREATE_COST;
    public static final EnumC1904380zem FRAGMENT_ON_CREATE_VIEW_COST;
    public static final EnumC1904380zem FRAGMENT_ON_RESUME_COST;
    public static final EnumC1904380zem FRAGMENT_ON_VIEW_CREATED_COST;
    public static final EnumC1904380zem FRAGMENT_VIEW_CREATE_TIME;
    public static final EnumC1904380zem HAS_DM;
    public static final EnumC1904380zem JANUS_NETWORK_TIME;
    public static final EnumC1904380zem LAST_SHOW_SECTION;
    public static final /* synthetic */ EnumC1904380zem[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC1904380zem SHOW_TOTAL_TIME;
    public static final EnumC1904380zem SKYLIGHT_SHOW_TIME;
    public final String LL;
    public final int LLILLJJLI;
    public volatile C1904410zep LLILLL = new C1904410zep();
    public volatile C1904420zeq LLILZ = new C1904420zeq(0L);
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);

    public static InterfaceC2044707zh<EnumC1904380zem> getEntries() {
        return LLIZ;
    }

    /* JADX INFO: renamed from: getValue, reason: collision with other method in class */
    public final synchronized Object m72getValue() {
        return this.LLILZ.LIZ;
    }

    public final synchronized void intervalEnd() {
        this.LLILLL.LIZIZ = System.currentTimeMillis();
        C0VWW.LIZIZ("latency_inbox");
    }

    public final synchronized void intervalStart() {
        C0VWW.LJI("latency_inbox");
        this.LLILLL.LIZ = System.currentTimeMillis();
    }

    static {
        EnumC1904380zem enumC1904380zem = new EnumC1904380zem("FRAGMENT_CREATE_TIME", 0, "inbox_fragment_create_time", 0);
        FRAGMENT_CREATE_TIME = enumC1904380zem;
        EnumC1904380zem enumC1904380zem2 = new EnumC1904380zem("FRAGMENT_ON_CREATE_COST", 1, "inbox_fragment_on_create_cost", 0);
        FRAGMENT_ON_CREATE_COST = enumC1904380zem2;
        EnumC1904380zem enumC1904380zem3 = new EnumC1904380zem("FRAGMENT_ON_RESUME_COST", 2, "inbox_fragment_on_resume_cost", 0);
        FRAGMENT_ON_RESUME_COST = enumC1904380zem3;
        EnumC1904380zem enumC1904380zem4 = new EnumC1904380zem("FRAGMENT_ON_CREATE_VIEW_COST", 3, "inbox_fragment_on_create_view_cost", 0);
        FRAGMENT_ON_CREATE_VIEW_COST = enumC1904380zem4;
        EnumC1904380zem enumC1904380zem5 = new EnumC1904380zem("FRAGMENT_ON_VIEW_CREATED_COST", 4, "inbox_fragment_on_view_created_cost", 0);
        FRAGMENT_ON_VIEW_CREATED_COST = enumC1904380zem5;
        EnumC1904380zem enumC1904380zem6 = new EnumC1904380zem("FRAGMENT_VIEW_CREATE_TIME", 5, "inbox_fragment_view_created_time", 0);
        FRAGMENT_VIEW_CREATE_TIME = enumC1904380zem6;
        EnumC1904380zem enumC1904380zem7 = new EnumC1904380zem("JANUS_NETWORK_TIME", 6, "inbox_janus_network_time", 0);
        JANUS_NETWORK_TIME = enumC1904380zem7;
        EnumC1904380zem enumC1904380zem8 = new EnumC1904380zem("ENTRANCE_LIST_NETWORK_TIME", 7, "inbox_entrance_list_network_time", 0);
        ENTRANCE_LIST_NETWORK_TIME = enumC1904380zem8;
        EnumC1904380zem enumC1904380zem9 = new EnumC1904380zem("SKYLIGHT_SHOW_TIME", 8, "inbox_skylight_show_time", 0);
        SKYLIGHT_SHOW_TIME = enumC1904380zem9;
        EnumC1904380zem enumC1904380zem10 = new EnumC1904380zem("ENTRANCE_LIST_SHOW_TIME", 9, "inbox_entrance_list_show_time", 0);
        ENTRANCE_LIST_SHOW_TIME = enumC1904380zem10;
        EnumC1904380zem enumC1904380zem11 = new EnumC1904380zem("ENTRANCE_DATA_READY_TIME", 10, "inbox_entrance_data_ready_time", 0);
        ENTRANCE_DATA_READY_TIME = enumC1904380zem11;
        EnumC1904380zem enumC1904380zem12 = new EnumC1904380zem("DM_DATA_READY_TIME", 11, "inbox_dm_data_ready_time", 0);
        DM_DATA_READY_TIME = enumC1904380zem12;
        EnumC1904380zem enumC1904380zem13 = new EnumC1904380zem("DM_SHOW_TIME", 12, "inbox_dm_show_time", 0);
        DM_SHOW_TIME = enumC1904380zem13;
        EnumC1904380zem enumC1904380zem14 = new EnumC1904380zem("ENTRANCE_LIST_IS_PRELOAD", 13, "inbox_entrance_list_is_preload", 1);
        ENTRANCE_LIST_IS_PRELOAD = enumC1904380zem14;
        EnumC1904380zem enumC1904380zem15 = new EnumC1904380zem("ENTRANCE_LIST_PRELOAD_IS_CANCELLED", 14, "inbox_entrance_list_preload_is_cancelled", 1);
        ENTRANCE_LIST_PRELOAD_IS_CANCELLED = enumC1904380zem15;
        EnumC1904380zem enumC1904380zem16 = new EnumC1904380zem("LAST_SHOW_SECTION", 15, "inbox_last_show_section", 1);
        LAST_SHOW_SECTION = enumC1904380zem16;
        EnumC1904380zem enumC1904380zem17 = new EnumC1904380zem("HAS_DM", 16, "inbox_has_dm", 1);
        HAS_DM = enumC1904380zem17;
        EnumC1904380zem enumC1904380zem18 = new EnumC1904380zem("DM_READY_BUT_NO_DATA", 17, "dm_ready_but_no_data", 1);
        DM_READY_BUT_NO_DATA = enumC1904380zem18;
        EnumC1904380zem enumC1904380zem19 = new EnumC1904380zem("SHOW_TOTAL_TIME", 18, "inbox_show_total_time", 1);
        SHOW_TOTAL_TIME = enumC1904380zem19;
        EnumC1904380zem[] enumC1904380zemArr = {enumC1904380zem, enumC1904380zem2, enumC1904380zem3, enumC1904380zem4, enumC1904380zem5, enumC1904380zem6, enumC1904380zem7, enumC1904380zem8, enumC1904380zem9, enumC1904380zem10, enumC1904380zem11, enumC1904380zem12, enumC1904380zem13, enumC1904380zem14, enumC1904380zem15, enumC1904380zem16, enumC1904380zem17, enumC1904380zem18, enumC1904380zem19};
        LLILZLL = enumC1904380zemArr;
        LLIZ = new C2254308sP(enumC1904380zemArr);
    }

    public static EnumC1904380zem[] values() {
        return (EnumC1904380zem[]) LLILZLL.clone();
    }

    public final boolean isEnd() {
        return this.LLILLL.LIZIZ > 0;
    }

    public final String getEventKey() {
        return this.LL;
    }

    public final int getEventType() {
        return this.LLILLJJLI;
    }

    public final AtomicBoolean getHasRecord() {
        return this.LLILZIL;
    }

    public final C1904410zep getInterval() {
        return this.LLILLL;
    }

    public final C1904420zeq getValue() {
        return this.LLILZ;
    }

    public static EnumC1904380zem valueOf(String str) {
        return (EnumC1904380zem) C08FF.LIZ(EnumC1904380zem.class, str);
    }

    public final void setInterval(C1904410zep c1904410zep) {
        this.LLILLL = c1904410zep;
    }

    public final synchronized void setValue(Object obj) {
        this.LLILZ.LIZ = obj;
    }

    public final void setValue(C1904420zeq c1904420zeq) {
        this.LLILZ = c1904420zeq;
    }

    public EnumC1904380zem(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
