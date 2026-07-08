package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638260sjY {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final boolean LJFF;
    public final Function1<? super View, Unit> LJI;
    public final Function2<? super Context, ? super Function0<Unit>, Unit> LJII;
    public final Function1<? super Boolean, Boolean> LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final Function1<? super C1638270sjZ, Unit> LJIIJJI;
    public final Drawable LJIIL;
    public final boolean LJIILIIL;

    public C1638260sjY(int i, Function1 function1, Function1 function12, Function1 function13, TuxIconDrawable tuxIconDrawable, boolean z) {
        int iLIZ = (int) C11VU.LIZ(23.0f);
        int iLIZ2 = (int) C11VU.LIZ(10.0f);
        this.LIZ = iLIZ;
        this.LIZIZ = iLIZ2;
        this.LIZJ = i;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = true;
        this.LJI = function1;
        this.LJII = null;
        this.LJIIIIZZ = function12;
        this.LJIIIZ = R.raw.icon_color_flip;
        this.LJIIJ = 0;
        this.LJIIJJI = function13;
        this.LJIIL = tuxIconDrawable;
        this.LJIILIIL = z;
    }
}
