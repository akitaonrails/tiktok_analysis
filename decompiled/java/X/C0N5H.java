package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5H {
    public static final /* synthetic */ C0N5H[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0N5H STORY_STATUS_CHANGE_MONITOR;
    public final int LL = LSPassThroughRecordSizeConfig.DEFAULT;
    public final String LLILLJJLI = "story_status_change_monitor";

    public static InterfaceC2044707zh<C0N5H> getEntries() {
        return LLILZ;
    }

    static {
        C0N5H c0n5h = new C0N5H();
        STORY_STATUS_CHANGE_MONITOR = c0n5h;
        C0N5H[] c0n5hArr = {c0n5h};
        LLILLL = c0n5hArr;
        LLILZ = new C2254308sP(c0n5hArr);
    }

    public static C0N5H[] values() {
        return (C0N5H[]) LLILLL.clone();
    }

    public final int getBizId() {
        return this.LL;
    }

    public final String getBizName() {
        return this.LLILLJJLI;
    }

    public static C0N5H valueOf(String str) {
        return (C0N5H) C08FF.LIZ(C0N5H.class, str);
    }
}
