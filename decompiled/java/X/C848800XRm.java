package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ILoginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20647615qs("proactive_triggers_popup")
public final class C848800XRm extends C10GR {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final double LLIZ;
    public final Function1<Integer, Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;

    public C848800XRm() {
        throw null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 203;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        Bundle bundle = new Bundle(0);
        C786410Ut5.LJJJI("group_id", this.LLILZLL, bundle);
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = this.LL;
        c0xqs.LJIIIIZZ = true;
        c0xqs.LJII = this.LLIZ;
        c0xqs.LIZIZ = this.LLILLJJLI;
        c0xqs.LIZJ = this.LLILLL;
        c0xqs.LJIIIZ = this.LLILZ;
        c0xqs.LJIIJ = this.LLILZIL;
        c0xqs.LIZLLL = bundle;
        c0xqs.LJ = new C854720Xfy(this, 5);
        iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        Function0<Unit> function0 = this.LLJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C848800XRm(C19EG c19eg, String str, String str2, String str3, String str4, String str5, double d, Function1 function1, Function0 function0, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        d = (i & 64) != 0 ? 0.95d : d;
        function1 = (i & 128) != 0 ? null : function1;
        function0 = (i & 256) != 0 ? null : function0;
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = d;
        this.LLIZLLLIL = function1;
        this.LLJ = function0;
    }
}
