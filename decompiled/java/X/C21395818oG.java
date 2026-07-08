package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21395818oG extends AbstractC1542070qEP implements InterfaceC1538610q8p {
    public C1749280vcc LLILLJJLI;
    public Context LLILLL;
    public C648330Pbr LLILZ;
    public WeakReference<SparkContext> LLILZIL;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLILLL = null;
    }

    public final void LJJIJL() {
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
        C1749280vcc c1749280vcc;
        LJJIJL();
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        c1749280vcc2.LJ();
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        C1749280vcc c1749280vcc4 = this.LLILLJJLI;
        if (c1749280vcc4 == null) {
            c1749280vcc = null;
            c1749280vcc4 = null;
        } else {
            c1749280vcc = c1749280vcc4;
        }
        c1749280vcc.setBackgroundColor(C446980Hfs.LIZ(c1749280vcc4.getContext(), R.color.transparent));
        C1749280vcc c1749280vcc5 = this.LLILLJJLI;
        if (c1749280vcc5 != null) {
            return c1749280vcc5;
        }
        return null;
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJLIIIJILLIZJL() {
        return LJJL();
    }

    @Override // X.InterfaceC1538610q8p
    public final ViewGroup LJJLJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1542070qEP
    public final void LIZ(SparkContext sparkContext) {
        this.LLILZIL = new WeakReference<>(sparkContext);
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLL = context;
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.setLayoutVariant(1);
        this.LLILLJJLI = c1749280vcc;
    }

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163110gNB
    public final void LJJJJIZL(float f) {
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.setTopMargin(f);
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJJJLI(final C1537720q7O c1537720q7O) {
        return LJJJLIIL(new InterfaceC1051240dSk() { // from class: X.18oJ
            @Override // X.InterfaceC1051240dSk
            public final void refresh() {
                c1537720q7O.reload();
            }
        });
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        CharSequence charSequenceLJJLIIIJJIZ;
        String strLIZ;
        String strLJJIL;
        SparkContext sparkContext;
        SparkContext sparkContext2;
        C1542120qEU c1542120qEU;
        LJJIJL();
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS576S0100000_32(interfaceC1051240dSk, 577));
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            C1749280vcc c1749280vcc2 = this.LLILLJJLI;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            WeakReference<SparkContext> weakReference = this.LLILZIL;
            if (weakReference != null && (sparkContext2 = weakReference.get()) != null && (c1542120qEU = sparkContext2.hybridKitError) != null) {
                strLIZ = c1542120qEU.LIZ();
            } else {
                strLIZ = null;
            }
            WeakReference<SparkContext> weakReference2 = this.LLILZIL;
            if (weakReference2 == null || (sparkContext = weakReference2.get()) == null || (strLJJIL = sparkContext.LJJIL()) == null) {
                strLJJIL = "";
            }
            charSequenceLJJLIIIJJIZ = iSparkHostApi.LJJLIIIJJIZ(c1749280vcc2, strLIZ, strLJJIL);
        } else {
            charSequenceLJJLIIIJJIZ = null;
        }
        if (C041J.LIZ(charSequenceLJJLIIIJJIZ)) {
            c1722300uv6.LJII = null;
            if (charSequenceLJJLIIIJJIZ != null) {
                c1722300uv6.LJIIIIZZ = charSequenceLJJLIIIJJIZ;
            }
        }
        c1749280vcc.setStatus(c1722300uv6);
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        C1749280vcc c1749280vcc4 = this.LLILLJJLI;
        if (c1749280vcc4 == null) {
            c1749280vcc4 = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.bx, c1749280vcc4.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc5 = this.LLILLJJLI;
            if (c1749280vcc5 == null) {
                c1749280vcc5 = null;
            }
            c1749280vcc5.setBackgroundColor(iIntValue);
        }
        C1749280vcc c1749280vcc6 = this.LLILLJJLI;
        if (c1749280vcc6 == null) {
            return null;
        }
        return c1749280vcc6;
    }

    @Override // X.InterfaceC1538610q8p
    public final void LJJIIJ(Context context, C1537480q70 c1537480q70) {
        LJIIJ(context);
    }

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163110gNB
    public final View LJJLIL(Integer num, String str, String str2) {
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (num != null) {
            c419910GdJ.LIZ = num.intValue();
        }
        c419910GdJ.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1p);
        c1722300uv6.LIZ(c419910GdJ);
        int iLIZ = (int) C1041450dCx.LIZ(72.0f);
        int iLIZ2 = (int) C1041450dCx.LIZ(72.0f);
        c1722300uv6.LIZLLL = iLIZ;
        c1722300uv6.LJ = iLIZ2;
        if (str != null) {
            c1722300uv6.LJI = str;
        }
        if (str2 != null) {
            c1722300uv6.LJIIIIZZ = str2;
        }
        c1749280vcc.setStatus(c1722300uv6);
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 == null) {
            c1749280vcc2 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 == null) {
            return null;
        }
        return c1749280vcc3;
    }

    @Override // X.AbstractC1542070qEP
    public final View LJIJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LLILLL;
        if (context != null) {
            if (C1545540qK0.LIZIZ(context)) {
                C21405218pm c21405218pm = new C21405218pm(context);
                C786410Ut5.Vb(c21405218pm, -1.0f);
                c21405218pm.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
                c21405218pm.setFromAlpha(f);
                c21405218pm.setToAlpha(f2);
                c21405218pm.setDuration(l);
                c21405218pm.LIZ(file);
                C786410Ut5.LLJILJILJ(c21405218pm, 0);
                return c21405218pm;
            }
            C21405218pm c21405218pm2 = new C21405218pm(context);
            C786410Ut5.Vb(c21405218pm2, 1.0f);
            c21405218pm2.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
            c21405218pm2.setFromAlpha(f);
            c21405218pm2.setToAlpha(f2);
            c21405218pm2.setDuration(l);
            c21405218pm2.LIZ(file);
            C786410Ut5.LLJILJILJ(c21405218pm2, 0);
            return c21405218pm2;
        }
        return null;
    }
}
