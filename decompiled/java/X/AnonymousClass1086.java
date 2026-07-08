package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.1086, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1086 {
    public static final AnonymousClass1086 LIZ = new AnonymousClass1086();

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "1_day";
            }
            if (num.intValue() == 3) {
                return "3_days";
            }
            if (num.intValue() == 7) {
                return "1_week";
            }
            return "";
        }
        return "";
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "everyone_except_friends";
            }
            if (num.intValue() == 2) {
                return "everyone";
            }
            return "";
        }
        return "";
    }

    public static void LIZJ(String str, String str2, Integer num, Integer num2, int i, Integer num3, Integer num4, int i2) {
        String str3;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", str);
        if (AnonymousClass1084.LIZIZ()) {
            str3 = "paused";
        } else {
            str3 = "not_paused";
        }
        pairArr[1] = new Pair("current_status", str3);
        pairArr[2] = new Pair("action", str2);
        pairArr[3] = new Pair("current_interaction_selection", LIZIZ(num));
        pairArr[4] = new Pair("current_duration_selection", LIZ(num2));
        pairArr[5] = new Pair("current_remaining_days", String.valueOf(i));
        pairArr[6] = new Pair("previous_interaction_selection", LIZIZ(num3));
        pairArr[7] = new Pair("previous_duration_selection", LIZ(num4));
        pairArr[8] = new Pair("previous_remaining_days", String.valueOf(i2));
        C20684815ws.LJIILLIIL("pause_interaction_page_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
