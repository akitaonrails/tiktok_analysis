package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764340w0u extends AbstractC1764180w0e {
    public C1765200w2I LLILZIL;
    public C1338760kwU LLILZLL;
    public String LLIZ;
    public Map<String, Object> LLIZLLLIL;
    public Map<String, Object> LLJ;
    public Map<String, Object> LLJI;

    @Override // X.AbstractC1764180w0e
    public final View LIZ(Context context) {
        C1338760kwU c1338760kwU = new C1338760kwU(context, null, 6);
        this.LLILZLL = c1338760kwU;
        return c1338760kwU;
    }

    public final void LIZIZ(InterfaceC1765250w2N interfaceC1765250w2N, C04G0 c04g0) {
        if (this.LLILZIL == null && !Intrinsics.LJFF(c04g0.LJIIIIZZ().LIZJ, this.LLIZ) && getVScope() != null) {
            this.LLIZ = c04g0.LJIIIIZZ().LIZJ;
            String str = c04g0.LJIIIIZZ().LIZJ;
            if (str == null) {
                return;
            }
            C1764540w1E c1764540w1E = InterfaceC1764530w1D.LIZ;
            EnumC1760270vuL enumC1760270vuL = EnumC1760270vuL.MYNA;
            C1765230w2L c1765230w2L = new C1765230w2L(getVScope(), str, C2097608Jq.LJ());
            c1764540w1E.getClass();
            this.LLILZIL = C1764540w1E.LIZ(enumC1760270vuL, c1765230w2L);
        }
        C1765200w2I c1765200w2I = this.LLILZIL;
        if (c1765200w2I != null) {
            String strLJFF = c04g0.LJFF();
            C1764610w1L c1764610w1L = new C1764610w1L(C12846050y.LIZ(c04g0.LJ()), this.LLIZLLLIL, this.LLJ, this.LLJI);
            C1757320vpa c1757320vpa = new C1757320vpa(null);
            c1757320vpa.LIZ = new WeakReference<>(c04g0);
            View viewLIZIZ = c1765200w2I.LIZIZ(new C1764670w1R(strLJFF, c1764610w1L, c1757320vpa), interfaceC1765250w2N);
            if (viewLIZIZ != null) {
                AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(this, viewLIZIZ, 62);
                if (viewLIZIZ.getParent() == null) {
                    awS427S0200000_26.invoke();
                }
            }
        }
    }

    public C1764340w0u(Context context, InterfaceC665370Q7z interfaceC665370Q7z, int i) {
        super(context, (AttributeSet) null, 0, (i & 8) != 0 ? null : interfaceC665370Q7z, 16);
    }
}
