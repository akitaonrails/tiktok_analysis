package Y;

import X.C0LAB;
import X.C1C7U;
import X.C20684815ws;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS7S2000000_24 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("notice_type", this.s0);
        c0lab.LJ("notice_name", "bottom_tab_reddot");
        c0lab.LJ("notification_business", this.s1);
        c0lab.LJ("notice_location", "bottom");
        C20684815ws.LJIILLIIL("ttinfra_notice_click", c0lab.LIZ);
    }

    public final void LIZ$1() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("notice_type", this.s0);
        c0lab.LJ("notice_name", "bottom_tab_reddot");
        c0lab.LJ("notification_business", this.s1);
        c0lab.LJ("notice_location", "bottom");
        C20684815ws.LJIILLIIL("ttinfra_notice_show", c0lab.LIZ);
    }

    public final void LIZ$2() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        String str2 = this.s1;
        jSONObject.put("enter_from", str);
        jSONObject.put("outreach_key", "popup_cleandrafts");
        jSONObject.put("outreach_intention", "guide_cleandrafts");
        jSONObject.put("outreach_type", "popup");
        jSONObject.put("outreach_to_app_id", str2);
        AppLogNewUtils.onEventV3("guide_user_m2_show", jSONObject);
    }

    public static final void run$0(ARunnableS7S2000000_24 aRunnableS7S2000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileStatistics@f161.reportTTInfraNoticeClick$1");
        try {
            aRunnableS7S2000000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileStatistics@f161.reportTTInfraNoticeClick$1");
    }

    public static final void run$1(ARunnableS7S2000000_24 aRunnableS7S2000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileStatistics@f161.reportTTInfraNoticeShow$1");
        try {
            aRunnableS7S2000000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileStatistics@f161.reportTTInfraNoticeShow$1");
    }

    public static final void run$2(ARunnableS7S2000000_24 aRunnableS7S2000000_24) {
        boolean zLIZ;
        C1C7U.LIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$2");
        try {
            aRunnableS7S2000000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2StorageCleanImpl@70f0.downloadM2WithStorageClean$2");
    }

    public ARunnableS7S2000000_24(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
