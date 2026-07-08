package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439470HLd {
    public static final C439470HLd LIZ = new C439470HLd();

    public static String LIZ(int i) {
        switch (i) {
            case 0:
                return "angry";
            case 1:
                return "disgust";
            case 2:
                return "fear";
            case 3:
                return "happy";
            case 4:
                return "sad";
            case 5:
                return "surprise";
            case 6:
                return "neutral";
            default:
                return "";
        }
    }

    public static void LIZJ(EnumC439790HMj enumC439790HMj, EnumC439500HLg enumC439500HLg) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", enumC439790HMj.getString());
        c2344009Gk.LJIIIIZZ("action_type", enumC439500HLg.getString());
        C20684815ws.LJIILLIIL("ttsocial_sa_effect_popup", c2344009Gk.LIZ);
    }

    public static void LIZLLL(int i, float[] fArr, boolean z, String str) {
        String strLIZ = LIZ(i);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "is_neutral_expression");
        c2344009Gk.LJIIIIZZ("face_exp_type", strLIZ);
        c2344009Gk.LJIIIIZZ("start_method", str);
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            float f = fArr[i2];
            LIZ.getClass();
            c2344009Gk.LIZIZ(f, LIZ(i3));
            i2++;
            i3++;
        }
        C20684815ws.LJIILLIIL("social_avatar_neutral_expression", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, EnumC439310HKn enumC439310HKn, Boolean bool, Long l, Long l2) {
        long jLongValue;
        long jLongValue2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("start_method", enumC439310HKn.getParam());
        c2344009Gk.LJIIIIZZ("source", "social_avatar");
        c2344009Gk.LIZJ(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "change_input_photo");
        c2344009Gk.LJ(l, "queue_time");
        c2344009Gk.LJ(l2, "generation_time");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue + jLongValue2);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "user_view_queue_time");
        C20684815ws.LJIILLIIL("begin_aimoji_creation", c2344009Gk.LIZ);
    }
}
