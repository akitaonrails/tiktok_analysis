package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.03jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C926303jh {
    public final LinkedHashMap<String, Object> LIZ;
    public long LIZIZ;
    public final List<String> LIZJ;

    public final void LIZIZ(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("stay_time", Long.valueOf(jElapsedRealtime));
        linkedHashMap.put("quit_type", str);
        C1018703yb.LIZIZ("tiktokec_stay_page", linkedHashMap);
    }

    public C926303jh(EnterParams enterParams, boolean z) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        this.LIZIZ = System.currentTimeMillis();
        this.LIZJ = new ArrayList();
        HashMap<String, Object> map = enterParams.trackParams;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "bank_selection_page");
        if (z) {
            linkedHashMap.put("previous_page", "order_submit");
        } else {
            linkedHashMap.put("previous_page", "payment_method");
        }
    }

    public final void LIZ(int i, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("option_name", str2);
        linkedHashMap.put("original_rank", Integer.valueOf(i));
        C1018703yb.LIZIZ("tiktokec_button_click", linkedHashMap);
    }
}
