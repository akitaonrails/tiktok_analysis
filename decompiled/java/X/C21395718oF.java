package X;

import android.R;
import android.content.Context;
import android.view.View;
import com.bytedance.scene.Scene;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21395718oF extends AbstractC1542070qEP {
    public C1749280vcc LLILLJJLI;
    public Context LLILLL;
    public boolean LLILZ = true;
    public boolean LLILZIL;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILLL = null;
    }

    public final void LJJJJL() {
        if (this.LLILLJJLI == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            this.LLILLL = C1161970gLL.LIZIZ().LIZJ();
            C1749280vcc c1749280vcc = new C1749280vcc(C1161970gLL.LIZIZ().LIZJ(), null, 6);
            c1749280vcc.setLayoutVariant(0);
            this.LLILLJJLI = c1749280vcc;
            C1520080pew.LIZLLL("hybrid_log_report", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "status_view_not_initialized_by_spark")));
        }
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        LJJJJL();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, this.LLILZ ? 0 : 8);
        }
        this.LLILZIL = true;
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 != null) {
            c1749280vcc3.setBackgroundColor(C446980Hfs.LIZ(c1749280vcc3.getContext(), R.color.transparent));
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLL = context;
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.setLayoutVariant(0);
        this.LLILLJJLI = c1749280vcc;
    }

    public final void LJJIJL(boolean z) {
        C1749280vcc c1749280vcc;
        this.LLILZ = z;
        if (this.LLILZIL && z && (c1749280vcc = this.LLILLJJLI) != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        int i;
        LJJJJL();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS576S0100000_32(interfaceC1051240dSk, 642));
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 != null) {
            c1749280vcc2.setBackgroundColor(C960203pA.LIZ(com.zhiliaoapp.musically.R.attr.bx, c1749280vcc2.getContext()));
        }
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 != null) {
            if (this.LLILZ) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLZLZ(c1749280vcc3, i);
        }
        this.LLILZIL = true;
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1542070qEP
    public final View LJIJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LLILLL;
        if (context != null) {
            int i = 0;
            if (C1545540qK0.LIZIZ(context)) {
                C21405218pm c21405218pm = new C21405218pm(context);
                C786410Ut5.Vb(c21405218pm, -1.0f);
                c21405218pm.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
                c21405218pm.setFromAlpha(f);
                c21405218pm.setToAlpha(f2);
                c21405218pm.setDuration(l);
                c21405218pm.LIZ(file);
                if (!this.LLILZ) {
                    i = 8;
                }
                C786410Ut5.LLJILJILJ(c21405218pm, i);
                return c21405218pm;
            }
            C21405218pm c21405218pm2 = new C21405218pm(context);
            C786410Ut5.Vb(c21405218pm2, 1.0f);
            c21405218pm2.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
            c21405218pm2.setFromAlpha(f);
            c21405218pm2.setToAlpha(f2);
            c21405218pm2.setDuration(l);
            c21405218pm2.LIZ(file);
            if (!this.LLILZ) {
                i = 8;
            }
            C786410Ut5.LLJILJILJ(c21405218pm2, i);
            return c21405218pm2;
        }
        return null;
    }
}
