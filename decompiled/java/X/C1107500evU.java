package X;

import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0evU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107500evU {
    public static final C1107500evU LIZ = new C1107500evU();
    public static final Map<Integer, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(4, "leads_gen"), new Pair(3, "dm"), new Pair(6, "course"), new Pair(7, "service_plus_bio_card"), new Pair(8, "calendly"), new Pair(9, "third_party_link"));

    public static String LIZ(SubPinCard subPinCard) {
        Object c098200Yq;
        Object obj = "";
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(subPinCard.actionSchema), "platform_key");
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static void LIZLLL(long j, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlive_sub_perf_im_msg_duration_viewer");
        c474500IjALIZ.LJJII("PinCardIMMessageDurationViewer", "name");
        c474500IjALIZ.LJJII(1014, "link_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "fmp_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "show_result");
        c474500IjALIZ.LJJIIZ(1001, "error_msg", new C1107510evV(z));
        c474500IjALIZ.LJJIIZ("unmounted without receiving message", "error_detail", new C1107520evW(z));
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(int i, String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ads_pin_card");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        String str2 = LIZIZ.get(Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "card_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C1107500evU c1107500evU, boolean z, String str, String str2, Map map) {
        String str3;
        c1107500evU.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_course_pin_card_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(str, "action_type");
        if (z) {
            str3 = "anchor";
        } else {
            str3 = "audience";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, "is_native");
        c474500IjALIZ.LJJIJL();
    }
}
