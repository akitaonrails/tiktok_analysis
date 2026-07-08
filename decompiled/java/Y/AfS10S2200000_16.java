package Y;

import X.C08JS;
import X.C09JN;
import X.C1035880d3y;
import X.C1067990dtl;
import X.C1068190du5;
import X.C1068210du7;
import X.C1C7U;
import X.C259800zU;
import X.EnumC1059300dfk;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autofill.AdAutofillV2Model;
import com.ss.android.ugc.aweme.autofill.AutofillDetailInfo;
import com.ss.android.ugc.aweme.autofill.api.AdAutofillGetResponse;
import java.util.List;
import kotlin.jvm.internal.AwS100S1200000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AfS10S2200000_16 implements C09JN {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS10S2200000_16 afS10S2200000_16, Object obj) {
        C1C7U.LIZ("FansClubViewModel@394b.openFansClubJoinStickerDialog$1");
        ((FansClubViewModel) afS10S2200000_16.l2).DQ2((Fragment) afS10S2200000_16.l3, afS10S2200000_16.s0, afS10S2200000_16.s1, false);
        C1C7U.LIZIZ("FansClubViewModel@394b.openFansClubJoinStickerDialog$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS10S2200000_16 afS10S2200000_16, Object obj) throws JSONException {
        String string;
        T string2;
        JSONArray jSONArrayNames;
        C1C7U.LIZ("AdAutofillManagerV2@4585.getAutofill$fetchService$1");
        AdAutofillGetResponse adAutofillGetResponse = (AdAutofillGetResponse) obj;
        C259800zU c259800zU = new C259800zU();
        Integer num = adAutofillGetResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            C1067990dtl.LIZ.getClass();
            C1067990dtl.LJII.put(afS10S2200000_16.s0, Boolean.TRUE);
            try {
                List<AutofillDetailInfo> fields = ((AdAutofillV2Model) C08JS.LIZ(C08JS.LIZLLL(adAutofillGetResponse), AdAutofillV2Model.class)).getFields();
                if (fields != null && !fields.isEmpty()) {
                    for (AutofillDetailInfo autofillDetailInfo : fields) {
                        JSONArray jSONArray = new JSONArray(autofillDetailInfo.getContactInfos());
                        if (autofillDetailInfo.getSource() == 3 && jSONArray.length() > 0) {
                            Object obj2 = jSONArray.get(0);
                            if (obj2 != null) {
                                string = obj2.toString();
                            } else {
                                string = null;
                            }
                            String str = "loadFinish";
                            C1067990dtl.LJJIJIIJIL(string, "loadFinish", false);
                            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, 0);
                            if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null) {
                                string2 = jSONArrayNames.toString();
                            } else {
                                string2 = 0;
                            }
                            c259800zU.element = string2;
                            C1067990dtl.LJJIJIL("loadFinish", autofillDetailInfo.isContactInfoEnabled(), false);
                            boolean zIsPaymentInfoEnabled = autofillDetailInfo.isPaymentInfoEnabled();
                            if (!Intrinsics.LJFF(afS10S2200000_16.s1, "1")) {
                                str = "other";
                            }
                            C1067990dtl.LJJIJLIJ((C1035880d3y) afS10S2200000_16.l2, str, zIsPaymentInfoEnabled);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            adAutofillGetResponse.toString();
        }
        if (((EnumC1059300dfk) afS10S2200000_16.l3) == EnumC1059300dfk.AD) {
            C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
            C1068210du7.LIZ.getClass();
            c1068190du5.log(C1068210du7.LIZIZ, new AwS100S1200000_16(adAutofillGetResponse, (AdAutofillGetResponse) afS10S2200000_16.s1, (String) c259800zU, (C259800zU<String>) 13));
        }
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.getAutofill$fetchService$1");
    }

    public AfS10S2200000_16(Object obj, Object obj2, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.s1 = str2;
    }
}
