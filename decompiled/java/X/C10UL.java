package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10UL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UL {
    public static final /* synthetic */ int LIZ = 0;

    public static C10UO LIZ(String str, C10QU c10qu) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (C10QW.LIZ[c10qu.getType().ordinal()] != 1) {
            return null;
        }
        C13IV c13iv = C19253410Ua.LIZ;
        c13iv.getClass();
        Object objLIZIZ = c13iv.LIZIZ(C10VJ.Companion.serializer(), str);
        if (!(objLIZIZ instanceof C10UO)) {
            return null;
        }
        return (C10UO) objLIZIZ;
    }

    public static C10UO LIZIZ(String str, C10QU c10qu) {
        String str2;
        try {
            if (Intrinsics.LJFF(String.valueOf(str), "nuj_swipe_up.json")) {
                str2 = "{\n  \"config\": [\n    {\n      \"id\": \"should_run\",\n      \"filters\": [\n        {\n          \"name\": \"private_account\",\n          \"value\": \"1\",\n          \"operator\": \"==\",\n          \"result\": \"not_run\"\n        },\n        {\n          \"name\": \"store_region\",\n          \"operator\": \"in\",\n          \"value\": \"US,AT,BE,BG,CH,CY,CZ,DE,DK,EE,EL,ES,FI,FR,GB,GR,HR,HU,IE,IS,IT,LI,LT,LU,LV,MT,NL,NO,PL,PT,RO,SE,SI,SK\",\n          \"result\": \"run\"\n        },\n        {\n          \"name\": \"logic\",\n          \"result\": \"not_run\",\n          \"desc\": \"feed_ready && old_user, must not show\",\n          \"sub_filters\": [\n            [\n              {\n                \"name\": \"feed_ready\",\n                \"operator\": \"not_in\",\n                \"value\": \"0\"\n              },\n              {\n                \"name\": \"old_user\",\n                \"operator\": \"==\",\n                \"value\": \"1\"\n              }\n            ]\n          ]\n        }\n      ],\n      \"fallback_result\": \"run\"\n    },\n    {\n      \"id\": \"btn_show_delay_time\",\n      \"fallback_result\": \"0\"\n    },\n    {\n      \"id\": \"btn_show_by_click_screen\",\n      \"fallback_result\": \"false\"\n    },\n    {\n      \"id\": \"page_style\",\n      \"filters\": [\n        {\n          \"name\": \"nuj_revamp_row\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"revamp\"\n        },\n        {\n          \"name\": \"nuj_revamp_kr\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"revamp\"\n        },\n        {\n          \"name\": \"nuj_revamp_us_eu_ab\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"revamp\"\n        }\n      ],\n      \"fallback_result\": \"online\"\n    },\n    {\n      \"id\": \"need_finding_content_guide\",\n      \"filters\": [\n        {\n          \"name\": \"logic\",\n          \"result\": \"true\",\n          \"sub_filters\": [\n            [\n              {\n                \"name\": \"nuj_revamp_row\",\n                \"operator\": \"==\",\n                \"value\": \"1\"\n              },\n              {\n                \"name\": \"nuj_revamp_kr\",\n                \"operator\": \"==\",\n                \"value\": \"1\"\n              },\n              {\n                \"name\": \"feed_ready\",\n                \"operator\": \"in\",\n                \"value\": \"0\"\n              }\n            ]\n          ]\n        }\n      ],\n      \"fallback_result\": \"false\"\n    },\n    {\n      \"id\": \"need_finding_content_guide_us_eu\",\n      \"filters\": [\n        {\n          \"name\": \"logic\",\n          \"result\": \"true\",\n          \"sub_filters\": [\n            [\n              {\n                \"name\": \"nuj_revamp_us_eu_ab\",\n                \"operator\": \"==\",\n                \"value\": \"1\"\n              },\n              {\n                \"name\": \"feed_ready\",\n                \"operator\": \"in\",\n                \"value\": \"0\"\n              }\n            ]\n          ]\n        }\n      ],\n      \"fallback_result\": \"false\"\n    },\n    {\n      \"id\": \"finding_page_auto_leave_time\",\n      \"fallback_result\": \"2000\"\n    },\n    {\n      \"id\": \"need_swipe_up_guide\",\n      \"fallback_result\": \"true\"\n    },\n    {\n      \"id\": \"swipe_page_auto_leave_time\",\n      \"filters\": [\n        {\n          \"name\": \"nuj_revamp_row\",\n          \"result\": \"6000\",\n          \"operator\": \"==\",\n          \"value\": \"1\"\n        },\n        {\n          \"name\": \"nuj_revamp_kr\",\n          \"result\": \"6000\",\n          \"operator\": \"==\",\n          \"value\": \"1\"\n        },\n        {\n          \"name\": \"nuj_revamp_us_eu_ab\",\n          \"result\": \"6000\",\n          \"operator\": \"==\",\n          \"value\": \"1\"\n        }\n      ],\n      \"fallback_result\": \"3000\"\n    },\n    {\n      \"id\": \"need_hop_hop\",\n      \"filters\": [\n        {\n          \"name\": \"nuj_revamp_row\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"true\"\n        },\n        {\n          \"name\": \"nuj_revamp_kr\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"true\"\n        },\n        {\n          \"name\": \"nuj_revamp_us_eu_ab\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"true\"\n        }\n      ],\n      \"fallback_result\": \"false\"\n    },\n    {\n      \"id\": \"fade_out_anim_time\",\n      \"filters\": [\n        {\n          \"name\": \"nuj_revamp_row\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"500\"\n        },\n        {\n          \"name\": \"nuj_revamp_kr\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"500\"\n        },\n        {\n          \"name\": \"nuj_revamp_us_eu_ab\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"500\"\n        }\n      ],\n      \"fallback_result\": \"350\"\n    },\n    {\n      \"id\": \"fade_out_anim_function\",\n      \"filters\": [\n        {\n          \"name\": \"nuj_revamp_row\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"easeInOutExpo\"\n        },\n        {\n          \"name\": \"nuj_revamp_kr\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"easeInOutExpo\"\n        },\n        {\n          \"name\": \"nuj_revamp_us_eu_ab\",\n          \"operator\": \"==\",\n          \"value\": \"1\",\n          \"result\": \"easeInOutExpo\"\n        }\n      ],\n      \"fallback_result\": \"easeInOut\"\n    }\n  ]\n}";
            } else {
                str2 = "";
            }
            return LIZ(str2, c10qu);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
