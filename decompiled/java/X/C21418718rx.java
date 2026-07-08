package X;

import android.text.style.MetricAffectingSpan;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21418718rx {
    public final Function0<TextView> LIZ;
    public final Function0<C21419118s1> LIZIZ;
    public final C21432118u7 LIZJ;
    public MetricAffectingSpan LIZLLL;
    public C21419118s1 LJ;
    public C21419418s4 LJFF;

    public final MetricAffectingSpan LIZ() {
        C1860130yVP c1860130yVP;
        C1860140yVQ markwonContent;
        InterfaceC1860180yVU interfaceC1860180yVU;
        C21419118s1 c21419118s1Invoke = this.LIZIZ.invoke();
        C21419418s4 c21419418s4LIZIZ = null;
        if (c21419118s1Invoke == null) {
            return null;
        }
        TextView textViewInvoke = this.LIZ.invoke();
        if ((textViewInvoke instanceof C1860130yVP) && (c1860130yVP = (C1860130yVP) textViewInvoke) != null && (markwonContent = c1860130yVP.getMarkwonContent()) != null && (interfaceC1860180yVU = markwonContent.LJ) != null) {
            c21419418s4LIZIZ = interfaceC1860180yVU.LIZIZ();
        }
        if (this.LIZLLL != null && Intrinsics.LJFF(this.LJ, c21419118s1Invoke) && Intrinsics.LJFF(this.LJFF, c21419418s4LIZIZ)) {
            return this.LIZLLL;
        }
        this.LJ = c21419118s1Invoke;
        this.LJFF = c21419418s4LIZIZ;
        int i = c21419118s1Invoke.LIZLLL;
        MetricAffectingSpan c444920HcY = (i <= 0 || c21419418s4LIZIZ == null) ? new C444920HcY(c21419118s1Invoke.LIZ, false) : new C445090Hcp(this.LIZJ.LIZ, i, c21419418s4LIZIZ.LJIJ, c21419418s4LIZIZ.LJIJJLI, c21419418s4LIZIZ.LJIL, c21419418s4LIZIZ.LJIJJ, c21419418s4LIZIZ.LJJ);
        this.LIZLLL = c444920HcY;
        return c444920HcY;
    }

    public C21418718rx(AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322, C21432118u7 c21432118u7) {
        this.LIZ = awS576S0100000_32;
        this.LIZIZ = awS576S0100000_322;
        this.LIZJ = c21432118u7;
    }
}
