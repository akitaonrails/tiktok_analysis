package X;

import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857680yRS implements InterfaceC685580Quq {
    public static final C1857680yRS LIZ = new C1857680yRS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1008));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1007));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(282));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));

    @Override // X.InterfaceC685580Quq
    public final Integer LIZLLL() {
        return (Integer) LIZIZ.getValue();
    }

    @Override // X.InterfaceC685580Quq
    public final int LJFF() {
        return ((Number) LIZLLL.getValue()).intValue();
    }

    @Override // X.InterfaceC685580Quq
    public final int LJ() {
        return C07CR.LIZ() ? R.raw.icon_bitmap_tako_small : R.raw.icon_bitmap_tako;
    }

    public static void LJIIJ(TuxIconView tuxIconView) {
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams != null) {
            int i = LJFF;
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(tuxIconView, layoutParams);
            C1857750yRZ.LJIILL(LJI, tuxIconView);
            C1857750yRZ.LJIIJ(LJII, tuxIconView);
            C1857750yRZ.LJIIJJI(LJIIIIZZ, tuxIconView);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // X.InterfaceC685580Quq
    public final int LIZIZ(boolean z) {
        if (((Number) AnonymousClass0746.LIZ.getValue()).intValue() == 0) {
            if (z) {
                return R.drawable.deu;
            }
            return R.drawable.dev;
        }
        if (z) {
            return R.drawable.dex;
        }
        return R.drawable.dew;
    }

    @Override // X.InterfaceC685580Quq
    public final int LJII(boolean z) {
        return LJIIIZ(z);
    }

    @Override // X.InterfaceC685580Quq
    public final C1668880tWw LJIIIIZZ(boolean z) {
        if (C07CR.LIZ()) {
            if (z) {
                return C1669660tYC.x;
            }
            return C1669660tYC.w;
        }
        return C1669660tYC.u;
    }

    public final int LJIIIZ(boolean z) {
        if (C0QSF.LIZ()) {
            return LJ();
        }
        if (C07IF.LIZ()) {
            if (z) {
                return R.raw.icon_bitmap_tako_new_dark;
            }
            return R.raw.icon_bitmap_tako_new_light;
        }
        if (z) {
            return R.raw.icon_color_tako_dark;
        }
        return R.raw.icon_color_tako_light;
    }

    @Override // X.InterfaceC685580Quq
    public final C419910GdJ LJI(Integer num, Integer num2) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = LIZ.LJ();
        if (num != null) {
            c419910GdJ.LIZIZ = num.intValue();
        }
        if (num2 != null) {
            c419910GdJ.LIZJ = num2.intValue();
        }
        return c419910GdJ;
    }

    @Override // X.InterfaceC685580Quq
    public final C419910GdJ LIZJ(Integer num, Integer num2, boolean z) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = LIZ.LJIIIZ(z);
        if (num != null) {
            c419910GdJ.LIZIZ = num.intValue();
        }
        if (num2 != null) {
            c419910GdJ.LIZJ = num2.intValue();
        }
        return c419910GdJ;
    }

    @Override // X.InterfaceC685580Quq
    public final C419910GdJ LIZ(Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = LIZ.LJIIIIZZ(z).LIZ;
        if (num != null) {
            num.intValue();
            c419910GdJ.LJ = num;
        }
        if (num2 != null) {
            num2.intValue();
            c419910GdJ.LIZLLL = num2;
        }
        if (num3 != null) {
            c419910GdJ.LIZIZ = num3.intValue();
        }
        if (num4 != null) {
            c419910GdJ.LIZJ = num4.intValue();
        }
        return c419910GdJ;
    }
}
