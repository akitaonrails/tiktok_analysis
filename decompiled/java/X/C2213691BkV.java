package X;

import com.tiktok.ttm.TTMParamData;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS278S0300000_34;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213691BkV extends AbstractC2213871Bkn {
    public final String LIZIZ;
    public final JSONObject LIZJ;

    public static JSONArray LIZIZ(Object[] objArr) {
        boolean z;
        TTMParamData tTMParamData;
        String stringValue;
        JSONArray jSONArray = new JSONArray();
        if (objArr != null) {
            C089E c089e = new C089E(objArr);
            while (c089e.hasNext()) {
                Object next = c089e.next();
                boolean z2 = next instanceof TTMParamData;
                TTMParamData tTMParamData2 = null;
                if (z2) {
                    tTMParamData2 = (TTMParamData) next;
                }
                if (tTMParamData2 != null && tTMParamData2.getType() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (tTMParamData2 != null) {
                        if (tTMParamData2.getType() != 11) {
                            if (tTMParamData2.getType() == 0 || tTMParamData2.getType() == 10) {
                                if (z2 && (tTMParamData = (TTMParamData) next) != null && (stringValue = tTMParamData.getStringValue("al_event_key")) != null) {
                                    jSONArray.put(stringValue);
                                }
                            }
                        }
                    }
                }
                int arraySize = tTMParamData2.getArraySize();
                for (int i = 0; i < arraySize; i++) {
                    String stringValue2 = tTMParamData2.getArrayItem(i).getStringValue("al_event_key");
                    if (stringValue2 != null) {
                        jSONArray.put(stringValue2);
                    }
                }
            }
        }
        return jSONArray;
    }

    public C2213691BkV(String str, JSONObject jSONObject) {
        super(EnumC2213801Bkg.CAI_ACTION_TYPE_SEND_APPLOG);
        this.LIZIZ = str;
        this.LIZJ = jSONObject;
    }

    @Override // X.AbstractC2213871Bkn
    public final void LIZ(C830870Wib c830870Wib, C2213641BkQ c2213641BkQ) {
        ExecutorService executorService;
        C830930Wih c830930Wih;
        if (c830870Wib != null && (c830930Wih = c830870Wib.LIZLLL) != null) {
            executorService = c830930Wih.LIZLLL;
        } else {
            executorService = null;
        }
        C830860Wia.LIZIZ(executorService, new AwS278S0300000_34(c2213641BkQ, this, c830870Wib, 0));
    }
}
