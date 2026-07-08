package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.1072, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1072 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
        c191969108h.LIZIZ(jCurrentTimeMillis, "duration");
        c1163504gr.onEventV3("stay_time", c191969108h.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZ(i, "muf_cnt");
        c191969108h.LIZLLL("enter_from", str3);
        c191969108h.LIZLLL("enter_method", "click");
        if (!TextUtils.isEmpty(str)) {
            c191969108h.LIZJ("group_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c191969108h.LIZJ("page_tag", str2);
        }
        c1163504gr.onEventV3("click_mutual_friends_list", c191969108h.LIZ);
    }
}
