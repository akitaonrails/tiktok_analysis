package X;

import android.content.Context;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1803630x2H implements InterfaceC1051760dTa, InterfaceC1803460x20 {
    public final Context LL;
    public final IESJsBridge LLILLJJLI;
    public C1058910df7 LLILLL;
    public JSONObject LLILZ;
    public final HashMap<String, String> LLILZIL = new HashMap<>();

    @Override // X.InterfaceC1803460x20
    public final void A7(int i, C1806600x74 c1806600x74, InterfaceC1807440x8Q interfaceC1807440x8Q) {
    }

    @Override // X.InterfaceC1803460x20
    public final void Ep(List<NoticesResult.Notice> list) {
    }

    @Override // X.InterfaceC1803460x20
    public final void L0() {
    }

    public void L6(C1804840x4E c1804840x4E, C1807890x99 c1807890x99) {
    }

    @Override // X.InterfaceC1803460x20
    public final void LJ() {
    }

    @Override // X.InterfaceC1803460x20
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1803460x20
    public void TI(Diamond diamond, C1796560wqs c1796560wqs, boolean z) {
    }

    @Override // X.InterfaceC1803460x20
    public final void Vc() {
    }

    @Override // X.InterfaceC1803460x20
    public final void c6(String str) {
    }

    @Override // X.InterfaceC1803460x20
    public final void cE(int i, long j) {
    }

    public void ey(int i, int i2, int i3, String str, String str2, Exception exc, InterfaceC1804390x3V interfaceC1804390x3V, IapListResult.ListResultExtra listResultExtra) {
    }

    @Override // X.InterfaceC1803460x20
    public void ww(C1777440wM2 c1777440wM2) {
    }

    @Override // X.InterfaceC1803460x20
    public final void yA(NoticesResult.Notice notice) {
    }

    @Override // X.InterfaceC1803460x20
    public void zz(int i, int i2, int i3, String str, String str2, C1797250wrz c1797250wrz, boolean z) {
    }

    public final C1058910df7 LIZ() {
        C1058910df7 c1058910df7 = this.LLILLL;
        if (c1058910df7 != null) {
            return c1058910df7;
        }
        return null;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = this.LLILZ;
        if (jSONObject != null) {
            return jSONObject;
        }
        return null;
    }

    public C1803630x2H(Context context, IESJsBridge iESJsBridge) {
        this.LL = context;
        this.LLILLJJLI = iESJsBridge;
    }

    @Override // X.InterfaceC1051760dTa
    public void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        this.LLILLL = c1058910df7;
        this.LLILZ = jSONObject;
        JSONObject jSONObject2 = LIZ().LIZLLL;
        if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("args")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("event_params")) != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LLILZIL.put(next, jSONObjectOptJSONObject2.get(next).toString());
            }
        }
    }
}
