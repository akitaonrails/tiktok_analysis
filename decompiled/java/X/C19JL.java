package X;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.utils.WeakHandler;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19JL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JL implements InterfaceC1050080dQs {
    public InterfaceC1049730dQJ LIZ;
    public final C19JV LIZIZ;
    public final C19JH LIZJ;
    public final WeakHandler LIZLLL = new WeakHandler(Looper.getMainLooper(), this);

    @Override // X.InterfaceC1050080dQs
    public final void handleMsg(Message message) {
        if (message.what == 1001) {
            JSONObject jSONObject = this.LIZIZ.LIZJ;
            if (TextUtils.equals(jSONObject.optString("type"), "onAnimation")) {
                String strOptString = jSONObject.optString("nodeId");
                C19JH c19jh = this.LIZJ;
                c19jh.getClass();
                C19JH c19jhLJFF = C19JH.LJI(c19jh).LJFF(strOptString);
                new C21518119Jb(c19jhLJFF.LLILZ, C21518019Ja.LIZ(c19jhLJFF, jSONObject.optJSONObject("animatorSet"))).LIZ();
            } else {
                InterfaceC1049730dQJ interfaceC1049730dQJ = this.LIZ;
                if (interfaceC1049730dQJ != null) {
                    interfaceC1049730dQJ.LIZIZ();
                }
            }
            this.LIZLLL.removeMessages(1001);
        }
    }

    public C19JL(C19JV c19jv, C19JH c19jh) {
        this.LIZIZ = c19jv;
        this.LIZJ = c19jh;
    }
}
