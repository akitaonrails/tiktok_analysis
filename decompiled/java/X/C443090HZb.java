package X;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS263S0300000_19;

/* JADX INFO: renamed from: X.0HZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443090HZb {
    public final CharSequence LIZ;
    public final Function0<Boolean> LIZIZ;
    public final int LIZJ;
    public final Function1<LinearLayout, View> LIZLLL;
    public final int LJ;
    public final Function1<LinearLayout, View> LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final Function0<Boolean> LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C443090HZb(CharSequence charSequence, Function0<Boolean> function0, int i, Function1<? super LinearLayout, ? extends View> function1, int i2, Function1<? super LinearLayout, ? extends View> function12, int i3, boolean z, boolean z2, Function0<Boolean> function02) {
        this.LIZ = charSequence;
        this.LIZIZ = function0;
        this.LIZJ = i;
        this.LIZLLL = function1;
        this.LJ = i2;
        this.LJFF = function12;
        this.LJI = i3;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = function02;
    }

    public /* synthetic */ C443090HZb(CharSequence charSequence, Function0 function0, int i, Function1 function1, int i2, Function1 function12, int i3, boolean z, boolean z2, AwS263S0300000_19 awS263S0300000_19, int i4) {
        this(charSequence, (i4 & 2) != 0 ? null : function0, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? null : function12, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? true : z, (i4 & 256) != 0 ? true : z2, (i4 & 512) == 0 ? awS263S0300000_19 : null);
    }
}
