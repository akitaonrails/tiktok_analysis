package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651290Pgd {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(736));

    public static boolean LJIIIIZZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static LifecycleOwner LIZ() {
        return LJIIIIZZ() ? C651300Pge.LIZ() : C651410Pgp.LIZIZ();
    }

    public static LifecycleOwner LIZIZ() {
        return LJIIIIZZ() ? C651300Pge.LIZIZ() : C651410Pgp.LIZJ();
    }

    public static C19EG LIZJ() {
        if (!LJIIIIZZ()) {
            return C651410Pgp.LIZJ();
        }
        Fragment fragmentLIZIZ = C651300Pge.LIZIZ();
        if (fragmentLIZIZ != null) {
            return fragmentLIZIZ.getActivity();
        }
        return null;
    }

    public static LifecycleOwner LIZLLL() {
        return LJIIIIZZ() ? C1209904oL.LIZ() ? C651300Pge.LIZLLL() : C651420Pgq.LIZLLL() : C651410Pgp.LIZLLL();
    }

    public static C19EG LJ() {
        if (!LJIIIIZZ()) {
            return C651410Pgp.LIZLLL();
        }
        Fragment fragmentLIZLLL = C651420Pgq.LIZLLL();
        if (fragmentLIZLLL != null) {
            return fragmentLIZLLL.getActivity();
        }
        return null;
    }

    public static boolean LJFF(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        if (LJIIIIZZ()) {
            return C651420Pgq.LJ(interfaceC214902198i);
        }
        return C651410Pgp.LJ(c19eg);
    }

    public static boolean LJI(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        if (LJIIIIZZ()) {
            if (C651420Pgq.LIZIZ.size() > 1 || C651420Pgq.LJ(interfaceC214902198i)) {
                return false;
            }
        } else {
            int i = C651410Pgp.LIZ;
            if (C651420Pgq.LIZIZ.size() > 1 || C651410Pgp.LJ(c19eg)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJII(Context context, InterfaceC214902198i interfaceC214902198i) {
        if (LJIIIIZZ()) {
            CopyOnWriteArrayList<Fragment> copyOnWriteArrayList = C651300Pge.LIZ;
            if (interfaceC214902198i != null && Intrinsics.LJFF(C651300Pge.LIZLLL(), interfaceC214902198i)) {
                return true;
            }
            return false;
        }
        int i = C651410Pgp.LIZ;
        if (context != null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null || Intrinsics.LJFF(C651410Pgp.LIZLLL(), c19egLIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        if (LJIIIIZZ()) {
            if (interfaceC214902198i != null && Intrinsics.LJFF(C651420Pgq.LIZLLL(), interfaceC214902198i)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(C651410Pgp.LIZLLL(), c19eg);
    }
}
