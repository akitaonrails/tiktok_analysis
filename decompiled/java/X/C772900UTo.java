package X;

import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS50S0000100_12;

/* JADX INFO: renamed from: X.0UTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772900UTo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final void LIZ(C474500IjA c474500IjA) {
        c474500IjA.LJJII(this.LIZ, "enter_from");
        c474500IjA.LJJII(this.LIZIZ, "anchor_id");
        c474500IjA.LJJII(this.LIZJ, "entrance_anchor_id");
        c474500IjA.LJJII(this.LIZLLL, "entrance_room_id");
    }

    public final void LIZIZ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_playbook_intro_click");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII("recommend", "playbook_from");
        c474500IjALIZ.LJJII(str, "playbook_id");
        c474500IjALIZ.LJJII(str2, "click_area");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_playbook_fail");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, "fail_reason");
        c474500IjALIZ.LIZ();
    }

    public C772900UTo(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    public final void LIZLLL(long j, long j2, long j3, long j4, long j5, String str, String str2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_playbook_intro_show");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str2, "playbook_from");
        c474500IjALIZ.LJJII(str, "playbook_id");
        c474500IjALIZ.LJJIIZ(Long.valueOf(j), "try_show_playbook_duration", new AwS50S0000100_12(j, 3));
        c474500IjALIZ.LJJIIZ(Long.valueOf(j2), "fetch_api_duration", new AwS50S0000100_12(j2, 4));
        c474500IjALIZ.LJJIIZ(Long.valueOf(j3), "show_playbook_dialog_duration", new AwS50S0000100_12(j3, 5));
        c474500IjALIZ.LJJIIZ(Long.valueOf(j4), "show_success_duration", new AwS50S0000100_12(j4, 6));
        c474500IjALIZ.LJJIIZ(Long.valueOf(j5), "api_duration", new AwS50S0000100_12(j5, 7));
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(z), "need_async_update", AFwS193S0000000_7.get$arr$(217));
        c474500IjALIZ.LIZ();
    }
}
