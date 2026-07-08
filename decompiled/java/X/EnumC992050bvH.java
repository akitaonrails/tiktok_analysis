package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992050bvH {
    public static final EnumC992050bvH DEFAULT;
    public static final EnumC992050bvH HIT;
    public static final /* synthetic */ EnumC992050bvH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992050bvH PREFETCH_DONE;
    public static final EnumC992050bvH PREFETCH_DONE_AFTER_ENTER;
    public static final EnumC992050bvH PREFETCH_DONE_BUT_FAIL;
    public static final EnumC992050bvH READY_TO_START;
    public static final EnumC992050bvH START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992050bvH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992050bvH enumC992050bvH = new EnumC992050bvH(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC992050bvH;
        EnumC992050bvH enumC992050bvH2 = new EnumC992050bvH("READY_TO_START", 1, "ready_to_start");
        READY_TO_START = enumC992050bvH2;
        EnumC992050bvH enumC992050bvH3 = new EnumC992050bvH("START", 2, "start_prefetch");
        START = enumC992050bvH3;
        EnumC992050bvH enumC992050bvH4 = new EnumC992050bvH("PREFETCH_DONE", 3, "prefetch_done");
        PREFETCH_DONE = enumC992050bvH4;
        EnumC992050bvH enumC992050bvH5 = new EnumC992050bvH("PREFETCH_DONE_BUT_FAIL", 4, "prefetch_done_but_fail");
        PREFETCH_DONE_BUT_FAIL = enumC992050bvH5;
        EnumC992050bvH enumC992050bvH6 = new EnumC992050bvH("PREFETCH_DONE_AFTER_ENTER", 5, "prefetch_done_after_enter");
        PREFETCH_DONE_AFTER_ENTER = enumC992050bvH6;
        EnumC992050bvH enumC992050bvH7 = new EnumC992050bvH("HIT", 6, "hit");
        HIT = enumC992050bvH7;
        EnumC992050bvH[] enumC992050bvHArr = {enumC992050bvH, enumC992050bvH2, enumC992050bvH3, enumC992050bvH4, enumC992050bvH5, enumC992050bvH6, enumC992050bvH7};
        LLILLJJLI = enumC992050bvHArr;
        LLILLL = new C2254308sP(enumC992050bvHArr);
    }

    public static EnumC992050bvH[] values() {
        return (EnumC992050bvH[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC992050bvH valueOf(String str) {
        return (EnumC992050bvH) C08FF.LIZ(EnumC992050bvH.class, str);
    }

    public EnumC992050bvH(String str, int i, String str2) {
        this.LL = str2;
    }
}
