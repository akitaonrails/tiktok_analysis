package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0shc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637060shc {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final ViewGroup LIZ;
    public Effect LIZIZ;
    public View LIZJ;
    public C417370GYd LIZLLL;
    public LinearLayout LJ;
    public C0P0T LJFF;
    public C19670811xi LJI;
    public final C11NJ LJII = new C11NJ();
    public final C11PQ<String> LJIIIIZZ = new C11PQ<>();
    public boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public Function2<? super Effect, ? super Boolean, Unit> LJIIL;

    public final void LIZ() {
        C0P0T c0p0t = this.LJFF;
        if (c0p0t == null) {
            c0p0t = null;
        }
        if (c0p0t.isShowing()) {
            C19670811xi c19670811xi = this.LJI;
            if (c19670811xi == null) {
                c19670811xi = null;
            }
            C786410Ut5.G1(c19670811xi, 8);
            C0P0T c0p0t2 = this.LJFF;
            (c0p0t2 != null ? c0p0t2 : null).dismiss();
        }
    }

    public C1637060shc(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LJIIJ = (int) C11VU.LIZIZ(1.5f, context);
        this.LJIIJJI = (int) C11VU.LIZIZ(2.0f, context);
    }
}
