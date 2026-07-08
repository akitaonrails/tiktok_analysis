package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.12IK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12IK implements Function1<C12IL, Unit> {
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    public void LIZ(C12IL c12il) {
        Function0<Boolean> function0;
        c12il.LIZ = AFwS218S0000000_29.get$arr$(139);
        c12il.LIZIZ = AFwS218S0000000_29.get$arr$(140);
        c12il.LIZJ = AFwS218S0000000_29.get$arr$(141);
        c12il.LIZLLL = AFwS218S0000000_29.get$arr$(142);
        if (C04Q3.LIZ()) {
            function0 = AFwS218S0000000_29.get$arr$(143);
        } else {
            function0 = c12il.LIZLLL;
        }
        c12il.LJ = function0;
        c12il.LJFF = AFwS191S0000000_5.get$arr$(47);
        c12il.LJI = AFwS218S0000000_29.get$arr$(144);
        c12il.LJII = AFwS218S0000000_29.get$arr$(145);
        c12il.LJIIIIZZ = AFwS218S0000000_29.get$arr$(137);
        c12il.LJIIJJI = AFwS261S0000000_22.get$arr$(109);
        c12il.LJIILIIL = C1651150t4L.LIZ().LIZ();
        c12il.LJIIL = AFwS210S0000000_22.get$arr$(128);
        c12il.LJIILJJIL = true;
        c12il.LJIILL = this.LL;
        c12il.LJIJJLI = this.LLILLJJLI;
        c12il.LJIILLIIL = this.LLILLL;
        c12il.LJIJI = C0C64.LJIILLIIL().LJIIIZ(31744, "update_beauty_download_status_from_bg_thread", true, false);
        c12il.LJJ = this.LLILZ;
        C0CHO.LIZ.getClass();
        c12il.LJJI = C0CHO.LIZ();
        if (this.LLILZIL) {
            c12il.LJIIZILJ = true;
        }
        if (!c12il.LIZLLL.invoke().booleanValue() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_beauty_panel_default_on", true, true) && !c12il.LJIJ.LJIIIZ()) {
            c12il.LJ = AFwS218S0000000_29.get$arr$(138);
            c12il.LJIIZILJ = true;
        }
        c12il.LJJIFFI = AFwS191S0000000_5.get$arr$(46);
    }

    public C12IK(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
    }
}
