package Y;

import X.C1C7U;
import X.C793770VBv;
import com.bytedance.scene.Scene;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS16S1000000_26 implements Runnable {
    public final int $t;
    public String s0;

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

    public final void LIZ$0() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        jSONObject.put("entrance", "rap_main");
        jSONObject.put("enter_from", "rap_main_na");
        jSONObject.put("pathname", "rap_main_list_na");
        jSONObject.put(Scene.SCENE_SERVICE, "offline");
        jSONObject.put("err_msg", str);
        C793770VBv.LJII("csp_page_init_error_na", jSONObject, new JSONObject(), null);
    }

    public final void LIZ$1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        jSONObject.put("entrance", "rap_main");
        jSONObject.put("enter_from", "rap_main_na");
        jSONObject.put("pathname", "rap_main_na");
        jSONObject.put(Scene.SCENE_SERVICE, "offline");
        jSONObject.put("err_msg", str);
        C793770VBv.LJII("csp_page_rap_jump_btn_error_na", jSONObject, null, null);
    }

    public final void LIZ$2() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.s0;
        jSONObject.put("entrance", "rap_main");
        jSONObject.put("enter_from", "rap_main_na");
        jSONObject.put("pathname", "rap_main_na");
        jSONObject.put(Scene.SCENE_SERVICE, "offline");
        jSONObject.put("err_msg", str);
        C793770VBv.LJII("csp_page_init_error_na", jSONObject, null, null);
    }

    public static final void run$0(ARunnableS16S1000000_26 aRunnableS16S1000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackTopicPageError$1");
        try {
            aRunnableS16S1000000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackTopicPageError$1");
    }

    public static final void run$1(ARunnableS16S1000000_26 aRunnableS16S1000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackButtonError$1");
        try {
            aRunnableS16S1000000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackButtonError$1");
    }

    public static final void run$2(ARunnableS16S1000000_26 aRunnableS16S1000000_26) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackPageError$1");
        try {
            aRunnableS16S1000000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackPageError$1");
    }

    public ARunnableS16S1000000_26(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
