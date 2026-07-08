package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0x9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808380x9w implements InterfaceC1051760dTa {
    public final Context LL;
    public final IESJsBridge LLILLJJLI;
    public C1058910df7 LLILLL;
    public JSONObject LLILZ;
    public final C1808370x9v LLILZIL = new InterfaceC1808410x9z() { // from class: X.0x9v
        @Override // X.InterfaceC1808410x9z
        public final void LIZ(List list, boolean z) {
            int i;
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tempFilePath", pair.getFirst());
                    jSONObject.put("base64Data", pair.getSecond());
                    jSONArray.put(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            JSONObject jSONObject2 = null;
            try {
                JSONObject jSONObject3 = this.LIZ.LLILZ;
                if (jSONObject3 == null) {
                    jSONObject3 = null;
                }
                jSONObject3.put("tempFiles", jSONArray);
                JSONObject jSONObject4 = this.LIZ.LLILZ;
                if (jSONObject4 == null) {
                    jSONObject4 = null;
                }
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject4.put("code", i);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1808380x9w c1808380x9w = this.LIZ;
            IESJsBridge iESJsBridge = c1808380x9w.LLILLJJLI;
            C1058910df7 c1058910df7 = c1808380x9w.LLILLL;
            if (c1058910df7 == null) {
                c1058910df7 = null;
            }
            String str = c1058910df7.LIZIZ;
            JSONObject jSONObject5 = c1808380x9w.LLILZ;
            if (jSONObject5 != null) {
                jSONObject2 = jSONObject5;
            }
            iESJsBridge.LIZ(str, jSONObject2);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0x9v] */
    public C1808380x9w(Context context, IESJsBridge iESJsBridge) {
        this.LL = context;
        this.LLILLJJLI = iESJsBridge;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        C1058910df7 c1058910df72;
        this.LLILLL = c1058910df7;
        this.LLILZ = jSONObject;
        if (c1058910df7 != null) {
            c1058910df72 = c1058910df7;
        } else {
            c1058910df72 = null;
        }
        c1058910df72.LJIIJJI = false;
        int iOptInt = c1058910df7.LIZLLL.optInt("type");
        int iOptInt2 = c1058910df7.LIZLLL.optInt("photoSide");
        String string = c1058910df7.LIZLLL.opt("trackerDictionary").toString();
        Context context = this.LL;
        InterfaceC1808390x9x kYCService = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getKYCService();
        C1808370x9v c1808370x9v = this.LLILZIL;
        kYCService.getClass();
        C1808400x9y.LIZIZ.LIZJ(c1808370x9v);
        Intent intent = new Intent(context, (Class<?>) KYCCameraActivity.class);
        intent.putExtra("key_kyc_photo_type", iOptInt);
        intent.putExtra("key_kyc_photo_side", iOptInt2);
        intent.putExtra("key_kyc_track_events", string);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+ba6EWBIGk/nJ4EjpS7bZEE6yE/Ct/A68=", null));
    }
}
