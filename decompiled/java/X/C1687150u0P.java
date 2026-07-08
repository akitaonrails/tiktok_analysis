package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import kotlin.Pair;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687150u0P {
    public static final C1687150u0P LIZ = new C1687150u0P();

    public static Pair LJI(C1687160u0Q c1687160u0Q) {
        InterfaceC548750Lfd interfaceC548750LfdLIZ;
        C2275171E3n c2275171E3n = C2275171E3n.LJII;
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C0LAB c0lab = new C0LAB();
        String str = c2275171E3n.LIZ;
        AIGCEntranceInfo aIGCEntranceInfo = c1687160u0Q.LIZ;
        if (aIGCEntranceInfo != null) {
            interfaceC548750LfdLIZ = C548910Lft.LIZ(aIGCEntranceInfo);
        } else {
            interfaceC548750LfdLIZ = null;
        }
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0Q, 538);
        c548880Lfq.getClass();
        C548880Lfq.LIZ(c0lab, str, c2275171E3n, interfaceC548750LfdLIZ, awS604S0100000_25);
        return new Pair(c2275171E3n.LIZ, c0lab.LIZ);
    }

    public static void LIZJ(C0LAB c0lab, C1687170u0R c1687170u0R) {
        LJ(c0lab, "creation_id", c1687170u0R.LIZIZ);
        LJ(c0lab, "scene_name", c1687170u0R.LIZJ);
        c0lab.LJ("entrance", "aime");
        LJ(c0lab, "text_type", c1687170u0R.LIZLLL);
        LJ(c0lab, "event_page", c1687170u0R.LJ);
        LJ(c0lab, "cameo_creation_id", c1687170u0R.LJFF);
    }

    public static void LIZLLL(C0LAB c0lab, C1687160u0Q c1687160u0Q) {
        String value;
        String string;
        String value2;
        LIZIZ(c0lab, c1687160u0Q.LIZIZ, c1687160u0Q.LIZJ, c1687160u0Q.LIZLLL);
        EnumC570120MXq enumC570120MXq = c1687160u0Q.LJ;
        String value3 = null;
        if (enumC570120MXq != null) {
            value = enumC570120MXq.getValue();
        } else {
            value = null;
        }
        LJ(c0lab, "entrance_ai_portrait_template_pos", value);
        RefImageType refImageType = c1687160u0Q.LJI;
        if (refImageType != null) {
            string = Integer.valueOf(refImageType.getValue()).toString();
        } else {
            string = null;
        }
        LJ(c0lab, "is_ref_img", string);
        EnumC550430LiL enumC550430LiL = c1687160u0Q.LJII;
        if (enumC550430LiL != null) {
            value2 = enumC550430LiL.getValue();
        } else {
            value2 = null;
        }
        LJ(c0lab, "prompt_source", value2);
        Integer num = c1687160u0Q.LJIIIIZZ;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "prompt_length");
        }
        EnumC550780Liu enumC550780Liu = c1687160u0Q.LJIIIZ;
        if (enumC550780Liu != null) {
            value3 = enumC550780Liu.getValue();
        }
        LJ(c0lab, "enter_way", value3);
        LJ(c0lab, "is_regenerate", c1687160u0Q.LJIIJ);
        LJ(c0lab, "action_type", c1687160u0Q.LJIIJJI);
        LJ(c0lab, "event_page", c1687160u0Q.LJIIL);
        Integer num2 = c1687160u0Q.LJIILIIL;
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "stay_time");
        }
        LJ(c0lab, "server_task_id", c1687160u0Q.LJIILJJIL);
    }

    public static void LIZ(C0LAB c0lab, String str, EnumC550780Liu enumC550780Liu) {
        String value;
        c0lab.LJ("res_pos", str);
        if (enumC550780Liu != null) {
            value = enumC550780Liu.getValue();
        } else {
            value = null;
        }
        LJ(c0lab, "enter_way", value);
    }

    public static void LJ(C0LAB c0lab, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            c0lab.LJ(str, str2);
        }
    }

    public static void LIZIZ(C0LAB c0lab, String str, String str2, EnumC1419230n2H enumC1419230n2H) {
        String value;
        LJ(c0lab, "creation_id", str);
        LJ(c0lab, "entrance_ai_portrait_template_id", str2);
        if (enumC1419230n2H != null) {
            value = enumC1419230n2H.getValue();
        } else {
            value = null;
        }
        LJ(c0lab, "entrance_ai_portrait_template_type", value);
    }

    public static void LJFF(C0LAB c0lab, String str, int i, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, EnumC550780Liu enumC550780Liu) {
        String string;
        String value;
        c0lab.LJ("res_pos", str);
        c0lab.LIZ(i, "res_index");
        String value2 = null;
        if (refImageType != null) {
            string = Integer.valueOf(refImageType.getValue()).toString();
        } else {
            string = null;
        }
        LJ(c0lab, "is_ref_img", string);
        if (enumC550430LiL != null) {
            value = enumC550430LiL.getValue();
        } else {
            value = null;
        }
        LJ(c0lab, "prompt_source", value);
        if (enumC550780Liu != null) {
            value2 = enumC550780Liu.getValue();
        }
        LJ(c0lab, "enter_way", value2);
        if (num != null) {
            c0lab.LIZ(num.intValue(), "prompt_length");
        }
    }
}
