package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WY8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WY8 implements InterfaceC791210V1z, C0V22 {
    public final C0WY7 LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final InterfaceC1493105sv LLILLL;
    public final Function0<Boolean> LLILZ;
    public boolean LLILZIL;
    public JSONObject LLILZLL;
    public boolean LLIZ;
    public double LLIZLLLIL;

    public final void LIZ(String str) {
        if (this.LLILZIL && this.LLIZ && !this.LL.LJFF && !this.LLILZ.invoke().booleanValue()) {
            C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C0WY9(this, SystemClock.uptimeMillis() - this.LL.LIZLLL, str, null), 3);
        }
    }

    @Override // X.C0V22
    public final void LIZIZ(double d) {
        this.LLIZ = true;
        this.LLIZLLLIL = d;
        LIZ("fps_call_back");
    }

    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(JSONObject jSONObject) {
        this.LLILZIL = true;
        this.LLILZLL = jSONObject;
        LIZ("drop_frame");
    }

    public C0WY8(C0WY7 c0wy7, InterfaceC497601wk interfaceC497601wk) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(13);
        this.LL = c0wy7;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = interfaceC1493505szLIZIZ;
        this.LLILZ = aFwS195S0000000_9;
        this.LLIZLLLIL = -1.0d;
    }
}
