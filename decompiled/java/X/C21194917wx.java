package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21194917wx {
    public static long LJIIIZ;
    public static final /* synthetic */ int LJIIJ = 0;
    public WeakReference<AbstractC21194117wp> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LIZLLL = true;
    public String LJIIIIZZ = "other";

    public final void LIZ() {
        AbstractC21194117wp abstractC21194117wp;
        WeakReference<AbstractC21194117wp> weakReference = this.LIZ;
        if (weakReference != null && (abstractC21194117wp = weakReference.get()) != null && this.LIZIZ != 0) {
            abstractC21194117wp.LLJILJILJ.LJIIIIZZ("quit_type", this.LJIIIIZZ, false);
            abstractC21194117wp.LLJILJILJ.LJII(System.currentTimeMillis() - this.LIZIZ, "stay_time");
            abstractC21194117wp.LJJIJL().LJIIIZ();
        }
        this.LIZIZ = 0L;
    }

    public final void LIZIZ() {
        AbstractC21194117wp abstractC21194117wp;
        this.LIZIZ = System.currentTimeMillis();
        WeakReference<AbstractC21194117wp> weakReference = this.LIZ;
        if (weakReference != null && (abstractC21194117wp = weakReference.get()) != null && !this.LJFF) {
            abstractC21194117wp.LJJIJL().LJII();
        }
        this.LJFF = true;
    }

    public final void LIZJ(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, long j2, boolean z, boolean z2, String str9) {
        long jCurrentTimeMillis;
        long j3;
        String str10;
        int i;
        if (this.LJI) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j3 = this.LJII;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            j3 = LJIIIZ;
        }
        long j4 = jCurrentTimeMillis - j3;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("image_url", str3);
            jSONObject.put("message_id", str4);
            if (this.LJI) {
                str5 = "prefetch";
            }
            jSONObject.put("from", str5);
            jSONObject.put("show_cost", j);
            jSONObject.put("page_name", str6);
            jSONObject.put("duration", j2);
            jSONObject.put("author_id", str7);
            jSONObject.put("load_duration", j);
            if (z2) {
                str10 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str10 = "1";
            }
            jSONObject.put("is_from_created", str10);
            jSONObject.put("is_success", str8);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("cache_hit", i);
            jSONObject.put("img_opt_model", 1);
            jSONObject.put("total_cost", j4);
            jSONObject.put("is_repin", this.LJI ? 1 : 0);
            jSONObject.put("live_role", str9);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_pin_image_show", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
