package X;

import android.content.Context;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14W5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14W5 implements InterfaceC1051760dTa {
    public final C14W6 LL;
    public final IESJsBridge LLILLJJLI;
    public String LLILLL;
    public final WeakReference<Context> LLILZ;

    public C14W5(WeakReference<Context> weakReference, IESJsBridge iESJsBridge) {
        this.LLILLJJLI = iESJsBridge;
        this.LLILZ = weakReference;
        C14W6 c14w6 = new C14W6(this, weakReference);
        this.LL = c14w6;
        c14w6.LLILZIL = false;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) throws JSONException {
        c1058910df7.LJIIJJI = false;
        this.LLILLL = c1058910df7.LIZIZ;
        this.LL.LIZLLL(c1058910df7.LIZLLL);
    }
}
