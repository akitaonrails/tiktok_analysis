package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B6V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B6V extends C1B6U {
    public final /* synthetic */ InterfaceC2199431B6f LLILLJJLI;

    @Override // X.InterfaceC2199491B6l
    public final int[] b1() {
        InterfaceC2199431B6f interfaceC2199431B6f = this.LLILLJJLI;
        if (interfaceC2199431B6f instanceof AbstractC2199441B6g) {
            return ((AbstractC2199441B6g) interfaceC2199431B6f).LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC2199491B6l
    public final String getEventPage() {
        return this.LLILLJJLI.getEventPage();
    }

    public C1B6V(InterfaceC2199431B6f interfaceC2199431B6f) {
        this.LLILLJJLI = interfaceC2199431B6f;
    }

    @Override // X.InterfaceC2199491B6l
    public final void Q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.LLILLJJLI.monitorLogSend(new JSONObject(str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
