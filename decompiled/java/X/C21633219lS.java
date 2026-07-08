package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.19lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21633219lS {
    public static final List<String> LJIILIIL = Arrays.asList("1", "3", "5", "7", "8", "10", "12");
    public static final List<String> LJIILJJIL = Arrays.asList("4", "6", "9", "11");
    public final View LIZ;
    public final C21631219l8 LIZIZ;
    public final C21631219l8 LIZJ;
    public final C21631219l8 LIZLLL;
    public int LJ = 1900;
    public int LJFF = 2100;
    public int LJI = 1;
    public int LJII = 12;
    public int LJIIIIZZ = 1;
    public int LJIIIZ = 31;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;

    public C21633219lS(View view, boolean[] zArr, InterfaceC1305140k4G interfaceC1305140k4G) {
        int i;
        int i2;
        this.LIZ = view;
        C21631219l8 c21631219l8 = (C21631219l8) view.findViewById(R.id.year);
        this.LIZIZ = c21631219l8;
        C21631219l8 c21631219l82 = (C21631219l8) view.findViewById(R.id.ok9);
        this.LIZJ = c21631219l82;
        C21631219l8 c21631219l83 = (C21631219l8) view.findViewById(R.id.fg2);
        this.LIZLLL = c21631219l83;
        c21631219l8.setLocalizeAdapter(interfaceC1305140k4G);
        c21631219l82.setLocalizeAdapter(interfaceC1305140k4G);
        c21631219l83.setLocalizeAdapter(interfaceC1305140k4G);
        if (zArr.length == 3) {
            if (zArr[0]) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLJ(c21631219l8, i);
            if (zArr[1]) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLJ(c21631219l82, i2);
            C786410Ut5.LLLLJ(c21631219l83, zArr[2] ? 0 : 8);
            c21631219l8.setGravity(17);
            c21631219l82.setGravity(17);
            c21631219l83.setGravity(17);
            float f = 18;
            c21631219l83.setTextSize(f);
            c21631219l82.setTextSize(f);
            c21631219l8.setTextSize(f);
            c21631219l8.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lV
                @Override // X.InterfaceC21631819lE
                public final void LJLJJI(int i3) {
                    int i4;
                    int i5;
                    int currentItem = this.LIZ.LIZJ.getCurrentItem();
                    C21633219lS c21633219lS = this.LIZ;
                    int i6 = c21633219lS.LJ;
                    int i7 = i3 + i6;
                    c21633219lS.LJIIJ = i7;
                    int i8 = c21633219lS.LJFF;
                    if (i6 == i8) {
                        i4 = c21633219lS.LJI;
                        i5 = c21633219lS.LJII;
                    } else {
                        if (i7 == i6) {
                            i4 = c21633219lS.LJI;
                        } else if (i7 == i8) {
                            i5 = c21633219lS.LJII;
                            i4 = 1;
                        } else {
                            i4 = 1;
                        }
                        i5 = 12;
                    }
                    c21633219lS.LIZJ.setAdapter(new C21632419lK(i4, i5));
                    int iQ0 = this.LIZ.LIZJ.getAdapter().Q0() - 1;
                    if (currentItem > iQ0) {
                        this.LIZ.LIZJ.setCurrentIndex(iQ0);
                        currentItem = iQ0;
                    }
                    int i9 = i4 + currentItem;
                    C21633219lS c21633219lS2 = this.LIZ;
                    c21633219lS2.LJIIJJI = i9;
                    c21633219lS2.LIZJ(i7, i9, c21633219lS2.LJIIL, false);
                    this.LIZ.getClass();
                }
            });
            c21631219l82.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lW
                @Override // X.InterfaceC21631819lE
                public final void LJLJJI(int i3) {
                    int i4;
                    int i5;
                    C21633219lS c21633219lS = this.LIZ;
                    int i6 = c21633219lS.LJIIJ;
                    int i7 = 1;
                    if (i6 == c21633219lS.LJ) {
                        i4 = c21633219lS.LJI;
                    } else {
                        i4 = 1;
                    }
                    int i8 = i4 + i3;
                    c21633219lS.LJIIJJI = i8;
                    c21633219lS.LIZJ(i6, i8, c21633219lS.LJIIL, false);
                    C21633219lS c21633219lS2 = this.LIZ;
                    int i9 = c21633219lS2.LJ;
                    int i10 = c21633219lS2.LJFF;
                    if (i9 == i10 && c21633219lS2.LJI == c21633219lS2.LJII) {
                        i7 = c21633219lS2.LJIIIIZZ;
                        i5 = c21633219lS2.LJIIIZ;
                    } else {
                        if (i6 == i9 && i8 == c21633219lS2.LJI) {
                            i7 = c21633219lS2.LJIIIIZZ;
                        } else if (i6 == i10 && i8 == c21633219lS2.LJII) {
                            i5 = c21633219lS2.LJIIIZ;
                        }
                        i5 = 31;
                    }
                    int iLIZ = C21633219lS.LIZ(i6, i8, i5);
                    C21633219lS c21633219lS3 = this.LIZ;
                    c21633219lS3.LIZIZ(c21633219lS3.LIZLLL.getCurrentItem(), i7, iLIZ, false);
                    this.LIZ.getClass();
                }
            });
            c21631219l83.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19la
                @Override // X.InterfaceC21631819lE
                public final void LJLJJI(int i3) {
                    C21633219lS c21633219lS = this.LIZ;
                    if (c21633219lS.LJIIJ == c21633219lS.LJ && c21633219lS.LJIIJJI == c21633219lS.LJI) {
                        c21633219lS.LJIIL = i3 + c21633219lS.LJIIIIZZ;
                    } else {
                        c21633219lS.LJIIL = i3 + 1;
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }

    public static int LIZ(int i, int i2, int i3) {
        if (LJIILIIL.contains(String.valueOf(i2))) {
            return Math.min(i3, 31);
        }
        if (LJIILJJIL.contains(String.valueOf(i2))) {
            return Math.min(i3, 30);
        }
        if (i % 4 == 0 && i % 100 != 0) {
            return Math.min(i3, 29);
        }
        return Math.min(i3, 28);
    }

    public final void LIZIZ(int i, int i2, int i3, boolean z) {
        this.LIZLLL.setAdapter(new C21632419lK(i2, i3));
        if (z) {
            this.LIZLLL.setCurrentIndex(i);
        } else if (i > this.LIZLLL.getAdapter().Q0() - 1) {
            i = this.LIZLLL.getAdapter().Q0() - 1;
            this.LIZLLL.setCurrentIndex(i);
        }
        this.LJIIL = i + i2;
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int currentItem;
        int i6 = this.LJ;
        int i7 = this.LJFF;
        if (i6 == i7 && this.LJI == this.LJII) {
            i4 = this.LJIIIIZZ;
            i5 = this.LJIIIZ;
        } else {
            if (i == i6 && i2 == this.LJI) {
                i4 = this.LJIIIIZZ;
            } else {
                i4 = 1;
                if (i == i7 && i2 == this.LJII) {
                    i5 = this.LJIIIZ;
                }
            }
            i5 = 31;
        }
        int iLIZ = LIZ(i, i2, i5);
        if (z) {
            currentItem = i3 - i4;
        } else {
            currentItem = this.LIZLLL.getCurrentItem();
        }
        LIZIZ(currentItem, i4, iLIZ, z);
    }
}
