package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514401zS implements Runnable {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        String str2 = this.s1;
        String str3 = this.s2;
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("entrance_id", String.valueOf(str3));
        C20684815ws.LJIJ("enter_sidebar_cancel", jSONObject);
    }

    public final void LIZ$1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        String str2 = this.s1;
        String str3 = this.s2;
        jSONObject.put("cert_name", str);
        jSONObject.put("type", str2);
        jSONObject.put("err_msg", str3);
        C185100nR.LIZIZ(C185100nR.LIZ, "cert_error", jSONObject, null, 12);
    }

    public final void LIZ$2() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("previous_page", this.s0);
        c2344009Gk.LJIIIIZZ("group_id", this.s1);
        c2344009Gk.LJIIIIZZ("author_id", this.s2);
        C20684815ws.LJIILLIIL("just_watched_tag_click", c2344009Gk.LIZ);
    }

    public final void LIZ$3() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("previous_page", this.s0);
        c2344009Gk.LJIIIIZZ("group_id", this.s1);
        c2344009Gk.LJIIIIZZ("author_id", this.s2);
        C20684815ws.LJIILLIIL("just_watched_tag_show", c2344009Gk.LIZ);
    }

    public static final void run$0(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("SidebarTrackHelper@aa6a.enterSidebar$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514401zS.s0;
            String str2 = runnableC514401zS.s1;
            String str3 = runnableC514401zS.s2;
            jSONObject.put("enter_from", str);
            jSONObject.put("enter_method", str2);
            jSONObject.put("entrance_id", str3);
            C20684815ws.LJIJ("enter_sidebar", jSONObject);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SidebarTrackHelper@aa6a.enterSidebar$1");
    }

    public static final void run$1(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("SidebarTrackHelper@aa6a.enterSidebarCancel$1");
        try {
            runnableC514401zS.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SidebarTrackHelper@aa6a.enterSidebarCancel$1");
    }

    public static final void run$2(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("SidebarTrackHelper@aa6a.sidebarSlide$1");
        try {
            JSONObject jSONObject = new JSONObject();
            String str = runnableC514401zS.s0;
            String str2 = runnableC514401zS.s1;
            String str3 = runnableC514401zS.s2;
            jSONObject.put("enter_from", str);
            jSONObject.put("enter_method", str2);
            jSONObject.put("entrance_id", str3);
            C20684815ws.LJIJ("sidebar_slide", jSONObject);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SidebarTrackHelper@aa6a.sidebarSlide$1");
    }

    public static final void run$3(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportCertError$1");
        try {
            runnableC514401zS.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportCertError$1");
    }

    public static final void run$4(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("JustWatchTracker@f11e.reportJWBtnClick$1");
        try {
            runnableC514401zS.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JustWatchTracker@f11e.reportJWBtnClick$1");
    }

    public static final void run$5(RunnableC514401zS runnableC514401zS) {
        boolean zLIZ;
        C1C7U.LIZ("JustWatchTracker@f11e.reportJWBtnShow$1");
        try {
            runnableC514401zS.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JustWatchTracker@f11e.reportJWBtnShow$1");
    }

    public RunnableC514401zS(String str, String str2, String str3, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
