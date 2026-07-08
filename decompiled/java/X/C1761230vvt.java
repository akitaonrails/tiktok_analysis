package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS0S4302000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761230vvt {
    public final boolean LIZ;
    public final String LIZIZ;
    public final InterfaceC1053404Aa LIZJ;
    public long LJ;
    public long LIZLLL = SystemClock.elapsedRealtime();
    public String LJFF = "return";
    public long LJI = SystemClock.elapsedRealtime();
    public final Map<String, Long> LJII = new LinkedHashMap();
    public final Map<String, Long> LJIIIIZZ = new LinkedHashMap();
    public final Set<String> LJIIIZ = new LinkedHashSet();
    public final Set<String> LJIIJ = new LinkedHashSet();

    public static void LIZJ(LaneParams laneParams, String str) {
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            try {
                c098200Yq = new JSONObject(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                laneParams.merge((JSONObject) c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public static void LIZLLL(LaneParams laneParams, C1761290vvz c1761290vvz) {
        String str;
        int i;
        String str2;
        long jLongValue;
        String strLIZ;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        String str3;
        Long lLJIILIIL;
        String str4;
        String str5;
        String str6 = "";
        if (c1761290vvz == null || (str = c1761290vvz.LJII) == null) {
            str = "";
        }
        laneParams.plusAssign("sku_id", str);
        if (c1761290vvz != null && (str5 = c1761290vvz.LIZ) != null) {
            str6 = str5;
        }
        laneParams.plusAssign("review_id", str6);
        int i2 = 1;
        if (c1761290vvz != null && c1761290vvz.LJIIIIZZ) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i));
        if (c1761290vvz != null && (str4 = c1761290vvz.LJI) != null && str4.length() != 0) {
            str2 = "has_text";
        } else {
            str2 = "no_text";
        }
        laneParams.plusAssign("page_show_type", str2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        if (c1761290vvz != null && (str3 = c1761290vvz.LJIIIZ) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        calendar.setTimeInMillis(jLongValue);
        laneParams.plusAssign("post_date", simpleDateFormat.format(calendar.getTime()));
        if (c1761290vvz == null || !c1761290vvz.LJIIJ) {
            i2 = 0;
        }
        laneParams.plusAssign("is_anonymous", Integer.valueOf(i2));
        if (c1761290vvz == null || (reviewAspectItem = c1761290vvz.LJIIZILJ) == null || (reviewAspectOption = reviewAspectItem.answer) == null || (strLIZ = reviewAspectOption.LIZ()) == null) {
            strLIZ = "null";
        }
        laneParams.put("fit_info", strLIZ);
    }

    public C1761230vvt(boolean z, String str, InterfaceC1053404Aa interfaceC1053404Aa) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1053404Aa;
    }

    public final void LIZ(InterfaceC1748810vbr interfaceC1748810vbr, int i, C1761300vw0 c1761300vw0, int i2, Integer num, String str, String str2) {
        String str3;
        Integer num2;
        String str4 = this.LJFF;
        ReviewMedia reviewMedia = c1761300vw0.LIZ;
        if (reviewMedia != null && (num2 = reviewMedia.mediaType) != null && num2.intValue() == 2) {
            str3 = "review_video";
        } else {
            str3 = "review_photo";
        }
        C1748720vbi.LIZIZ(interfaceC1748810vbr, new C10508049a(), new AwS0S4302000_26(this, str2, str3, num, str, str4, i, c1761300vw0, i2, 1));
        this.LJFF = "return";
    }

    public final void LIZIZ(InterfaceC1748820vbs interfaceC1748820vbs, C1761290vvz c1761290vvz, String str, boolean z, String str2, String str3, String str4, Integer num, String str5) {
        C1748720vbi.LIZIZ(interfaceC1748820vbs, new C04CK() { // from class: X.049b
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("review_id", new C1747940vaS[0]), new C1748840vbu("rate", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("sku_id", new C1747940vaS[0]), new C1748840vbu("like_cnt", new C1747940vaS[0]), new C1748840vbu("post_date", new C1747940vaS[0]), new C1748840vbu("is_self", new C1747940vaS[0]), new C1748840vbu("enter_method", new C1747940vaS[0]), new C1748840vbu("whole_duration", new C1747940vaS[0]), new C1748840vbu("duration", new C1747940vaS[0]), new C1748840vbu("video_id", new C1747940vaS[0]), new C1748840vbu("is_local", new C1747940vaS[0]), new C1748840vbu("previous_module", new C1747940vaS[0]));
            }
        }, new C1761250vvv(this, str5, interfaceC1748820vbs, c1761290vvz, str4, num, str, str3, str2, z));
    }
}
