package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HLG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLG {
    public static final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("source", "social_avatar");
    }

    public static final void LIZLLL(C0HL8 c0hl8) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0hl8.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c0hl8.LIZ);
        C20684815ws.LJIILLIIL("social_avatar_intro_page_enter", c2344009Gk.LIZ);
    }

    public static final void LIZJ(C0HL8 c0hl8, C0HLH c0hlh) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0hl8.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c0hl8.LIZ);
        c2344009Gk.LJIIIIZZ("action_type", c0hlh.getReportValue());
        c2344009Gk.LIZJ(!Intrinsics.LJFF(c0hl8.LIZJ, Boolean.TRUE) ? 1 : 0, "change_input_photo");
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("enter_aimoji_creation", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(C0HL8 c0hl8, C0HLB c0hlb, int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0hl8.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c0hl8.LIZ);
        c2344009Gk.LJIIIIZZ("action_type", c0hlb.getReportValue());
        c2344009Gk.LIZJ(i, "has_flash_light");
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("social_avatar_confirmation_page", c2344009Gk.LIZ);
    }

    public static final void LJ(C0HLE c0hle, C0HLS c0hls, EnumC439310HKn enumC439310HKn) {
        String str;
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", c0hle.getReportValue());
        if (c0hls != null && (i = C0HLT.LIZIZ[c0hls.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new C1954807lC();
                            }
                            str = "general_issue";
                        } else {
                            str = "network_issue";
                        }
                    } else {
                        str = "technical_issue";
                    }
                } else {
                    str = "photo_issue_algo";
                }
            } else {
                str = "photo_issue_tns";
            }
        } else {
            str = "general_issue";
        }
        c2344009Gk.LJIIIIZZ("event", str);
        c2344009Gk.LJIIIIZZ("start_method", enumC439310HKn.getParam());
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("social_avatar_failure_page", c2344009Gk.LIZ);
    }

    public static final void LJFF(C0HL8 c0hl8, EnumC439680HLy enumC439680HLy, C0HLV c0hlv, boolean z) {
        String str;
        if (c0hlv == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c0hl8.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", c0hl8.LIZ);
        c2344009Gk.LJIIIIZZ("action_type", enumC439680HLy.getReportValue());
        int i = C0HLT.LIZ[c0hlv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "uploading";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "generating";
            }
        } else {
            str = "queue";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LIZJ(z ? 1 : 0, "notification_status");
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("social_avatar_generation_page", c2344009Gk.LIZ);
    }
}
